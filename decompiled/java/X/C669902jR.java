package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C669902jR extends Message<C669902jR, C670002jS> {
    public static final ProtoAdapter<C669902jR> ADAPTER = new ProtoAdapter<C669902jR>() { // from class: X.02jQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C669902jR decode(ProtoReader protoReader) {
            C669902jR c669902jR = new C669902jR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c669902jR.enable_comment = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c669902jR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C669902jR c669902jR) {
            C669902jR c669902jR2 = c669902jR;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c669902jR2.enable_comment) + c669902jR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C669902jR c669902jR) {
            C669902jR c669902jR2 = c669902jR;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c669902jR2.enable_comment);
            protoWriter.writeBytes(c669902jR2.unknownFields());
        }
    };
    public Boolean enable_comment;

    public C669902jR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C670002jS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
