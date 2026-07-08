package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C03ZS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C03ZQ.values().length];
        try {
            iArr[C03ZQ.DOUBLE_COLUMN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
