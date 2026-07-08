package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JDC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0JDC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC488160JCk.values().length];
        try {
            iArr[EnumC488160JCk.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
