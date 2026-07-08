package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C607102Yj extends Message<C607102Yj, C607502Yn> {
    public static final ProtoAdapter<C607102Yj> ADAPTER = new ProtoAdapter<C607102Yj>() { // from class: X.02Yi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C607102Yj decode(ProtoReader protoReader) {
            C607102Yj c607102Yj = new C607102Yj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c607102Yj.body = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c607102Yj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C607102Yj c607102Yj) {
            C607102Yj c607102Yj2 = c607102Yj;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c607102Yj2.body) + c607102Yj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C607102Yj c607102Yj) {
            C607102Yj c607102Yj2 = c607102Yj;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c607102Yj2.body);
            protoWriter.writeBytes(c607102Yj2.unknownFields());
        }
    };
    public String body;

    public C607102Yj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C607502Yn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
