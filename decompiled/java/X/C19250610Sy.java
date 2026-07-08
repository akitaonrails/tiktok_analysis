package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.IPluginService;

/* JADX INFO: renamed from: X.10Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C19250610Sy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IPluginService.AutoExposureConfig.ExposureType.values().length];
        try {
            iArr[IPluginService.AutoExposureConfig.ExposureType.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[IPluginService.AutoExposureConfig.ExposureType.FULL_AND_PRECISE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
