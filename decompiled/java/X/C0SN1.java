package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SN1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0SN1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0SN2.values().length];
        try {
            iArr[C0SN2.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
