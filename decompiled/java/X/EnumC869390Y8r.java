package X;

/* JADX INFO: renamed from: X.0Y8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869390Y8r {
    COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_IDS_STR("ids_str", "TEXT"),
    COLUMN_SENDER_ID("sender_id", "BIGINT"),
    COLUMN_CREATED_TIME("created_time", "INTEGER");

    public String key;
    public String type;

    public static EnumC869390Y8r valueOf(String str) {
        return (EnumC869390Y8r) C08FF.LIZ(EnumC869390Y8r.class, str);
    }

    EnumC869390Y8r(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
