package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C657960PrO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC657940PrM.values().length];
        try {
            iArr[EnumC657940PrM.LIVE_CHILD_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC657940PrM.LIVE_AGGREGATED_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
