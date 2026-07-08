package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2E extends Message<C1C2E, C1C2F> {
    public static final ProtoAdapter<C1C2E> ADAPTER = new ProtoAdapter<C1C2E>() { // from class: X.1C2D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2E decode(ProtoReader protoReader) {
            C1C2E c1c2e = new C1C2E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c2e.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c2e.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2E c1c2e) {
            C1C2E c1c2e2 = c1c2e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c2e2.text) + protoAdapter.encodedSizeWithTag(2, c1c2e2.schema) + c1c2e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C2E c1c2e) {
        }
    };
    public String schema;
    public String text;

    public C1C2E() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C2F newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
