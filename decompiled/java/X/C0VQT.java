package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQT {
    public static final C0VQT COLUMN_ACCOUNT_TYPE;
    public static final C0VQT COLUMN_AVATAR_MEDIUM;
    public static final C0VQT COLUMN_AVATAR_THUMB;
    public static final C0VQT COLUMN_BLOCK_STATUS;
    public static final C0VQT COLUMN_COMMENT_MENTION_BLOCK_STATUS;
    public static final C0VQT COLUMN_COMMERCE_USER_LEVEL;
    public static final C0VQT COLUMN_CONTACT_NAME;
    public static final C0VQT COLUMN_CONTACT_NAME_INITIAL;
    public static final C0VQT COLUMN_CONTACT_NAME_PINYIN;
    public static final C0VQT COLUMN_CUSTOM_VERIFY;
    public static final C0VQT COLUMN_ENTERPRISE_VERIFY_REASON;
    public static final C0VQT COLUMN_FOLLOWER_COUNT;
    public static final C0VQT COLUMN_FOLLOWER_STATUS;
    public static final C0VQT COLUMN_FOLLOWING_COUNT;
    public static final C0VQT COLUMN_FOLLOW_STATUS;
    public static final C0VQT COLUMN_INITIAL_LETTER;
    public static final C0VQT COLUMN_INTERNAL_SHARE_VERSION;
    public static final C0VQT COLUMN_IS_PRIVATE_ACCOUNT;
    public static final C0VQT COLUMN_MENTION_ENABLED;
    public static final C0VQT COLUMN_NICK_NAME;
    public static final C0VQT COLUMN_NICK_NAME_INITIAL;
    public static final C0VQT COLUMN_NICK_NAME_PINYIN;
    public static final C0VQT COLUMN_QA_INVITE_BLOCK_STATUS;
    public static final C0VQT COLUMN_RECOMMEND_REASON;
    public static final C0VQT COLUMN_REMARK_INITIAL;
    public static final C0VQT COLUMN_REMARK_NAME;
    public static final C0VQT COLUMN_REMARK_PINYIN;
    public static final C0VQT COLUMN_SEC_UID;
    public static final C0VQT COLUMN_SHORT_ID;
    public static final C0VQT COLUMN_SIGNATURE;
    public static final C0VQT COLUMN_SORT_WEIGHT;
    public static final C0VQT COLUMN_UID;
    public static final C0VQT COLUMN_UNIQUE_ID;
    public static final C0VQT COLUMN_USER_FOLLOW_TIME;
    public static final C0VQT COLUMN_USER_FRIEND_REC_TIME;
    public static final C0VQT COLUMN_USER_FRIEND_REC_TYPE;
    public static final C0VQT COLUMN_USER_REC_TYPE;
    public static final C0VQT COLUMN_USER_SHARE_STATUS;
    public static final C0VQT COLUMN_VERIFICATION_TYPE;
    public static final C0VQT COLUMN_VIDEO_MENTION_BLOCK_STATUS;
    public static final C0VQT COLUMN_VIDEO_TAG_BLOCK_STATUS;
    public static final C0VQT COLUMN_WEIBO_VERIFY;
    public static final C0VQT FRIEND_TYPE_STR;
    public static final /* synthetic */ C0VQT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0VQT MUTUAL_RELATION;
    public static final C0VQT REQUEST_ID;
    public static final C0VQT SOCIAL_INFO;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<C0VQT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VQT c0vqt = new C0VQT("COLUMN_UID", 0, "UID", "TEXT PRIMARY KEY NOT NULL");
        COLUMN_UID = c0vqt;
        C0VQT c0vqt2 = new C0VQT("COLUMN_SEC_UID", 1, "SEC_UID", "TEXT");
        COLUMN_SEC_UID = c0vqt2;
        C0VQT c0vqt3 = new C0VQT("COLUMN_NICK_NAME", 2, "NICK_NAME", "TEXT");
        COLUMN_NICK_NAME = c0vqt3;
        C0VQT c0vqt4 = new C0VQT("COLUMN_SIGNATURE", 3, "SIGNATURE", "TEXT");
        COLUMN_SIGNATURE = c0vqt4;
        C0VQT c0vqt5 = new C0VQT("COLUMN_AVATAR_THUMB", 4, "AVATAR_THUMB", "TEXT");
        COLUMN_AVATAR_THUMB = c0vqt5;
        C0VQT c0vqt6 = new C0VQT("COLUMN_FOLLOW_STATUS", 5, "FOLLOW_STATUS", "INTEGER NOT NULL");
        COLUMN_FOLLOW_STATUS = c0vqt6;
        C0VQT c0vqt7 = new C0VQT("COLUMN_UNIQUE_ID", 6, "UNIQUE_ID", "TEXT");
        COLUMN_UNIQUE_ID = c0vqt7;
        C0VQT c0vqt8 = new C0VQT("COLUMN_WEIBO_VERIFY", 7, "WEIBO_VERIFY", "TEXT");
        COLUMN_WEIBO_VERIFY = c0vqt8;
        C0VQT c0vqt9 = new C0VQT("COLUMN_CUSTOM_VERIFY", 8, "CUSTOM_VERIFY", "TEXT");
        COLUMN_CUSTOM_VERIFY = c0vqt9;
        C0VQT c0vqt10 = new C0VQT("COLUMN_ENTERPRISE_VERIFY_REASON", 9, "ENTERPRISE_VERIFY_REASON", "TEXT");
        COLUMN_ENTERPRISE_VERIFY_REASON = c0vqt10;
        C0VQT c0vqt11 = new C0VQT("COLUMN_VERIFICATION_TYPE", 10, "VERIFICATION_TYPE", "TEXT");
        COLUMN_VERIFICATION_TYPE = c0vqt11;
        C0VQT c0vqt12 = new C0VQT("COLUMN_REMARK_NAME", 11, "REMARK_NAME", "TEXT");
        COLUMN_REMARK_NAME = c0vqt12;
        C0VQT c0vqt13 = new C0VQT("COLUMN_SORT_WEIGHT", 12, "SORT_WEIGHT", "TEXT");
        COLUMN_SORT_WEIGHT = c0vqt13;
        C0VQT c0vqt14 = new C0VQT("COLUMN_INITIAL_LETTER", 13, "INITIAL_LETTER", "TEXT");
        COLUMN_INITIAL_LETTER = c0vqt14;
        C0VQT c0vqt15 = new C0VQT("COLUMN_SHORT_ID", 14, "SHORT_ID", "TEXT");
        COLUMN_SHORT_ID = c0vqt15;
        C0VQT c0vqt16 = new C0VQT("COLUMN_REMARK_PINYIN", 15, "REMARK_PINYIN", "TEXT");
        COLUMN_REMARK_PINYIN = c0vqt16;
        C0VQT c0vqt17 = new C0VQT("COLUMN_REMARK_INITIAL", 16, "REMARK_INITIAL", "TEXT");
        COLUMN_REMARK_INITIAL = c0vqt17;
        C0VQT c0vqt18 = new C0VQT("COLUMN_NICK_NAME_PINYIN", 17, "NICK_NAME_PINYIN", "TEXT");
        COLUMN_NICK_NAME_PINYIN = c0vqt18;
        C0VQT c0vqt19 = new C0VQT("COLUMN_NICK_NAME_INITIAL", 18, "NICK_NAME_INITIAL", "TEXT");
        COLUMN_NICK_NAME_INITIAL = c0vqt19;
        C0VQT c0vqt20 = new C0VQT("COLUMN_COMMERCE_USER_LEVEL", 19, "COMMERCE_USER_LEVEL", "INTEGER");
        COLUMN_COMMERCE_USER_LEVEL = c0vqt20;
        C0VQT c0vqt21 = new C0VQT("COLUMN_CONTACT_NAME", 20, "COLUMN_CONTACT_NAME", "TEXT");
        COLUMN_CONTACT_NAME = c0vqt21;
        C0VQT c0vqt22 = new C0VQT("COLUMN_CONTACT_NAME_PINYIN", 21, "COLUMN_CONTACT_NAME_PINYIN", "TEXT");
        COLUMN_CONTACT_NAME_PINYIN = c0vqt22;
        C0VQT c0vqt23 = new C0VQT("COLUMN_CONTACT_NAME_INITIAL", 22, "COLUMN_CONTACT_NAME_INITIAL", "TEXT");
        COLUMN_CONTACT_NAME_INITIAL = c0vqt23;
        C0VQT c0vqt24 = new C0VQT("COLUMN_USER_SHARE_STATUS", 23, "COLUMN_USER_SHARE_STATUS", "INTEGER");
        COLUMN_USER_SHARE_STATUS = c0vqt24;
        C0VQT c0vqt25 = new C0VQT("COLUMN_USER_FRIEND_REC_TYPE", 24, "USER_FRIEND_REC_TYPE", "INTEGER");
        COLUMN_USER_FRIEND_REC_TYPE = c0vqt25;
        C0VQT c0vqt26 = new C0VQT("COLUMN_USER_FRIEND_REC_TIME", 25, "USER_FRIEND_REC_TIME", "INTEGER");
        COLUMN_USER_FRIEND_REC_TIME = c0vqt26;
        C0VQT c0vqt27 = new C0VQT("COLUMN_USER_REC_TYPE", 26, "REC_TYPE", "TEXT");
        COLUMN_USER_REC_TYPE = c0vqt27;
        C0VQT c0vqt28 = new C0VQT("COLUMN_RECOMMEND_REASON", 27, "RECOMMEND_REASON", "TEXT");
        COLUMN_RECOMMEND_REASON = c0vqt28;
        C0VQT c0vqt29 = new C0VQT("COLUMN_USER_FOLLOW_TIME", 28, "USER_FOLLOW_TIME", "INTEGER");
        COLUMN_USER_FOLLOW_TIME = c0vqt29;
        C0VQT c0vqt30 = new C0VQT("COLUMN_BLOCK_STATUS", 29, "BLOCK_STATUS", "INTEGER");
        COLUMN_BLOCK_STATUS = c0vqt30;
        C0VQT c0vqt31 = new C0VQT("COLUMN_MENTION_ENABLED", 30, "MENTION_ENABLED", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_MENTION_ENABLED = c0vqt31;
        C0VQT c0vqt32 = new C0VQT("COLUMN_COMMENT_MENTION_BLOCK_STATUS", 31, "COMMENT_MENTION_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_COMMENT_MENTION_BLOCK_STATUS = c0vqt32;
        C0VQT c0vqt33 = new C0VQT("COLUMN_VIDEO_MENTION_BLOCK_STATUS", 32, "VIDEO_MENTION_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_VIDEO_MENTION_BLOCK_STATUS = c0vqt33;
        C0VQT c0vqt34 = new C0VQT("COLUMN_VIDEO_TAG_BLOCK_STATUS", 33, "VIDEO_TAG_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_VIDEO_TAG_BLOCK_STATUS = c0vqt34;
        C0VQT c0vqt35 = new C0VQT("COLUMN_QA_INVITE_BLOCK_STATUS", 34, "QA_INVITE_BLOCK_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_QA_INVITE_BLOCK_STATUS = c0vqt35;
        C0VQT c0vqt36 = new C0VQT("COLUMN_FOLLOWER_STATUS", 35, "FOLLOWER_STATUS", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWER_STATUS = c0vqt36;
        C0VQT c0vqt37 = new C0VQT("COLUMN_ACCOUNT_TYPE", 36, "ACCOUNT_TYPE", "INTEGER");
        COLUMN_ACCOUNT_TYPE = c0vqt37;
        C0VQT c0vqt38 = new C0VQT("COLUMN_FOLLOWER_COUNT", 37, "FOLLOWER_COUNT", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWER_COUNT = c0vqt38;
        C0VQT c0vqt39 = new C0VQT("COLUMN_FOLLOWING_COUNT", 38, "FOLLOWING_COUNT", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_FOLLOWING_COUNT = c0vqt39;
        C0VQT c0vqt40 = new C0VQT("COLUMN_INTERNAL_SHARE_VERSION", 39, "INTERNAL_SHARE_HOLD_OUT_VERSION", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_INTERNAL_SHARE_VERSION = c0vqt40;
        C0VQT c0vqt41 = new C0VQT("COLUMN_AVATAR_MEDIUM", 40, "AVATAR_MEDIUM", "TEXT");
        COLUMN_AVATAR_MEDIUM = c0vqt41;
        C0VQT c0vqt42 = new C0VQT("MUTUAL_RELATION", 41, "MUTUAL_RELATION", "TEXT");
        MUTUAL_RELATION = c0vqt42;
        C0VQT c0vqt43 = new C0VQT("FRIEND_TYPE_STR", 42, "FRIEND_TYPE_STR", "TEXT");
        FRIEND_TYPE_STR = c0vqt43;
        C0VQT c0vqt44 = new C0VQT("REQUEST_ID", 43, "REQUEST_ID", "TEXT");
        REQUEST_ID = c0vqt44;
        C0VQT c0vqt45 = new C0VQT("SOCIAL_INFO", 44, "SOCIAL_INFO", "TEXT");
        SOCIAL_INFO = c0vqt45;
        C0VQT c0vqt46 = new C0VQT("COLUMN_IS_PRIVATE_ACCOUNT", 45, "IS_PRIVATE_ACCOUNT", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_IS_PRIVATE_ACCOUNT = c0vqt46;
        C0VQT[] c0vqtArr = {c0vqt, c0vqt2, c0vqt3, c0vqt4, c0vqt5, c0vqt6, c0vqt7, c0vqt8, c0vqt9, c0vqt10, c0vqt11, c0vqt12, c0vqt13, c0vqt14, c0vqt15, c0vqt16, c0vqt17, c0vqt18, c0vqt19, c0vqt20, c0vqt21, c0vqt22, c0vqt23, c0vqt24, c0vqt25, c0vqt26, c0vqt27, c0vqt28, c0vqt29, c0vqt30, c0vqt31, c0vqt32, c0vqt33, c0vqt34, c0vqt35, c0vqt36, c0vqt37, c0vqt38, c0vqt39, c0vqt40, c0vqt41, c0vqt42, c0vqt43, c0vqt44, c0vqt45, c0vqt46};
        LL = c0vqtArr;
        LLILLJJLI = new C2254308sP(c0vqtArr);
    }

    public static C0VQT[] values() {
        return (C0VQT[]) LL.clone();
    }

    public static C0VQT valueOf(String str) {
        return (C0VQT) C08FF.LIZ(C0VQT.class, str);
    }

    public C0VQT(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
