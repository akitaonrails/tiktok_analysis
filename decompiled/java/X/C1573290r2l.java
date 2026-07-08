package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0r2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1573290r2l {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1573280r2k.values().length];
        try {
            iArr[EnumC1573280r2k.NETWORK_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1573280r2k.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
