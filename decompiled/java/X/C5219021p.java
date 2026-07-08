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
import okio.ByteString;

/* JADX INFO: renamed from: X.021p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5219021p extends Message<C5219021p, C584602Ps> {
    public static final ProtoAdapter<C5219021p> ADAPTER = new ProtoAdapter<C5219021p>() { // from class: X.021o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5219021p decode(ProtoReader protoReader) {
            C5219021p c5219021p = new C5219021p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5219021p.expired_items_show_less = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c5219021p.expired_items_show_more = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5219021p.expired_items_name = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5219021p.logistics_shipped = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5219021p.add_delivery_address = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5219021p.delivery_address = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5219021p.shipping_method_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5219021p.checkout = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5219021p.encrypted_info = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5219021p.order_summary = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5219021p.guarantee_info = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5219021p.payment_method = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5219021p.payment_method_view_all = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5219021p.platform_discount = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5219021p.free_gift = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c5219021p.items_and_free_gift = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5219021p.sku_quantity = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5219021p.gwp_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5219021p.user_benefit_view_all = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5219021p.tax_certification_success = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c5219021p.cpf_number_invalid = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c5219021p.cpf_certification_failed = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c5219021p.cpf_certification_network_err = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5219021p.cpf_certification_success = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c5219021p.mx_tax_layer_error = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c5219021p.switch_to_cod_payment = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            c5219021p.add_delivery_address_latam_opt = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c5219021p.shipping_address_title_latam_opt = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            c5219021p.express_checkout_logistics_module_text = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c5219021p.toko_checkout = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            c5219021p.order_title_prefix = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            c5219021p.toko_order_summary = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c5219021p.toko_total_price_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c5219021p.toko_fallback_total_price = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            c5219021p.unavailable_module_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c5219021p.unavailable_quantity = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            c5219021p.unavailable_sub_page_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            c5219021p.one_step_miss_address_text = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 39:
                            c5219021p.one_step_sku_out_of_stock_banner_text = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 40:
                            c5219021p.toko_promotion_module = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5219021p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5219021p c5219021p) {
            C5219021p c5219021p2 = c5219021p;
            ProtoAdapter<C618302b7> protoAdapter = C618302b7.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c5219021p2.expired_items_show_less) + protoAdapter.encodedSizeWithTag(2, c5219021p2.expired_items_show_more) + protoAdapter.encodedSizeWithTag(3, c5219021p2.expired_items_name) + protoAdapter.encodedSizeWithTag(4, c5219021p2.logistics_shipped) + protoAdapter.encodedSizeWithTag(5, c5219021p2.add_delivery_address) + protoAdapter.encodedSizeWithTag(6, c5219021p2.delivery_address) + protoAdapter.encodedSizeWithTag(7, c5219021p2.shipping_method_title) + protoAdapter.encodedSizeWithTag(8, c5219021p2.checkout) + protoAdapter.encodedSizeWithTag(9, c5219021p2.encrypted_info) + protoAdapter.encodedSizeWithTag(10, c5219021p2.order_summary) + protoAdapter.encodedSizeWithTag(11, c5219021p2.guarantee_info) + protoAdapter.encodedSizeWithTag(12, c5219021p2.payment_method) + protoAdapter.encodedSizeWithTag(13, c5219021p2.payment_method_view_all) + protoAdapter.encodedSizeWithTag(14, c5219021p2.platform_discount) + protoAdapter.encodedSizeWithTag(15, c5219021p2.free_gift) + protoAdapter.encodedSizeWithTag(16, c5219021p2.items_and_free_gift) + protoAdapter.encodedSizeWithTag(17, c5219021p2.sku_quantity) + protoAdapter.encodedSizeWithTag(18, c5219021p2.gwp_title) + protoAdapter.encodedSizeWithTag(19, c5219021p2.user_benefit_view_all) + protoAdapter.encodedSizeWithTag(20, c5219021p2.tax_certification_success) + protoAdapter.encodedSizeWithTag(21, c5219021p2.cpf_number_invalid) + protoAdapter.encodedSizeWithTag(22, c5219021p2.cpf_certification_failed) + protoAdapter.encodedSizeWithTag(23, c5219021p2.cpf_certification_network_err) + protoAdapter.encodedSizeWithTag(24, c5219021p2.cpf_certification_success) + protoAdapter.encodedSizeWithTag(25, c5219021p2.mx_tax_layer_error) + protoAdapter.encodedSizeWithTag(26, c5219021p2.switch_to_cod_payment) + protoAdapter.encodedSizeWithTag(27, c5219021p2.add_delivery_address_latam_opt) + protoAdapter.encodedSizeWithTag(28, c5219021p2.shipping_address_title_latam_opt) + protoAdapter.encodedSizeWithTag(29, c5219021p2.express_checkout_logistics_module_text) + protoAdapter.encodedSizeWithTag(30, c5219021p2.toko_checkout) + protoAdapter.encodedSizeWithTag(31, c5219021p2.order_title_prefix) + protoAdapter.encodedSizeWithTag(32, c5219021p2.toko_order_summary) + protoAdapter.encodedSizeWithTag(33, c5219021p2.toko_total_price_title) + protoAdapter.encodedSizeWithTag(34, c5219021p2.toko_fallback_total_price) + protoAdapter.encodedSizeWithTag(35, c5219021p2.unavailable_module_title) + protoAdapter.encodedSizeWithTag(36, c5219021p2.unavailable_quantity) + protoAdapter.encodedSizeWithTag(37, c5219021p2.unavailable_sub_page_title) + protoAdapter.encodedSizeWithTag(38, c5219021p2.one_step_miss_address_text) + protoAdapter.encodedSizeWithTag(39, c5219021p2.one_step_sku_out_of_stock_banner_text) + protoAdapter.encodedSizeWithTag(40, c5219021p2.toko_promotion_module) + c5219021p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5219021p c5219021p) {
        }
    };
    public C618302b7 add_delivery_address;
    public C618302b7 add_delivery_address_latam_opt;
    public C618302b7 checkout;
    public C618302b7 cpf_certification_failed;
    public C618302b7 cpf_certification_network_err;
    public C618302b7 cpf_certification_success;
    public C618302b7 cpf_number_invalid;
    public C618302b7 delivery_address;
    public C618302b7 encrypted_info;
    public C618302b7 expired_items_name;
    public C618302b7 expired_items_show_less;
    public C618302b7 expired_items_show_more;
    public C618302b7 express_checkout_logistics_module_text;
    public C618302b7 free_gift;
    public C618302b7 guarantee_info;
    public C618302b7 gwp_title;
    public C618302b7 items_and_free_gift;
    public C618302b7 logistics_shipped;
    public C618302b7 mx_tax_layer_error;
    public C618302b7 one_step_miss_address_text;
    public C618302b7 one_step_sku_out_of_stock_banner_text;
    public C618302b7 order_summary;
    public C618302b7 order_title_prefix;
    public C618302b7 payment_method;
    public C618302b7 payment_method_view_all;
    public C618302b7 platform_discount;
    public C618302b7 shipping_address_title_latam_opt;
    public C618302b7 shipping_method_title;
    public C618302b7 sku_quantity;
    public C618302b7 switch_to_cod_payment;
    public C618302b7 tax_certification_success;
    public C618302b7 toko_checkout;
    public C618302b7 toko_fallback_total_price;
    public C618302b7 toko_order_summary;
    public C618302b7 toko_promotion_module;
    public C618302b7 toko_total_price_title;
    public C618302b7 unavailable_module_title;
    public C618302b7 unavailable_quantity;
    public C618302b7 unavailable_sub_page_title;
    public C618302b7 user_benefit_view_all;

    public C5219021p() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C584602Ps newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
