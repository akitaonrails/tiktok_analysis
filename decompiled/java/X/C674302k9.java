package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C674302k9 extends Message<C674302k9, C674402kA> {
    public static final ProtoAdapter<C674302k9> ADAPTER = new ProtoAdapter<C674302k9>() { // from class: X.02k8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C674302k9 decode(ProtoReader protoReader) {
            C674302k9 c674302k9 = new C674302k9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c674302k9.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c674302k9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C674302k9 c674302k9) {
            C674302k9 c674302k92 = c674302k9;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c674302k92.text) + c674302k92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C674302k9 c674302k9) {
            C674302k9 c674302k92 = c674302k9;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c674302k92.text);
            protoWriter.writeBytes(c674302k92.unknownFields());
        }
    };
    public String text;

    public C674302k9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C674402kA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
