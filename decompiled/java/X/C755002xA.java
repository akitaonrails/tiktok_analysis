package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755002xA extends Message<C755002xA, C755102xB> {
    public static final ProtoAdapter<C755002xA> ADAPTER = new ProtoAdapter<C755002xA>() { // from class: X.02x9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C755002xA decode(ProtoReader protoReader) {
            C755002xA c755002xA = new C755002xA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c755002xA.et_encoding = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c755002xA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C755002xA c755002xA) {
            C755002xA c755002xA2 = c755002xA;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c755002xA2.et_encoding) + c755002xA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C755002xA c755002xA) {
            C755002xA c755002xA2 = c755002xA;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c755002xA2.et_encoding);
            protoWriter.writeBytes(c755002xA2.unknownFields());
        }
    };
    public String et_encoding;

    @Override // com.squareup.wire.Message
    public C755102xB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C755002xA(String str) {
        this(str, ByteString.EMPTY);
    }

    public C755002xA(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.et_encoding = str;
    }
}
