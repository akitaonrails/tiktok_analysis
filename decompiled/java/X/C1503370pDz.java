package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1503370pDz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1503380pE0.values().length];
        try {
            iArr[EnumC1503380pE0.GET.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1503380pE0.POST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1503380pE0.PUT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1503380pE0.DELETE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1503380pE0.DOWNLOAD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
