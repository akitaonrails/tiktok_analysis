package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C640502eh extends Message<C640502eh, C640602ei> {
    public static final ProtoAdapter<C640502eh> ADAPTER = new ProtoAdapter<C640502eh>() { // from class: X.02eg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C640502eh decode(ProtoReader protoReader) {
            C640502eh c640502eh = new C640502eh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 9) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c640502eh.error_reason = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c640502eh.error_code = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c640502eh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C640502eh c640502eh) {
            C640502eh c640502eh2 = c640502eh;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c640502eh2.error_code) + ProtoAdapter.STRING.encodedSizeWithTag(9, c640502eh2.error_reason) + c640502eh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C640502eh c640502eh) {
        }
    };
    public Integer error_code;
    public String error_reason;

    public C640502eh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C640602ei newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
