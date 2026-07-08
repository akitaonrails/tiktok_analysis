package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQS {
    public static final C0VQS COLUMN_AVATAR_MEDIUM;
    public static final C0VQS COLUMN_AVATAR_THUMB;
    public static final C0VQS COLUMN_BLOCK;
    public static final C0VQS COLUMN_BLOCKED_BY;
    public static final C0VQS COLUMN_DELETED;
    public static final C0VQS COLUMN_ENTERPRISE_USER_VERIFY_REASON;
    public static final C0VQS COLUMN_EXTRA;
    public static final C0VQS COLUMN_FOLLOWER_COUNT;
    public static final C0VQS COLUMN_FOLLOWER_STATUS;
    public static final C0VQS COLUMN_FOLLOWING_COUNT;
    public static final C0VQS COLUMN_FOLLOW_STATUS;
    public static final C0VQS COLUMN_INITIAL_LETTER;
    public static final C0VQS COLUMN_MAF_STATUS;
    public static final C0VQS COLUMN_NICK_NAME;
    public static final C0VQS COLUMN_RECOMMEND_REASON;
    public static final C0VQS COLUMN_REC_TYPE;
    public static final C0VQS COLUMN_SORT_WEIGHT;
    public static final C0VQS COLUMN_UID;
    public static final C0VQS COLUMN_UNIQUE_ID;
    public static final C0VQS COLUMN_UPDATE_TIME;
    public static final C0VQS COLUMN_USER_VERIFY_REASON;
    public static final C0VQS COLUMN_USER_VERIFY_TYPE;
    public static final /* synthetic */ C0VQS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<C0VQS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VQS c0vqs = new C0VQS("COLUMN_UID", 0, "UID", "INTEGER PRIMARY KEY NOT NULL DEFAULT 0");
        COLUMN_UID = c0vqs;
        C0VQS c0vqs2 = new C0VQS("COLUMN_AVATAR_THUMB", 1, "AVATAR_THUMB", "TEXT");
        COLUMN_AVATAR_THUMB = c0vqs2;
        C0VQS c0vqs3 = new C0VQS("COLUMN_AVATAR_MEDIUM", 2, "AVATAR_MEDIUM", "TEXT");
        COLUMN_AVATAR_MEDIUM = c0vqs3;
        C0VQS c0vqs4 = new C0VQS("COLUMN_NICK_NAME", 3, "NICK_NAME", "TEXT");
        COLUMN_NICK_NAME = c0vqs4;
        C0VQS c0vqs5 = new C0VQS("COLUMN_UNIQUE_ID", 4, "UNIQUE_ID", "TEXT");
        COLUMN_UNIQUE_ID = c0vqs5;
        C0VQS c0vqs6 = new C0VQS("COLUMN_FOLLOW_STATUS", 5, "FOLLOW_STATUS", "INTEGER");
        COLUMN_FOLLOW_STATUS = c0vqs6;
        C0VQS c0vqs7 = new C0VQS("COLUMN_FOLLOWER_COUNT", 6, "FOLLOWER_COUNT", "INTEGER");
        COLUMN_FOLLOWER_COUNT = c0vqs7;
        C0VQS c0vqs8 = new C0VQS("COLUMN_FOLLOWING_COUNT", 7, "FOLLOWING_COUNT", "INTEGER");
        COLUMN_FOLLOWING_COUNT = c0vqs8;
        C0VQS c0vqs9 = new C0VQS("COLUMN_MAF_STATUS", 8, "MAF_STATUS", "INTEGER");
        COLUMN_MAF_STATUS = c0vqs9;
        C0VQS c0vqs10 = new C0VQS("COLUMN_REC_TYPE", 9, "REC_TYPE", "TEXT");
        COLUMN_REC_TYPE = c0vqs10;
        C0VQS c0vqs11 = new C0VQS("COLUMN_UPDATE_TIME", 10, "UPDATE_TIME", "INTEGER");
        COLUMN_UPDATE_TIME = c0vqs11;
        C0VQS c0vqs12 = new C0VQS("COLUMN_SORT_WEIGHT", 11, "SORT_WEIGHT", "TEXT");
        COLUMN_SORT_WEIGHT = c0vqs12;
        C0VQS c0vqs13 = new C0VQS("COLUMN_INITIAL_LETTER", 12, "INITIAL_LETTER", "TEXT");
        COLUMN_INITIAL_LETTER = c0vqs13;
        C0VQS c0vqs14 = new C0VQS("COLUMN_EXTRA", 13, "EXTRA", "TEXT");
        COLUMN_EXTRA = c0vqs14;
        C0VQS c0vqs15 = new C0VQS("COLUMN_FOLLOWER_STATUS", 14, "FOLLOWER_STATUS", "INTEGER");
        COLUMN_FOLLOWER_STATUS = c0vqs15;
        C0VQS c0vqs16 = new C0VQS("COLUMN_BLOCK", 15, "BLOCK", "INTEGER");
        COLUMN_BLOCK = c0vqs16;
        C0VQS c0vqs17 = new C0VQS("COLUMN_BLOCKED_BY", 16, "BLOCKED_BY", "INTEGER");
        COLUMN_BLOCKED_BY = c0vqs17;
        C0VQS c0vqs18 = new C0VQS("COLUMN_RECOMMEND_REASON", 17, "RECOMMEND_REASON", "TEXT");
        COLUMN_RECOMMEND_REASON = c0vqs18;
        C0VQS c0vqs19 = new C0VQS("COLUMN_ENTERPRISE_USER_VERIFY_REASON", 18, "ENTERPRISE_USER_VERIFY_REASON", "TEXT");
        COLUMN_ENTERPRISE_USER_VERIFY_REASON = c0vqs19;
        C0VQS c0vqs20 = new C0VQS("COLUMN_USER_VERIFY_REASON", 19, "USER_VERIFY_REASON", "TEXT");
        COLUMN_USER_VERIFY_REASON = c0vqs20;
        C0VQS c0vqs21 = new C0VQS("COLUMN_USER_VERIFY_TYPE", 20, "USER_VERIFY_TYPE", "INTEGER");
        COLUMN_USER_VERIFY_TYPE = c0vqs21;
        C0VQS c0vqs22 = new C0VQS("COLUMN_DELETED", 21, "DELETED", "INTEGER");
        COLUMN_DELETED = c0vqs22;
        C0VQS[] c0vqsArr = {c0vqs, c0vqs2, c0vqs3, c0vqs4, c0vqs5, c0vqs6, c0vqs7, c0vqs8, c0vqs9, c0vqs10, c0vqs11, c0vqs12, c0vqs13, c0vqs14, c0vqs15, c0vqs16, c0vqs17, c0vqs18, c0vqs19, c0vqs20, c0vqs21, c0vqs22};
        LL = c0vqsArr;
        LLILLJJLI = new C2254308sP(c0vqsArr);
    }

    public static C0VQS[] values() {
        return (C0VQS[]) LL.clone();
    }

    public static C0VQS valueOf(String str) {
        return (C0VQS) C08FF.LIZ(C0VQS.class, str);
    }

    public C0VQS(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
