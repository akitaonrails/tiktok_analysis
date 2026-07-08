package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601740rme extends Message<C1601740rme, C1601750rmf> {
    public static final ProtoAdapter<C1601740rme> ADAPTER = new ProtoAdapter<C1601740rme>() { // from class: X.0rmd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1601740rme decode(ProtoReader protoReader) {
            C1601750rmf c1601750rmf = new C1601750rmf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1601750rmf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1601750rmf.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1601750rmf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1601750rmf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1601740rme c1601740rme) {
            C1601740rme c1601740rme2 = c1601740rme;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1601740rme2.aweme_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1601740rme2.relation) + c1601740rme2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1601740rme c1601740rme) {
            C1601740rme c1601740rme2 = c1601740rme;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1601740rme2.aweme_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c1601740rme2.relation);
            protoWriter.writeBytes(c1601740rme2.unknownFields());
        }
    };
    public String aweme_id;
    public Integer relation;

    @Override // com.squareup.wire.Message
    public C1601750rmf newBuilder() {
        return null;
    }

    public C1601740rme(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public C1601740rme(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.relation = num;
    }
}
