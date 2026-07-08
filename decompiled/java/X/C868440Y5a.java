package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C868440Y5a {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC868450Y5b.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC868450Y5b.MESSAGE_TYPE_NOT_USED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_COMMAND.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_CONVERSATION_DESTROY.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_MODE_CHANGE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_BLOCK_COMMAND.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_MARK_COMMAND.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_SEND_FAILED_RESP.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_BATCH_UNMARK_COMMAND.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_REFRESH_MESSAGE.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_RE_FETCH_MESSAGE.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_RECALL_MESSAGE.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            LIZ[EnumC868450Y5b.MESSAGE_TYPE_RESET_ALL_MESSAGES.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
    }
}
