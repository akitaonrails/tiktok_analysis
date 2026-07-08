package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.020l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5189020l extends Message<C5189020l, C02IN> {
    public static final ProtoAdapter<C5189020l> ADAPTER = new ProtoAdapter<C5189020l>() { // from class: X.020k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5189020l decode(ProtoReader protoReader) {
            C5189020l c5189020l = new C5189020l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5189020l.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5189020l.short_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5189020l.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5189020l.gender = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5189020l.signature = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5189020l.avatar_larger = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5189020l.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5189020l.avatar_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5189020l.birthday = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        case 30:
                        case 31:
                        case 32:
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        case 35:
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        case 51:
                        case 52:
                        case 57:
                        case 60:
                        case 63:
                        case 66:
                        case 85:
                        case 90:
                        case 95:
                        case 96:
                        case 100:
                        case 104:
                        case 117:
                        case 118:
                        case 125:
                        case 129:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 159:
                        case 166:
                        case 188:
                        case 193:
                        case 194:
                        case 201:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5189020l.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5189020l.aweme_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c5189020l.following_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c5189020l.follower_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c5189020l.favoriting_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5189020l.total_favorited = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5189020l.is_block = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5189020l.hide_search = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 25:
                            c5189020l.custom_verify = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c5189020l.unique_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c5189020l.bind_phone = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 28:
                            c5189020l.special_lock = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            c5189020l.need_recommend = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c5189020l.recommend_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 37:
                            c5189020l.has_facebook_token = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 38:
                            c5189020l.has_twitter_token = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            c5189020l.fb_expire_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 40:
                            c5189020l.tw_expire_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 41:
                            c5189020l.has_youtube_token = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 42:
                            c5189020l.youtube_expire_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 43:
                            c5189020l.room_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 44:
                            c5189020l.live_verify = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 45:
                            c5189020l.authority_status = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 46:
                            c5189020l.verify_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 47:
                            c5189020l.shield_follow_notice = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 48:
                            c5189020l.shield_digg_notice = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 49:
                            c5189020l.shield_comment_notice = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 53:
                            c5189020l.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case 54:
                            c5189020l.with_commerce_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 55:
                            c5189020l.verification_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 56:
                            c5189020l.original_musician = C02DR.ADAPTER.decode(protoReader);
                            break;
                        case 58:
                            c5189020l.enterprise_verify_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 59:
                            c5189020l.is_ad_fake = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 61:
                            c5189020l.mplatform_followers_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c5189020l.followers_detail.add(C02CU.ADAPTER.decode(protoReader));
                            break;
                        case 64:
                            c5189020l.region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 65:
                            c5189020l.account_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 67:
                            c5189020l.commerce_user_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 68:
                            c5189020l.commerce_info = AnonymousClass0284.ADAPTER.decode(protoReader);
                            break;
                        case 69:
                            c5189020l.live_agreement = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 70:
                            c5189020l.platform_sync_info.add(C02G0.ADAPTER.decode(protoReader));
                            break;
                        case 71:
                            c5189020l.with_shop_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            c5189020l.is_discipline_member = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 73:
                            c5189020l.secret = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 74:
                            c5189020l.has_orders = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 75:
                            c5189020l.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 76:
                            c5189020l.show_image_bubble = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 77:
                            c5189020l.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 78:
                            c5189020l.unique_id_modify_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 79:
                            c5189020l.video_icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 80:
                            c5189020l.ins_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 81:
                            c5189020l.google_account = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 82:
                            c5189020l.youtube_channel_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 83:
                            c5189020l.youtube_channel_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 84:
                            c5189020l.apple_account = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 86:
                            c5189020l.with_fusion_shop_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 87:
                            c5189020l.is_phone_binded = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 88:
                            c5189020l.login_platform = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 89:
                            c5189020l.accept_private_policy = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 91:
                            c5189020l.twitter_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 92:
                            c5189020l.twitter_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 93:
                            c5189020l.user_canceled = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 94:
                            c5189020l.has_email = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 97:
                            c5189020l.live_agreement_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 98:
                            c5189020l.register_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 99:
                            c5189020l.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 101:
                            c5189020l.create_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 102:
                            c5189020l.avatar_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 103:
                            c5189020l.follower_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 105:
                            c5189020l.comment_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 106:
                            c5189020l.duet_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 107:
                            c5189020l.reflow_page_gid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 108:
                            c5189020l.reflow_page_uid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 109:
                            c5189020l.user_rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 110:
                            c5189020l.with_new_goods = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 111:
                            c5189020l.is_flowcard_member = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 112:
                            c5189020l.room_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 113:
                            c5189020l.download_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 114:
                            c5189020l.download_prompt_ts = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 115:
                            c5189020l.react_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 116:
                            c5189020l.live_commerce = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 119:
                            c5189020l.country = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 120:
                            c5189020l.province = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 121:
                            c5189020l.city = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 122:
                            c5189020l.cover_url.add(C673002jw.ADAPTER.decode(protoReader));
                            break;
                        case 123:
                            c5189020l.recommend_reason_relation = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 124:
                            c5189020l.iso_country_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 126:
                            c5189020l.district = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 127:
                            c5189020l.language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 128:
                            c5189020l.room_type_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 130:
                            c5189020l.has_insights = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 131:
                            c5189020l.remark_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 132:
                            c5189020l.video_icon_virtual_URI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 133:
                            c5189020l.share_qrcode_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 134:
                            c5189020l.profile_tab_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 135:
                            c5189020l.avatar_decoration = C02UV.ADAPTER.decode(protoReader);
                            break;
                        case 136:
                            c5189020l.watch_status = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 137:
                            c5189020l.with_commerce_newbie_task = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 138:
                            c5189020l.with_item_commerce_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 139:
                            c5189020l.star_billboard_rank = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 140:
                            c5189020l.education = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 141:
                            c5189020l.can_modify_school_info = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 142:
                            c5189020l.school_visible = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 143:
                            c5189020l.avatar_pendant_larger = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 144:
                            c5189020l.avatar_pendant_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 145:
                            c5189020l.avatar_pendant_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 146:
                            c5189020l.item_list.add(C02E0.ADAPTER.decode(protoReader));
                            break;
                        case 147:
                            c5189020l.user_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 148:
                            c5189020l.user_period = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 149:
                            c5189020l.is_effect_artist = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 150:
                            c5189020l.effect_detail = C668702jF.ADAPTER.decode(protoReader);
                            break;
                        case 151:
                            c5189020l.commerce_permissions = C664002iU.ADAPTER.decode(protoReader);
                            break;
                        case 152:
                            c5189020l.life_story_block = C625702cJ.ADAPTER.decode(protoReader);
                            break;
                        case 153:
                            c5189020l.hide_following_follower_list = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 158:
                            c5189020l.is_star = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 160:
                            c5189020l.cv_level = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 161:
                            c5189020l.creator_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 162:
                            c5189020l.is_mirror = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 163:
                            c5189020l.pr_exempt = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 164:
                            c5189020l.type_label.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 165:
                            c5189020l.avatar_decoration_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 167:
                            c5189020l.ad_cover_url.add(C673002jw.ADAPTER.decode(protoReader));
                            break;
                        case 168:
                            c5189020l.ad_cover_title = C633902dd.ADAPTER.decode(protoReader);
                            break;
                        case 169:
                            c5189020l.ad_order_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 170:
                            c5189020l.r_fans_group_info = C02WE.ADAPTER.decode(protoReader);
                            break;
                        case 171:
                            c5189020l.with_commerce_enterprise_tab_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 172:
                            c5189020l.honor_info = C658902hf.ADAPTER.decode(protoReader);
                            break;
                        case 173:
                            c5189020l.comment_filter_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 174:
                            c5189020l.notify_private_account = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 175:
                            c5189020l.avatar_168x168 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 176:
                            c5189020l.avatar_300x300 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 177:
                            c5189020l.is_blocked = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 178:
                            c5189020l.force_private_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 179:
                            c5189020l.with_star_atlas_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 180:
                            c5189020l.sprint_support_user_info = C02CX.ADAPTER.decode(protoReader);
                            break;
                        case 181:
                            c5189020l.signature_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 182:
                            c5189020l.brand_info = C02BH.ADAPTER.decode(protoReader);
                            break;
                        case 183:
                            c5189020l.display_wvalantine_activity_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 184:
                            c5189020l.shop_micro_app = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 185:
                            c5189020l.commerce_user_info = C549302Cd.ADAPTER.decode(protoReader);
                            break;
                        case 186:
                            c5189020l.relative_users.add(C02B7.ADAPTER.decode(protoReader));
                            break;
                        case 187:
                            c5189020l.quick_shop_info = C02HI.ADAPTER.decode(protoReader);
                            break;
                        case 189:
                            c5189020l.cha_list.add(C021F.ADAPTER.decode(protoReader));
                            break;
                        case 190:
                            c5189020l.is_minor = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 191:
                            c5189020l.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 192:
                            c5189020l.recommend_score = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 195:
                            c5189020l.general_permission = C556702Ez.ADAPTER.decode(protoReader);
                            break;
                        case 196:
                            c5189020l.birthday_hide_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 197:
                            c5189020l.bio_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 198:
                            c5189020l.bio_email = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 199:
                            c5189020l.latest_order_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 200:
                            c5189020l.is_pro_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 202:
                            c5189020l.email = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 203:
                            c5189020l.is_email_verified = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 204:
                            c5189020l.bio_secure_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 205:
                            c5189020l.collect_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 206:
                            c5189020l.nickname_update_reminder = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 207:
                            c5189020l.avatar_update_reminder = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 208:
                            c5189020l.is_activity_user = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 209:
                            c5189020l.room_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 210:
                            c5189020l.video_unread_info = C616502ap.ADAPTER.decode(protoReader);
                            break;
                        case 211:
                            c5189020l.is_life_style = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 212:
                            c5189020l.stitch_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 213:
                            c5189020l.qa_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 214:
                            c5189020l.badge_info = C02DU.ADAPTER.decode(protoReader);
                            break;
                        case 215:
                            c5189020l.social_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 216:
                            c5189020l.story_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 217:
                            c5189020l.matched_friend = C546202Ay.ADAPTER.decode(protoReader);
                            break;
                        case 218:
                            c5189020l.friends_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 219:
                            c5189020l.user_now_pack_info = C670802ja.ADAPTER.decode(protoReader);
                            break;
                        case 220:
                            c5189020l.is_user_data_miss = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 221:
                            c5189020l.is_in_same_note_exp_group = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 222:
                            c5189020l.can_message_follow_status_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 223:
                            c5189020l.fake_data_info = C556002Es.ADAPTER.decode(protoReader);
                            break;
                        case 224:
                            c5189020l.avatar_meta_info_list.add(C02HO.ADAPTER.decode(protoReader));
                            break;
                        case 225:
                            c5189020l.social_avatar_without_background = C02EX.ADAPTER.decode(protoReader);
                            break;
                        case 226:
                            c5189020l.dynamic_social_avatar = C02EX.ADAPTER.decode(protoReader);
                            break;
                        case 227:
                            c5189020l.user_all_story_metadata = C027V.ADAPTER.decode(protoReader);
                            break;
                        case 228:
                            c5189020l.is_mute = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 229:
                            c5189020l.is_mute_non_story_post = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 230:
                            c5189020l.is_mute_story = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 231:
                            c5189020l.is_mute_lives = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 232:
                            c5189020l.enabled_filter_all_comments = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 233:
                            c5189020l.vbadge_entitlement = C725802sS.ADAPTER.decode(protoReader);
                            break;
                        case 234:
                            c5189020l.is_verified_tako = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5189020l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5189020l c5189020l) {
            C5189020l c5189020l2 = c5189020l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5189020l2.uid) + protoAdapter.encodedSizeWithTag(2, c5189020l2.short_id) + protoAdapter.encodedSizeWithTag(3, c5189020l2.nickname);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5189020l2.gender) + protoAdapter.encodedSizeWithTag(5, c5189020l2.signature);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c5189020l2.avatar_larger) + protoAdapter3.encodedSizeWithTag(7, c5189020l2.avatar_thumb) + protoAdapter3.encodedSizeWithTag(8, c5189020l2.avatar_medium) + protoAdapter.encodedSizeWithTag(9, c5189020l2.birthday) + protoAdapter2.encodedSizeWithTag(12, c5189020l2.follow_status) + protoAdapter2.encodedSizeWithTag(13, c5189020l2.aweme_count) + protoAdapter2.encodedSizeWithTag(14, c5189020l2.following_count) + protoAdapter2.encodedSizeWithTag(15, c5189020l2.follower_count) + protoAdapter2.encodedSizeWithTag(16, c5189020l2.favoriting_count) + protoAdapter2.encodedSizeWithTag(17, c5189020l2.total_favorited);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(18, c5189020l2.is_block) + protoAdapter4.encodedSizeWithTag(20, c5189020l2.hide_search) + protoAdapter.encodedSizeWithTag(25, c5189020l2.custom_verify) + protoAdapter.encodedSizeWithTag(26, c5189020l2.unique_id) + protoAdapter.encodedSizeWithTag(27, c5189020l2.bind_phone) + protoAdapter2.encodedSizeWithTag(28, c5189020l2.special_lock) + protoAdapter2.encodedSizeWithTag(29, c5189020l2.need_recommend) + protoAdapter.encodedSizeWithTag(36, c5189020l2.recommend_reason) + protoAdapter4.encodedSizeWithTag(37, c5189020l2.has_facebook_token) + protoAdapter4.encodedSizeWithTag(38, c5189020l2.has_twitter_token) + protoAdapter2.encodedSizeWithTag(39, c5189020l2.fb_expire_time) + protoAdapter2.encodedSizeWithTag(40, c5189020l2.tw_expire_time) + protoAdapter4.encodedSizeWithTag(41, c5189020l2.has_youtube_token) + protoAdapter2.encodedSizeWithTag(42, c5189020l2.youtube_expire_time);
            ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(43, c5189020l2.room_id) + protoAdapter2.encodedSizeWithTag(44, c5189020l2.live_verify) + protoAdapter5.encodedSizeWithTag(45, c5189020l2.authority_status) + protoAdapter.encodedSizeWithTag(46, c5189020l2.verify_info) + protoAdapter2.encodedSizeWithTag(47, c5189020l2.shield_follow_notice) + protoAdapter2.encodedSizeWithTag(48, c5189020l2.shield_digg_notice) + protoAdapter2.encodedSizeWithTag(49, c5189020l2.shield_comment_notice) + C5271023p.ADAPTER.encodedSizeWithTag(53, c5189020l2.share_info) + protoAdapter4.encodedSizeWithTag(54, c5189020l2.with_commerce_entry) + protoAdapter2.encodedSizeWithTag(55, c5189020l2.verification_type) + C02DR.ADAPTER.encodedSizeWithTag(56, c5189020l2.original_musician) + protoAdapter.encodedSizeWithTag(58, c5189020l2.enterprise_verify_reason) + protoAdapter4.encodedSizeWithTag(59, c5189020l2.is_ad_fake) + protoAdapter2.encodedSizeWithTag(61, c5189020l2.mplatform_followers_count) + C02CU.ADAPTER.asRepeated().encodedSizeWithTag(62, c5189020l2.followers_detail) + protoAdapter.encodedSizeWithTag(64, c5189020l2.region) + protoAdapter.encodedSizeWithTag(65, c5189020l2.account_region) + protoAdapter2.encodedSizeWithTag(67, c5189020l2.commerce_user_level) + AnonymousClass0284.ADAPTER.encodedSizeWithTag(68, c5189020l2.commerce_info) + protoAdapter2.encodedSizeWithTag(69, c5189020l2.live_agreement) + C02G0.ADAPTER.asRepeated().encodedSizeWithTag(70, c5189020l2.platform_sync_info) + protoAdapter4.encodedSizeWithTag(71, c5189020l2.with_shop_entry) + protoAdapter4.encodedSizeWithTag(72, c5189020l2.is_discipline_member) + protoAdapter2.encodedSizeWithTag(73, c5189020l2.secret) + protoAdapter4.encodedSizeWithTag(74, c5189020l2.has_orders) + protoAdapter4.encodedSizeWithTag(75, c5189020l2.prevent_download) + protoAdapter4.encodedSizeWithTag(76, c5189020l2.show_image_bubble) + protoAdapter.asRepeated().encodedSizeWithTag(77, c5189020l2.geofencing) + protoAdapter2.encodedSizeWithTag(78, c5189020l2.unique_id_modify_time) + protoAdapter3.encodedSizeWithTag(79, c5189020l2.video_icon) + protoAdapter.encodedSizeWithTag(80, c5189020l2.ins_id) + protoAdapter.encodedSizeWithTag(81, c5189020l2.google_account) + protoAdapter.encodedSizeWithTag(82, c5189020l2.youtube_channel_id) + protoAdapter.encodedSizeWithTag(83, c5189020l2.youtube_channel_title) + protoAdapter2.encodedSizeWithTag(84, c5189020l2.apple_account) + protoAdapter4.encodedSizeWithTag(86, c5189020l2.with_fusion_shop_entry) + protoAdapter4.encodedSizeWithTag(87, c5189020l2.is_phone_binded) + protoAdapter2.encodedSizeWithTag(88, c5189020l2.login_platform) + protoAdapter4.encodedSizeWithTag(89, c5189020l2.accept_private_policy) + protoAdapter.encodedSizeWithTag(91, c5189020l2.twitter_id) + protoAdapter.encodedSizeWithTag(92, c5189020l2.twitter_name) + protoAdapter4.encodedSizeWithTag(93, c5189020l2.user_canceled) + protoAdapter4.encodedSizeWithTag(94, c5189020l2.has_email) + protoAdapter2.encodedSizeWithTag(97, c5189020l2.live_agreement_time) + protoAdapter5.encodedSizeWithTag(98, c5189020l2.register_time) + protoAdapter2.encodedSizeWithTag(99, c5189020l2.status) + protoAdapter5.encodedSizeWithTag(101, c5189020l2.create_time) + protoAdapter.encodedSizeWithTag(102, c5189020l2.avatar_uri) + protoAdapter2.encodedSizeWithTag(103, c5189020l2.follower_status) + protoAdapter2.encodedSizeWithTag(105, c5189020l2.comment_setting) + protoAdapter2.encodedSizeWithTag(106, c5189020l2.duet_setting) + protoAdapter5.encodedSizeWithTag(107, c5189020l2.reflow_page_gid) + protoAdapter5.encodedSizeWithTag(108, c5189020l2.reflow_page_uid) + protoAdapter2.encodedSizeWithTag(109, c5189020l2.user_rate) + protoAdapter4.encodedSizeWithTag(110, c5189020l2.with_new_goods) + protoAdapter4.encodedSizeWithTag(111, c5189020l2.is_flowcard_member) + protoAdapter3.encodedSizeWithTag(112, c5189020l2.room_cover) + protoAdapter2.encodedSizeWithTag(113, c5189020l2.download_setting) + protoAdapter5.encodedSizeWithTag(114, c5189020l2.download_prompt_ts) + protoAdapter2.encodedSizeWithTag(115, c5189020l2.react_setting) + protoAdapter4.encodedSizeWithTag(116, c5189020l2.live_commerce) + protoAdapter.encodedSizeWithTag(119, c5189020l2.country) + protoAdapter.encodedSizeWithTag(120, c5189020l2.province) + protoAdapter.encodedSizeWithTag(121, c5189020l2.city) + protoAdapter3.asRepeated().encodedSizeWithTag(122, c5189020l2.cover_url) + protoAdapter.encodedSizeWithTag(123, c5189020l2.recommend_reason_relation) + protoAdapter.encodedSizeWithTag(124, c5189020l2.iso_country_code) + protoAdapter.encodedSizeWithTag(126, c5189020l2.district) + protoAdapter.encodedSizeWithTag(127, c5189020l2.language) + protoAdapter.encodedSizeWithTag(128, c5189020l2.room_type_tag) + protoAdapter4.encodedSizeWithTag(130, c5189020l2.has_insights) + protoAdapter.encodedSizeWithTag(131, c5189020l2.remark_name) + protoAdapter.encodedSizeWithTag(132, c5189020l2.video_icon_virtual_URI) + protoAdapter.encodedSizeWithTag(133, c5189020l2.share_qrcode_uri) + protoAdapter2.encodedSizeWithTag(134, c5189020l2.profile_tab_type) + C02UV.ADAPTER.encodedSizeWithTag(135, c5189020l2.avatar_decoration) + protoAdapter4.encodedSizeWithTag(136, c5189020l2.watch_status) + protoAdapter4.encodedSizeWithTag(137, c5189020l2.with_commerce_newbie_task) + protoAdapter4.encodedSizeWithTag(138, c5189020l2.with_item_commerce_entry) + protoAdapter2.encodedSizeWithTag(139, c5189020l2.star_billboard_rank) + protoAdapter2.encodedSizeWithTag(140, c5189020l2.education) + protoAdapter4.encodedSizeWithTag(141, c5189020l2.can_modify_school_info) + protoAdapter2.encodedSizeWithTag(142, c5189020l2.school_visible) + protoAdapter3.encodedSizeWithTag(143, c5189020l2.avatar_pendant_larger) + protoAdapter3.encodedSizeWithTag(144, c5189020l2.avatar_pendant_thumb) + protoAdapter3.encodedSizeWithTag(145, c5189020l2.avatar_pendant_medium) + C02E0.ADAPTER.asRepeated().encodedSizeWithTag(146, c5189020l2.item_list) + protoAdapter2.encodedSizeWithTag(147, c5189020l2.user_mode) + protoAdapter2.encodedSizeWithTag(148, c5189020l2.user_period) + protoAdapter4.encodedSizeWithTag(149, c5189020l2.is_effect_artist) + C668702jF.ADAPTER.encodedSizeWithTag(150, c5189020l2.effect_detail) + C664002iU.ADAPTER.encodedSizeWithTag(151, c5189020l2.commerce_permissions) + C625702cJ.ADAPTER.encodedSizeWithTag(152, c5189020l2.life_story_block) + protoAdapter2.encodedSizeWithTag(153, c5189020l2.hide_following_follower_list) + protoAdapter4.encodedSizeWithTag(158, c5189020l2.is_star) + protoAdapter.encodedSizeWithTag(160, c5189020l2.cv_level) + protoAdapter2.encodedSizeWithTag(161, c5189020l2.creator_level) + protoAdapter4.encodedSizeWithTag(162, c5189020l2.is_mirror) + protoAdapter2.encodedSizeWithTag(163, c5189020l2.pr_exempt) + protoAdapter5.asRepeated().encodedSizeWithTag(164, c5189020l2.type_label) + protoAdapter5.encodedSizeWithTag(165, c5189020l2.avatar_decoration_id) + protoAdapter3.asRepeated().encodedSizeWithTag(167, c5189020l2.ad_cover_url) + C633902dd.ADAPTER.encodedSizeWithTag(168, c5189020l2.ad_cover_title) + protoAdapter.encodedSizeWithTag(169, c5189020l2.ad_order_id) + C02WE.ADAPTER.encodedSizeWithTag(170, c5189020l2.r_fans_group_info) + protoAdapter4.encodedSizeWithTag(171, c5189020l2.with_commerce_enterprise_tab_entry) + C658902hf.ADAPTER.encodedSizeWithTag(172, c5189020l2.honor_info) + protoAdapter2.encodedSizeWithTag(173, c5189020l2.comment_filter_status) + protoAdapter2.encodedSizeWithTag(174, c5189020l2.notify_private_account) + protoAdapter3.encodedSizeWithTag(175, c5189020l2.avatar_168x168) + protoAdapter3.encodedSizeWithTag(176, c5189020l2.avatar_300x300) + protoAdapter4.encodedSizeWithTag(177, c5189020l2.is_blocked) + protoAdapter4.encodedSizeWithTag(178, c5189020l2.force_private_account) + protoAdapter4.encodedSizeWithTag(179, c5189020l2.with_star_atlas_entry) + C02CX.ADAPTER.encodedSizeWithTag(180, c5189020l2.sprint_support_user_info) + protoAdapter.encodedSizeWithTag(181, c5189020l2.signature_language) + C02BH.ADAPTER.encodedSizeWithTag(182, c5189020l2.brand_info) + protoAdapter4.encodedSizeWithTag(183, c5189020l2.display_wvalantine_activity_entry) + protoAdapter.encodedSizeWithTag(184, c5189020l2.shop_micro_app) + C549302Cd.ADAPTER.encodedSizeWithTag(185, c5189020l2.commerce_user_info) + C02B7.ADAPTER.asRepeated().encodedSizeWithTag(186, c5189020l2.relative_users) + C02HI.ADAPTER.encodedSizeWithTag(187, c5189020l2.quick_shop_info) + C021F.ADAPTER.asRepeated().encodedSizeWithTag(189, c5189020l2.cha_list) + protoAdapter4.encodedSizeWithTag(190, c5189020l2.is_minor) + protoAdapter.encodedSizeWithTag(191, c5189020l2.sec_uid) + ProtoAdapter.DOUBLE.encodedSizeWithTag(192, c5189020l2.recommend_score) + C556702Ez.ADAPTER.encodedSizeWithTag(195, c5189020l2.general_permission) + protoAdapter2.encodedSizeWithTag(196, c5189020l2.birthday_hide_level) + protoAdapter.encodedSizeWithTag(197, c5189020l2.bio_url) + protoAdapter.encodedSizeWithTag(198, c5189020l2.bio_email) + protoAdapter5.encodedSizeWithTag(199, c5189020l2.latest_order_time) + protoAdapter4.encodedSizeWithTag(200, c5189020l2.is_pro_account) + protoAdapter.encodedSizeWithTag(202, c5189020l2.email) + protoAdapter4.encodedSizeWithTag(203, c5189020l2.is_email_verified) + protoAdapter.encodedSizeWithTag(204, c5189020l2.bio_secure_url) + protoAdapter2.encodedSizeWithTag(205, c5189020l2.collect_count) + protoAdapter4.encodedSizeWithTag(206, c5189020l2.nickname_update_reminder) + protoAdapter4.encodedSizeWithTag(207, c5189020l2.avatar_update_reminder) + protoAdapter4.encodedSizeWithTag(208, c5189020l2.is_activity_user) + protoAdapter.encodedSizeWithTag(209, c5189020l2.room_data) + C616502ap.ADAPTER.encodedSizeWithTag(210, c5189020l2.video_unread_info) + protoAdapter4.encodedSizeWithTag(211, c5189020l2.is_life_style) + protoAdapter2.encodedSizeWithTag(212, c5189020l2.stitch_setting) + protoAdapter2.encodedSizeWithTag(213, c5189020l2.qa_status) + C02DU.ADAPTER.encodedSizeWithTag(214, c5189020l2.badge_info) + protoAdapter.encodedSizeWithTag(215, c5189020l2.social_info) + protoAdapter2.encodedSizeWithTag(216, c5189020l2.story_status) + C546202Ay.ADAPTER.encodedSizeWithTag(217, c5189020l2.matched_friend) + protoAdapter2.encodedSizeWithTag(218, c5189020l2.friends_status) + C670802ja.ADAPTER.encodedSizeWithTag(219, c5189020l2.user_now_pack_info) + protoAdapter4.encodedSizeWithTag(220, c5189020l2.is_user_data_miss) + protoAdapter4.encodedSizeWithTag(221, c5189020l2.is_in_same_note_exp_group) + protoAdapter2.asRepeated().encodedSizeWithTag(222, c5189020l2.can_message_follow_status_list) + C556002Es.ADAPTER.encodedSizeWithTag(223, c5189020l2.fake_data_info) + C02HO.ADAPTER.asRepeated().encodedSizeWithTag(224, c5189020l2.avatar_meta_info_list);
            ProtoAdapter<C02EX> protoAdapter6 = C02EX.ADAPTER;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(225, c5189020l2.social_avatar_without_background) + protoAdapter6.encodedSizeWithTag(226, c5189020l2.dynamic_social_avatar) + C027V.ADAPTER.encodedSizeWithTag(227, c5189020l2.user_all_story_metadata) + protoAdapter2.encodedSizeWithTag(228, c5189020l2.is_mute) + protoAdapter2.encodedSizeWithTag(229, c5189020l2.is_mute_non_story_post) + protoAdapter2.encodedSizeWithTag(230, c5189020l2.is_mute_story) + protoAdapter2.encodedSizeWithTag(231, c5189020l2.is_mute_lives) + protoAdapter4.encodedSizeWithTag(232, c5189020l2.enabled_filter_all_comments) + C725802sS.ADAPTER.encodedSizeWithTag(233, c5189020l2.vbadge_entitlement) + protoAdapter2.encodedSizeWithTag(234, c5189020l2.is_verified_tako) + c5189020l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5189020l c5189020l) {
            C5189020l c5189020l2 = c5189020l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5189020l2.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c5189020l2.short_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c5189020l2.nickname);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c5189020l2.gender);
            protoAdapter.encodeWithTag(protoWriter, 5, c5189020l2.signature);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 6, c5189020l2.avatar_larger);
            protoAdapter3.encodeWithTag(protoWriter, 7, c5189020l2.avatar_thumb);
            protoAdapter3.encodeWithTag(protoWriter, 8, c5189020l2.avatar_medium);
            protoAdapter.encodeWithTag(protoWriter, 9, c5189020l2.birthday);
            protoAdapter2.encodeWithTag(protoWriter, 12, c5189020l2.follow_status);
            protoAdapter2.encodeWithTag(protoWriter, 13, c5189020l2.aweme_count);
            protoAdapter2.encodeWithTag(protoWriter, 14, c5189020l2.following_count);
            protoAdapter2.encodeWithTag(protoWriter, 15, c5189020l2.follower_count);
            protoAdapter2.encodeWithTag(protoWriter, 16, c5189020l2.favoriting_count);
            protoAdapter2.encodeWithTag(protoWriter, 17, c5189020l2.total_favorited);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 18, c5189020l2.is_block);
            protoAdapter4.encodeWithTag(protoWriter, 20, c5189020l2.hide_search);
            protoAdapter.encodeWithTag(protoWriter, 25, c5189020l2.custom_verify);
            protoAdapter.encodeWithTag(protoWriter, 26, c5189020l2.unique_id);
            protoAdapter.encodeWithTag(protoWriter, 27, c5189020l2.bind_phone);
            protoAdapter2.encodeWithTag(protoWriter, 28, c5189020l2.special_lock);
            protoAdapter2.encodeWithTag(protoWriter, 29, c5189020l2.need_recommend);
            protoAdapter.encodeWithTag(protoWriter, 36, c5189020l2.recommend_reason);
            protoAdapter4.encodeWithTag(protoWriter, 37, c5189020l2.has_facebook_token);
            protoAdapter4.encodeWithTag(protoWriter, 38, c5189020l2.has_twitter_token);
            protoAdapter2.encodeWithTag(protoWriter, 39, c5189020l2.fb_expire_time);
            protoAdapter2.encodeWithTag(protoWriter, 40, c5189020l2.tw_expire_time);
            protoAdapter4.encodeWithTag(protoWriter, 41, c5189020l2.has_youtube_token);
            protoAdapter2.encodeWithTag(protoWriter, 42, c5189020l2.youtube_expire_time);
            ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
            protoAdapter5.encodeWithTag(protoWriter, 43, c5189020l2.room_id);
            protoAdapter2.encodeWithTag(protoWriter, 44, c5189020l2.live_verify);
            protoAdapter5.encodeWithTag(protoWriter, 45, c5189020l2.authority_status);
            protoAdapter.encodeWithTag(protoWriter, 46, c5189020l2.verify_info);
            protoAdapter2.encodeWithTag(protoWriter, 47, c5189020l2.shield_follow_notice);
            protoAdapter2.encodeWithTag(protoWriter, 48, c5189020l2.shield_digg_notice);
            protoAdapter2.encodeWithTag(protoWriter, 49, c5189020l2.shield_comment_notice);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 53, c5189020l2.share_info);
            protoAdapter4.encodeWithTag(protoWriter, 54, c5189020l2.with_commerce_entry);
            protoAdapter2.encodeWithTag(protoWriter, 55, c5189020l2.verification_type);
            C02DR.ADAPTER.encodeWithTag(protoWriter, 56, c5189020l2.original_musician);
            protoAdapter.encodeWithTag(protoWriter, 58, c5189020l2.enterprise_verify_reason);
            protoAdapter4.encodeWithTag(protoWriter, 59, c5189020l2.is_ad_fake);
            protoAdapter2.encodeWithTag(protoWriter, 61, c5189020l2.mplatform_followers_count);
            C02CU.ADAPTER.asRepeated().encodeWithTag(protoWriter, 62, c5189020l2.followers_detail);
            protoAdapter.encodeWithTag(protoWriter, 64, c5189020l2.region);
            protoAdapter.encodeWithTag(protoWriter, 65, c5189020l2.account_region);
            protoAdapter2.encodeWithTag(protoWriter, 67, c5189020l2.commerce_user_level);
            AnonymousClass0284.ADAPTER.encodeWithTag(protoWriter, 68, c5189020l2.commerce_info);
            protoAdapter2.encodeWithTag(protoWriter, 69, c5189020l2.live_agreement);
            C02G0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 70, c5189020l2.platform_sync_info);
            protoAdapter4.encodeWithTag(protoWriter, 71, c5189020l2.with_shop_entry);
            protoAdapter4.encodeWithTag(protoWriter, 72, c5189020l2.is_discipline_member);
            protoAdapter2.encodeWithTag(protoWriter, 73, c5189020l2.secret);
            protoAdapter4.encodeWithTag(protoWriter, 74, c5189020l2.has_orders);
            protoAdapter4.encodeWithTag(protoWriter, 75, c5189020l2.prevent_download);
            protoAdapter4.encodeWithTag(protoWriter, 76, c5189020l2.show_image_bubble);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 77, c5189020l2.geofencing);
            protoAdapter2.encodeWithTag(protoWriter, 78, c5189020l2.unique_id_modify_time);
            protoAdapter3.encodeWithTag(protoWriter, 79, c5189020l2.video_icon);
            protoAdapter.encodeWithTag(protoWriter, 80, c5189020l2.ins_id);
            protoAdapter.encodeWithTag(protoWriter, 81, c5189020l2.google_account);
            protoAdapter.encodeWithTag(protoWriter, 82, c5189020l2.youtube_channel_id);
            protoAdapter.encodeWithTag(protoWriter, 83, c5189020l2.youtube_channel_title);
            protoAdapter2.encodeWithTag(protoWriter, 84, c5189020l2.apple_account);
            protoAdapter4.encodeWithTag(protoWriter, 86, c5189020l2.with_fusion_shop_entry);
            protoAdapter4.encodeWithTag(protoWriter, 87, c5189020l2.is_phone_binded);
            protoAdapter2.encodeWithTag(protoWriter, 88, c5189020l2.login_platform);
            protoAdapter4.encodeWithTag(protoWriter, 89, c5189020l2.accept_private_policy);
            protoAdapter.encodeWithTag(protoWriter, 91, c5189020l2.twitter_id);
            protoAdapter.encodeWithTag(protoWriter, 92, c5189020l2.twitter_name);
            protoAdapter4.encodeWithTag(protoWriter, 93, c5189020l2.user_canceled);
            protoAdapter4.encodeWithTag(protoWriter, 94, c5189020l2.has_email);
            protoAdapter2.encodeWithTag(protoWriter, 97, c5189020l2.live_agreement_time);
            protoAdapter5.encodeWithTag(protoWriter, 98, c5189020l2.register_time);
            protoAdapter2.encodeWithTag(protoWriter, 99, c5189020l2.status);
            protoAdapter5.encodeWithTag(protoWriter, 101, c5189020l2.create_time);
            protoAdapter.encodeWithTag(protoWriter, 102, c5189020l2.avatar_uri);
            protoAdapter2.encodeWithTag(protoWriter, 103, c5189020l2.follower_status);
            protoAdapter2.encodeWithTag(protoWriter, 105, c5189020l2.comment_setting);
            protoAdapter2.encodeWithTag(protoWriter, 106, c5189020l2.duet_setting);
            protoAdapter5.encodeWithTag(protoWriter, 107, c5189020l2.reflow_page_gid);
            protoAdapter5.encodeWithTag(protoWriter, 108, c5189020l2.reflow_page_uid);
            protoAdapter2.encodeWithTag(protoWriter, 109, c5189020l2.user_rate);
            protoAdapter4.encodeWithTag(protoWriter, 110, c5189020l2.with_new_goods);
            protoAdapter4.encodeWithTag(protoWriter, 111, c5189020l2.is_flowcard_member);
            protoAdapter3.encodeWithTag(protoWriter, 112, c5189020l2.room_cover);
            protoAdapter2.encodeWithTag(protoWriter, 113, c5189020l2.download_setting);
            protoAdapter5.encodeWithTag(protoWriter, 114, c5189020l2.download_prompt_ts);
            protoAdapter2.encodeWithTag(protoWriter, 115, c5189020l2.react_setting);
            protoAdapter4.encodeWithTag(protoWriter, 116, c5189020l2.live_commerce);
            protoAdapter.encodeWithTag(protoWriter, 119, c5189020l2.country);
            protoAdapter.encodeWithTag(protoWriter, 120, c5189020l2.province);
            protoAdapter.encodeWithTag(protoWriter, 121, c5189020l2.city);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 122, c5189020l2.cover_url);
            protoAdapter.encodeWithTag(protoWriter, 123, c5189020l2.recommend_reason_relation);
            protoAdapter.encodeWithTag(protoWriter, 124, c5189020l2.iso_country_code);
            protoAdapter.encodeWithTag(protoWriter, 126, c5189020l2.district);
            protoAdapter.encodeWithTag(protoWriter, 127, c5189020l2.language);
            protoAdapter.encodeWithTag(protoWriter, 128, c5189020l2.room_type_tag);
            protoAdapter4.encodeWithTag(protoWriter, 130, c5189020l2.has_insights);
            protoAdapter.encodeWithTag(protoWriter, 131, c5189020l2.remark_name);
            protoAdapter.encodeWithTag(protoWriter, 132, c5189020l2.video_icon_virtual_URI);
            protoAdapter.encodeWithTag(protoWriter, 133, c5189020l2.share_qrcode_uri);
            protoAdapter2.encodeWithTag(protoWriter, 134, c5189020l2.profile_tab_type);
            C02UV.ADAPTER.encodeWithTag(protoWriter, 135, c5189020l2.avatar_decoration);
            protoAdapter4.encodeWithTag(protoWriter, 136, c5189020l2.watch_status);
            protoAdapter4.encodeWithTag(protoWriter, 137, c5189020l2.with_commerce_newbie_task);
            protoAdapter4.encodeWithTag(protoWriter, 138, c5189020l2.with_item_commerce_entry);
            protoAdapter2.encodeWithTag(protoWriter, 139, c5189020l2.star_billboard_rank);
            protoAdapter2.encodeWithTag(protoWriter, 140, c5189020l2.education);
            protoAdapter4.encodeWithTag(protoWriter, 141, c5189020l2.can_modify_school_info);
            protoAdapter2.encodeWithTag(protoWriter, 142, c5189020l2.school_visible);
            protoAdapter3.encodeWithTag(protoWriter, 143, c5189020l2.avatar_pendant_larger);
            protoAdapter3.encodeWithTag(protoWriter, 144, c5189020l2.avatar_pendant_thumb);
            protoAdapter3.encodeWithTag(protoWriter, 145, c5189020l2.avatar_pendant_medium);
            C02E0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 146, c5189020l2.item_list);
            protoAdapter2.encodeWithTag(protoWriter, 147, c5189020l2.user_mode);
            protoAdapter2.encodeWithTag(protoWriter, 148, c5189020l2.user_period);
            protoAdapter4.encodeWithTag(protoWriter, 149, c5189020l2.is_effect_artist);
            C668702jF.ADAPTER.encodeWithTag(protoWriter, 150, c5189020l2.effect_detail);
            C664002iU.ADAPTER.encodeWithTag(protoWriter, 151, c5189020l2.commerce_permissions);
            C625702cJ.ADAPTER.encodeWithTag(protoWriter, 152, c5189020l2.life_story_block);
            protoAdapter2.encodeWithTag(protoWriter, 153, c5189020l2.hide_following_follower_list);
            protoAdapter4.encodeWithTag(protoWriter, 158, c5189020l2.is_star);
            protoAdapter.encodeWithTag(protoWriter, 160, c5189020l2.cv_level);
            protoAdapter2.encodeWithTag(protoWriter, 161, c5189020l2.creator_level);
            protoAdapter4.encodeWithTag(protoWriter, 162, c5189020l2.is_mirror);
            protoAdapter2.encodeWithTag(protoWriter, 163, c5189020l2.pr_exempt);
            protoAdapter5.asRepeated().encodeWithTag(protoWriter, 164, c5189020l2.type_label);
            protoAdapter5.encodeWithTag(protoWriter, 165, c5189020l2.avatar_decoration_id);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 167, c5189020l2.ad_cover_url);
            C633902dd.ADAPTER.encodeWithTag(protoWriter, 168, c5189020l2.ad_cover_title);
            protoAdapter.encodeWithTag(protoWriter, 169, c5189020l2.ad_order_id);
            C02WE.ADAPTER.encodeWithTag(protoWriter, 170, c5189020l2.r_fans_group_info);
            protoAdapter4.encodeWithTag(protoWriter, 171, c5189020l2.with_commerce_enterprise_tab_entry);
            C658902hf.ADAPTER.encodeWithTag(protoWriter, 172, c5189020l2.honor_info);
            protoAdapter2.encodeWithTag(protoWriter, 173, c5189020l2.comment_filter_status);
            protoAdapter2.encodeWithTag(protoWriter, 174, c5189020l2.notify_private_account);
            protoAdapter3.encodeWithTag(protoWriter, 175, c5189020l2.avatar_168x168);
            protoAdapter3.encodeWithTag(protoWriter, 176, c5189020l2.avatar_300x300);
            protoAdapter4.encodeWithTag(protoWriter, 177, c5189020l2.is_blocked);
            protoAdapter4.encodeWithTag(protoWriter, 178, c5189020l2.force_private_account);
            protoAdapter4.encodeWithTag(protoWriter, 179, c5189020l2.with_star_atlas_entry);
            C02CX.ADAPTER.encodeWithTag(protoWriter, 180, c5189020l2.sprint_support_user_info);
            protoAdapter.encodeWithTag(protoWriter, 181, c5189020l2.signature_language);
            C02BH.ADAPTER.encodeWithTag(protoWriter, 182, c5189020l2.brand_info);
            protoAdapter4.encodeWithTag(protoWriter, 183, c5189020l2.display_wvalantine_activity_entry);
            protoAdapter.encodeWithTag(protoWriter, 184, c5189020l2.shop_micro_app);
            C549302Cd.ADAPTER.encodeWithTag(protoWriter, 185, c5189020l2.commerce_user_info);
            C02B7.ADAPTER.asRepeated().encodeWithTag(protoWriter, 186, c5189020l2.relative_users);
            C02HI.ADAPTER.encodeWithTag(protoWriter, 187, c5189020l2.quick_shop_info);
            C021F.ADAPTER.asRepeated().encodeWithTag(protoWriter, 189, c5189020l2.cha_list);
            protoAdapter4.encodeWithTag(protoWriter, 190, c5189020l2.is_minor);
            protoAdapter.encodeWithTag(protoWriter, 191, c5189020l2.sec_uid);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 192, c5189020l2.recommend_score);
            C556702Ez.ADAPTER.encodeWithTag(protoWriter, 195, c5189020l2.general_permission);
            protoAdapter2.encodeWithTag(protoWriter, 196, c5189020l2.birthday_hide_level);
            protoAdapter.encodeWithTag(protoWriter, 197, c5189020l2.bio_url);
            protoAdapter.encodeWithTag(protoWriter, 198, c5189020l2.bio_email);
            protoAdapter5.encodeWithTag(protoWriter, 199, c5189020l2.latest_order_time);
            protoAdapter4.encodeWithTag(protoWriter, 200, c5189020l2.is_pro_account);
            protoAdapter.encodeWithTag(protoWriter, 202, c5189020l2.email);
            protoAdapter4.encodeWithTag(protoWriter, 203, c5189020l2.is_email_verified);
            protoAdapter.encodeWithTag(protoWriter, 204, c5189020l2.bio_secure_url);
            protoAdapter2.encodeWithTag(protoWriter, 205, c5189020l2.collect_count);
            protoAdapter4.encodeWithTag(protoWriter, 206, c5189020l2.nickname_update_reminder);
            protoAdapter4.encodeWithTag(protoWriter, 207, c5189020l2.avatar_update_reminder);
            protoAdapter4.encodeWithTag(protoWriter, 208, c5189020l2.is_activity_user);
            protoAdapter.encodeWithTag(protoWriter, 209, c5189020l2.room_data);
            C616502ap.ADAPTER.encodeWithTag(protoWriter, 210, c5189020l2.video_unread_info);
            protoAdapter4.encodeWithTag(protoWriter, 211, c5189020l2.is_life_style);
            protoAdapter2.encodeWithTag(protoWriter, 212, c5189020l2.stitch_setting);
            protoAdapter2.encodeWithTag(protoWriter, 213, c5189020l2.qa_status);
            C02DU.ADAPTER.encodeWithTag(protoWriter, 214, c5189020l2.badge_info);
            protoAdapter.encodeWithTag(protoWriter, 215, c5189020l2.social_info);
            protoAdapter2.encodeWithTag(protoWriter, 216, c5189020l2.story_status);
            C546202Ay.ADAPTER.encodeWithTag(protoWriter, 217, c5189020l2.matched_friend);
            protoAdapter2.encodeWithTag(protoWriter, 218, c5189020l2.friends_status);
            C670802ja.ADAPTER.encodeWithTag(protoWriter, 219, c5189020l2.user_now_pack_info);
            protoAdapter4.encodeWithTag(protoWriter, 220, c5189020l2.is_user_data_miss);
            protoAdapter4.encodeWithTag(protoWriter, 221, c5189020l2.is_in_same_note_exp_group);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 222, c5189020l2.can_message_follow_status_list);
            C556002Es.ADAPTER.encodeWithTag(protoWriter, 223, c5189020l2.fake_data_info);
            C02HO.ADAPTER.asRepeated().encodeWithTag(protoWriter, 224, c5189020l2.avatar_meta_info_list);
            ProtoAdapter<C02EX> protoAdapter6 = C02EX.ADAPTER;
            protoAdapter6.encodeWithTag(protoWriter, 225, c5189020l2.social_avatar_without_background);
            protoAdapter6.encodeWithTag(protoWriter, 226, c5189020l2.dynamic_social_avatar);
            C027V.ADAPTER.encodeWithTag(protoWriter, 227, c5189020l2.user_all_story_metadata);
            protoAdapter2.encodeWithTag(protoWriter, 228, c5189020l2.is_mute);
            protoAdapter2.encodeWithTag(protoWriter, 229, c5189020l2.is_mute_non_story_post);
            protoAdapter2.encodeWithTag(protoWriter, 230, c5189020l2.is_mute_story);
            protoAdapter2.encodeWithTag(protoWriter, 231, c5189020l2.is_mute_lives);
            protoAdapter4.encodeWithTag(protoWriter, 232, c5189020l2.enabled_filter_all_comments);
            C725802sS.ADAPTER.encodeWithTag(protoWriter, 233, c5189020l2.vbadge_entitlement);
            protoAdapter2.encodeWithTag(protoWriter, 234, c5189020l2.is_verified_tako);
            protoWriter.writeBytes(c5189020l2.unknownFields());
        }
    };
    public Boolean accept_private_policy;
    public String account_region;
    public C633902dd ad_cover_title;
    public List<C673002jw> ad_cover_url;
    public String ad_order_id;
    public Integer apple_account;
    public Long authority_status;
    public C673002jw avatar_168x168;
    public C673002jw avatar_300x300;
    public C02UV avatar_decoration;
    public Long avatar_decoration_id;
    public C673002jw avatar_larger;
    public C673002jw avatar_medium;
    public List<C02HO> avatar_meta_info_list;
    public C673002jw avatar_pendant_larger;
    public C673002jw avatar_pendant_medium;
    public C673002jw avatar_pendant_thumb;
    public C673002jw avatar_thumb;
    public Boolean avatar_update_reminder;
    public String avatar_uri;
    public Integer aweme_count;
    public C02DU badge_info;
    public String bind_phone;
    public String bio_email;
    public String bio_secure_url;
    public String bio_url;
    public String birthday;
    public Integer birthday_hide_level;
    public C02BH brand_info;
    public List<Integer> can_message_follow_status_list;
    public Boolean can_modify_school_info;
    public List<C021F> cha_list;
    public String city;
    public Integer collect_count;
    public Integer comment_filter_status;
    public Integer comment_setting;
    public AnonymousClass0284 commerce_info;
    public C664002iU commerce_permissions;
    public C549302Cd commerce_user_info;
    public Integer commerce_user_level;
    public String country;
    public List<C673002jw> cover_url;
    public Long create_time;
    public Integer creator_level;
    public String custom_verify;
    public String cv_level;
    public Boolean display_wvalantine_activity_entry;
    public String district;
    public Long download_prompt_ts;
    public Integer download_setting;
    public Integer duet_setting;
    public C02EX dynamic_social_avatar;
    public Integer education;
    public C668702jF effect_detail;
    public String email;
    public Boolean enabled_filter_all_comments;
    public String enterprise_verify_reason;
    public C556002Es fake_data_info;
    public Integer favoriting_count;
    public Integer fb_expire_time;
    public Integer follow_status;
    public Integer follower_count;
    public Integer follower_status;
    public List<C02CU> followers_detail;
    public Integer following_count;
    public Boolean force_private_account;
    public Integer friends_status;
    public Integer gender;
    public C556702Ez general_permission;
    public List<String> geofencing;
    public String google_account;
    public Boolean has_email;
    public Boolean has_facebook_token;
    public Boolean has_insights;
    public Boolean has_orders;
    public Boolean has_twitter_token;
    public Boolean has_youtube_token;
    public Integer hide_following_follower_list;
    public Boolean hide_search;
    public C658902hf honor_info;
    public String ins_id;
    public Boolean is_activity_user;
    public Boolean is_ad_fake;
    public Boolean is_block;
    public Boolean is_blocked;
    public Boolean is_discipline_member;
    public Boolean is_effect_artist;
    public Boolean is_email_verified;
    public Boolean is_flowcard_member;
    public Boolean is_in_same_note_exp_group;
    public Boolean is_life_style;
    public Boolean is_minor;
    public Boolean is_mirror;
    public Integer is_mute;
    public Integer is_mute_lives;
    public Integer is_mute_non_story_post;
    public Integer is_mute_story;
    public Boolean is_phone_binded;
    public Boolean is_pro_account;
    public Boolean is_star;
    public Boolean is_user_data_miss;
    public Integer is_verified_tako;
    public String iso_country_code;
    public List<C02E0> item_list;
    public String language;
    public Long latest_order_time;
    public C625702cJ life_story_block;
    public Integer live_agreement;
    public Integer live_agreement_time;
    public Boolean live_commerce;
    public Integer live_verify;
    public Integer login_platform;
    public C546202Ay matched_friend;
    public Integer mplatform_followers_count;
    public Integer need_recommend;
    public String nickname;
    public Boolean nickname_update_reminder;
    public Integer notify_private_account;
    public C02DR original_musician;
    public List<C02G0> platform_sync_info;
    public Integer pr_exempt;
    public Boolean prevent_download;
    public Integer profile_tab_type;
    public String province;
    public Integer qa_status;
    public C02HI quick_shop_info;
    public C02WE r_fans_group_info;
    public Integer react_setting;
    public String recommend_reason;
    public String recommend_reason_relation;
    public Double recommend_score;
    public Long reflow_page_gid;
    public Long reflow_page_uid;
    public String region;
    public Long register_time;
    public List<C02B7> relative_users;
    public String remark_name;
    public C673002jw room_cover;
    public String room_data;
    public Long room_id;
    public String room_type_tag;
    public Integer school_visible;
    public String sec_uid;
    public Integer secret;
    public C5271023p share_info;
    public String share_qrcode_uri;
    public Integer shield_comment_notice;
    public Integer shield_digg_notice;
    public Integer shield_follow_notice;
    public String shop_micro_app;
    public String short_id;
    public Boolean show_image_bubble;
    public String signature;
    public String signature_language;
    public C02EX social_avatar_without_background;
    public String social_info;
    public Integer special_lock;
    public C02CX sprint_support_user_info;
    public Integer star_billboard_rank;
    public Integer status;
    public Integer stitch_setting;
    public Integer story_status;
    public Integer total_favorited;
    public Integer tw_expire_time;
    public String twitter_id;
    public String twitter_name;
    public List<Long> type_label;
    public String uid;
    public String unique_id;
    public Integer unique_id_modify_time;
    public C027V user_all_story_metadata;
    public Boolean user_canceled;
    public Integer user_mode;
    public C670802ja user_now_pack_info;
    public Integer user_period;
    public Integer user_rate;
    public C725802sS vbadge_entitlement;
    public Integer verification_type;
    public String verify_info;
    public C673002jw video_icon;
    public String video_icon_virtual_URI;
    public C616502ap video_unread_info;
    public Boolean watch_status;
    public Boolean with_commerce_enterprise_tab_entry;
    public Boolean with_commerce_entry;
    public Boolean with_commerce_newbie_task;
    public Boolean with_fusion_shop_entry;
    public Boolean with_item_commerce_entry;
    public Boolean with_new_goods;
    public Boolean with_shop_entry;
    public Boolean with_star_atlas_entry;
    public String youtube_channel_id;
    public String youtube_channel_title;
    public Integer youtube_expire_time;

    public C5189020l() {
        super(ADAPTER, ByteString.EMPTY);
        this.followers_detail = C1516540pZE.LJIIIIZZ();
        this.platform_sync_info = C1516540pZE.LJIIIIZZ();
        this.geofencing = C1516540pZE.LJIIIIZZ();
        this.cover_url = C1516540pZE.LJIIIIZZ();
        this.item_list = C1516540pZE.LJIIIIZZ();
        this.type_label = C1516540pZE.LJIIIIZZ();
        this.ad_cover_url = C1516540pZE.LJIIIIZZ();
        this.relative_users = C1516540pZE.LJIIIIZZ();
        this.cha_list = C1516540pZE.LJIIIIZZ();
        this.can_message_follow_status_list = C1516540pZE.LJIIIIZZ();
        this.avatar_meta_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
