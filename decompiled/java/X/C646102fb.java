package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C646102fb extends Message<C646102fb, C646302fd> {
    public static final ProtoAdapter<C646102fb> ADAPTER = new ProtoAdapter<C646102fb>() { // from class: X.02fa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C646102fb decode(ProtoReader protoReader) {
            C646102fb c646102fb = new C646102fb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c646102fb.blur_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c646102fb.forced_visibility = C645902fZ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c646102fb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C646102fb c646102fb) {
            C646102fb c646102fb2 = c646102fb;
            return C645902fZ.ADAPTER.encodedSizeWithTag(1, c646102fb2.forced_visibility) + ProtoAdapter.INT32.encodedSizeWithTag(2, c646102fb2.blur_type) + c646102fb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C646102fb c646102fb) {
            C646102fb c646102fb2 = c646102fb;
            C645902fZ.ADAPTER.encodeWithTag(protoWriter, 1, c646102fb2.forced_visibility);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c646102fb2.blur_type);
            protoWriter.writeBytes(c646102fb2.unknownFields());
        }
    };
    public Integer blur_type;
    public C645902fZ forced_visibility;

    public C646102fb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C646302fd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
