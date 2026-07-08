package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18VG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C18VG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C18VH.values().length];
        try {
            iArr[C18VH.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C18VH.END.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C18VH.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
