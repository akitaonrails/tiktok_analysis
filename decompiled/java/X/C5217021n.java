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

/* JADX INFO: renamed from: X.021n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5217021n extends Message<C5217021n, C02P2> {
    public static final ProtoAdapter<C5217021n> ADAPTER = new ProtoAdapter<C5217021n>() { // from class: X.021Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5217021n decode(ProtoReader protoReader) {
            C5217021n c5217021n = new C5217021n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5217021n.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5217021n.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5217021n.quantity = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c5217021n.source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5217021n.cart_item_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5217021n.kol_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5217021n.source_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5217021n.entrance_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5217021n.chain_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5217021n.logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5217021n.price_val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5217021n.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5217021n.warehouse_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5217021n.traffic_source_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            c5217021n.bundle_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c5217021n.aggregation_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5217021n.aggregation_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5217021n.channel_reserve_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5217021n.platform_link_based_item = C02XI.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5217021n.sns_info = C02AZ.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c5217021n.selected_insurance_info = AnonymousClass0226.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c5217021n.product_sale_modes.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 23:
                            c5217021n.selected_props.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5217021n.user_virtual_info = C649002g4.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c5217021n.membership_info = C614102aR.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c5217021n.shipping_insurance_info = AnonymousClass0226.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5217021n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5217021n c5217021n) {
            C5217021n c5217021n2 = c5217021n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5217021n2.product_id) + protoAdapter.encodedSizeWithTag(2, c5217021n2.sku_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5217021n2.quantity) + protoAdapter2.encodedSizeWithTag(4, c5217021n2.source) + protoAdapter.encodedSizeWithTag(5, c5217021n2.cart_item_id) + protoAdapter.encodedSizeWithTag(6, c5217021n2.kol_id) + protoAdapter.encodedSizeWithTag(7, c5217021n2.source_info) + protoAdapter.encodedSizeWithTag(8, c5217021n2.entrance_info) + protoAdapter.encodedSizeWithTag(9, c5217021n2.chain_key) + protoAdapter.encodedSizeWithTag(10, c5217021n2.logistics_service_id) + protoAdapter.encodedSizeWithTag(11, c5217021n2.price_val) + protoAdapter.encodedSizeWithTag(12, c5217021n2.currency) + protoAdapter.encodedSizeWithTag(13, c5217021n2.warehouse_id) + protoAdapter2.asRepeated().encodedSizeWithTag(14, c5217021n2.traffic_source_list) + protoAdapter.encodedSizeWithTag(15, c5217021n2.bundle_id) + protoAdapter.encodedSizeWithTag(16, c5217021n2.aggregation_key) + protoAdapter2.encodedSizeWithTag(17, c5217021n2.aggregation_count) + protoAdapter.encodedSizeWithTag(18, c5217021n2.channel_reserve_key) + C02XI.ADAPTER.encodedSizeWithTag(19, c5217021n2.platform_link_based_item) + C02AZ.ADAPTER.encodedSizeWithTag(20, c5217021n2.sns_info);
            ProtoAdapter<AnonymousClass0226> protoAdapter3 = AnonymousClass0226.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(21, c5217021n2.selected_insurance_info) + protoAdapter2.asRepeated().encodedSizeWithTag(22, c5217021n2.product_sale_modes) + protoAdapter.asRepeated().encodedSizeWithTag(23, c5217021n2.selected_props) + C649002g4.ADAPTER.encodedSizeWithTag(24, c5217021n2.user_virtual_info) + C614102aR.ADAPTER.encodedSizeWithTag(25, c5217021n2.membership_info) + protoAdapter3.encodedSizeWithTag(26, c5217021n2.shipping_insurance_info) + c5217021n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5217021n c5217021n) {
        }
    };
    public Integer aggregation_count;
    public String aggregation_key;
    public String bundle_id;
    public String cart_item_id;
    public String chain_key;
    public String channel_reserve_key;
    public String currency;
    public String entrance_info;
    public String kol_id;
    public String logistics_service_id;
    public C614102aR membership_info;
    public C02XI platform_link_based_item;
    public String price_val;
    public String product_id;
    public List<Integer> product_sale_modes;
    public Integer quantity;
    public AnonymousClass0226 selected_insurance_info;
    public List<String> selected_props;
    public AnonymousClass0226 shipping_insurance_info;
    public String sku_id;
    public C02AZ sns_info;
    public Integer source;
    public String source_info;
    public List<Integer> traffic_source_list;
    public C649002g4 user_virtual_info;
    public String warehouse_id;

    public C5217021n() {
        super(ADAPTER, ByteString.EMPTY);
        this.traffic_source_list = C1516540pZE.LJIIIIZZ();
        this.product_sale_modes = C1516540pZE.LJIIIIZZ();
        this.selected_props = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02P2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
