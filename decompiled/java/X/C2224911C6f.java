package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224911C6f extends Message<C2224911C6f, C2224921C6g> {
    public static final ProtoAdapter<C2224911C6f> ADAPTER = new ProtoAdapter<C2224911C6f>() { // from class: X.1C6e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224911C6f decode(ProtoReader protoReader) {
            C2224911C6f c2224911C6f = new C2224911C6f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c2224911C6f.items.add(C5431029t.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224911C6f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224911C6f c2224911C6f) {
            C2224911C6f c2224911C6f2 = c2224911C6f;
            return C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(1, c2224911C6f2.items) + c2224911C6f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224911C6f c2224911C6f) {
        }
    };
    public List<C5431029t> items;

    public C2224911C6f() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2224921C6g newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
