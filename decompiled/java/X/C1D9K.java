package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9K, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9K extends Message<C1D9K, C1D9J> {
    public static final ProtoAdapter<C1D9K> ADAPTER = new ProtoAdapter<C1D9K>() { // from class: X.1D9O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D9K decode(ProtoReader protoReader) {
            C1D9J c1d9j = new C1D9J();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d9j.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1d9j.LJ.add(C1D9L.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1d9j.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9j.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D9K c1d9k) {
            C1D9K c1d9k2 = c1d9k;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1d9k2.not_hit_fc) + C1D9L.ADAPTER.asRepeated().encodedSizeWithTag(2, c1d9k2.show_stats) + c1d9k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D9K c1d9k) {
            C1D9K c1d9k2 = c1d9k;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1d9k2.not_hit_fc);
            C1D9L.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1d9k2.show_stats);
            protoWriter.writeBytes(c1d9k2.unknownFields());
        }
    };
    public Boolean not_hit_fc;
    public List<C1D9L> show_stats;

    @Override // com.squareup.wire.Message
    public C1D9J newBuilder() {
        return null;
    }

    public C1D9K(Boolean bool, List<C1D9L> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public C1D9K(Boolean bool, List<C1D9L> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_hit_fc = bool;
        this.show_stats = C1516540pZE.LJFF("show_stats", list);
    }
}
