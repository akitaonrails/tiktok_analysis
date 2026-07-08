package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577160r90 extends Message<C1577160r90, C1577180r92> {
    public static final ProtoAdapter<C1577160r90> ADAPTER = new ProtoAdapter<C1577160r90>() { // from class: X.0r8v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577160r90 decode(ProtoReader protoReader) {
            C1577180r92 c1577180r92 = new C1577180r92();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1577180r92.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1577180r92.LJ = C1577050r8p.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1577180r92.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577180r92.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577160r90 c1577160r90) {
            C1577160r90 c1577160r902 = c1577160r90;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1577160r902.time_stamp) + C1577050r8p.ADAPTER.encodedSizeWithTag(2, c1577160r902.resp) + c1577160r902.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577160r90 c1577160r90) {
            C1577160r90 c1577160r902 = c1577160r90;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1577160r902.time_stamp);
            C1577050r8p.ADAPTER.encodeWithTag(protoWriter, 2, c1577160r902.resp);
            protoWriter.writeBytes(c1577160r902.unknownFields());
        }
    };
    public C1577050r8p resp;
    public Long time_stamp;

    @Override // com.squareup.wire.Message
    public C1577180r92 newBuilder() {
        return null;
    }

    public C1577160r90(Long l, C1577050r8p c1577050r8p) {
        this(l, c1577050r8p, ByteString.EMPTY);
    }

    public C1577160r90(Long l, C1577050r8p c1577050r8p, ByteString byteString) {
        super(ADAPTER, byteString);
        this.time_stamp = l;
        this.resp = c1577050r8p;
    }
}
