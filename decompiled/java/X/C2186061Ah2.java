package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEPreviewSettings;

/* JADX INFO: renamed from: X.1Ah2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2186061Ah2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEPreviewSettings.CAMERA_OUTPUT_MODE.values().length];
        LIZ = iArr;
        try {
            iArr[VEPreviewSettings.CAMERA_OUTPUT_MODE.SURFACE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[VEPreviewSettings.CAMERA_OUTPUT_MODE.EXTERNAL_SURFACE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[VEPreviewSettings.CAMERA_OUTPUT_MODE.FRAME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[VEPreviewSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[VEPreviewSettings.CAMERA_OUTPUT_MODE.TWO_SURFACES.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }
}
