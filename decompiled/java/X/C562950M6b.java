package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0M6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C562950M6b {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0M6S.values().length];
        try {
            iArr[C0M6S.GENERATING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
