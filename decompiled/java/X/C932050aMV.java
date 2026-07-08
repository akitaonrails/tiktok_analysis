package X;

import Y.ACListenerS118S0200000_15;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2DisableCameraWhenCohostInviteInProgress;
import com.bytedance.android.livesdk.model.MultiGuestExpandEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932050aMV extends ConstraintLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public DataChannel LL;
    public InterfaceC931760aM2 LLILLJJLI;
    public MultiGuestDataHolder LLILLL;
    public final C01GW LLILZ;
    public final C1099610eil LLILZIL;
    public final C16F5 LLILZLL;
    public final LiveIconView LLIZ;
    public final LiveIconView LLIZLLLIL;
    public final LiveIconView LLJ;
    public final LiveIconView LLJI;
    public final LiveIconView LLJIJIL;
    public LinkPlayerInfo LLJILJIL;
    public final C304201Fw LLJILJILJ;
    public final C304201Fw LLJILLL;
    public final C932100aMa LLJJ;
    public final String LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C932050aMV.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C932050aMV.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final MultiGuestDataHolder getDataHolder() {
        return (MultiGuestDataHolder) this.LLILZ.getValue();
    }

    public final InterfaceC302401Fe getAnchorUserManager() {
        C304201Fw c304201Fw = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (InterfaceC302401Fe) c304201Fw.LIZ();
    }

    public final InterfaceC927510aFB getZoomService() {
        C304201Fw c304201Fw = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    public final void l0() {
        if (!this.LLJJ.LIZ("camera")) {
            C12ES.LJIILL(4, this.LLJ);
            return;
        }
        if (getAnchorReverseCameraBtnEnable()) {
            LiveIconView liveIconView = this.LLJ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_flip;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ezs);
            liveIconView.setIcon(c419910GdJ.LIZ(getContext()));
            return;
        }
        LiveIconView liveIconView2 = this.LLJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_flip;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ezy);
        liveIconView2.setIcon(c419910GdJ2.LIZ(getContext()));
    }

    public final void n0() {
        if (!this.LLJJ.LIZ("video")) {
            C12ES.LJIILL(4, this.LLIZLLLIL);
            return;
        }
        int cameraShouldShowStatus = getCameraShouldShowStatus();
        if (cameraShouldShowStatus == 0) {
            LiveIconView liveIconView = this.LLIZLLLIL;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = C20736316Cj.LJ(R.attr.emd, getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.ezy);
            liveIconView.setIcon(c419910GdJ.LIZ(getContext()));
            return;
        }
        if (cameraShouldShowStatus == 1) {
            this.LLIZLLLIL.setIcon(C20736316Cj.LJ(R.attr.emd, getContext()));
        } else if (cameraShouldShowStatus == 2) {
            this.LLIZLLLIL.setIcon(C20736316Cj.LJ(R.attr.emu, getContext()));
        }
    }

    private final boolean getAnchorReverseCameraBtnEnable() {
        if (C927560aFG.LIZJ()) {
            return false;
        }
        return getDataHolder().LJIIJ;
    }

    private final int getCameraShouldShowStatus() {
        C949060anw c949060anwYo1;
        C947420alI c947420alILJII;
        EnumC947440alK enumC947440alK;
        if (C927560aFG.LIZJ()) {
            getDataHolder().LJIILIIL = 0;
            return 0;
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && CohostWithGuestPhase2DisableCameraWhenCohostInviteInProgress.INSTANCE.isEnabled() && C915980Zwa.LJII().LLI() == EnumC950120ape.Invited) {
            C20441214yg.LIZIZ("MultiPanelAnchorBottomCell", "getCameraShouldShowStatus, cohost_invite_in_progress=true");
            return 0;
        }
        ILiveDanceService iLiveDanceService = (ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class);
        if (iLiveDanceService != null && (c949060anwYo1 = iLiveDanceService.Yo1()) != null && (c947420alILJII = c949060anwYo1.LJII()) != null && (enumC947440alK = c947420alILJII.LIZJ) != null && enumC947440alK != EnumC947440alK.NONE) {
            C20441214yg.LIZIZ("MultiPanelAnchorBottomCell", "getCameraShouldShowStatus, lets dance running=true");
            getDataHolder().LJIILIIL = 0;
            return 0;
        }
        if (getDataHolder().LJJIFFI == 0 || getDataHolder().LJIILIIL == 0) {
            return 0;
        }
        return getVideoEnable() ? 1 : 2;
    }

    public final int getEnlargeType() {
        InterfaceC927510aFB zoomService = getZoomService();
        if (C500260Jjc.LJJIJIIJIL(zoomService != null ? Boolean.valueOf(zoomService.LJIIIIZZ()) : null)) {
            return 0;
        }
        InterfaceC927510aFB zoomService2 = getZoomService();
        return C500260Jjc.LJJJI(zoomService2 != null ? Boolean.valueOf(zoomService2.LJFF()) : null) ? 2 : 1;
    }

    public final boolean getVideoEnable() {
        return getDataHolder().LJIIJ;
    }

    public final void h0() {
        if (C932490aND.LIZIZ()) {
            C500260Jjc.LJIILIIL(this.LLJI);
            return;
        }
        C19ME c19me = (C19ME) this.LLJ.getLayoutParams();
        c19me.endToStart = -1;
        c19me.endToEnd = R.id.md5;
        c19me.setMarginEnd((int) C497740JfY.LIZIZ(0.0f));
        C786410Ut5.w6(this.LLJ, c19me);
        C500260Jjc.LJIILIIL(this.LLJI);
    }

    public final void j0() {
        InterfaceC932040aMU interfaceC932040aMU;
        if (C917810ZzX.LJIIIIZZ()) {
            C439101nJ.LJI(this.LLIZ);
            return;
        }
        if (!this.LLJJ.LIZ("audio")) {
            C439101nJ.LJI(this.LLIZ);
            return;
        }
        C12ES.LJIILL(0, this.LLIZ);
        C932100aMa c932100aMa = this.LLJJ;
        DataChannel dataChannel = this.LL;
        LinkPlayerInfo linkPlayerInfo = this.LLJILJIL;
        String str = linkPlayerInfo != null ? linkPlayerInfo.mInteractIdStr : null;
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 450);
        Map<String, InterfaceC932040aMU> map = c932100aMa.LIZIZ;
        if (map == null || (interfaceC932040aMU = map.get("audio")) == null) {
            return;
        }
        interfaceC932040aMU.LIZ(dataChannel, str, awS594S0100000_15);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void p0() {
        if (C917810ZzX.LJIIIIZZ()) {
            h0();
            return;
        }
        if (!this.LLJJ.LIZ("zoom")) {
            h0();
            return;
        }
        if (!C924230a9t.LIZ(1)) {
            C930480aJy.LIZ.getClass();
            if ((C930480aJy.LJIIL() || C931780aM4.LIZJ()) && getZoomService() != null) {
                InterfaceC927510aFB zoomService = getZoomService();
                if (zoomService == null) {
                    return;
                }
                if (C932490aND.LIZIZ()) {
                    h0();
                    return;
                }
                String strLJIILL = zoomService.LJIILL();
                if (strLJIILL == null) {
                    strLJIILL = "";
                }
                EnumC920250a3T enumC920250a3TLJIL = zoomService.LJIL(strLJIILL);
                C1143300frE.LJIIJJI().LJII(this.LLJJI, C2097608Jq.LJIIJ(new Pair("action", "updateZoomBtn"), new Pair("step", "calculateZoomStatus"), new Pair("zoomStatus", enumC920250a3TLJIL)));
                C930480aJy.LJJJ(this.LLJI, enumC920250a3TLJIL, getContext(), C20736316Cj.LIZIZ(R.attr.ex3, getContext()), C20736316Cj.LIZIZ(R.attr.ewz, getContext()), true);
                if (!this.LLJJIII) {
                    this.LLJJIII = true;
                    if (enumC920250a3TLJIL == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
                        C915850ZwN.LJIIJJI(24, UserService.getInstance().user().getCurrentUserId(), "show", null, false);
                    } else if (enumC920250a3TLJIL == EnumC920250a3T.CAN_ZOOM_TO_MAX) {
                        C919870a2r.LIZLLL(getEnlargeType(), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "", "show", "anchor", null);
                    }
                }
                this.LLJI.setEnabled(enumC920250a3TLJIL != EnumC920250a3T.ZOOM_DISABLED);
                C500260Jjc.LJLIIIL(500L, this.LLJI, new AwS224S0300000_15(enumC920250a3TLJIL, this, zoomService, 31));
                LiveIconView liveIconView = this.LLJI;
                InterfaceC927510aFB zoomService2 = getZoomService();
                C971370bNv.LIZIZ(liveIconView, 2131840809, 2131840795, C500260Jjc.LJJJI(zoomService2 != null ? Boolean.valueOf(zoomService2.LJFF()) : null));
                return;
            }
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str = this.LLJJI;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("action", "updateZoomBtn");
        pairArr[1] = new Pair("step", "goneZoomBtnUI");
        C930480aJy.LIZ.getClass();
        pairArr[2] = new Pair("linkMic1vnZoomGuestEnable", Boolean.valueOf(C930480aJy.LJIIL()));
        pairArr[3] = new Pair("zoomServiceIsNull", Boolean.valueOf(getZoomService() == null));
        c1143300frELJIIJJI.LJII(str, C2097608Jq.LJIIJ(pairArr));
        h0();
    }

    public final LinkPlayerInfo getAnchorInfo$liveinteract_impl_release() {
        return this.LLJILJIL;
    }

    public final void e0(LinkPlayerInfo linkPlayerInfo) {
        this.LLJILJIL = linkPlayerInfo;
        User user = linkPlayerInfo.mUser;
        if (user != null) {
            C1099610eil c1099610eil = this.LLILZIL;
            C1121670fIL.LJIILIIL(c1099610eil, user.getAvatarThumb(), c1099610eil.getWidth(), c1099610eil.getHeight(), R.drawable.el_);
            C971370bNv.LIZ(2131840799, c1099610eil);
            C500260Jjc.LJLIIIL(500L, c1099610eil, new AwS594S0100000_15(linkPlayerInfo, 449));
            this.LLILZLL.setText(C0KVU.LIZ(user));
        }
        if (getDataHolder().LJJIFFI >= 1 && getDataHolder().LJIIJ) {
            getDataHolder().LJIILIIL = 1;
        } else if (getDataHolder().LJJIFFI >= 1 && !getDataHolder().LJIIJ) {
            getDataHolder().LJIILIIL = 2;
        }
        n0();
        l0();
        j0();
        p0();
        C932090aMZ c932090aMZ = new C932090aMZ(this.LL, new AwS559S0100000_15(this, 62));
        C932090aMZ.LIZ(c932090aMZ, this.LLIZLLLIL, getDataHolder(), this.LLJJ.LIZ("video"), new AwS559S0100000_15(this, 60), new AwS559S0100000_15(this, 61), null, 16);
        c932090aMZ.LIZIZ(this.LLJ, null, this.LLJJ.LIZ("camera"));
        C500260Jjc.LJLIIIL(500L, this.LLIZ, new AwS594S0100000_15(this, 42));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 43));
            dataChannel.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 44));
            dataChannel.CQ2(MultiGuestAnchorSelfVideoChangedEvent.class, this, new AwS594S0100000_15(this, 45));
            dataChannel.CQ2(MultiCoHostStateChannel.class, this, new AwS594S0100000_15(this, 46));
        }
        if (C932490aND.LIZIZ() && !C931780aM4.LJFF(null)) {
            LiveIconView liveIconView = this.LLJIJIL;
            if (liveIconView != null) {
                C12ES.LJIILL(0, liveIconView);
            }
            LiveIconView liveIconView2 = this.LLJIJIL;
            if (liveIconView2 != null) {
                C786410Ut5.g8(liveIconView2, new ACListenerS118S0200000_15(this, linkPlayerInfo, 2));
            }
        } else {
            LiveIconView liveIconView3 = this.LLJIJIL;
            if (liveIconView3 != null) {
                C439101nJ.LJI(liveIconView3);
            }
        }
        if (C917810ZzX.LJIIIIZZ()) {
            C439101nJ.LJI(this.LLIZLLLIL);
        }
    }

    public final void i0(EnumC950120ape enumC950120ape) {
        int i;
        int cameraShouldShowStatus;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && CohostWithGuestPhase2DisableCameraWhenCohostInviteInProgress.INSTANCE.isEnabled() && (i = getDataHolder().LJIILIIL) != (cameraShouldShowStatus = getCameraShouldShowStatus())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCohostStateChanged, cohostState=");
            sbLIZ.append(enumC950120ape);
            sbLIZ.append(", currentStatus=");
            sbLIZ.append(i);
            sbLIZ.append(", newStatus=");
            sbLIZ.append(cameraShouldShowStatus);
            C20441214yg.LIZIZ("MultiPanelAnchorBottomCell", C2188811AlT.LIZIZ(sbLIZ));
            n0();
        }
    }

    public final void setAnchorInfo$liveinteract_impl_release(LinkPlayerInfo linkPlayerInfo) {
        this.LLJILJIL = linkPlayerInfo;
    }

    public C932050aMV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C932050aMV(Context context, AttributeSet attributeSet, int i) {
        C932100aMa c932100aMa;
        super(context, attributeSet, i);
        this.LLILZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 375));
        this.LLJILJILJ = new C304201Fw("ZOOM_SERVICE");
        this.LLJILLL = new C304201Fw("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (C932440aN8.LJ()) {
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("audio", new InterfaceC932040aMU() { // from class: X.0aMT
                @Override // X.InterfaceC932040aMU
                public final void LIZ(DataChannel dataChannel, String str, AwS594S0100000_15 awS594S0100000_15) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    int i2;
                    InterfaceC922070a6P interfaceC922070a6P;
                    InterfaceC922070a6P interfaceC922070a6P2;
                    InterfaceC922070a6P interfaceC922070a6P3;
                    if (str == null) {
                        str = "";
                    }
                    Boolean boolValueOf3 = null;
                    if (dataChannel != null && (interfaceC922070a6P3 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
                        boolValueOf = Boolean.valueOf(interfaceC922070a6P3.LJIJJLI(str));
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                    if (dataChannel != null && (interfaceC922070a6P2 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
                        boolValueOf2 = Boolean.valueOf(interfaceC922070a6P2.LJJIIJZLJL(str));
                    } else {
                        boolValueOf2 = null;
                    }
                    boolean zLJJJI2 = C500260Jjc.LJJJI(boolValueOf2);
                    if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
                        boolValueOf3 = Boolean.valueOf(interfaceC922070a6P.LJIJI(str));
                    }
                    if (C500260Jjc.LJJJI(boolValueOf3)) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (zLJJJI2 || zLJJJI) {
                        i2 = 0;
                    }
                    awS594S0100000_15.invoke(Integer.valueOf(i2));
                }
            }));
            if (C931780aM4.LIZJ()) {
                c932100aMa = new C932100aMa(C1697810uHb.LJIIJJI("audio", "zoom"), mapLIZJ);
            } else {
                c932100aMa = new C932100aMa(Collections.singletonList("audio"), mapLIZJ);
            }
        } else {
            c932100aMa = new C932100aMa(C1697810uHb.LJIIJJI("video", "camera", "zoom"), null);
        }
        this.LLJJ = c932100aMa;
        this.LLJJI = "Zoom/UserInfoViewHolder";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.het, this, true);
        this.LLILZIL = (C1099610eil) findViewById(R.id.lmt);
        this.LLILZLL = (C16F5) findViewById(R.id.tv_user_name_bc);
        this.LLIZ = (LiveIconView) findViewById(R.id.lkf);
        this.LLIZLLLIL = (LiveIconView) findViewById(R.id.lkl);
        this.LLJ = (LiveIconView) findViewById(R.id.lkj);
        this.LLJI = (LiveIconView) findViewById(R.id.cl8);
        this.LLJIJIL = (LiveIconView) findViewById(R.id.cl6);
    }

    public final void s0(final String str, final LinkPlayerInfo linkPlayerInfo, final EnumC920250a3T enumC920250a3T) {
        final boolean zLJFF;
        if (C922570a7D.LIZ(this.LL) && !C922570a7D.LIZIZ(this.LL)) {
            C20441214yg.LIZIZ("MultiPanelAnchorBottomCell", "[zoom] isInViewerLimit");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        C1143300frE.LJIIJJI().LJII(this.LLJJI, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "entrance"), new Pair("linkMicId", str)));
        InterfaceC927510aFB zoomService = getZoomService();
        if (zoomService != null) {
            zLJFF = zoomService.LJFF();
        } else {
            zLJFF = false;
        }
        InterfaceC927510aFB zoomService2 = getZoomService();
        if (zoomService2 != null) {
            zoomService2.LJI(str, new InterfaceC920110a3F() { // from class: X.0aMX
                @Override // X.InterfaceC920110a3F
                public final void LIZJ(String str2) {
                    DataChannel dataChannel;
                    C932050aMV c932050aMV = this.LIZ;
                    c932050aMV.getClass();
                    C1143300frE.LJIIJJI().LJII(c932050aMV.LLJJI, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "onZoomSuccess")));
                    if (enumC920250a3T == EnumC920250a3T.CAN_ZOOM_TO_MAX && (dataChannel = this.LIZ.LL) != null) {
                        dataChannel.FQ2(MultiGuestExpandEvent.class);
                    }
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                    DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(this.LIZ.getContext(), true, (PosIdentity) ListProtector.get(list, 0), (PosIdentity) ListProtector.get(list, 1), new AwS129S1100000_15(str, function1, 5));
                    dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987030bnB(dialogC933230aOPLIZ, this.LIZ, str, 2));
                    C786410Ut5.N4(dialogC933230aOPLIZ);
                    C915850ZwN.LJIIJ(str, false);
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZ(int i, String str2, String str3, Throwable th) {
                    String str4;
                    String message;
                    if (zLJFF) {
                        str4 = "zoom_min";
                    } else {
                        str4 = "zoom_max";
                    }
                    C01N8.LIZ(i, "zoom", str4, 0L, "anchor", "http_fail", str3);
                    C932050aMV c932050aMV = this.LIZ;
                    c932050aMV.getClass();
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    String str5 = c932050aMV.LLJJI;
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("action", "zoom");
                    pairArr[1] = new Pair("step", "onZoomFail");
                    pairArr[2] = new Pair("errorCode", Integer.valueOf(i));
                    pairArr[3] = new Pair("errorMessage", str3);
                    User user = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[4] = new Pair("throwable", message);
                    c1143300frELJIIJJI.LJII(str5, C2097608Jq.LJIIJ(pairArr));
                    Integer numValueOf = Integer.valueOf(i);
                    Context context = this.LIZ.getContext();
                    DataChannel dataChannel = this.LIZ.LL;
                    LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                    if (linkPlayerInfo2 != null) {
                        user = linkPlayerInfo2.mUser;
                    }
                    C917140ZyS.LJII(numValueOf, str3, th, context, dataChannel, user);
                }
            }, true, false, true, true, EnumC919910a2v.FROM_HOST_ZOOM_SELF, null);
        }
        InterfaceC931760aM2 interfaceC931760aM2 = this.LLILLJJLI;
        if (interfaceC931760aM2 != null) {
            interfaceC931760aM2.LJIIJ();
        }
    }
}
