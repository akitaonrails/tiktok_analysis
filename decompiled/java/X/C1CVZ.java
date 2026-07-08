package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVZ extends Message<C1CVZ, C2231371CVb> {
    public static final ProtoAdapter<C1CVZ> ADAPTER = new ProtoAdapter<C1CVZ>() { // from class: X.1CVa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVZ decode(ProtoReader protoReader) {
            C2231371CVb c2231371CVb = new C2231371CVb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2231371CVb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2231371CVb.LIZLLL = C2231581CVw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231371CVb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVZ c1cvz) {
            C1CVZ c1cvz2 = c1cvz;
            return C2231581CVw.ADAPTER.encodedSizeWithTag(1, c1cvz2.core_properties) + c1cvz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVZ redact(C1CVZ c1cvz) {
            C2231371CVb c2231371CVbNewBuilder = c1cvz.newBuilder();
            c2231371CVbNewBuilder.LIZLLL = C2231581CVw.ADAPTER.redact(c2231371CVbNewBuilder.LIZLLL);
            c2231371CVbNewBuilder.clearUnknownFields();
            return c2231371CVbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVZ c1cvz) {
            C1CVZ c1cvz2 = c1cvz;
            C2231581CVw.ADAPTER.encodeWithTag(protoWriter, 1, c1cvz2.core_properties);
            protoWriter.writeBytes(c1cvz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCoreProperties#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2231581CVw core_properties;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.core_properties.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231371CVb newBuilder() {
        C2231371CVb c2231371CVb = new C2231371CVb();
        c2231371CVb.LIZLLL = this.core_properties;
        c2231371CVb.addUnknownFields(unknownFields());
        return c2231371CVb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", core_properties=");
        sb.append(this.core_properties);
        sb.replace(0, 2, "FuncParamsXf77d7dbdb907db6d{");
        sb.append('}');
        return sb.toString();
    }

    public C1CVZ(C2231581CVw c2231581CVw) {
        this(c2231581CVw, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVZ)) {
            return false;
        }
        C1CVZ c1cvz = (C1CVZ) obj;
        if (unknownFields().equals(c1cvz.unknownFields()) && this.core_properties.equals(c1cvz.core_properties)) {
            return true;
        }
        return false;
    }

    public C1CVZ(C2231581CVw c2231581CVw, ByteString byteString) {
        super(ADAPTER, byteString);
        this.core_properties = c2231581CVw;
    }
}
