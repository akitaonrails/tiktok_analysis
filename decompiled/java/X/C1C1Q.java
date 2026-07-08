package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1Q extends Message<C1C1Q, C1C1R> {
    public static final ProtoAdapter<C1C1Q> ADAPTER = new ProtoAdapter<C1C1Q>() { // from class: X.1C1P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1Q decode(ProtoReader protoReader) {
            C1C1Q c1c1q = new C1C1Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c1q.secret_reply_response_sticker_blob = C1C1N.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c1q.secret_reply_sticker_blob = C1518210pbv.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1Q c1c1q) {
            C1C1Q c1c1q2 = c1c1q;
            return C1518210pbv.ADAPTER.encodedSizeWithTag(1, c1c1q2.secret_reply_sticker_blob) + C1C1N.ADAPTER.encodedSizeWithTag(2, c1c1q2.secret_reply_response_sticker_blob) + c1c1q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1Q c1c1q) {
            C1C1Q c1c1q2 = c1c1q;
            C1518210pbv.ADAPTER.encodeWithTag(protoWriter, 1, c1c1q2.secret_reply_sticker_blob);
            C1C1N.ADAPTER.encodeWithTag(protoWriter, 2, c1c1q2.secret_reply_response_sticker_blob);
            protoWriter.writeBytes(c1c1q2.unknownFields());
        }
    };
    public C1C1N secret_reply_response_sticker_blob;
    public C1518210pbv secret_reply_sticker_blob;

    public C1C1Q() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C1R newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
