package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1551070qSv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GeckoGlobalConfig.ENVType.values().length];
        LIZ = iArr;
        try {
            iArr[GeckoGlobalConfig.ENVType.BOE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[GeckoGlobalConfig.ENVType.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[GeckoGlobalConfig.ENVType.DEV.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
