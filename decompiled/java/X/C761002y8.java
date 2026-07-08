package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C761002y8 extends Message<C761002y8, C761102y9> {
    public static final ProtoAdapter<C761002y8> ADAPTER = new ProtoAdapter<C761002y8>() { // from class: X.02y7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C761002y8 decode(ProtoReader protoReader) {
            C761002y8 c761002y8 = new C761002y8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 200) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c761002y8.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c761002y8.message = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c761002y8.toast_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c761002y8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C761002y8 c761002y8) {
            C761002y8 c761002y82 = c761002y8;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c761002y82.toast_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c761002y82.message) + protoAdapter.encodedSizeWithTag(200, c761002y82.da_info) + c761002y82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C761002y8 c761002y8) {
        }
    };
    public String da_info;
    public String message;
    public Integer toast_type;

    public C761002y8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C761102y9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
