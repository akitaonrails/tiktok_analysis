package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2T extends Message<C1C2T, C1C2U> {
    public static final ProtoAdapter<C1C2T> ADAPTER = new ProtoAdapter<C1C2T>() { // from class: X.1C2S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2T decode(ProtoReader protoReader) {
            C1C2T c1c2t = new C1C2T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1c2t.entity_list.add(C1C2W.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2T c1c2t) {
            C1C2T c1c2t2 = c1c2t;
            return C1C2W.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c2t2.entity_list) + c1c2t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2T c1c2t) {
            C1C2T c1c2t2 = c1c2t;
            C1C2W.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1c2t2.entity_list);
            protoWriter.writeBytes(c1c2t2.unknownFields());
        }
    };
    public List<C1C2W> entity_list;

    public C1C2T() {
        super(ADAPTER, ByteString.EMPTY);
        this.entity_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C2U newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
