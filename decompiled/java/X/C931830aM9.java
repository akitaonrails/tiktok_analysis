package X;

import Y.ACListenerS0S0221000_15;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS45S0201000_15;
import Y.ACListenerS81S0300000_15;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestDisMissLinkMicManageDialogChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiLinkManageDialogOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.model.MultiGuestExpandEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C931830aM9 extends AbstractC960470b6L<LinkPlayerInfo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final DataChannel LL;
    public InterfaceC931760aM2 LLILLJJLI;
    public MultiGuestDataHolder LLILLL;
    public LinkControlDataHolder LLILZ;
    public final int LLILZIL;
    public final Function1<Long, Long> LLILZLL;
    public final Function1<Long, Integer> LLIZ;
    public final String LLIZLLLIL;
    public final C928710aH7 LLJ;
    public final C1099610eil LLJI;
    public final C1099610eil LLJIJIL;
    public final C1118590fDN LLJILJIL;
    public final View LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public final C1324720kZq LLJJI;
    public final C1324720kZq LLJJIII;
    public final C16F5 LLJJIJI;
    public final C16F5 LLJJIJIIJIL;
    public final C16F5 LLJJIJIL;
    public final C16F5 LLJJJ;
    public final LiveIconView LLJJJIL;
    public final View LLJJJJ;
    public final ViewGroup LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C16F5 LLJJLIIIJLLLLLLLZ;
    public final ImageView LLJL;
    public final ImageView LLJLIL;
    public final LiveIconView LLJLILLLLZIIL;
    public final LiveIconView LLJLL;
    public final ImageView LLJLLIL;
    public final ImageView LLJLLL;
    public final LiveIconView LLJZ;
    public final C16FS LLJZIJLIL;
    public final C16FS LLL;
    public final LiveIconView LLLF;
    public final ImageView LLLFF;
    public final C931950aML LLLFFI;
    public final ViewGroup LLLFZ;
    public final C16F5 LLLI;
    public final View LLLII;
    public final View LLLIIII;
    public final View LLLIIIIL;
    public final Context LLLIIIL;
    public LinkPlayerInfo LLLIIL;
    public final C304201Fw LLLIILIL;
    public final C304201Fw LLLIL;
    public final String LLLILZ;
    public final C01GW LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C931830aM9.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C931830aM9.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC960470b6L
    public void LLIILZL() {
        this.LLILLJJLI = null;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final C16F5 S5() {
        return (C16F5) this.LLJJJJLIIL.getValue();
    }

    public final C16F5 T5() {
        return (C16F5) this.LLJJL.getValue();
    }

    public final InterfaceC927510aFB U5() {
        C304201Fw c304201Fw = this.LLLIILIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    public final void f6() {
        C439101nJ.LJI(this.LLLFZ);
        C439101nJ.LJI(this.LLLII);
        C439101nJ.LJI(this.LLLIIII);
        View view = this.LLLIIIIL;
        if (view != null) {
            C439101nJ.LJI(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i6() {
        /*
            r7 = this;
            X.0aJy r6 = X.C930480aJy.LIZ
            android.widget.ImageView r5 = r7.LLJL
            boolean r0 = X.C927560aFG.LIZJ()
            r4 = 0
            if (r0 == 0) goto L36
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r7.LLILLL
            r0.LJIILIIL = r4
        Lf:
            r3 = 0
        L10:
            android.content.Context r2 = r7.LLLIIIL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LL
            if (r1 == 0) goto L34
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L34
            boolean r0 = X.C781520UlC.LJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L28:
            r6.getClass()
            X.C930480aJy.LJJIZ(r5, r3, r2, r4, r0)
            android.widget.ImageView r0 = r7.LLJL
            X.C786410Ut5.LJZI(r4, r0)
            return
        L34:
            r0 = 0
            goto L28
        L36:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r1 = r7.LLILLL
            int r0 = r1.LJJIFFI
            if (r0 == 0) goto Lf
            int r0 = r1.LJIILIIL
            if (r0 == 0) goto Lf
            boolean r0 = r1.LJIIJ
            if (r0 == 0) goto L46
            r3 = 1
            goto L10
        L46:
            r3 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931830aM9.i6():void");
    }

    public final void V5() {
        if (C932490aND.LIZIZ()) {
            C500260Jjc.LJIILIIL(this.LLJLILLLLZIIL);
            return;
        }
        C19ME c19me = (C19ME) this.LLJLIL.getLayoutParams();
        c19me.endToStart = -1;
        c19me.endToEnd = R.id.md4;
        c19me.setMarginEnd((int) C497740JfY.LIZIZ(0.0f));
        C786410Ut5.c6(this.LLJLIL, c19me);
        C500260Jjc.LJIILIIL(this.LLJLILLLLZIIL);
    }

    public final boolean e6() {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        return ((!C922760a7W.LIZIZ() && !C922760a7W.LIZJ()) || (multiGuestDataHolder = this.LLILLL) == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null || multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting != 1 || C930540aK4.LJJIJ() || 1 == this.LLILZIL) ? false : true;
    }

    public final void r6() {
        if (C927560aFG.LIZJ() || !this.LLILLL.LJIIJ) {
            this.LLJLIL.setImageResource(R.drawable.eri);
        } else {
            this.LLJLIL.setImageResource(R.drawable.erg);
        }
    }

    public final void v6() {
        if (C917810ZzX.LJIIIIZZ()) {
            V5();
            return;
        }
        if (!C924230a9t.LIZ(1)) {
            C930480aJy.LIZ.getClass();
            if ((C930480aJy.LJIIL() || C931780aM4.LIZJ()) && U5() != null) {
                LinkPlayerInfo linkPlayerInfo = this.LLLIIL;
                User user = linkPlayerInfo != null ? linkPlayerInfo.mUser : null;
                if (C932490aND.LIZIZ() && user != null && d6(user) && !C931780aM4.LIZJ()) {
                    V5();
                    return;
                }
                InterfaceC927510aFB interfaceC927510aFBU5 = U5();
                if (interfaceC927510aFBU5 == null) {
                    return;
                }
                if (C932490aND.LIZIZ()) {
                    C500260Jjc.LLFFF(this.LLJLILLLLZIIL);
                } else {
                    C19ME c19me = (C19ME) this.LLJLIL.getLayoutParams();
                    c19me.endToStart = R.id.cl7;
                    c19me.endToEnd = -1;
                    c19me.setMarginEnd((int) C497740JfY.LIZIZ(25.0f));
                    C786410Ut5.c6(this.LLJLIL, c19me);
                    C500260Jjc.LLFFF(this.LLJLILLLLZIIL);
                }
                C919870a2r.LIZLLL(C928700aH6.LIZ(U5()), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "", "show", "anchor", "anchor_connection_panel");
                String strLJIILL = interfaceC927510aFBU5.LJIILL();
                if (strLJIILL == null) {
                    strLJIILL = "";
                }
                EnumC920250a3T enumC920250a3TLJIL = interfaceC927510aFBU5.LJIL(strLJIILL);
                C1143300frE.LJIIJJI().LJII(this.LLLILZ, C2097608Jq.LJIIJ(new Pair("action", "updateZoomBtn"), new Pair("step", "calculateZoomStatus"), new Pair("zoomStatus", enumC920250a3TLJIL)));
                C930480aJy.LJJJ(this.LLJLILLLLZIIL, enumC920250a3TLJIL, this.LLLIIIL, C439101nJ.LIZJ(R.color.dg), C439101nJ.LIZJ(R.color.f571dc), false);
                if (enumC920250a3TLJIL == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
                    C915850ZwN.LJIIJJI(24, UserService.getInstance().user().getCurrentUserId(), "show", null, false);
                }
                LiveIconView liveIconView = this.LLJLILLLLZIIL;
                if (liveIconView != null) {
                    liveIconView.setEnabled(enumC920250a3TLJIL != EnumC920250a3T.ZOOM_DISABLED);
                }
                LiveIconView liveIconView2 = this.LLJLILLLLZIIL;
                if (liveIconView2 != null) {
                    C786410Ut5.g8(liveIconView2, new ACListenerS81S0300000_15(enumC920250a3TLJIL, this, interfaceC927510aFBU5, 2));
                }
                LiveIconView liveIconView3 = this.LLJLILLLLZIIL;
                if (liveIconView3 != null) {
                    InterfaceC927510aFB interfaceC927510aFBU52 = U5();
                    C971370bNv.LIZIZ(liveIconView3, 2131840809, 2131840795, C500260Jjc.LJJJI(interfaceC927510aFBU52 != null ? Boolean.valueOf(interfaceC927510aFBU52.LJFF()) : null));
                    return;
                }
                return;
            }
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str = this.LLLILZ;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("action", "updateZoomBtn");
        pairArr[1] = new Pair("step", "goneZoomBtnUI");
        C930480aJy.LIZ.getClass();
        pairArr[2] = new Pair("linkMic1vnZoomGuestEnable", Boolean.valueOf(C930480aJy.LJIIL()));
        pairArr[3] = new Pair("zoomServiceIsNull", Boolean.valueOf(U5() == null));
        c1143300frELJIIJJI.LJII(str, C2097608Jq.LJIIJ(pairArr));
        V5();
    }

    public static final boolean d6(User user) {
        Number numberValueOf;
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            numberValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            numberValueOf = 0;
        }
        if (!(numberValueOf instanceof Long) || id != numberValueOf.longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x081d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r18) {
        /*
            Method dump skipped, instruction units count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931830aM9.L5(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo):void");
    }

    public final void N5(LinkPlayerInfo linkPlayerInfo) {
        long followStatus;
        int iLIZIZ;
        Long lInvoke;
        Integer numInvoke;
        Integer numValueOf;
        boolean z;
        DataChannel dataChannel;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        Integer num;
        Long lInvoke2;
        Function1<Long, Integer> function1;
        Function1<Long, Long> function12;
        FollowInfo followInfo;
        C927240aEk c927240aEk = new C927240aEk("anchorMgrV", "acceptBtn");
        c927240aEk.LJ = String.valueOf(linkPlayerInfo.mUser.getId());
        c927240aEk.LIZ();
        long id = linkPlayerInfo.mUser.getId();
        int iLJIIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        User user = linkPlayerInfo.mUser;
        if (user != null && (followInfo = user.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        InterfaceC931760aM2 interfaceC931760aM2 = this.LLILLJJLI;
        int i = 0;
        if (interfaceC931760aM2 != null) {
            iLIZIZ = interfaceC931760aM2.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        Integer numInvoke2 = null;
        if (e6() && (function12 = this.LLILZLL) != null) {
            lInvoke = function12.invoke(Long.valueOf(linkPlayerInfo.mUser.getId()));
        } else {
            lInvoke = null;
        }
        if (e6() && (function1 = this.LLIZ) != null) {
            numInvoke = function1.invoke(Long.valueOf(linkPlayerInfo.mUser.getId()));
        } else {
            numInvoke = null;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = this.LLILLL.LIZIZ();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting);
        } else {
            numValueOf = null;
        }
        String str = this.LLIZLLLIL;
        if (linkPlayerInfo.linkUserType == 1) {
            z = true;
        } else {
            z = false;
        }
        C925640aCA.LJIIIIZZ(id, iLJIIL, enumC918970a1PLJII, absoluteAdapterPosition, followStatus, iLIZIZ, linkPlayerInfo, lInvoke, numInvoke, numValueOf, str, z);
        if (e6()) {
            HashMap mapLJI = C925640aCA.LJI();
            Long lValueOf = Long.valueOf(linkPlayerInfo.mUser.getId());
            Function1<Long, Long> function13 = this.LLILZLL;
            if (function13 != null) {
                lInvoke2 = function13.invoke(Long.valueOf(linkPlayerInfo.mUser.getId()));
            } else {
                lInvoke2 = null;
            }
            mapLJI.put(lValueOf, lInvoke2);
            HashMap mapLJII = C925640aCA.LJII();
            Long lValueOf2 = Long.valueOf(linkPlayerInfo.mUser.getId());
            Function1<Long, Integer> function14 = this.LLIZ;
            if (function14 != null) {
                numInvoke2 = function14.invoke(Long.valueOf(linkPlayerInfo.mUser.getId()));
            }
            mapLJII.put(lValueOf2, numInvoke2);
        }
        InterfaceC931760aM2 interfaceC931760aM22 = this.LLILLJJLI;
        if (interfaceC931760aM22 != null) {
            interfaceC931760aM22.LIZ(linkPlayerInfo);
        }
        if (C922770a7X.LIZ()) {
            long id2 = linkPlayerInfo.mUser.getId();
            C928710aH7 c928710aH7 = this.LLJ;
            if (c928710aH7 != null && (concurrentHashMap = c928710aH7.LIZ) != null && (num = concurrentHashMap.get(Long.valueOf(id2))) != null && num.intValue() != 0) {
                i = 1;
            }
            C923130a87.LIZ.put(Long.valueOf(id2), Integer.valueOf(i));
        }
        if (LiveSdkMultiLinkManageDialogOptSetting.isEnabled() && (dataChannel = this.LL) != null) {
            dataChannel.zW(MultiGuestDisMissLinkMicManageDialogChannel.class, Unit.LIZ);
        }
    }

    public int P5(LinkPlayerInfo linkPlayerInfo) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        c930480aJy.getClass();
        return C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
    }

    public final int R5(LinkPlayerInfo linkPlayerInfo) {
        if (d6(linkPlayerInfo.mUser)) {
            return 0;
        }
        int i = linkPlayerInfo.LIZ;
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        return linkPlayerInfo.LIZIZ;
    }

    public void W5(LinkPlayerInfo linkPlayerInfo) {
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        if (multiGuestDataHolder.LJJIFFI >= 1 && multiGuestDataHolder.LJIIJ) {
            this.LLILLL.LJIILIIL = 1;
        } else {
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLILLL;
            if (multiGuestDataHolder2.LJJIFFI >= 1 && !multiGuestDataHolder2.LJIIJ) {
                this.LLILLL.LJIILIIL = 2;
            }
        }
        if (MultiLiveLinkPanelStyle.INSTANCE.getValue() == 2) {
            C786410Ut5.LJZI(0, this.LLJL);
        }
        C786410Ut5.LJZI(0, this.LLJLIL);
        i6();
        r6();
        v6();
        C932090aMZ c932090aMZ = new C932090aMZ(this.LL, new AwS559S0100000_15(this, 79));
        C932090aMZ.LIZ(c932090aMZ, this.LLJL, this.LLILLL, true, new AwS559S0100000_15(this, 77), new AwS559S0100000_15(this, 78), null, 16);
        c932090aMZ.LIZIZ(this.LLJLIL, null, true);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 65));
            dataChannel.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 66));
            dataChannel.CQ2(MultiGuestAnchorSelfVideoChangedEvent.class, this, new AwS594S0100000_15(this, 67));
        }
    }

    public static final void h6(int i, LinkPlayerInfo linkPlayerInfo) {
        if (i != 4 && i != 6 && linkPlayerInfo.mUser != null) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(linkPlayerInfo.mUser);
            boolean z = false;
            userProfileEvent.coHostEnable = false;
            if (i >= 1) {
                z = true;
            }
            userProfileEvent.linkInRoomEnable = z;
            userProfileEvent.mSource = "guest_connection";
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mClickUserPosition = "connection_list";
            userProfileEvent.clickModule = "multi_guest_panel_head";
            c784440UpuLIZ.LIZIZ(userProfileEvent);
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        L5((LinkPlayerInfo) obj);
    }

    public void X5(LinkPlayerInfo linkPlayerInfo, C929150aHp c929150aHp) {
        boolean z;
        Boolean boolValueOf;
        LiveMode liveMode;
        C786410Ut5.LLJJJ(this.LLL, 8);
        boolean z2 = true;
        if (this.LLILLL.LJIIJJI(linkPlayerInfo.mInteractIdStr) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLL.LIZJ(linkPlayerInfo.mInteractIdStr) != 4 && this.LLILLL.LIZJ(linkPlayerInfo.mInteractIdStr) != 3) {
            z2 = false;
        }
        C786410Ut5.LJZI(0, this.LLJLLIL);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        c930480aJy.getClass();
        int iLIZJ = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder);
        ImageView imageView = this.LLJLLIL;
        Context context = this.LLLIIIL;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C781520UlC.LJ(liveMode));
        } else {
            boolValueOf = null;
        }
        C930480aJy.LJJIZ(imageView, iLIZJ, context, z, boolValueOf);
        if (!z) {
            C786410Ut5.Q7(this.LLJLLIL, new ACListenerS45S0201000_15(this, linkPlayerInfo, iLIZJ, 0));
        } else {
            this.LLJLLIL.setClickable(false);
        }
        c929150aHp.LIZJ = iLIZJ;
        c929150aHp.LIZIZ = a6(linkPlayerInfo, z, z2);
    }

    public void b6(LinkPlayerInfo linkPlayerInfo, C929150aHp c929150aHp) {
        if (linkPlayerInfo.mUser == null) {
            return;
        }
        X5(linkPlayerInfo, c929150aHp);
        C786410Ut5.LLJJIJIL(this.LLLF, 0);
        this.LLLF.setIconAttr(R.attr.e0k);
        C786410Ut5.g8(this.LLLF, new ACListenerS118S0200000_15(this, linkPlayerInfo, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c6(int r9, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931830aM9.c6(int, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo):void");
    }

    public final void q6(LinkPlayerInfo linkPlayerInfo, boolean z) {
        if (z) {
            this.LLJILJIL.LIZIZ();
        } else {
            this.LLJILJIL.LJFF();
            this.LLJILJIL.setFollowOnClickListener(new ACListenerS118S0200000_15(this, linkPlayerInfo, 17));
        }
    }

    public final int a6(LinkPlayerInfo linkPlayerInfo, boolean z, boolean z2) {
        C786410Ut5.LJZI(0, this.LLJLLL);
        int iP5 = P5(linkPlayerInfo);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        ImageView imageView = this.LLJLLL;
        Context context = this.LLLIIIL;
        c930480aJy.getClass();
        C930480aJy.LJJIL(imageView, iP5, context, z, z2);
        C786410Ut5.Q7(this.LLJLLL, new ACListenerS0S0221000_15(z, z2, this, linkPlayerInfo, iP5, 0));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(MicClickableEvent.class, this, new AwS381S0200000_15(this, linkPlayerInfo, 19));
        }
        return iP5;
    }

    public final void u6(C16F5 c16f5, LinkPlayerInfo linkPlayerInfo, boolean z) {
        int i;
        Function1<Long, Long> function1;
        Long lInvoke;
        if (d6(linkPlayerInfo.mUser)) {
            C12ES.LJIILL(0, c16f5);
            c16f5.setText(C497740JfY.LJIJI(2131842168));
            return;
        }
        if (e6() && (function1 = this.LLILZLL) != null && (lInvoke = function1.invoke(Long.valueOf(linkPlayerInfo.mUser.getId()))) != null && lInvoke.longValue() > 0) {
            i = 70;
        } else {
            i = 0;
        }
        String strLJFF = C932140aMe.LJFF(linkPlayerInfo, i, z);
        if ((!TextUtils.isEmpty(strLJFF)) && strLJFF != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
            c16f5.setText(strLJFF);
        }
        if (linkPlayerInfo.LIZIZ == 1) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }

    public final void w6(final String str, final LinkPlayerInfo linkPlayerInfo, final EnumC920250a3T enumC920250a3T) {
        final boolean zLJFF;
        if (C922570a7D.LIZ(this.LL) && !C922570a7D.LIZIZ(this.LL)) {
            C20441214yg.LIZIZ("MultiLiveLinkPanelUserInfo", "[zoom] isInViewerLimit");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        C1143300frE.LJIIJJI().LJII(this.LLLILZ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "entrance"), new Pair("linkMicId", str)));
        InterfaceC927510aFB interfaceC927510aFBU5 = U5();
        if (interfaceC927510aFBU5 != null) {
            zLJFF = interfaceC927510aFBU5.LJFF();
        } else {
            zLJFF = false;
        }
        InterfaceC927510aFB interfaceC927510aFBU52 = U5();
        if (interfaceC927510aFBU52 != null) {
            interfaceC927510aFBU52.LJI(str, new InterfaceC920110a3F() { // from class: X.0aMB
                @Override // X.InterfaceC920110a3F
                public final void LIZJ(String str2) {
                    DataChannel dataChannel;
                    C931830aM9 c931830aM9 = this.LIZ;
                    c931830aM9.getClass();
                    C1143300frE.LJIIJJI().LJII(c931830aM9.LLLILZ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "onZoomSuccess")));
                    if (enumC920250a3T == EnumC920250a3T.CAN_ZOOM_TO_MAX && (dataChannel = this.LIZ.LL) != null) {
                        dataChannel.FQ2(MultiGuestExpandEvent.class);
                    }
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                    DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(this.LIZ.LLLIIIL, true, (PosIdentity) ListProtector.get(list, 0), (PosIdentity) ListProtector.get(list, 1), new AwS129S1100000_15(str, function1, 1));
                    dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987030bnB(dialogC933230aOPLIZ, this.LIZ, str, 0));
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
                    C931830aM9 c931830aM9 = this.LIZ;
                    c931830aM9.getClass();
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    String str5 = c931830aM9.LLLILZ;
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
                    C931830aM9 c931830aM92 = this.LIZ;
                    Context context = c931830aM92.LLLIIIL;
                    DataChannel dataChannel = c931830aM92.LL;
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

    /* JADX WARN: Multi-variable type inference failed */
    public C931830aM9(View view, DataChannel dataChannel, InterfaceC931760aM2 interfaceC931760aM2, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, Function1<? super Long, Long> function1, Function1<? super Long, Integer> function12, String str, C928710aH7 c928710aH7) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC931760aM2;
        this.LLILLL = multiGuestDataHolder;
        this.LLILZ = linkControlDataHolder;
        this.LLILZIL = i;
        this.LLILZLL = function1;
        this.LLIZ = function12;
        this.LLIZLLLIL = str;
        this.LLJ = c928710aH7;
        this.LLJI = (C1099610eil) view.findViewById(R.id.lms);
        this.LLJIJIL = (C1099610eil) view.findViewById(R.id.lmv);
        this.LLJILJIL = (C1118590fDN) view.findViewById(R.id.lmw);
        this.LLJILJILJ = view.findViewById(R.id.azf);
        this.LLJILLL = view.findViewById(R.id.aze);
        this.LLJJ = view.findViewById(R.id.view_online_dot);
        this.LLJJI = (C1324720kZq) view.findViewById(R.id.lmx);
        this.LLJJIII = (C1324720kZq) view.findViewById(R.id.lmy);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.tv_user_name);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.tv_relationship);
        this.LLJJIJIL = (C16F5) view.findViewById(R.id.zyw);
        this.LLJJJ = (C16F5) view.findViewById(R.id.ze8);
        this.LLJJJIL = (LiveIconView) view.findViewById(R.id.jzm);
        this.LLJJJJ = view.findViewById(R.id.c3_);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.mha);
        this.LLJJJJLIIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(view, 80));
        this.LLJJL = C930540aK4.LJJIJIL(new AwS559S0100000_15(view, 81));
        this.LLJJLIIIJLLLLLLLZ = (C16F5) view.findViewById(R.id.tv_request_from_karaoke);
        this.LLJL = (ImageView) view.findViewById(R.id.lkk);
        this.LLJLIL = (ImageView) view.findViewById(R.id.lki);
        this.LLJLILLLLZIIL = (LiveIconView) view.findViewById(R.id.cl7);
        this.LLJLL = (LiveIconView) view.findViewById(R.id.cl5);
        this.LLJLLIL = (ImageView) view.findViewById(R.id.lkh);
        this.LLJLLL = (ImageView) view.findViewById(R.id.lkg);
        this.LLJZ = (LiveIconView) view.findViewById(R.id.lkm);
        C16FS c16fs = (C16FS) view.findViewById(R.id.cmm);
        this.LLJZIJLIL = c16fs;
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.cqh);
        this.LLL = c16fs2;
        this.LLLF = (LiveIconView) view.findViewById(R.id.lke);
        this.LLLFF = (ImageView) view.findViewById(R.id.jwi);
        C931950aML c931950aML = (C931950aML) view.findViewById(R.id.cra);
        this.LLLFFI = c931950aML;
        this.LLLFZ = (ViewGroup) view.findViewById(R.id.j1z);
        this.LLLI = (C16F5) view.findViewById(R.id.j20);
        this.LLLII = view.findViewById(R.id.j1r);
        this.LLLIIII = view.findViewById(R.id.j1t);
        this.LLLIIIIL = view.findViewById(R.id.j1u);
        this.LLLIIIL = view.getContext();
        this.LLLIILIL = new C304201Fw("ZOOM_SERVICE");
        this.LLLIL = new C304201Fw("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        boolean zLJIJJLI = C930540aK4.LJIJJLI();
        this.LLLILZ = "Zoom/UserInfoViewHolder";
        this.LLLILZJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(23));
        if (zLJIJJLI) {
            View viewFindViewById = view.findViewById(R.id.md4);
            if (viewFindViewById != null) {
                viewFindViewById.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
            c16fs.setCircular(true);
            c16fs.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c931950aML.setCircular(true);
            c931950aML.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c16fs2.setCircular(true);
            c16fs2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        }
    }
}
