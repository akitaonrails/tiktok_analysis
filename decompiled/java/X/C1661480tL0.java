package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0tL0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661480tL0 {
    public static String LIZIZ() {
        int iLJJJ = C0CHQ.LIZ().LJJIIZI().LJJJ();
        return iLJJJ != 0 ? iLJJJ != 1 ? "" : "camera2" : "camera1";
    }

    public static int LIZLLL() {
        return C0CHQ.LIZ().LJJIIZI().LJJJ();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tJU] */
    public static C1660540tJU LIZ(final int i) {
        byte option;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_exposure_optmize", true, false)) {
            option = EnumC2041407zA.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
        } else {
            EnumC2041407zA.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
            option = 0;
        }
        final byte b = option;
        return new C1660560tJW(i) { // from class: X.0tJU
            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final boolean LJIILJJIL() {
                return true;
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final boolean LJIJ() {
                return true;
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int[] LIZIZ() {
                return C1448570nnb.LIZIZ(C1448570nnb.LIZ, C1660530tJT.LIZLLL(i));
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final VECameraSettings.CAMERA_MODE_TYPE LIZJ() {
                C1660530tJT.LIZIZ(i);
                return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int[] LJ() {
                return C1448570nnb.LIZIZ(C1448570nnb.LIZ, C1660530tJT.LJ(i));
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int[] LJIIIIZZ() {
                return C1448570nnb.LIZJ(C1660530tJT.LIZLLL(i));
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final boolean LJIIL() {
                return C1660530tJT.LIZIZ(i) == VECameraSettings.CAMERA_MODE_TYPE.IMAGE_MODE;
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int getFrontCameraStabilizationStrategy() {
                return ((Number) C304300BwK.LIZ.getValue()).intValue();
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int getRearCameraStabilizationStrategy() {
                return ((Number) C304310BwL.LIZ.getValue()).intValue();
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final boolean LIZLLL() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("enable_release_capture_result", true);
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final int[] LJIIZILJ() {
                return LJIIIIZZ();
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final byte LJI() {
                return b;
            }

            @Override // X.C1661490tL1, X.InterfaceC2253521DIg
            public final VEDisplaySettings LJIILIIL(VESize vESize) {
                VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
                builder.setFitMode(EnumC1778840wOI.SCALE_MODE_CENTER_CROP);
                builder.setRenderSize(vESize);
                return builder.build();
            }
        };
    }
}
