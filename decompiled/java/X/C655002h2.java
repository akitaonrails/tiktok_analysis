package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C655002h2 extends Message<C655002h2, C655102h3> {
    public static final ProtoAdapter<C655002h2> ADAPTER = new ProtoAdapter<C655002h2>() { // from class: X.02h1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C655002h2 decode(ProtoReader protoReader) {
            C655002h2 c655002h2 = new C655002h2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c655002h2.ttec_content_tag = C654702gz.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c655002h2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C655002h2 c655002h2) {
            C655002h2 c655002h22 = c655002h2;
            return C654702gz.ADAPTER.encodedSizeWithTag(1, c655002h22.ttec_content_tag) + c655002h22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C655002h2 c655002h2) {
            C655002h2 c655002h22 = c655002h2;
            C654702gz.ADAPTER.encodeWithTag(protoWriter, 1, c655002h22.ttec_content_tag);
            protoWriter.writeBytes(c655002h22.unknownFields());
        }
    };
    public C654702gz ttec_content_tag;

    public C655002h2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C655102h3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
