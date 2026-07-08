package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Dxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272791Dxd extends Message<C2272791Dxd, C2272801Dxe> {
    public static final ProtoAdapter<C2272791Dxd> ADAPTER = new ProtoAdapter<C2272791Dxd>() { // from class: X.1Dxc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272791Dxd decode(ProtoReader protoReader) {
            C2272791Dxd c2272791Dxd = new C2272791Dxd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2272791Dxd.collection_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2272791Dxd.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2272791Dxd.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2272791Dxd.cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2272791Dxd.creator_uid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2272791Dxd.publish_timestamp = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2272791Dxd.create_timestamp = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2272791Dxd.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2272791Dxd.num_sales = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2272791Dxd.num_ratings = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2272791Dxd.avg_rating = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2272791Dxd.num_videos = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2272791Dxd.total_duration = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c2272791Dxd.has_user_purchased = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            c2272791Dxd.can_user_review = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c2272791Dxd.can_user_refund = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2272791Dxd.trigger_review_total_watch_time_threshold = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2272791Dxd.trigger_review_total_video_completion_threshold = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c2272791Dxd.video_completion_threshold = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c2272791Dxd.refund_total_watch_time_threshold = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c2272791Dxd.paid_videos.add(C2268861DrI.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c2272791Dxd.collection_moderation_info = C1C06.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c2272791Dxd.creator = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c2272791Dxd.avg_rating_float = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 25:
                            c2272791Dxd.price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c2272791Dxd.should_prompt_review = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 27:
                            c2272791Dxd.refund_scenario = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 28:
                            c2272791Dxd.has_voucher = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            c2272791Dxd.discounted_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c2272791Dxd.voucher_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 31:
                            c2272791Dxd.voucher_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 32:
                            c2272791Dxd.voucher_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c2272791Dxd.voucher_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c2272791Dxd.web_payment_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 35:
                            c2272791Dxd.web_price = C2251451DAh.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c2272791Dxd.web_voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 37:
                            c2272791Dxd.review_section = C2226911CDx.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            c2272791Dxd.is_eager_review_displayed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            c2272791Dxd.is_standard_review_displayed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            c2272791Dxd.replace_rating_with_cta = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 41:
                            c2272791Dxd.is_favorited = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 42:
                            c2272791Dxd.voucher_is_countdown = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 43:
                            c2272791Dxd.voucher_expiration_timestamp = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 44:
                            c2272791Dxd.voucher_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 45:
                            c2272791Dxd.enable_single_video_purchase = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 46:
                            c2272791Dxd.single_video_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            c2272791Dxd.has_user_partial_purchased = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 48:
                            c2272791Dxd.purchased_videos_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 49:
                            c2272791Dxd.num_purchased_videos = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            c2272791Dxd.has_confirmed_purchase = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 51:
                            c2272791Dxd.display_sales_allowed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 52:
                            c2272791Dxd.num_watched = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 53:
                            c2272791Dxd.tv_rating = C656502hH.ADAPTER.decode(protoReader);
                            break;
                        case 54:
                            c2272791Dxd.category = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 55:
                            c2272791Dxd.tab_range_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 56:
                            c2272791Dxd.is_limited_free = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 57:
                            c2272791Dxd.show_limited_free_pop = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 58:
                            c2272791Dxd.bottom_bar_subtitle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 59:
                            c2272791Dxd.episode_panel_subtitle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 60:
                            c2272791Dxd.should_hide_share_button = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 61:
                            c2272791Dxd.should_hide_favorite_button = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c2272791Dxd.should_hide_report_button = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 63:
                            c2272791Dxd.free_tag_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 64:
                            c2272791Dxd.bottom_bar_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 65:
                            c2272791Dxd.bottom_bar_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2272791Dxd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2272791Dxd c2272791Dxd) {
            C2272791Dxd c2272791Dxd2 = c2272791Dxd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2272791Dxd2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2272791Dxd2.name) + protoAdapter2.encodedSizeWithTag(3, c2272791Dxd2.description) + C673002jw.ADAPTER.encodedSizeWithTag(4, c2272791Dxd2.cover) + protoAdapter.encodedSizeWithTag(5, c2272791Dxd2.creator_uid) + protoAdapter.encodedSizeWithTag(6, c2272791Dxd2.publish_timestamp) + protoAdapter.encodedSizeWithTag(7, c2272791Dxd2.create_timestamp);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c2272791Dxd2.status) + protoAdapter.encodedSizeWithTag(9, c2272791Dxd2.num_sales) + protoAdapter.encodedSizeWithTag(10, c2272791Dxd2.num_ratings) + protoAdapter2.encodedSizeWithTag(11, c2272791Dxd2.avg_rating) + protoAdapter3.encodedSizeWithTag(12, c2272791Dxd2.num_videos) + protoAdapter.encodedSizeWithTag(13, c2272791Dxd2.total_duration);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, c2272791Dxd2.has_user_purchased) + protoAdapter4.encodedSizeWithTag(15, c2272791Dxd2.can_user_review) + protoAdapter4.encodedSizeWithTag(16, c2272791Dxd2.can_user_refund) + protoAdapter.encodedSizeWithTag(17, c2272791Dxd2.trigger_review_total_watch_time_threshold) + protoAdapter3.encodedSizeWithTag(18, c2272791Dxd2.trigger_review_total_video_completion_threshold) + ProtoAdapter.DOUBLE.encodedSizeWithTag(19, c2272791Dxd2.video_completion_threshold) + protoAdapter3.encodedSizeWithTag(20, c2272791Dxd2.refund_total_watch_time_threshold) + C2268861DrI.ADAPTER.asRepeated().encodedSizeWithTag(21, c2272791Dxd2.paid_videos) + C1C06.ADAPTER.encodedSizeWithTag(22, c2272791Dxd2.collection_moderation_info) + C5189020l.ADAPTER.encodedSizeWithTag(23, c2272791Dxd2.creator) + ProtoAdapter.FLOAT.encodedSizeWithTag(24, c2272791Dxd2.avg_rating_float);
            ProtoAdapter<C1615780s9I> protoAdapter5 = C1615780s9I.ADAPTER;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(25, c2272791Dxd2.price) + protoAdapter4.encodedSizeWithTag(26, c2272791Dxd2.should_prompt_review) + protoAdapter3.encodedSizeWithTag(27, c2272791Dxd2.refund_scenario) + protoAdapter4.encodedSizeWithTag(28, c2272791Dxd2.has_voucher) + protoAdapter5.encodedSizeWithTag(29, c2272791Dxd2.discounted_price) + protoAdapter.encodedSizeWithTag(30, c2272791Dxd2.voucher_id) + protoAdapter3.encodedSizeWithTag(31, c2272791Dxd2.voucher_status) + protoAdapter2.encodedSizeWithTag(32, c2272791Dxd2.voucher_tag) + protoAdapter2.encodedSizeWithTag(33, c2272791Dxd2.voucher_description) + protoAdapter2.encodedSizeWithTag(34, c2272791Dxd2.web_payment_link) + C2251451DAh.ADAPTER.encodedSizeWithTag(35, c2272791Dxd2.web_price) + protoAdapter2.encodedSizeWithTag(36, c2272791Dxd2.web_voucher_id) + C2226911CDx.ADAPTER.encodedSizeWithTag(37, c2272791Dxd2.review_section) + protoAdapter4.encodedSizeWithTag(38, c2272791Dxd2.is_eager_review_displayed) + protoAdapter4.encodedSizeWithTag(39, c2272791Dxd2.is_standard_review_displayed) + protoAdapter4.encodedSizeWithTag(40, c2272791Dxd2.replace_rating_with_cta) + protoAdapter4.encodedSizeWithTag(41, c2272791Dxd2.is_favorited) + protoAdapter4.encodedSizeWithTag(42, c2272791Dxd2.voucher_is_countdown) + protoAdapter.encodedSizeWithTag(43, c2272791Dxd2.voucher_expiration_timestamp) + protoAdapter3.encodedSizeWithTag(44, c2272791Dxd2.voucher_type) + protoAdapter4.encodedSizeWithTag(45, c2272791Dxd2.enable_single_video_purchase) + protoAdapter5.encodedSizeWithTag(46, c2272791Dxd2.single_video_price) + protoAdapter4.encodedSizeWithTag(47, c2272791Dxd2.has_user_partial_purchased) + protoAdapter2.encodedSizeWithTag(48, c2272791Dxd2.purchased_videos_text) + protoAdapter3.encodedSizeWithTag(49, c2272791Dxd2.num_purchased_videos) + protoAdapter4.encodedSizeWithTag(50, c2272791Dxd2.has_confirmed_purchase) + protoAdapter4.encodedSizeWithTag(51, c2272791Dxd2.display_sales_allowed) + protoAdapter3.encodedSizeWithTag(52, c2272791Dxd2.num_watched) + C656502hH.ADAPTER.encodedSizeWithTag(53, c2272791Dxd2.tv_rating) + protoAdapter3.encodedSizeWithTag(54, c2272791Dxd2.category) + protoAdapter3.encodedSizeWithTag(55, c2272791Dxd2.tab_range_size) + protoAdapter4.encodedSizeWithTag(56, c2272791Dxd2.is_limited_free) + protoAdapter4.encodedSizeWithTag(57, c2272791Dxd2.show_limited_free_pop) + protoAdapter2.encodedSizeWithTag(58, c2272791Dxd2.bottom_bar_subtitle) + protoAdapter2.encodedSizeWithTag(59, c2272791Dxd2.episode_panel_subtitle) + protoAdapter4.encodedSizeWithTag(60, c2272791Dxd2.should_hide_share_button) + protoAdapter4.encodedSizeWithTag(61, c2272791Dxd2.should_hide_favorite_button) + protoAdapter4.encodedSizeWithTag(62, c2272791Dxd2.should_hide_report_button) + protoAdapter2.encodedSizeWithTag(63, c2272791Dxd2.free_tag_text) + protoAdapter2.encodedSizeWithTag(64, c2272791Dxd2.bottom_bar_title) + protoAdapter2.encodedSizeWithTag(65, c2272791Dxd2.bottom_bar_desc) + c2272791Dxd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2272791Dxd c2272791Dxd) {
            C2272791Dxd c2272791Dxd2 = c2272791Dxd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2272791Dxd2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2272791Dxd2.name);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2272791Dxd2.description);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c2272791Dxd2.cover);
            protoAdapter.encodeWithTag(protoWriter, 5, c2272791Dxd2.creator_uid);
            protoAdapter.encodeWithTag(protoWriter, 6, c2272791Dxd2.publish_timestamp);
            protoAdapter.encodeWithTag(protoWriter, 7, c2272791Dxd2.create_timestamp);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 8, c2272791Dxd2.status);
            protoAdapter.encodeWithTag(protoWriter, 9, c2272791Dxd2.num_sales);
            protoAdapter.encodeWithTag(protoWriter, 10, c2272791Dxd2.num_ratings);
            protoAdapter2.encodeWithTag(protoWriter, 11, c2272791Dxd2.avg_rating);
            protoAdapter3.encodeWithTag(protoWriter, 12, c2272791Dxd2.num_videos);
            protoAdapter.encodeWithTag(protoWriter, 13, c2272791Dxd2.total_duration);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 14, c2272791Dxd2.has_user_purchased);
            protoAdapter4.encodeWithTag(protoWriter, 15, c2272791Dxd2.can_user_review);
            protoAdapter4.encodeWithTag(protoWriter, 16, c2272791Dxd2.can_user_refund);
            protoAdapter.encodeWithTag(protoWriter, 17, c2272791Dxd2.trigger_review_total_watch_time_threshold);
            protoAdapter3.encodeWithTag(protoWriter, 18, c2272791Dxd2.trigger_review_total_video_completion_threshold);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 19, c2272791Dxd2.video_completion_threshold);
            protoAdapter3.encodeWithTag(protoWriter, 20, c2272791Dxd2.refund_total_watch_time_threshold);
            C2268861DrI.ADAPTER.asRepeated().encodeWithTag(protoWriter, 21, c2272791Dxd2.paid_videos);
            C1C06.ADAPTER.encodeWithTag(protoWriter, 22, c2272791Dxd2.collection_moderation_info);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 23, c2272791Dxd2.creator);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 24, c2272791Dxd2.avg_rating_float);
            ProtoAdapter<C1615780s9I> protoAdapter5 = C1615780s9I.ADAPTER;
            protoAdapter5.encodeWithTag(protoWriter, 25, c2272791Dxd2.price);
            protoAdapter4.encodeWithTag(protoWriter, 26, c2272791Dxd2.should_prompt_review);
            protoAdapter3.encodeWithTag(protoWriter, 27, c2272791Dxd2.refund_scenario);
            protoAdapter4.encodeWithTag(protoWriter, 28, c2272791Dxd2.has_voucher);
            protoAdapter5.encodeWithTag(protoWriter, 29, c2272791Dxd2.discounted_price);
            protoAdapter.encodeWithTag(protoWriter, 30, c2272791Dxd2.voucher_id);
            protoAdapter3.encodeWithTag(protoWriter, 31, c2272791Dxd2.voucher_status);
            protoAdapter2.encodeWithTag(protoWriter, 32, c2272791Dxd2.voucher_tag);
            protoAdapter2.encodeWithTag(protoWriter, 33, c2272791Dxd2.voucher_description);
            protoAdapter2.encodeWithTag(protoWriter, 34, c2272791Dxd2.web_payment_link);
            C2251451DAh.ADAPTER.encodeWithTag(protoWriter, 35, c2272791Dxd2.web_price);
            protoAdapter2.encodeWithTag(protoWriter, 36, c2272791Dxd2.web_voucher_id);
            C2226911CDx.ADAPTER.encodeWithTag(protoWriter, 37, c2272791Dxd2.review_section);
            protoAdapter4.encodeWithTag(protoWriter, 38, c2272791Dxd2.is_eager_review_displayed);
            protoAdapter4.encodeWithTag(protoWriter, 39, c2272791Dxd2.is_standard_review_displayed);
            protoAdapter4.encodeWithTag(protoWriter, 40, c2272791Dxd2.replace_rating_with_cta);
            protoAdapter4.encodeWithTag(protoWriter, 41, c2272791Dxd2.is_favorited);
            protoAdapter4.encodeWithTag(protoWriter, 42, c2272791Dxd2.voucher_is_countdown);
            protoAdapter.encodeWithTag(protoWriter, 43, c2272791Dxd2.voucher_expiration_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 44, c2272791Dxd2.voucher_type);
            protoAdapter4.encodeWithTag(protoWriter, 45, c2272791Dxd2.enable_single_video_purchase);
            protoAdapter5.encodeWithTag(protoWriter, 46, c2272791Dxd2.single_video_price);
            protoAdapter4.encodeWithTag(protoWriter, 47, c2272791Dxd2.has_user_partial_purchased);
            protoAdapter2.encodeWithTag(protoWriter, 48, c2272791Dxd2.purchased_videos_text);
            protoAdapter3.encodeWithTag(protoWriter, 49, c2272791Dxd2.num_purchased_videos);
            protoAdapter4.encodeWithTag(protoWriter, 50, c2272791Dxd2.has_confirmed_purchase);
            protoAdapter4.encodeWithTag(protoWriter, 51, c2272791Dxd2.display_sales_allowed);
            protoAdapter3.encodeWithTag(protoWriter, 52, c2272791Dxd2.num_watched);
            C656502hH.ADAPTER.encodeWithTag(protoWriter, 53, c2272791Dxd2.tv_rating);
            protoAdapter3.encodeWithTag(protoWriter, 54, c2272791Dxd2.category);
            protoAdapter3.encodeWithTag(protoWriter, 55, c2272791Dxd2.tab_range_size);
            protoAdapter4.encodeWithTag(protoWriter, 56, c2272791Dxd2.is_limited_free);
            protoAdapter4.encodeWithTag(protoWriter, 57, c2272791Dxd2.show_limited_free_pop);
            protoAdapter2.encodeWithTag(protoWriter, 58, c2272791Dxd2.bottom_bar_subtitle);
            protoAdapter2.encodeWithTag(protoWriter, 59, c2272791Dxd2.episode_panel_subtitle);
            protoAdapter4.encodeWithTag(protoWriter, 60, c2272791Dxd2.should_hide_share_button);
            protoAdapter4.encodeWithTag(protoWriter, 61, c2272791Dxd2.should_hide_favorite_button);
            protoAdapter4.encodeWithTag(protoWriter, 62, c2272791Dxd2.should_hide_report_button);
            protoAdapter2.encodeWithTag(protoWriter, 63, c2272791Dxd2.free_tag_text);
            protoAdapter2.encodeWithTag(protoWriter, 64, c2272791Dxd2.bottom_bar_title);
            protoAdapter2.encodeWithTag(protoWriter, 65, c2272791Dxd2.bottom_bar_desc);
            protoWriter.writeBytes(c2272791Dxd2.unknownFields());
        }
    };
    public String avg_rating;
    public Float avg_rating_float;
    public String bottom_bar_desc;
    public String bottom_bar_subtitle;
    public String bottom_bar_title;
    public Boolean can_user_refund;
    public Boolean can_user_review;
    public Integer category;
    public Long collection_id;
    public C1C06 collection_moderation_info;
    public C673002jw cover;
    public Long create_timestamp;
    public C5189020l creator;
    public Long creator_uid;
    public String description;
    public C1615780s9I discounted_price;
    public Boolean display_sales_allowed;
    public Boolean enable_single_video_purchase;
    public String episode_panel_subtitle;
    public String free_tag_text;
    public Boolean has_confirmed_purchase;
    public Boolean has_user_partial_purchased;
    public Boolean has_user_purchased;
    public Boolean has_voucher;
    public Boolean is_eager_review_displayed;
    public Boolean is_favorited;
    public Boolean is_limited_free;
    public Boolean is_standard_review_displayed;
    public String name;
    public Integer num_purchased_videos;
    public Long num_ratings;
    public Long num_sales;
    public Integer num_videos;
    public Integer num_watched;
    public List<C2268861DrI> paid_videos;
    public C1615780s9I price;
    public Long publish_timestamp;
    public String purchased_videos_text;
    public Integer refund_scenario;
    public Integer refund_total_watch_time_threshold;
    public Boolean replace_rating_with_cta;
    public C2226911CDx review_section;
    public Boolean should_hide_favorite_button;
    public Boolean should_hide_report_button;
    public Boolean should_hide_share_button;
    public Boolean should_prompt_review;
    public Boolean show_limited_free_pop;
    public C1615780s9I single_video_price;
    public Integer status;
    public Integer tab_range_size;
    public Long total_duration;
    public Integer trigger_review_total_video_completion_threshold;
    public Long trigger_review_total_watch_time_threshold;
    public C656502hH tv_rating;
    public Double video_completion_threshold;
    public String voucher_description;
    public Long voucher_expiration_timestamp;
    public Long voucher_id;
    public Boolean voucher_is_countdown;
    public Integer voucher_status;
    public String voucher_tag;
    public Integer voucher_type;
    public String web_payment_link;
    public C2251451DAh web_price;
    public String web_voucher_id;

    public C2272791Dxd() {
        super(ADAPTER, ByteString.EMPTY);
        this.paid_videos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2272801Dxe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
