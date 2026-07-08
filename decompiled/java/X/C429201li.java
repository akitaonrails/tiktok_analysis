package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C429201li {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC429101lh.values().length];
        try {
            iArr[EnumC429101lh.MIN_VALUE_EXCEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC429101lh.MAX_VALUE_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC429101lh.INPUT_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
