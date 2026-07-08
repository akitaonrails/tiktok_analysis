package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9L, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9L extends Message<C1D9L, C1D9I> {
    public static final ProtoAdapter<C1D9L> ADAPTER = new ProtoAdapter<C1D9L>() { // from class: X.1D9P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D9L decode(ProtoReader protoReader) {
            C1D9I c1d9i = new C1D9I();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d9i.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1d9i.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1d9i.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9i.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D9L c1d9l) {
            C1D9L c1d9l2 = c1d9l;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1d9l2.survey_id) + protoAdapter.encodedSizeWithTag(2, c1d9l2.show_timestamp) + c1d9l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D9L c1d9l) {
            C1D9L c1d9l2 = c1d9l;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d9l2.survey_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d9l2.show_timestamp);
            protoWriter.writeBytes(c1d9l2.unknownFields());
        }
    };
    public Long show_timestamp;
    public Long survey_id;

    @Override // com.squareup.wire.Message
    public C1D9I newBuilder() {
        return null;
    }

    public C1D9L(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C1D9L(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.survey_id = l;
        this.show_timestamp = l2;
    }
}
