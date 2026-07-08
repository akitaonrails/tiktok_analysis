package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14S2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C14S2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C14S3.values().length];
        try {
            iArr[C14S3.SPACE_CHAPTER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C14S3.SPACE_HEADING2.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C14S3.SPACE_HEADING3.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C14S3.SPACE_LIST_ITEM.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C14S3.SPACE_NATURAL_SEGMENT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
