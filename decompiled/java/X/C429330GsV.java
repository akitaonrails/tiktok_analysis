package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C429330GsV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC429320GsU.values().length];
        try {
            iArr[EnumC429320GsU.LEFT_RIPPLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC429320GsU.RIGHT_RIPPLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC429320GsU.BOTH_SIDE_RIPPLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
