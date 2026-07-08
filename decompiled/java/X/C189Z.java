package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.189Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C189Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC212372189a.values().length];
        try {
            iArr[EnumC212372189a.DELETE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC212372189a.HIDE_USER_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC212372189a.HIDE_SYSTEM_CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
