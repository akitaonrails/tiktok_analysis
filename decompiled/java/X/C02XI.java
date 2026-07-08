package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XI extends Message<C02XI, C02XJ> {
    public static final ProtoAdapter<C02XI> ADAPTER = new ProtoAdapter<C02XI>() { // from class: X.02XH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XI decode(ProtoReader protoReader) {
            C02XI c02xi = new C02XI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xi.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xi.sku_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xi.product_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XI c02xi) {
            C02XI c02xi2 = c02xi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xi2.product_id) + protoAdapter.encodedSizeWithTag(2, c02xi2.sku_id) + protoAdapter.encodedSizeWithTag(3, c02xi2.seller_id) + c02xi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XI c02xi) {
        }
    };
    public String product_id;
    public String seller_id;
    public String sku_id;

    public C02XI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
