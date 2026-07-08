package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02A3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02A3 extends Message<C02A3, C580402Oc> {
    public static final ProtoAdapter<C02A3> ADAPTER = new ProtoAdapter<C02A3>() { // from class: X.025x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02A3 decode(ProtoReader protoReader) {
            C02A3 c02a3 = new C02A3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02a3.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02a3.plan = AnonymousClass0215.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02a3.sku_pic = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02a3.quantity = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c02a3.installment_amount_inner_item = C649302g7.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02a3.product_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02a3.sku_props = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02a3.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02a3.shop_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02a3.shop_logo_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02a3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02A3 c02a3) {
            C02A3 c02a32 = c02a3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02a32.sku_id) + AnonymousClass0215.ADAPTER.encodedSizeWithTag(2, c02a32.plan) + protoAdapter.encodedSizeWithTag(3, c02a32.sku_pic) + ProtoAdapter.INT64.encodedSizeWithTag(4, c02a32.quantity) + C649302g7.ADAPTER.encodedSizeWithTag(5, c02a32.installment_amount_inner_item) + protoAdapter.encodedSizeWithTag(6, c02a32.product_name) + protoAdapter.encodedSizeWithTag(7, c02a32.sku_props) + protoAdapter.encodedSizeWithTag(8, c02a32.seller_id) + protoAdapter.encodedSizeWithTag(9, c02a32.shop_name) + protoAdapter.encodedSizeWithTag(10, c02a32.shop_logo_url) + c02a32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02A3 c02a3) {
        }
    };
    public C649302g7 installment_amount_inner_item;
    public AnonymousClass0215 plan;
    public String product_name;
    public Long quantity;
    public String seller_id;
    public String shop_logo_url;
    public String shop_name;
    public String sku_id;
    public String sku_pic;
    public String sku_props;

    public C02A3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580402Oc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
