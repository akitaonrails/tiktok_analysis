package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0Y9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869700Y9w {
    COLUMN_MSG_UUID("msg_uuid", "TEXT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_KEY("key", "TEXT"),
    COLUMN_IDEMPOTENT_ID("idempotent_id", "TEXT"),
    COLUMN_SENDER("sender", "INTEGER"),
    COLUMN_SENDER_SEC("sender_sec", "TEXT"),
    COLUMN_CREATE_TIME("create_time", "INTEGER"),
    COLUMN_VALUE("value", "TEXT"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_VERSION("version", "INTEGER"),
    COLUMN_STATUS(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "INTEGER"),
    COLUMN_CREATE_TIME_V2("create_time_v2", "INTEGER"),
    COLUMN_URL("url", "TEXT"),
    COLUMN_BIZ_EXTRA("biz_extra", "BLOB");

    public final String key;
    public final String type;

    public static EnumC869700Y9w valueOf(String str) {
        return (EnumC869700Y9w) C08FF.LIZ(EnumC869700Y9w.class, str);
    }

    EnumC869700Y9w(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
