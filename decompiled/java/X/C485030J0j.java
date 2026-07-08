package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C485030J0j {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC485010J0h.values().length];
        try {
            iArr[EnumC485010J0h.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC485010J0h.INITIAL_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC485010J0h.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC485010J0h.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
