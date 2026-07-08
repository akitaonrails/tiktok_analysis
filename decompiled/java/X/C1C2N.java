package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2N extends Message<C1C2N, C1C2O> {
    public static final ProtoAdapter<C1C2N> ADAPTER = new ProtoAdapter<C1C2N>() { // from class: X.1C2M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2N decode(ProtoReader protoReader) {
            C1C2N c1c2n = new C1C2N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1c2n.language = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c2n.activation_time = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c2n.installation_time = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c2n.app_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2N c1c2n) {
            C1C2N c1c2n2 = c1c2n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c2n2.app_id) + protoAdapter.encodedSizeWithTag(2, c1c2n2.installation_time) + protoAdapter.encodedSizeWithTag(3, c1c2n2.activation_time) + protoAdapter.encodedSizeWithTag(4, c1c2n2.language) + c1c2n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2N c1c2n) {
            C1C2N c1c2n2 = c1c2n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c2n2.app_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c2n2.installation_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c2n2.activation_time);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c2n2.language);
            protoWriter.writeBytes(c1c2n2.unknownFields());
        }
    };
    public String activation_time;
    public String app_id;
    public String installation_time;
    public String language;

    @Override // com.squareup.wire.Message
    public C1C2O newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1C2N(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public C1C2N(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.installation_time = str2;
        this.activation_time = str3;
        this.language = str4;
    }
}
