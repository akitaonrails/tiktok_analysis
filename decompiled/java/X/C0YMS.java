package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0YMS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMS {
    public static String LIZ(int i) {
        C0YMR c0ymrFromValue = C0YMR.fromValue(i);
        if (c0ymrFromValue != null) {
            if (c0ymrFromValue == C0YMR.SEND_MESSAGE) {
                return "v1/message/send";
            }
            if (c0ymrFromValue == C0YMR.REACTION_MESSAGE) {
                return "v1/message/reaction";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGES_BY_USER) {
                return "v1/message/get_by_user";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGES_BY_USER_COMBO) {
                return "v1/message/get_by_user_combo";
            }
            if (c0ymrFromValue == C0YMR.REPORT_GET_MESSAGES_CURSOR) {
                return "v1/message/report_cursor";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGES_BY_USER_INIT_V2) {
                return "v2/message/get_by_user_init";
            }
            if (c0ymrFromValue == C0YMR.CHECK_MESSAGES_BY_USER) {
                return "v1/message/check_by_user";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_LIST) {
                return "v1/conversation/get_list";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGES_BY_CONVERSATION) {
                return "v1/message/get_by_conversation";
            }
            if (c0ymrFromValue == C0YMR.SEND_ONLINE) {
                return "v1/account/online";
            }
            if (c0ymrFromValue == C0YMR.SEND_OFFLINE) {
                return "v1/account/offline";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_GROUP_LIST) {
                return "v1/conversation/get_group_list";
            }
            if (c0ymrFromValue == C0YMR.MARK_CONVERSATION_DELETE) {
                return "v1/conversation/delete";
            }
            if (c0ymrFromValue == C0YMR.MARK_CONVERSATION_READ) {
                return "v1/conversation/mark_read";
            }
            if (c0ymrFromValue == C0YMR.BATCH_MARK_CONVERSATION_READ) {
                return "v2/conversation/batch_mark_read";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_INFO_V2) {
                return "v2/conversation/get_info";
            }
            if (c0ymrFromValue == C0YMR.CREATE_CONVERSATION_V2) {
                return "v2/conversation/create";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_INFO_LIST_V2) {
                return "v2/conversation/get_info_list";
            }
            if (c0ymrFromValue == C0YMR.CONVERSATION_PARTICIPANTS_LIST) {
                return "v1/conversation/participants_list";
            }
            if (c0ymrFromValue == C0YMR.ADD_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/add_participants";
            }
            if (c0ymrFromValue == C0YMR.REMOVE_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/remove_participants";
            }
            if (c0ymrFromValue == C0YMR.LEAVE_CONVERSATION) {
                return "v1/conversation/leave";
            }
            if (c0ymrFromValue == C0YMR.MGET_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/mget_participants";
            }
            if (c0ymrFromValue == C0YMR.UPDATE_CONVERSATION_PARTICIPANT) {
                return "v1/conversation/update_participant";
            }
            if (c0ymrFromValue == C0YMR.DELETE_MESSAGE) {
                return "v1/message/delete";
            }
            if (c0ymrFromValue == C0YMR.RECALL_MESSAGE) {
                return "v1/message/recall";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_CORE_INFO) {
                return "v1/conversation/get_core_info";
            }
            if (c0ymrFromValue == C0YMR.SET_CONVERSATION_CORE_INFO) {
                return "v1/conversation/set_core_info";
            }
            if (c0ymrFromValue == C0YMR.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return "v1/conversation/upsert_core_ext_info";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_SETTING_INFO) {
                return "v1/conversation/get_setting_info";
            }
            if (c0ymrFromValue == C0YMR.SET_CONVERSATION_SETTING_INFO) {
                return "v1/conversation/set_setting_info";
            }
            if (c0ymrFromValue == C0YMR.BATCH_SET_CONVERSATION_SETTING_INFO) {
                return "v1/conversation/batch_set_setting_info";
            }
            if (c0ymrFromValue == C0YMR.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return "v1/conversation/upsert_settings_ext";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2) {
                return "v2/conversation/get_by_favorite";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_INFO_LIST_BY_TOP_V2) {
                return "v2/conversation/get_by_top";
            }
            if (c0ymrFromValue == C0YMR.DELETE_STRANGER_MESSAGE) {
                return "v1/stranger/delete_message";
            }
            if (c0ymrFromValue == C0YMR.DELETE_STRANGER_CONVERSATION) {
                return "v1/stranger/delete_conversation";
            }
            if (c0ymrFromValue == C0YMR.MARK_ALL_STRANGER_CONVERSATIONS_READ) {
                return "v1/stranger/mark_read_all_conversations";
            }
            if (c0ymrFromValue == C0YMR.SEND_USER_ACTION) {
                return "v1/client/user_action";
            }
            if (c0ymrFromValue == C0YMR.SEND_INPUT_STATUS) {
                return "v1/client/input_status";
            }
            if (c0ymrFromValue == C0YMR.DISSOLVE_CONVERSATION) {
                return "v1/conversation/dissolve";
            }
            if (c0ymrFromValue == C0YMR.SET_MESSAGE_PROPERTY) {
                return "v1/message/set_property";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3) {
                return "v3/conversation/get_read_index";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3) {
                return "v3/conversation/get_min_index";
            }
            if (c0ymrFromValue == C0YMR.MARK_CONVERSATION_READ_V3) {
                return "v3/conversation/mark_read";
            }
            if (c0ymrFromValue == C0YMR.GET_MEDIA_UPLOAD_TOKEN) {
                return "v1/media/get_upload_token";
            }
            if (c0ymrFromValue == C0YMR.GET_MEDIA_URLS) {
                return "v1/media/get_urls";
            }
            if (c0ymrFromValue == C0YMR.GET_USER_CONVERSATION_LIST) {
                return "v1/conversation/list";
            }
            if (c0ymrFromValue == C0YMR.BROADCAST_SEND_MESSAGE) {
                return "v1/broadcast/send_message";
            }
            if (c0ymrFromValue == C0YMR.BROADCAST_RECV_MESSAGE) {
                return "v1/broadcast/recv_message";
            }
            if (c0ymrFromValue == C0YMR.BROADCAST_USER_COUNTER) {
                return "v1/broadcast/user_counter";
            }
            if (c0ymrFromValue == C0YMR.CLIENT_ACK) {
                return "v1/client/ack";
            }
            if (c0ymrFromValue == C0YMR.PROFILE_GET_INFO) {
                return "v1/profile/get_info";
            }
            if (c0ymrFromValue == C0YMR.CREATE_VOIP) {
                return "v1/voip/create";
            }
            if (c0ymrFromValue == C0YMR.CALL_VOIP) {
                return "v1/voip/call";
            }
            if (c0ymrFromValue == C0YMR.UPDATE_VOIP) {
                return "v1/voip/update";
            }
            if (c0ymrFromValue == C0YMR.HEARTBEAT_CHANNEL) {
                return "v1/channel/heartbeat";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATIONS_CHECKINFO) {
                return "v1/conversation/get_checkinfo";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGES_CHECKINFO_IN_CONVERSATION) {
                return "v1/message/get_checkinfo";
            }
            if (c0ymrFromValue == C0YMR.REPORT_CLIENT_METRICS) {
                return "v1/client/report_metrics";
            }
            if (c0ymrFromValue == C0YMR.GET_CONFIGS) {
                return "v1/config/get";
            }
            if (c0ymrFromValue == C0YMR.UNREAD_COUNT_REPORT) {
                return "v1/client/unread_count";
            }
            if (c0ymrFromValue == C0YMR.BATCH_UPDATE_CONVERSATION_PARTICIPANT) {
                return "v1/conversation/batch_update_participant";
            }
            if (c0ymrFromValue == C0YMR.GET_TICKET) {
                return "v1/conversation/get_ticket";
            }
            if (c0ymrFromValue == C0YMR.BLOCK_MEMBERS) {
                return "v1/conversation/block_member";
            }
            if (c0ymrFromValue == C0YMR.BLOCK_CONVERSATION) {
                return "v1/conversation/block_conversation";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_AUDIT_SWITCH) {
                return "v1/conversation/get_audit";
            }
            if (c0ymrFromValue == C0YMR.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                return "v1/conversation/update_audit";
            }
            if (c0ymrFromValue == C0YMR.SEND_CONVERSATION_APPLY) {
                return "v1/conversation/send_apply";
            }
            if (c0ymrFromValue == C0YMR.ACK_CONVERSATION_APPLY) {
                return "v1/conversation/ack_apply";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_AUDIT_LIST) {
                return "v1/conversation/get_audit_list";
            }
            if (c0ymrFromValue == C0YMR.GET_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/get_audit_unread";
            }
            if (c0ymrFromValue == C0YMR.CLEAR_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/clear_audit_unread";
            }
            if (c0ymrFromValue == C0YMR.SEND_MESSAGE_P2P) {
                return "v1/send_message/p2p";
            }
            if (c0ymrFromValue == C0YMR.GET_BLOCKLIST) {
                return "v1/blacklist/get";
            }
            if (c0ymrFromValue == C0YMR.SET_BLOCKLIST) {
                return "v1/blacklist/set";
            }
            if (c0ymrFromValue == C0YMR.CHECK_IN_BLOCKLIST) {
                return "v1/blacklist/check";
            }
            if (c0ymrFromValue == C0YMR.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX) {
                return "v1/conversation/batch_get_conversation_participants_readindex";
            }
            if (c0ymrFromValue == C0YMR.MARK_MESSAGE) {
                return "v1/message/mark";
            }
            if (c0ymrFromValue == C0YMR.PULL_MARK_MESSAGE) {
                return "v1/message/pull_mark";
            }
            if (c0ymrFromValue == C0YMR.GET_RECENT_MESSAGE) {
                return "v1/message/get_recent_message/";
            }
            if (c0ymrFromValue == C0YMR.GET_CMD_MESSAGE) {
                return "v1/message/get_cmd_message/";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGE_INFO_BY_INDEX_V2_RANGE) {
                return "v1/message/get_message_by_index_v2_range/";
            }
            if (c0ymrFromValue == C0YMR.GET_MESSAGE_INFO_BY_SERVER_ID) {
                return "v1/message/get_message_by_server_id";
            }
            if (c0ymrFromValue == C0YMR.BATCH_GET_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/batch_get_audit_unread";
            }
            if (c0ymrFromValue == C0YMR.BATCH_UNMARK_MESSAGE) {
                return "v1/message/batch_unmark";
            }
            if (c0ymrFromValue == C0YMR.MARK_MSG_UNREAD_COUNT_REPORT) {
                return "v1/message/report_mark_count";
            }
            if (c0ymrFromValue == C0YMR.MARK_MSG_GET_UNREAD_COUNT) {
                return "v1/message/get_mark_count";
            }
            if (c0ymrFromValue == C0YMR.CLIENT_BATCH_ACK) {
                return "v1/client/batch_ack";
            }
            if (c0ymrFromValue == C0YMR.JOIN_VOIP) {
                return "v1/voip/join";
            }
            if (c0ymrFromValue == C0YMR.GET_MEDIA_UPLOAD_CONFIG) {
                return "v1/media/upload_config";
            }
            if (c0ymrFromValue == C0YMR.GET_MEDIA_STATUS) {
                return "v1/media/get_status";
            }
            if (c0ymrFromValue == C0YMR.CHECK_STATUS_MESSAGES) {
                return "v1/message/check_status";
            }
            if (c0ymrFromValue == C0YMR.PREFETCH_PREASSIGNED_CONVERSATION_IDS) {
                return "v1/conversation/preassigned_ids";
            }
            switch (C0YMQ.LIZ[c0ymrFromValue.ordinal()]) {
                case 1:
                    return "v1/message/previewer_get_by_conversation";
                case 2:
                    return "v2/conversation/previewer_get_info_list";
                case 3:
                    return "v1/profile/batch_get_info";
                case 4:
                    return "v1/friend/delete";
                case 5:
                    return "v1/friend/get_list";
                case 6:
                    return "v1/friend/reply_apply";
                case 7:
                    return "v1/friend/get_receive_apply_list";
                case 8:
                    return "v1/friend/get_apply_list";
                case BdTuring.TYPE_ECAF /* 9 */:
                    return "v1/friend/send_apply";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return "v1/profile/search_info";
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return "v1/message/get";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    return "v1/message/batch_get";
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    return "v1/message/ack";
                case 14:
                    return "v2/conversation/get_check_info";
                case 15:
                    return "v2/message/get_check_info";
                case 16:
                    return "v1/message/batch_ack";
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    return "v1/conversation/batch_delete";
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    return "v1/message/get_by_conversation_with_range";
                case 19:
                    return "v1/message/get_preview";
                default:
                    throw new IllegalArgumentException("cmd not find!");
            }
        }
        throw new NullPointerException("cmd is null");
    }
}
