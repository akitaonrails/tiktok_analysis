package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F6 extends Message<C02F6, C02NP> {
    public static final ProtoAdapter<C02F6> ADAPTER = new ProtoAdapter<C02F6>() { // from class: X.028u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F6 decode(ProtoReader protoReader) {
            C02F6 c02f6 = new C02F6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02f6.sale_props_str = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02f6.sku_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02f6.sku_image = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02f6.product_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02f6.sku_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F6 c02f6) {
            C02F6 c02f62 = c02f6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02f62.sku_id) + protoAdapter.encodedSizeWithTag(2, c02f62.product_id) + C02U1.ADAPTER.encodedSizeWithTag(3, c02f62.sku_image) + protoAdapter.encodedSizeWithTag(4, c02f62.sku_name) + protoAdapter.encodedSizeWithTag(5, c02f62.sale_props_str) + c02f62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02F6 c02f6) {
        }
    };
    public String product_id;
    public String sale_props_str;
    public String sku_id;
    public C02U1 sku_image;
    public String sku_name;

    public C02F6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
