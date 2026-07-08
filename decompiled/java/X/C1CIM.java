package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIM extends Message<C1CIM, C1CIO> {
    public static final ProtoAdapter<C1CIM> ADAPTER = new ProtoAdapter<C1CIM>() { // from class: X.1CIN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIM decode(ProtoReader protoReader) {
            C1CIO c1cio = new C1CIO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cio.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cio.LIZLLL = C1CIG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cio.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIM c1cim) {
            C1CIM c1cim2 = c1cim;
            return C1CIG.ADAPTER.encodedSizeWithTag(1, c1cim2.player) + c1cim2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIM redact(C1CIM c1cim) {
            C1CIO c1cioNewBuilder = c1cim.newBuilder();
            c1cioNewBuilder.LIZLLL = C1CIG.ADAPTER.redact(c1cioNewBuilder.LIZLLL);
            c1cioNewBuilder.clearUnknownFields();
            return c1cioNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIM c1cim) {
            C1CIM c1cim2 = c1cim;
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 1, c1cim2.player);
            protoWriter.writeBytes(c1cim2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CIG player;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.player.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIO newBuilder() {
        C1CIO c1cio = new C1CIO();
        c1cio.LIZLLL = this.player;
        c1cio.addUnknownFields(unknownFields());
        return c1cio;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", player=");
        sb.append(this.player);
        sb.replace(0, 2, "FuncParamsX74beb5aa1fb6efa0{");
        sb.append('}');
        return sb.toString();
    }

    public C1CIM(C1CIG c1cig) {
        this(c1cig, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIM)) {
            return false;
        }
        C1CIM c1cim = (C1CIM) obj;
        if (unknownFields().equals(c1cim.unknownFields()) && this.player.equals(c1cim.player)) {
            return true;
        }
        return false;
    }

    public C1CIM(C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.player = c1cig;
    }
}
