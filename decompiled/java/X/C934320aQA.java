package X;

import Y.ARunnableS84S0200000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestQuickConnectTipIsClickChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSuggestUserIsSelectedChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestToolbarVisibleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestInvitePreApprovedChannel;
import com.bytedance.android.live.room.MultiGuestOpenMultiGuestEvent;
import com.bytedance.android.live.room.MultiGuestToolbarEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.event.ToolbarStateChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.MultiGuestContinuousTypeData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutFeedRoomTypeData;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicToolbarEventSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleOptimize;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934320aQA implements InterfaceViewOnClickListenerC1102800enu, InterfaceC484670IzZ {
    public static final C934450aQN LLLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public InterfaceC934580aQa LL;
    public final LifecycleOwner LLILLJJLI;
    public final C934440aQM LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1103130eoR LLJ;
    public Context LLJIJIL;
    public C1126540fQC LLJILJIL;
    public C1126540fQC LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C1324720kZq LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public C20743416Fc LLJJIJI;
    public DataChannel LLJJIJIIJIL;
    public Long LLJJIJIL;
    public User LLJJJ;
    public C11JF LLJJJIL;
    public int LLJJJJJIL;
    public final C20136513qd LLJJLIIIJLLLLLLLZ;
    public final C20136513qd LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public long LLJLLL;
    public int LLJZ;
    public C11JF LLJZIJLIL;
    public ARunnableS84S0200000_15 LLL;
    public final C929490aIN LLLF;
    public final C934300aQ8 LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public C16FV LLLI;
    public final C01GW LLLII;
    public final C11NJ LLLIIII;
    public C423470Gj3 LLLIIIIL;
    public final Map<String, TextView> LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1206));
    public int LLJJJJ = 8;
    public int LLJJJJLIIL = 8;
    public int LLJJL = 8;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0aQN] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C934320aQA.class, "tooltipTokenForReserve", "getTooltipTokenForReserve()J", 0);
        C13LE.LIZ.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(C934320aQA.class, "tooltipTokenForMixModeApply", "getTooltipTokenForMixModeApply()J", 0)};
        LLLILZ = new Object() { // from class: X.0aQN
        };
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILLJJLI() {
        Drawable drawableLJIIIZ = LJIIIZ(true);
        if (drawableLJIIIZ != null) {
            LJIIZILJ(drawableLJIIIZ);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILZ() {
        Drawable drawableLJIIIZ = LJIIIZ(false);
        if (drawableLJIIIZ != null) {
            LJIIZILJ(drawableLJIIIZ);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    public final boolean LIZLLL() {
        if (!MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnableAndLimitTime()) {
            return false;
        }
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) this.LLLII.getValue();
        return (multiGuestAnchorQuickConnectViewModel != null ? multiGuestAnchorQuickConnectViewModel.yQ2() : null) == EnumC931540aLg.CALLING;
    }

    public final boolean LJI() {
        return this.LLILZLL || !this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LJII() {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJJIJIIJIL
            X.0eoC r1 = X.C1102950eo9.LIZIZ(r0)
            boolean r0 = r4.LLIZ
            r2 = 0
            if (r0 != 0) goto L54
            X.0eoC r0 = X.EnumC1102980eoC.DEFAULT
            if (r1 == r0) goto L54
            X.0eoC r0 = X.EnumC1102980eoC.COLORFUL
            r3 = 1
            if (r1 == r0) goto L4e
            X.0eoC r0 = X.EnumC1102980eoC.HIGHLIGHT
            if (r1 != r0) goto L6f
            X.0aQN r0 = X.C934320aQA.LLLILZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LLJJIJIIJIL
            r0.getClass()
            if (r1 == 0) goto L48
            java.lang.Class<X.0enS> r0 = X.C1102520enS.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L48
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6d
            java.util.Iterator r2 = r1.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            X.0eno r0 = X.EnumC1102740eno.MULTIGUEST
            if (r1 != r0) goto L35
            r0 = 1
        L44:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L48:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 == 0) goto L6f
        L4e:
            android.graphics.drawable.Drawable r1 = r4.LJIIIZ(r3)
            if (r1 != 0) goto L68
        L54:
            boolean r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L69
            boolean r0 = r4.LLIZ
            if (r0 == 0) goto L69
            r0 = 2130975476(0x7f041af4, float:1.7559804E38)
        L5f:
            android.graphics.drawable.Drawable r1 = X.C497740JfY.LJIIJ(r0)
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
        L68:
            return r1
        L69:
            r0 = 2130975477(0x7f041af5, float:1.7559806E38)
            goto L5f
        L6d:
            r0 = 0
            goto L44
        L6f:
            r3 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.LJII():android.graphics.drawable.Drawable");
    }

    public final long LJIIJ() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLILZJ[0])).longValue();
    }

    public final boolean LJIIJJI() {
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LLJJIJIIJIL);
        return (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF();
    }

    public final void LJIILJJIL() {
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJIII;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public final void LJIJJ() {
        if (this.LLILZ) {
            return;
        }
        C1126540fQC c1126540fQC = this.LLJILJIL;
        if (c1126540fQC != null) {
            LJIJI(true);
            if (C1102950eo9.LIZIZ(this.LLJJIJIIJIL) == EnumC1102980eoC.DEFAULT) {
                C1143680frq.LJ(c1126540fQC, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER);
            } else {
                Context context = this.LLJIJIL;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
                    c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                    c419910GdJ.LIZ = R.raw.icon_two_same_person_wait_fill;
                    c1126540fQC.setImageDrawable(c419910GdJ.LIZ(context));
                }
            }
        }
        this.LLILZ = true;
    }

    public final void LJIJJLI() {
        if (this.LLJZ < 0) {
            return;
        }
        this.LLJZ = -1;
        C924810aAp.LJ().LJIILIIL(this.LLLF);
        C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", "[QC_BATCH_INVITE_V1] toolbar unregisterGuestNumListener");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return C500260Jjc.LJIIZILJ(this.LLJJIJIIJIL);
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 167;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIIIIZZ() {
        /*
            r4 = this;
            boolean r0 = r4.LJIIJJI()
            r3 = 0
            if (r0 == 0) goto L2f
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r1 = (com.bytedance.android.live.toolbar.IToolbarService) r1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJJIJIIJIL
            X.0eRS r2 = r1.Mn1(r0)
            if (r2 == 0) goto L2d
            X.0enp r1 = X.EnumC1102750enp.MORE
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJJIJIIJIL
            android.view.View r0 = r2.LJIIZILJ(r0, r1)
            if (r0 == 0) goto L2d
            android.view.ViewParent r1 = r0.getParent()
        L25:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L2c
            r3 = r1
            android.view.View r3 = (android.view.View) r3
        L2c:
            return r3
        L2d:
            r1 = r3
            goto L25
        L2f:
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r1 = (com.bytedance.android.live.toolbar.IToolbarService) r1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJJIJIIJIL
            X.0eRS r2 = r1.Mn1(r0)
            if (r2 == 0) goto L55
            X.0enp r1 = X.EnumC1102750enp.INTERACTION_FEATURES
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJJIJIIJIL
            android.view.View r0 = r2.LJIIZILJ(r0, r1)
            if (r0 == 0) goto L55
            android.view.ViewParent r1 = r0.getParent()
        L4d:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L2c
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            return r3
        L55:
            r1 = r3
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.LJIIIIZZ():android.view.View");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        LLILLJJLI();
    }

    public static final boolean LJIIL(Boolean bool) {
        List<LinkUser> listLIZLLL;
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return false;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null && listLIZLLL.size() > 1) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(String str) {
        ARunnableS84S0200000_15 aRunnableS84S0200000_15 = this.LLL;
        if (aRunnableS84S0200000_15 == null) {
            return;
        }
        C473410IhP.LJ(aRunnableS84S0200000_15);
        this.LLL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[QC_BATCH_INVITE_V1] toolbar cancelTimer reason=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(boolean z) {
        View viewLJIIIIZZ;
        if (z) {
            int i = this.LLJJJJ;
            if (i == 0) {
                int i2 = this.LLJJJJJIL;
                if (i2 > 0) {
                    LJIILL(i2);
                }
            } else if (i == 8 && this.LLJJJJJIL == 0) {
                View view = (View) this.LLJI.getValue();
                if (view != null) {
                    C0GZA.LIZIZ(view);
                }
                if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (viewLJIIIIZZ = LJIIIIZZ()) != null) {
                    C0GZA.LIZIZ(viewLJIIIIZZ);
                }
            }
            View view2 = this.LLJJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(this.LLJJJJLIIL, view2);
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(this.LLJJL, view3);
            }
            C1126540fQC c1126540fQC = this.LLJILJIL;
            if (c1126540fQC != null) {
                C12ES.LJIILL(0, c1126540fQC);
                return;
            }
            return;
        }
        View view4 = (View) this.LLJI.getValue();
        if (view4 != null) {
            C0GZA.LIZIZ(view4);
        }
        View view5 = this.LLJJI;
        if (view5 != null) {
            C439101nJ.LJI(view5);
        }
        View view6 = this.LLJJIII;
        if (view6 != null) {
            C439101nJ.LJI(view6);
        }
        C1126540fQC c1126540fQC2 = this.LLJILJIL;
        if (c1126540fQC2 == null) {
            return;
        }
        C439101nJ.LJI(c1126540fQC2);
    }

    public final void LJ(DataChannel dataChannel) {
        Room room;
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null) {
            dataChannel = dataChannel2;
        }
        boolean z = true;
        this.LLILZIL = true;
        C1126540fQC c1126540fQC = this.LLJILJIL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || room.cppVersion != 2) {
            z = false;
        }
        if (z) {
            if (this.LLLI != null) {
                C1143680frq.LJI(this.LLLI, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"), null, true);
                C16FV c16fv = this.LLLI;
                if (c16fv != null) {
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                }
                if (LJIIL(Boolean.valueOf(C922570a7D.LIZ(this.LLJJIJIIJIL)))) {
                    Drawable drawableLJII = LJII();
                    drawableLJII.setAlpha(102);
                    LJIILLIIL(drawableLJII);
                    C20743416Fc c20743416Fc = this.LLJJIJI;
                    if (c20743416Fc != null) {
                        C786410Ut5.m5(c20743416Fc, 0.4f);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Drawable drawableLJII2 = LJII();
        drawableLJII2.setAlpha(102);
        LJIILLIIL(drawableLJII2);
        C20743416Fc c20743416Fc2 = this.LLJJIJI;
        if (c20743416Fc2 == null) {
            return;
        }
        C786410Ut5.m5(c20743416Fc2, 0.4f);
    }

    public final void LJFF(DataChannel dataChannel) {
        Object objGg0;
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null) {
            dataChannel = dataChannel2;
        }
        if (!C934360aQE.LIZIZ(dataChannel, ToolbarStateChannel.class)) {
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[enableIcon] fail, state=");
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(ToolbarStateChannel.class);
            } else {
                objGg0 = null;
            }
            sbLIZ.append(objGg0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("ToolbarMultiGuestBehavior", strLIZIZ, null, null);
            return;
        }
        if (this.LLILZIL && dataChannel != null) {
            dataChannel.FQ2(MultiGuestOpenMultiGuestEvent.class);
        }
        this.LLILZIL = false;
        C1126540fQC c1126540fQC = this.LLJILJIL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        LJIIZILJ(LJII());
        C16FV c16fv = this.LLLI;
        if (c16fv != null) {
            C786410Ut5.LLJJJJJIL(c16fv, 8);
        }
    }

    public final Drawable LJIIIZ(boolean z) {
        int i;
        Context context = this.LLJIJIL;
        if (context != null) {
            if (LiveToolbarIconStyleOptimize.INSTANCE.enable()) {
                if (z) {
                    return (Drawable) this.LLLIILIL.getValue();
                }
                return (Drawable) this.LLLIL.getValue();
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
            if (z) {
                c419910GdJ.LIZ = R.raw.icon_color_live_two_person_fill;
            } else {
                c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                if (((Boolean) this.LLLIIL.getValue()).booleanValue()) {
                    i = R.raw.icon_live_two_person_fill;
                } else {
                    i = R.raw.icon_tab_bottom_friends_fill;
                }
                c419910GdJ.LIZ = i;
            }
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    public final void LJIILL(int i) {
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            View viewLJIIIIZZ = LJIIIIZZ();
            if (viewLJIIIIZZ != null) {
                float fLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                float fLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
                if (LiveToolbarUIConfig.noText()) {
                    fLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
                    fLIZIZ2 = (int) C497740JfY.LIZIZ(6.0f);
                }
                C0GZA.LIZ(viewLJIIIIZZ, i, fLIZIZ, fLIZIZ2);
                ViewParent parent = viewLJIIIIZZ.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).setClipChildren(false);
                }
            }
            DataChannel dataChannel = this.LLJJIJIIJIL;
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestApplyCountChannel.class, Integer.valueOf(i));
                return;
            }
            return;
        }
        View view = (View) this.LLJI.getValue();
        if (view == null) {
            return;
        }
        float fLIZIZ3 = (int) C497740JfY.LIZIZ(8.0f);
        float fLIZIZ4 = (int) C497740JfY.LIZIZ(8.0f);
        if (LiveToolbarUIConfig.noText()) {
            fLIZIZ3 = (int) C497740JfY.LIZIZ(14.0f);
            fLIZIZ4 = (int) C497740JfY.LIZIZ(6.0f);
        }
        C0GZA.LIZ(view, i, fLIZIZ3, fLIZIZ4);
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent2).setClipChildren(false);
    }

    public final void LJIILLIIL(Drawable drawable) {
        this.LLILZ = false;
        if (this.LLLFFI) {
            C1126540fQC c1126540fQC = this.LLJILJIL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLJILJIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setBackgroundResource(0);
            }
            C1126540fQC c1126540fQC3 = this.LLJILJIL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setImageDrawable(null);
            }
            if (this.LLLFFI) {
                C1126540fQC c1126540fQC4 = this.LLJILJIL;
                if (c1126540fQC4 != null) {
                    C500260Jjc.LJLJLJ(c1126540fQC4, true);
                }
                C20743416Fc c20743416Fc = this.LLJJIJI;
                if (c20743416Fc != null) {
                    C500260Jjc.LJLJLJ(c20743416Fc, true);
                }
            }
            C1126540fQC c1126540fQC5 = this.LLJILJIL;
            if (c1126540fQC5 != null) {
                c1126540fQC5.setImageDrawable(new C20743516Fd(drawable));
                return;
            }
            return;
        }
        C1126540fQC c1126540fQC6 = this.LLJILJIL;
        if (c1126540fQC6 != null) {
            c1126540fQC6.clearAnimation();
        }
        C1126540fQC c1126540fQC7 = this.LLJILJIL;
        if (c1126540fQC7 != null) {
            c1126540fQC7.setBackgroundResource(0);
        }
        C1126540fQC c1126540fQC8 = this.LLJILJIL;
        if (c1126540fQC8 == null) {
            return;
        }
        c1126540fQC8.setImageDrawable(new C20743516Fd(drawable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(Drawable drawable) {
        Object objGg0;
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(MultiGuestInvitePreApprovedChannel.class)) == null) {
            objGg0 = EnumC922400a6w.NONE;
        }
        if (this.LLLFFI) {
            Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num != null && num.intValue() == 1) {
                LJIJJ();
                return;
            }
            if (objGg0 != EnumC922400a6w.NONE) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setEnabledDrawable return, preApprovedState=");
                sbLIZ.append(objGg0);
                C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.LLILZ = false;
            C1126540fQC c1126540fQC = this.LLJILJIL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLJILJIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setBackgroundResource(0);
            }
            C1126540fQC c1126540fQC3 = this.LLJILJIL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setImageDrawable(null);
            }
            if (this.LLLFFI) {
                C1126540fQC c1126540fQC4 = this.LLJILJIL;
                if (c1126540fQC4 != null) {
                    C500260Jjc.LJLJLJ(c1126540fQC4, true);
                }
                C20743416Fc c20743416Fc = this.LLJJIJI;
                if (c20743416Fc != null) {
                    C500260Jjc.LJLJLJ(c20743416Fc, true);
                }
            }
            C1126540fQC c1126540fQC5 = this.LLJILJIL;
            if (c1126540fQC5 != null) {
                c1126540fQC5.setImageDrawable(drawable);
            }
            LJIJI(false);
            return;
        }
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num2 != null && num2.intValue() == 1) {
            LJIJJ();
            return;
        }
        if (objGg0 != EnumC922400a6w.NONE) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setEnabledDrawable return, preApprovedState=");
            sbLIZ2.append(objGg0);
            C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLILZ = false;
        C1126540fQC c1126540fQC6 = this.LLJILJIL;
        if (c1126540fQC6 != null) {
            c1126540fQC6.clearAnimation();
        }
        C1126540fQC c1126540fQC7 = this.LLJILJIL;
        if (c1126540fQC7 != null) {
            c1126540fQC7.setBackgroundResource(0);
        }
        C1126540fQC c1126540fQC8 = this.LLJILJIL;
        if (c1126540fQC8 != null) {
            c1126540fQC8.setImageDrawable(drawable);
        }
        LJIJI(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(boolean r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.LJIJI(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(int r8) {
        /*
            r7 = this;
            boolean r0 = r7.LIZLLL()
            if (r0 == 0) goto L9
            if (r8 <= 0) goto L9
            return
        L9:
            r7.LLJJJJJIL = r8
            boolean r0 = r7.LLIZ
            r3 = 0
            r6 = 1
            if (r0 != 0) goto L19
            X.0a8R r0 = X.C923330a8R.LIZ
            boolean r0 = X.C923330a8R.LJFF()
            if (r0 == 0) goto L3c
        L19:
            if (r8 <= 0) goto L2f
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLJJIJIIJIL
            if (r1 == 0) goto L53
            java.lang.Class<X.0Tfk> r0 = X.C752660Tfk.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            if (r8 != r0) goto L53
        L2f:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r7.LLJJIJIIJIL
            if (r2 == 0) goto L3c
            java.lang.Class<X.0Tfk> r1 = X.C752660Tfk.class
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.SX0(r1, r0)
        L3c:
            boolean r0 = r7.LLIZ
            if (r0 != 0) goto L48
            X.0a8R r0 = X.C923330a8R.LIZ
            boolean r0 = X.C923330a8R.LJFF()
            if (r0 == 0) goto L8a
        L48:
            if (r8 <= 0) goto L8a
            r7.LJIILL(r8)
            r7.LLJJJJ = r3
            r7.LJJ(r3)
            return
        L53:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2 = 0
            X.C01Z4.LIZ(r2, r4)
            java.lang.String r1 = "request_cnt"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r4.put(r1, r0)
            java.lang.String r0 = "livesdk_anchor_guest_request_red_dot_show"
            X.0IjA r5 = X.C0KX4.LIZ(r0, r4, r2, r3)
            kotlin.Pair[] r4 = new kotlin.Pair[r6]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "anchorLiveHome"
            java.lang.String r0 = "multiguestBtnRedDotShow"
            r2.<init>(r1, r0)
            r4[r3] = r2
            X.0ahw r1 = new X.0ahw
            r1.<init>(r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r6)
            kotlin.Pair[] r0 = (kotlin.Pair[]) r0
            r1.LIZ(r0)
            r1.LIZIZ()
            goto L2f
        L8a:
            r0 = 8
            r7.LLJJJJ = r0
            X.0fQC r0 = r7.LLJILJILJ
            if (r0 == 0) goto Laa
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Laa
        L98:
            com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto La9
            android.view.View r0 = r7.LJIIIIZZ()
            if (r0 == 0) goto La9
            X.C0GZA.LIZIZ(r0)
        La9:
            return
        Laa:
            r7.LLJJJJJIL = r3
            X.01GW r0 = r7.LLJI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L98
            X.C0GZA.LIZIZ(r0)
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.LJIL(int):void");
    }

    public final void LJJ(boolean z) {
        if (LIZLLL()) {
            if (z) {
                return;
            }
        } else if (z) {
            C1126540fQC c1126540fQC = this.LLJILJILJ;
            if (c1126540fQC == null || c1126540fQC.getVisibility() != 0) {
                View view = this.LLJJI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                DataChannel dataChannel = this.LLJJIJIIJIL;
                if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(MultiGuestIconGroupChangeChannel.class), Boolean.TRUE)) {
                    View view2 = this.LLJJIII;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    this.LLJJL = 0;
                }
            }
            this.LLJJJJLIIL = 0;
            return;
        }
        View view3 = this.LLJJI;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = this.LLJJIII;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        this.LLJJJJLIIL = 8;
        this.LLJJL = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.InterfaceC1103130eoR r4) {
        /*
            r3 = this;
            boolean r0 = r3.LLLFFI
            if (r0 == 0) goto L32
            r0 = 2131395095(0x7f0a8217, float:1.8410893E38)
            android.view.View r2 = r4.findViewById(r0)
            X.16Fc r2 = (X.C20743416Fc) r2
            r0 = 0
            if (r2 == 0) goto L37
            boolean r1 = r3.LLIZ
            if (r1 != 0) goto L33
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LLJJIJIIJIL
            if (r1 == 0) goto L20
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L20:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L33
            r0 = 2131853927(0x7f118267, float:1.9341515E38)
        L29:
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r2.setText(r0)
        L30:
            r3.LLJJIJI = r2
        L32:
            return
        L33:
            r0 = 2131843400(0x7f115948, float:1.9320163E38)
            goto L29
        L37:
            r2 = r0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.LJJI(X.0eoR):void");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void dK(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = dataChannel;
        }
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934320aQA.class.getSimpleName());
        sbLIZ.append("_enableToolbarButton isDisabled:");
        sbLIZ.append(this.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("ToolbarMultiGuestBehavior", strLIZIZ, null, null);
        if (dataChannel2 != null) {
            C934360aQE.LIZJ(dataChannel2, ToolbarStateChannel.class, 2, false);
        }
        LJFF(dataChannel);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void mx(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = dataChannel;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934320aQA.class.getSimpleName());
        sbLIZ.append("_disableToolbarButton");
        C20441214yg.LIZIZ("ToolbarMultiGuestBehavior", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel2 != null) {
            C934360aQE.LIZJ(dataChannel2, ToolbarStateChannel.class, 2, true);
        }
        LJ(dataChannel);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FollowInfo followInfo;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        boolean z = false;
        if (C923330a8R.LJFF()) {
            this.LL.W0("", false);
            return;
        }
        if (C494680Jac.LJI(this.LLJJIJIIJIL)) {
            if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LLJJIJIIJIL)) {
                C930480aJy.LJJIJIIJI(2131856620, "ttlive_superFanLIVE_preview_toast_general", "");
                return;
            } else {
                C930480aJy.LJJIJIIJI(2131844448, "pm_sublive_preview_toast_general", "");
                return;
            }
        }
        if (LJIIL(Boolean.valueOf(C922570a7D.LIZ(this.LLJJIJIIJIL))) && this.LLIZ) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("ToolbarMultiGuestBehavior", "[onClick] isViewerLimitPerception", null, null);
            C930480aJy.LJJIJIIJI(2131844624, "pm_unavailable1", "");
            return;
        }
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestSuggestUserIsSelectedChannel.class, Boolean.valueOf(this.LLJLIL));
        }
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null) {
            dataChannel2.zW(MultiGuestQuickConnectTipIsClickChannel.class, Boolean.valueOf(this.LLJLILLLLZIIL));
        }
        if (this.LLJLIL && this.LLJLL) {
            C923190a8D.LJFF("click");
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null && iBroadcastService.getRequestControl() != null) {
            C1ALS.LIZ();
        }
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LL.W0("", this.LLIZ);
        Long l = this.LLJJIJIL;
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() < 10000) {
                String idStr = null;
                this.LLJJIJIL = null;
                User user = this.LLJJJ;
                if (user != null) {
                    idStr = user.getIdStr();
                }
                User user2 = this.LLJJJ;
                if (user2 != null && (followInfo = user2.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 2) {
                    z = true;
                }
                C917600ZzC.LIZ(idStr, true, z);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        Map<String, Object> map = C1338270kvh.LIZ;
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewLJIIIIZZ;
        AnimatedDrawable2 animatedDrawable2;
        AnimatedDrawable2 animatedDrawable22;
        AnimatedDrawable2 animatedDrawable23;
        AnimatedDrawable2 animatedDrawable24;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enableStrategy("MULTIGUEST")) {
            C20743416Fc c20743416Fc = this.LLJJIJI;
            if (c20743416Fc != null) {
                C786410Ut5.m5(c20743416Fc, 0.6f);
            }
            C1126540fQC c1126540fQC = this.LLJILJILJ;
            if (c1126540fQC != null) {
                Drawable drawable = c1126540fQC.getDrawable();
                if ((drawable instanceof AnimatedDrawable2) && (animatedDrawable24 = (AnimatedDrawable2) drawable) != null) {
                    animatedDrawable24.stop();
                }
                c1126540fQC.LIZLLL();
                C500260Jjc.LJIILLIIL(c1126540fQC);
            }
            C1324720kZq c1324720kZq = this.LLJILLL;
            if (c1324720kZq != null) {
                C786410Ut5.Yb(c1324720kZq, 1.0f);
                C786410Ut5.xc(c1324720kZq, 1.0f);
                c1324720kZq.setImageDrawable(null);
                Drawable drawable2 = c1324720kZq.getDrawable();
                if ((drawable2 instanceof AnimatedDrawable2) && (animatedDrawable23 = (AnimatedDrawable2) drawable2) != null) {
                    animatedDrawable23.stop();
                }
                C500260Jjc.LJIILLIIL(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = this.LLJJ;
            if (c1324720kZq2 != null) {
                C786410Ut5.Yb(c1324720kZq2, 1.0f);
                C786410Ut5.xc(c1324720kZq2, 1.0f);
                Drawable drawable3 = c1324720kZq2.getDrawable();
                if ((drawable3 instanceof AnimatedDrawable2) && (animatedDrawable22 = (AnimatedDrawable2) drawable3) != null) {
                    animatedDrawable22.stop();
                }
                C500260Jjc.LJIILLIIL(c1324720kZq2);
            }
            C1126540fQC c1126540fQC2 = this.LLJILJIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setBackgroundResource(0);
                c1126540fQC2.setImageDrawable(null);
                Drawable drawable4 = c1126540fQC2.getDrawable();
                if ((drawable4 instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) drawable4) != null) {
                    animatedDrawable2.stop();
                }
                c1126540fQC2.LIZLLL();
                C500260Jjc.LLFFF(c1126540fQC2);
            }
            C500260Jjc.LJIILIIL(this.LLLI);
            C500260Jjc.LJIILIIL(this.LLJJI);
            C500260Jjc.LJIILIIL(this.LLJJIII);
            View view = (View) this.LLJI.getValue();
            if (view != null) {
                C0GZA.LIZIZ(view);
            }
            if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (viewLJIIIIZZ = LJIIIIZZ()) != null) {
                C0GZA.LIZIZ(viewLJIIIIZZ);
            }
        }
        dataChannel.SX0(C956830b0T.class, null);
        if (LinkMicToolbarEventSetting.INSTANCE.enable()) {
            dataChannel.zW(MultiGuestToolbarEvent.class, -1);
        }
        dataChannel.zQ2(this);
        C924790aAn.LIZLLL().LIZJ(this.LLLFF);
        C934020aPg.LIZ.getClass();
        C934020aPg.LIZIZ(4);
        if (C952600ate.LIZ) {
            this.LLLIIII.LJ();
        }
        LIZIZ("onUnload");
        C11JF c11jf = this.LLJZIJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJZIJLIL = null;
        LJIJJLI();
        ((LinkedHashMap) this.LLLIIIL).clear();
        C423470Gj3 c423470Gj3 = this.LLLIIIIL;
        if (c423470Gj3 != null) {
            C20441214yg.LIZIZ("MultiGuestIconQuickConnectAnimationHelper", "clear");
            DataChannel dataChannel2 = c423470Gj3.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c423470Gj3);
            }
            ObjectAnimator objectAnimator = c423470Gj3.LJII;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c423470Gj3.LJII = null;
            c423470Gj3.LJ.LJ();
        }
    }

    public final void LIZ(View view, String str) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewParent parent;
        if (!C952600ate.LIZ) {
            return;
        }
        ViewParent parent2 = null;
        if (view != null && (parent = view.getParent()) != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof FrameLayout) && (viewGroup = (ViewGroup) parent2) != null) {
            View view2 = (View) ((LinkedHashMap) this.LLLIIIL).get("key_mg_state_mode");
            View view3 = view2;
            if (view2 == null) {
                C20743416Fc c20743416Fc = new C20743416Fc(view.getContext());
                c20743416Fc.setTextAppearance(R.style.a77);
                c20743416Fc.setText(str);
                C786410Ut5.LLJJJJLIIL(c20743416Fc, 0);
                this.LLLIIIL.put("key_mg_state_mode", c20743416Fc);
                view3 = c20743416Fc;
            }
            if (Intrinsics.LJFF(view3.getParent(), viewGroup)) {
                return;
            }
            ViewParent parent3 = view3.getParent();
            if ((parent3 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent3) != null) {
                C786410Ut5.LJJJLZIJ(view3, viewGroup2);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 21;
            viewGroup.addView(view3, layoutParams);
        }
    }

    public final void LJIJ(int i, boolean z) {
        Boolean boolValueOf;
        boolean z2;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLJ;
        if (interfaceC1103130eoR != null) {
            if (i == 0) {
                DataChannel dataChannel = this.LLJJIJIIJIL;
                if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(MultiGuestContinuousTypeData.class), Boolean.TRUE)) {
                    DataChannel dataChannel2 = this.LLJJIJIIJIL;
                    if ((dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(TopLiveHangoutFeedRoomTypeData.class), Boolean.TRUE)) || !LJI()) {
                        return;
                    }
                    IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                    if (iInteractService != null && iInteractService.w9() && !z) {
                        return;
                    } else {
                        LJIILJJIL();
                    }
                } else {
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("visible: ");
            sbLIZ.append(i);
            sbLIZ.append(" show guest entrance ");
            InterfaceC927900aFo interfaceC927900aFoLIZ = C927890aFn.LIZ();
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = null;
            if (interfaceC927900aFoLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC927900aFoLIZ.LIZ());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(' ');
            sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()));
            sbLIZ.append(' ');
            C20441214yg.LIZIZ("linkmic_aab", C2188811AlT.LIZIZ(sbLIZ));
            if (!this.LLILLL.LIZLLL && i == 0) {
                if (this.LLIZ) {
                    C925240aBW.LJIILLIIL(2L, r1.LIZ());
                }
                this.LLILLL.LIZLLL = true;
            }
            interfaceC1103130eoR.setVisibility(i);
            DataChannel dataChannel3 = this.LLJJIJIIJIL;
            if (dataChannel3 != null) {
                if (interfaceC1103130eoR.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dataChannel3.LC0(MultiGuestToolbarVisibleEvent.class, Boolean.valueOf(z2));
            }
            if (this.LLIZ) {
                if (i == 0 && !this.LLLFZ) {
                    this.LLLFZ = true;
                }
            } else {
                IToolbarService iToolbarService = (IToolbarService) C1161920gLG.LIZJ(IToolbarService.class);
                if (iToolbarService != null) {
                    interfaceC1088880eRSMn1 = iToolbarService.Mn1(this.LLJJIJIIJIL);
                }
                if (i != 0) {
                    if (i == 8 && interfaceC1088880eRSMn1 != null) {
                        interfaceC1088880eRSMn1.LJIIIZ(EnumC1102640ene.MULTI_GUEST, this.LLJJIJIIJIL);
                    }
                } else if (interfaceC1088880eRSMn1 != null) {
                    interfaceC1088880eRSMn1.LJIIJ(EnumC1102640ene.MULTI_GUEST, this.LLJJIJIIJIL);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("it.visibility = ");
            sbLIZ2.append(i);
            C20441214yg.LJIIIZ("FindCrashLog#ToolbarMultiGuestBehavior#setVisibility", C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LLIZ && i == 0) {
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("event_id", "link_icon_show", jSONObject);
                C925240aBW.LJIJ(jSONObject, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r7, com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934320aQA.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0aIN] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0aQ8] */
    public C934320aQA(InterfaceC934580aQa interfaceC934580aQa, LifecycleOwner lifecycleOwner, C934440aQM c934440aQM) {
        this.LL = interfaceC934580aQa;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c934440aQM;
        C769700UHg.LIZ.getClass();
        this.LLJJLIIIJLLLLLLLZ = new C20136513qd();
        this.LLJL = new C20136513qd();
        this.LLJLL = true;
        this.LLJZ = -1;
        this.LLLF = new InterfaceC915240ZvO() { // from class: X.0aIN
            @Override // X.InterfaceC915240ZvO
            public final void LIZ(int i) {
                int i2 = this.LIZ.LLJZ;
                if (i2 >= 0 && i > i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[QC_BATCH_INVITE_V1] toolbar newGuestJoined baseline=");
                    sbLIZ.append(this.LIZ.LLJZ);
                    sbLIZ.append(" current=");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LIZIZ("new_guest_joined");
                    long j = this.LIZ.LLJLLL;
                    if (j != 0) {
                        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                        C1119700fFA.LIZ(4, j);
                        this.LIZ.LLJLLL = 0L;
                    }
                    this.LIZ.LJIJJLI();
                }
            }
        };
        this.LLLFF = new C0IMT() { // from class: X.0aQ8
            @Override // X.C0IMT
            public final void onChanged(Object obj) {
                if (obj != null) {
                    this.LL.LJIILJJIL();
                }
                C934320aQA c934320aQA = this.LL;
                if (!c934320aQA.LLILZIL) {
                    c934320aQA.LJIIZILJ(c934320aQA.LJII());
                }
            }
        };
        this.LLLII = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1207));
        this.LLLIIII = new C11NJ();
        this.LLLIIIL = new LinkedHashMap();
        this.LLLIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(496));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1208));
        this.LLLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1209));
    }
}
