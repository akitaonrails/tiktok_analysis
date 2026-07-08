package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C623502bx extends Message<C623502bx, C623602by> {
    public static final ProtoAdapter<C623502bx> ADAPTER = new ProtoAdapter<C623502bx>() { // from class: X.02bw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C623502bx decode(ProtoReader protoReader) {
            C623502bx c623502bx = new C623502bx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c623502bx.promotion_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c623502bx.promotion_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c623502bx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C623502bx c623502bx) {
            C623502bx c623502bx2 = c623502bx;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c623502bx2.promotion_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c623502bx2.promotion_type) + c623502bx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C623502bx c623502bx) {
            C623502bx c623502bx2 = c623502bx;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c623502bx2.promotion_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c623502bx2.promotion_type);
            protoWriter.writeBytes(c623502bx2.unknownFields());
        }
    };
    public String promotion_text;
    public Integer promotion_type;

    public C623502bx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C623602by newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
