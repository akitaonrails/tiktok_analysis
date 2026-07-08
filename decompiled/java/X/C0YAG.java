package X;

/* JADX INFO: renamed from: X.0YAG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YAG {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_MIN_INDEX("min_index", "INTEGER"),
    COLUMN_READ_INDEX("read_index", "INTEGER"),
    COLUMN_READ_ORDER("read_order", "INTEGER");

    public String key;
    public String type;

    public static C0YAG valueOf(String str) {
        return (C0YAG) C08FF.LIZ(C0YAG.class, str);
    }

    C0YAG(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
