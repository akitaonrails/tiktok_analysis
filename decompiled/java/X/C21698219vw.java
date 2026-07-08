package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C21698219vw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC21698319vx.values().length];
        try {
            iArr[EnumC21698319vx.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC21698319vx.ALREADY_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC21698319vx.REPLACED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC21698319vx.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
