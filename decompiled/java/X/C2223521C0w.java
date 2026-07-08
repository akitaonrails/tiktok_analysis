package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223521C0w extends Message<C2223521C0w, C2223531C0x> {
    public static final ProtoAdapter<C2223521C0w> ADAPTER = new ProtoAdapter<C2223521C0w>() { // from class: X.1C0v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223521C0w decode(ProtoReader protoReader) {
            C2223521C0w c2223521C0w = new C2223521C0w();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223521C0w.param_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223521C0w.param_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223521C0w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223521C0w c2223521C0w) {
            C2223521C0w c2223521C0w2 = c2223521C0w;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223521C0w2.param_key) + protoAdapter.encodedSizeWithTag(2, c2223521C0w2.param_value) + c2223521C0w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223521C0w c2223521C0w) {
            C2223521C0w c2223521C0w2 = c2223521C0w;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223521C0w2.param_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223521C0w2.param_value);
            protoWriter.writeBytes(c2223521C0w2.unknownFields());
        }
    };
    public String param_key;
    public String param_value;

    public C2223521C0w() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223531C0x newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
