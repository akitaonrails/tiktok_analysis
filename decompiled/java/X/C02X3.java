package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02X3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02X3 extends Message<C02X3, C02X4> {
    public static final ProtoAdapter<C02X3> ADAPTER = new ProtoAdapter<C02X3>() { // from class: X.02X2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02X3 decode(ProtoReader protoReader) {
            C02X3 c02x3 = new C02X3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02x3.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02x3.sku_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02x3.product_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02x3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02X3 c02x3) {
            C02X3 c02x32 = c02x3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02x32.product_id) + protoAdapter.encodedSizeWithTag(2, c02x32.sku_id) + protoAdapter.encodedSizeWithTag(3, c02x32.seller_id) + c02x32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02X3 c02x3) {
        }
    };
    public String product_id;
    public String seller_id;
    public String sku_id;

    public C02X3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02X4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
