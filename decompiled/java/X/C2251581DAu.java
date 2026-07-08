package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251581DAu extends Message<C2251581DAu, C2251571DAt> {
    public static final ProtoAdapter<C2251581DAu> ADAPTER = new ProtoAdapter<C2251581DAu>() { // from class: X.1DAv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251581DAu decode(ProtoReader protoReader) {
            C2251581DAu c2251581DAu = new C2251581DAu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251581DAu.spu_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251581DAu.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251581DAu.price_in_usd = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251581DAu.local_price_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2251581DAu.local_currency_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251581DAu.discount_price_in_usd = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2251581DAu.local_discount_price_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251581DAu.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251581DAu.mp_product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251581DAu.mp_price_point_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2251581DAu.promotion_flag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2251581DAu.promotion_offer_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2251581DAu.google_base_plan_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251581DAu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251581DAu c2251581DAu) {
            C2251581DAu c2251581DAu2 = c2251581DAu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251581DAu2.spu_id) + protoAdapter.encodedSizeWithTag(2, c2251581DAu2.sku_id) + protoAdapter.encodedSizeWithTag(3, c2251581DAu2.price_in_usd) + protoAdapter.encodedSizeWithTag(4, c2251581DAu2.local_price_amount) + protoAdapter.encodedSizeWithTag(5, c2251581DAu2.local_currency_code) + protoAdapter.encodedSizeWithTag(6, c2251581DAu2.discount_price_in_usd) + protoAdapter.encodedSizeWithTag(7, c2251581DAu2.local_discount_price_amount) + protoAdapter.encodedSizeWithTag(8, c2251581DAu2.voucher_id) + protoAdapter.encodedSizeWithTag(9, c2251581DAu2.mp_product_id) + protoAdapter.encodedSizeWithTag(10, c2251581DAu2.mp_price_point_id) + protoAdapter.encodedSizeWithTag(11, c2251581DAu2.promotion_flag) + protoAdapter.encodedSizeWithTag(12, c2251581DAu2.promotion_offer_id) + protoAdapter.encodedSizeWithTag(13, c2251581DAu2.google_base_plan_id) + c2251581DAu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251581DAu c2251581DAu) {
            C2251581DAu c2251581DAu2 = c2251581DAu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251581DAu2.spu_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251581DAu2.sku_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251581DAu2.price_in_usd);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251581DAu2.local_price_amount);
            protoAdapter.encodeWithTag(protoWriter, 5, c2251581DAu2.local_currency_code);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251581DAu2.discount_price_in_usd);
            protoAdapter.encodeWithTag(protoWriter, 7, c2251581DAu2.local_discount_price_amount);
            protoAdapter.encodeWithTag(protoWriter, 8, c2251581DAu2.voucher_id);
            protoAdapter.encodeWithTag(protoWriter, 9, c2251581DAu2.mp_product_id);
            protoAdapter.encodeWithTag(protoWriter, 10, c2251581DAu2.mp_price_point_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c2251581DAu2.promotion_flag);
            protoAdapter.encodeWithTag(protoWriter, 12, c2251581DAu2.promotion_offer_id);
            protoAdapter.encodeWithTag(protoWriter, 13, c2251581DAu2.google_base_plan_id);
            protoWriter.writeBytes(c2251581DAu2.unknownFields());
        }
    };
    public String discount_price_in_usd;
    public String google_base_plan_id;
    public String local_currency_code;
    public String local_discount_price_amount;
    public String local_price_amount;
    public String mp_price_point_id;
    public String mp_product_id;
    public String price_in_usd;
    public String promotion_flag;
    public String promotion_offer_id;
    public String sku_id;
    public String spu_id;
    public String voucher_id;

    public C2251581DAu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251571DAt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
