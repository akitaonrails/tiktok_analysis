package X;

/* JADX INFO: renamed from: X.0Y8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869340Y8m {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_STICK_TOP("stick_top", "INTEGER"),
    COLUMN_MUTE("mute", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_FAVORITE("favor", "INTEGER"),
    COLUMN_SET_TOP_TIME("set_top_time", "BIGINT"),
    COLUMN_SET_FAVORITE_TIME("set_favorite_time", "BIGINT"),
    COLUMN_CATEGORY("user_set_category", "INTEGER DEFAULT 0"),
    COLUMN_CONVERSATION_TAGS("conversation_tags", "TEXT"),
    COLUMN_BIZ_SETTING_PERSISTENT_EXTRA("biz_setting_persistent_extra", "BLOB");

    public String key;
    public String type;

    public static EnumC869340Y8m valueOf(String str) {
        return (EnumC869340Y8m) C08FF.LIZ(EnumC869340Y8m.class, str);
    }

    EnumC869340Y8m(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
