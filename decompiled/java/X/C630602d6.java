package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C630602d6 extends Message<C630602d6, C630702d7> {
    public static final ProtoAdapter<C630602d6> ADAPTER = new ProtoAdapter<C630602d6>() { // from class: X.02d5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C630602d6 decode(ProtoReader protoReader) {
            C630602d6 c630602d6 = new C630602d6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c630602d6.quick_mention_candidate = C5189020l.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c630602d6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C630602d6 c630602d6) {
            C630602d6 c630602d62 = c630602d6;
            return C5189020l.ADAPTER.encodedSizeWithTag(1, c630602d62.quick_mention_candidate) + c630602d62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C630602d6 c630602d6) {
            C630602d6 c630602d62 = c630602d6;
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 1, c630602d62.quick_mention_candidate);
            protoWriter.writeBytes(c630602d62.unknownFields());
        }
    };
    public C5189020l quick_mention_candidate;

    public C630602d6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C630702d7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
