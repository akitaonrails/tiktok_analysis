package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4S extends Message<C1C4S, C1C4T> {
    public static final ProtoAdapter<C1C4S> ADAPTER;
    public static final long serialVersionUID = 0;

    static {
        ProtoAdapter<C1C4S> protoAdapter = new ProtoAdapter<C1C4S>() { // from class: X.1C4R
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final C1C4S decode(ProtoReader protoReader) {
                C1C4T c1c4t = new C1C4T();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c4t.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1c4t.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(C1C4S c1c4s) {
                return c1c4s.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, C1C4S c1c4s) {
                protoWriter.writeBytes(c1c4s.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        C2281531ERz.LIZ.put(2059, protoAdapter);
    }

    public C1C4S() {
        this(ByteString.EMPTY);
    }

    public static void registerAdapter() {
        C2281531ERz.LIZ.put(2059, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    public C1C4T newBuilder() {
        C1C4T c1c4t = new C1C4T();
        c1c4t.addUnknownFields(unknownFields());
        return c1c4t;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "BatchAckMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C4S(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
