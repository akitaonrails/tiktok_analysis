package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y84, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0Y84 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YFV.values().length];
        try {
            iArr[C0YFV.CURSOR_TYPE_USER_MSG_CHAIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0YFV.CURSOR_TYPE_RECENT_CONV_CHAIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0YFV.CURSOR_TYPE_STATUS_MSG_CHAIN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0YFV.CURSOR_TYPE_PRIORITY_MSG_CHAIN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
