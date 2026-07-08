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

/* JADX INFO: renamed from: X.02So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C592002So extends Message<C592002So, C592202Sq> {
    public static final ProtoAdapter<C592002So> ADAPTER = new ProtoAdapter<C592002So>() { // from class: X.02Sp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C592002So decode(ProtoReader protoReader) {
            C592202Sq c592202Sq = new C592202Sq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c592202Sq.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c592202Sq.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c592202Sq.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c592202Sq.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c592202Sq.LJII.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c592202Sq.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c592202Sq.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c592202Sq.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c592202Sq.LJIIJJI = C624802cA.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c592202Sq.LJIIL = C714102qZ.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c592202Sq.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c592202Sq.LJIILJJIL = C592602Su.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c592202Sq.LJIILL.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            c592202Sq.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c592202Sq.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c592202Sq.LJIJ.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c592202Sq.LJIJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c592202Sq.LJIJJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c592202Sq.LJIJJLI = C2251131D9b.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c592202Sq.LJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c592202Sq.LJJ = C593702Tf.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c592202Sq.LJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c592202Sq.LJJIFFI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c592202Sq.LJJII.add(C02FX.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            c592202Sq.LJJIII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            c592202Sq.LJJIIJ = C5339026f.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            c592202Sq.LJJIIJZLJL = C592702Sv.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c592202Sq.LJJIIZ = C592802Sw.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            c592202Sq.LJJIIZI = C565902In.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c592202Sq.LJJIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            c592202Sq.LJJIJIIJI = C559702Gd.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            c592202Sq.LJJIJIIJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c592202Sq.LJJIJIL = C625002cC.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c592202Sq.LJJIJL.add(C707102pR.ADAPTER.decode(protoReader));
                            break;
                        case 35:
                            c592202Sq.LJJIJLIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c592202Sq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c592202Sq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C592002So c592002So) {
            C592002So c592002So2 = c592002So;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c592002So2.status_code);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c592002So2.min_cursor) + protoAdapter2.encodedSizeWithTag(3, c592002So2.max_cursor) + protoAdapter.encodedSizeWithTag(4, c592002So2.has_more);
            ProtoAdapter<C5186020i> protoAdapter3 = C5186020i.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(5, c592002So2.aweme_list);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(6, c592002So2.rid) + protoAdapter.encodedSizeWithTag(7, c592002So2.home_model) + protoAdapter.encodedSizeWithTag(8, c592002So2.refresh_clear) + C624802cA.ADAPTER.encodedSizeWithTag(9, c592002So2.extra) + C714102qZ.ADAPTER.encodedSizeWithTag(10, c592002So2.log_pb) + protoAdapter4.encodedSizeWithTag(11, c592002So2.DebugInfo) + C592602Su.ADAPTER.encodedSizeWithTag(12, c592002So2.guide_word) + protoAdapter3.asRepeated().encodedSizeWithTag(13, c592002So2.preload_ads) + protoAdapter4.encodedSizeWithTag(14, c592002So2.status_msg) + protoAdapter.encodedSizeWithTag(15, c592002So2.block_code) + protoAdapter3.asRepeated().encodedSizeWithTag(16, c592002So2.preload_awemes);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(17, c592002So2.enable_re_rank) + protoAdapter5.encodedSizeWithTag(18, c592002So2.disable_adjust_for_cache) + C2251131D9b.ADAPTER.encodedSizeWithTag(19, c592002So2.showtime_gap_rsp_info) + protoAdapter5.encodedSizeWithTag(20, c592002So2.has_ad) + C593702Tf.ADAPTER.encodedSizeWithTag(21, c592002So2.commerce_pitaya_info) + protoAdapter4.encodedSizeWithTag(22, c592002So2.topview_over_delivery_result) + protoAdapter4.encodedSizeWithTag(23, c592002So2.proactive_login_config) + C02FX.ADAPTER.asRepeated().encodedSizeWithTag(24, c592002So2.card_insert_results) + protoAdapter5.encodedSizeWithTag(25, c592002So2.is_non_personalized) + C5339026f.ADAPTER.encodedSizeWithTag(26, c592002So2.consistency_rsp) + C592702Sv.ADAPTER.encodedSizeWithTag(27, c592002So2.prompt) + C592802Sw.ADAPTER.encodedSizeWithTag(28, c592002So2.server_base_fcp_config) + C565902In.ADAPTER.encodedSizeWithTag(29, c592002So2.intervention_info) + protoAdapter4.encodedSizeWithTag(30, c592002So2.ocean_req_info) + C559702Gd.ADAPTER.encodedSizeWithTag(31, c592002So2.media_basic_info) + protoAdapter.encodedSizeWithTag(32, c592002So2.server_predicted_time) + C625002cC.ADAPTER.encodedSizeWithTag(33, c592002So2.server_deleted_live_info) + C707102pR.ADAPTER.asRepeated().encodedSizeWithTag(34, c592002So2.hybrid_ab_data) + protoAdapter.encodedSizeWithTag(35, c592002So2.nuj_insert_config) + c592002So2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C592002So c592002So) {
            C592002So c592002So2 = c592002So;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c592002So2.status_code);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c592002So2.min_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 3, c592002So2.max_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, c592002So2.has_more);
            ProtoAdapter<C5186020i> protoAdapter3 = C5186020i.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, c592002So2.aweme_list);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            protoAdapter4.encodeWithTag(protoWriter, 6, c592002So2.rid);
            protoAdapter.encodeWithTag(protoWriter, 7, c592002So2.home_model);
            protoAdapter.encodeWithTag(protoWriter, 8, c592002So2.refresh_clear);
            C624802cA.ADAPTER.encodeWithTag(protoWriter, 9, c592002So2.extra);
            C714102qZ.ADAPTER.encodeWithTag(protoWriter, 10, c592002So2.log_pb);
            protoAdapter4.encodeWithTag(protoWriter, 11, c592002So2.DebugInfo);
            C592602Su.ADAPTER.encodeWithTag(protoWriter, 12, c592002So2.guide_word);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 13, c592002So2.preload_ads);
            protoAdapter4.encodeWithTag(protoWriter, 14, c592002So2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 15, c592002So2.block_code);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 16, c592002So2.preload_awemes);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            protoAdapter5.encodeWithTag(protoWriter, 17, c592002So2.enable_re_rank);
            protoAdapter5.encodeWithTag(protoWriter, 18, c592002So2.disable_adjust_for_cache);
            C2251131D9b.ADAPTER.encodeWithTag(protoWriter, 19, c592002So2.showtime_gap_rsp_info);
            protoAdapter5.encodeWithTag(protoWriter, 20, c592002So2.has_ad);
            C593702Tf.ADAPTER.encodeWithTag(protoWriter, 21, c592002So2.commerce_pitaya_info);
            protoAdapter4.encodeWithTag(protoWriter, 22, c592002So2.topview_over_delivery_result);
            protoAdapter4.encodeWithTag(protoWriter, 23, c592002So2.proactive_login_config);
            C02FX.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, c592002So2.card_insert_results);
            protoAdapter5.encodeWithTag(protoWriter, 25, c592002So2.is_non_personalized);
            C5339026f.ADAPTER.encodeWithTag(protoWriter, 26, c592002So2.consistency_rsp);
            C592702Sv.ADAPTER.encodeWithTag(protoWriter, 27, c592002So2.prompt);
            C592802Sw.ADAPTER.encodeWithTag(protoWriter, 28, c592002So2.server_base_fcp_config);
            C565902In.ADAPTER.encodeWithTag(protoWriter, 29, c592002So2.intervention_info);
            protoAdapter4.encodeWithTag(protoWriter, 30, c592002So2.ocean_req_info);
            C559702Gd.ADAPTER.encodeWithTag(protoWriter, 31, c592002So2.media_basic_info);
            protoAdapter.encodeWithTag(protoWriter, 32, c592002So2.server_predicted_time);
            C625002cC.ADAPTER.encodeWithTag(protoWriter, 33, c592002So2.server_deleted_live_info);
            C707102pR.ADAPTER.asRepeated().encodeWithTag(protoWriter, 34, c592002So2.hybrid_ab_data);
            protoAdapter.encodeWithTag(protoWriter, 35, c592002So2.nuj_insert_config);
            protoWriter.writeBytes(c592002So2.unknownFields());
        }
    };
    public String DebugInfo;
    public List<C5186020i> aweme_list;
    public Integer block_code;
    public List<C02FX> card_insert_results;
    public C593702Tf commerce_pitaya_info;
    public C5339026f consistency_rsp;
    public Boolean disable_adjust_for_cache;
    public Boolean enable_re_rank;
    public C624802cA extra;
    public C592602Su guide_word;
    public Boolean has_ad;
    public Integer has_more;
    public Integer home_model;
    public List<C707102pR> hybrid_ab_data;
    public C565902In intervention_info;
    public Boolean is_non_personalized;
    public C714102qZ log_pb;
    public Long max_cursor;
    public C559702Gd media_basic_info;
    public Long min_cursor;
    public Integer nuj_insert_config;
    public String ocean_req_info;
    public List<C5186020i> preload_ads;
    public List<C5186020i> preload_awemes;
    public String proactive_login_config;
    public C592702Sv prompt;
    public Integer refresh_clear;
    public String rid;
    public C592802Sw server_base_fcp_config;
    public C625002cC server_deleted_live_info;
    public Integer server_predicted_time;
    public C2251131D9b showtime_gap_rsp_info;
    public Integer status_code;
    public String status_msg;
    public String topview_over_delivery_result;

    public C592002So() {
    }

    @Override // com.squareup.wire.Message
    public C592202Sq newBuilder() {
        return null;
    }

    public C592002So(Integer num, Long l, Long l2, Integer num2, List<C5186020i> list, String str, Integer num3, Integer num4, C624802cA c624802cA, C714102qZ c714102qZ, String str2, C592602Su c592602Su, List<C5186020i> list2, String str3, Integer num5, List<C5186020i> list3, Boolean bool, Boolean bool2, C2251131D9b c2251131D9b, Boolean bool3, C593702Tf c593702Tf, String str4, String str5, List<C02FX> list4, Boolean bool4, C5339026f c5339026f, C592702Sv c592702Sv, C592802Sw c592802Sw, C565902In c565902In, String str6, C559702Gd c559702Gd, Integer num6, C625002cC c625002cC, List<C707102pR> list5, Integer num7) {
        this(num, l, l2, num2, list, str, num3, num4, c624802cA, c714102qZ, str2, c592602Su, list2, str3, num5, list3, bool, bool2, c2251131D9b, bool3, c593702Tf, str4, str5, list4, bool4, c5339026f, c592702Sv, c592802Sw, c565902In, str6, c559702Gd, num6, c625002cC, list5, num7, ByteString.EMPTY);
    }

    public C592002So(Integer num, Long l, Long l2, Integer num2, List<C5186020i> list, String str, Integer num3, Integer num4, C624802cA c624802cA, C714102qZ c714102qZ, String str2, C592602Su c592602Su, List<C5186020i> list2, String str3, Integer num5, List<C5186020i> list3, Boolean bool, Boolean bool2, C2251131D9b c2251131D9b, Boolean bool3, C593702Tf c593702Tf, String str4, String str5, List<C02FX> list4, Boolean bool4, C5339026f c5339026f, C592702Sv c592702Sv, C592802Sw c592802Sw, C565902In c565902In, String str6, C559702Gd c559702Gd, Integer num6, C625002cC c625002cC, List<C707102pR> list5, Integer num7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.min_cursor = l;
        this.max_cursor = l2;
        this.has_more = num2;
        this.aweme_list = C1516540pZE.LJFF("aweme_list", list);
        this.rid = str;
        this.home_model = num3;
        this.refresh_clear = num4;
        this.extra = c624802cA;
        this.log_pb = c714102qZ;
        this.DebugInfo = str2;
        this.guide_word = c592602Su;
        this.preload_ads = C1516540pZE.LJFF("preload_ads", list2);
        this.status_msg = str3;
        this.block_code = num5;
        this.preload_awemes = C1516540pZE.LJFF("preload_awemes", list3);
        this.enable_re_rank = bool;
        this.disable_adjust_for_cache = bool2;
        this.showtime_gap_rsp_info = c2251131D9b;
        this.has_ad = bool3;
        this.commerce_pitaya_info = c593702Tf;
        this.topview_over_delivery_result = str4;
        this.proactive_login_config = str5;
        this.card_insert_results = C1516540pZE.LJFF("card_insert_results", list4);
        this.is_non_personalized = bool4;
        this.consistency_rsp = c5339026f;
        this.prompt = c592702Sv;
        this.server_base_fcp_config = c592802Sw;
        this.intervention_info = c565902In;
        this.ocean_req_info = str6;
        this.media_basic_info = c559702Gd;
        this.server_predicted_time = num6;
        this.server_deleted_live_info = c625002cC;
        this.hybrid_ab_data = C1516540pZE.LJFF("hybrid_ab_data", list5);
        this.nuj_insert_config = num7;
    }
}
