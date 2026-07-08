package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLP extends Message<C1CLP, C1CLR> {
    public static final ProtoAdapter<C1CLP> ADAPTER = new ProtoAdapter<C1CLP>() { // from class: X.1CLQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLP decode(ProtoReader protoReader) {
            C1CLR c1clr = new C1CLR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1clr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1clr.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1clr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLP c1clp) {
            C1CLP c1clp2 = c1clp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1clp2.business_id) + protoAdapter.encodedSizeWithTag(2, c1clp2.config_id) + c1clp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLP redact(C1CLP c1clp) {
            C1CLR c1clrNewBuilder = c1clp.newBuilder();
            c1clrNewBuilder.clearUnknownFields();
            return c1clrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLP c1clp) {
            C1CLP c1clp2 = c1clp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1clp2.business_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1clp2.config_id);
            protoWriter.writeBytes(c1clp2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String config_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.business_id.hashCode()) * 37) + this.config_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLR newBuilder() {
        C1CLR c1clr = new C1CLR();
        c1clr.LIZLLL = this.business_id;
        c1clr.LJ = this.config_id;
        c1clr.addUnknownFields(unknownFields());
        return c1clr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", business_id=");
        sb.append(this.business_id);
        sb.append(", config_id=");
        sb.append(this.config_id);
        sb.replace(0, 2, "LinkMicMediaConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLP)) {
            return false;
        }
        C1CLP c1clp = (C1CLP) obj;
        if (unknownFields().equals(c1clp.unknownFields()) && this.business_id.equals(c1clp.business_id) && this.config_id.equals(c1clp.config_id)) {
            return true;
        }
        return false;
    }

    public C1CLP(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1CLP(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_id = str;
        this.config_id = str2;
    }
}
