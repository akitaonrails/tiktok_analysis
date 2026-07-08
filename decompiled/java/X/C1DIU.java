package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1DIU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C1DIU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VECameraSettings.CAMERA_FACING_ID.values().length];
        try {
            iArr[VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VECameraSettings.CAMERA_FACING_ID.FACING_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        C1DIV.values();
        try {
            C1DIV.RADIO_9_16.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            C1DIV.RADIO_3_4.ordinal();
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            C1DIV.RADIO_1_1.ordinal();
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            C1DIV.RADIO_ROUND.ordinal();
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
    }
}
