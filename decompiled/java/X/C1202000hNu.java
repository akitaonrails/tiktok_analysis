package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1202000hNu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1201990hNt.values().length];
        try {
            iArr[EnumC1201990hNt.NEARBY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1201990hNt.POI_DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1201990hNt.REVIEW_BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
