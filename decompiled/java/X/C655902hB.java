package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C655902hB extends Message<C655902hB, C656002hC> {
    public static final ProtoAdapter<C655902hB> ADAPTER = new ProtoAdapter<C655902hB>() { // from class: X.02hA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C655902hB decode(ProtoReader protoReader) {
            C655902hB c655902hB = new C655902hB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c655902hB.file_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c655902hB.material_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c655902hB;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C655902hB c655902hB) {
            C655902hB c655902hB2 = c655902hB;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c655902hB2.material_url) + protoAdapter.encodedSizeWithTag(2, c655902hB2.file_type) + c655902hB2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C655902hB c655902hB) {
            C655902hB c655902hB2 = c655902hB;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c655902hB2.material_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c655902hB2.file_type);
            protoWriter.writeBytes(c655902hB2.unknownFields());
        }
    };
    public String file_type;
    public String material_url;

    public C655902hB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C656002hC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
