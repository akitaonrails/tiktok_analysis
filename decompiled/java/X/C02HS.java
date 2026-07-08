package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HS extends Message<C02HS, C573502Ll> {
    public static final ProtoAdapter<C02HS> ADAPTER = new ProtoAdapter<C02HS>() { // from class: X.02HT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HS decode(ProtoReader protoReader) {
            C02HS c02hs = new C02HS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02hs.declaration_payload = C617702b1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02hs.declaration_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HS c02hs) {
            C02HS c02hs2 = c02hs;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02hs2.declaration_type) + C617702b1.ADAPTER.encodedSizeWithTag(2, c02hs2.declaration_payload) + c02hs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HS c02hs) {
            C02HS c02hs2 = c02hs;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02hs2.declaration_type);
            C617702b1.ADAPTER.encodeWithTag(protoWriter, 2, c02hs2.declaration_payload);
            protoWriter.writeBytes(c02hs2.unknownFields());
        }
    };
    public C617702b1 declaration_payload;
    public Integer declaration_type;

    public C02HS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573502Ll newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
