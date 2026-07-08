package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.021y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5228021y extends Message<C5228021y, C02M3> {
    public static final ProtoAdapter<C5228021y> ADAPTER = new ProtoAdapter<C5228021y>() { // from class: X.021M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5228021y decode(ProtoReader protoReader) {
            C5228021y c5228021y = new C5228021y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5228021y.ad_auth_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5228021y.ad_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c5228021y.avoid_global_pendant = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c5228021y.with_comment_filter_words = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c5228021y.ad_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5228021y.prevent_share = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5228021y.study_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5228021y.is_ghost_ads = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5228021y.bc_label_test_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5228021y.digg_show_scene = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5228021y.adv_promotable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5228021y.branded_content_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5228021y.enable_mid_roll = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c5228021y.mid_roll_request_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c5228021y.mid_roll_replace_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c5228021y.disable_mid_roll_status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5228021y.is_pseudo_ad = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5228021y.pseudo_ad_data = C02BF.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5228021y.brand_organic_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5228021y.is_contextual_ad = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c5228021y.organic_log_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c5228021y.prevent_mission_duet_private = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 32:
                                    c5228021y.dark_post_source = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    c5228021y.dark_post_status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    c5228021y.is_diversion_ad = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 35:
                                    c5228021y.commerce_label_info = C665702il.ADAPTER.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    c5228021y.style_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 37:
                                    c5228021y.enable_ad_star_hub = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 38:
                                    c5228021y.mid_roll_type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 39:
                                    c5228021y.mid_roll_request_time_before_end = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 40:
                                    c5228021y.favorite_show_scene = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5228021y;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5228021y c5228021y) {
            C5228021y c5228021y2 = c5228021y;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5228021y2.ad_auth_status) + protoAdapter.encodedSizeWithTag(2, c5228021y2.ad_source);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5228021y2.avoid_global_pendant) + protoAdapter2.encodedSizeWithTag(4, c5228021y2.with_comment_filter_words) + protoAdapter.encodedSizeWithTag(5, c5228021y2.ad_style) + protoAdapter2.encodedSizeWithTag(6, c5228021y2.prevent_share);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5228021y2.study_id) + protoAdapter2.encodedSizeWithTag(8, c5228021y2.is_ghost_ads) + protoAdapter3.encodedSizeWithTag(9, c5228021y2.bc_label_test_text) + protoAdapter.encodedSizeWithTag(10, c5228021y2.digg_show_scene) + protoAdapter2.encodedSizeWithTag(11, c5228021y2.adv_promotable);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(12, c5228021y2.branded_content_type) + protoAdapter2.encodedSizeWithTag(13, c5228021y2.enable_mid_roll) + protoAdapter4.encodedSizeWithTag(14, c5228021y2.mid_roll_request_time) + protoAdapter4.encodedSizeWithTag(15, c5228021y2.mid_roll_replace_time) + protoAdapter.encodedSizeWithTag(16, c5228021y2.disable_mid_roll_status_code) + protoAdapter2.encodedSizeWithTag(17, c5228021y2.is_pseudo_ad) + C02BF.ADAPTER.encodedSizeWithTag(18, c5228021y2.pseudo_ad_data) + protoAdapter4.encodedSizeWithTag(19, c5228021y2.brand_organic_type) + protoAdapter2.encodedSizeWithTag(20, c5228021y2.is_contextual_ad) + protoAdapter3.encodedSizeWithTag(21, c5228021y2.organic_log_extra) + protoAdapter2.encodedSizeWithTag(22, c5228021y2.prevent_mission_duet_private) + protoAdapter.encodedSizeWithTag(32, c5228021y2.dark_post_source) + protoAdapter.encodedSizeWithTag(33, c5228021y2.dark_post_status) + protoAdapter.encodedSizeWithTag(34, c5228021y2.is_diversion_ad) + C665702il.ADAPTER.encodedSizeWithTag(35, c5228021y2.commerce_label_info) + protoAdapter3.encodedSizeWithTag(36, c5228021y2.style_info) + protoAdapter2.encodedSizeWithTag(37, c5228021y2.enable_ad_star_hub) + protoAdapter.encodedSizeWithTag(38, c5228021y2.mid_roll_type) + protoAdapter4.encodedSizeWithTag(39, c5228021y2.mid_roll_request_time_before_end) + protoAdapter.encodedSizeWithTag(40, c5228021y2.favorite_show_scene) + c5228021y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5228021y c5228021y) {
            C5228021y c5228021y2 = c5228021y;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c5228021y2.ad_auth_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c5228021y2.ad_source);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c5228021y2.avoid_global_pendant);
            protoAdapter2.encodeWithTag(protoWriter, 4, c5228021y2.with_comment_filter_words);
            protoAdapter.encodeWithTag(protoWriter, 5, c5228021y2.ad_style);
            protoAdapter2.encodeWithTag(protoWriter, 6, c5228021y2.prevent_share);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5228021y2.study_id);
            protoAdapter2.encodeWithTag(protoWriter, 8, c5228021y2.is_ghost_ads);
            protoAdapter3.encodeWithTag(protoWriter, 9, c5228021y2.bc_label_test_text);
            protoAdapter.encodeWithTag(protoWriter, 10, c5228021y2.digg_show_scene);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5228021y2.adv_promotable);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            protoAdapter4.encodeWithTag(protoWriter, 12, c5228021y2.branded_content_type);
            protoAdapter2.encodeWithTag(protoWriter, 13, c5228021y2.enable_mid_roll);
            protoAdapter4.encodeWithTag(protoWriter, 14, c5228021y2.mid_roll_request_time);
            protoAdapter4.encodeWithTag(protoWriter, 15, c5228021y2.mid_roll_replace_time);
            protoAdapter.encodeWithTag(protoWriter, 16, c5228021y2.disable_mid_roll_status_code);
            protoAdapter2.encodeWithTag(protoWriter, 17, c5228021y2.is_pseudo_ad);
            C02BF.ADAPTER.encodeWithTag(protoWriter, 18, c5228021y2.pseudo_ad_data);
            protoAdapter4.encodeWithTag(protoWriter, 19, c5228021y2.brand_organic_type);
            protoAdapter2.encodeWithTag(protoWriter, 20, c5228021y2.is_contextual_ad);
            protoAdapter3.encodeWithTag(protoWriter, 21, c5228021y2.organic_log_extra);
            protoAdapter2.encodeWithTag(protoWriter, 22, c5228021y2.prevent_mission_duet_private);
            protoAdapter.encodeWithTag(protoWriter, 32, c5228021y2.dark_post_source);
            protoAdapter.encodeWithTag(protoWriter, 33, c5228021y2.dark_post_status);
            protoAdapter.encodeWithTag(protoWriter, 34, c5228021y2.is_diversion_ad);
            C665702il.ADAPTER.encodeWithTag(protoWriter, 35, c5228021y2.commerce_label_info);
            protoAdapter3.encodeWithTag(protoWriter, 36, c5228021y2.style_info);
            protoAdapter2.encodeWithTag(protoWriter, 37, c5228021y2.enable_ad_star_hub);
            protoAdapter.encodeWithTag(protoWriter, 38, c5228021y2.mid_roll_type);
            protoAdapter4.encodeWithTag(protoWriter, 39, c5228021y2.mid_roll_request_time_before_end);
            protoAdapter.encodeWithTag(protoWriter, 40, c5228021y2.favorite_show_scene);
            protoWriter.writeBytes(c5228021y2.unknownFields());
        }
    };
    public Integer ad_auth_status;
    public Integer ad_source;
    public Integer ad_style;
    public Boolean adv_promotable;
    public Boolean avoid_global_pendant;
    public String bc_label_test_text;
    public Long brand_organic_type;
    public Long branded_content_type;
    public C665702il commerce_label_info;
    public Integer dark_post_source;
    public Integer dark_post_status;
    public Integer digg_show_scene;
    public Integer disable_mid_roll_status_code;
    public Boolean enable_ad_star_hub;
    public Boolean enable_mid_roll;
    public Integer favorite_show_scene;
    public Boolean is_contextual_ad;
    public Integer is_diversion_ad;
    public Boolean is_ghost_ads;
    public Boolean is_pseudo_ad;
    public Long mid_roll_replace_time;
    public Long mid_roll_request_time;
    public Long mid_roll_request_time_before_end;
    public Integer mid_roll_type;
    public String organic_log_extra;
    public Boolean prevent_mission_duet_private;
    public Boolean prevent_share;
    public C02BF pseudo_ad_data;
    public String study_id;
    public String style_info;
    public Boolean with_comment_filter_words;

    public C5228021y() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
