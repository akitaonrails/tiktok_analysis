package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C707102pR extends Message<C707102pR, C707002pQ> {
    public static final ProtoAdapter<C707102pR> ADAPTER = new ProtoAdapter<C707102pR>() { // from class: X.02pS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C707102pR decode(ProtoReader protoReader) {
            C707102pR c707102pR = new C707102pR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c707102pR.vid = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c707102pR.config_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c707102pR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C707102pR c707102pR) {
            C707102pR c707102pR2 = c707102pR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c707102pR2.config_key) + protoAdapter.encodedSizeWithTag(2, c707102pR2.vid) + c707102pR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C707102pR c707102pR) {
            C707102pR c707102pR2 = c707102pR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c707102pR2.config_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c707102pR2.vid);
            protoWriter.writeBytes(c707102pR2.unknownFields());
        }
    };
    public String config_key;
    public String vid;

    public C707102pR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C707002pQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
