package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.036m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7894036m extends Message<C7894036m, C7893036l> {
    public static final ProtoAdapter<C7894036m> ADAPTER = new ProtoAdapter<C7894036m>() { // from class: X.036n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C7894036m decode(ProtoReader protoReader) {
            C7894036m c7894036m = new C7894036m();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c7894036m.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c7894036m.sku_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c7894036m.sku_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c7894036m.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c7894036m.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c7894036m.sku_real_price_val = C02FG.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c7894036m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C7894036m c7894036m) {
            C7894036m c7894036m2 = c7894036m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c7894036m2.sku_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c7894036m2.sku_count) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c7894036m2.sku_selected) + protoAdapter.encodedSizeWithTag(4, c7894036m2.product_id) + protoAdapter.encodedSizeWithTag(5, c7894036m2.seller_id) + C02FG.ADAPTER.encodedSizeWithTag(6, c7894036m2.sku_real_price_val) + c7894036m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C7894036m c7894036m) {
        }
    };
    public String product_id;
    public String seller_id;
    public Integer sku_count;
    public String sku_id;
    public C02FG sku_real_price_val;
    public Boolean sku_selected;

    public C7894036m() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C7893036l newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
