package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEMVAlgorithmConfig;

/* JADX INFO: renamed from: X.0MPD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MPD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.values().length];
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
