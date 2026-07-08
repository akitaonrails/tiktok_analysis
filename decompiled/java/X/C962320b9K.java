package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickInviteWithManualInviteSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0b9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962320b9K extends C957430b1R<InterfaceC962360b9O, C962370b9P> {
    public static final C962320b9K LIZ = new C962320b9K();

    public static void LIZIZ(AbstractC962390b9R abstractC962390b9R) {
        User owner;
        C16FS c16fsD0 = abstractC962390b9R.d0();
        if (c16fsD0 != null) {
            c16fsD0.setMaxWidth(Integer.MAX_VALUE);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        ImageModel avatarThumb = null;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        C1099610eil c1099610eilU5 = abstractC962390b9R.U5();
        if (c1099610eilU5 != null) {
            if (owner != null) {
                avatarThumb = owner.getAvatarThumb();
            }
            C1121670fIL.LJIILIIL(c1099610eilU5, avatarThumb, c1099610eilU5.getWidth(), c1099610eilU5.getHeight(), R.drawable.el_);
        }
        View viewLJJIZ = abstractC962390b9R.LJJIZ();
        if (viewLJJIZ != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(abstractC962390b9R, 243), viewLJJIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC962360b9O r4) {
        /*
            boolean r0 = X.C970240bM6.LIZ()
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L76
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            boolean r0 = r0.mz1()
            if (r0 != 0) goto L76
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            X.0bSa r0 = r0.JV1(r3)
            boolean r0 = r0.isInProcess()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L76
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r1)
            int r0 = r0.size()
            boolean r0 = X.C950220apo.LJIJ(r0, r3)
            if (r0 != 0) goto L76
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.getDataChannel()
            if (r1 == 0) goto L74
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel> r0 = com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L48:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L76
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.getDataChannel()
            boolean r0 = X.C956170azP.LIZ(r0)
            if (r0 != 0) goto L76
            r2 = 0
        L59:
            android.view.View r1 = r4.LJJIZ()
            if (r1 == 0) goto L70
            X.16FS r0 = r4.d0()
            if (r0 == 0) goto L71
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L71
            if (r2 == 0) goto L71
        L6d:
            X.C786410Ut5.LJLLLLLL(r3, r1)
        L70:
            return
        L71:
            r3 = 8
            goto L6d
        L74:
            r0 = 0
            goto L48
        L76:
            r2 = 1
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962320b9K.LIZJ(X.0b9O):void");
    }

    public static void LIZ(InterfaceC962360b9O interfaceC962360b9O, C962370b9P c962370b9P, List list) {
        boolean z;
        String strLJIJI;
        String strLJIJI2;
        int iLIZIZ = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        C16FS c16fsD0 = interfaceC962360b9O.d0();
        if (c16fsD0 != null) {
            C949960apO.LIZLLL(c16fsD0, interfaceC962360b9O.getDataChannel(), c962370b9P.LJFF, false, 8);
        }
        View viewLLLLIIL = interfaceC962360b9O.LLLLIIL();
        if (viewLLLLIIL instanceof ViewGroup) {
            ViewGroup.LayoutParams layoutParams = viewLLLLIIL.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!c962370b9P.LJI) {
                    iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
                }
                marginLayoutParams.topMargin = iLIZIZ;
                C786410Ut5.W5(viewLLLLIIL, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (!z2) {
            C16F5 c16f5X1 = interfaceC962360b9O.x1();
            if (c16f5X1 != null) {
                c16f5X1.setText(c962370b9P.LJ.title);
            }
            C16F5 c16f5LLJL = interfaceC962360b9O.LLJL();
            if (c16f5LLJL != null) {
                c16f5LLJL.setText(c962370b9P.LJ.subTitle);
            }
            C1143680frq.LIZLLL(interfaceC962360b9O.b2(), "tiktok_live_interaction_normal_1", "ttlive_bg_random_linkmic_rival_avatar.png");
            View viewLJJIZ = interfaceC962360b9O.LJJIZ();
            if (viewLJJIZ != null) {
                C786410Ut5.LJLLLLLL(8, viewLJJIZ);
            }
        }
        LIZJ(interfaceC962360b9O);
        if (C949960apO.LIZ()) {
            if (c962370b9P.LJFF) {
                C16F5 c16f5X12 = interfaceC962360b9O.x1();
                if (c16f5X12 != null) {
                    C500260Jjc.LJIILIIL(c16f5X12);
                }
                C16F5 c16f5LLLFFI = interfaceC962360b9O.LLLFFI();
                if (c16f5LLLFFI != null) {
                    if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
                        strLJIJI2 = C497740JfY.LJIJI(2131851782);
                    } else {
                        strLJIJI2 = C497740JfY.LJIJI(2131851776);
                    }
                    c16f5LLLFFI.setText(strLJIJI2);
                }
            } else {
                C16F5 c16f5X13 = interfaceC962360b9O.x1();
                if (c16f5X13 != null) {
                    C500260Jjc.LLFFF(c16f5X13);
                }
                C16F5 c16f5LLLFFI2 = interfaceC962360b9O.LLLFFI();
                if (c16f5LLLFFI2 != null) {
                    if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
                        strLJIJI = C497740JfY.LJIJI(2131851781);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131851777);
                    }
                    c16f5LLLFFI2.setText(strLJIJI);
                }
            }
            C16F5 c16f5LLJL2 = interfaceC962360b9O.LLJL();
            if (c16f5LLJL2 != null) {
                C500260Jjc.LJIILIIL(c16f5LLJL2);
            }
            C16F5 c16f5LLLFFI3 = interfaceC962360b9O.LLLFFI();
            if (c16f5LLLFFI3 != null) {
                C500260Jjc.LLFFF(c16f5LLLFFI3);
                return;
            }
            return;
        }
        C16F5 c16f5X14 = interfaceC962360b9O.x1();
        if (c16f5X14 != null) {
            C500260Jjc.LLFFF(c16f5X14);
        }
        C16F5 c16f5LLJL3 = interfaceC962360b9O.LLJL();
        if (c16f5LLJL3 != null) {
            C500260Jjc.LLFFF(c16f5LLJL3);
        }
        C16F5 c16f5LLLFFI4 = interfaceC962360b9O.LLLFFI();
        if (c16f5LLLFFI4 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(c16f5LLLFFI4);
    }
}
