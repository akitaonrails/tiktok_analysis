package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSG extends Message<C1CSG, C1CSI> {
    public static final ProtoAdapter<C1CSG> ADAPTER = new ProtoAdapter<C1CSG>() { // from class: X.1CSH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSG decode(ProtoReader protoReader) {
            C1CSI c1csi = new C1CSI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1csi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1csi.LJ = C2229671COn.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1csi.LIZLLL = C1CSJ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSG c1csg) {
            C1CSG c1csg2 = c1csg;
            return C1CSJ.ADAPTER.encodedSizeWithTag(1, c1csg2.origin) + C2229671COn.ADAPTER.encodedSizeWithTag(2, c1csg2.size) + c1csg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSG redact(C1CSG c1csg) {
            C1CSI c1csiNewBuilder = c1csg.newBuilder();
            c1csiNewBuilder.LIZLLL = C1CSJ.ADAPTER.redact(c1csiNewBuilder.LIZLLL);
            c1csiNewBuilder.LJ = C2229671COn.ADAPTER.redact(c1csiNewBuilder.LJ);
            c1csiNewBuilder.clearUnknownFields();
            return c1csiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSG c1csg) {
            C1CSG c1csg2 = c1csg;
            C1CSJ.ADAPTER.encodeWithTag(protoWriter, 1, c1csg2.origin);
            C2229671COn.ADAPTER.encodeWithTag(protoWriter, 2, c1csg2.size);
            protoWriter.writeBytes(c1csg2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPoint#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CSJ origin;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSize#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2229671COn size;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.origin.hashCode()) * 37) + this.size.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CSI newBuilder() {
        C1CSI c1csi = new C1CSI();
        c1csi.LIZLLL = this.origin;
        c1csi.LJ = this.size;
        c1csi.addUnknownFields(unknownFields());
        return c1csi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", size=");
        sb.append(this.size);
        sb.replace(0, 2, "LinkMicRect{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSG)) {
            return false;
        }
        C1CSG c1csg = (C1CSG) obj;
        if (unknownFields().equals(c1csg.unknownFields()) && this.origin.equals(c1csg.origin) && this.size.equals(c1csg.size)) {
            return true;
        }
        return false;
    }

    public C1CSG(C1CSJ c1csj, C2229671COn c2229671COn) {
        this(c1csj, c2229671COn, ByteString.EMPTY);
    }

    public C1CSG(C1CSJ c1csj, C2229671COn c2229671COn, ByteString byteString) {
        super(ADAPTER, byteString);
        this.origin = c1csj;
        this.size = c2229671COn;
    }
}
