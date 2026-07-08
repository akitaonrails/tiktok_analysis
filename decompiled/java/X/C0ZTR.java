package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZTR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZTR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0ZTS.values().length];
        try {
            iArr[C0ZTS.OPEN_DETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0ZTS.JOIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
