package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1A81, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C1A81 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VECameraSettings.CAMERA_FACING_ID.values().length];
        try {
            iArr[VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
