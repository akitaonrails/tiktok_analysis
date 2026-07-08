package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C589702Rr extends Message<C589702Rr, C589802Rs> {
    public static final ProtoAdapter<C589702Rr> ADAPTER = new ProtoAdapter<C589702Rr>() { // from class: X.02Rq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C589702Rr decode(ProtoReader protoReader) {
            C589702Rr c589702Rr = new C589702Rr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c589702Rr.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c589702Rr.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c589702Rr.biz_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c589702Rr.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c589702Rr.real_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c589702Rr.count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c589702Rr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C589702Rr c589702Rr) {
            C589702Rr c589702Rr2 = c589702Rr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c589702Rr2.sku_id) + protoAdapter.encodedSizeWithTag(2, c589702Rr2.product_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c589702Rr2.biz_type) + protoAdapter.encodedSizeWithTag(4, c589702Rr2.seller_id) + protoAdapter.encodedSizeWithTag(5, c589702Rr2.real_price) + protoAdapter2.encodedSizeWithTag(6, c589702Rr2.count) + c589702Rr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C589702Rr c589702Rr) {
        }
    };
    public Integer biz_type;
    public Integer count;
    public String product_id;
    public String real_price;
    public String seller_id;
    public String sku_id;

    public C589702Rr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C589802Rs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
