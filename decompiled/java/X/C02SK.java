package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SK extends Message<C02SK, C02SO> {
    public static final ProtoAdapter<C02SK> ADAPTER = new ProtoAdapter<C02SK>() { // from class: X.02SJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SK decode(ProtoReader protoReader) {
            C02SK c02sk = new C02SK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02sk.tag_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02sk.tag_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SK c02sk) {
            C02SK c02sk2 = c02sk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02sk2.tag_key) + protoAdapter.encodedSizeWithTag(2, c02sk2.tag_value) + c02sk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SK c02sk) {
            C02SK c02sk2 = c02sk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02sk2.tag_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c02sk2.tag_value);
            protoWriter.writeBytes(c02sk2.unknownFields());
        }
    };
    public String tag_key;
    public String tag_value;

    public C02SK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02SO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
