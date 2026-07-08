package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1551060qSu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GeckoGlobalConfig.ENVType.values().length];
        try {
            iArr[GeckoGlobalConfig.ENVType.PROD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[GeckoGlobalConfig.ENVType.BOE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
