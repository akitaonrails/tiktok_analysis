package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Q3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C664220Q3o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC664210Q3n.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC664210Q3n.SEARCH_CLICK_MORE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC664210Q3n.SEARCH_SWIPE_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC664210Q3n.FROM_CLICK_MORE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[EnumC664210Q3n.CLICK_MORE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
