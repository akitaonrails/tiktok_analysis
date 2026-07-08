package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C674002k6 extends Message<C674002k6, C674102k7> {
    public static final ProtoAdapter<C674002k6> ADAPTER = new ProtoAdapter<C674002k6>() { // from class: X.02k5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C674002k6 decode(ProtoReader protoReader) {
            C674002k6 c674002k6 = new C674002k6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c674002k6.profile = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c674002k6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C674002k6 c674002k6) {
            C674002k6 c674002k62 = c674002k6;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c674002k62.profile) + c674002k62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C674002k6 c674002k6) {
            C674002k6 c674002k62 = c674002k6;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c674002k62.profile);
            protoWriter.writeBytes(c674002k62.unknownFields());
        }
    };
    public String profile;

    public C674002k6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C674102k7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
