package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Qa9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C672750Qa9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC672720Qa6.values().length];
        try {
            iArr[EnumC672720Qa6.ECOM_SEARCH_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
