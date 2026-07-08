package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0YMQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YMR.values().length];
        LIZ = iArr;
        try {
            iArr[C0YMR.PREVIEWER_GET_MESSAGES_BY_CONVERSATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[C0YMR.PREVIEWER_GET_CONVERSATION_INFO_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[C0YMR.PROFILE_BATCH_GET_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[C0YMR.DELETE_FRIEND.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[C0YMR.GET_FRIEND_LIST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[C0YMR.REPLY_FRIEND_APPLY.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[C0YMR.GET_FRIEND_RECEIVE_APPLY_LIST.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[C0YMR.GET_FRIEND_APPLY_LIST.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[C0YMR.SEND_FRIEND_APPLY.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[C0YMR.PROFILE_SEARCH_INFO.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[C0YMR.GET_MESSAGES.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[C0YMR.BATCH_GET_MESSAGES.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[C0YMR.ACK_MESSAGE.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            LIZ[C0YMR.GET_CONVERSATIONS_CHECK_INFO_V2.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            LIZ[C0YMR.GET_MESSAGES_CHECK_INFO_V2.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            LIZ[C0YMR.BATCH_ACK_MESSAGE.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            LIZ[C0YMR.BATCH_DELETE_CONVERSATIONS.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            LIZ[C0YMR.GET_MESSAGES_BY_CONVERSATION_WITH_RANGE.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            LIZ[C0YMR.GET_MESSAGE_PREVIEW.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
    }
}
