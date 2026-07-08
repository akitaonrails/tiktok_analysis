package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1438890nXz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1438880nXy.values().length];
        try {
            iArr[EnumC1438880nXy.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1438880nXy.SEPARATED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
