package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0jXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1285070jXt {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEPlatformUtils.VEPlatform.values().length];
        LIZIZ = iArr;
        try {
            iArr[VEPlatformUtils.VEPlatform.PLATFORM_QCOM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_MTK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_HISI.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_EXYNOS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        int[] iArr2 = new int[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values().length];
        LIZ = iArr2;
        try {
            iArr2[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
    }
}
