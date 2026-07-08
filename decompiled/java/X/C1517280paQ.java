package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0paQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517280paQ extends Message<C1517280paQ, C1517290paR> {
    public static final ProtoAdapter<C1517280paQ> ADAPTER = new ProtoAdapter<C1517280paQ>() { // from class: X.0paP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517280paQ decode(ProtoReader protoReader) {
            C1517280paQ c1517280paQ = new C1517280paQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517280paQ.quick_reply_emojis.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517280paQ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517280paQ c1517280paQ) {
            C1517280paQ c1517280paQ2 = c1517280paQ;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c1517280paQ2.quick_reply_emojis) + c1517280paQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517280paQ c1517280paQ) {
            C1517280paQ c1517280paQ2 = c1517280paQ;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c1517280paQ2.quick_reply_emojis);
            protoWriter.writeBytes(c1517280paQ2.unknownFields());
        }
    };
    public List<String> quick_reply_emojis;

    public C1517280paQ() {
        super(ADAPTER, ByteString.EMPTY);
        this.quick_reply_emojis = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1517290paR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
