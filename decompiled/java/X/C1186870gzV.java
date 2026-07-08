package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1186870gzV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1186860gzU.values().length];
        try {
            iArr[EnumC1186860gzU.APPEAR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1186860gzU.DISAPPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
