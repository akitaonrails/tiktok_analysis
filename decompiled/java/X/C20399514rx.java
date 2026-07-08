package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20399514rx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20429214wk.values().length];
        try {
            iArr[EnumC20429214wk.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC20429214wk.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
