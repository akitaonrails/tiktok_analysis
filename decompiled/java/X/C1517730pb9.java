package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517730pb9 extends Message<C1517730pb9, C1517740pbA> {
    public static final ProtoAdapter<C1517730pb9> ADAPTER = new ProtoAdapter<C1517730pb9>() { // from class: X.0pb8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517730pb9 decode(ProtoReader protoReader) {
            C1517730pb9 c1517730pb9 = new C1517730pb9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517730pb9.publish_seq.add(C1517760pbC.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1517730pb9.context_info = C1517490pal.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517730pb9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517730pb9 c1517730pb9) {
            C1517730pb9 c1517730pb92 = c1517730pb9;
            return C1517490pal.ADAPTER.encodedSizeWithTag(1, c1517730pb92.context_info) + C1517760pbC.ADAPTER.asRepeated().encodedSizeWithTag(2, c1517730pb92.publish_seq) + c1517730pb92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517730pb9 c1517730pb9) {
            C1517730pb9 c1517730pb92 = c1517730pb9;
            C1517490pal.ADAPTER.encodeWithTag(protoWriter, 1, c1517730pb92.context_info);
            C1517760pbC.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1517730pb92.publish_seq);
            protoWriter.writeBytes(c1517730pb92.unknownFields());
        }
    };
    public C1517490pal context_info;
    public List<C1517760pbC> publish_seq;

    public C1517730pb9() {
        super(ADAPTER, ByteString.EMPTY);
        this.publish_seq = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1517740pbA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
