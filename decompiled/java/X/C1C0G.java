package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0G extends Message<C1C0G, C1C0H> {
    public static final ProtoAdapter<C1C0G> ADAPTER = new ProtoAdapter<C1C0G>() { // from class: X.1C0F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0G decode(ProtoReader protoReader) {
            C1C0G c1c0g = new C1C0G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1c0g.cells.add(C1C0D.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0G c1c0g) {
            C1C0G c1c0g2 = c1c0g;
            return C1C0D.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c0g2.cells) + c1c0g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C0G c1c0g) {
        }
    };
    public List<C1C0D> cells;

    public C1C0G() {
        super(ADAPTER, ByteString.EMPTY);
        this.cells = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C0H newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
