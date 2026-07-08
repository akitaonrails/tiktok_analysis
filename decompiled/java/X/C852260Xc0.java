package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C852260Xc0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC852270Xc1.values().length];
        try {
            iArr[EnumC852270Xc1.LENGTH_RANGE_RULE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC852270Xc1.LETTER_NUMBER_SPECIAL_CHAR_CONTAINED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC852270Xc1.ALL_CHARS_VALID_RULE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
