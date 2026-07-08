package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0YA0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YA0 {
    COLUMN_UUID("uuid", "TEXT NOT NULL"),
    COLUMN_LOCAL_URI("local_uri", "TEXT"),
    COLUMN_REMOTE_URI("remote_uri", "TEXT"),
    COLUMN_SIZE("size", "BIGINT"),
    COLUMN_TYPE("type", "TEXT"),
    COLUMN_HASH("hash", "TEXT"),
    COLUMN_INDEX("position", "INTEGER"),
    COLUMN_STATUS(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
    COLUMN_MIME_TYPE("mime_type", "TEXT"),
    COLUMN_UPLOAD_URI("upload_uri", "TEXT"),
    COLUMN_MEDIA_TYPE("media_type", "INTEGER"),
    COLUMN_MEDIA_URL_STRUCT("media_url_struct", "BLOB");

    public String key;
    public String type;

    public static C0YA0 valueOf(String str) {
        return (C0YA0) C08FF.LIZ(C0YA0.class, str);
    }

    C0YA0(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
