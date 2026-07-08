package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6W extends Message<C1C6W, C1C6X> {
    public static final ProtoAdapter<C1C6W> ADAPTER = new ProtoAdapter<C1C6W>() { // from class: X.1C6V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6W decode(ProtoReader protoReader) {
            C1C6W c1c6w = new C1C6W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1c6w.ec_rich_blocks.add(C1C6Z.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6W c1c6w) {
            C1C6W c1c6w2 = c1c6w;
            return C1C6Z.ADAPTER.asRepeated().encodedSizeWithTag(2, c1c6w2.ec_rich_blocks) + c1c6w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C6W c1c6w) {
        }
    };
    public List<C1C6Z> ec_rich_blocks;

    public C1C6W() {
        super(ADAPTER, ByteString.EMPTY);
        this.ec_rich_blocks = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C6X newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
