package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEX extends Message<C1CEX, C1CEY> {
    public static final ProtoAdapter<C1CEX> ADAPTER = new ProtoAdapter<C1CEX>() { // from class: X.1CEW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEX decode(ProtoReader protoReader) {
            C1CEX c1cex = new C1CEX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1cex.unread = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1cex.story = C5186020i.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cex;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEX c1cex) {
            C1CEX c1cex2 = c1cex;
            return C5186020i.ADAPTER.encodedSizeWithTag(1, c1cex2.story) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1cex2.unread) + c1cex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CEX c1cex) {
            C1CEX c1cex2 = c1cex;
            C5186020i.ADAPTER.encodeWithTag(protoWriter, 1, c1cex2.story);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c1cex2.unread);
            protoWriter.writeBytes(c1cex2.unknownFields());
        }
    };
    public C5186020i story;
    public Boolean unread;

    public C1CEX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CEY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
