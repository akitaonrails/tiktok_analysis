package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIP extends Message<C1CIP, C1CIR> {
    public static final ProtoAdapter<C1CIP> ADAPTER = new ProtoAdapter<C1CIP>() { // from class: X.1CIQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIP decode(ProtoReader protoReader) {
            C1CIR c1cir = new C1CIR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cir.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cir.LIZLLL = C1CIG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cir.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIP c1cip) {
            C1CIP c1cip2 = c1cip;
            return C1CIG.ADAPTER.encodedSizeWithTag(1, c1cip2.canvas) + c1cip2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIP redact(C1CIP c1cip) {
            C1CIR c1cirNewBuilder = c1cip.newBuilder();
            c1cirNewBuilder.LIZLLL = C1CIG.ADAPTER.redact(c1cirNewBuilder.LIZLLL);
            c1cirNewBuilder.clearUnknownFields();
            return c1cirNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIP c1cip) {
            C1CIP c1cip2 = c1cip;
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 1, c1cip2.canvas);
            protoWriter.writeBytes(c1cip2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CIG canvas;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.canvas.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIR newBuilder() {
        C1CIR c1cir = new C1CIR();
        c1cir.LIZLLL = this.canvas;
        c1cir.addUnknownFields(unknownFields());
        return c1cir;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", canvas=");
        sb.append(this.canvas);
        sb.replace(0, 2, "FuncParamsX527a6227052bd8de{");
        sb.append('}');
        return sb.toString();
    }

    public C1CIP(C1CIG c1cig) {
        this(c1cig, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIP)) {
            return false;
        }
        C1CIP c1cip = (C1CIP) obj;
        if (unknownFields().equals(c1cip.unknownFields()) && this.canvas.equals(c1cip.canvas)) {
            return true;
        }
        return false;
    }

    public C1CIP(C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.canvas = c1cig;
    }
}
