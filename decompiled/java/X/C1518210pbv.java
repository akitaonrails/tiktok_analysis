package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518210pbv extends Message<C1518210pbv, C1518220pbw> {
    public static final ProtoAdapter<C1518210pbv> ADAPTER = new ProtoAdapter<C1518210pbv>() { // from class: X.0pbu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518210pbv decode(ProtoReader protoReader) {
            C1518210pbv c1518210pbv = new C1518210pbv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1518210pbv.prompt_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518210pbv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518210pbv c1518210pbv) {
            C1518210pbv c1518210pbv2 = c1518210pbv;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1518210pbv2.prompt_text) + c1518210pbv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518210pbv c1518210pbv) {
            C1518210pbv c1518210pbv2 = c1518210pbv;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1518210pbv2.prompt_text);
            protoWriter.writeBytes(c1518210pbv2.unknownFields());
        }
    };
    public String prompt_text;

    public C1518210pbv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1518220pbw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
