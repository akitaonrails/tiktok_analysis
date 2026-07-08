package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14S4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C14S4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C14S3.values().length];
        try {
            iArr[C14S3.V2_SPACE_HEADING_BETWEEN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C14S3.V2_SPACE_HEADING_1.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C14S3.V2_SPACE_HEADING_2.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C14S3.V2_SPACE_NATURAL_SEGMENT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C14S3.V2_SPACE_ITEM_BETWEEN.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C14S3.V2_SPACE_HEADING_EXTRA_TOP.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
