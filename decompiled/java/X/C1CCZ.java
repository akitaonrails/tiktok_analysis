package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCZ extends Message<C1CCZ, C2226431CCb> {
    public static final ProtoAdapter<C1CCZ> ADAPTER = new ProtoAdapter<C1CCZ>() { // from class: X.1CCa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCZ decode(ProtoReader protoReader) {
            C2226431CCb c2226431CCb = new C2226431CCb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226431CCb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226431CCb.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226431CCb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCZ c1ccz) {
            C1CCZ c1ccz2 = c1ccz;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1ccz2.related_user) + c1ccz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCZ redact(C1CCZ c1ccz) {
            C2226431CCb c2226431CCbNewBuilder = c1ccz.newBuilder();
            c2226431CCbNewBuilder.clearUnknownFields();
            return c2226431CCbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCZ c1ccz) {
            C1CCZ c1ccz2 = c1ccz;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1ccz2.related_user);
            protoWriter.writeBytes(c1ccz2.unknownFields());
        }
    };
    public static final Long DEFAULT_RELATED_USER = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long related_user;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.related_user.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226431CCb newBuilder() {
        C2226431CCb c2226431CCb = new C2226431CCb();
        c2226431CCb.LIZLLL = this.related_user;
        c2226431CCb.addUnknownFields(unknownFields());
        return c2226431CCb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", related_user=");
        sb.append(this.related_user);
        sb.replace(0, 2, "FuncParamsX1d1a45f69e51d6e6{");
        sb.append('}');
        return sb.toString();
    }

    public C1CCZ(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CCZ)) {
            return false;
        }
        C1CCZ c1ccz = (C1CCZ) obj;
        if (unknownFields().equals(c1ccz.unknownFields()) && this.related_user.equals(c1ccz.related_user)) {
            return true;
        }
        return false;
    }

    public C1CCZ(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.related_user = l;
    }
}
