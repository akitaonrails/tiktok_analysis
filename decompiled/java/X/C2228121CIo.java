package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228121CIo extends Message<C2228121CIo, C2228131CIp> {
    public static final ProtoAdapter<C2228121CIo> ADAPTER = new ProtoAdapter<C2228121CIo>() { // from class: X.1CIn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228121CIo decode(ProtoReader protoReader) {
            C2228131CIp c2228131CIp = new C2228131CIp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228131CIp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228131CIp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228131CIp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228121CIo c2228121CIo) {
            C2228121CIo c2228121CIo2 = c2228121CIo;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228121CIo2.layout_id) + c2228121CIo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228121CIo redact(C2228121CIo c2228121CIo) {
            C2228131CIp c2228131CIpNewBuilder = c2228121CIo.newBuilder();
            c2228131CIpNewBuilder.clearUnknownFields();
            return c2228131CIpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228121CIo c2228121CIo) {
            C2228121CIo c2228121CIo2 = c2228121CIo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228121CIo2.layout_id);
            protoWriter.writeBytes(c2228121CIo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layout_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228131CIp newBuilder() {
        C2228131CIp c2228131CIp = new C2228131CIp();
        c2228131CIp.LIZLLL = this.layout_id;
        c2228131CIp.addUnknownFields(unknownFields());
        return c2228131CIp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        sb.replace(0, 2, "FuncParamsX5217c41d380b46ed{");
        sb.append('}');
        return sb.toString();
    }

    public C2228121CIo(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228121CIo)) {
            return false;
        }
        C2228121CIo c2228121CIo = (C2228121CIo) obj;
        if (unknownFields().equals(c2228121CIo.unknownFields()) && this.layout_id.equals(c2228121CIo.layout_id)) {
            return true;
        }
        return false;
    }

    public C2228121CIo(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_id = str;
    }
}
