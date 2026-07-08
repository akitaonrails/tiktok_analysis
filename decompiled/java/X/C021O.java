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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.021O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021O extends Message<C021O, C02PG> {
    public static final ProtoAdapter<C021O> ADAPTER = new ProtoAdapter<C021O>() { // from class: X.021P
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021O decode(ProtoReader protoReader) {
            C021O c021o = new C021O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021o.delivery_option = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c021o.delivery_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c021o.is_default = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c021o.reachable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c021o.lead_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c021o.shipping_fee = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c021o.original_shipping_fee = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c021o.free_shipping = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021o.shipping_discount = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c021o.logistic_text = AnonymousClass0265.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021o.logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021o.tracking_mode = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021o.with_voucher = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c021o.delivery_min_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c021o.delivery_max_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c021o.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021o.logistic_promotion = C02DY.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021o.spend_more_jumper = C02XF.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c021o.event_tracking.putAll(this.LIZ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021o.has_native_page = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c021o.logistic_link_info = C1CGL.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c021o.original_shipping_val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c021o.arrival_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 25:
                            c021o.shipping_threshold_text = C5434029w.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c021o.logistic_rich_text = C5434029w.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            c021o.shipping_fallback_dialog = C606802Yg.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c021o.shipping_service = C710602q0.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            c021o.logistic_rich_text_list.add(C5434029w.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            c021o.logistics_description = AnonymousClass0282.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            c021o.order_cut_off_notice = C5434029w.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            c021o.transit_delivery_min_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c021o.transit_delivery_max_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c021o.leadtime_display_strategy = C745102vZ.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            c021o.cod_available = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c021o.lead_time_tag_type.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 37:
                            c021o.logistics_labels.add(C695402nY.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021O c021o) {
            C021O c021o2 = c021o;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c021o2.delivery_option);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c021o2.delivery_name);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c021o2.is_default) + protoAdapter3.encodedSizeWithTag(4, c021o2.reachable) + protoAdapter2.encodedSizeWithTag(5, c021o2.lead_time) + C02FG.ADAPTER.encodedSizeWithTag(6, c021o2.shipping_fee) + protoAdapter2.encodedSizeWithTag(7, c021o2.original_shipping_fee) + protoAdapter3.encodedSizeWithTag(8, c021o2.free_shipping) + protoAdapter3.encodedSizeWithTag(9, c021o2.shipping_discount) + AnonymousClass0265.ADAPTER.encodedSizeWithTag(10, c021o2.logistic_text) + protoAdapter2.encodedSizeWithTag(11, c021o2.logistics_service_id) + protoAdapter2.encodedSizeWithTag(12, c021o2.tracking_mode) + protoAdapter3.encodedSizeWithTag(13, c021o2.with_voucher) + protoAdapter.encodedSizeWithTag(14, c021o2.delivery_min_days) + protoAdapter.encodedSizeWithTag(15, c021o2.delivery_max_days) + protoAdapter2.encodedSizeWithTag(16, c021o2.da_info) + C02DY.ADAPTER.encodedSizeWithTag(17, c021o2.logistic_promotion) + C02XF.ADAPTER.encodedSizeWithTag(18, c021o2.spend_more_jumper) + this.LIZ.encodedSizeWithTag(19, c021o2.event_tracking) + protoAdapter3.encodedSizeWithTag(20, c021o2.has_native_page) + C1CGL.ADAPTER.encodedSizeWithTag(21, c021o2.logistic_link_info) + protoAdapter2.encodedSizeWithTag(22, c021o2.original_shipping_val) + protoAdapter2.encodedSizeWithTag(23, c021o2.arrival_info);
            ProtoAdapter<C5434029w> protoAdapter4 = C5434029w.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(25, c021o2.shipping_threshold_text) + protoAdapter4.encodedSizeWithTag(26, c021o2.logistic_rich_text) + C606802Yg.ADAPTER.encodedSizeWithTag(27, c021o2.shipping_fallback_dialog) + C710602q0.ADAPTER.encodedSizeWithTag(28, c021o2.shipping_service) + protoAdapter4.asRepeated().encodedSizeWithTag(29, c021o2.logistic_rich_text_list) + AnonymousClass0282.ADAPTER.encodedSizeWithTag(30, c021o2.logistics_description) + protoAdapter4.encodedSizeWithTag(31, c021o2.order_cut_off_notice) + protoAdapter.encodedSizeWithTag(32, c021o2.transit_delivery_min_days) + protoAdapter.encodedSizeWithTag(33, c021o2.transit_delivery_max_days) + C745102vZ.ADAPTER.encodedSizeWithTag(34, c021o2.leadtime_display_strategy) + protoAdapter3.encodedSizeWithTag(35, c021o2.cod_available) + protoAdapter.asRepeated().encodedSizeWithTag(36, c021o2.lead_time_tag_type) + C695402nY.ADAPTER.asRepeated().encodedSizeWithTag(37, c021o2.logistics_labels) + c021o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C021O c021o) {
        }
    };
    public String arrival_info;
    public Boolean cod_available;
    public String da_info;
    public Integer delivery_max_days;
    public Integer delivery_min_days;
    public String delivery_name;
    public Integer delivery_option;
    public Map<String, String> event_tracking;
    public Boolean free_shipping;
    public Boolean has_native_page;
    public Boolean is_default;
    public String lead_time;
    public List<Integer> lead_time_tag_type;
    public C745102vZ leadtime_display_strategy;
    public C1CGL logistic_link_info;
    public C02DY logistic_promotion;
    public C5434029w logistic_rich_text;
    public List<C5434029w> logistic_rich_text_list;
    public AnonymousClass0265 logistic_text;
    public AnonymousClass0282 logistics_description;
    public List<C695402nY> logistics_labels;
    public String logistics_service_id;
    public C5434029w order_cut_off_notice;
    public String original_shipping_fee;
    public String original_shipping_val;
    public Boolean reachable;
    public Boolean shipping_discount;
    public C606802Yg shipping_fallback_dialog;
    public C02FG shipping_fee;
    public C710602q0 shipping_service;
    public C5434029w shipping_threshold_text;
    public C02XF spend_more_jumper;
    public String tracking_mode;
    public Integer transit_delivery_max_days;
    public Integer transit_delivery_min_days;
    public Boolean with_voucher;

    @Override // com.squareup.wire.Message
    public C02PG newBuilder() {
        return null;
    }

    public C021O() {
        super(ADAPTER, ByteString.EMPTY);
        this.event_tracking = new LinkedHashMap();
        this.logistic_rich_text_list = C1516540pZE.LJIIIIZZ();
        this.lead_time_tag_type = C1516540pZE.LJIIIIZZ();
        this.logistics_labels = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
