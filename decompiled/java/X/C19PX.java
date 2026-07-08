package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19PX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C19PX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC21577619cU.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC21577619cU.None.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC21577619cU.PullDownToRefresh.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
