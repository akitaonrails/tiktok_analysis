package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1464800oDm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1462540oA8.values().length];
        try {
            iArr[EnumC1462540oA8.APPLIED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
