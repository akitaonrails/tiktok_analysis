package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02k3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C673702k3 extends Message<C673702k3, C673802k4> {
    public static final ProtoAdapter<C673702k3> ADAPTER = new ProtoAdapter<C673702k3>() { // from class: X.02k2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C673702k3 decode(ProtoReader protoReader) {
            C673702k3 c673702k3 = new C673702k3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c673702k3.auxiliary_model_content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c673702k3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C673702k3 c673702k3) {
            C673702k3 c673702k32 = c673702k3;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c673702k32.auxiliary_model_content) + c673702k32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C673702k3 c673702k3) {
            C673702k3 c673702k32 = c673702k3;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c673702k32.auxiliary_model_content);
            protoWriter.writeBytes(c673702k32.unknownFields());
        }
    };
    public String auxiliary_model_content;

    public C673702k3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C673802k4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
