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

/* JADX INFO: renamed from: X.0234, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0234 extends Message<AnonymousClass0234, C02PO> {
    public static final ProtoAdapter<AnonymousClass0234> ADAPTER = new ProtoAdapter<AnonymousClass0234>() { // from class: X.022Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0234 decode(ProtoReader protoReader) {
            AnonymousClass0234 anonymousClass0234 = new AnonymousClass0234();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                anonymousClass0234.original_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                anonymousClass0234.real_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                anonymousClass0234.discount = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                anonymousClass0234.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                anonymousClass0234.is_interval_price = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                anonymousClass0234.show_hot_zone = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                anonymousClass0234.lowest_price_hint = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                anonymousClass0234.price_difference = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        anonymousClass0234.min_sku_price = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        anonymousClass0234.max_sku_price = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        anonymousClass0234.currency = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 14:
                                        anonymousClass0234.min_sku_original_price = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 15:
                                        anonymousClass0234.price_prefix = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 16:
                                        anonymousClass0234.panel_schema = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        anonymousClass0234.max_sku_original_price = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        anonymousClass0234.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 19:
                                        anonymousClass0234.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        anonymousClass0234.tax_include_desc = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 21:
                                        anonymousClass0234.unit_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 22:
                                        anonymousClass0234.price_label_info = C5424029m.ADAPTER.decode(protoReader);
                                        break;
                                    case 23:
                                        anonymousClass0234.tax_include_desc_position = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                        anonymousClass0234.hide_price_tip = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 25:
                                        anonymousClass0234.real_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                                break;
                        }
                    } else {
                        anonymousClass0234.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0234;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0234 anonymousClass0234) {
            AnonymousClass0234 anonymousClass02342 = anonymousClass0234;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02342.original_price) + protoAdapter.encodedSizeWithTag(2, anonymousClass02342.real_price) + protoAdapter.encodedSizeWithTag(3, anonymousClass02342.discount);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, anonymousClass02342.need_icon) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02342.is_interval_price) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02342.show_hot_zone) + protoAdapter.encodedSizeWithTag(7, anonymousClass02342.lowest_price_hint) + protoAdapter.encodedSizeWithTag(8, anonymousClass02342.price_difference) + protoAdapter.encodedSizeWithTag(11, anonymousClass02342.min_sku_price) + protoAdapter.encodedSizeWithTag(12, anonymousClass02342.max_sku_price) + protoAdapter.encodedSizeWithTag(13, anonymousClass02342.currency) + protoAdapter.encodedSizeWithTag(14, anonymousClass02342.min_sku_original_price) + protoAdapter.encodedSizeWithTag(15, anonymousClass02342.price_prefix) + protoAdapter.encodedSizeWithTag(16, anonymousClass02342.panel_schema) + protoAdapter.encodedSizeWithTag(17, anonymousClass02342.max_sku_original_price) + protoAdapter.encodedSizeWithTag(18, anonymousClass02342.currency_symbol);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(19, anonymousClass02342.symbol_position) + protoAdapter.encodedSizeWithTag(20, anonymousClass02342.tax_include_desc) + protoAdapter.encodedSizeWithTag(21, anonymousClass02342.unit_price_desc) + C5424029m.ADAPTER.encodedSizeWithTag(22, anonymousClass02342.price_label_info) + protoAdapter3.encodedSizeWithTag(23, anonymousClass02342.tax_include_desc_position) + protoAdapter.encodedSizeWithTag(24, anonymousClass02342.hide_price_tip) + protoAdapter.encodedSizeWithTag(25, anonymousClass02342.real_price_decimal) + protoAdapter.encodedSizeWithTag(255, anonymousClass02342.da_info) + anonymousClass02342.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0234 anonymousClass0234) {
        }
    };
    public String currency;
    public String currency_symbol;
    public String da_info;
    public String discount;
    public String hide_price_tip;
    public Boolean is_interval_price;
    public String lowest_price_hint;
    public String max_sku_original_price;
    public String max_sku_price;
    public String min_sku_original_price;
    public String min_sku_price;
    public Boolean need_icon;
    public String original_price;
    public String panel_schema;
    public String price_difference;
    public C5424029m price_label_info;
    public String price_prefix;
    public String real_price;
    public String real_price_decimal;
    public Boolean show_hot_zone;
    public Integer symbol_position;
    public String tax_include_desc;
    public Integer tax_include_desc_position;
    public String unit_price_desc;

    public AnonymousClass0234() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
