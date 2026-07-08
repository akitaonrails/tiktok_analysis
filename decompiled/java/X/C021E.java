package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.021E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021E extends Message<C021E, C02KW> {
    public static final ProtoAdapter<C021E> ADAPTER = new ProtoAdapter<C021E>() { // from class: X.0217
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021E decode(ProtoReader protoReader) {
            C021E c021e = new C021E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021e.paid_collection_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c021e.category = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c021e.episode_num = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c021e.should_show_series_purchase_label = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c021e.is_paid_collection_intro = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c021e.paid_video_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c021e.is_paid_video_encrypted = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c021e.should_show_preview = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021e.has_purchased = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c021e.price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021e.discounted_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021e.voucher_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021e.collection_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c021e.creator = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c021e.resume_timestamp = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c021e.has_purchased_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021e.is_partial_preview = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021e.has_partial_purchased_collection = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c021e.is_last_purchased_video_in_order = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021e.enable_single_video_purchase = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c021e.single_video_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c021e.tv_rating = C656502hH.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c021e.should_show_video_interactions = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c021e.display_prompt = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 25:
                            c021e.is_limited_free = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            c021e.collection_category_tags.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 27:
                            c021e.cover_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c021e.should_show_info_area = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            c021e.should_show_bottom_button = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            c021e.bottom_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            c021e.mini_drama_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            c021e.card_info = C5334026a.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c021e.is_subscription_active = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c021e.subscription_expired_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 35:
                            c021e.subscription_status = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c021e.subscription_cycle_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021E c021e) {
            C021E c021e2 = c021e;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c021e2.paid_collection_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c021e2.category) + protoAdapter.encodedSizeWithTag(3, c021e2.episode_num);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c021e2.should_show_series_purchase_label) + protoAdapter3.encodedSizeWithTag(5, c021e2.is_paid_collection_intro) + protoAdapter.encodedSizeWithTag(6, c021e2.paid_video_id) + protoAdapter3.encodedSizeWithTag(7, c021e2.is_paid_video_encrypted) + protoAdapter3.encodedSizeWithTag(8, c021e2.should_show_preview) + protoAdapter3.encodedSizeWithTag(9, c021e2.has_purchased);
            ProtoAdapter<C1615780s9I> protoAdapter4 = C1615780s9I.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(10, c021e2.price) + protoAdapter4.encodedSizeWithTag(11, c021e2.discounted_price) + protoAdapter.encodedSizeWithTag(12, c021e2.voucher_id);
            ProtoAdapter<String> protoAdapter5 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(13, c021e2.collection_name) + C5189020l.ADAPTER.encodedSizeWithTag(14, c021e2.creator) + protoAdapter.encodedSizeWithTag(15, c021e2.resume_timestamp) + protoAdapter3.encodedSizeWithTag(16, c021e2.has_purchased_video) + protoAdapter3.encodedSizeWithTag(17, c021e2.is_partial_preview) + protoAdapter3.encodedSizeWithTag(18, c021e2.has_partial_purchased_collection) + protoAdapter3.encodedSizeWithTag(19, c021e2.is_last_purchased_video_in_order) + protoAdapter3.encodedSizeWithTag(20, c021e2.enable_single_video_purchase) + protoAdapter4.encodedSizeWithTag(21, c021e2.single_video_price) + C656502hH.ADAPTER.encodedSizeWithTag(22, c021e2.tv_rating) + protoAdapter3.encodedSizeWithTag(23, c021e2.should_show_video_interactions) + protoAdapter2.encodedSizeWithTag(24, c021e2.display_prompt) + protoAdapter3.encodedSizeWithTag(25, c021e2.is_limited_free) + protoAdapter5.asRepeated().encodedSizeWithTag(26, c021e2.collection_category_tags) + C673002jw.ADAPTER.encodedSizeWithTag(27, c021e2.cover_url) + protoAdapter3.encodedSizeWithTag(28, c021e2.should_show_info_area) + protoAdapter3.encodedSizeWithTag(29, c021e2.should_show_bottom_button) + protoAdapter5.encodedSizeWithTag(30, c021e2.bottom_button_text) + protoAdapter5.encodedSizeWithTag(31, c021e2.mini_drama_info) + C5334026a.ADAPTER.encodedSizeWithTag(32, c021e2.card_info) + protoAdapter3.encodedSizeWithTag(33, c021e2.is_subscription_active) + protoAdapter.encodedSizeWithTag(34, c021e2.subscription_expired_time) + protoAdapter5.encodedSizeWithTag(35, c021e2.subscription_status) + protoAdapter5.encodedSizeWithTag(36, c021e2.subscription_cycle_type) + c021e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C021E c021e) {
            C021E c021e2 = c021e;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c021e2.paid_collection_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c021e2.category);
            protoAdapter.encodeWithTag(protoWriter, 3, c021e2.episode_num);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 4, c021e2.should_show_series_purchase_label);
            protoAdapter3.encodeWithTag(protoWriter, 5, c021e2.is_paid_collection_intro);
            protoAdapter.encodeWithTag(protoWriter, 6, c021e2.paid_video_id);
            protoAdapter3.encodeWithTag(protoWriter, 7, c021e2.is_paid_video_encrypted);
            protoAdapter3.encodeWithTag(protoWriter, 8, c021e2.should_show_preview);
            protoAdapter3.encodeWithTag(protoWriter, 9, c021e2.has_purchased);
            ProtoAdapter<C1615780s9I> protoAdapter4 = C1615780s9I.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 10, c021e2.price);
            protoAdapter4.encodeWithTag(protoWriter, 11, c021e2.discounted_price);
            protoAdapter.encodeWithTag(protoWriter, 12, c021e2.voucher_id);
            ProtoAdapter<String> protoAdapter5 = ProtoAdapter.STRING;
            protoAdapter5.encodeWithTag(protoWriter, 13, c021e2.collection_name);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 14, c021e2.creator);
            protoAdapter.encodeWithTag(protoWriter, 15, c021e2.resume_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 16, c021e2.has_purchased_video);
            protoAdapter3.encodeWithTag(protoWriter, 17, c021e2.is_partial_preview);
            protoAdapter3.encodeWithTag(protoWriter, 18, c021e2.has_partial_purchased_collection);
            protoAdapter3.encodeWithTag(protoWriter, 19, c021e2.is_last_purchased_video_in_order);
            protoAdapter3.encodeWithTag(protoWriter, 20, c021e2.enable_single_video_purchase);
            protoAdapter4.encodeWithTag(protoWriter, 21, c021e2.single_video_price);
            C656502hH.ADAPTER.encodeWithTag(protoWriter, 22, c021e2.tv_rating);
            protoAdapter3.encodeWithTag(protoWriter, 23, c021e2.should_show_video_interactions);
            protoAdapter2.encodeWithTag(protoWriter, 24, c021e2.display_prompt);
            protoAdapter3.encodeWithTag(protoWriter, 25, c021e2.is_limited_free);
            protoAdapter5.asRepeated().encodeWithTag(protoWriter, 26, c021e2.collection_category_tags);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 27, c021e2.cover_url);
            protoAdapter3.encodeWithTag(protoWriter, 28, c021e2.should_show_info_area);
            protoAdapter3.encodeWithTag(protoWriter, 29, c021e2.should_show_bottom_button);
            protoAdapter5.encodeWithTag(protoWriter, 30, c021e2.bottom_button_text);
            protoAdapter5.encodeWithTag(protoWriter, 31, c021e2.mini_drama_info);
            C5334026a.ADAPTER.encodeWithTag(protoWriter, 32, c021e2.card_info);
            protoAdapter3.encodeWithTag(protoWriter, 33, c021e2.is_subscription_active);
            protoAdapter.encodeWithTag(protoWriter, 34, c021e2.subscription_expired_time);
            protoAdapter5.encodeWithTag(protoWriter, 35, c021e2.subscription_status);
            protoAdapter5.encodeWithTag(protoWriter, 36, c021e2.subscription_cycle_type);
            protoWriter.writeBytes(c021e2.unknownFields());
        }
    };
    public String bottom_button_text;
    public C5334026a card_info;
    public Integer category;
    public List<String> collection_category_tags;
    public String collection_name;
    public C673002jw cover_url;
    public C5189020l creator;
    public C1615780s9I discounted_price;
    public Integer display_prompt;
    public Boolean enable_single_video_purchase;
    public Long episode_num;
    public Boolean has_partial_purchased_collection;
    public Boolean has_purchased;
    public Boolean has_purchased_video;
    public Boolean is_last_purchased_video_in_order;
    public Boolean is_limited_free;
    public Boolean is_paid_collection_intro;
    public Boolean is_paid_video_encrypted;
    public Boolean is_partial_preview;
    public Boolean is_subscription_active;
    public String mini_drama_info;
    public Long paid_collection_id;
    public Long paid_video_id;
    public C1615780s9I price;
    public Long resume_timestamp;
    public Boolean should_show_bottom_button;
    public Boolean should_show_info_area;
    public Boolean should_show_preview;
    public Boolean should_show_series_purchase_label;
    public Boolean should_show_video_interactions;
    public C1615780s9I single_video_price;
    public String subscription_cycle_type;
    public Long subscription_expired_time;
    public String subscription_status;
    public C656502hH tv_rating;
    public Long voucher_id;

    public C021E() {
        super(ADAPTER, ByteString.EMPTY);
        this.collection_category_tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
