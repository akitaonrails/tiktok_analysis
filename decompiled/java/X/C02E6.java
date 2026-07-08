package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E6 extends Message<C02E6, C571902Kv> {
    public static final ProtoAdapter<C02E6> ADAPTER = new ProtoAdapter<C02E6>() { // from class: X.02CH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E6 decode(ProtoReader protoReader) {
            C02E6 c02e6 = new C02E6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 9) {
                                if (iNextTag != 10) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02e6.next_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02e6.vip_verification_schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02e6.brand = C02CG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02e6.product = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E6 c02e6) {
            C02E6 c02e62 = c02e6;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02e62.product) + C02CG.ADAPTER.encodedSizeWithTag(2, c02e62.brand);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, c02e62.vip_verification_schema) + protoAdapter.encodedSizeWithTag(10, c02e62.next_schema) + c02e62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E6 c02e6) {
            C02E6 c02e62 = c02e6;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02e62.product);
            C02CG.ADAPTER.encodeWithTag(protoWriter, 2, c02e62.brand);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 9, c02e62.vip_verification_schema);
            protoAdapter.encodeWithTag(protoWriter, 10, c02e62.next_schema);
            protoWriter.writeBytes(c02e62.unknownFields());
        }
    };
    public C02CG brand;
    public String next_schema;
    public Integer product;
    public String vip_verification_schema;

    public C02E6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571902Kv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
