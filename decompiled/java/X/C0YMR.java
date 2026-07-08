package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'REPORT_GET_MESSAGES_CURSOR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0YMR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMR implements WireEnum {
    public static final C0YMR ACK_CONVERSATION_APPLY;
    public static final C0YMR ACK_MESSAGE;
    public static final ProtoAdapter<C0YMR> ADAPTER;
    public static final C0YMR ADD_CONVERSATION_PARTICIPANTS;
    public static final C0YMR BATCH_ACK_MESSAGE;
    public static final C0YMR BATCH_DELETE_CONVERSATIONS;
    public static final C0YMR BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX;
    public static final C0YMR BATCH_GET_CONVERSATION_AUDIT_UNREAD;
    public static final C0YMR BATCH_GET_MESSAGES;
    public static final C0YMR BATCH_MARK_CONVERSATION_READ;
    public static final C0YMR BATCH_SET_CONVERSATION_SETTING_INFO;
    public static final C0YMR BATCH_UNMARK_MESSAGE;
    public static final C0YMR BATCH_UPDATE_CONVERSATION_PARTICIPANT;
    public static final C0YMR BIZ_DIRECT_PUSH_NOTIFY;
    public static final C0YMR BLOCK_CONVERSATION;
    public static final C0YMR BLOCK_MEMBERS;
    public static final C0YMR BROADCAST_RECV_MESSAGE;
    public static final C0YMR BROADCAST_SEND_MESSAGE;
    public static final C0YMR BROADCAST_USER_COUNTER;
    public static final C0YMR CALL_VOIP;
    public static final C0YMR CHECK_IN_BLOCKLIST;
    public static final C0YMR CHECK_MESSAGES_BY_USER;
    public static final C0YMR CHECK_STATUS_MESSAGES;
    public static final C0YMR CLEAR_CONVERSATION_AUDIT_UNREAD;
    public static final C0YMR CLIENT_ACK;
    public static final C0YMR CLIENT_BATCH_ACK;
    public static final C0YMR CONVERSATION_INFO_UPDATED_NOTIFY;
    public static final C0YMR CONVERSATION_MESSAGE_PRE_VIEW;
    public static final C0YMR CONVERSATION_MESSAGE_SEARCH;
    public static final C0YMR CONVERSATION_PARTICIPANTS_LIST;
    public static final C0YMR CONVERSATION_SET_ROLE;
    public static final C0YMR CREATE_CONVERSATION;
    public static final C0YMR CREATE_CONVERSATION_V2;
    public static final C0YMR CREATE_VOIP;
    public static final C0YMR DELETE_ALL_STRANGER_CONVERSATIONS;
    public static final C0YMR DELETE_FRIEND;
    public static final C0YMR DELETE_MESSAGE;
    public static final C0YMR DELETE_MULTI_STRANGER_CONVERSATIONS;
    public static final C0YMR DELETE_STRANGER_CONVERSATION;
    public static final C0YMR DELETE_STRANGER_MESSAGE;
    public static final C0YMR DISSOLVE_CONVERSATION;
    public static final C0YMR GET_BLOCKLIST;
    public static final C0YMR GET_CMD_MESSAGE;
    public static final C0YMR GET_CONFIGS;
    public static final C0YMR GET_CONVERSATIONS_CHECKINFO;
    public static final C0YMR GET_CONVERSATIONS_CHECK_INFO_V2;
    public static final C0YMR GET_CONVERSATION_APPLY;
    public static final C0YMR GET_CONVERSATION_AUDIT_LIST;
    public static final C0YMR GET_CONVERSATION_AUDIT_SWITCH;
    public static final C0YMR GET_CONVERSATION_AUDIT_UNREAD;
    public static final C0YMR GET_CONVERSATION_CORE_INFO;
    public static final C0YMR GET_CONVERSATION_CORE_INFO_LIST;
    public static final C0YMR GET_CONVERSATION_GROUP_LIST;
    public static final C0YMR GET_CONVERSATION_INFO;
    public static final C0YMR GET_CONVERSATION_INFO_LIST;
    public static final C0YMR GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2;
    public static final C0YMR GET_CONVERSATION_INFO_LIST_BY_TOP_V2;
    public static final C0YMR GET_CONVERSATION_INFO_LIST_V2;
    public static final C0YMR GET_CONVERSATION_INFO_V2;
    public static final C0YMR GET_CONVERSATION_LIST;
    public static final C0YMR GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3;
    public static final C0YMR GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3;
    public static final C0YMR GET_CONVERSATION_SETTING_INFO;
    public static final C0YMR GET_FRIEND_APPLY_LIST;
    public static final C0YMR GET_FRIEND_LIST;
    public static final C0YMR GET_FRIEND_RECEIVE_APPLY_LIST;
    public static final C0YMR GET_GROUP_INFO;
    public static final C0YMR GET_GROUP_INFO_LIST;
    public static final C0YMR GET_MEDIA_STATUS;
    public static final C0YMR GET_MEDIA_UPLOAD_CONFIG;
    public static final C0YMR GET_MEDIA_UPLOAD_TOKEN;
    public static final C0YMR GET_MEDIA_URLS;
    public static final C0YMR GET_MESSAGES;
    public static final C0YMR GET_MESSAGES_BY_CONVERSATION;
    public static final C0YMR GET_MESSAGES_BY_CONVERSATION_SEARCH;
    public static final C0YMR GET_MESSAGES_BY_CONVERSATION_WITH_RANGE;
    public static final C0YMR GET_MESSAGES_BY_USER;
    public static final C0YMR GET_MESSAGES_BY_USER_COMBO;
    public static final C0YMR GET_MESSAGES_BY_USER_INIT;
    public static final C0YMR GET_MESSAGES_BY_USER_INIT_V2;
    public static final C0YMR GET_MESSAGES_CHECKINFO_IN_CONVERSATION;
    public static final C0YMR GET_MESSAGES_CHECK_INFO_V2;
    public static final C0YMR GET_MESSAGE_BY_INIT;
    public static final C0YMR GET_MESSAGE_INFO_BY_INDEX_V2;
    public static final C0YMR GET_MESSAGE_INFO_BY_INDEX_V2_RANGE;
    public static final C0YMR GET_MESSAGE_INFO_BY_SERVER_ID;
    public static final C0YMR GET_MESSAGE_PREVIEW;
    public static final C0YMR GET_RECENT_MESSAGE;
    public static final C0YMR GET_STRANGER_CONVERSATION_LIST;
    public static final C0YMR GET_STRANGER_MESSAGES_IN_CONVERSATION;
    public static final C0YMR GET_STRANGER_UNREAD_COUNT;
    public static final C0YMR GET_TICKET;
    public static final C0YMR GET_UNREAD_COUNT;
    public static final C0YMR GET_USER_CONVERSATION_LIST;
    public static final C0YMR GLOBAL_GROUP_SEARCH;
    public static final C0YMR GLOBAL_MESSAGE_SEARCH;
    public static final C0YMR HEARTBEAT_CHANNEL;
    public static final C0YMR IMCMD_NOT_USED;
    public static final C0YMR JOIN_VOIP;
    public static final C0YMR LEAVE_CONVERSATION;
    public static final /* synthetic */ C0YMR[] LLILLJJLI;
    public static final C0YMR MARK_ALL_STRANGER_CONVERSATIONS_READ;
    public static final C0YMR MARK_CONVERSATION_DELETE;
    public static final C0YMR MARK_CONVERSATION_READ;
    public static final C0YMR MARK_CONVERSATION_READ_V3;
    public static final C0YMR MARK_MESSAGE;
    public static final C0YMR MARK_MSG_GET_UNREAD_COUNT;
    public static final C0YMR MARK_MSG_UNREAD_COUNT_REPORT;
    public static final C0YMR MARK_MULTI_STRANGER_CONVERSATIONS_READ;
    public static final C0YMR MARK_READ_NOTIFY;
    public static final C0YMR MARK_STRANGER_CONVERSATION_READ;
    public static final C0YMR MGET_CONVERSATION_PARTICIPANTS;
    public static final C0YMR MODIFY_MESSAGE_EXT;
    public static final C0YMR NEW_BROADCAST_CMD_MSG_NOTIFY;
    public static final C0YMR NEW_BROADCAST_MSG_NOTIFY;
    public static final C0YMR NEW_DIRECT_PUSH_NOTIFY;
    public static final C0YMR NEW_FRIEND_MSG_NOTIFY;
    public static final C0YMR NEW_INPUT_STATUS_NOTIFY;
    public static final C0YMR NEW_MSG_NOTIFY;
    public static final C0YMR NEW_PREVIEW_MSG_NOTIFY;
    public static final C0YMR PREFETCH_PREASSIGNED_CONVERSATION_IDS;
    public static final C0YMR PREVIEWER_GET_CONVERSATION_INFO_LIST;
    public static final C0YMR PREVIEWER_GET_MESSAGES_BY_CONVERSATION;
    public static final C0YMR PROFILE_BATCH_GET_INFO;
    public static final C0YMR PROFILE_GET_INFO;
    public static final C0YMR PROFILE_SEARCH_INFO;
    public static final C0YMR PULL_MARK_MESSAGE;
    public static final C0YMR REACTION_MESSAGE;
    public static final C0YMR RECALL_MESSAGE;
    public static final C0YMR REMOVE_CONVERSATION_PARTICIPANTS;
    public static final C0YMR REPLY_FRIEND_APPLY;
    public static final C0YMR REPORT_CLIENT_METRICS;
    public static final C0YMR REPORT_GET_MESSAGES_CURSOR;
    public static final C0YMR SEND_CLIENT_BACKGROUND;
    public static final C0YMR SEND_CLIENT_FOREGROUND;
    public static final C0YMR SEND_CONVERSATION_APPLY;
    public static final C0YMR SEND_FRIEND_APPLY;
    public static final C0YMR SEND_INPUT_STATUS;
    public static final C0YMR SEND_MESSAGE;
    public static final C0YMR SEND_MESSAGE_P2P;
    public static final C0YMR SEND_OFFLINE;
    public static final C0YMR SEND_ONLINE;
    public static final C0YMR SEND_USER_ACTION;
    public static final C0YMR SET_BLOCKLIST;
    public static final C0YMR SET_CONVERSATION_CORE_INFO;
    public static final C0YMR SET_CONVERSATION_INFO;
    public static final C0YMR SET_CONVERSATION_SETTING_INFO;
    public static final C0YMR SET_GROUP_INFO;
    public static final C0YMR SET_MESSAGE_PROPERTY;
    public static final C0YMR STRANGER_NEW_MSG_NOTIFY;
    public static final C0YMR SYNC_MESSAGE;
    public static final C0YMR UNREAD_COUNT_REPORT;
    public static final C0YMR UPDATE_CONVERSATION_AUDIT_SWITCH;
    public static final C0YMR UPDATE_CONVERSATION_PARTICIPANT;
    public static final C0YMR UPDATE_VOIP;
    public static final C0YMR UPSERT_CONVERSATION_CORE_EXT_INFO;
    public static final C0YMR UPSERT_CONVERSATION_SETTING_EXT_INFO;
    public static final C0YMR VCD_CLEAN;
    public final int LL;
    public final Boolean deprecated;

    static {
        C0YMR c0ymr = new C0YMR(0, 0, null, "IMCMD_NOT_USED");
        IMCMD_NOT_USED = c0ymr;
        C0YMR c0ymr2 = new C0YMR(1, 100, null, "SEND_MESSAGE");
        SEND_MESSAGE = c0ymr2;
        C0YMR c0ymr3 = new C0YMR(2, 200, null, "GET_MESSAGES_BY_USER");
        GET_MESSAGES_BY_USER = c0ymr3;
        C0YMR c0ymr4 = new C0YMR(3, 201, null, "GET_MESSAGES_BY_USER_INIT");
        GET_MESSAGES_BY_USER_INIT = c0ymr4;
        Boolean bool = Boolean.TRUE;
        C0YMR c0ymr5 = new C0YMR(4, 202, bool, "REPORT_GET_MESSAGES_CURSOR");
        REPORT_GET_MESSAGES_CURSOR = c0ymr5;
        C0YMR c0ymr6 = new C0YMR(5, 203, null, "GET_MESSAGES_BY_USER_INIT_V2");
        GET_MESSAGES_BY_USER_INIT_V2 = c0ymr6;
        C0YMR c0ymr7 = new C0YMR(6, 204, null, "GET_MESSAGES_BY_USER_COMBO");
        GET_MESSAGES_BY_USER_COMBO = c0ymr7;
        C0YMR c0ymr8 = new C0YMR(7, 206, null, "GET_MESSAGES_BY_CONVERSATION_SEARCH");
        GET_MESSAGES_BY_CONVERSATION_SEARCH = c0ymr8;
        C0YMR c0ymr9 = new C0YMR(8, 210, null, "CHECK_MESSAGES_BY_USER");
        CHECK_MESSAGES_BY_USER = c0ymr9;
        C0YMR c0ymr10 = new C0YMR(9, 211, bool, "GET_MESSAGE_INFO_BY_SERVER_ID");
        GET_MESSAGE_INFO_BY_SERVER_ID = c0ymr10;
        C0YMR c0ymr11 = new C0YMR(10, 212, null, "CHECK_STATUS_MESSAGES");
        CHECK_STATUS_MESSAGES = c0ymr11;
        C0YMR c0ymr12 = new C0YMR(11, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, bool, "GET_CONVERSATION_LIST");
        GET_CONVERSATION_LIST = c0ymr12;
        C0YMR c0ymr13 = new C0YMR(12, 301, null, "GET_MESSAGES_BY_CONVERSATION");
        GET_MESSAGES_BY_CONVERSATION = c0ymr13;
        C0YMR c0ymr14 = new C0YMR(13, 302, null, "GET_MESSAGES_CHECKINFO_IN_CONVERSATION");
        GET_MESSAGES_CHECKINFO_IN_CONVERSATION = c0ymr14;
        C0YMR c0ymr15 = new C0YMR(14, 303, null, "GET_MESSAGES_CHECK_INFO_V2");
        GET_MESSAGES_CHECK_INFO_V2 = c0ymr15;
        C0YMR c0ymr16 = new C0YMR(15, 304, null, "GET_MESSAGES_BY_CONVERSATION_WITH_RANGE");
        GET_MESSAGES_BY_CONVERSATION_WITH_RANGE = c0ymr16;
        C0YMR c0ymr17 = new C0YMR(16, 305, null, "GET_MESSAGE_PREVIEW");
        GET_MESSAGE_PREVIEW = c0ymr17;
        C0YMR c0ymr18 = new C0YMR(17, 400, bool, "SEND_ONLINE");
        SEND_ONLINE = c0ymr18;
        C0YMR c0ymr19 = new C0YMR(18, 401, bool, "SEND_OFFLINE");
        SEND_OFFLINE = c0ymr19;
        C0YMR c0ymr20 = new C0YMR(19, 402, bool, "SEND_CLIENT_FOREGROUND");
        SEND_CLIENT_FOREGROUND = c0ymr20;
        C0YMR c0ymr21 = new C0YMR(20, 403, bool, "SEND_CLIENT_BACKGROUND");
        SEND_CLIENT_BACKGROUND = c0ymr21;
        C0YMR c0ymr22 = new C0YMR(21, 410, bool, "SEND_USER_ACTION");
        SEND_USER_ACTION = c0ymr22;
        C0YMR c0ymr23 = new C0YMR(22, 411, null, "SEND_INPUT_STATUS");
        SEND_INPUT_STATUS = c0ymr23;
        C0YMR c0ymr24 = new C0YMR(23, 500, null, "NEW_MSG_NOTIFY");
        NEW_MSG_NOTIFY = c0ymr24;
        C0YMR c0ymr25 = new C0YMR(24, 501, null, "MARK_READ_NOTIFY");
        MARK_READ_NOTIFY = c0ymr25;
        C0YMR c0ymr26 = new C0YMR(25, 502, bool, "CONVERSATION_INFO_UPDATED_NOTIFY");
        CONVERSATION_INFO_UPDATED_NOTIFY = c0ymr26;
        C0YMR c0ymr27 = new C0YMR(26, 504, null, "NEW_DIRECT_PUSH_NOTIFY");
        NEW_DIRECT_PUSH_NOTIFY = c0ymr27;
        C0YMR c0ymr28 = new C0YMR(27, 510, null, "NEW_INPUT_STATUS_NOTIFY");
        NEW_INPUT_STATUS_NOTIFY = c0ymr28;
        C0YMR c0ymr29 = new C0YMR(28, 505, bool, "NEW_BROADCAST_MSG_NOTIFY");
        NEW_BROADCAST_MSG_NOTIFY = c0ymr29;
        C0YMR c0ymr30 = new C0YMR(29, 506, bool, "NEW_BROADCAST_CMD_MSG_NOTIFY");
        NEW_BROADCAST_CMD_MSG_NOTIFY = c0ymr30;
        C0YMR c0ymr31 = new C0YMR(30, 507, bool, "NEW_PREVIEW_MSG_NOTIFY");
        NEW_PREVIEW_MSG_NOTIFY = c0ymr31;
        C0YMR c0ymr32 = new C0YMR(31, 508, bool, "NEW_FRIEND_MSG_NOTIFY");
        NEW_FRIEND_MSG_NOTIFY = c0ymr32;
        C0YMR c0ymr33 = new C0YMR(32, 511, null, "BIZ_DIRECT_PUSH_NOTIFY");
        BIZ_DIRECT_PUSH_NOTIFY = c0ymr33;
        C0YMR c0ymr34 = new C0YMR(33, 600, null, "GET_CONVERSATION_INFO");
        GET_CONVERSATION_INFO = c0ymr34;
        C0YMR c0ymr35 = new C0YMR(34, 601, bool, "SET_CONVERSATION_INFO");
        SET_CONVERSATION_INFO = c0ymr35;
        C0YMR c0ymr36 = new C0YMR(35, 602, null, "CREATE_CONVERSATION");
        CREATE_CONVERSATION = c0ymr36;
        C0YMR c0ymr37 = new C0YMR(36, 603, null, "MARK_CONVERSATION_DELETE");
        MARK_CONVERSATION_DELETE = c0ymr37;
        C0YMR c0ymr38 = new C0YMR(37, 604, null, "MARK_CONVERSATION_READ");
        MARK_CONVERSATION_READ = c0ymr38;
        C0YMR c0ymr39 = new C0YMR(38, 607, null, "GET_CONVERSATION_INFO_LIST");
        GET_CONVERSATION_INFO_LIST = c0ymr39;
        C0YMR c0ymr40 = new C0YMR(39, 608, null, "GET_CONVERSATION_INFO_V2");
        GET_CONVERSATION_INFO_V2 = c0ymr40;
        C0YMR c0ymr41 = new C0YMR(40, 609, null, "CREATE_CONVERSATION_V2");
        CREATE_CONVERSATION_V2 = c0ymr41;
        C0YMR c0ymr42 = new C0YMR(41, 610, null, "GET_CONVERSATION_INFO_LIST_V2");
        GET_CONVERSATION_INFO_LIST_V2 = c0ymr42;
        C0YMR c0ymr43 = new C0YMR(42, 611, null, "GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2");
        GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2 = c0ymr43;
        C0YMR c0ymr44 = new C0YMR(43, 612, null, "GET_CONVERSATION_INFO_LIST_BY_TOP_V2");
        GET_CONVERSATION_INFO_LIST_BY_TOP_V2 = c0ymr44;
        C0YMR c0ymr45 = new C0YMR(44, 613, null, "BATCH_MARK_CONVERSATION_READ");
        BATCH_MARK_CONVERSATION_READ = c0ymr45;
        C0YMR c0ymr46 = new C0YMR(45, 614, null, "DISSOLVE_CONVERSATION");
        DISSOLVE_CONVERSATION = c0ymr46;
        C0YMR c0ymr47 = new C0YMR(46, 615, null, "GET_CONVERSATIONS_CHECKINFO");
        GET_CONVERSATIONS_CHECKINFO = c0ymr47;
        C0YMR c0ymr48 = new C0YMR(47, 616, null, "GET_CONVERSATIONS_CHECK_INFO_V2");
        GET_CONVERSATIONS_CHECK_INFO_V2 = c0ymr48;
        C0YMR c0ymr49 = new C0YMR(48, 617, null, "BATCH_DELETE_CONVERSATIONS");
        BATCH_DELETE_CONVERSATIONS = c0ymr49;
        C0YMR c0ymr50 = new C0YMR(49, 690, null, "GET_CONVERSATION_GROUP_LIST");
        GET_CONVERSATION_GROUP_LIST = c0ymr50;
        C0YMR c0ymr51 = new C0YMR(50, 605, null, "CONVERSATION_PARTICIPANTS_LIST");
        CONVERSATION_PARTICIPANTS_LIST = c0ymr51;
        C0YMR c0ymr52 = new C0YMR(51, 650, null, "ADD_CONVERSATION_PARTICIPANTS");
        ADD_CONVERSATION_PARTICIPANTS = c0ymr52;
        C0YMR c0ymr53 = new C0YMR(52, 651, null, "REMOVE_CONVERSATION_PARTICIPANTS");
        REMOVE_CONVERSATION_PARTICIPANTS = c0ymr53;
        C0YMR c0ymr54 = new C0YMR(53, 652, null, "LEAVE_CONVERSATION");
        LEAVE_CONVERSATION = c0ymr54;
        C0YMR c0ymr55 = new C0YMR(54, 653, null, "CONVERSATION_SET_ROLE");
        CONVERSATION_SET_ROLE = c0ymr55;
        C0YMR c0ymr56 = new C0YMR(55, 654, null, "MGET_CONVERSATION_PARTICIPANTS");
        MGET_CONVERSATION_PARTICIPANTS = c0ymr56;
        C0YMR c0ymr57 = new C0YMR(56, 655, null, "UPDATE_CONVERSATION_PARTICIPANT");
        UPDATE_CONVERSATION_PARTICIPANT = c0ymr57;
        C0YMR c0ymr58 = new C0YMR(57, 656, null, "BATCH_UPDATE_CONVERSATION_PARTICIPANT");
        BATCH_UPDATE_CONVERSATION_PARTICIPANT = c0ymr58;
        C0YMR c0ymr59 = new C0YMR(58, 701, null, "DELETE_MESSAGE");
        DELETE_MESSAGE = c0ymr59;
        C0YMR c0ymr60 = new C0YMR(59, 702, null, "RECALL_MESSAGE");
        RECALL_MESSAGE = c0ymr60;
        C0YMR c0ymr61 = new C0YMR(60, 703, null, "REACTION_MESSAGE");
        REACTION_MESSAGE = c0ymr61;
        C0YMR c0ymr62 = new C0YMR(61, 704, bool, "SYNC_MESSAGE");
        SYNC_MESSAGE = c0ymr62;
        C0YMR c0ymr63 = new C0YMR(62, 705, null, "SET_MESSAGE_PROPERTY");
        SET_MESSAGE_PROPERTY = c0ymr63;
        C0YMR c0ymr64 = new C0YMR(63, 706, null, "ACK_MESSAGE");
        ACK_MESSAGE = c0ymr64;
        C0YMR c0ymr65 = new C0YMR(64, 707, null, "BATCH_ACK_MESSAGE");
        BATCH_ACK_MESSAGE = c0ymr65;
        C0YMR c0ymr66 = new C0YMR(65, 801, bool, "GET_GROUP_INFO");
        GET_GROUP_INFO = c0ymr66;
        C0YMR c0ymr67 = new C0YMR(66, 802, bool, "SET_GROUP_INFO");
        SET_GROUP_INFO = c0ymr67;
        C0YMR c0ymr68 = new C0YMR(67, 803, bool, "GET_GROUP_INFO_LIST");
        GET_GROUP_INFO_LIST = c0ymr68;
        C0YMR c0ymr69 = new C0YMR(68, 901, null, "GET_CONVERSATION_CORE_INFO");
        GET_CONVERSATION_CORE_INFO = c0ymr69;
        C0YMR c0ymr70 = new C0YMR(69, 902, null, "SET_CONVERSATION_CORE_INFO");
        SET_CONVERSATION_CORE_INFO = c0ymr70;
        C0YMR c0ymr71 = new C0YMR(70, 903, null, "GET_CONVERSATION_CORE_INFO_LIST");
        GET_CONVERSATION_CORE_INFO_LIST = c0ymr71;
        C0YMR c0ymr72 = new C0YMR(71, 904, null, "UPSERT_CONVERSATION_CORE_EXT_INFO");
        UPSERT_CONVERSATION_CORE_EXT_INFO = c0ymr72;
        C0YMR c0ymr73 = new C0YMR(72, 920, null, "GET_CONVERSATION_SETTING_INFO");
        GET_CONVERSATION_SETTING_INFO = c0ymr73;
        C0YMR c0ymr74 = new C0YMR(73, 921, null, "SET_CONVERSATION_SETTING_INFO");
        SET_CONVERSATION_SETTING_INFO = c0ymr74;
        C0YMR c0ymr75 = new C0YMR(74, 922, null, "UPSERT_CONVERSATION_SETTING_EXT_INFO");
        UPSERT_CONVERSATION_SETTING_EXT_INFO = c0ymr75;
        C0YMR c0ymr76 = new C0YMR(75, 924, null, "BATCH_SET_CONVERSATION_SETTING_INFO");
        BATCH_SET_CONVERSATION_SETTING_INFO = c0ymr76;
        C0YMR c0ymr77 = new C0YMR(76, 1001, null, "GET_STRANGER_CONVERSATION_LIST");
        GET_STRANGER_CONVERSATION_LIST = c0ymr77;
        C0YMR c0ymr78 = new C0YMR(77, 1002, null, "GET_STRANGER_MESSAGES_IN_CONVERSATION");
        GET_STRANGER_MESSAGES_IN_CONVERSATION = c0ymr78;
        C0YMR c0ymr79 = new C0YMR(78, 1003, null, "DELETE_STRANGER_MESSAGE");
        DELETE_STRANGER_MESSAGE = c0ymr79;
        C0YMR c0ymr80 = new C0YMR(79, 1004, null, "DELETE_STRANGER_CONVERSATION");
        DELETE_STRANGER_CONVERSATION = c0ymr80;
        C0YMR c0ymr81 = new C0YMR(80, 1005, null, "DELETE_ALL_STRANGER_CONVERSATIONS");
        DELETE_ALL_STRANGER_CONVERSATIONS = c0ymr81;
        C0YMR c0ymr82 = new C0YMR(81, 1006, null, "MARK_STRANGER_CONVERSATION_READ");
        MARK_STRANGER_CONVERSATION_READ = c0ymr82;
        C0YMR c0ymr83 = new C0YMR(82, 1007, null, "MARK_ALL_STRANGER_CONVERSATIONS_READ");
        MARK_ALL_STRANGER_CONVERSATIONS_READ = c0ymr83;
        C0YMR c0ymr84 = new C0YMR(83, 1008, null, "GET_STRANGER_UNREAD_COUNT");
        GET_STRANGER_UNREAD_COUNT = c0ymr84;
        C0YMR c0ymr85 = new C0YMR(84, 1009, bool, "DELETE_MULTI_STRANGER_CONVERSATIONS");
        DELETE_MULTI_STRANGER_CONVERSATIONS = c0ymr85;
        C0YMR c0ymr86 = new C0YMR(85, 1010, bool, "MARK_MULTI_STRANGER_CONVERSATIONS_READ");
        MARK_MULTI_STRANGER_CONVERSATIONS_READ = c0ymr86;
        C0YMR c0ymr87 = new C0YMR(86, 1099, bool, "STRANGER_NEW_MSG_NOTIFY");
        STRANGER_NEW_MSG_NOTIFY = c0ymr87;
        C0YMR c0ymr88 = new C0YMR(87, 2000, null, "GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3");
        GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3 = c0ymr88;
        C0YMR c0ymr89 = new C0YMR(88, 2001, null, "GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3");
        GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3 = c0ymr89;
        C0YMR c0ymr90 = new C0YMR(89, 2002, null, "MARK_CONVERSATION_READ_V3");
        MARK_CONVERSATION_READ_V3 = c0ymr90;
        C0YMR c0ymr91 = new C0YMR(90, 2003, bool, "GET_MEDIA_UPLOAD_TOKEN");
        GET_MEDIA_UPLOAD_TOKEN = c0ymr91;
        C0YMR c0ymr92 = new C0YMR(91, 2004, bool, "GET_MEDIA_URLS");
        GET_MEDIA_URLS = c0ymr92;
        C0YMR c0ymr93 = new C0YMR(92, 2005, null, "GET_TICKET");
        GET_TICKET = c0ymr93;
        C0YMR c0ymr94 = new C0YMR(93, 2006, null, "GET_USER_CONVERSATION_LIST");
        GET_USER_CONVERSATION_LIST = c0ymr94;
        C0YMR c0ymr95 = new C0YMR(94, 2007, bool, "BROADCAST_SEND_MESSAGE");
        BROADCAST_SEND_MESSAGE = c0ymr95;
        C0YMR c0ymr96 = new C0YMR(95, 2008, bool, "BROADCAST_RECV_MESSAGE");
        BROADCAST_RECV_MESSAGE = c0ymr96;
        C0YMR c0ymr97 = new C0YMR(96, 2009, bool, "BROADCAST_USER_COUNTER");
        BROADCAST_USER_COUNTER = c0ymr97;
        C0YMR c0ymr98 = new C0YMR(97, 2010, bool, "CLIENT_ACK");
        CLIENT_ACK = c0ymr98;
        C0YMR c0ymr99 = new C0YMR(98, 2011, bool, "CREATE_VOIP");
        CREATE_VOIP = c0ymr99;
        C0YMR c0ymr100 = new C0YMR(99, 2012, bool, "CALL_VOIP");
        CALL_VOIP = c0ymr100;
        C0YMR c0ymr101 = new C0YMR(100, 2013, bool, "UPDATE_VOIP");
        UPDATE_VOIP = c0ymr101;
        C0YMR c0ymr102 = new C0YMR(101, 2014, bool, "HEARTBEAT_CHANNEL");
        HEARTBEAT_CHANNEL = c0ymr102;
        C0YMR c0ymr103 = new C0YMR(102, 2015, bool, "PROFILE_GET_INFO");
        PROFILE_GET_INFO = c0ymr103;
        C0YMR c0ymr104 = new C0YMR(103, 2016, null, "REPORT_CLIENT_METRICS");
        REPORT_CLIENT_METRICS = c0ymr104;
        C0YMR c0ymr105 = new C0YMR(104, 2017, null, "GET_CONFIGS");
        GET_CONFIGS = c0ymr105;
        C0YMR c0ymr106 = new C0YMR(105, 2018, null, "UNREAD_COUNT_REPORT");
        UNREAD_COUNT_REPORT = c0ymr106;
        C0YMR c0ymr107 = new C0YMR(106, 2019, bool, "BLOCK_MEMBERS");
        BLOCK_MEMBERS = c0ymr107;
        C0YMR c0ymr108 = new C0YMR(107, 2020, bool, "BLOCK_CONVERSATION");
        BLOCK_CONVERSATION = c0ymr108;
        C0YMR c0ymr109 = new C0YMR(108, 2021, null, "MODIFY_MESSAGE_EXT");
        MODIFY_MESSAGE_EXT = c0ymr109;
        C0YMR c0ymr110 = new C0YMR(109, 2022, null, "GET_CONVERSATION_AUDIT_SWITCH");
        GET_CONVERSATION_AUDIT_SWITCH = c0ymr110;
        C0YMR c0ymr111 = new C0YMR(110, 2023, null, "UPDATE_CONVERSATION_AUDIT_SWITCH");
        UPDATE_CONVERSATION_AUDIT_SWITCH = c0ymr111;
        C0YMR c0ymr112 = new C0YMR(111, 2024, null, "SEND_CONVERSATION_APPLY");
        SEND_CONVERSATION_APPLY = c0ymr112;
        C0YMR c0ymr113 = new C0YMR(112, 2025, null, "ACK_CONVERSATION_APPLY");
        ACK_CONVERSATION_APPLY = c0ymr113;
        C0YMR c0ymr114 = new C0YMR(113, 2026, null, "GET_CONVERSATION_APPLY");
        GET_CONVERSATION_APPLY = c0ymr114;
        C0YMR c0ymr115 = new C0YMR(114, 2027, null, "GET_CONVERSATION_AUDIT_LIST");
        GET_CONVERSATION_AUDIT_LIST = c0ymr115;
        C0YMR c0ymr116 = new C0YMR(115, 2028, null, "GET_CONVERSATION_AUDIT_UNREAD");
        GET_CONVERSATION_AUDIT_UNREAD = c0ymr116;
        C0YMR c0ymr117 = new C0YMR(116, 2029, null, "CLEAR_CONVERSATION_AUDIT_UNREAD");
        CLEAR_CONVERSATION_AUDIT_UNREAD = c0ymr117;
        C0YMR c0ymr118 = new C0YMR(117, 2030, bool, "GET_UNREAD_COUNT");
        GET_UNREAD_COUNT = c0ymr118;
        C0YMR c0ymr119 = new C0YMR(118, 2031, bool, "SEND_MESSAGE_P2P");
        SEND_MESSAGE_P2P = c0ymr119;
        C0YMR c0ymr120 = new C0YMR(119, 2032, bool, "GET_BLOCKLIST");
        GET_BLOCKLIST = c0ymr120;
        C0YMR c0ymr121 = new C0YMR(120, 2033, bool, "SET_BLOCKLIST");
        SET_BLOCKLIST = c0ymr121;
        C0YMR c0ymr122 = new C0YMR(121, 2034, bool, "CHECK_IN_BLOCKLIST");
        CHECK_IN_BLOCKLIST = c0ymr122;
        C0YMR c0ymr123 = new C0YMR(122, 2035, bool, "GET_MESSAGE_INFO_BY_INDEX_V2");
        GET_MESSAGE_INFO_BY_INDEX_V2 = c0ymr123;
        C0YMR c0ymr124 = new C0YMR(123, 2036, bool, "MARK_MESSAGE");
        MARK_MESSAGE = c0ymr124;
        C0YMR c0ymr125 = new C0YMR(124, 2037, bool, "PULL_MARK_MESSAGE");
        PULL_MARK_MESSAGE = c0ymr125;
        C0YMR c0ymr126 = new C0YMR(125, 2038, null, "BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX");
        BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX = c0ymr126;
        C0YMR c0ymr127 = new C0YMR(126, 2039, bool, "GET_RECENT_MESSAGE");
        GET_RECENT_MESSAGE = c0ymr127;
        C0YMR c0ymr128 = new C0YMR(127, 2040, bool, "GET_CMD_MESSAGE");
        GET_CMD_MESSAGE = c0ymr128;
        C0YMR c0ymr129 = new C0YMR(128, 2041, bool, "GET_MESSAGE_INFO_BY_INDEX_V2_RANGE");
        GET_MESSAGE_INFO_BY_INDEX_V2_RANGE = c0ymr129;
        C0YMR c0ymr130 = new C0YMR(129, 2042, null, "BATCH_GET_CONVERSATION_AUDIT_UNREAD");
        BATCH_GET_CONVERSATION_AUDIT_UNREAD = c0ymr130;
        C0YMR c0ymr131 = new C0YMR(130, 2043, bool, "GET_MESSAGE_BY_INIT");
        GET_MESSAGE_BY_INIT = c0ymr131;
        C0YMR c0ymr132 = new C0YMR(131, 2044, bool, "PREVIEWER_GET_MESSAGES_BY_CONVERSATION");
        PREVIEWER_GET_MESSAGES_BY_CONVERSATION = c0ymr132;
        C0YMR c0ymr133 = new C0YMR(132, 2045, bool, "PREVIEWER_GET_CONVERSATION_INFO_LIST");
        PREVIEWER_GET_CONVERSATION_INFO_LIST = c0ymr133;
        C0YMR c0ymr134 = new C0YMR(133, 2046, bool, "SEND_FRIEND_APPLY");
        SEND_FRIEND_APPLY = c0ymr134;
        C0YMR c0ymr135 = new C0YMR(134, 2047, bool, "GET_FRIEND_APPLY_LIST");
        GET_FRIEND_APPLY_LIST = c0ymr135;
        C0YMR c0ymr136 = new C0YMR(135, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, bool, "GET_FRIEND_RECEIVE_APPLY_LIST");
        GET_FRIEND_RECEIVE_APPLY_LIST = c0ymr136;
        C0YMR c0ymr137 = new C0YMR(136, 2049, bool, "REPLY_FRIEND_APPLY");
        REPLY_FRIEND_APPLY = c0ymr137;
        C0YMR c0ymr138 = new C0YMR(137, 2050, bool, "GET_FRIEND_LIST");
        GET_FRIEND_LIST = c0ymr138;
        C0YMR c0ymr139 = new C0YMR(138, 2051, bool, "DELETE_FRIEND");
        DELETE_FRIEND = c0ymr139;
        C0YMR c0ymr140 = new C0YMR(139, 2052, bool, "PROFILE_BATCH_GET_INFO");
        PROFILE_BATCH_GET_INFO = c0ymr140;
        C0YMR c0ymr141 = new C0YMR(140, 2053, bool, "PROFILE_SEARCH_INFO");
        PROFILE_SEARCH_INFO = c0ymr141;
        C0YMR c0ymr142 = new C0YMR(141, 2054, bool, "MARK_MSG_UNREAD_COUNT_REPORT");
        MARK_MSG_UNREAD_COUNT_REPORT = c0ymr142;
        C0YMR c0ymr143 = new C0YMR(142, 2055, bool, "MARK_MSG_GET_UNREAD_COUNT");
        MARK_MSG_GET_UNREAD_COUNT = c0ymr143;
        C0YMR c0ymr144 = new C0YMR(143, 2056, bool, "BATCH_UNMARK_MESSAGE");
        BATCH_UNMARK_MESSAGE = c0ymr144;
        C0YMR c0ymr145 = new C0YMR(144, 2057, bool, "CLIENT_BATCH_ACK");
        CLIENT_BATCH_ACK = c0ymr145;
        C0YMR c0ymr146 = new C0YMR(145, 2058, bool, "JOIN_VOIP");
        JOIN_VOIP = c0ymr146;
        C0YMR c0ymr147 = new C0YMR(146, 2059, null, "GET_MEDIA_UPLOAD_CONFIG");
        GET_MEDIA_UPLOAD_CONFIG = c0ymr147;
        C0YMR c0ymr148 = new C0YMR(147, 2060, null, "GET_MEDIA_STATUS");
        GET_MEDIA_STATUS = c0ymr148;
        C0YMR c0ymr149 = new C0YMR(148, 2100, bool, "GLOBAL_MESSAGE_SEARCH");
        GLOBAL_MESSAGE_SEARCH = c0ymr149;
        C0YMR c0ymr150 = new C0YMR(149, 2101, bool, "GLOBAL_GROUP_SEARCH");
        GLOBAL_GROUP_SEARCH = c0ymr150;
        C0YMR c0ymr151 = new C0YMR(150, 2102, bool, "CONVERSATION_MESSAGE_SEARCH");
        CONVERSATION_MESSAGE_SEARCH = c0ymr151;
        C0YMR c0ymr152 = new C0YMR(151, 2103, bool, "CONVERSATION_MESSAGE_PRE_VIEW");
        CONVERSATION_MESSAGE_PRE_VIEW = c0ymr152;
        C0YMR c0ymr153 = new C0YMR(152, 2200, null, "GET_MESSAGES");
        GET_MESSAGES = c0ymr153;
        C0YMR c0ymr154 = new C0YMR(153, 2201, null, "BATCH_GET_MESSAGES");
        BATCH_GET_MESSAGES = c0ymr154;
        C0YMR c0ymr155 = new C0YMR(154, 2202, null, "PREFETCH_PREASSIGNED_CONVERSATION_IDS");
        PREFETCH_PREASSIGNED_CONVERSATION_IDS = c0ymr155;
        C0YMR c0ymr156 = new C0YMR(155, 9999, bool, "VCD_CLEAN");
        VCD_CLEAN = c0ymr156;
        LLILLJJLI = new C0YMR[]{c0ymr, c0ymr2, c0ymr3, c0ymr4, c0ymr5, c0ymr6, c0ymr7, c0ymr8, c0ymr9, c0ymr10, c0ymr11, c0ymr12, c0ymr13, c0ymr14, c0ymr15, c0ymr16, c0ymr17, c0ymr18, c0ymr19, c0ymr20, c0ymr21, c0ymr22, c0ymr23, c0ymr24, c0ymr25, c0ymr26, c0ymr27, c0ymr28, c0ymr29, c0ymr30, c0ymr31, c0ymr32, c0ymr33, c0ymr34, c0ymr35, c0ymr36, c0ymr37, c0ymr38, c0ymr39, c0ymr40, c0ymr41, c0ymr42, c0ymr43, c0ymr44, c0ymr45, c0ymr46, c0ymr47, c0ymr48, c0ymr49, c0ymr50, c0ymr51, c0ymr52, c0ymr53, c0ymr54, c0ymr55, c0ymr56, c0ymr57, c0ymr58, c0ymr59, c0ymr60, c0ymr61, c0ymr62, c0ymr63, c0ymr64, c0ymr65, c0ymr66, c0ymr67, c0ymr68, c0ymr69, c0ymr70, c0ymr71, c0ymr72, c0ymr73, c0ymr74, c0ymr75, c0ymr76, c0ymr77, c0ymr78, c0ymr79, c0ymr80, c0ymr81, c0ymr82, c0ymr83, c0ymr84, c0ymr85, c0ymr86, c0ymr87, c0ymr88, c0ymr89, c0ymr90, c0ymr91, c0ymr92, c0ymr93, c0ymr94, c0ymr95, c0ymr96, c0ymr97, c0ymr98, c0ymr99, c0ymr100, c0ymr101, c0ymr102, c0ymr103, c0ymr104, c0ymr105, c0ymr106, c0ymr107, c0ymr108, c0ymr109, c0ymr110, c0ymr111, c0ymr112, c0ymr113, c0ymr114, c0ymr115, c0ymr116, c0ymr117, c0ymr118, c0ymr119, c0ymr120, c0ymr121, c0ymr122, c0ymr123, c0ymr124, c0ymr125, c0ymr126, c0ymr127, c0ymr128, c0ymr129, c0ymr130, c0ymr131, c0ymr132, c0ymr133, c0ymr134, c0ymr135, c0ymr136, c0ymr137, c0ymr138, c0ymr139, c0ymr140, c0ymr141, c0ymr142, c0ymr143, c0ymr144, c0ymr145, c0ymr146, c0ymr147, c0ymr148, c0ymr149, c0ymr150, c0ymr151, c0ymr152, c0ymr153, c0ymr154, c0ymr155, c0ymr156};
        ADAPTER = new EnumAdapter<C0YMR>() { // from class: X.0YMT
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return C0YMR.fromValue(i);
            }
        };
    }

    public static C0YMR[] values() {
        return (C0YMR[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YMR fromValue(int i) {
        if (i != 0) {
            if (i != 410) {
                if (i != 411) {
                    if (i != 510) {
                        if (i != 511) {
                            switch (i) {
                                case 100:
                                    return SEND_MESSAGE;
                                case 206:
                                    return GET_MESSAGES_BY_CONVERSATION_SEARCH;
                                case 607:
                                    return GET_CONVERSATION_INFO_LIST;
                                case 608:
                                    return GET_CONVERSATION_INFO_V2;
                                case 609:
                                    return CREATE_CONVERSATION_V2;
                                case 610:
                                    return GET_CONVERSATION_INFO_LIST_V2;
                                case 611:
                                    return GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2;
                                case 612:
                                    return GET_CONVERSATION_INFO_LIST_BY_TOP_V2;
                                case 613:
                                    return BATCH_MARK_CONVERSATION_READ;
                                case 614:
                                    return DISSOLVE_CONVERSATION;
                                case 615:
                                    return GET_CONVERSATIONS_CHECKINFO;
                                case 616:
                                    return GET_CONVERSATIONS_CHECK_INFO_V2;
                                case 617:
                                    return BATCH_DELETE_CONVERSATIONS;
                                case 650:
                                    return ADD_CONVERSATION_PARTICIPANTS;
                                case 651:
                                    return REMOVE_CONVERSATION_PARTICIPANTS;
                                case 652:
                                    return LEAVE_CONVERSATION;
                                case 653:
                                    return CONVERSATION_SET_ROLE;
                                case 654:
                                    return MGET_CONVERSATION_PARTICIPANTS;
                                case 655:
                                    return UPDATE_CONVERSATION_PARTICIPANT;
                                case 656:
                                    return BATCH_UPDATE_CONVERSATION_PARTICIPANT;
                                case 690:
                                    return GET_CONVERSATION_GROUP_LIST;
                                case 701:
                                    return DELETE_MESSAGE;
                                case 702:
                                    return RECALL_MESSAGE;
                                case 703:
                                    return REACTION_MESSAGE;
                                case 704:
                                    return SYNC_MESSAGE;
                                case 705:
                                    return SET_MESSAGE_PROPERTY;
                                case 706:
                                    return ACK_MESSAGE;
                                case 707:
                                    return BATCH_ACK_MESSAGE;
                                case 801:
                                    return GET_GROUP_INFO;
                                case 802:
                                    return SET_GROUP_INFO;
                                case 803:
                                    return GET_GROUP_INFO_LIST;
                                case 901:
                                    return GET_CONVERSATION_CORE_INFO;
                                case 902:
                                    return SET_CONVERSATION_CORE_INFO;
                                case 903:
                                    return GET_CONVERSATION_CORE_INFO_LIST;
                                case 904:
                                    return UPSERT_CONVERSATION_CORE_EXT_INFO;
                                case 920:
                                    return GET_CONVERSATION_SETTING_INFO;
                                case 921:
                                    return SET_CONVERSATION_SETTING_INFO;
                                case 922:
                                    return UPSERT_CONVERSATION_SETTING_EXT_INFO;
                                case 924:
                                    return BATCH_SET_CONVERSATION_SETTING_INFO;
                                case 1001:
                                    return GET_STRANGER_CONVERSATION_LIST;
                                case 1002:
                                    return GET_STRANGER_MESSAGES_IN_CONVERSATION;
                                case 1003:
                                    return DELETE_STRANGER_MESSAGE;
                                case 1004:
                                    return DELETE_STRANGER_CONVERSATION;
                                case 1005:
                                    return DELETE_ALL_STRANGER_CONVERSATIONS;
                                case 1006:
                                    return MARK_STRANGER_CONVERSATION_READ;
                                case 1007:
                                    return MARK_ALL_STRANGER_CONVERSATIONS_READ;
                                case 1008:
                                    return GET_STRANGER_UNREAD_COUNT;
                                case 1009:
                                    return DELETE_MULTI_STRANGER_CONVERSATIONS;
                                case 1010:
                                    return MARK_MULTI_STRANGER_CONVERSATIONS_READ;
                                case 1099:
                                    return STRANGER_NEW_MSG_NOTIFY;
                                case 2000:
                                    return GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3;
                                case 2001:
                                    return GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3;
                                case 2002:
                                    return MARK_CONVERSATION_READ_V3;
                                case 2003:
                                    return GET_MEDIA_UPLOAD_TOKEN;
                                case 2004:
                                    return GET_MEDIA_URLS;
                                case 2005:
                                    return GET_TICKET;
                                case 2006:
                                    return GET_USER_CONVERSATION_LIST;
                                case 2007:
                                    return BROADCAST_SEND_MESSAGE;
                                case 2008:
                                    return BROADCAST_RECV_MESSAGE;
                                case 2009:
                                    return BROADCAST_USER_COUNTER;
                                case 2010:
                                    return CLIENT_ACK;
                                case 2011:
                                    return CREATE_VOIP;
                                case 2012:
                                    return CALL_VOIP;
                                case 2013:
                                    return UPDATE_VOIP;
                                case 2014:
                                    return HEARTBEAT_CHANNEL;
                                case 2015:
                                    return PROFILE_GET_INFO;
                                case 2016:
                                    return REPORT_CLIENT_METRICS;
                                case 2017:
                                    return GET_CONFIGS;
                                case 2018:
                                    return UNREAD_COUNT_REPORT;
                                case 2019:
                                    return BLOCK_MEMBERS;
                                case 2020:
                                    return BLOCK_CONVERSATION;
                                case 2021:
                                    return MODIFY_MESSAGE_EXT;
                                case 2022:
                                    return GET_CONVERSATION_AUDIT_SWITCH;
                                case 2023:
                                    return UPDATE_CONVERSATION_AUDIT_SWITCH;
                                case 2024:
                                    return SEND_CONVERSATION_APPLY;
                                case 2025:
                                    return ACK_CONVERSATION_APPLY;
                                case 2026:
                                    return GET_CONVERSATION_APPLY;
                                case 2027:
                                    return GET_CONVERSATION_AUDIT_LIST;
                                case 2028:
                                    return GET_CONVERSATION_AUDIT_UNREAD;
                                case 2029:
                                    return CLEAR_CONVERSATION_AUDIT_UNREAD;
                                case 2030:
                                    return GET_UNREAD_COUNT;
                                case 2031:
                                    return SEND_MESSAGE_P2P;
                                case 2032:
                                    return GET_BLOCKLIST;
                                case 2033:
                                    return SET_BLOCKLIST;
                                case 2034:
                                    return CHECK_IN_BLOCKLIST;
                                case 2035:
                                    return GET_MESSAGE_INFO_BY_INDEX_V2;
                                case 2036:
                                    return MARK_MESSAGE;
                                case 2037:
                                    return PULL_MARK_MESSAGE;
                                case 2038:
                                    return BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX;
                                case 2039:
                                    return GET_RECENT_MESSAGE;
                                case 2040:
                                    return GET_CMD_MESSAGE;
                                case 2041:
                                    return GET_MESSAGE_INFO_BY_INDEX_V2_RANGE;
                                case 2042:
                                    return BATCH_GET_CONVERSATION_AUDIT_UNREAD;
                                case 2043:
                                    return GET_MESSAGE_BY_INIT;
                                case 2044:
                                    return PREVIEWER_GET_MESSAGES_BY_CONVERSATION;
                                case 2045:
                                    return PREVIEWER_GET_CONVERSATION_INFO_LIST;
                                case 2046:
                                    return SEND_FRIEND_APPLY;
                                case 2047:
                                    return GET_FRIEND_APPLY_LIST;
                                case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                                    return GET_FRIEND_RECEIVE_APPLY_LIST;
                                case 2049:
                                    return REPLY_FRIEND_APPLY;
                                case 2050:
                                    return GET_FRIEND_LIST;
                                case 2051:
                                    return DELETE_FRIEND;
                                case 2052:
                                    return PROFILE_BATCH_GET_INFO;
                                case 2053:
                                    return PROFILE_SEARCH_INFO;
                                case 2054:
                                    return MARK_MSG_UNREAD_COUNT_REPORT;
                                case 2055:
                                    return MARK_MSG_GET_UNREAD_COUNT;
                                case 2056:
                                    return BATCH_UNMARK_MESSAGE;
                                case 2057:
                                    return CLIENT_BATCH_ACK;
                                case 2058:
                                    return JOIN_VOIP;
                                case 2059:
                                    return GET_MEDIA_UPLOAD_CONFIG;
                                case 2060:
                                    return GET_MEDIA_STATUS;
                                case 2100:
                                    return GLOBAL_MESSAGE_SEARCH;
                                case 2101:
                                    return GLOBAL_GROUP_SEARCH;
                                case 2102:
                                    return CONVERSATION_MESSAGE_SEARCH;
                                case 2103:
                                    return CONVERSATION_MESSAGE_PRE_VIEW;
                                case 2200:
                                    return GET_MESSAGES;
                                case 2201:
                                    return BATCH_GET_MESSAGES;
                                case 2202:
                                    return PREFETCH_PREASSIGNED_CONVERSATION_IDS;
                                case 9999:
                                    return VCD_CLEAN;
                                default:
                                    switch (i) {
                                        case 200:
                                            return GET_MESSAGES_BY_USER;
                                        case 201:
                                            return GET_MESSAGES_BY_USER_INIT;
                                        case 202:
                                            return REPORT_GET_MESSAGES_CURSOR;
                                        case 203:
                                            return GET_MESSAGES_BY_USER_INIT_V2;
                                        case 204:
                                            return GET_MESSAGES_BY_USER_COMBO;
                                        default:
                                            switch (i) {
                                                case 210:
                                                    return CHECK_MESSAGES_BY_USER;
                                                case 211:
                                                    return GET_MESSAGE_INFO_BY_SERVER_ID;
                                                case 212:
                                                    return CHECK_STATUS_MESSAGES;
                                                default:
                                                    switch (i) {
                                                        case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                                            return GET_CONVERSATION_LIST;
                                                        case 301:
                                                            return GET_MESSAGES_BY_CONVERSATION;
                                                        case 302:
                                                            return GET_MESSAGES_CHECKINFO_IN_CONVERSATION;
                                                        case 303:
                                                            return GET_MESSAGES_CHECK_INFO_V2;
                                                        case 304:
                                                            return GET_MESSAGES_BY_CONVERSATION_WITH_RANGE;
                                                        case 305:
                                                            return GET_MESSAGE_PREVIEW;
                                                        default:
                                                            switch (i) {
                                                                case 400:
                                                                    return SEND_ONLINE;
                                                                case 401:
                                                                    return SEND_OFFLINE;
                                                                case 402:
                                                                    return SEND_CLIENT_FOREGROUND;
                                                                case 403:
                                                                    return SEND_CLIENT_BACKGROUND;
                                                                default:
                                                                    switch (i) {
                                                                        case 500:
                                                                            return NEW_MSG_NOTIFY;
                                                                        case 501:
                                                                            return MARK_READ_NOTIFY;
                                                                        case 502:
                                                                            return CONVERSATION_INFO_UPDATED_NOTIFY;
                                                                        default:
                                                                            switch (i) {
                                                                                case 504:
                                                                                    return NEW_DIRECT_PUSH_NOTIFY;
                                                                                case 505:
                                                                                    return NEW_BROADCAST_MSG_NOTIFY;
                                                                                case 506:
                                                                                    return NEW_BROADCAST_CMD_MSG_NOTIFY;
                                                                                case 507:
                                                                                    return NEW_PREVIEW_MSG_NOTIFY;
                                                                                case 508:
                                                                                    return NEW_FRIEND_MSG_NOTIFY;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 600:
                                                                                            return GET_CONVERSATION_INFO;
                                                                                        case 601:
                                                                                            return SET_CONVERSATION_INFO;
                                                                                        case 602:
                                                                                            return CREATE_CONVERSATION;
                                                                                        case 603:
                                                                                            return MARK_CONVERSATION_DELETE;
                                                                                        case 604:
                                                                                            return MARK_CONVERSATION_READ;
                                                                                        case 605:
                                                                                            return CONVERSATION_PARTICIPANTS_LIST;
                                                                                        default:
                                                                                            return null;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        }
                        return BIZ_DIRECT_PUSH_NOTIFY;
                    }
                    return NEW_INPUT_STATUS_NOTIFY;
                }
                return SEND_INPUT_STATUS;
            }
            return SEND_USER_ACTION;
        }
        return IMCMD_NOT_USED;
    }

    public static C0YMR valueOf(String str) {
        return (C0YMR) C08FF.LIZ(C0YMR.class, str);
    }

    public C0YMR(int i, int i2, Boolean bool, String str) {
        this.LL = i2;
        this.deprecated = bool;
    }
}
