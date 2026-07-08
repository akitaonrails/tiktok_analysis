package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C624990OfJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC625000OfK.values().length];
        try {
            iArr[EnumC625000OfK.LOAD_MORE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC625000OfK.LOAD_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC625000OfK.REFRESH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
