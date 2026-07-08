package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C638702eP extends Message<C638702eP, C638802eQ> {
    public static final ProtoAdapter<C638702eP> ADAPTER = new ProtoAdapter<C638702eP>() { // from class: X.02eO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C638702eP decode(ProtoReader protoReader) {
            C638702eP c638702eP = new C638702eP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c638702eP.text_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c638702eP.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c638702eP;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C638702eP c638702eP) {
            C638702eP c638702eP2 = c638702eP;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c638702eP2.text) + protoAdapter.encodedSizeWithTag(2, c638702eP2.text_color) + c638702eP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C638702eP c638702eP) {
            C638702eP c638702eP2 = c638702eP;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c638702eP2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c638702eP2.text_color);
            protoWriter.writeBytes(c638702eP2.unknownFields());
        }
    };
    public String text;
    public String text_color;

    public C638702eP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C638802eQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
