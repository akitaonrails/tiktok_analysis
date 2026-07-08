package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02A5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02A5 extends Message<C02A5, C586502Ql> {
    public static final ProtoAdapter<C02A5> ADAPTER = new ProtoAdapter<C02A5>() { // from class: X.025A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02A5 decode(ProtoReader protoReader) {
            C02A5 c02a5 = new C02A5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02a5.change_product_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02a5.has_note = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02a5.sku_card_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02a5.add_note_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02a5.seller_coupon_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02a5.shop_info_display_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02a5.rights_display_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02a5.low_stock_warning_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02a5.use_coupon_applied_price_promotion_label = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02a5.logistics_display_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02a5.self_pickup_display_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02a5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02A5 c02a5) {
            C02A5 c02a52 = c02a5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02a52.change_product_count) + protoAdapter.encodedSizeWithTag(2, c02a52.has_note) + protoAdapter.encodedSizeWithTag(3, c02a52.sku_card_style) + protoAdapter.encodedSizeWithTag(4, c02a52.add_note_position) + protoAdapter.encodedSizeWithTag(5, c02a52.seller_coupon_style) + protoAdapter.encodedSizeWithTag(6, c02a52.shop_info_display_style) + protoAdapter.encodedSizeWithTag(7, c02a52.rights_display_style) + protoAdapter.encodedSizeWithTag(8, c02a52.low_stock_warning_style) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c02a52.use_coupon_applied_price_promotion_label) + protoAdapter.encodedSizeWithTag(10, c02a52.logistics_display_type) + protoAdapter.encodedSizeWithTag(11, c02a52.self_pickup_display_type) + c02a52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02A5 c02a5) {
        }
    };
    public Integer add_note_position;
    public Integer change_product_count;
    public Integer has_note;
    public Integer logistics_display_type;
    public Integer low_stock_warning_style;
    public Integer rights_display_style;
    public Integer self_pickup_display_type;
    public Integer seller_coupon_style;
    public Integer shop_info_display_style;
    public Integer sku_card_style;
    public Boolean use_coupon_applied_price_promotion_label;

    public C02A5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586502Ql newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
