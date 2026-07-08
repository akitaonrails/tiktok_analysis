package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1908290zl5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1908280zl4.values().length];
        try {
            iArr[EnumC1908280zl4.DETAIL_TYPE_LIKE_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1908280zl4.DETAIL_TYPE_NOTIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
