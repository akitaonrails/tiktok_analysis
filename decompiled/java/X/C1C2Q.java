package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2Q extends Message<C1C2Q, C1C2R> {
    public static final ProtoAdapter<C1C2Q> ADAPTER = new ProtoAdapter<C1C2Q>() { // from class: X.1C2P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2Q decode(ProtoReader protoReader) {
            C1C2Q c1c2q = new C1C2Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c2q.first_installation = C1C2N.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c2q.last_installation = C1C2N.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2Q c1c2q) {
            C1C2Q c1c2q2 = c1c2q;
            ProtoAdapter<C1C2N> protoAdapter = C1C2N.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1c2q2.last_installation) + protoAdapter.encodedSizeWithTag(2, c1c2q2.first_installation) + c1c2q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2Q c1c2q) {
            C1C2Q c1c2q2 = c1c2q;
            ProtoAdapter<C1C2N> protoAdapter = C1C2N.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c2q2.last_installation);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c2q2.first_installation);
            protoWriter.writeBytes(c1c2q2.unknownFields());
        }
    };
    public C1C2N first_installation;
    public C1C2N last_installation;

    @Override // com.squareup.wire.Message
    public C1C2R newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1C2Q(C1C2N c1c2n, C1C2N c1c2n2) {
        this(c1c2n, c1c2n2, ByteString.EMPTY);
    }

    public C1C2Q(C1C2N c1c2n, C1C2N c1c2n2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.last_installation = c1c2n;
        this.first_installation = c1c2n2;
    }
}
