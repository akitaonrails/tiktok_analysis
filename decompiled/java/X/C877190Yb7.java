package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Yb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C877190Yb7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC877180Yb6.values().length];
        try {
            iArr[EnumC877180Yb6.BUYER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
