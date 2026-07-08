package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVQ extends Message<C1CVQ, C1CVS> {
    public static final ProtoAdapter<C1CVQ> ADAPTER = new ProtoAdapter<C1CVQ>() { // from class: X.1CVR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVQ decode(ProtoReader protoReader) {
            C1CVS c1cvs = new C1CVS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cvs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cvs.LJ.add(C1CW4.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1cvs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVQ c1cvq) {
            C1CVQ c1cvq2 = c1cvq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cvq2.layout_id) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(2, c1cvq2.ui_pos) + c1cvq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVQ redact(C1CVQ c1cvq) {
            C1CVS c1cvsNewBuilder = c1cvq.newBuilder();
            C1516540pZE.LJIIIZ(c1cvsNewBuilder.LJ, C1CW4.ADAPTER);
            c1cvsNewBuilder.clearUnknownFields();
            return c1cvsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVQ c1cvq) {
            C1CVQ c1cvq2 = c1cvq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cvq2.layout_id);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1cvq2.ui_pos);
            protoWriter.writeBytes(c1cvq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C1CW4> ui_pos;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.layout_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.ui_pos.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CVS newBuilder() {
        C1CVS c1cvs = new C1CVS();
        c1cvs.LIZLLL = this.layout_id;
        c1cvs.LJ = C1516540pZE.LIZJ("ui_pos", this.ui_pos);
        c1cvs.addUnknownFields(unknownFields());
        return c1cvs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.layout_id != null) {
            sb.append(", layout_id=");
            sb.append(this.layout_id);
        }
        if (!this.ui_pos.isEmpty()) {
            sb.append(", ui_pos=");
            sb.append(this.ui_pos);
        }
        sb.replace(0, 2, "LinkMicLayoutContext{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVQ)) {
            return false;
        }
        C1CVQ c1cvq = (C1CVQ) obj;
        if (unknownFields().equals(c1cvq.unknownFields()) && C1516540pZE.LJ(this.layout_id, c1cvq.layout_id) && this.ui_pos.equals(c1cvq.ui_pos)) {
            return true;
        }
        return false;
    }

    public C1CVQ(String str, List<C1CW4> list) {
        this(str, list, ByteString.EMPTY);
    }

    public C1CVQ(String str, List<C1CW4> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_id = str;
        this.ui_pos = C1516540pZE.LJFF("ui_pos", list);
    }
}
