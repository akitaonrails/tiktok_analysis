package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223431C0n extends Message<C2223431C0n, C2223441C0o> {
    public static final ProtoAdapter<C2223431C0n> ADAPTER = new ProtoAdapter<C2223431C0n>() { // from class: X.1C0m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223431C0n decode(ProtoReader protoReader) {
            C2223431C0n c2223431C0n = new C2223431C0n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223431C0n.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223431C0n.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223431C0n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223431C0n c2223431C0n) {
            C2223431C0n c2223431C0n2 = c2223431C0n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223431C0n2.key) + protoAdapter.encodedSizeWithTag(2, c2223431C0n2.value) + c2223431C0n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223431C0n c2223431C0n) {
            C2223431C0n c2223431C0n2 = c2223431C0n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223431C0n2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223431C0n2.value);
            protoWriter.writeBytes(c2223431C0n2.unknownFields());
        }
    };
    public String key;
    public String value;

    public C2223431C0n() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223441C0o newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
