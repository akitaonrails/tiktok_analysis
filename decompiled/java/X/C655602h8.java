package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C655602h8 extends Message<C655602h8, C655702h9> {
    public static final ProtoAdapter<C655602h8> ADAPTER = new ProtoAdapter<C655602h8>() { // from class: X.02h7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C655602h8 decode(ProtoReader protoReader) {
            C655602h8 c655602h8 = new C655602h8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c655602h8.dynamic_patch = C655302h5.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c655602h8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C655602h8 c655602h8) {
            C655602h8 c655602h82 = c655602h8;
            return C655302h5.ADAPTER.encodedSizeWithTag(1, c655602h82.dynamic_patch) + c655602h82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C655602h8 c655602h8) {
            C655602h8 c655602h82 = c655602h8;
            C655302h5.ADAPTER.encodeWithTag(protoWriter, 1, c655602h82.dynamic_patch);
            protoWriter.writeBytes(c655602h82.unknownFields());
        }
    };
    public C655302h5 dynamic_patch;

    public C655602h8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C655702h9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
