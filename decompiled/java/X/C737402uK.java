package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C737402uK extends Message<C737402uK, C737302uJ> {
    public static final ProtoAdapter<C737402uK> ADAPTER = new ProtoAdapter<C737402uK>() { // from class: X.02uL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C737402uK decode(ProtoReader protoReader) {
            C737402uK c737402uK = new C737402uK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c737402uK.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c737402uK.product_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c737402uK.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c737402uK.sale_props_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c737402uK.price = C023Q.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c737402uK.sku_amount = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c737402uK.image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c737402uK.tier_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c737402uK.biz_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c737402uK.gift_discount_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c737402uK;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C737402uK c737402uK) {
            C737402uK c737402uK2 = c737402uK;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c737402uK2.product_id) + protoAdapter.encodedSizeWithTag(2, c737402uK2.product_name) + protoAdapter.encodedSizeWithTag(3, c737402uK2.sku_id) + protoAdapter.encodedSizeWithTag(4, c737402uK2.sale_props_str) + C023Q.ADAPTER.encodedSizeWithTag(5, c737402uK2.price);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c737402uK2.sku_amount) + C02U1.ADAPTER.encodedSizeWithTag(7, c737402uK2.image) + ProtoAdapter.INT64.encodedSizeWithTag(8, c737402uK2.tier_id) + protoAdapter2.encodedSizeWithTag(9, c737402uK2.biz_type) + protoAdapter.encodedSizeWithTag(10, c737402uK2.gift_discount_text) + c737402uK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C737402uK c737402uK) {
        }
    };
    public Integer biz_type;
    public String gift_discount_text;
    public C02U1 image;
    public C023Q price;
    public String product_id;
    public String product_name;
    public String sale_props_str;
    public Integer sku_amount;
    public String sku_id;
    public Long tier_id;

    public C737402uK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C737302uJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
