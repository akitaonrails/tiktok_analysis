package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZQ2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0ZQ1.values().length];
        try {
            iArr[C0ZQ1.IN_APP_PUSH_AVATAR_LABEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0ZQ1.IN_APP_PUSH_PREVIEW_LABEL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0ZQ1.MESSAGE_CARD_TOP_LABEL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0ZQ1.CHAT_ROOM_AVATAR_LABEL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C0ZQ1.DISCLAIMER_BANNER_AVATAR_LABEL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C0ZQ1.CREATION_PROGRESS_AVATAR_LABEL.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[C0ZQ1.BOT_SETTING_PAGE_AVATAR_LABEL.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[C0ZQ1.INBOX_BOT_AVATAR_LABEL.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[C0ZQ1.TYPING_INDICATOR_AVATAR_LABEL.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[C0ZQ1.BOT_TITLE_BAR_AVATAR_LABEL.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[C0ZQ1.INBOX_MSG_PREVIEW_LABEL.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[C0ZQ1.SEARCH_DETAIL_PREVIEW_LABEL.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[C0ZQ1.MESSAGE_CARD_BOTTOM_LABEL.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[C0ZQ1.CHATROOM_INTRO_AVATAR_LABEL.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[C0ZQ1.REACTION_PANEL_AVATAR_LABEL.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        LIZ = iArr;
    }
}
