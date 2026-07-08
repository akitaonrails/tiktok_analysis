package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223491C0t extends Message<C2223491C0t, C2223481C0s> {
    public static final ProtoAdapter<C2223491C0t> ADAPTER = new ProtoAdapter<C2223491C0t>() { // from class: X.1C0u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223491C0t decode(ProtoReader protoReader) {
            C2223491C0t c2223491C0t = new C2223491C0t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223491C0t.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223491C0t.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223491C0t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223491C0t c2223491C0t) {
            C2223491C0t c2223491C0t2 = c2223491C0t;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223491C0t2.key) + protoAdapter.encodedSizeWithTag(2, c2223491C0t2.value) + c2223491C0t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223491C0t c2223491C0t) {
            C2223491C0t c2223491C0t2 = c2223491C0t;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223491C0t2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223491C0t2.value);
            protoWriter.writeBytes(c2223491C0t2.unknownFields());
        }
    };
    public String key;
    public String value;

    public C2223491C0t() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223481C0s newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
