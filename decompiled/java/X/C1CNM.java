package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNM extends Message<C1CNM, C1CNN> {
    public static final ProtoAdapter<C1CNM> ADAPTER = new ProtoAdapter<C1CNM>() { // from class: X.1CNL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNM decode(ProtoReader protoReader) {
            C1CNN c1cnn = new C1CNN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cnn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cnn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNM c1cnm) {
            C1CNM c1cnm2 = c1cnm;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cnm2.last_server_base_component_config_hash) + c1cnm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNM c1cnm) {
            C1CNM c1cnm2 = c1cnm;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cnm2.last_server_base_component_config_hash);
            protoWriter.writeBytes(c1cnm2.unknownFields());
        }
    };
    public String last_server_base_component_config_hash;

    @Override // com.squareup.wire.Message
    public C1CNN newBuilder() {
        return null;
    }

    public C1CNM(String str) {
        this(str, ByteString.EMPTY);
    }

    public C1CNM(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.last_server_base_component_config_hash = str;
    }
}
