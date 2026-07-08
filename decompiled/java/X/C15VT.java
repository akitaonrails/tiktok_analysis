package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15VT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C15VT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C15VN.values().length];
        try {
            iArr[C15VN.EXPLORE_INSERT_CARD_TYPE_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C15VN.EXPLORE_CHAT_GROUP_VERIFY_STATUS_CAN_JOIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C15VN.EXPLORE_CHAT_GROUP_VERIFY_STATUS_IN_GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C15VN.EXPLORE_CHAT_GROUP_VERIFY_STATUS_NOT_QUALIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C15VN.EXPLORE_CHAT_GROUP_VERIFY_STATUS_REQUEST_PENDING_APPROVAL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C15VN.EXPLORE_CHAT_GROUP_VERIFY_STATUS_FULL.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
