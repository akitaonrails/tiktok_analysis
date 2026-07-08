package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C858190XlZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC858180XlY.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC858180XlY.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC858180XlY.COMMENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
