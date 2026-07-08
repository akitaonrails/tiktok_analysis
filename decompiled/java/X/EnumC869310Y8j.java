package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869310Y8j {
    public static final EnumC869310Y8j COLUMN_BADGE_COUNT;
    public static final EnumC869310Y8j COLUMN_BADGE_VERSION;
    public static final EnumC869310Y8j COLUMN_BIZ_EXT;
    public static final EnumC869310Y8j COLUMN_CONVERSATION_TYPE;
    public static final EnumC869310Y8j COLUMN_CONV_RANK_VERSION;
    public static final EnumC869310Y8j COLUMN_DRAFT_CONTENT;
    public static final EnumC869310Y8j COLUMN_DRAFT_TIME;
    public static final EnumC869310Y8j COLUMN_FAKE_UNREAD_COUNT;
    public static final EnumC869310Y8j COLUMN_HAS_MORE;
    public static final EnumC869310Y8j COLUMN_ID;
    public static final EnumC869310Y8j COLUMN_INBOX;
    public static final EnumC869310Y8j COLUMN_IS_IN_BOX;
    public static final EnumC869310Y8j COLUMN_IS_MEMBER;
    public static final EnumC869310Y8j COLUMN_LAST_MSG_INDEX;
    public static final EnumC869310Y8j COLUMN_LAST_MSG_ORDER_INDEX;
    public static final EnumC869310Y8j COLUMN_LAST_MSG_UUID;
    public static final EnumC869310Y8j COLUMN_LOCAL_INFO;
    public static final EnumC869310Y8j COLUMN_MAX_INDEX_V2;
    public static final EnumC869310Y8j COLUMN_MEMBER_COUNT;
    public static final EnumC869310Y8j COLUMN_MIN_INDEX;
    public static final EnumC869310Y8j COLUMN_MIN_INDEX_V2;
    public static final EnumC869310Y8j COLUMN_PARTICIPANT;
    public static final EnumC869310Y8j COLUMN_READ_BADGE_COUNT;
    public static final EnumC869310Y8j COLUMN_READ_INDEX;
    public static final EnumC869310Y8j COLUMN_READ_INDEX_V2;
    public static final EnumC869310Y8j COLUMN_RISKY;
    public static final EnumC869310Y8j COLUMN_SHORT_ID;
    public static final EnumC869310Y8j COLUMN_SORT_ORDER;
    public static final EnumC869310Y8j COLUMN_STATUS;
    public static final EnumC869310Y8j COLUMN_STRANGER;
    public static final EnumC869310Y8j COLUMN_UNREAD_COUNT;
    public static final EnumC869310Y8j COLUMN_UPDATE_TIME;
    public static final /* synthetic */ EnumC869310Y8j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<EnumC869310Y8j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC869310Y8j enumC869310Y8j = new EnumC869310Y8j("COLUMN_ID", 0, "conversation_id", "TEXT PRIMARY KEY");
        COLUMN_ID = enumC869310Y8j;
        EnumC869310Y8j enumC869310Y8j2 = new EnumC869310Y8j("COLUMN_SHORT_ID", 1, "short_id", "BIGINT");
        COLUMN_SHORT_ID = enumC869310Y8j2;
        EnumC869310Y8j enumC869310Y8j3 = new EnumC869310Y8j("COLUMN_CONVERSATION_TYPE", 2, "type", "INTEGER");
        COLUMN_CONVERSATION_TYPE = enumC869310Y8j3;
        EnumC869310Y8j enumC869310Y8j4 = new EnumC869310Y8j("COLUMN_LAST_MSG_INDEX", 3, "last_msg_index", "BIGINT");
        COLUMN_LAST_MSG_INDEX = enumC869310Y8j4;
        EnumC869310Y8j enumC869310Y8j5 = new EnumC869310Y8j("COLUMN_LAST_MSG_UUID", 4, "last_msg_uuid", "TEXT");
        COLUMN_LAST_MSG_UUID = enumC869310Y8j5;
        EnumC869310Y8j enumC869310Y8j6 = new EnumC869310Y8j("COLUMN_UPDATE_TIME", 5, "updated_time", "INTEGER");
        COLUMN_UPDATE_TIME = enumC869310Y8j6;
        EnumC869310Y8j enumC869310Y8j7 = new EnumC869310Y8j("COLUMN_UNREAD_COUNT", 6, "unread_count", "INTEGER");
        COLUMN_UNREAD_COUNT = enumC869310Y8j7;
        EnumC869310Y8j enumC869310Y8j8 = new EnumC869310Y8j("COLUMN_FAKE_UNREAD_COUNT", 7, "fake_unread_count", "INTEGER");
        COLUMN_FAKE_UNREAD_COUNT = enumC869310Y8j8;
        EnumC869310Y8j enumC869310Y8j9 = new EnumC869310Y8j("COLUMN_READ_INDEX", 8, "read_index", "BIGINT");
        COLUMN_READ_INDEX = enumC869310Y8j9;
        EnumC869310Y8j enumC869310Y8j10 = new EnumC869310Y8j("COLUMN_INBOX", 9, "inbox", "INTEGER");
        COLUMN_INBOX = enumC869310Y8j10;
        EnumC869310Y8j enumC869310Y8j11 = new EnumC869310Y8j("COLUMN_MIN_INDEX", 10, "min_index", "BIGINT");
        COLUMN_MIN_INDEX = enumC869310Y8j11;
        EnumC869310Y8j enumC869310Y8j12 = new EnumC869310Y8j("COLUMN_DRAFT_TIME", 11, "drafted_time", "INTEGER");
        COLUMN_DRAFT_TIME = enumC869310Y8j12;
        EnumC869310Y8j enumC869310Y8j13 = new EnumC869310Y8j("COLUMN_DRAFT_CONTENT", 12, "draft_content", "TEXT");
        COLUMN_DRAFT_CONTENT = enumC869310Y8j13;
        EnumC869310Y8j enumC869310Y8j14 = new EnumC869310Y8j("COLUMN_LOCAL_INFO", 13, "local_info", "TEXT");
        COLUMN_LOCAL_INFO = enumC869310Y8j14;
        EnumC869310Y8j enumC869310Y8j15 = new EnumC869310Y8j("COLUMN_IS_MEMBER", 14, "is_member", "INTEGER");
        COLUMN_IS_MEMBER = enumC869310Y8j15;
        EnumC869310Y8j enumC869310Y8j16 = new EnumC869310Y8j("COLUMN_HAS_MORE", 15, "has_more", "INTEGER");
        COLUMN_HAS_MORE = enumC869310Y8j16;
        EnumC869310Y8j enumC869310Y8j17 = new EnumC869310Y8j("COLUMN_MEMBER_COUNT", 16, "member_count", "INTEGER");
        COLUMN_MEMBER_COUNT = enumC869310Y8j17;
        EnumC869310Y8j enumC869310Y8j18 = new EnumC869310Y8j("COLUMN_STATUS", 17, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "INTEGER");
        COLUMN_STATUS = enumC869310Y8j18;
        EnumC869310Y8j enumC869310Y8j19 = new EnumC869310Y8j("COLUMN_PARTICIPANT", 18, "participant", "TEXT");
        COLUMN_PARTICIPANT = enumC869310Y8j19;
        EnumC869310Y8j enumC869310Y8j20 = new EnumC869310Y8j("COLUMN_LAST_MSG_ORDER_INDEX", 19, "last_msg_order_index", "BIGINT");
        COLUMN_LAST_MSG_ORDER_INDEX = enumC869310Y8j20;
        EnumC869310Y8j enumC869310Y8j21 = new EnumC869310Y8j("COLUMN_STRANGER", 20, "stranger", "INTEGER default 0");
        COLUMN_STRANGER = enumC869310Y8j21;
        EnumC869310Y8j enumC869310Y8j22 = new EnumC869310Y8j("COLUMN_RISKY", 21, "stranger_request_filtered", "INTEGER default 0");
        COLUMN_RISKY = enumC869310Y8j22;
        EnumC869310Y8j enumC869310Y8j23 = new EnumC869310Y8j("COLUMN_SORT_ORDER", 22, "sort_order", "INTEGER");
        COLUMN_SORT_ORDER = enumC869310Y8j23;
        EnumC869310Y8j enumC869310Y8j24 = new EnumC869310Y8j("COLUMN_MIN_INDEX_V2", 23, "min_index_v2", "BIGINT");
        COLUMN_MIN_INDEX_V2 = enumC869310Y8j24;
        EnumC869310Y8j enumC869310Y8j25 = new EnumC869310Y8j("COLUMN_MAX_INDEX_V2", 24, "max_index_v2", "BIGINT");
        COLUMN_MAX_INDEX_V2 = enumC869310Y8j25;
        EnumC869310Y8j enumC869310Y8j26 = new EnumC869310Y8j("COLUMN_READ_INDEX_V2", 25, "read_index_v2", "BIGINT");
        COLUMN_READ_INDEX_V2 = enumC869310Y8j26;
        EnumC869310Y8j enumC869310Y8j27 = new EnumC869310Y8j("COLUMN_BADGE_COUNT", 26, "badge_count", "INTEGER");
        COLUMN_BADGE_COUNT = enumC869310Y8j27;
        EnumC869310Y8j enumC869310Y8j28 = new EnumC869310Y8j("COLUMN_READ_BADGE_COUNT", 27, "read_badge_count", "INTEGER");
        COLUMN_READ_BADGE_COUNT = enumC869310Y8j28;
        EnumC869310Y8j enumC869310Y8j29 = new EnumC869310Y8j("COLUMN_IS_IN_BOX", 28, "is_in_box", "INTEGER DEFAULT 0");
        COLUMN_IS_IN_BOX = enumC869310Y8j29;
        EnumC869310Y8j enumC869310Y8j30 = new EnumC869310Y8j("COLUMN_BIZ_EXT", 29, "biz_ext", "BLOB");
        COLUMN_BIZ_EXT = enumC869310Y8j30;
        EnumC869310Y8j enumC869310Y8j31 = new EnumC869310Y8j("COLUMN_BADGE_VERSION", 30, "badge_version", "BIGINT DEFAULT 0");
        COLUMN_BADGE_VERSION = enumC869310Y8j31;
        EnumC869310Y8j enumC869310Y8j32 = new EnumC869310Y8j("COLUMN_CONV_RANK_VERSION", 31, "conv_rank_version", "BIGINT DEFAULT 0");
        COLUMN_CONV_RANK_VERSION = enumC869310Y8j32;
        EnumC869310Y8j[] enumC869310Y8jArr = {enumC869310Y8j, enumC869310Y8j2, enumC869310Y8j3, enumC869310Y8j4, enumC869310Y8j5, enumC869310Y8j6, enumC869310Y8j7, enumC869310Y8j8, enumC869310Y8j9, enumC869310Y8j10, enumC869310Y8j11, enumC869310Y8j12, enumC869310Y8j13, enumC869310Y8j14, enumC869310Y8j15, enumC869310Y8j16, enumC869310Y8j17, enumC869310Y8j18, enumC869310Y8j19, enumC869310Y8j20, enumC869310Y8j21, enumC869310Y8j22, enumC869310Y8j23, enumC869310Y8j24, enumC869310Y8j25, enumC869310Y8j26, enumC869310Y8j27, enumC869310Y8j28, enumC869310Y8j29, enumC869310Y8j30, enumC869310Y8j31, enumC869310Y8j32};
        LL = enumC869310Y8jArr;
        LLILLJJLI = new C2254308sP(enumC869310Y8jArr);
    }

    public static EnumC869310Y8j[] values() {
        return (EnumC869310Y8j[]) LL.clone();
    }

    public static EnumC869310Y8j valueOf(String str) {
        return (EnumC869310Y8j) C08FF.LIZ(EnumC869310Y8j.class, str);
    }

    public EnumC869310Y8j(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
