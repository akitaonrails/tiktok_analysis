package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDY extends Message<C1CDY, C2226681CDa> {
    public static final ProtoAdapter<C1CDY> ADAPTER = new ProtoAdapter<C1CDY>() { // from class: X.1CDZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDY decode(ProtoReader protoReader) {
            C2226681CDa c2226681CDa = new C2226681CDa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226681CDa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226681CDa.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226681CDa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDY c1cdy) {
            C1CDY c1cdy2 = c1cdy;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1cdy2.enable) + c1cdy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDY redact(C1CDY c1cdy) {
            C2226681CDa c2226681CDaNewBuilder = c1cdy.newBuilder();
            c2226681CDaNewBuilder.clearUnknownFields();
            return c2226681CDaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDY c1cdy) {
            C1CDY c1cdy2 = c1cdy;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1cdy2.enable);
            protoWriter.writeBytes(c1cdy2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ENABLE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean enable;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.enable.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226681CDa newBuilder() {
        C2226681CDa c2226681CDa = new C2226681CDa();
        c2226681CDa.LIZLLL = this.enable;
        c2226681CDa.addUnknownFields(unknownFields());
        return c2226681CDa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enable=");
        sb.append(this.enable);
        sb.replace(0, 2, "FuncParamsX6688c1a3d21664dc{");
        sb.append('}');
        return sb.toString();
    }

    public C1CDY(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDY)) {
            return false;
        }
        C1CDY c1cdy = (C1CDY) obj;
        if (unknownFields().equals(c1cdy.unknownFields()) && this.enable.equals(c1cdy.enable)) {
            return true;
        }
        return false;
    }

    public C1CDY(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
    }
}
