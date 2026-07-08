package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560502Gl extends Message<C560502Gl, C574702Lx> {
    public static final ProtoAdapter<C560502Gl> ADAPTER = new ProtoAdapter<C560502Gl>() { // from class: X.029I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560502Gl decode(ProtoReader protoReader) {
            C560502Gl c560502Gl = new C560502Gl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560502Gl.score = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c560502Gl.emoji = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560502Gl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560502Gl c560502Gl) {
            C560502Gl c560502Gl2 = c560502Gl;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560502Gl2.emoji) + ProtoAdapter.INT32.encodedSizeWithTag(2, c560502Gl2.score) + c560502Gl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C560502Gl c560502Gl) {
            C560502Gl c560502Gl2 = c560502Gl;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c560502Gl2.emoji);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c560502Gl2.score);
            protoWriter.writeBytes(c560502Gl2.unknownFields());
        }
    };
    public String emoji;
    public Integer score;

    public C560502Gl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574702Lx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
