package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C768490UCp {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC768480UCo.values().length];
        try {
            iArr[EnumC768480UCo.DISMISS_CAUSE_CLICK_OUTSIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC768480UCo.DISMISS_CAUSE_CLICK_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC768480UCo.DISMISS_CAUSE_CLICK_SAVE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
