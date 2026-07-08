package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Xfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854550Xfh extends AbstractC795470VIj {
    public final int $t;

    public static final String createQuery$0(C854550Xfh c854550Xfh) {
        return "DELETE FROM maf_info WHERE rec_type = ?";
    }

    public static final String createQuery$1(C854550Xfh c854550Xfh) {
        return "DELETE FROM maf_info WHERE uid = ?";
    }

    public static final String createQuery$10(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_status";
    }

    public static final String createQuery$11(C854550Xfh c854550Xfh) {
        return "DELETE FROM rule_hit_cache WHERE unique_key = ?";
    }

    public static final String createQuery$12(C854550Xfh c854550Xfh) {
        return "DELETE FROM rule_hit_cache WHERE unique_key IN (SELECT unique_key FROM rule_hit_cache ORDER BY create_time ASC LIMIT ?)";
    }

    public static final String createQuery$13(C854550Xfh c854550Xfh) {
        return "DELETE FROM rule_hit_cache";
    }

    public static final String createQuery$14(C854550Xfh c854550Xfh) {
        return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
    }

    public static final String createQuery$15(C854550Xfh c854550Xfh) {
        return "DELETE FROM AWEME_MESSAGE_KV WHERE CREATE_TIME < ?";
    }

    public static final String createQuery$16(C854550Xfh c854550Xfh) {
        return "DELETE FROM AWEME_MESSAGE_KV WHERE MSG_ID = ?";
    }

    public static final String createQuery$17(C854550Xfh c854550Xfh) {
        return "\n        DELETE \n        FROM optin_popup_record\n        WHERE trigger_time < ?\n        ";
    }

    public static final String createQuery$18(C854550Xfh c854550Xfh) {
        return "\n        UPDATE optin_popup_record \n        SET action_type = ?, action_time = ?, extra_1 = ?\n        WHERE trigger_time = ?\n        ";
    }

    public static final String createQuery$19(C854550Xfh c854550Xfh) {
        return "DELETE FROM USER_INTERACTION WHERE ID = ? AND TARGET_TYPE = ? AND BUSINESS_TYPE = ?";
    }

    public static final String createQuery$2(C854550Xfh c854550Xfh) {
        return "DELETE FROM maf_info WHERE uid = ? AND rec_type = ?";
    }

    public static final String createQuery$20(C854550Xfh c854550Xfh) {
        return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
    }

    public static final String createQuery$21(C854550Xfh c854550Xfh) {
        return "DELETE FROM runtimeBehaviorEntity";
    }

    public static final String createQuery$22(C854550Xfh c854550Xfh) {
        return "DELETE FROM aigc_workflow WHERE id = ?";
    }

    public static final String createQuery$23(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET central_registry = ? WHERE id = ?";
    }

    public static final String createQuery$24(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET workflow_state = ? WHERE id = ?";
    }

    public static final String createQuery$25(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET static_central_registry = ? WHERE id = ?";
    }

    public static final String createQuery$26(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET workflow_config = ? WHERE id = ?";
    }

    public static final String createQuery$27(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET creation_id_read_only = ? WHERE id = ?";
    }

    public static final String createQuery$28(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET server_task_id = ? WHERE id = ?";
    }

    public static final String createQuery$29(C854550Xfh c854550Xfh) {
        return "UPDATE aigc_workflow SET grade_down_count = grade_down_count + 1 WHERE id = ?";
    }

    public static final String createQuery$3(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_info WHERE uid = ?";
    }

    public static final String createQuery$30(C854550Xfh c854550Xfh) {
        return "DELETE FROM search_dislike_table";
    }

    public static final String createQuery$31(C854550Xfh c854550Xfh) {
        return "DELETE FROM aweme_detail where api_path = ? and start_time NOT IN (SELECT start_time FROM aweme_detail ORDER BY start_time DESC LIMIT ?)";
    }

    public static final String createQuery$32(C854550Xfh c854550Xfh) {
        return "DELETE FROM aweme_detail where start_time <= ?";
    }

    public static final String createQuery$33(C854550Xfh c854550Xfh) {
        return "DELETE FROM friends_feed_resp_cache where uid = ?";
    }

    public static final String createQuery$34(C854550Xfh c854550Xfh) {
        return "DELETE FROM live_recordings_content_mapping WHERE create_time < ?";
    }

    public static final String createQuery$35(C854550Xfh c854550Xfh) {
        return "DELETE FROM live_recordings_content_mapping WHERE fragment_id = ?";
    }

    public static final String createQuery$36(C854550Xfh c854550Xfh) {
        return "DELETE FROM live_recordings_content_mapping";
    }

    public static final String createQuery$37(C854550Xfh c854550Xfh) {
        return "DELETE FROM skylight_live WHERE updated_at < ?";
    }

    public static final String createQuery$38(C854550Xfh c854550Xfh) {
        return "DELETE FROM skylight_live WHERE uid IN (SELECT uid FROM skylight_live ORDER BY updated_at ASC LIMIT ?)";
    }

    public static final String createQuery$39(C854550Xfh c854550Xfh) {
        return "UPDATE skylight_story_collection SET user_story = ? WHERE author_id = ?";
    }

    public static final String createQuery$4(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_status WHERE uid = ?";
    }

    public static final String createQuery$40(C854550Xfh c854550Xfh) {
        return "DELETE FROM skylight_story_collection WHERE updated_at < ?";
    }

    public static final String createQuery$41(C854550Xfh c854550Xfh) {
        return "DELETE FROM FRIENDS_RED_DOT_RECORD WHERE READ_TIME <= ? AND USER_ID = ?";
    }

    public static final String createQuery$42(C854550Xfh c854550Xfh) {
        return "DELETE FROM FRIENDS_UNREAD_RECORD";
    }

    public static final String createQuery$43(C854550Xfh c854550Xfh) {
        return "DELETE FROM REPOST_DISLIKE_RECORD WHERE DISLIKE_TIME <= ? AND USER_ID = ?";
    }

    public static final String createQuery$44(C854550Xfh c854550Xfh) {
        return "DELETE FROM friends_v3_feeds_table WHERE uid = ?";
    }

    public static final String createQuery$45(C854550Xfh c854550Xfh) {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }

    public static final String createQuery$46(C854550Xfh c854550Xfh) {
        return "DELETE from WorkProgress where work_spec_id=?";
    }

    public static final String createQuery$47(C854550Xfh c854550Xfh) {
        return "DELETE FROM WorkProgress";
    }

    public static final String createQuery$48(C854550Xfh c854550Xfh) {
        return "DELETE FROM workspec WHERE id=?";
    }

    public static final String createQuery$49(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET output=? WHERE id=?";
    }

    public static final String createQuery$5(C854550Xfh c854550Xfh) {
        return "DELETE FROM maf_info WHERE version = ?";
    }

    public static final String createQuery$50(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }

    public static final String createQuery$51(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }

    public static final String createQuery$52(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }

    public static final String createQuery$53(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }

    public static final String createQuery$54(C854550Xfh c854550Xfh) {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public static final String createQuery$55(C854550Xfh c854550Xfh) {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public static final String createQuery$56(C854550Xfh c854550Xfh) {
        return "DELETE FROM sound_effect_database";
    }

    public static final String createQuery$57(C854550Xfh c854550Xfh) {
        return "DELETE FROM `package`";
    }

    public static final String createQuery$58(C854550Xfh c854550Xfh) {
        return "DELETE FROM scene WHERE uid = ? AND sceneKey = ?";
    }

    public static final String createQuery$59(C854550Xfh c854550Xfh) {
        return "DELETE FROM scene";
    }

    public static final String createQuery$6(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_info WHERE version = ?";
    }

    public static final String createQuery$60(C854550Xfh c854550Xfh) {
        return "DELETE FROM strategy";
    }

    public static final String createQuery$61(C854550Xfh c854550Xfh) {
        return "DELETE FROM translation";
    }

    public static final String createQuery$62(C854550Xfh c854550Xfh) {
        return "UPDATE cold_cache_mode_feed_pb SET file_key = ? WHERE aid = ?";
    }

    public static final String createQuery$63(C854550Xfh c854550Xfh) {
        return "DELETE FROM following_feed_consume where uid = ? and insert_time <= ?";
    }

    public static final String createQuery$64(C854550Xfh c854550Xfh) {
        return "DELETE FROM following_feed_consume where uid = ?";
    }

    public static final String createQuery$65(C854550Xfh c854550Xfh) {
        return "DELETE FROM following_frequent_user_new where uid = ? and author_id = ?";
    }

    public static final String createQuery$66(C854550Xfh c854550Xfh) {
        return "DELETE FROM following_frequent_user_new where uid = ?";
    }

    public static final String createQuery$67(C854550Xfh c854550Xfh) {
        return "delete from showAd";
    }

    public static final String createQuery$68(C854550Xfh c854550Xfh) {
        return "UPDATE MESSAGE SET CLIENT_STATUS = 9 WHERE CONVERSATION_ID = ? AND SUB_CONVERSATION_ID = ?";
    }

    public static final String createQuery$69(C854550Xfh c854550Xfh) {
        return "UPDATE MESSAGE SET SUB_CONVERSATION_ID = ? WHERE MESSAGE_ID = ?";
    }

    public static final String createQuery$7(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_status WHERE version = ?";
    }

    public static final String createQuery$70(C854550Xfh c854550Xfh) {
        return "UPDATE RECENT_SHARE SET SEND_TIME = ? WHERE ID = ?";
    }

    public static final String createQuery$71(C854550Xfh c854550Xfh) {
        return "UPDATE RECENT_SHARE SET SEND_TIME = -1 WHERE ID = ? AND CURR_UID = ?";
    }

    public static final String createQuery$72(C854550Xfh c854550Xfh) {
        return "DELETE FROM RECENT_SHARE WHERE CURR_UID = ? AND ID NOT IN (SELECT ID FROM RECENT_SHARE ORDER BY SHARE_TIME DESC LIMIT ?) AND ID NOT IN (SELECT ID FROM RECENT_SHARE ORDER BY SEND_TIME DESC LIMIT ?)";
    }

    public static final String createQuery$73(C854550Xfh c854550Xfh) {
        return "DELETE FROM t_report_synclog WHERE t_report_synclog.business not in (SELECT distinct id from t_business) ";
    }

    public static final String createQuery$74(C854550Xfh c854550Xfh) {
        return "DELETE FROM t_report_synclog WHERE sync_id = ? AND cursor > 0 AND cursor <=?";
    }

    public static final String createQuery$75(C854550Xfh c854550Xfh) {
        return "DELETE FROM ai_quick_reply WHERE rowid IN (SELECT rowid FROM ai_quick_reply ORDER BY timestamp ASC LIMIT ?)";
    }

    public static final String createQuery$76(C854550Xfh c854550Xfh) {
        return "DELETE FROM story_thought_drafts WHERE task_id = ?";
    }

    public static final String createQuery$77(C854550Xfh c854550Xfh) {
        return "DELETE FROM story_thought_drafts WHERE uid = ?";
    }

    public static final String createQuery$78(C854550Xfh c854550Xfh) {
        return "DELETE FROM stickers WHERE tableName = ? AND ((resourceId = ? AND resourceId IS NOT NULL) OR (imageUrl = ? AND imageUrl IS NOT NULL))";
    }

    public static final String createQuery$8(C854550Xfh c854550Xfh) {
        return "DELETE FROM maf_info";
    }

    public static final String createQuery$9(C854550Xfh c854550Xfh) {
        return "DELETE FROM user_info";
    }

    @Override // X.AbstractC795470VIj
    public final String createQuery() {
        switch (this.$t) {
            case 0:
                return createQuery$0(this);
            case 1:
                return createQuery$1(this);
            case 2:
                return createQuery$2(this);
            case 3:
                return createQuery$3(this);
            case 4:
                return createQuery$4(this);
            case 5:
                return createQuery$5(this);
            case 6:
                return createQuery$6(this);
            case 7:
                return createQuery$7(this);
            case 8:
                return createQuery$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return createQuery$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return createQuery$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return createQuery$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return createQuery$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return createQuery$13(this);
            case 14:
                return createQuery$14(this);
            case 15:
                return createQuery$15(this);
            case 16:
                return createQuery$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return createQuery$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return createQuery$18(this);
            case 19:
                return createQuery$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return createQuery$20(this);
            case 21:
                return createQuery$21(this);
            case 22:
                return createQuery$22(this);
            case 23:
                return createQuery$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return createQuery$24(this);
            case 25:
                return createQuery$25(this);
            case 26:
                return createQuery$26(this);
            case 27:
                return createQuery$27(this);
            case 28:
                return createQuery$28(this);
            case 29:
                return createQuery$29(this);
            case 30:
                return createQuery$30(this);
            case 31:
                return createQuery$31(this);
            case 32:
                return createQuery$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return createQuery$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return createQuery$34(this);
            case 35:
                return createQuery$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return createQuery$36(this);
            case 37:
                return createQuery$37(this);
            case 38:
                return createQuery$38(this);
            case 39:
                return createQuery$39(this);
            case 40:
                return createQuery$40(this);
            case 41:
                return createQuery$41(this);
            case 42:
                return createQuery$42(this);
            case 43:
                return createQuery$43(this);
            case 44:
                return createQuery$44(this);
            case 45:
                return createQuery$45(this);
            case 46:
                return createQuery$46(this);
            case 47:
                return createQuery$47(this);
            case 48:
                return createQuery$48(this);
            case 49:
                return createQuery$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return createQuery$50(this);
            case 51:
                return createQuery$51(this);
            case 52:
                return createQuery$52(this);
            case 53:
                return createQuery$53(this);
            case 54:
                return createQuery$54(this);
            case 55:
                return createQuery$55(this);
            case 56:
                return createQuery$56(this);
            case 57:
                return createQuery$57(this);
            case 58:
                return createQuery$58(this);
            case 59:
                return createQuery$59(this);
            case 60:
                return createQuery$60(this);
            case 61:
                return createQuery$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return createQuery$62(this);
            case 63:
                return createQuery$63(this);
            case 64:
                return createQuery$64(this);
            case 65:
                return createQuery$65(this);
            case 66:
                return createQuery$66(this);
            case 67:
                return createQuery$67(this);
            case 68:
                return createQuery$68(this);
            case 69:
                return createQuery$69(this);
            case 70:
                return createQuery$70(this);
            case 71:
                return createQuery$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return createQuery$72(this);
            case 73:
                return createQuery$73(this);
            case 74:
                return createQuery$74(this);
            case 75:
                return createQuery$75(this);
            case 76:
                return createQuery$76(this);
            case 77:
                return createQuery$77(this);
            case 78:
                return createQuery$78(this);
            default:
                return super.createQuery();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854550Xfh(AbstractC796540VMm abstractC796540VMm, int i) {
        super(abstractC796540VMm);
        this.$t = i;
    }
}
