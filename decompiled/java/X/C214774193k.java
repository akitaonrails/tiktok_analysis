package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.193k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C214774193k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC214771193h.values().length];
        try {
            iArr[EnumC214771193h.AIGC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC214771193h.DATE_AND_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC214771193h.MATURE_THEME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
