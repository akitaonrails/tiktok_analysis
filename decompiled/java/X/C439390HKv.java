package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C439390HKv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC439400HKw.values().length];
        try {
            iArr[EnumC439400HKw.FAILURE_IMAGE_NO_FACE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC439400HKw.FAILURE_IMAGE_HEADSHOT_NEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC439400HKw.FAILURE_IMAGE_NOT_NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
