package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WE extends Message<C02WE, C02WF> {
    public static final ProtoAdapter<C02WE> ADAPTER = new ProtoAdapter<C02WE>() { // from class: X.02WD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WE decode(ProtoReader protoReader) {
            C02WE c02we = new C02WE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02we.download_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02we.token = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02we.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02we;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WE c02we) {
            C02WE c02we2 = c02we;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02we2.schema) + protoAdapter.encodedSizeWithTag(2, c02we2.token) + protoAdapter.encodedSizeWithTag(3, c02we2.download_url) + c02we2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02WE c02we) {
            C02WE c02we2 = c02we;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02we2.schema);
            protoAdapter.encodeWithTag(protoWriter, 2, c02we2.token);
            protoAdapter.encodeWithTag(protoWriter, 3, c02we2.download_url);
            protoWriter.writeBytes(c02we2.unknownFields());
        }
    };
    public String download_url;
    public String schema;
    public String token;

    public C02WE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
