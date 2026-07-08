package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Uhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C779440Uhq {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC780210Uj5.values().length];
        try {
            iArr[EnumC780210Uj5.Scale120.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC780210Uj5.Default.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
