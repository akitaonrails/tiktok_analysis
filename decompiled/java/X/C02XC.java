package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XC extends Message<C02XC, C02XD> {
    public static final ProtoAdapter<C02XC> ADAPTER = new ProtoAdapter<C02XC>() { // from class: X.02XB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XC decode(ProtoReader protoReader) {
            C02XC c02xc = new C02XC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xc.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xc.product_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xc.sku_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XC c02xc) {
            C02XC c02xc2 = c02xc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xc2.sku_id) + protoAdapter.encodedSizeWithTag(2, c02xc2.product_id) + protoAdapter.encodedSizeWithTag(3, c02xc2.seller_id) + c02xc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XC c02xc) {
        }
    };
    public String product_id;
    public String seller_id;
    public String sku_id;

    public C02XC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
