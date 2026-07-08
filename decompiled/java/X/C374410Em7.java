package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Em7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C374410Em7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC374420Em8.values().length];
        try {
            iArr[EnumC374420Em8.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC374420Em8.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC374420Em8.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
