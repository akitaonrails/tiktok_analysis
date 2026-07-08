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

/* JADX INFO: renamed from: X.021W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021W extends Message<C021W, C586302Qj> {
    public static final ProtoAdapter<C021W> ADAPTER = new ProtoAdapter<C021W>() { // from class: X.021C
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021W decode(ProtoReader protoReader) {
            C021W c021w = new C021W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        switch (iNextTag) {
                            case 1:
                                c021w.main_order_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                                c021w.group_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c021w.logistics.add(C021O.ADAPTER.decode(protoReader));
                                break;
                            case 4:
                                c021w.logistics_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c021w.selected_logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c021w.item_quantity_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c021w.product_panel_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c021w.logistic_expression_module = C02AS.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c021w.free_shipping_addon_panel = AnonymousClass0227.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c021w.addon_desc_info = C652302gb.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c021w.group_unique_key = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c021w.group_shop_bill = C02OY.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c021w.sku_num = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 14:
                                c021w.purchase_reward_banner = C602402Wo.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                c021w.disable_logistics_area_page = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 16:
                                c021w.group_logistics_panel_module = C561502Gv.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c021w.fulfill_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c021w.shipment_type_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                c021w.group_rich_title = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c021w.group_sub_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 21:
                                c021w.sub_order_group.add(C027Q.ADAPTER.decode(protoReader));
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c021w.da_info.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021W c021w) {
            C021W c021w2 = c021w;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c021w2.main_order_ids) + protoAdapter.encodedSizeWithTag(2, c021w2.group_title) + C021O.ADAPTER.asRepeated().encodedSizeWithTag(3, c021w2.logistics) + protoAdapter.encodedSizeWithTag(4, c021w2.logistics_title) + protoAdapter.encodedSizeWithTag(5, c021w2.selected_logistics_service_id) + protoAdapter.encodedSizeWithTag(6, c021w2.item_quantity_desc) + protoAdapter.encodedSizeWithTag(7, c021w2.product_panel_title) + C02AS.ADAPTER.encodedSizeWithTag(8, c021w2.logistic_expression_module) + AnonymousClass0227.ADAPTER.encodedSizeWithTag(9, c021w2.free_shipping_addon_panel) + C652302gb.ADAPTER.encodedSizeWithTag(10, c021w2.addon_desc_info) + protoAdapter.encodedSizeWithTag(11, c021w2.group_unique_key) + C02OY.ADAPTER.encodedSizeWithTag(12, c021w2.group_shop_bill) + ProtoAdapter.INT32.encodedSizeWithTag(13, c021w2.sku_num) + C602402Wo.ADAPTER.encodedSizeWithTag(14, c021w2.purchase_reward_banner) + ProtoAdapter.BOOL.encodedSizeWithTag(15, c021w2.disable_logistics_area_page) + C561502Gv.ADAPTER.encodedSizeWithTag(16, c021w2.group_logistics_panel_module) + protoAdapter.encodedSizeWithTag(17, c021w2.fulfill_title) + protoAdapter.encodedSizeWithTag(18, c021w2.shipment_type_title) + C5431029t.ADAPTER.encodedSizeWithTag(19, c021w2.group_rich_title) + protoAdapter.encodedSizeWithTag(20, c021w2.group_sub_title) + C027Q.ADAPTER.asRepeated().encodedSizeWithTag(21, c021w2.sub_order_group) + this.LIZ.encodedSizeWithTag(100, c021w2.da_info) + c021w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C021W c021w) {
        }
    };
    public C652302gb addon_desc_info;
    public Map<String, String> da_info;
    public Boolean disable_logistics_area_page;
    public AnonymousClass0227 free_shipping_addon_panel;
    public String fulfill_title;
    public C561502Gv group_logistics_panel_module;
    public C5431029t group_rich_title;
    public C02OY group_shop_bill;
    public String group_sub_title;
    public String group_title;
    public String group_unique_key;
    public String item_quantity_desc;
    public C02AS logistic_expression_module;
    public List<C021O> logistics;
    public String logistics_title;
    public List<String> main_order_ids;
    public String product_panel_title;
    public C602402Wo purchase_reward_banner;
    public String selected_logistics_service_id;
    public String shipment_type_title;
    public Integer sku_num;
    public List<C027Q> sub_order_group;

    @Override // com.squareup.wire.Message
    public C586302Qj newBuilder() {
        return null;
    }

    public C021W() {
        super(ADAPTER, ByteString.EMPTY);
        this.main_order_ids = C1516540pZE.LJIIIIZZ();
        this.logistics = C1516540pZE.LJIIIIZZ();
        this.sub_order_group = C1516540pZE.LJIIIIZZ();
        this.da_info = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
