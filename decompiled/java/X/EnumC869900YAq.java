package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869900YAq {
    public static final EnumC869900YAq COLUMN_CREATE_TIME;
    public static final EnumC869900YAq COLUMN_INBOX_TYPE;
    public static final EnumC869900YAq COLUMN_INSERTION_TIME;
    public static final EnumC869900YAq COLUMN_REQUEST_BODY;
    public static final EnumC869900YAq COLUMN_REQUEST_CMD;
    public static final EnumC869900YAq COLUMN_REQUEST_ID;
    public static final EnumC869900YAq COLUMN_RETRY_COUNT;
    public static final /* synthetic */ EnumC869900YAq[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC869900YAq> getEntries() {
        return LLILZ;
    }

    static {
        EnumC869900YAq enumC869900YAq = new EnumC869900YAq("COLUMN_REQUEST_ID", 0, "req_id", "TEXT PRIMARY KEY");
        COLUMN_REQUEST_ID = enumC869900YAq;
        EnumC869900YAq enumC869900YAq2 = new EnumC869900YAq("COLUMN_REQUEST_CMD", 1, "req_cmd", "INTEGER");
        COLUMN_REQUEST_CMD = enumC869900YAq2;
        EnumC869900YAq enumC869900YAq3 = new EnumC869900YAq("COLUMN_INBOX_TYPE", 2, "inbox_type", "INTEGER NOT NULL");
        COLUMN_INBOX_TYPE = enumC869900YAq3;
        EnumC869900YAq enumC869900YAq4 = new EnumC869900YAq("COLUMN_REQUEST_BODY", 3, "req_body", "BLOB");
        COLUMN_REQUEST_BODY = enumC869900YAq4;
        EnumC869900YAq enumC869900YAq5 = new EnumC869900YAq("COLUMN_INSERTION_TIME", 4, "insertion_time", "INTEGER NOT NULL");
        COLUMN_INSERTION_TIME = enumC869900YAq5;
        EnumC869900YAq enumC869900YAq6 = new EnumC869900YAq("COLUMN_CREATE_TIME", 5, "create_time", "INTEGER NOT NULL");
        COLUMN_CREATE_TIME = enumC869900YAq6;
        EnumC869900YAq enumC869900YAq7 = new EnumC869900YAq("COLUMN_RETRY_COUNT", 6, "retry_count", "INTEGER DEFAULT 0");
        COLUMN_RETRY_COUNT = enumC869900YAq7;
        EnumC869900YAq[] enumC869900YAqArr = {enumC869900YAq, enumC869900YAq2, enumC869900YAq3, enumC869900YAq4, enumC869900YAq5, enumC869900YAq6, enumC869900YAq7};
        LLILLL = enumC869900YAqArr;
        LLILZ = new C2254308sP(enumC869900YAqArr);
    }

    public static EnumC869900YAq[] values() {
        return (EnumC869900YAq[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC869900YAq valueOf(String str) {
        return (EnumC869900YAq) C08FF.LIZ(EnumC869900YAq.class, str);
    }

    public EnumC869900YAq(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
