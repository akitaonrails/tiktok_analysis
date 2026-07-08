package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C713202qQ extends Message<C713202qQ, C713302qR> {
    public static final ProtoAdapter<C713202qQ> ADAPTER = new ProtoAdapter<C713202qQ>() { // from class: X.02qP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C713202qQ decode(ProtoReader protoReader) {
            C713202qQ c713202qQ = new C713202qQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c713202qQ.show_review_tab = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c713202qQ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C713202qQ c713202qQ) {
            C713202qQ c713202qQ2 = c713202qQ;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c713202qQ2.show_review_tab) + c713202qQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C713202qQ c713202qQ) {
            C713202qQ c713202qQ2 = c713202qQ;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c713202qQ2.show_review_tab);
            protoWriter.writeBytes(c713202qQ2.unknownFields());
        }
    };
    public Boolean show_review_tab;

    public C713202qQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C713302qR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
