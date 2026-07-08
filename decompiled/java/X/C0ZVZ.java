package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZVZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC900680ZVa.values().length];
        try {
            iArr[EnumC900680ZVa.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC900680ZVa.MODERATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
