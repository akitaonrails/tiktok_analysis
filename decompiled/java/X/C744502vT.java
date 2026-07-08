package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C744502vT extends Message<C744502vT, C744602vU> {
    public static final ProtoAdapter<C744502vT> ADAPTER = new ProtoAdapter<C744502vT>() { // from class: X.02vS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C744502vT decode(ProtoReader protoReader) {
            C744502vT c744502vT = new C744502vT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c744502vT.rich_blocks.add(C744202vQ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c744502vT.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c744502vT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C744502vT c744502vT) {
            C744502vT c744502vT2 = c744502vT;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c744502vT2.title) + C744202vQ.ADAPTER.asRepeated().encodedSizeWithTag(2, c744502vT2.rich_blocks) + c744502vT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C744502vT c744502vT) {
        }
    };
    public List<C744202vQ> rich_blocks;
    public String title;

    public C744502vT() {
        super(ADAPTER, ByteString.EMPTY);
        this.rich_blocks = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C744602vU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
