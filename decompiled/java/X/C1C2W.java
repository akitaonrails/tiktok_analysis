package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2W extends Message<C1C2W, C1C2V> {
    public static final ProtoAdapter<C1C2W> ADAPTER = new ProtoAdapter<C1C2W>() { // from class: X.1C2X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2W decode(ProtoReader protoReader) {
            C1C2W c1c2w = new C1C2W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c2w.declaration_payload = C1C2Z.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c2w.declaration_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2W c1c2w) {
            C1C2W c1c2w2 = c1c2w;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1c2w2.declaration_type) + C1C2Z.ADAPTER.encodedSizeWithTag(2, c1c2w2.declaration_payload) + c1c2w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2W c1c2w) {
            C1C2W c1c2w2 = c1c2w;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1c2w2.declaration_type);
            C1C2Z.ADAPTER.encodeWithTag(protoWriter, 2, c1c2w2.declaration_payload);
            protoWriter.writeBytes(c1c2w2.unknownFields());
        }
    };
    public C1C2Z declaration_payload;
    public Integer declaration_type;

    public C1C2W() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C2V newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
