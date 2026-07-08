package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0EFN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C0EFN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0EFQ.values().length];
        try {
            iArr[C0EFQ.SELECT_UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0EFQ.ICON_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0EFQ.LAYER_UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
