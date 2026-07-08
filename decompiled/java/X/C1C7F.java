package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C7F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7F extends Message<C1C7F, C1C7G> {
    public static final ProtoAdapter<C1C7F> ADAPTER = new ProtoAdapter<C1C7F>() { // from class: X.1C7E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C7F decode(ProtoReader protoReader) {
            C1C7F c1c7f = new C1C7F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 3) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c7f.rows.add(C1C7C.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c7f.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C7F c1c7f) {
            C1C7F c1c7f2 = c1c7f;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c7f2.title) + C1C7C.ADAPTER.asRepeated().encodedSizeWithTag(3, c1c7f2.rows) + c1c7f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C7F c1c7f) {
        }
    };
    public List<C1C7C> rows;
    public String title;

    public C1C7F() {
        super(ADAPTER, ByteString.EMPTY);
        this.rows = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C7G newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
