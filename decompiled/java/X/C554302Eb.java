package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554302Eb extends Message<C554302Eb, C577802Nc> {
    public static final ProtoAdapter<C554302Eb> ADAPTER = new ProtoAdapter<C554302Eb>() { // from class: X.028v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554302Eb decode(ProtoReader protoReader) {
            C554302Eb c554302Eb = new C554302Eb();
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
                                        c554302Eb.encrypt_cpf_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c554302Eb.hint = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c554302Eb.value = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c554302Eb.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c554302Eb.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554302Eb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554302Eb c554302Eb) {
            C554302Eb c554302Eb2 = c554302Eb;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c554302Eb2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c554302Eb2.name) + protoAdapter.encodedSizeWithTag(3, c554302Eb2.value) + protoAdapter.encodedSizeWithTag(4, c554302Eb2.hint) + protoAdapter.encodedSizeWithTag(5, c554302Eb2.encrypt_cpf_info) + c554302Eb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554302Eb c554302Eb) {
        }
    };
    public String encrypt_cpf_info;
    public String hint;
    public String name;
    public Integer type;
    public String value;

    public C554302Eb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577802Nc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
