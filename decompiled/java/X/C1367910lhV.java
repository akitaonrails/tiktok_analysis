package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1367910lhV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1367900lhU.values().length];
        try {
            iArr[EnumC1367900lhU.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1367900lhU.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1367900lhU.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
