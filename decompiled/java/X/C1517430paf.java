package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0paf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517430paf extends Message<C1517430paf, C1517440pag> {
    public static final ProtoAdapter<C1517430paf> ADAPTER = new ProtoAdapter<C1517430paf>() { // from class: X.0pae
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517430paf decode(ProtoReader protoReader) {
            C1517430paf c1517430paf = new C1517430paf();
            long jBeginMessage = protoReader.beginMessage();
            while (protoReader.nextTag() != -1) {
                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
            }
            protoReader.endMessage(jBeginMessage);
            return c1517430paf;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517430paf c1517430paf) {
            return c1517430paf.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517430paf c1517430paf) {
            protoWriter.writeBytes(c1517430paf.unknownFields());
        }
    };

    public C1517430paf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517440pag newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
