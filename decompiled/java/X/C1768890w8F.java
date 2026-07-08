package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0w8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1768890w8F {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1768880w8E.values().length];
        try {
            iArr[EnumC1768880w8E.TAB_TOOLTIP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1768880w8E.TAB_ICON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1768880w8E.TAB_BADGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
