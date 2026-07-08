package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQU {
    public static final C0VQU COLUMN_ACCOUNT_TYPE;
    public static final C0VQU COLUMN_AVATAR_MEDIUM;
    public static final C0VQU COLUMN_AVATAR_THUMB;
    public static final C0VQU COLUMN_BLOCK_STATUS;
    public static final C0VQU COLUMN_COMMENT_MENTION_BLOCK_STATUS;
    public static final C0VQU COLUMN_COMMERCE_USER_LEVEL;
    public static final C0VQU COLUMN_CONTACT_NAME;
    public static final C0VQU COLUMN_CONTACT_NAME_INITIAL;
    public static final C0VQU COLUMN_CONTACT_NAME_PINYIN;
    public static final C0VQU COLUMN_CUSTOM_VERIFY;
    public static final C0VQU COLUMN_ENTERPRISE_VERIFY_REASON;
    public static final C0VQU COLUMN_FOLLOWER_COUNT;
    public static final C0VQU COLUMN_FOLLOWER_STATUS;
    public static final C0VQU COLUMN_FOLLOWING_COUNT;
    public static final C0VQU COLUMN_FOLLOW_STATUS;
    public static final C0VQU COLUMN_INITIAL_LETTER;
    public static final C0VQU COLUMN_INTERNAL_SHARE_VERSION;
    public static final C0VQU COLUMN_MENTION_ENABLED;
    public static final C0VQU COLUMN_NICK_NAME;
    public static final C0VQU COLUMN_NICK_NAME_INITIAL;
    public static final C0VQU COLUMN_NICK_NAME_PINYIN;
    public static final C0VQU COLUMN_QA_INVITE_BLOCK_STATUS;
    public static final C0VQU COLUMN_REMARK_INITIAL;
    public static final C0VQU COLUMN_REMARK_NAME;
    public static final C0VQU COLUMN_REMARK_PINYIN;
    public static final C0VQU COLUMN_SEC_UID;
    public static final C0VQU COLUMN_SHORT_ID;
    public static final C0VQU COLUMN_SIGNATURE;
    public static final C0VQU COLUMN_SORT_WEIGHT;
    public static final C0VQU COLUMN_UID;
    public static final C0VQU COLUMN_UNIQUE_ID;
    public static final C0VQU COLUMN_USER_FOLLOW_TIME;
    public static final C0VQU COLUMN_USER_FRIEND_REC_TIME;
    public static final C0VQU COLUMN_USER_FRIEND_REC_TYPE;
    public static final C0VQU COLUMN_USER_SHARE_STATUS;
    public static final C0VQU COLUMN_VERIFICATION_TYPE;
    public static final C0VQU COLUMN_VIDEO_MENTION_BLOCK_STATUS;
    public static final C0VQU COLUMN_VIDEO_TAG_BLOCK_STATUS;
    public static final C0VQU COLUMN_WEIBO_VERIFY;
    public static final C0VQU COLUMN_WELCOME_MESSAGE_ENABLED;
    public static final /* synthetic */ C0VQU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<C0VQU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VQU c0vqu = new C0VQU("COLUMN_UID", 0, "UID", "TEXT PRIMARY KEY NOT NULL");
        COLUMN_UID = c0vqu;
        C0VQU c0vqu2 = new C0VQU("COLUMN_SEC_UID", 1, "SEC_UID", "TEXT");
        COLUMN_SEC_UID = c0vqu2;
        C0VQU c0vqu3 = new C0VQU("COLUMN_NICK_NAME", 2, "NICK_NAME", "TEXT");
        COLUMN_NICK_NAME = c0vqu3;
        C0VQU c0vqu4 = new C0VQU("COLUMN_SIGNATURE", 3, "SIGNATURE", "TEXT");
        COLUMN_SIGNATURE = c0vqu4;
        C0VQU c0vqu5 = new C0VQU("COLUMN_AVATAR_THUMB", 4, "AVATAR_THUMB", "TEXT");
        COLUMN_AVATAR_THUMB = c0vqu5;
        C0VQU c0vqu6 = new C0VQU("COLUMN_FOLLOW_STATUS", 5, "FOLLOW_STATUS", "INTEGER NOT NULL");
        COLUMN_FOLLOW_STATUS = c0vqu6;
        C0VQU c0vqu7 = new C0VQU("COLUMN_UNIQUE_ID", 6, "UNIQUE_ID", "TEXT");
        COLUMN_UNIQUE_ID = c0vqu7;
        C0VQU c0vqu8 = new C0VQU("COLUMN_WEIBO_VERIFY", 7, "WEIBO_VERIFY", "TEXT");
        COLUMN_WEIBO_VERIFY = c0vqu8;
        C0VQU c0vqu9 = new C0VQU("COLUMN_CUSTOM_VERIFY", 8, "CUSTOM_VERIFY", "TEXT");
        COLUMN_CUSTOM_VERIFY = c0vqu9;
        C0VQU c0vqu10 = new C0VQU("COLUMN_ENTERPRISE_VERIFY_REASON", 9, "ENTERPRISE_VERIFY_REASON", "TEXT");
        COLUMN_ENTERPRISE_VERIFY_REASON = c0vqu10;
        C0VQU c0vqu11 = new C0VQU("COLUMN_VERIFICATION_TYPE", 10, "VERIFICATION_TYPE", "TEXT");
        COLUMN_VERIFICATION_TYPE = c0vqu11;
        C0VQU c0vqu12 = new C0VQU("COLUMN_REMARK_NAME", 11, "REMARK_NAME", "TEXT");
        COLUMN_REMARK_NAME = c0vqu12;
        C0VQU c0vqu13 = new C0VQU("COLUMN_SORT_WEIGHT", 12, "SORT_WEIGHT", "TEXT");
        COLUMN_SORT_WEIGHT = c0vqu13;
        C0VQU c0vqu14 = new C0VQU("COLUMN_INITIAL_LETTER", 13, "INITIAL_LETTER", "TEXT");
        COLUMN_INITIAL_LETTER = c0vqu14;
        C0VQU c0vqu15 = new C0VQU("COLUMN_SHORT_ID", 14, "SHORT_ID", "TEXT");
        COLUMN_SHORT_ID = c0vqu15;
        C0VQU c0vqu16 = new C0VQU("COLUMN_REMARK_PINYIN", 15, "REMARK_PINYIN", "TEXT");
        COLUMN_REMARK_PINYIN = c0vqu16;
        C0VQU c0vqu17 = new C0VQU("COLUMN_REMARK_INITIAL", 16, "REMARK_INITIAL", "TEXT");
        COLUMN_REMARK_INITIAL = c0vqu17;
        C0VQU c0vqu18 = new C0VQU("COLUMN_NICK_NAME_PINYIN", 17, "NICK_NAME_PINYIN", "TEXT");
        COLUMN_NICK_NAME_PINYIN = c0vqu18;
        C0VQU c0vqu19 = new C0VQU("COLUMN_NICK_NAME_INITIAL", 18, "NICK_NAME_INITIAL", "TEXT");
        COLUMN_NICK_NAME_INITIAL = c0vqu19;
        C0VQU c0vqu20 = new C0VQU("COLUMN_COMMERCE_USER_LEVEL", 19, "COMMERCE_USER_LEVEL", "INTEGER");
        COLUMN_COMMERCE_USER_LEVEL = c0vqu20;
        C0VQU c0vqu21 = new C0VQU("COLUMN_CONTACT_NAME", 20, "COLUMN_CONTACT_NAME", "TEXT");
        COLUMN_CONTACT_NAME = c0vqu21;
        C0VQU c0vqu22 = new C0VQU("COLUMN_CONTACT_NAME_PINYIN", 21, "COLUMN_CONTACT_NAME_PINYIN", "TEXT");
        COLUMN_CONTACT_NAME_PINYIN = c0vqu22;
        C0VQU c0vqu23 = new C0VQU("COLUMN_CONTACT_NAME_INITIAL", 22, "COLUMN_CONTACT_NAME_INITIAL", "TEXT");
        COLUMN_CONTACT_NAME_INITIAL = c0vqu23;
        C0VQU c0vqu24 = new C0VQU("COLUMN_USER_SHARE_STATUS", 23, "COLUMN_USER_SHARE_STATUS", "INTEGER");
        COLUMN_USER_SHARE_STATUS = c0vqu24;
        C0VQU c0vqu25 = new C0VQU("COLUMN_USER_FRIEND_REC_TYPE", 24, "USER_FRIEND_REC_TYPE", "INTEGER");
        COLUMN_USER_FRIEND_REC_TYPE = c0vqu25;
        C0VQU c0vqu26 = new C0VQU("COLUMN_USER_FRIEND_REC_TIME", 25, "USER_FRIEND_REC_TIME", "INTEGER");
        COLUMN_USER_FRIEND_REC_TIME = c0vqu26;
        C0VQU c0vqu27 = new C0VQU("COLUMN_USER_FOLLOW_TIME", 26, "USER_FOLLOW_TIME", "INTEGER");
        COLUMN_USER_FOLLOW_TIME = c0vqu27;
        C0VQU c0vqu28 = new C0VQU("COLUMN_BLOCK_STATUS", 27, "BLOCK_STATUS", "INTEGER");
        COLUMN_BLOCK_STATUS = c0vqu28;
        C0VQU c0vqu29 = new C0VQU("COLUMN_MENTION_ENABLED", 28, "MENTION_ENABLED", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_MENTION_ENABLED = c0vqu29;
        C0VQU c0vqu30 = new C0VQU("COLUMN_COMMENT_MENTION_BLOCK_STATUS", 29, "COMMENT_MENTION_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_COMMENT_MENTION_BLOCK_STATUS = c0vqu30;
        C0VQU c0vqu31 = new C0VQU("COLUMN_VIDEO_MENTION_BLOCK_STATUS", 30, "VIDEO_MENTION_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_VIDEO_MENTION_BLOCK_STATUS = c0vqu31;
        C0VQU c0vqu32 = new C0VQU("COLUMN_VIDEO_TAG_BLOCK_STATUS", 31, "VIDEO_TAG_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_VIDEO_TAG_BLOCK_STATUS = c0vqu32;
        C0VQU c0vqu33 = new C0VQU("COLUMN_QA_INVITE_BLOCK_STATUS", 32, "QA_INVITE_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_QA_INVITE_BLOCK_STATUS = c0vqu33;
        C0VQU c0vqu34 = new C0VQU("COLUMN_FOLLOWER_STATUS", 33, "FOLLOWER_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWER_STATUS = c0vqu34;
        C0VQU c0vqu35 = new C0VQU("COLUMN_ACCOUNT_TYPE", 34, "ACCOUNT_TYPE", "INTEGER");
        COLUMN_ACCOUNT_TYPE = c0vqu35;
        C0VQU c0vqu36 = new C0VQU("COLUMN_FOLLOWER_COUNT", 35, "FOLLOWER_COUNT", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWER_COUNT = c0vqu36;
        C0VQU c0vqu37 = new C0VQU("COLUMN_FOLLOWING_COUNT", 36, "FOLLOWING_COUNT", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWING_COUNT = c0vqu37;
        C0VQU c0vqu38 = new C0VQU("COLUMN_INTERNAL_SHARE_VERSION", 37, "INTERNAL_SHARE_HOLD_OUT_VERSION", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_INTERNAL_SHARE_VERSION = c0vqu38;
        C0VQU c0vqu39 = new C0VQU("COLUMN_AVATAR_MEDIUM", 38, "AVATAR_MEDIUM", "TEXT");
        COLUMN_AVATAR_MEDIUM = c0vqu39;
        C0VQU c0vqu40 = new C0VQU("COLUMN_WELCOME_MESSAGE_ENABLED", 39, "WELCOME_MESSAGE_ENABLED", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_WELCOME_MESSAGE_ENABLED = c0vqu40;
        C0VQU[] c0vquArr = {c0vqu, c0vqu2, c0vqu3, c0vqu4, c0vqu5, c0vqu6, c0vqu7, c0vqu8, c0vqu9, c0vqu10, c0vqu11, c0vqu12, c0vqu13, c0vqu14, c0vqu15, c0vqu16, c0vqu17, c0vqu18, c0vqu19, c0vqu20, c0vqu21, c0vqu22, c0vqu23, c0vqu24, c0vqu25, c0vqu26, c0vqu27, c0vqu28, c0vqu29, c0vqu30, c0vqu31, c0vqu32, c0vqu33, c0vqu34, c0vqu35, c0vqu36, c0vqu37, c0vqu38, c0vqu39, c0vqu40};
        LL = c0vquArr;
        LLILLJJLI = new C2254308sP(c0vquArr);
    }

    public static C0VQU[] values() {
        return (C0VQU[]) LL.clone();
    }

    public static C0VQU valueOf(String str) {
        return (C0VQU) C08FF.LIZ(C0VQU.class, str);
    }

    public C0VQU(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
