package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C565200MEs {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC565210MEt.values().length];
        try {
            iArr[EnumC565210MEt.SHOW_IN_MEAN_WHILE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC565210MEt.HIDE_IN_MEAN_WHILE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
