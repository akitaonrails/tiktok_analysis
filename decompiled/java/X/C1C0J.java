package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0J extends Message<C1C0J, C1C0K> {
    public static final ProtoAdapter<C1C0J> ADAPTER = new ProtoAdapter<C1C0J>() { // from class: X.1C0I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0J decode(ProtoReader protoReader) {
            C1C0J c1c0j = new C1C0J();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c0j.rows.add(C1C0G.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c0j.headers.add(C1C0M.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0J c1c0j) {
            C1C0J c1c0j2 = c1c0j;
            return C1C0M.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c0j2.headers) + C1C0G.ADAPTER.asRepeated().encodedSizeWithTag(2, c1c0j2.rows) + c1c0j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C0J c1c0j) {
        }
    };
    public List<C1C0M> headers;
    public List<C1C0G> rows;

    public C1C0J() {
        super(ADAPTER, ByteString.EMPTY);
        this.headers = C1516540pZE.LJIIIIZZ();
        this.rows = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C0K newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
