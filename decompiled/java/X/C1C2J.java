package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2J extends Message<C1C2J, C1C2L> {
    public static final ProtoAdapter<C1C2J> ADAPTER = new ProtoAdapter<C1C2J>() { // from class: X.1C2K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2J decode(ProtoReader protoReader) {
            C1C2L c1c2l = new C1C2L();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c2l.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c2l.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2l.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2J c1c2j) {
            C1C2J c1c2j2 = c1c2j;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c1c2j2.float_positions) + c1c2j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2J redact(C1C2J c1c2j) {
            C1C2L c1c2lNewBuilder = c1c2j.newBuilder();
            c1c2lNewBuilder.clearUnknownFields();
            return c1c2lNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2J c1c2j) {
            C1C2J c1c2j2 = c1c2j;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c1c2j2.float_positions);
            protoWriter.writeBytes(c1c2j2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> float_positions;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.float_positions.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C2L newBuilder() {
        C1C2L c1c2l = new C1C2L();
        c1c2l.LIZLLL = C1516540pZE.LIZJ("float_positions", this.float_positions);
        c1c2l.addUnknownFields(unknownFields());
        return c1c2l;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.float_positions.isEmpty()) {
            sb.append(", float_positions=");
            sb.append(this.float_positions);
        }
        sb.replace(0, 2, "FuncParamsX744cee75ce822ee0{");
        sb.append('}');
        return sb.toString();
    }

    public C1C2J(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C2J)) {
            return false;
        }
        C1C2J c1c2j = (C1C2J) obj;
        if (unknownFields().equals(c1c2j.unknownFields()) && this.float_positions.equals(c1c2j.float_positions)) {
            return true;
        }
        return false;
    }

    public C1C2J(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.float_positions = C1516540pZE.LJFF("float_positions", list);
    }
}
