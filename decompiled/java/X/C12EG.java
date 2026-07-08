package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12EG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C12EG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12EH.values().length];
        try {
            iArr[C12EH.PAGE_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C12EH.PULL_TO_REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C12EH.VISIBILITY_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C12EH.CLICK_PUBLISH.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C12EH.DRAFT_SAVED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
