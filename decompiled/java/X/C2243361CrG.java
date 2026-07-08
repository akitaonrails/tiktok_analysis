package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243361CrG extends Message<C2243361CrG, C2243451CrP> {
    public static final ProtoAdapter<C2243361CrG> ADAPTER = new ProtoAdapter<C2243361CrG>() { // from class: X.1CrI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243361CrG decode(ProtoReader protoReader) {
            C2243451CrP c2243451CrP = new C2243451CrP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243451CrP.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2243451CrP.LJ = C2244091CsR.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243451CrP.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243451CrP.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243361CrG c2243361CrG) {
            C2243361CrG c2243361CrG2 = c2243361CrG;
            return C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2243361CrG2.title) + C2244091CsR.ADAPTER.encodedSizeWithTag(2, c2243361CrG2.image) + c2243361CrG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243361CrG redact(C2243361CrG c2243361CrG) {
            C2243451CrP c2243451CrPNewBuilder = c2243361CrG.newBuilder();
            C2243521CrW c2243521CrW = c2243451CrPNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243451CrPNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2244091CsR c2244091CsR = c2243451CrPNewBuilder.LJ;
            if (c2244091CsR != null) {
                c2243451CrPNewBuilder.LJ = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2243451CrPNewBuilder.clearUnknownFields();
            return c2243451CrPNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243361CrG c2243361CrG) {
            C2243361CrG c2243361CrG2 = c2243361CrG;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2243361CrG2.title);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 2, c2243361CrG2.image);
            protoWriter.writeBytes(c2243361CrG2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 2)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW title;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.title;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode3 = iHashCode2 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2243451CrP newBuilder() {
        C2243451CrP c2243451CrP = new C2243451CrP();
        c2243451CrP.LIZLLL = this.title;
        c2243451CrP.LJ = this.image;
        c2243451CrP.addUnknownFields(unknownFields());
        return c2243451CrP;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        sb.replace(0, 2, "InfoCardTitle{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243361CrG)) {
            return false;
        }
        C2243361CrG c2243361CrG = (C2243361CrG) obj;
        if (unknownFields().equals(c2243361CrG.unknownFields()) && C1516540pZE.LJ(this.title, c2243361CrG.title) && C1516540pZE.LJ(this.image, c2243361CrG.image)) {
            return true;
        }
        return false;
    }

    public C2243361CrG(C2243521CrW c2243521CrW, C2244091CsR c2244091CsR) {
        this(c2243521CrW, c2244091CsR, ByteString.EMPTY);
    }

    public C2243361CrG(C2243521CrW c2243521CrW, C2244091CsR c2244091CsR, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = c2243521CrW;
        this.image = c2244091CsR;
    }
}
