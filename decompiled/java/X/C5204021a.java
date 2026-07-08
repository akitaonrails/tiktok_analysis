package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
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

/* JADX INFO: renamed from: X.021a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5204021a extends Message<C5204021a, C02QA> {
    public static final ProtoAdapter<C5204021a> ADAPTER = new ProtoAdapter<C5204021a>() { // from class: X.021G
        public final ProtoAdapter<Map<Long, C695102nV>> LIZ;
        public final ProtoAdapter<Map<Long, Long>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, C695102nV.ADAPTER);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5204021a decode(ProtoReader protoReader) {
            C5204021a c5204021a = new C5204021a();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5204021a.warehouse_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5204021a.packed_skus.add(C5194020q.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c5204021a.reachable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c5204021a.unreachable_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5204021a.logistics.add(C021O.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5204021a.selected_logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5204021a.warehouse_tag = C02D0.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5204021a.logistics_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5204021a.main_order_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5204021a.available_info = C642002ew.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5204021a.multi_logistics_panel_info = C607802Yq.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5204021a.logistic_expression_module = C02AS.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5204021a.logistic_panel_module = C02AS.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5204021a.free_shipping_addon_panel = AnonymousClass0227.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5204021a.distance_map.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 16:
                            c5204021a.transport_type_map.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5204021a.is_pudo_logistics_service_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 19:
                            c5204021a.selected_pudo_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5204021a.order_tip = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c5204021a.warning_alert = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c5204021a.order_label = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c5204021a.shipping_insurance_module = C659802ho.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5204021a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5204021a c5204021a) {
            C5204021a c5204021a2 = c5204021a;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5204021a2.warehouse_id) + C5194020q.ADAPTER.asRepeated().encodedSizeWithTag(2, c5204021a2.packed_skus);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5204021a2.reachable) + protoAdapter.encodedSizeWithTag(4, c5204021a2.unreachable_reason) + C021O.ADAPTER.asRepeated().encodedSizeWithTag(5, c5204021a2.logistics) + protoAdapter.encodedSizeWithTag(6, c5204021a2.selected_logistics_service_id) + C02D0.ADAPTER.encodedSizeWithTag(7, c5204021a2.warehouse_tag) + protoAdapter.encodedSizeWithTag(8, c5204021a2.logistics_title) + protoAdapter.encodedSizeWithTag(9, c5204021a2.main_order_id) + C642002ew.ADAPTER.encodedSizeWithTag(10, c5204021a2.available_info) + C607802Yq.ADAPTER.encodedSizeWithTag(11, c5204021a2.multi_logistics_panel_info);
            ProtoAdapter<C02AS> protoAdapter3 = C02AS.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(12, c5204021a2.logistic_expression_module) + protoAdapter3.encodedSizeWithTag(13, c5204021a2.logistic_panel_module) + AnonymousClass0227.ADAPTER.encodedSizeWithTag(14, c5204021a2.free_shipping_addon_panel) + this.LIZ.encodedSizeWithTag(15, c5204021a2.distance_map) + this.LIZIZ.encodedSizeWithTag(16, c5204021a2.transport_type_map) + protoAdapter2.encodedSizeWithTag(17, c5204021a2.is_pudo_logistics_service_selected) + protoAdapter.encodedSizeWithTag(19, c5204021a2.selected_pudo_id) + protoAdapter.encodedSizeWithTag(20, c5204021a2.order_tip) + protoAdapter.encodedSizeWithTag(21, c5204021a2.warning_alert) + C029C.ADAPTER.encodedSizeWithTag(22, c5204021a2.order_label) + C659802ho.ADAPTER.encodedSizeWithTag(23, c5204021a2.shipping_insurance_module) + c5204021a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5204021a c5204021a) {
        }
    };
    public C642002ew available_info;
    public Map<Long, C695102nV> distance_map;
    public AnonymousClass0227 free_shipping_addon_panel;
    public Boolean is_pudo_logistics_service_selected;
    public C02AS logistic_expression_module;
    public C02AS logistic_panel_module;
    public List<C021O> logistics;
    public String logistics_title;
    public String main_order_id;
    public C607802Yq multi_logistics_panel_info;
    public C029C order_label;
    public String order_tip;
    public List<C5194020q> packed_skus;
    public Boolean reachable;
    public String selected_logistics_service_id;
    public String selected_pudo_id;
    public C659802ho shipping_insurance_module;
    public Map<Long, Long> transport_type_map;
    public String unreachable_reason;
    public String warehouse_id;
    public C02D0 warehouse_tag;
    public String warning_alert;

    @Override // com.squareup.wire.Message
    public C02QA newBuilder() {
        return null;
    }

    public C5204021a() {
        super(ADAPTER, ByteString.EMPTY);
        this.packed_skus = C1516540pZE.LJIIIIZZ();
        this.logistics = C1516540pZE.LJIIIIZZ();
        this.distance_map = new LinkedHashMap();
        this.transport_type_map = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
