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

/* JADX INFO: renamed from: X.0sH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620570sH1 extends Message<C1620570sH1, C1620580sH2> {
    public static final ProtoAdapter<C1620570sH1> ADAPTER = new ProtoAdapter<C1620570sH1>() { // from class: X.0sH0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620570sH1 decode(ProtoReader protoReader) {
            C1620570sH1 c1620570sH1 = new C1620570sH1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1620570sH1.status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1620570sH1.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1620570sH1.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1620570sH1.has_more = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1620570sH1.aweme_list.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1620570sH1.rid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1620570sH1.home_model = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1620570sH1.refresh_clear = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1620570sH1.extra = C624802cA.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1620570sH1.log_pb = C714102qZ.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1620570sH1.guide_word = C592602Su.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1620570sH1.preload_ads.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            c1620570sH1.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c1620570sH1.block_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c1620570sH1.preload_awemes.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1620570sH1.enable_re_rank = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1620570sH1.disable_adjust_for_cache = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c1620570sH1.showtime_gap_rsp_info = C2251131D9b.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1620570sH1.has_ad = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c1620570sH1.commerce_pitaya_info = C593702Tf.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c1620570sH1.topview_over_delivery_result = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c1620570sH1.proactive_login_config = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c1620570sH1.card_insert_results.add(C02FX.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            c1620570sH1.is_non_personalized = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            c1620570sH1.common_info_for_client = C1620470sGr.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620570sH1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620570sH1 c1620570sH1) {
            C1620570sH1 c1620570sH12 = c1620570sH1;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1620570sH12.status_code);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1620570sH12.min_cursor) + protoAdapter2.encodedSizeWithTag(3, c1620570sH12.max_cursor) + protoAdapter.encodedSizeWithTag(4, c1620570sH12.has_more);
            ProtoAdapter<C5186020i> protoAdapter3 = C5186020i.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(5, c1620570sH12.aweme_list);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(6, c1620570sH12.rid) + protoAdapter.encodedSizeWithTag(7, c1620570sH12.home_model) + protoAdapter.encodedSizeWithTag(8, c1620570sH12.refresh_clear) + C624802cA.ADAPTER.encodedSizeWithTag(9, c1620570sH12.extra) + C714102qZ.ADAPTER.encodedSizeWithTag(10, c1620570sH12.log_pb) + C592602Su.ADAPTER.encodedSizeWithTag(12, c1620570sH12.guide_word) + protoAdapter3.asRepeated().encodedSizeWithTag(13, c1620570sH12.preload_ads) + protoAdapter4.encodedSizeWithTag(14, c1620570sH12.status_msg) + protoAdapter.encodedSizeWithTag(15, c1620570sH12.block_code) + protoAdapter3.asRepeated().encodedSizeWithTag(16, c1620570sH12.preload_awemes);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(17, c1620570sH12.enable_re_rank) + protoAdapter5.encodedSizeWithTag(18, c1620570sH12.disable_adjust_for_cache) + C2251131D9b.ADAPTER.encodedSizeWithTag(19, c1620570sH12.showtime_gap_rsp_info) + protoAdapter5.encodedSizeWithTag(20, c1620570sH12.has_ad) + C593702Tf.ADAPTER.encodedSizeWithTag(21, c1620570sH12.commerce_pitaya_info) + protoAdapter4.encodedSizeWithTag(22, c1620570sH12.topview_over_delivery_result) + protoAdapter4.encodedSizeWithTag(23, c1620570sH12.proactive_login_config) + C02FX.ADAPTER.asRepeated().encodedSizeWithTag(24, c1620570sH12.card_insert_results) + protoAdapter5.encodedSizeWithTag(25, c1620570sH12.is_non_personalized) + C1620470sGr.ADAPTER.encodedSizeWithTag(26, c1620570sH12.common_info_for_client) + c1620570sH12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620570sH1 c1620570sH1) {
            C1620570sH1 c1620570sH12 = c1620570sH1;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1620570sH12.status_code);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1620570sH12.min_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1620570sH12.max_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, c1620570sH12.has_more);
            ProtoAdapter<C5186020i> protoAdapter3 = C5186020i.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, c1620570sH12.aweme_list);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            protoAdapter4.encodeWithTag(protoWriter, 6, c1620570sH12.rid);
            protoAdapter.encodeWithTag(protoWriter, 7, c1620570sH12.home_model);
            protoAdapter.encodeWithTag(protoWriter, 8, c1620570sH12.refresh_clear);
            C624802cA.ADAPTER.encodeWithTag(protoWriter, 9, c1620570sH12.extra);
            C714102qZ.ADAPTER.encodeWithTag(protoWriter, 10, c1620570sH12.log_pb);
            C592602Su.ADAPTER.encodeWithTag(protoWriter, 12, c1620570sH12.guide_word);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 13, c1620570sH12.preload_ads);
            protoAdapter4.encodeWithTag(protoWriter, 14, c1620570sH12.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 15, c1620570sH12.block_code);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 16, c1620570sH12.preload_awemes);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            protoAdapter5.encodeWithTag(protoWriter, 17, c1620570sH12.enable_re_rank);
            protoAdapter5.encodeWithTag(protoWriter, 18, c1620570sH12.disable_adjust_for_cache);
            C2251131D9b.ADAPTER.encodeWithTag(protoWriter, 19, c1620570sH12.showtime_gap_rsp_info);
            protoAdapter5.encodeWithTag(protoWriter, 20, c1620570sH12.has_ad);
            C593702Tf.ADAPTER.encodeWithTag(protoWriter, 21, c1620570sH12.commerce_pitaya_info);
            protoAdapter4.encodeWithTag(protoWriter, 22, c1620570sH12.topview_over_delivery_result);
            protoAdapter4.encodeWithTag(protoWriter, 23, c1620570sH12.proactive_login_config);
            C02FX.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, c1620570sH12.card_insert_results);
            protoAdapter5.encodeWithTag(protoWriter, 25, c1620570sH12.is_non_personalized);
            C1620470sGr.ADAPTER.encodeWithTag(protoWriter, 26, c1620570sH12.common_info_for_client);
            protoWriter.writeBytes(c1620570sH12.unknownFields());
        }
    };
    public List<C5186020i> aweme_list;
    public Integer block_code;
    public List<C02FX> card_insert_results;
    public C593702Tf commerce_pitaya_info;
    public C1620470sGr common_info_for_client;
    public Boolean disable_adjust_for_cache;
    public Boolean enable_re_rank;
    public C624802cA extra;
    public C592602Su guide_word;
    public Boolean has_ad;
    public Integer has_more;
    public Integer home_model;
    public Boolean is_non_personalized;
    public C714102qZ log_pb;
    public Long max_cursor;
    public Long min_cursor;
    public List<C5186020i> preload_ads;
    public List<C5186020i> preload_awemes;
    public String proactive_login_config;
    public Integer refresh_clear;
    public String rid;
    public C2251131D9b showtime_gap_rsp_info;
    public Integer status_code;
    public String status_msg;
    public String topview_over_delivery_result;

    public C1620570sH1() {
        super(ADAPTER, ByteString.EMPTY);
        this.aweme_list = C1516540pZE.LJIIIIZZ();
        this.preload_ads = C1516540pZE.LJIIIIZZ();
        this.preload_awemes = C1516540pZE.LJIIIIZZ();
        this.card_insert_results = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1620580sH2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
