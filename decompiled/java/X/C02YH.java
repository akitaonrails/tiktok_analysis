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

/* JADX INFO: renamed from: X.02YH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YH extends Message<C02YH, C02YJ> {
    public static final ProtoAdapter<C02YH> ADAPTER = new ProtoAdapter<C02YH>() { // from class: X.02YI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YH decode(ProtoReader protoReader) {
            C02YH c02yh = new C02YH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02yh.bill_items.add(C652802gg.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c02yh.total = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02yh.total_discount = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02yh.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02yh.desc_color = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02yh.origin = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02yh.tips = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02yh.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02yh.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02yh.sku_total_quantity = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02yh.payment_before_pay_promotion = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c02yh.total_logo = C029C.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c02yh.addon_discount_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c02yh.cart_bottom_discount_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c02yh.product_tax_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c02yh.total_bill_item = C652802gg.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c02yh.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c02yh.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c02yh.cart_bottom_bar_info = C751902wf.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c02yh.aggr_meta_info = C728502st.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c02yh.checkout_bottom_bar_info = C646502ff.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c02yh.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c02yh.total_icon_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c02yh.total_price_sub_text = C557002Fc.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c02yh.desc_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 26:
                            c02yh.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c02yh.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 28:
                            c02yh.invisible_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            c02yh.total_discount_benefit_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 30:
                            c02yh.cart_checkout_button_info = C1C5W.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            c02yh.total_price_sub_text_list.add(C557002Fc.ADAPTER.decode(protoReader));
                            break;
                        case 32:
                            c02yh.bonus_info = C02YF.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c02yh.payment_method = C2263531Dih.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c02yh.hsa_fsa_bill_item = C652802gg.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            c02yh.total_price_icons.add(C029C.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c02yh.installment_interest_fee_info_list.add(C662402iE.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            c02yh.total_benefit_section = C712902qN.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            c02yh.bill_summary_display_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 39:
                            c02yh.member_ship_info = C2229571COd.ADAPTER.decode(protoReader);
                            break;
                        case 40:
                            c02yh.membership_module_checkout = C02B3.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            c02yh.desc_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YH c02yh) {
            C02YH c02yh2 = c02yh;
            ProtoAdapter<C652802gg> protoAdapter = C652802gg.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, c02yh2.bill_items);
            ProtoAdapter<C02FG> protoAdapter2 = C02FG.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02yh2.total) + protoAdapter2.encodedSizeWithTag(3, c02yh2.total_discount);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c02yh2.desc) + ProtoAdapter.INT64.encodedSizeWithTag(5, c02yh2.desc_color) + protoAdapter2.encodedSizeWithTag(6, c02yh2.origin);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(7, c02yh2.tips) + protoAdapter3.encodedSizeWithTag(8, c02yh2.title) + protoAdapter3.encodedSizeWithTag(9, c02yh2.link) + protoAdapter4.encodedSizeWithTag(10, c02yh2.sku_total_quantity) + protoAdapter2.encodedSizeWithTag(11, c02yh2.payment_before_pay_promotion);
            ProtoAdapter<C029C> protoAdapter5 = C029C.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(12, c02yh2.total_logo) + protoAdapter3.encodedSizeWithTag(13, c02yh2.addon_discount_desc) + protoAdapter3.encodedSizeWithTag(14, c02yh2.cart_bottom_discount_desc) + protoAdapter3.encodedSizeWithTag(15, c02yh2.product_tax_desc) + protoAdapter.encodedSizeWithTag(16, c02yh2.total_bill_item) + protoAdapter3.encodedSizeWithTag(17, c02yh2.name) + protoAdapter4.encodedSizeWithTag(18, c02yh2.status) + C751902wf.ADAPTER.encodedSizeWithTag(19, c02yh2.cart_bottom_bar_info) + C728502st.ADAPTER.encodedSizeWithTag(20, c02yh2.aggr_meta_info) + C646502ff.ADAPTER.encodedSizeWithTag(21, c02yh2.checkout_bottom_bar_info) + protoAdapter3.encodedSizeWithTag(22, c02yh2.sub_title) + protoAdapter3.encodedSizeWithTag(23, c02yh2.total_icon_info);
            ProtoAdapter<C557002Fc> protoAdapter6 = C557002Fc.ADAPTER;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(24, c02yh2.total_price_sub_text) + protoAdapter4.encodedSizeWithTag(25, c02yh2.desc_type) + protoAdapter3.encodedSizeWithTag(26, c02yh2.da_info) + protoAdapter4.encodedSizeWithTag(27, c02yh2.style) + protoAdapter3.encodedSizeWithTag(28, c02yh2.invisible_params) + protoAdapter3.encodedSizeWithTag(29, c02yh2.total_discount_benefit_text) + C1C5W.ADAPTER.encodedSizeWithTag(30, c02yh2.cart_checkout_button_info) + protoAdapter6.asRepeated().encodedSizeWithTag(31, c02yh2.total_price_sub_text_list) + C02YF.ADAPTER.encodedSizeWithTag(32, c02yh2.bonus_info) + C2263531Dih.ADAPTER.encodedSizeWithTag(33, c02yh2.payment_method) + protoAdapter.encodedSizeWithTag(34, c02yh2.hsa_fsa_bill_item) + protoAdapter5.asRepeated().encodedSizeWithTag(35, c02yh2.total_price_icons) + C662402iE.ADAPTER.asRepeated().encodedSizeWithTag(36, c02yh2.installment_interest_fee_info_list) + C712902qN.ADAPTER.encodedSizeWithTag(37, c02yh2.total_benefit_section) + protoAdapter4.encodedSizeWithTag(38, c02yh2.bill_summary_display_type) + C2229571COd.ADAPTER.encodedSizeWithTag(39, c02yh2.member_ship_info) + C02B3.ADAPTER.encodedSizeWithTag(40, c02yh2.membership_module_checkout) + C5431029t.ADAPTER.encodedSizeWithTag(41, c02yh2.desc_rich_text) + c02yh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YH c02yh) {
        }
    };
    public String addon_discount_desc;
    public C728502st aggr_meta_info;
    public List<C652802gg> bill_items;
    public Integer bill_summary_display_type;
    public C02YF bonus_info;
    public C751902wf cart_bottom_bar_info;
    public String cart_bottom_discount_desc;
    public C1C5W cart_checkout_button_info;
    public C646502ff checkout_bottom_bar_info;
    public String da_info;
    public String desc;
    public Long desc_color;
    public C5431029t desc_rich_text;
    public Integer desc_type;
    public C652802gg hsa_fsa_bill_item;
    public List<C662402iE> installment_interest_fee_info_list;
    public String invisible_params;
    public String link;
    public C2229571COd member_ship_info;
    public C02B3 membership_module_checkout;
    public String name;
    public C02FG origin;
    public C02FG payment_before_pay_promotion;
    public C2263531Dih payment_method;
    public String product_tax_desc;
    public Integer sku_total_quantity;
    public Integer status;
    public Integer style;
    public String sub_title;
    public Integer tips;
    public String title;
    public C02FG total;
    public C712902qN total_benefit_section;
    public C652802gg total_bill_item;
    public C02FG total_discount;
    public String total_discount_benefit_text;
    public String total_icon_info;
    public C029C total_logo;
    public List<C029C> total_price_icons;
    public C557002Fc total_price_sub_text;
    public List<C557002Fc> total_price_sub_text_list;

    public C02YH() {
        super(ADAPTER, ByteString.EMPTY);
        this.bill_items = C1516540pZE.LJIIIIZZ();
        this.total_price_sub_text_list = C1516540pZE.LJIIIIZZ();
        this.total_price_icons = C1516540pZE.LJIIIIZZ();
        this.installment_interest_fee_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02YJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
