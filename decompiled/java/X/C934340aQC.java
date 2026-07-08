package X;

import Y.AObjectS390S0100000_15;
import Y.AcS354S0200000_15;
import Y.AcS496S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomBeInvitedShowEvent;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.live.room.MultiGuestToolbarEvent;
import com.bytedance.android.livesdk.dataChannel.AudienceInteractionDialogLinkHostClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicToolbarEventSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleOptimize;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934340aQC implements InterfaceViewOnClickListenerC1102800enu, InterfaceC484670IzZ {
    public final InterfaceC924890aAx LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public Context LLILZIL;
    public C1126540fQC LLILZLL;
    public C20743416Fc LLIZ;
    public DataChannel LLIZLLLIL;
    public boolean LLJI;
    public LiveDialog LLJIJIL;
    public final C934380aQG LLJ = new C0IMT() { // from class: X.0aQG
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            C934340aQC c934340aQC = this.LL;
            if (!c934340aQC.LLILLL) {
                c934340aQC.LIZLLL(c934340aQC.LIZ());
            }
        }
    };
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(201));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 588));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 589));

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILLJJLI() {
        Drawable drawableLIZIZ = LIZIZ(true);
        if (drawableLIZIZ != null) {
            LIZLLL(drawableLIZIZ);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void LLILZ() {
        Drawable drawableLIZIZ = LIZIZ(false);
        if (drawableLIZIZ != null) {
            LIZLLL(drawableLIZIZ);
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
    public final /* synthetic */ long g0() {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LIZ() {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LLIZLLLIL
            X.0eoC r1 = X.C1102950eo9.LIZIZ(r0)
            X.0eoC r0 = X.EnumC1102980eoC.DEFAULT
            r2 = 0
            if (r1 == r0) goto L4b
            X.0eoC r0 = X.EnumC1102980eoC.COLORFUL
            r3 = 1
            if (r1 == r0) goto L45
            X.0eoC r0 = X.EnumC1102980eoC.HIGHLIGHT
            if (r1 != r0) goto L74
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L3f
            java.lang.Class<X.0enS> r0 = X.C1102520enS.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L72
            java.util.Iterator r2 = r1.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()
            X.0eno r0 = X.EnumC1102740eno.MULTIGUEST
            if (r1 != r0) goto L2c
            r0 = 1
        L3b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L3f:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 == 0) goto L74
        L45:
            android.graphics.drawable.Drawable r1 = r4.LIZIZ(r3)
            if (r1 != 0) goto L69
        L4b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L6a
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6a
        L5d:
            r0 = 2130975477(0x7f041af5, float:1.7559806E38)
        L60:
            android.graphics.drawable.Drawable r1 = X.C497740JfY.LJIIJ(r0)
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
        L69:
            return r1
        L6a:
            boolean r0 = r4.LLJI
            if (r0 != 0) goto L5d
            r0 = 2130975465(0x7f041ae9, float:1.7559782E38)
            goto L60
        L72:
            r0 = 0
            goto L3b
        L74:
            r3 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934340aQC.LIZ():android.graphics.drawable.Drawable");
    }

    public final void LIZJ() {
        Activity activityLIZ;
        if (C494680Jac.LJI(this.LLIZLLLIL)) {
            C766270U4b.LIZLLL(((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LLIZLLLIL) ? 2131856620 : 2131844448);
            return;
        }
        Context context = this.LLILZIL;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !C500260Jjc.LJJII(activityLIZ.getRequestedOrientation())) {
            GameLinkControlWidget gameLinkControlWidget = (GameLinkControlWidget) this.LL;
            gameLinkControlWidget.getClass();
            C20441214yg.LJIIIZ("GameLinkControlWidget", "onGameLinkClick");
            Room room = gameLinkControlWidget.LLILZ;
            AObjectS390S0100000_15 aObjectS390S0100000_15 = new AObjectS390S0100000_15(gameLinkControlWidget, 9);
            if (C926540aDc.LIZ()) {
                if (room == null || room.getMosaicStatus() != 1) {
                    aObjectS390S0100000_15.invoke();
                    return;
                } else {
                    C766270U4b.LIZLLL(2131853480);
                    return;
                }
            }
            return;
        }
        DataChannel dataChannel = this.LLIZLLLIL;
        Room room2 = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        if (this.LLJIJIL == null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LLILZIL);
            c782110Um9.LJIIZILJ(2131843445);
            c782110Um9.LJII(2131843442);
            c782110Um9.LJIIJ(2131843443, new AcS496S0100000_15(room2, 36));
            c782110Um9.LJIILIIL(2131843444, new AcS354S0200000_15(this, room2, 13));
            c782110Um9.LJIILL = false;
            this.LLJIJIL = c782110Um9.LIZ();
        }
        LiveDialog liveDialog = this.LLJIJIL;
        if (liveDialog != null) {
            C786410Ut5.E4(liveDialog);
        }
        C924770aAl.LIZ = "connection_button";
        if (room2 != null) {
            C923050a7z.LIZLLL(room2, "show");
            C924650aAZ.LJIILIIL(room2.getOwner().getFollowInfo().getFollowStatus(), C924810aAp.LJ().LJIIIZ, false);
        }
    }

    public final void LJ() {
        if (this.LLILLJJLI) {
            return;
        }
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            if (C1102950eo9.LIZIZ(this.LLIZLLLIL) == EnumC1102980eoC.DEFAULT) {
                C1143680frq.LJ(c1126540fQC, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER);
            } else {
                Context context = this.LLILZIL;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
                    c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                    c419910GdJ.LIZ = R.raw.icon_two_same_person_wait_fill;
                    c1126540fQC.setImageDrawable(c419910GdJ.LIZ(context));
                }
            }
        }
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 167;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        LLILLJJLI();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aQG] */
    public C934340aQC(InterfaceC924890aAx interfaceC924890aAx) {
        this.LL = interfaceC924890aAx;
    }

    public final Drawable LIZIZ(boolean z) {
        int i;
        Context context = this.LLILZIL;
        if (context != null) {
            if (LiveToolbarIconStyleOptimize.INSTANCE.enable()) {
                if (z) {
                    return (Drawable) this.LLJILJILJ.getValue();
                }
                return (Drawable) this.LLJILLL.getValue();
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(24.0f);
            if (z) {
                c419910GdJ.LIZ = R.raw.icon_color_live_two_person_fill;
            } else {
                c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exs, context));
                if (((Boolean) this.LLJILJIL.getValue()).booleanValue()) {
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
    public final void LIZLLL(Drawable drawable) {
        if (this.LLJI) {
            Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num != null && num.intValue() == 1) {
                LJ();
            } else {
                this.LLILLJJLI = false;
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
                if (this.LLJI) {
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
                if (c1126540fQC5 != null) {
                    c1126540fQC5.setImageDrawable(drawable);
                }
            }
        } else {
            Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num2 != null && num2.intValue() == 1) {
                LJ();
            } else {
                this.LLILLJJLI = false;
                C1126540fQC c1126540fQC6 = this.LLILZLL;
                if (c1126540fQC6 != null) {
                    c1126540fQC6.clearAnimation();
                }
                C1126540fQC c1126540fQC7 = this.LLILZLL;
                if (c1126540fQC7 != null) {
                    c1126540fQC7.setBackgroundResource(0);
                }
                C1126540fQC c1126540fQC8 = this.LLILZLL;
                if (c1126540fQC8 != null) {
                    c1126540fQC8.setImageDrawable(drawable);
                }
            }
        }
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null) {
            LJFF(dataChannel, true);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void dK(DataChannel dataChannel) {
        this.LLILLL = false;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        LIZLLL(LIZ());
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void mx(DataChannel dataChannel) {
        this.LLILLL = true;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
        }
        Drawable drawableLIZ = LIZ();
        drawableLIZ.setAlpha(102);
        this.LLILLJJLI = false;
        if (this.LLJI) {
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
            if (this.LLJI) {
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
                c1126540fQC6.setImageDrawable(new C20743516Fd(drawableLIZ));
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
                c1126540fQC9.setImageDrawable(new C20743516Fd(drawableLIZ));
            }
        }
        DataChannel dataChannel2 = this.LLIZLLLIL;
        if (dataChannel2 != null) {
            LJFF(dataChannel2, false);
        }
        C20743416Fc c20743416Fc2 = this.LLIZ;
        if (c20743416Fc2 != null) {
            C786410Ut5.m5(c20743416Fc2, 0.4f);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZJ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        Map<String, Object> map = C1338270kvh.LIZ;
        return false;
    }

    public static void LJFF(DataChannel dataChannel, boolean z) {
        Integer num;
        if (LinkMicToolbarEventSetting.INSTANCE.enable() && (num = (Integer) dataChannel.gg0(MultiGuestToolbarEvent.class)) != null && num.intValue() == -1) {
            dataChannel.zW(MultiGuestToolbarEvent.class, Integer.valueOf(z ? 1 : 0));
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        dataChannel.zQ2(this);
        C924790aAn.LIZLLL().LIZJ(this.LLJ);
        if (LinkMicToolbarEventSetting.INSTANCE.enable()) {
            dataChannel.zW(MultiGuestToolbarEvent.class, -1);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean zBooleanValue;
        this.LLIZLLLIL = dataChannel;
        this.LLILZ = interfaceC1103130eoR;
        this.LLILZIL = interfaceC1103130eoR.getContext();
        this.LLILZLL = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.l8k);
        interfaceC1103130eoR.findViewById(R.id.lt_);
        interfaceC1103130eoR.findViewById(R.id.l9s);
        interfaceC1103130eoR.findViewById(R.id.l9o);
        Boolean bool = (Boolean) dataChannel.gg0(C780690Ujr.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJI = zBooleanValue;
        C1126540fQC c1126540fQC = this.LLILZLL;
        if (c1126540fQC != null) {
            c1126540fQC.setImageDrawable(LIZ());
        }
        if (this.LLJI) {
            C20743416Fc c20743416Fc = (C20743416Fc) interfaceC1103130eoR.findViewById(R.id.y7s);
            if (c20743416Fc != null) {
                c20743416Fc.setText(C497740JfY.LJIJI(2131853927));
            } else {
                c20743416Fc = null;
            }
            this.LLIZ = c20743416Fc;
        }
        C924790aAn.LIZLLL().LIZ(this.LLJ);
        dataChannel.CQ2(AudienceInteractionDialogLinkHostClickEvent.class, this, new AwS594S0100000_15(this, 637));
        dataChannel.CQ2(LinkInRoomBeInvitedShowEvent.class, this, new AwS594S0100000_15(this, 638));
    }
}
