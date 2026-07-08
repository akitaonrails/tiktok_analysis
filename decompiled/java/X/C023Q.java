package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.023Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023Q extends Message<C023Q, C02NS> {
    public static final ProtoAdapter<C023Q> ADAPTER = new ProtoAdapter<C023Q>() { // from class: X.022D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023Q decode(ProtoReader protoReader) {
            C023Q c023q = new C023Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c023q.real_price = C02FG.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c023q.original_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c023q.discount = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c023q.original_price_value = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c023q.discount_price = C02FG.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c023q.unit_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c023q.icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c023q.price_label_info = C553002Do.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c023q.sku_list_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c023q.discount_color = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c023q.discount_font = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c023q.original_price_color = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c023q.original_price_font = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 14:
                                c023q.front_load_discount = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                c023q.pfand_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                c023q.hide_price_tip = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c023q.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c023q.real_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                c023q.sale_price_excluding_platform_voucher = C02FG.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c023q.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023Q c023q) {
            C023Q c023q2 = c023q;
            ProtoAdapter<C02FG> protoAdapter = C02FG.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023q2.real_price);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c023q2.original_price) + protoAdapter2.encodedSizeWithTag(3, c023q2.discount) + protoAdapter2.encodedSizeWithTag(4, c023q2.original_price_value) + protoAdapter.encodedSizeWithTag(5, c023q2.discount_price) + protoAdapter2.encodedSizeWithTag(6, c023q2.unit_price_desc) + C029C.ADAPTER.encodedSizeWithTag(7, c023q2.icon) + C553002Do.ADAPTER.encodedSizeWithTag(8, c023q2.price_label_info) + protoAdapter2.encodedSizeWithTag(9, c023q2.sku_list_price);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, c023q2.discount_color) + protoAdapter3.encodedSizeWithTag(11, c023q2.discount_font) + protoAdapter3.encodedSizeWithTag(12, c023q2.original_price_color) + protoAdapter3.encodedSizeWithTag(13, c023q2.original_price_font);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, c023q2.front_load_discount) + protoAdapter2.encodedSizeWithTag(15, c023q2.pfand_price_desc) + protoAdapter2.encodedSizeWithTag(16, c023q2.hide_price_tip) + protoAdapter4.encodedSizeWithTag(17, c023q2.need_icon) + protoAdapter2.encodedSizeWithTag(18, c023q2.real_price_decimal) + protoAdapter.encodedSizeWithTag(19, c023q2.sale_price_excluding_platform_voucher) + protoAdapter2.encodedSizeWithTag(255, c023q2.da_info) + c023q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023Q c023q) {
        }
    };
    public String da_info;
    public String discount;
    public Integer discount_color;
    public Integer discount_font;
    public C02FG discount_price;
    public Boolean front_load_discount;
    public String hide_price_tip;
    public C029C icon;
    public Boolean need_icon;
    public String original_price;
    public Integer original_price_color;
    public Integer original_price_font;
    public String original_price_value;
    public String pfand_price_desc;
    public C553002Do price_label_info;
    public C02FG real_price;
    public String real_price_decimal;
    public C02FG sale_price_excluding_platform_voucher;
    public String sku_list_price;
    public String unit_price_desc;

    public C023Q() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
