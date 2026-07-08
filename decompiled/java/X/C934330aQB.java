package X;

import Y.ACListenerS118S0200000_15;
import Y.ARunnableS115S0100000_15;
import Y.AfS151S0200000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestUserChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestQuickConnectTipIsClickChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestShowQuickConnectIconAnimationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestSuspendJoinedEvent;
import com.bytedance.android.livesdk.chatroom.event.ToolbarStateChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAutoApprovalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiguestAnchorQuickConnectForVoiceChatSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleOptimize;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934330aQB implements InterfaceViewOnClickListenerC1102800enu, InterfaceC484670IzZ {
    public final boolean LL;
    public final LifecycleOwner LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public InterfaceC1103130eoR LLILZIL;
    public C1126540fQC LLILZLL;
    public C20743416Fc LLIZ;
    public boolean LLIZLLLIL;
    public Context LLJ;
    public View.OnClickListener LLJI;
    public DataChannel LLJIJIL;
    public C16F5 LLJILJIL;
    public View LLJILLL;
    public C1126540fQC LLJJ;
    public C1324720kZq LLJJI;
    public C1324720kZq LLJJIII;
    public C11JF LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJJJ;
    public C423470Gj3 LLJJJJJIL;
    public int LLJILJILJ = 8;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(370));
    public final C11NJ LLJJJ = new C11NJ();
    public final C934370aQF LLJJJIL = new C0IMT() { // from class: X.0aQF
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            View view;
            if (obj != null && (view = this.LL.LLJILLL) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C934330aQB c934330aQB = this.LL;
            if (!c934330aQB.LLILZ) {
                c934330aQB.LJII(c934330aQB.LJ());
            }
        }
    };
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 995));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(371));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1311));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1312));

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILLJJLI() {
        Drawable drawableLJFF = LJFF(true);
        if (drawableLJFF != null) {
            LJII(drawableLJFF);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILZ() {
        Drawable drawableLJFF = LJFF(false);
        if (drawableLJFF != null) {
            LJII(drawableLJFF);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final long g0() {
        return 1000L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void onHide() {
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final boolean LIZIZ() {
        if (!MultiguestAnchorQuickConnectForVoiceChatSetting.INSTANCE.enable() || !MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnableAndLimitTime()) {
            return false;
        }
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) this.LLJJJJLIIL.getValue();
        return (multiGuestAnchorQuickConnectViewModel != null ? multiGuestAnchorQuickConnectViewModel.yQ2() : null) == EnumC931540aLg.CALLING;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LJ() {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLJIJIL
            X.0eoC r1 = X.C1102950eo9.LIZIZ(r0)
            boolean r0 = r4.LL
            r2 = 0
            if (r0 != 0) goto L4f
            X.0eoC r0 = X.EnumC1102980eoC.DEFAULT
            if (r1 == r0) goto L4f
            X.0eoC r0 = X.EnumC1102980eoC.COLORFUL
            r3 = 1
            if (r1 == r0) goto L49
            X.0eoC r0 = X.EnumC1102980eoC.HIGHLIGHT
            if (r1 != r0) goto L5e
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LLJIJIL
            if (r1 == 0) goto L43
            java.lang.Class<X.0enS> r0 = X.C1102520enS.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L43
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5c
            java.util.Iterator r2 = r1.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r2.next()
            X.0eno r0 = X.EnumC1102740eno.MULTIGUEST
            if (r1 != r0) goto L30
            r0 = 1
        L3f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L43:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 == 0) goto L5e
        L49:
            android.graphics.drawable.Drawable r1 = r4.LJFF(r3)
            if (r1 != 0) goto L5b
        L4f:
            r0 = 2130975477(0x7f041af5, float:1.7559806E38)
            android.graphics.drawable.Drawable r1 = X.C497740JfY.LJIIJ(r0)
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
        L5b:
            return r1
        L5c:
            r0 = 0
            goto L3f
        L5e:
            r3 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934330aQB.LJ():android.graphics.drawable.Drawable");
    }

    public final void LJIIIIZZ() {
        if (this.LLILLL) {
            return;
        }
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            if (C1102950eo9.LIZIZ(this.LLJIJIL) == EnumC1102980eoC.DEFAULT) {
                C1143680frq.LJ(c1126540fQC, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER);
            } else {
                Context context = this.LLJ;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
                    c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                    c419910GdJ.LIZ = R.raw.icon_two_same_person_wait_fill;
                    c1126540fQC.setImageDrawable(c419910GdJ.LIZ(context));
                }
            }
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 167;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void onShow() {
        InterfaceC1103130eoR interfaceC1103130eoR;
        if (!this.LLJJIJIIJIL && (interfaceC1103130eoR = this.LLILZIL) != null) {
            interfaceC1103130eoR.post(new ARunnableS115S0100000_15(this, 167));
        }
        this.LLJJIJIIJIL = true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        LLILLJJLI();
    }

    public static final boolean LJI(Boolean bool) {
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

    public final void LIZ(boolean z) {
        if (z) {
            C16F5 c16f5 = this.LLJILJIL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, this.LLJILJILJ);
            }
            C1126540fQC c1126540fQC = this.LLILZLL;
            if (c1126540fQC != null) {
                C12ES.LJIILL(0, c1126540fQC);
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            C439101nJ.LJI(c16f52);
        }
        C1126540fQC c1126540fQC2 = this.LLILZLL;
        if (c1126540fQC2 == null) {
            return;
        }
        C439101nJ.LJI(c1126540fQC2);
    }

    public final void LIZJ(DataChannel dataChannel) {
        Room room;
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 != null) {
            dataChannel = dataChannel2;
        }
        this.LLILZ = true;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        Drawable drawableLJ = LJ();
        drawableLJ.setAlpha(102);
        this.LLILLL = false;
        if (this.LLIZLLLIL) {
            C1126540fQC c1126540fQC2 = this.LLILZLL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.clearAnimation();
            }
            C1126540fQC c1126540fQC3 = this.LLILZLL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setBackgroundResource(0);
            }
            C1126540fQC c1126540fQC4 = this.LLILZLL;
            if (c1126540fQC4 != null) {
                c1126540fQC4.setImageDrawable(null);
            }
            if (this.LLIZLLLIL) {
                C1126540fQC c1126540fQC5 = this.LLILZLL;
                if (c1126540fQC5 != null) {
                    C500260Jjc.LJLJLJ(c1126540fQC5, true);
                }
                C20743416Fc c20743416Fc = this.LLIZ;
                if (c20743416Fc != null) {
                    C500260Jjc.LJLJLJ(c20743416Fc, true);
                }
            }
            C1126540fQC c1126540fQC6 = this.LLILZLL;
            if (c1126540fQC6 != null) {
                c1126540fQC6.setImageDrawable(new C20743516Fd(drawableLJ));
            }
        } else {
            C1126540fQC c1126540fQC7 = this.LLILZLL;
            if (c1126540fQC7 != null) {
                c1126540fQC7.clearAnimation();
            }
            C1126540fQC c1126540fQC8 = this.LLILZLL;
            if (c1126540fQC8 != null) {
                c1126540fQC8.setBackgroundResource(0);
            }
            C1126540fQC c1126540fQC9 = this.LLILZLL;
            if (c1126540fQC9 != null) {
                c1126540fQC9.setImageDrawable(new C20743516Fd(drawableLJ));
            }
        }
        C20743416Fc c20743416Fc2 = this.LLIZ;
        if (c20743416Fc2 != null) {
            C786410Ut5.m5(c20743416Fc2, 0.4f);
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C924640aAY.LIZIZ(room.getOwner().getFollowInfo().getFollowStatus(), dataChannel, "connection_button", true);
        }
    }

    public final void LIZLLL(DataChannel dataChannel) {
        Object objGg0;
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = dataChannel;
        }
        if (!C934360aQE.LIZIZ(dataChannel2, ToolbarStateChannel.class)) {
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
            C1AZW.LIZ("VoiceChat", strLIZIZ, null, null);
            return;
        }
        this.LLILZ = false;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        LJII(LJ());
    }

    public final Drawable LJFF(boolean z) {
        int i;
        Context context = this.LLJ;
        if (context != null) {
            if (LiveToolbarIconStyleOptimize.INSTANCE.enable()) {
                if (z) {
                    return (Drawable) this.LLJJLIIIJLLLLLLLZ.getValue();
                }
                return (Drawable) this.LLJL.getValue();
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
            if (z) {
                c419910GdJ.LIZ = R.raw.icon_color_live_two_person_fill;
            } else {
                c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                if (((Boolean) this.LLJJL.getValue()).booleanValue()) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(Drawable drawable) {
        if (this.LLIZLLLIL) {
            Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num != null && num.intValue() == 1) {
                LJIIIIZZ();
                return;
            }
            this.LLILLL = false;
            C1126540fQC c1126540fQC = this.LLILZLL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLILZLL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setBackgroundResource(0);
            }
            C1126540fQC c1126540fQC3 = this.LLILZLL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setImageDrawable(null);
            }
            if (this.LLIZLLLIL) {
                C1126540fQC c1126540fQC4 = this.LLILZLL;
                if (c1126540fQC4 != null) {
                    C500260Jjc.LJLJLJ(c1126540fQC4, true);
                }
                C20743416Fc c20743416Fc = this.LLIZ;
                if (c20743416Fc != null) {
                    C500260Jjc.LJLJLJ(c20743416Fc, true);
                }
            }
            C1126540fQC c1126540fQC5 = this.LLILZLL;
            if (c1126540fQC5 == null) {
                return;
            }
            c1126540fQC5.setImageDrawable(drawable);
            return;
        }
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num2 != null && num2.intValue() == 1) {
            LJIIIIZZ();
            return;
        }
        this.LLILLL = false;
        C1126540fQC c1126540fQC6 = this.LLILZLL;
        if (c1126540fQC6 != null) {
            c1126540fQC6.clearAnimation();
        }
        C1126540fQC c1126540fQC7 = this.LLILZLL;
        if (c1126540fQC7 != null) {
            c1126540fQC7.setBackgroundResource(0);
        }
        C1126540fQC c1126540fQC8 = this.LLILZLL;
        if (c1126540fQC8 == null) {
            return;
        }
        c1126540fQC8.setImageDrawable(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.LIZIZ()
            if (r0 == 0) goto L9
            if (r4 <= 0) goto L9
            return
        L9:
            boolean r0 = r3.LL
            r2 = 0
            if (r0 != 0) goto L16
            X.0a8R r0 = X.C923330a8R.LIZ
            boolean r0 = X.C923330a8R.LJFF()
            if (r0 == 0) goto L38
        L16:
            if (r4 <= 0) goto L38
            X.16F5 r1 = r3.LLJILJIL
            if (r1 == 0) goto L23
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r1.setText(r0)
        L23:
            r3.LLJILJILJ = r2
            X.0fQC r0 = r3.LLJJ
            if (r0 == 0) goto L30
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L30
        L2f:
            return
        L30:
            X.16F5 r0 = r3.LLJILJIL
            if (r0 == 0) goto L2f
            X.C786410Ut5.LLJJJJ(r0, r2)
            return
        L38:
            r1 = 8
            r3.LLJILJILJ = r1
            X.0fQC r0 = r3.LLJJ
            if (r0 == 0) goto L47
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L47
        L46:
            return
        L47:
            X.16F5 r0 = r3.LLJILJIL
            if (r0 == 0) goto L46
            X.C786410Ut5.LLJJJJ(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934330aQB.LJIIIZ(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.InterfaceC1103130eoR r4) {
        /*
            r3 = this;
            boolean r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L35
            r0 = 0
            if (r4 == 0) goto L33
            r1 = 2131395095(0x7f0a8217, float:1.8410893E38)
            android.view.View r2 = r4.findViewById(r1)
            X.16Fc r2 = (X.C20743416Fc) r2
            if (r2 == 0) goto L33
            boolean r1 = r3.LL
            if (r1 != 0) goto L36
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LLJIJIL
            if (r1 == 0) goto L22
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L22:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L36
            r0 = 2131853927(0x7f118267, float:1.9341515E38)
        L2b:
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r2.setText(r0)
            r0 = r2
        L33:
            r3.LLIZ = r0
        L35:
            return
        L36:
            r0 = 2131843400(0x7f115948, float:1.9320163E38)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934330aQB.LJIIJ(X.0eoR):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007 A[PHI: r3
      0x0007: PHI (r3v1 com.bytedance.ies.sdk.datachannel.DataChannel) = (r3v0 com.bytedance.ies.sdk.datachannel.DataChannel), (r3v2 com.bytedance.ies.sdk.datachannel.DataChannel) binds: [B:3:0x0002, B:5:0x0005] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dK(com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.LLJIJIL
            if (r3 != 0) goto L7
            r3 = r5
            if (r5 == 0) goto Le
        L7:
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ToolbarStateChannel> r2 = com.bytedance.android.livesdk.chatroom.event.ToolbarStateChannel.class
            r1 = 2
            r0 = 0
            X.C934360aQE.LIZJ(r3, r2, r1, r0)
        Le:
            r4.LIZLLL(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934330aQB.dK(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void mx(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = dataChannel;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934330aQB.class.getSimpleName());
        sbLIZ.append("_disableToolbarButton");
        C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel2 != null) {
            C934360aQE.LIZJ(dataChannel2, ToolbarStateChannel.class, 2, true);
        }
        LIZJ(dataChannel);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (LJI(Boolean.valueOf(C922570a7D.LIZ(this.LLJIJIL)))) {
            C20441214yg.LIZIZ("VoiceChatToolbar", "[onClick] isViewerLimitPerception");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestQuickConnectTipIsClickChannel.class, Boolean.valueOf(this.LLJJJJ));
        }
        View.OnClickListener onClickListener = this.LLJI;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0aQF] */
    public C934330aQB(InterfaceC927530aFD interfaceC927530aFD, boolean z) {
        this.LL = z;
        this.LLILLJJLI = interfaceC927530aFD;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C924790aAn.LIZLLL().LIZJ(this.LLJJJIL);
        C423470Gj3 c423470Gj3 = this.LLJJJJJIL;
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
        C934020aPg.LIZ.getClass();
        C934020aPg.LIZIZ(4);
        this.LLJJJ.LJ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        int visibility;
        boolean zBooleanValue;
        InterfaceC1103130eoR interfaceC1103130eoR2;
        View contentView;
        InterfaceC1103130eoR interfaceC1103130eoR3;
        View contentView2;
        Boolean bool;
        this.LLILZIL = interfaceC1103130eoR;
        this.LLJIJIL = dataChannel;
        this.LLJ = interfaceC1103130eoR.getContext();
        this.LLILZLL = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.l8k);
        this.LLJJ = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.lt_);
        this.LLJJI = (C1324720kZq) interfaceC1103130eoR.findViewById(R.id.l9s);
        this.LLJJIII = (C1324720kZq) interfaceC1103130eoR.findViewById(R.id.l9o);
        this.LLJILLL = interfaceC1103130eoR.findViewById(R.id.t16);
        C16F5 c16f5 = (C16F5) interfaceC1103130eoR.findViewById(R.id.view_red_dot_num);
        this.LLJILJIL = c16f5;
        if (c16f5 != null) {
            visibility = c16f5.getVisibility();
        } else {
            visibility = 8;
        }
        this.LLJILJILJ = visibility;
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZLLLIL = zBooleanValue;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            c1126540fQC.setImageDrawable(LJ());
        }
        LJIIJ(interfaceC1103130eoR);
        C924790aAn.LIZLLL().LIZ(this.LLJJJIL);
        MultiguestAnchorQuickConnectForVoiceChatSetting multiguestAnchorQuickConnectForVoiceChatSetting = MultiguestAnchorQuickConnectForVoiceChatSetting.INSTANCE;
        if (multiguestAnchorQuickConnectForVoiceChatSetting.enable() && MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnableAndLimitTime()) {
            C423470Gj3 c423470Gj3 = new C423470Gj3();
            View contentView3 = interfaceC1103130eoR.getContentView();
            C1126540fQC c1126540fQC2 = this.LLILZLL;
            c423470Gj3.LIZ = dataChannel;
            c423470Gj3.LIZIZ = contentView3;
            c423470Gj3.LIZJ = c1126540fQC2;
            if (dataChannel != null) {
                dataChannel.CQ2(MultiGuestShowQuickConnectIconAnimationEvent.class, c423470Gj3, new AwS585S0100000_6(c423470Gj3, 19));
            }
            this.LLJJJJJIL = c423470Gj3;
        }
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILLJJLI, MultiGuestAudienceNumChangedEvent.class, new AwS594S0100000_15(this, 925));
            dataChannel.BQ2(this.LLILLJJLI, MultiGuestApplicantNumChangedForModeratorChannel.class, new AwS594S0100000_15(this, 926));
            dataChannel.BQ2(this.LLILLJJLI, HasMultiGuestV3GuestModeratorWidget.class, new AwS381S0200000_15(this, interfaceC1103130eoR, 136));
            dataChannel.BQ2(this.LLILLJJLI, MultiGuestSuspendJoinedEvent.class, new AwS381S0200000_15(this, interfaceC1103130eoR, 137));
            dataChannel.BQ2(this.LLILLJJLI, IsViewerLimitedStatusChannel.class, new AwS381S0200000_15(this, dataChannel, 138));
            dataChannel.BQ2(this.LLILLJJLI, MultiGuestUserChangedEvent.class, new AwS381S0200000_15(this, dataChannel, 139));
            dataChannel.BQ2(this.LLILLJJLI, MultiGuestShowQuickConnectIconAnimationEvent.class, new AwS594S0100000_15(this, 927));
        }
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.view_red_dot_num);
        if (viewFindViewById != null) {
            C934020aPg.LIZ.getClass();
            C934020aPg.LIZ(4, viewFindViewById, false);
        }
        if (C952600ate.LIZ) {
            this.LLJJJ.LIZ(new C11IW(MultiGuestLayoutRenderV2.LLJJIII.LJJIJIIJIL(new AfS151S0200000_15(this, interfaceC1103130eoR, 55))).LJIILL().LJIIZILJ());
        }
        if (multiguestAnchorQuickConnectForVoiceChatSetting.enable() && MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnable() && this.LL && !InterfaceC1106030et7.A8.LIZIZ().booleanValue() && (interfaceC1103130eoR3 = this.LLILZIL) != null && (contentView2 = interfaceC1103130eoR3.getContentView()) != null) {
            C785230UrB c785230UrB = new C785230UrB(contentView2);
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LIZLLL(2131854700);
            c785230UrB.LJIILL = new C987210bnT(this, 4);
            c785230UrB.LJ = new ACListenerS118S0200000_15(this, contentView2, 57);
            c785230UrB.LJIILLIIL = new C987200bnS(this, 10);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.MULTI_GUEST_ANCHOR_QUICK_CONNECT_GUIDE, this.LLJIJIL);
        }
        if (MultiGuestAutoApprovalSetting.INSTANCE.enable() && this.LL && !InterfaceC1106030et7.z8.LIZIZ().booleanValue() && (interfaceC1103130eoR2 = this.LLILZIL) != null && (contentView = interfaceC1103130eoR2.getContentView()) != null) {
            C785230UrB c785230UrB2 = new C785230UrB(contentView);
            c785230UrB2.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB2.LJIIIZ = true;
            c785230UrB2.LIZLLL(2131853875);
            c785230UrB2.LJIILL = new InterfaceC254600ye() { // from class: X.0aQJ
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    InterfaceC1106030et7.z8.LJFF(Boolean.TRUE);
                }
            };
            c785230UrB2.LJ = new ACListenerS118S0200000_15(this, contentView, 56);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB2), EnumC1120860fH2.MULTI_GUEST_AUTO_APPROVAL_GUIDE, this.LLJIJIL);
        }
    }
}
