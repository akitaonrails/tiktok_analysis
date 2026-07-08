package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1A83, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C1A83 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VECameraSettings.CAMERA_FACING_ID.values().length];
        LIZ = iArr;
        try {
            iArr[VECameraSettings.CAMERA_FACING_ID.FACING_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_3RD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_WIDE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_TELE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
    }
}
