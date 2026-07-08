package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228681CKs extends Message<C2228681CKs, C2228701CKu> {
    public static final ProtoAdapter<C2228681CKs> ADAPTER = new ProtoAdapter<C2228681CKs>() { // from class: X.1CKt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228681CKs decode(ProtoReader protoReader) {
            C2228701CKu c2228701CKu = new C2228701CKu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228701CKu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228701CKu.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2228701CKu.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228701CKu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228681CKs c2228681CKs) {
            C2228681CKs c2228681CKs2 = c2228681CKs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2228681CKs2.link_mic_id) + protoAdapter.encodedSizeWithTag(2, c2228681CKs2.message) + c2228681CKs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228681CKs redact(C2228681CKs c2228681CKs) {
            C2228701CKu c2228701CKuNewBuilder = c2228681CKs.newBuilder();
            c2228701CKuNewBuilder.clearUnknownFields();
            return c2228701CKuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228681CKs c2228681CKs) {
            C2228681CKs c2228681CKs2 = c2228681CKs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228681CKs2.link_mic_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228681CKs2.message);
            protoWriter.writeBytes(c2228681CKs2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228701CKu newBuilder() {
        C2228701CKu c2228701CKu = new C2228701CKu();
        c2228701CKu.LIZLLL = this.link_mic_id;
        c2228701CKu.LJ = this.message;
        c2228701CKu.addUnknownFields(unknownFields());
        return c2228701CKu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", message=");
        sb.append(this.message);
        sb.replace(0, 2, "FuncParamsXba275aea2f462145{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228681CKs)) {
            return false;
        }
        C2228681CKs c2228681CKs = (C2228681CKs) obj;
        if (unknownFields().equals(c2228681CKs.unknownFields()) && this.link_mic_id.equals(c2228681CKs.link_mic_id) && this.message.equals(c2228681CKs.message)) {
            return true;
        }
        return false;
    }

    public C2228681CKs(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2228681CKs(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.message = str2;
    }
}
