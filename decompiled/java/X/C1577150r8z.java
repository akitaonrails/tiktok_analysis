package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577150r8z extends Message<C1577150r8z, C1577170r91> {
    public static final ProtoAdapter<C1577150r8z> ADAPTER = new ProtoAdapter<C1577150r8z>() { // from class: X.0r8u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577150r8z decode(ProtoReader protoReader) {
            C1577170r91 c1577170r91 = new C1577170r91();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1577170r91.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1577170r91.LJ = C1577080r8s.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1577170r91.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577170r91.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577150r8z c1577150r8z) {
            C1577150r8z c1577150r8z2 = c1577150r8z;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1577150r8z2.time_stamp) + C1577080r8s.ADAPTER.encodedSizeWithTag(2, c1577150r8z2.resp) + c1577150r8z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577150r8z c1577150r8z) {
            C1577150r8z c1577150r8z2 = c1577150r8z;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1577150r8z2.time_stamp);
            C1577080r8s.ADAPTER.encodeWithTag(protoWriter, 2, c1577150r8z2.resp);
            protoWriter.writeBytes(c1577150r8z2.unknownFields());
        }
    };
    public C1577080r8s resp;
    public Long time_stamp;

    @Override // com.squareup.wire.Message
    public C1577170r91 newBuilder() {
        return null;
    }

    public C1577150r8z(Long l, C1577080r8s c1577080r8s) {
        this(l, c1577080r8s, ByteString.EMPTY);
    }

    public C1577150r8z(Long l, C1577080r8s c1577080r8s, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time_stamp = l;
        this.resp = c1577080r8s;
    }
}
