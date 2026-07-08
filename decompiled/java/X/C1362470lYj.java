package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1362470lYj {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1362480lYk.values().length];
        try {
            iArr[EnumC1362480lYk.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1362480lYk.SHOW_ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1362480lYk.SELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
