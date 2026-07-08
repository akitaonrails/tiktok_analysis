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

/* JADX INFO: renamed from: X.0s83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615010s83 extends Message<C1615010s83, C1615240s8Q> {
    public static final ProtoAdapter<C1615010s83> ADAPTER = new ProtoAdapter<C1615010s83>() { // from class: X.0s82
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1615010s83 decode(ProtoReader protoReader) {
            C1615010s83 c1615010s83 = new C1615010s83();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1615010s83.status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1615010s83.paid_videos.add(C2268861DrI.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1615010s83.page_info = C1615400s8g.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1615010s83.continue_watching_info = C1615530s8t.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1615010s83.has_purchased = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1615010s83.num_videos = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1615010s83.intro_preview_video = C2268861DrI.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c1615010s83.has_intro = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1615010s83.has_preview = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1615010s83.purchase_options.add(C1615030s85.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1615010s83.first_unpurchased_seq_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1615010s83.preselect_index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1615010s83.inner_feed_order_submission_exp = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c1615010s83.collection = C2272791Dxd.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c1615010s83.is_limited_free = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c1615010s83.show_limited_free_pop = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1615010s83.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1615010s83.biz_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c1615010s83.biz_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1615010s83.paywall_info = C1DA4.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c1615010s83.previous_paid_videos.add(C2268861DrI.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c1615010s83.current_aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c1615010s83.is_subscription_active = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c1615010s83.subscription_expired_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 25:
                            c1615010s83.purchase_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c1615010s83.enable_ad = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 27:
                            c1615010s83.ad_conf = C2223581C1c.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1615010s83;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1615010s83 c1615010s83) {
            C1615010s83 c1615010s832 = c1615010s83;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1615010s832.status_code);
            ProtoAdapter<C2268861DrI> protoAdapter2 = C2268861DrI.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(2, c1615010s832.paid_videos) + C1615400s8g.ADAPTER.encodedSizeWithTag(3, c1615010s832.page_info) + C1615530s8t.ADAPTER.encodedSizeWithTag(4, c1615010s832.continue_watching_info);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c1615010s832.has_purchased);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(6, c1615010s832.num_videos) + protoAdapter2.encodedSizeWithTag(7, c1615010s832.intro_preview_video) + protoAdapter3.encodedSizeWithTag(8, c1615010s832.has_intro) + protoAdapter3.encodedSizeWithTag(9, c1615010s832.has_preview) + C1615030s85.ADAPTER.asRepeated().encodedSizeWithTag(10, c1615010s832.purchase_options) + protoAdapter.encodedSizeWithTag(11, c1615010s832.first_unpurchased_seq_id) + protoAdapter.encodedSizeWithTag(12, c1615010s832.preselect_index) + protoAdapter.encodedSizeWithTag(13, c1615010s832.inner_feed_order_submission_exp) + C2272791Dxd.ADAPTER.encodedSizeWithTag(14, c1615010s832.collection) + protoAdapter3.encodedSizeWithTag(15, c1615010s832.is_limited_free) + protoAdapter3.encodedSizeWithTag(16, c1615010s832.show_limited_free_pop);
            ProtoAdapter<String> protoAdapter5 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(17, c1615010s832.status_msg) + protoAdapter.encodedSizeWithTag(18, c1615010s832.biz_code) + protoAdapter5.encodedSizeWithTag(19, c1615010s832.biz_msg) + C1DA4.ADAPTER.encodedSizeWithTag(20, c1615010s832.paywall_info) + protoAdapter2.asRepeated().encodedSizeWithTag(21, c1615010s832.previous_paid_videos) + protoAdapter5.encodedSizeWithTag(22, c1615010s832.current_aweme_id) + protoAdapter3.encodedSizeWithTag(23, c1615010s832.is_subscription_active) + protoAdapter4.encodedSizeWithTag(24, c1615010s832.subscription_expired_time) + protoAdapter5.encodedSizeWithTag(25, c1615010s832.purchase_schema) + protoAdapter3.encodedSizeWithTag(26, c1615010s832.enable_ad) + C2223581C1c.ADAPTER.encodedSizeWithTag(27, c1615010s832.ad_conf) + c1615010s832.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1615010s83 c1615010s83) {
            C1615010s83 c1615010s832 = c1615010s83;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1615010s832.status_code);
            ProtoAdapter<C2268861DrI> protoAdapter2 = C2268861DrI.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, c1615010s832.paid_videos);
            C1615400s8g.ADAPTER.encodeWithTag(protoWriter, 3, c1615010s832.page_info);
            C1615530s8t.ADAPTER.encodeWithTag(protoWriter, 4, c1615010s832.continue_watching_info);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 5, c1615010s832.has_purchased);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            protoAdapter4.encodeWithTag(protoWriter, 6, c1615010s832.num_videos);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1615010s832.intro_preview_video);
            protoAdapter3.encodeWithTag(protoWriter, 8, c1615010s832.has_intro);
            protoAdapter3.encodeWithTag(protoWriter, 9, c1615010s832.has_preview);
            C1615030s85.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, c1615010s832.purchase_options);
            protoAdapter.encodeWithTag(protoWriter, 11, c1615010s832.first_unpurchased_seq_id);
            protoAdapter.encodeWithTag(protoWriter, 12, c1615010s832.preselect_index);
            protoAdapter.encodeWithTag(protoWriter, 13, c1615010s832.inner_feed_order_submission_exp);
            C2272791Dxd.ADAPTER.encodeWithTag(protoWriter, 14, c1615010s832.collection);
            protoAdapter3.encodeWithTag(protoWriter, 15, c1615010s832.is_limited_free);
            protoAdapter3.encodeWithTag(protoWriter, 16, c1615010s832.show_limited_free_pop);
            ProtoAdapter<String> protoAdapter5 = ProtoAdapter.STRING;
            protoAdapter5.encodeWithTag(protoWriter, 17, c1615010s832.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 18, c1615010s832.biz_code);
            protoAdapter5.encodeWithTag(protoWriter, 19, c1615010s832.biz_msg);
            C1DA4.ADAPTER.encodeWithTag(protoWriter, 20, c1615010s832.paywall_info);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 21, c1615010s832.previous_paid_videos);
            protoAdapter5.encodeWithTag(protoWriter, 22, c1615010s832.current_aweme_id);
            protoAdapter3.encodeWithTag(protoWriter, 23, c1615010s832.is_subscription_active);
            protoAdapter4.encodeWithTag(protoWriter, 24, c1615010s832.subscription_expired_time);
            protoAdapter5.encodeWithTag(protoWriter, 25, c1615010s832.purchase_schema);
            protoAdapter3.encodeWithTag(protoWriter, 26, c1615010s832.enable_ad);
            C2223581C1c.ADAPTER.encodeWithTag(protoWriter, 27, c1615010s832.ad_conf);
            protoWriter.writeBytes(c1615010s832.unknownFields());
        }
    };
    public C2223581C1c ad_conf;
    public Integer biz_code;
    public String biz_msg;
    public C2272791Dxd collection;
    public C1615530s8t continue_watching_info;
    public String current_aweme_id;
    public Boolean enable_ad;
    public Integer first_unpurchased_seq_id;
    public Boolean has_intro;
    public Boolean has_preview;
    public Boolean has_purchased;
    public Integer inner_feed_order_submission_exp;
    public C2268861DrI intro_preview_video;
    public Boolean is_limited_free;
    public Boolean is_subscription_active;
    public Long num_videos;
    public C1615400s8g page_info;
    public List<C2268861DrI> paid_videos;
    public C1DA4 paywall_info;
    public Integer preselect_index;
    public List<C2268861DrI> previous_paid_videos;
    public List<C1615030s85> purchase_options;
    public String purchase_schema;
    public Boolean show_limited_free_pop;
    public Integer status_code;
    public String status_msg;
    public Long subscription_expired_time;

    public C1615010s83() {
        super(ADAPTER, ByteString.EMPTY);
        this.paid_videos = C1516540pZE.LJIIIIZZ();
        this.purchase_options = C1516540pZE.LJIIIIZZ();
        this.previous_paid_videos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1615240s8Q newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
