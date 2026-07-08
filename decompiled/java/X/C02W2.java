package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02W2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02W2 extends Message<C02W2, C02W3> {
    public static final ProtoAdapter<C02W2> ADAPTER = new ProtoAdapter<C02W2>() { // from class: X.02W1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02W2 decode(ProtoReader protoReader) {
            C02W2 c02w2 = new C02W2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02w2.open_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02w2.web_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02w2.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02w2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02W2 c02w2) {
            C02W2 c02w22 = c02w2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02w22.desc) + protoAdapter.encodedSizeWithTag(2, c02w22.web_url) + protoAdapter.encodedSizeWithTag(3, c02w22.open_url) + c02w22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02W2 c02w2) {
            C02W2 c02w22 = c02w2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02w22.desc);
            protoAdapter.encodeWithTag(protoWriter, 2, c02w22.web_url);
            protoAdapter.encodeWithTag(protoWriter, 3, c02w22.open_url);
            protoWriter.writeBytes(c02w22.unknownFields());
        }
    };
    public String desc;
    public String open_url;
    public String web_url;

    public C02W2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02W3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
