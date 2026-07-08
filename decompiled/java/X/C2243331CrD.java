package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243331CrD extends Message<C2243331CrD, C2243401CrK> {
    public static final ProtoAdapter<C2243331CrD> ADAPTER = new ProtoAdapter<C2243331CrD>() { // from class: X.1CrH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243331CrD decode(ProtoReader protoReader) {
            C2243401CrK c2243401CrK = new C2243401CrK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243401CrK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2243401CrK.LJ.add(C2243521CrW.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2243401CrK.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243401CrK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243331CrD c2243331CrD) {
            C2243331CrD c2243331CrD2 = c2243331CrD;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2243331CrD2.description) + protoAdapter.asRepeated().encodedSizeWithTag(2, c2243331CrD2.contents) + c2243331CrD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243331CrD redact(C2243331CrD c2243331CrD) {
            C2243401CrK c2243401CrKNewBuilder = c2243331CrD.newBuilder();
            C2243521CrW c2243521CrW = c2243401CrKNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243401CrKNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C1516540pZE.LJIIIZ(c2243401CrKNewBuilder.LJ, C2243521CrW.ADAPTER);
            c2243401CrKNewBuilder.clearUnknownFields();
            return c2243401CrKNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243331CrD c2243331CrD) {
            C2243331CrD c2243331CrD2 = c2243331CrD;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243331CrD2.description);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c2243331CrD2.contents);
            protoWriter.writeBytes(c2243331CrD2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2243521CrW> contents;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW description;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.description;
        int iHashCode2 = ((iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37) + this.contents.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2243401CrK newBuilder() {
        C2243401CrK c2243401CrK = new C2243401CrK();
        c2243401CrK.LIZLLL = this.description;
        c2243401CrK.LJ = C1516540pZE.LIZJ("contents", this.contents);
        c2243401CrK.addUnknownFields(unknownFields());
        return c2243401CrK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.contents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        sb.replace(0, 2, "InfoCardContent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243331CrD)) {
            return false;
        }
        C2243331CrD c2243331CrD = (C2243331CrD) obj;
        if (unknownFields().equals(c2243331CrD.unknownFields()) && C1516540pZE.LJ(this.description, c2243331CrD.description) && this.contents.equals(c2243331CrD.contents)) {
            return true;
        }
        return false;
    }

    public C2243331CrD(C2243521CrW c2243521CrW, List<C2243521CrW> list) {
        this(c2243521CrW, list, ByteString.EMPTY);
    }

    public C2243331CrD(C2243521CrW c2243521CrW, List<C2243521CrW> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.description = c2243521CrW;
        this.contents = C1516540pZE.LJFF("contents", list);
    }
}
