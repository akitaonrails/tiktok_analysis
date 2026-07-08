package X;

/* JADX INFO: renamed from: X.0Y8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869330Y8l {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_NAME("name", "TEXT"),
    COLUMN_DESC("desc", "TEXT"),
    COLUMN_ICON("icon", "TEXT"),
    COLUMN_NOTICE("notice", "TEXT"),
    COLUMN_CREATOR_ID("creator_id", "INTEGER DEFAULT -1"),
    COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
    COLUMN_FIRST_MESSAGE_TIMESTAMP("first_message_timestamp", "BIGINT"),
    COLUMN_SEC_OWNER("sec_owner", "TEXT"),
    COLUMN_SILENT("silent", "INTEGER DEFAULT 0"),
    COLUMN_SILENT_NORMAL_ONLY("silent_normal_only", "INTEGER DEFAULT 0"),
    COLUMN_MODE("mode", "INTEGER DEFAULT -1"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_BIZ_CORE_PERSISTENT_EXTRA("biz_core_persistent_extra", "BLOB"),
    COLUMN_MEMBER_REGIONS("member_regions", "TEXT");

    public String key;
    public String type;

    public static EnumC869330Y8l valueOf(String str) {
        return (EnumC869330Y8l) C08FF.LIZ(EnumC869330Y8l.class, str);
    }

    EnumC869330Y8l(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
