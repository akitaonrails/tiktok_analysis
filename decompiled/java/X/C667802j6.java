package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02j6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C667802j6 extends Message<C667802j6, C667902j7> {
    public static final ProtoAdapter<C667802j6> ADAPTER = new ProtoAdapter<C667802j6>() { // from class: X.02j5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C667802j6 decode(ProtoReader protoReader) {
            C667802j6 c667802j6 = new C667802j6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c667802j6.share_post_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c667802j6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C667802j6 c667802j6) {
            C667802j6 c667802j62 = c667802j6;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c667802j62.share_post_type) + c667802j62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C667802j6 c667802j6) {
            C667802j6 c667802j62 = c667802j6;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c667802j62.share_post_type);
            protoWriter.writeBytes(c667802j62.unknownFields());
        }
    };
    public Integer share_post_type;

    public C667802j6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C667902j7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
