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

/* JADX INFO: renamed from: X.022g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5236022g extends Message<C5236022g, C582602Oy> {
    public static final ProtoAdapter<C5236022g> ADAPTER = new ProtoAdapter<C5236022g>() { // from class: X.0229
        public final ProtoAdapter<Map<String, C552902Dn>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C552902Dn.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5236022g decode(ProtoReader protoReader) {
            C5236022g c5236022g = new C5236022g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5236022g.sku_common_texts.add(C02G2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c5236022g.pdp_promotion_items.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            c5236022g.unavailable_info_list.add(C02HU.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c5236022g.sale_prop_unavailable_info_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5236022g.is_with_default_sku = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5236022g.pdp_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5236022g.is_quantity_editable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c5236022g.default_unselected_quantity = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5236022g.apple_pay_express_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5236022g.is_use_new_component = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5236022g.big_image_mode_by_default = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5236022g.is_use_sku_size_new_style = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5236022g.is_close_button_outside_panel = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c5236022g.is_quantity_hidden = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            c5236022g.is_sku_panel_gallery_find_similar_hidden = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5236022g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5236022g c5236022g) {
            C5236022g c5236022g2 = c5236022g;
            int iEncodedSizeWithTag = C02G2.ADAPTER.asRepeated().encodedSizeWithTag(1, c5236022g2.sku_common_texts) + this.LIZ.encodedSizeWithTag(2, c5236022g2.pdp_promotion_items) + C02HU.ADAPTER.asRepeated().encodedSizeWithTag(3, c5236022g2.unavailable_info_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c5236022g2.sale_prop_unavailable_info_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c5236022g2.is_with_default_sku);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, c5236022g2.pdp_button_area_id) + protoAdapter2.encodedSizeWithTag(7, c5236022g2.is_quantity_editable) + protoAdapter.encodedSizeWithTag(8, c5236022g2.default_unselected_quantity) + protoAdapter3.encodedSizeWithTag(9, c5236022g2.apple_pay_express_button_area_id) + protoAdapter2.encodedSizeWithTag(10, c5236022g2.is_use_new_component) + protoAdapter2.encodedSizeWithTag(11, c5236022g2.big_image_mode_by_default) + protoAdapter2.encodedSizeWithTag(12, c5236022g2.is_use_sku_size_new_style) + protoAdapter2.encodedSizeWithTag(13, c5236022g2.is_close_button_outside_panel) + protoAdapter2.encodedSizeWithTag(14, c5236022g2.is_quantity_hidden) + protoAdapter2.encodedSizeWithTag(15, c5236022g2.is_sku_panel_gallery_find_similar_hidden) + c5236022g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5236022g c5236022g) {
        }
    };
    public String apple_pay_express_button_area_id;
    public Boolean big_image_mode_by_default;
    public Integer default_unselected_quantity;
    public Boolean is_close_button_outside_panel;
    public Boolean is_quantity_editable;
    public Boolean is_quantity_hidden;
    public Boolean is_sku_panel_gallery_find_similar_hidden;
    public Boolean is_use_new_component;
    public Boolean is_use_sku_size_new_style;
    public Boolean is_with_default_sku;
    public String pdp_button_area_id;
    public Map<String, C552902Dn> pdp_promotion_items;
    public Integer sale_prop_unavailable_info_id;
    public List<C02G2> sku_common_texts;
    public List<C02HU> unavailable_info_list;

    @Override // com.squareup.wire.Message
    public C582602Oy newBuilder() {
        return null;
    }

    public C5236022g() {
        super(ADAPTER, ByteString.EMPTY);
        this.sku_common_texts = C1516540pZE.LJIIIIZZ();
        this.pdp_promotion_items = new LinkedHashMap();
        this.unavailable_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
