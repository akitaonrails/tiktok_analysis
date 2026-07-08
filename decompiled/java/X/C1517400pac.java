package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517400pac extends Message<C1517400pac, C1517410pad> {
    public static final ProtoAdapter<C1517400pac> ADAPTER = new ProtoAdapter<C1517400pac>() { // from class: X.0pab
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517400pac decode(ProtoReader protoReader) {
            C1517400pac c1517400pac = new C1517400pac();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517400pac.search_seq.add(C1517370paZ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1517400pac.context_info = C1517430paf.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517400pac;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517400pac c1517400pac) {
            C1517400pac c1517400pac2 = c1517400pac;
            return C1517430paf.ADAPTER.encodedSizeWithTag(1, c1517400pac2.context_info) + C1517370paZ.ADAPTER.asRepeated().encodedSizeWithTag(2, c1517400pac2.search_seq) + c1517400pac2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517400pac c1517400pac) {
            C1517400pac c1517400pac2 = c1517400pac;
            C1517430paf.ADAPTER.encodeWithTag(protoWriter, 1, c1517400pac2.context_info);
            C1517370paZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1517400pac2.search_seq);
            protoWriter.writeBytes(c1517400pac2.unknownFields());
        }
    };
    public C1517430paf context_info;
    public List<C1517370paZ> search_seq;

    @Override // com.squareup.wire.Message
    public C1517410pad newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517400pac(C1517430paf c1517430paf, List<C1517370paZ> list) {
        this(c1517430paf, list, ByteString.EMPTY);
    }

    public C1517400pac(C1517430paf c1517430paf, List<C1517370paZ> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.context_info = c1517430paf;
        this.search_seq = C1516540pZE.LJFF("search_seq", list);
    }
}
