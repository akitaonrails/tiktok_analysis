package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0P3P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0P3P {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0P3O.values().length];
        try {
            iArr[C0P3O.REACH_TYPE_INLINE_MSG_REMINDER_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0P3O.REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0P3O.REACH_TYPE_INLINE_MSG_BOTH_LIKE_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0P3O.REACH_TYPE_GROUP_INLINE_MSG_BOTH_LIKE_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
