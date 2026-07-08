package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10B5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10B5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C10B4.values().length];
        try {
            iArr[C10B4.PRIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C10B4.REMIND_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C10B4.PUBLIC.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
