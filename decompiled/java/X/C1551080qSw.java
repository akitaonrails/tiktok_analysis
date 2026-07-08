package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1551080qSw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GeckoGlobalConfig.ENVType.values().length];
        try {
            iArr[GeckoGlobalConfig.ENVType.BOE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[GeckoGlobalConfig.ENVType.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[GeckoGlobalConfig.ENVType.DEV.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
