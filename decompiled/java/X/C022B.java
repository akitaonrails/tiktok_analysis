package X;

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

/* JADX INFO: renamed from: X.022B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022B extends Message<C022B, C02P5> {
    public static final ProtoAdapter<C022B> ADAPTER = new ProtoAdapter<C022B>() { // from class: X.021U
        public final ProtoAdapter<Map<String, Boolean>> LIZ;
        public final ProtoAdapter<Map<String, C02FI>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, ProtoAdapter.BOOL);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, C02FI.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022B decode(ProtoReader protoReader) {
            C022B c022b = new C022B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022b.packed_skus.add(C5194020q.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c022b.is_selected.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            c022b.addon_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c022b.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c022b.notice = C02H2.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c022b.filtered_sku_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            c022b.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c022b.addon_order_title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022b.addon_sku_to_main_order.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022b.addon_scene = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022b.recommend_scene = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022b.addon_ui_config = C02ED.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022b.addon_order_button = C680102l5.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c022b.addon_display_product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c022b.recommend_session_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022B c022b) {
            C022B c022b2 = c022b;
            int iEncodedSizeWithTag = C5194020q.ADAPTER.asRepeated().encodedSizeWithTag(1, c022b2.packed_skus) + this.LIZ.encodedSizeWithTag(2, c022b2.is_selected);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c022b2.addon_title);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c022b2.type) + C02H2.ADAPTER.encodedSizeWithTag(5, c022b2.notice) + protoAdapter.asRepeated().encodedSizeWithTag(6, c022b2.filtered_sku_list) + protoAdapter.encodedSizeWithTag(7, c022b2.da_info) + C5431029t.ADAPTER.encodedSizeWithTag(8, c022b2.addon_order_title) + this.LIZIZ.encodedSizeWithTag(9, c022b2.addon_sku_to_main_order) + protoAdapter2.encodedSizeWithTag(10, c022b2.addon_scene) + protoAdapter.encodedSizeWithTag(11, c022b2.recommend_scene) + C02ED.ADAPTER.encodedSizeWithTag(12, c022b2.addon_ui_config) + C680102l5.ADAPTER.encodedSizeWithTag(13, c022b2.addon_order_button) + protoAdapter.encodedSizeWithTag(14, c022b2.addon_display_product_id) + protoAdapter.encodedSizeWithTag(15, c022b2.recommend_session_id) + c022b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022B c022b) {
        }
    };
    public String addon_display_product_id;
    public C680102l5 addon_order_button;
    public C5431029t addon_order_title;
    public Integer addon_scene;
    public Map<String, C02FI> addon_sku_to_main_order;
    public String addon_title;
    public C02ED addon_ui_config;
    public String da_info;
    public List<String> filtered_sku_list;
    public Map<String, Boolean> is_selected;
    public C02H2 notice;
    public List<C5194020q> packed_skus;
    public String recommend_scene;
    public String recommend_session_id;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C02P5 newBuilder() {
        return null;
    }

    public C022B() {
        super(ADAPTER, ByteString.EMPTY);
        this.packed_skus = C1516540pZE.LJIIIIZZ();
        this.is_selected = new LinkedHashMap();
        this.filtered_sku_list = C1516540pZE.LJIIIIZZ();
        this.addon_sku_to_main_order = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
