package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.broadcast.PreFinishPopOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SubOnlyCloseDialogPopupThresholdSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516680KOc {
    public static final C516680KOc LIZ = new C516680KOc();
    public static int LIZIZ;

    public static final void LIZ(boolean z) {
        if (z) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.w7;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            InterfaceC1106030et7.w7.LJFF(0);
        }
    }

    public static final boolean LIZJ(int i) {
        if (i != 6 && i != 5) {
            return false;
        }
        C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.x7;
        Long lLIZIZ = c20337914i1.LIZIZ();
        if ((lLIZIZ == null || lLIZIZ.longValue() != 0) && (System.currentTimeMillis() - lLIZIZ.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 2592000) {
            c20337914i1.LJFF(0L);
            InterfaceC1106030et7.w7.LJFF(0);
        }
        SubOnlyCloseDialogPopupThresholdSetting subOnlyCloseDialogPopupThresholdSetting = SubOnlyCloseDialogPopupThresholdSetting.INSTANCE;
        if (subOnlyCloseDialogPopupThresholdSetting.getValue() < 0 || InterfaceC1106030et7.w7.LIZIZ().intValue() < subOnlyCloseDialogPopupThresholdSetting.getValue()) {
            return true;
        }
        Long lLIZIZ2 = c20337914i1.LIZIZ();
        if (lLIZIZ2 != null && lLIZIZ2.longValue() == 0) {
            c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        return false;
    }

    public static void LIZIZ(C16F5 c16f5, boolean z) {
        int iCeil;
        if (!InterfaceC1106030et7.f146v7.LIZIZ().booleanValue()) {
            C500260Jjc.LJLJLJ(c16f5, true);
            int i = LIZIZ;
            if (i > 0) {
                iCeil = (int) Math.ceil(((double) i) * 0.3d);
            } else {
                iCeil = 1;
            }
            if (z) {
                String strLJIIL = C497740JfY.LJIIL(2131755998, iCeil, Integer.valueOf(iCeil), 160);
                if (c16f5 != null) {
                    c16f5.setText(C0KWK.LIZIZ(C20736316Cj.LIZIZ(R.attr.eu2, c16f5.getContext()), strLJIIL, String.valueOf(iCeil)));
                    return;
                }
                return;
            }
            String strLJIIL2 = C497740JfY.LJIIL(2131755601, iCeil, Integer.valueOf(iCeil), 160);
            if (c16f5 == null) {
                return;
            }
            c16f5.setText(C0KWK.LIZIZ(C20736316Cj.LIZIZ(R.attr.eu2, c16f5.getContext()), strLJIIL2, String.valueOf(iCeil)));
            return;
        }
        if (c16f5 == null) {
            return;
        }
        C439101nJ.LJI(c16f5);
    }

    public static final void LIZLLL(C782110Um9 c782110Um9, int i, final int i2, final DataChannel dataChannel, boolean z) {
        int i3;
        int i4;
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel);
        if (zKw0) {
            i3 = 2131856609;
        } else {
            i3 = 2131844215;
        }
        LIZIZ = i;
        if (!PreFinishPopOptimizationSetting.INSTANCE.enable() || !z) {
            c782110Um9.LIZJ = C497740JfY.LJIJI(i3);
        }
        C753460Th2 c753460Th2 = new C753460Th2();
        c753460Th2.LIZLLL = R.attr.eya;
        if (zKw0) {
            i4 = 2131856626;
        } else {
            i4 = 2131844216;
        }
        c753460Th2.LIZ = C497740JfY.LJIJI(i4);
        c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0JjP
            @Override // X.InterfaceC753420Tgy
            public final void LIZ(DialogInterface dialogInterface) {
                C516680KOc.LIZ(false);
                DataChannel dataChannel2 = dataChannel;
                int i5 = i2;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_close_live_popup_click");
                c474500IjALIZ.LJIJJLI(dataChannel2);
                c474500IjALIZ.LJJII(1, "has_sub_only_live");
                if (i5 != 5) {
                    if (i5 == 6) {
                        c474500IjALIZ.LJJII("high_subscribers", "sub_only_live_strategy");
                    }
                } else {
                    c474500IjALIZ.LJJII("high_acu", "sub_only_live_strategy");
                }
                c474500IjALIZ.LIZ();
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (dataChannel != null) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    DataChannel dataChannel3 = dataChannel;
                    LiveSubOnlyConfig liveSubOnlyConfig = new LiveSubOnlyConfig();
                    liveSubOnlyConfig.disabled = false;
                    C494790Jan.LJI(dataChannel3, liveSubOnlyConfig);
                }
            }
        };
        c782110Um9.LJIJJ = new C753450Th1(c753460Th2);
    }
}
