package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517460pai extends Message<C1517460pai, C1517470paj> {
    public static final ProtoAdapter<C1517460pai> ADAPTER = new ProtoAdapter<C1517460pai>() { // from class: X.0pah
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517460pai decode(ProtoReader protoReader) {
            C1517460pai c1517460pai = new C1517460pai();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517460pai.is_archive_filtered = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517460pai;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517460pai c1517460pai) {
            C1517460pai c1517460pai2 = c1517460pai;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1517460pai2.is_archive_filtered) + c1517460pai2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517460pai c1517460pai) {
            C1517460pai c1517460pai2 = c1517460pai;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1517460pai2.is_archive_filtered);
            protoWriter.writeBytes(c1517460pai2.unknownFields());
        }
    };
    public Boolean is_archive_filtered;

    public C1517460pai() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517470paj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
