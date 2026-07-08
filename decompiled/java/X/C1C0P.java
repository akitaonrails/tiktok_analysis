package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0P, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0P extends Message<C1C0P, C1C0Q> {
    public static final ProtoAdapter<C1C0P> ADAPTER = new ProtoAdapter<C1C0P>() { // from class: X.1C0O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0P decode(ProtoReader protoReader) {
            C1C0P c1c0p = new C1C0P();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c0p.table = C1C0J.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c0p.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0P c1c0p) {
            C1C0P c1c0p2 = c1c0p;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c0p2.title) + C1C0J.ADAPTER.encodedSizeWithTag(2, c1c0p2.table) + c1c0p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C0P c1c0p) {
        }
    };
    public C1C0J table;
    public String title;

    public C1C0P() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C0Q newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
