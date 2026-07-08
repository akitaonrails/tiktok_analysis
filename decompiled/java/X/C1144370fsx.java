package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1144370fsx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1144380fsy.values().length];
        try {
            iArr[EnumC1144380fsy.LIVE_INCOME.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1144380fsy.UG_INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
