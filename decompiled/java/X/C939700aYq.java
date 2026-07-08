package X;

import Y.AfS48S1100000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorMaskTouchEventChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestAudienceStartPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAudienceStopPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStartPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStopPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.StatusBarVisibilityEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForMaskEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.HostTagDisPlayInfoReadyEvent;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestHostTagUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveScaleFactorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicEnableShowUserNameOnMicviewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0aYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939700aYq extends FrameLayout implements InterfaceC938470aWr, C1AXB, C0UKQ, InterfaceC938310aWb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public InterfaceC937840aVq LL;
    public AbstractC938280aWY LLILLJJLI;
    public DataChannel LLILLL;
    public boolean LLILZ;
    public final InterfaceC940580aaG LLILZIL;
    public C1324720kZq LLILZLL;
    public C941390abZ LLIZ;
    public C16F5 LLIZLLLIL;
    public View LLJ;
    public C20743416Fc LLJI;
    public ConstraintLayout LLJIJIL;
    public C1324720kZq LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C19R6 LLJILLL;
    public LiveIconView LLJJ;
    public C19R8 LLJJI;
    public C19R7 LLJJIII;
    public C1324720kZq LLJJIJI;
    public ConstraintLayout LLJJIJIIJIL;
    public C20743416Fc LLJJIJIL;
    public boolean LLJJJ;
    public View LLJJJIL;
    public C2182701Abc LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C304201Fw LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public C939820aZ2 LLJL;
    public TextureView LLJLIL;
    public InterfaceC937840aVq LLJLILLLLZIIL;
    public View LLJLL;
    public C11JF LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public ViewStub LLJZIJLIL;
    public C1126540fQC LLL;
    public ConstraintLayout LLLF;
    public C16F5 LLLFF;
    public C16F5 LLLFFI;
    public View LLLFZ;
    public C1106010et5 LLLI;
    public C1088120eQE LLLII;
    public final C11NJ LLLIIII;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C939700aYq.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC938040aWA
    public final void LIZLLL(long j) {
    }

    @Override // X.C0UKQ
    public final boolean LJFF(float f, float f2, long j) {
        return false;
    }

    @Override // X.InterfaceC938040aWA
    public final void LJIJJLI(int i) {
    }

    public final void LJJJ() {
        int i;
        int i2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams c19me;
        C19ME c19me2;
        ViewGroup.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams2;
        if (C917890Zzf.LIZ(false)) {
            i = this.LL.LJJIIJ().getLayoutParams().width;
            i2 = this.LL.LJJIIJ().getLayoutParams().height;
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            List<InterfaceC937840aVq> allLayoutWindows = (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ.getAllLayoutWindows();
            InterfaceC937840aVq interfaceC937840aVq = this.LL;
            int width = interfaceC937840aVq.LJJIIJ().getWidth() * this.LL.LJJIIJ().getHeight();
            if (allLayoutWindows != null) {
                for (InterfaceC937840aVq interfaceC937840aVq2 : allLayoutWindows) {
                    int width2 = interfaceC937840aVq2.LJJIIJ().getWidth() * interfaceC937840aVq2.LJJIIJ().getHeight();
                    if (width2 <= 0) {
                        width2 = Integer.MAX_VALUE;
                    }
                    if (width2 < width) {
                        interfaceC937840aVq = interfaceC937840aVq2;
                        width = width2;
                    }
                }
            }
            i = interfaceC937840aVq.LJJIIJ().getLayoutParams().width;
            i2 = interfaceC937840aVq.LJJIIJ().getLayoutParams().height;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        c930480aJy.getClass();
        C930480aJy.LJJIJLIJ(c930480aJy, Long.valueOf(C930480aJy.LJIIIZ()), this.LLILLL, i, i2, getOnlinePlayerAvatarFromXml(), false, null, 224);
        C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
        ViewGroup.LayoutParams layoutParams3 = onlinePlayerAvatarFromXml != null ? onlinePlayerAvatarFromXml.getLayoutParams() : null;
        if (!(layoutParams3 instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
            return;
        }
        C1324720kZq onlineVoiceEffectFromXml = getOnlineVoiceEffectFromXml();
        ViewGroup.LayoutParams layoutParams4 = onlineVoiceEffectFromXml != null ? onlineVoiceEffectFromXml.getLayoutParams() : null;
        if (!(layoutParams4 instanceof C19ME) || (c19me = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
            c19me = new C19ME(0, 0);
        }
        int i3 = (int) (marginLayoutParams.width * 1.6f);
        c19me.width = i3;
        c19me.height = i3;
        c19me.bottomMargin = marginLayoutParams.bottomMargin;
        C1324720kZq onlineVoiceEffectFromXml2 = getOnlineVoiceEffectFromXml();
        if (onlineVoiceEffectFromXml2 != null) {
            C786410Ut5.u6(onlineVoiceEffectFromXml2, c19me);
        }
        if (MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable()) {
            C1324720kZq onlinePlayerAvatarFromXml2 = getOnlinePlayerAvatarFromXml();
            float fLIZ = (((onlinePlayerAvatarFromXml2 == null || (layoutParams2 = onlinePlayerAvatarFromXml2.getLayoutParams()) == null) ? C439101nJ.LIZ(60) : layoutParams2.width) * MultiGuestVoiceWaveScaleFactorSetting.INSTANCE.getValue()) / C497740JfY.LIZIZ.density;
            C941390abZ voiceWaveView = getVoiceWaveView();
            if (voiceWaveView != null && (layoutParams = voiceWaveView.getLayoutParams()) != null && (layoutParams.height != (iLIZIZ = (int) C497740JfY.LIZIZ(fLIZ)) || layoutParams.width != iLIZIZ)) {
                layoutParams.height = iLIZIZ;
                layoutParams.width = iLIZIZ;
                C786410Ut5.W5(voiceWaveView, layoutParams);
            }
        }
        C16F5 tvCountDownFromXml = getTvCountDownFromXml();
        ViewGroup.LayoutParams layoutParams5 = tvCountDownFromXml != null ? tvCountDownFromXml.getLayoutParams() : null;
        if (!(layoutParams5 instanceof C19ME) || (c19me2 = (C19ME) layoutParams5) == null) {
            return;
        }
        c19me2.leftToLeft = R.id.pn1;
        c19me2.rightToRight = R.id.pn1;
        c19me2.topToTop = R.id.pn1;
        c19me2.bottomToBottom = R.id.pn1;
        ((ViewGroup.MarginLayoutParams) c19me2).width = marginLayoutParams.width;
        ((ViewGroup.MarginLayoutParams) c19me2).height = marginLayoutParams.height;
        C16F5 tvCountDownFromXml2 = getTvCountDownFromXml();
        if (tvCountDownFromXml2 != null) {
            C786410Ut5.y6(tvCountDownFromXml2, c19me2);
        }
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC938310aWb
    public void setVisibility(boolean z) {
    }

    @Override // X.InterfaceC938310aWb
    public final /* synthetic */ void updateTicket(long j, String str) {
    }

    @Override // X.InterfaceC938310aWb
    public final /* synthetic */ void updateTicket(String str, long j, String str2) {
    }

    @Override // X.InterfaceC938310aWb
    public final /* synthetic */ void updateTicketByComponent(long j, int i) {
    }

    @Override // X.InterfaceC938310aWb
    public final /* synthetic */ void updateTicketStyleByComponent(C941850acJ c941850acJ) {
    }

    public static final boolean LJJIJ() {
        HostDisplayResponse.DisplayInfo displayInfo;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        return (dataChannelGlobal.gg0(C930900aKe.class) == null || (displayInfo = (HostDisplayResponse.DisplayInfo) dataChannelGlobal.gg0(C930900aKe.class)) == null || displayInfo.hostType <= 1) ? false : true;
    }

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LLJJL.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final int getTagBg() {
        return LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt() ? R.drawable.e0j : R.drawable.dut;
    }

    private final C941290abP getTalkVolumeWaveHandler() {
        return (C941290abP) this.LLJJJJJIL.getValue();
    }

    private final InterfaceC927510aFB getZoomService() {
        C304201Fw c304201Fw = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    @Override // X.InterfaceC938040aWA
    public final String LJIIIIZZ() {
        InterfaceC937840aVq interfaceC937840aVq = this.LL;
        if (interfaceC937840aVq != null) {
            return interfaceC937840aVq.LJ();
        }
        return null;
    }

    public final boolean LJJ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k81()) {
            return false;
        }
        if (getMDataHolder().LJJJJI != EnumC918970a1P.GRID_FIX && ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null || allLayoutWindows.size() <= 1)) {
            InterfaceC927510aFB zoomService = getZoomService();
            if (!C500260Jjc.LJJJI(zoomService != null ? Boolean.valueOf(zoomService.LJIIIIZZ()) : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJJII() {
        String strLJ = this.LL.LJ();
        if (strLJ == null || strLJ.length() == 0) {
            return true;
        }
        return !(getMDataHolder().LJIILLIIL(strLJ) != null ? r0.booleanValue() : false);
    }

    public final void LJJIJLIJ() {
        FrameLayout frameLayoutLJJIIJ;
        C1AZW.LJFF(LJJIIJ(495), "stopAd", null, null);
        C939820aZ2 c939820aZ2 = this.LLJL;
        if (c939820aZ2 != null) {
            c939820aZ2.LIZ();
        }
        this.LLJL = null;
        if (this.LLJLIL != null) {
            InterfaceC937840aVq interfaceC937840aVq = this.LLJLILLLLZIIL;
            if (interfaceC937840aVq != null && (frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ()) != null) {
                C786410Ut5.LJJJZ(this.LLJLIL, frameLayoutLJJIIJ);
            }
            this.LLJLIL = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r0.size() <= 1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI() {
        /*
            r2 = this;
            X.0Zzw r1 = X.C918060Zzw.LIZ
            boolean r0 = X.C930540aK4.LIZJ()
            r1.getClass()
            boolean r0 = X.C918060Zzw.LIZ(r0)
            if (r0 == 0) goto L1f
            boolean r0 = LJJIFFI()
            if (r0 == 0) goto Lb6
            android.widget.FrameLayout r0 = r2.getOnlineHostTagLayoutFromXml()
            if (r0 == 0) goto L1e
            X.C500260Jjc.LJIILIIL(r0)
        L1e:
            return
        L1f:
            X.0aFB r1 = r2.getZoomService()
            r0 = 0
            if (r1 == 0) goto L2e
            boolean r0 = r1.LJJ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2e:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L40
            X.0aFB r0 = r2.getZoomService()
            if (r0 == 0) goto L44
            java.lang.Integer r0 = r0.LJIILJJIL()
            if (r0 == 0) goto L44
        L40:
            r2.LJJIJIIJI()
            return
        L44:
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1P r1 = X.C927600aFK.LJII()
            X.0a1P r0 = X.EnumC918970a1P.GRID_FIX
            if (r1 == r0) goto La6
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1P r1 = X.C927600aFK.LJII()
            X.0a1P r0 = X.EnumC918970a1P.FLOATING_FIX
            if (r1 == r0) goto La6
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1P r1 = X.C927600aFK.LJII()
            X.0a1P r0 = X.EnumC918970a1P.GRID
            if (r1 != r0) goto Lac
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto Laa
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto Laa
            int r0 = r0.size()
        L87:
            r1 = 1
            if (r0 > r1) goto La6
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0aVw r0 = X.C921180a4y.LJIIIIZZ(r0)
            if (r0 == 0) goto Lac
            X.0aVo r0 = r0.LJJJJZ()
            if (r0 == 0) goto Lac
            java.util.List r0 = r0.getAllLayoutWindows()
            if (r0 == 0) goto Lac
            int r0 = r0.size()
            if (r0 <= r1) goto Lac
        La6:
            r2.LJJIJIIJI()
            return
        Laa:
            r0 = 0
            goto L87
        Lac:
            android.widget.FrameLayout r0 = r2.getOnlineHostTagLayoutFromXml()
            if (r0 == 0) goto L1e
            X.C500260Jjc.LJIILIIL(r0)
            return
        Lb6:
            r2.LJJIJIIJI()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939700aYq.LJJJI():void");
    }

    public final void LJJJIL() {
        InterfaceC927510aFB zoomService;
        float fLIZIZ;
        ViewGroup.LayoutParams layoutParams = this.LL.LJJIIJ().getLayoutParams();
        int i = 0;
        int i2 = layoutParams != null ? layoutParams.height : 0;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        InterfaceC927510aFB zoomService2 = getZoomService();
        if (!C500260Jjc.LJJJI(zoomService2 != null ? Boolean.valueOf(zoomService2.LJJ()) : null) && ((zoomService = getZoomService()) == null || zoomService.LJIILJJIL() == null)) {
            if (C2104308Mf.LIZJ()) {
                fLIZIZ = C497740JfY.LIZIZ(240.0f);
            } else if (enumC918970a1PLJII == EnumC918970a1P.FLOATING || enumC918970a1PLJII == EnumC918970a1P.FLOATING_FIX) {
                fLIZIZ = C497740JfY.LIZIZ(220.0f);
            }
            i = (int) fLIZIZ;
        }
        int i3 = i2 - i;
        ConstraintLayout anchorPauseContainer = getAnchorPauseContainer();
        if (anchorPauseContainer != null) {
            C500260Jjc.LJJLJ(i, anchorPauseContainer);
        }
        C941020aay.LIZ(i3, getAnchorPauseImageView(), getAnchorPauseMainText(), getAnchorPauseSecondText());
    }

    public final View getAnchorVoiceVolumeBorderFromXml() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.b3_);
        this.LLJ = viewFindViewById;
        return viewFindViewById;
    }

    public final C19R6 getHostTagBgIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.js2);
            this.LLJILLL = (C19R6) callbackFindViewById;
        }
        return (C19R6) callbackFindViewById;
    }

    public final C19R7 getHostTagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.js3);
            this.LLJJIII = (C19R7) callbackFindViewById;
        }
        return (C19R7) callbackFindViewById;
    }

    public final LiveIconView getHostTagIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.js4);
            this.LLJJ = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C19R8 getHostTagLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.js5);
            this.LLJJI = (C19R8) callbackFindViewById;
        }
        return (C19R8) callbackFindViewById;
    }

    public final C20743416Fc getHostTagTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.js6);
            this.LLJI = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return this.LL.LJ();
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LL.LJIILL());
    }

    public final MultiGuestDataHolder getMDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final ConstraintLayout getNetworkNicknameContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p55);
            this.LLJJIJIIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C20743416Fc getNickNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p94);
            this.LLJJIJIL = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final FrameLayout getOnlineHostTagLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pmy);
            this.LLJILJILJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn1);
            this.LLJILJIL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerMuteVideoBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn4);
            this.LLJJIJI = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1324720kZq getOnlineVoiceEffectFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pnc);
            this.LLILZLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final ConstraintLayout getRootViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LLJIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getRoundCornerBgView() {
        View view = this.LLJJJIL;
        if (view == null) {
            view = new View(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJJJIL = view;
        return view;
    }

    public final C16F5 getTvCountDownFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfm);
            this.LLIZLLLIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LL.LJIIIIZZ());
    }

    public final C941390abZ getVoiceWaveView() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.voice_wave_with_dress);
            this.LLIZ = (C941390abZ) callbackFindViewById;
        }
        return (C941390abZ) callbackFindViewById;
    }

    public static final boolean LJJIFFI() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        if (C931790aM5.LIZIZ()) {
            return C940770aaZ.LIZ().getDataSource().LJJIIZ();
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        C307001Gy.LIZ().getClass();
        EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
            if (!interfaceC937840aVq.LIZJ()) {
                arrayList.add(interfaceC937840aVq);
            }
        }
        int size = arrayList.size();
        if (enumC918970a1PLJII == EnumC918970a1P.NORMAL) {
            return true;
        }
        if (enumC918970a1PLJII == EnumC918970a1P.FLOATING && enumC918990a1RLJFF == EnumC918990a1R.FLOAT) {
            return true;
        }
        if (enumC918970a1PLJII == EnumC918970a1P.GRID && size <= 0) {
            return true;
        }
        if (enumC918970a1PLJII != EnumC918970a1P.GRID_FIX || size > 0) {
            return enumC918970a1PLJII == EnumC918970a1P.FLOATING_FIX && size <= 0;
        }
        return true;
    }

    public final boolean LJIL() {
        if (getMDataHolder().LJJJJI == EnumC918970a1P.FLOATING_FIX) {
            return true;
        }
        InterfaceC927510aFB zoomService = getZoomService();
        if (C500260Jjc.LJJJI(zoomService != null ? Boolean.valueOf(zoomService.LJJ()) : null)) {
            return true;
        }
        InterfaceC927510aFB zoomService2 = getZoomService();
        return (zoomService2 == null || zoomService2.LJIILJJIL() == null) ? false : true;
    }

    public final boolean LJJIII() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return true;
        }
        Iterator<InterfaceC937840aVq> it2 = allLayoutWindows.iterator();
        while (it2.hasNext()) {
            InterfaceC937840aVq next = it2.next();
            InterfaceC937840aVq interfaceC937840aVq = next;
            if (interfaceC937840aVq.LJJIIJ().getLayoutParams().width > this.LL.LJJIIJ().getLayoutParams().width || interfaceC937840aVq.LJJIIJ().getLayoutParams().height > this.LL.LJJIIJ().getLayoutParams().height) {
                return next == null;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Type inference failed for: r0v21, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939700aYq.LJJIIZ():void");
    }

    public final void LJJIIZI() {
        C19ME c19me;
        ConstraintLayout networkNicknameContainerFromXml = getNetworkNicknameContainerFromXml();
        ViewGroup.LayoutParams layoutParams = networkNicknameContainerFromXml != null ? networkNicknameContainerFromXml.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        c19me.startToStart = 0;
        c19me.topToTop = -1;
        c19me.endToEnd = 0;
        c19me.bottomToTop = -1;
        c19me.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(4.0f);
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
        c19me.bottomToTop = -1;
        c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
        c19me.horizontalChainStyle = 1;
        c19me.horizontalBias = 0.0f;
        c19me.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
        ConstraintLayout networkNicknameContainerFromXml2 = getNetworkNicknameContainerFromXml();
        if (networkNicknameContainerFromXml2 != null) {
            C786410Ut5.m6(networkNicknameContainerFromXml2, c19me);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939700aYq.LJJIJIIJI():void");
    }

    public final void LJJIZ() {
        LJJIL(Boolean.valueOf(LJJII()));
        AbstractC938280aWY abstractC938280aWY = this.LLILLJJLI;
        if (abstractC938280aWY != null) {
            abstractC938280aWY.LJIILLIIL();
        }
        LJJJI();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJFF() == EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST) {
            this.LLILZIL.LIZJ(this.LL.getCornerRadius());
            this.LLILZIL.LIZIZ(getRoundCornerBgView(), this);
        } else {
            View view = this.LLJJJIL;
            if (view != null) {
                C439101nJ.LJI(view);
            }
        }
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LIZLLL(getLinkMicId());
        }
        return null;
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public Long getUid() {
        return C930540aK4.LJIIZILJ();
    }

    @Override // X.InterfaceC938040aWA
    public Long getUserId() {
        return C930540aK4.LJIIZILJ();
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        MultiGuestDataHolder mDataHolder = getMDataHolder();
        if (mDataHolder != null) {
            return mDataHolder.LJIILLIIL(getLinkMicId());
        }
        return null;
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC927740aFY interfaceC927740aFYLIZIZ;
        C080500Rv c080500RvLIZ;
        C11PQ<SoundWareEffectExtra> c11pq;
        super.onAttachedToWindow();
        AbstractC938280aWY abstractC938280aWY = this.LLILLJJLI;
        if (abstractC938280aWY != null) {
            abstractC938280aWY.LIZ(this);
        }
        AbstractC938280aWY abstractC938280aWY2 = this.LLILLJJLI;
        if (abstractC938280aWY2 != null) {
            abstractC938280aWY2.LJIILLIIL();
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if ((interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LIZIZ() : 0) - 1 != 0 || (enumC918970a1PLJII != EnumC918970a1P.FLOATING && enumC918970a1PLJII != EnumC918970a1P.GRID && enumC918970a1PLJII != EnumC918970a1P.NORMAL)) {
            LJJJIL();
            if (getMDataHolder().LJIIJJI(LJIIIIZZ()) == 2 || getMDataHolder().LJIIJ(LJIIIIZZ()) == 2) {
                LJIJ("onAttachedToWindow", true);
            }
        }
        LJJIL(Boolean.valueOf(LJJII()));
        LJJJ();
        LJJIZ();
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.CQ2(AnchorOpenCameraEvent.class, this, new AwS591S0100000_12(this, 1208));
            dataChannel.CQ2(MultiLiveUserMediaEvent.class, this, new AwS594S0100000_15(this, 1144));
            dataChannel.CQ2(BaseSingleTapEvent.class, this, new AwS594S0100000_15(this, 1145));
            dataChannel.CQ2(PlayerPauseLiveForMaskEvent.class, this, new AwS594S0100000_15(this, 1146));
            dataChannel.CQ2(MultiGuestStartPlayAdEvent.class, this, new AwS594S0100000_15(this, 1147));
            dataChannel.CQ2(MultiGuestStopPlayAdEvent.class, this, new AwS594S0100000_15(this, 1148));
            dataChannel.CQ2(MultiGuestAudienceStartPlayAdEvent.class, this, new AwS594S0100000_15(this, 1149));
            dataChannel.CQ2(MultiGuestAudienceStopPlayAdEvent.class, this, new AwS594S0100000_15(this, 1150));
            dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 1151));
            dataChannel.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 1142));
        }
        String linkMicId = getLinkMicId();
        if (linkMicId != null && (interfaceC927740aFYLIZIZ = C00S0.LIZIZ()) != null && (c080500RvLIZ = interfaceC927740aFYLIZIZ.LIZ(linkMicId)) != null && (c11pq = c080500RvLIZ.LIZ) != null) {
            this.LLLIIII.LIZ(C937310aUz.LJI(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS48S1100000_15(this, linkMicId, 10))), "MultiGuestV3AnchorMask", "anchor addVoiceWaveEffectChangedListener").LJIILL().LJIIZILJ());
        }
        C20743416Fc hostTagTvFromXml = getHostTagTvFromXml();
        if (hostTagTvFromXml != null) {
            hostTagTvFromXml.setTextSize(11.0f);
        }
        if (C497740JfY.LJJ()) {
            C20743416Fc hostTagTvFromXml2 = getHostTagTvFromXml();
            if (hostTagTvFromXml2 != null) {
                hostTagTvFromXml2.setLayoutDirection(1);
            }
            C20743416Fc hostTagTvFromXml3 = getHostTagTvFromXml();
            if (hostTagTvFromXml3 != null) {
                hostTagTvFromXml3.setTextDirection(4);
            }
            ConstraintLayout rootViewFromXml = getRootViewFromXml();
            if (rootViewFromXml != null) {
                rootViewFromXml.setLayoutDirection(1);
            }
            ConstraintLayout rootViewFromXml2 = getRootViewFromXml();
            if (rootViewFromXml2 != null) {
                rootViewFromXml2.setTextDirection(4);
            }
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            dataChannel2.zW(MultiGuestAnchorMaskTouchEventChannel.class, this);
        }
        C2182701Abc c2182701Abc = new C2182701Abc(getContext(), this.LL, this.LLILLL);
        this.LLJJJJ = c2182701Abc;
        c2182701Abc.LIZ(this);
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel3.DQ2(HostTagDisPlayInfoReadyEvent.class, this, new AwS594S0100000_15(this, 1143));
        }
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            LJJJI();
        }
        if (C936720aU2.LIZIZ()) {
            C936720aU2.LIZLLL(getAnchorVoiceVolumeBorderFromXml(), C20736316Cj.LIZIZ(R.attr.fxy, getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), this.LL.getCornerRadius());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getTalkVolumeWaveHandler().LJI();
        C20441214yg.LJIIIZ("MultiGuestV3AnchorMask", "stopAdByDetach");
        C939820aZ2 c939820aZ2 = this.LLJL;
        if (c939820aZ2 != null) {
            c939820aZ2.LIZ();
        }
        this.LLJL = null;
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestAdStopEvent.class);
        }
        AbstractC938280aWY abstractC938280aWY = this.LLILLJJLI;
        if (abstractC938280aWY != null) {
            abstractC938280aWY.LIZIZ();
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel3.zW(MultiGuestAnchorMaskTouchEventChannel.class, null);
        }
        this.LLILZIL.LJ(getRoundCornerBgView(), this);
        C2182701Abc c2182701Abc = this.LLJJJJ;
        if (c2182701Abc != null) {
            c2182701Abc.LIZJ();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLJLLL = false;
        this.LLJZ = false;
        this.LLLIIII.LJ();
        super.onDetachedFromWindow();
    }

    private final C1126540fQC getAnchorPauseImageView() {
        return this.LLL;
    }

    private final C16F5 getAnchorPauseMainText() {
        return this.LLLFF;
    }

    private final C16F5 getAnchorPauseSecondText() {
        return this.LLLFFI;
    }

    public final ConstraintLayout getAnchorPauseContainer() {
        return this.LLLF;
    }

    public final DataChannel getMDataChannel() {
        return this.LLILLL;
    }

    public final AbstractC938280aWY getPresenter() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC938040aWA
    public View getSoundWaveBorderV2() {
        return this.LLJLL;
    }

    public final InterfaceC937840aVq getWindow() {
        return this.LL;
    }

    public static final String LJJIIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestV3AnchorMask_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0UKQ
    public final boolean LIZIZ(MotionEvent motionEvent) {
        if (LJJ() || LJIL()) {
            C930480aJy.LIZ.getClass();
            if (C930480aJy.LJJIII(motionEvent, this)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILLIIL(InterfaceC937840aVq interfaceC937840aVq) {
        C930540aK4.LJJIJL(this);
        this.LLJLILLLLZIIL = interfaceC937840aVq;
        interfaceC937840aVq.LJJIIJ().addView(this);
    }

    public final void LJJI(boolean z) {
        DataChannel dataChannel;
        if (C930540aK4.LIZJ() && (dataChannel = this.LLILLL) != null) {
            dataChannel.LC0(StatusBarVisibilityEvent.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939700aYq.LJJIIJZLJL(java.lang.String):void");
    }

    public final void LJJIJIIJIL(boolean z) {
        View view;
        if (C939550aYb.LIZJ() && (view = this.LLJLL) != null) {
            if (z) {
                if (view != null) {
                    C12ES.LJIILL(0, view);
                    return;
                }
                return;
            } else {
                if (view == null) {
                    return;
                }
                C439101nJ.LJI(view);
                return;
            }
        }
        if (z) {
            View anchorVoiceVolumeBorderFromXml = getAnchorVoiceVolumeBorderFromXml();
            if (anchorVoiceVolumeBorderFromXml == null) {
                return;
            }
            C12ES.LJIILL(0, anchorVoiceVolumeBorderFromXml);
            return;
        }
        View anchorVoiceVolumeBorderFromXml2 = getAnchorVoiceVolumeBorderFromXml();
        if (anchorVoiceVolumeBorderFromXml2 == null) {
            return;
        }
        C439101nJ.LJI(anchorVoiceVolumeBorderFromXml2);
    }

    public final void LJJIL(Boolean bool) {
        if (this.LLJJJ) {
            return;
        }
        LJJJJ("switchAnchorVideo", C500260Jjc.LJJIJIIJIL(bool));
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
            if (onlinePlayerAvatarFromXml != null) {
                C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml, 8);
            }
            C1324720kZq onlinePlayerMuteVideoBgFromXml = getOnlinePlayerMuteVideoBgFromXml();
            if (onlinePlayerMuteVideoBgFromXml != null) {
                C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml, 8);
            }
            C16F5 tvCountDownFromXml = getTvCountDownFromXml();
            if (tvCountDownFromXml != null) {
                C786410Ut5.LLJJJJ(tvCountDownFromXml, 8);
            }
            LJJI(false);
            return;
        }
        LJJJ();
        LJJIIZ();
        LJJI(true);
    }

    @Override // X.InterfaceC938040aWA
    public final void bc(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[VideoState] call mask switchAnchorVideo ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        LJJIL(Boolean.valueOf(!z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        DataChannel dataChannel;
        boolean zLIZLLL = C916800Zxu.LIZLLL();
        if (zLIZLLL && motionEvent != null && motionEvent.getAction() == 1 && C930540aK4.LIZJ() && (dataChannel = this.LLILLL) != null) {
            dataChannel.FQ2(ShowUserListDialog.class);
        }
        return zLIZLLL;
    }

    public final void setAnchorVoiceVolumeBorderFromXml(View view) {
        this.LLJ = view;
    }

    public final void setHostTagBgIvFromXml(C19R6 c19r6) {
        this.LLJILLL = c19r6;
    }

    public final void setHostTagContainerFromXml(C19R7 c19r7) {
        this.LLJJIII = c19r7;
    }

    public final void setHostTagIconFromXml(LiveIconView liveIconView) {
        this.LLJJ = liveIconView;
    }

    public final void setHostTagLayoutFromXml(C19R8 c19r8) {
        this.LLJJI = c19r8;
    }

    public final void setHostTagTvFromXml(C20743416Fc c20743416Fc) {
        this.LLJI = c20743416Fc;
    }

    public final void setMDataChannel(DataChannel dataChannel) {
        this.LLILLL = dataChannel;
    }

    public final void setMDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        this.mDataHolder = multiGuestDataHolder;
    }

    public final void setNetworkNicknameContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJJIJIIJIL = constraintLayout;
    }

    public final void setNickNameFromXml(C20743416Fc c20743416Fc) {
        this.LLJJIJIL = c20743416Fc;
    }

    public final void setOnlineHostTagLayoutFromXml(FrameLayout frameLayout) {
        this.LLJILJILJ = frameLayout;
    }

    public final void setOnlinePlayerAvatarFromXml(C1324720kZq c1324720kZq) {
        this.LLJILJIL = c1324720kZq;
    }

    public final void setOnlinePlayerMuteVideoBgFromXml(C1324720kZq c1324720kZq) {
        this.LLJJIJI = c1324720kZq;
    }

    public final void setOnlineVoiceEffectFromXml(C1324720kZq c1324720kZq) {
        this.LLILZLL = c1324720kZq;
    }

    public final void setPresenter(AbstractC938280aWY abstractC938280aWY) {
        this.LLILLJJLI = abstractC938280aWY;
    }

    public final void setRootViewFromXml(ConstraintLayout constraintLayout) {
        this.LLJIJIL = constraintLayout;
    }

    @Override // X.InterfaceC938040aWA
    public void setSoundWaveBorderV2(View view) {
        this.LLJLL = view;
    }

    public final void setTvCountDownFromXml(C16F5 c16f5) {
        this.LLIZLLLIL = c16f5;
    }

    public final void setVoiceWaveView(C941390abZ c941390abZ) {
        this.LLIZ = c941390abZ;
    }

    public final void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        this.LL = interfaceC937840aVq;
    }

    @Override // X.InterfaceC938310aWb
    public final void updateUserInfo(User user) {
        int i;
        InterfaceC927510aFB zoomService;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        MultiGuestDataHolder mDataHolder;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        LJJJI();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        if (LinkMicEnableShowUserNameOnMicviewSetting.INSTANCE.isEnable()) {
            int i2 = 0;
            if (user != null && enumC918970a1PLJII != EnumC918970a1P.NORMAL) {
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean zLIZJ = C930540aK4.LIZJ();
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(zLIZJ) && LJJIFFI()) {
                    C439101nJ.LJI(getNetworkNicknameContainerFromXml());
                    return;
                }
                if (enumC918970a1PLJII == EnumC918970a1P.GRID_FIX || (enumC918970a1PLJII == EnumC918970a1P.GRID && (((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null && allLayoutWindows.size() >= 2) || ((mDataHolder = getMDataHolder()) != null && mDataHolder.LJJIFFI > 0)))) {
                    C12ES.LJIILL(0, getNetworkNicknameContainerFromXml());
                    getNickNameFromXml().setText(C0KVU.LIZ(user));
                    LJJIIZI();
                    ViewGroup.LayoutParams layoutParams = this.LL.LJJIIJ().getLayoutParams();
                    if (layoutParams != null) {
                        i2 = layoutParams.width;
                    }
                    if (i2 >= ((int) C497740JfY.LIZIZ(64.0f))) {
                        C20743416Fc nickNameFromXml = getNickNameFromXml();
                        if (nickNameFromXml == null) {
                            return;
                        }
                        nickNameFromXml.setTextSize(11.0f);
                        return;
                    }
                    C20743416Fc nickNameFromXml2 = getNickNameFromXml();
                    if (nickNameFromXml2 == null) {
                        return;
                    }
                    nickNameFromXml2.setTextSize(9.0f);
                    return;
                }
                if (enumC918970a1PLJII != EnumC918970a1P.FLOATING && enumC918970a1PLJII != EnumC918970a1P.FLOATING_FIX) {
                    C439101nJ.LJI(getNetworkNicknameContainerFromXml());
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = this.LL.LJJIIJ().getLayoutParams();
                if (layoutParams2 != null) {
                    i = layoutParams2.width;
                } else {
                    i = 0;
                }
                if (i >= ((int) C497740JfY.LIZIZ(64.0f))) {
                    C20743416Fc nickNameFromXml3 = getNickNameFromXml();
                    if (nickNameFromXml3 != null) {
                        nickNameFromXml3.setTextSize(10.0f);
                    }
                } else {
                    C20743416Fc nickNameFromXml4 = getNickNameFromXml();
                    if (nickNameFromXml4 != null) {
                        nickNameFromXml4.setTextSize(8.0f);
                    }
                }
                if (C918060Zzw.LIZ(C930540aK4.LIZJ())) {
                    if (!LJJIII()) {
                        C12ES.LJIILL(0, getNetworkNicknameContainerFromXml());
                        getNickNameFromXml().setText(C0KVU.LIZ(user));
                        LJJIIZI();
                        return;
                    }
                    C439101nJ.LJI(getNetworkNicknameContainerFromXml());
                    return;
                }
                InterfaceC927510aFB zoomService2 = getZoomService();
                Boolean boolValueOf = null;
                if (zoomService2 != null) {
                    boolValueOf = Boolean.valueOf(zoomService2.LJJ());
                }
                if (C500260Jjc.LJJJI(boolValueOf) || ((zoomService = getZoomService()) != null && zoomService.LJIILJJIL() != null)) {
                    C12ES.LJIILL(0, getNetworkNicknameContainerFromXml());
                    getNickNameFromXml().setText(C0KVU.LIZ(user));
                    LJJIIZI();
                    return;
                }
                C439101nJ.LJI(getNetworkNicknameContainerFromXml());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:70:0x013a, B:72:0x013e, B:74:0x0144, B:75:0x014d, B:81:0x0158, B:82:0x0161, B:86:0x0168, B:87:0x0171, B:89:0x0175, B:90:0x017e), top: B:121:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    @Override // X.InterfaceC938040aWA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939700aYq.LJIJ(java.lang.String, boolean):void");
    }

    public final void LJJIJL(long j, long j2) {
        View viewLJLLLL;
        C1106010et5 c1106010et5;
        C1088120eQE c1088120eQE;
        C19ME c19me;
        int i;
        C19ME c19me2;
        boolean z;
        if ((j != 0 || j2 != 0) && C01HT.LIZJ()) {
            Unit unit = null;
            if (this.LLLFZ == null) {
                try {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.n6h);
                    if (viewStub != null) {
                        viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    } else {
                        viewLJLLLL = null;
                    }
                    this.LLLFZ = viewLJLLLL;
                    if (viewLJLLLL == null) {
                        c1106010et5 = null;
                    } else {
                        c1106010et5 = (C1106010et5) viewLJLLLL.findViewById(R.id.n6e);
                    }
                    this.LLLI = c1106010et5;
                    View view = this.LLLFZ;
                    if (view != null) {
                        c1088120eQE = (C1088120eQE) view.findViewById(R.id.n6i);
                    } else {
                        c1088120eQE = null;
                    }
                    this.LLLII = c1088120eQE;
                    if (c1088120eQE != null) {
                        c1088120eQE.setTextSize(14.0f);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            boolean zLJI = C01HA.LJI();
            if (zLJI) {
                View view2 = this.LLLFZ;
                if (view2 != null) {
                    C12ES.LJIILL(0, view2);
                }
                C1106010et5 c1106010et52 = this.LLLI;
                if (c1106010et52 != null) {
                    C12ES.LJIILL(0, c1106010et52);
                }
                C1088120eQE c1088120eQE2 = this.LLLII;
                if (c1088120eQE2 != null) {
                    C12ES.LJIILL(0, c1088120eQE2);
                }
                C1106010et5 c1106010et53 = this.LLLI;
                if (c1106010et53 != null) {
                    c1106010et53.setTotalTime(j);
                }
                C1106010et5 c1106010et54 = this.LLLI;
                if (c1106010et54 != null) {
                    c1106010et54.setRemainTime(j2);
                }
                C1088120eQE c1088120eQE3 = this.LLLII;
                if (c1088120eQE3 != null) {
                    if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isCountdownLabelAnimated() && j2 < 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1088120eQE3.LIZ(j2, z);
                }
            }
            View view3 = this.LLLFZ;
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
            if (enumC918990a1RLJFF == null || (((i = C916500ZxQ.LIZ[enumC918990a1RLJFF.ordinal()]) != 1 && i != 2) || !zLJI)) {
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                        c19me.topToTop = -1;
                        c19me.bottomToBottom = -1;
                        c19me.startToEnd = -1;
                        c19me.endToStart = -1;
                        c19me.endToEnd = -1;
                        c19me.startToStart = 0;
                        c19me.topToBottom = R.id.pmy;
                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(6.0f);
                        C786410Ut5.W5(view3, c19me);
                        return;
                    }
                    return;
                }
                return;
            }
            if (view3 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
                return;
            }
            c19me2.topToTop = 0;
            c19me2.topToBottom = -1;
            c19me2.bottomToBottom = -1;
            c19me2.bottomToTop = -1;
            c19me2.startToEnd = -1;
            c19me2.startToStart = 0;
            c19me2.endToStart = -1;
            c19me2.endToEnd = -1;
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C916800Zxu.LIZJ();
            C786410Ut5.W5(view3, c19me2);
            return;
        }
        View view4 = this.LLLFZ;
        if (view4 != null) {
            C439101nJ.LJI(view4);
        }
        C1106010et5 c1106010et55 = this.LLLI;
        if (c1106010et55 != null) {
            C439101nJ.LJI(c1106010et55);
        }
        C1088120eQE c1088120eQE4 = this.LLLII;
        if (c1088120eQE4 != null) {
            C439101nJ.LJI(c1088120eQE4);
        }
    }

    public final void LJJJJ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVoiceWaveVisiblity, source, ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestV3AnchorMask", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            C941390abZ voiceWaveView = getVoiceWaveView();
            if (voiceWaveView != null) {
                C500260Jjc.LJIILLIIL(voiceWaveView);
                return;
            }
            return;
        }
        C941390abZ voiceWaveView2 = getVoiceWaveView();
        if (voiceWaveView2 == null) {
            return;
        }
        C500260Jjc.LLFFF(voiceWaveView2);
    }

    public final void LJJIJIL(String str, int i, int i2, float f, String str2) {
        Boolean bool;
        FrameLayout frameLayoutLJJIIJ;
        String strLJJIIJ = LJJIIJ(461);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAd adId:");
        sbLIZ.append(str);
        sbLIZ.append(", duration:");
        sbLIZ.append(i);
        sbLIZ.append(", playTimes:");
        sbLIZ.append(i2);
        sbLIZ.append(", seekProgress:");
        sbLIZ.append(f);
        sbLIZ.append(", url:");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TextureView textureView = null;
        C1AZW.LJFF(strLJJIIJ, strLIZIZ, null, null);
        boolean zBooleanValue = false;
        if (str2.length() != 0 && i > 0 && i2 > 0) {
            if (this.LLJLIL == null) {
                Context context = getContext();
                if (context != null) {
                    textureView = new TextureView(context);
                }
                this.LLJLIL = textureView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                TextureView textureView2 = this.LLJLIL;
                if (textureView2 != null) {
                    C786410Ut5.V5(textureView2, layoutParams);
                }
                C20441214yg.LIZIZ("MultiGuestV3AnchorMask", "startAd create and add adRenderView");
            }
            TextureView textureView3 = this.LLJLIL;
            if (textureView3 != null) {
                InterfaceC937840aVq interfaceC937840aVq = this.LLJLILLLLZIIL;
                if (interfaceC937840aVq != null && (frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ()) != null) {
                    frameLayoutLJJIIJ.addView(this.LLJLIL);
                }
                if (this.LLJL == null) {
                    this.LLJL = new C939820aZ2();
                }
                C939820aZ2 c939820aZ2 = this.LLJL;
                if (c939820aZ2 != null) {
                    DataChannel dataChannel = this.LLILLL;
                    if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    c939820aZ2.LIZIZ(textureView3, str, zBooleanValue, str2, i, i2, f, new InterfaceC940660aaO() { // from class: X.0aZJ
                        @Override // X.InterfaceC940660aaO
                        public final void LJLLILLLL() {
                            C20441214yg.LJIIIZ("MultiGuestV3AnchorMask", "onPlayFinished");
                            DataChannel mDataChannel = this.LIZ.getMDataChannel();
                            if (mDataChannel != null) {
                                mDataChannel.FQ2(MultiGuestAdStopEvent.class);
                            }
                            this.LIZ.LJJIJLIJ();
                        }

                        @Override // X.InterfaceC940660aaO
                        public final void LJLLI(String str3) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onPlayFailed error:");
                            sbLIZ2.append(str3);
                            C20441214yg.LJIIIZ("MultiGuestV3AnchorMask", C2188811AlT.LIZIZ(sbLIZ2));
                            DataChannel mDataChannel = this.LIZ.getMDataChannel();
                            if (mDataChannel != null) {
                                mDataChannel.FQ2(MultiGuestAdStopEvent.class);
                            }
                            this.LIZ.LJJIJLIJ();
                        }
                    });
                }
            }
        }
    }

    public C939700aYq(Context context, InterfaceC937840aVq interfaceC937840aVq, AbstractC938280aWY abstractC938280aWY, DataChannel dataChannel, boolean z, InterfaceC940580aaG interfaceC940580aaG) {
        super(context);
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = abstractC938280aWY;
        this.LLILLL = dataChannel;
        this.LLILZ = z;
        this.LLILZIL = interfaceC940580aaG;
        this.LLJJJJJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1161));
        this.LLJJJJLIIL = new C304201Fw("ZOOM_SERVICE");
        this.LLJJL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1159));
        this.LLJJLIIIJLLLLLLLZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1160));
        this.LLLIIII = new C11NJ();
        C948450amx.LIZIZ.LIZJ(this);
        Context contextLJJIIZI = C520010KaN.LJJIIZI(context, true);
        if (contextLJJIIZI != null) {
            FrameLayout.inflate(contextLJJIIZI, R.layout.htc, this);
            this.LLJZIJLIL = (ViewStub) findViewById(R.id.b1_);
            findViewById(R.id.n6h);
        }
    }
}
