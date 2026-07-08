package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241451CoB extends Message<C2241451CoB, C2241501CoG> {
    public static final ProtoAdapter<C2241451CoB> ADAPTER = new ProtoAdapter<C2241451CoB>() { // from class: X.1CoA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241451CoB decode(ProtoReader protoReader) {
            C2241501CoG c2241501CoG = new C2241501CoG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2241501CoG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2241501CoG.LJ.add(C2237861CiO.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2241501CoG.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241501CoG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241451CoB c2241451CoB) {
            C2241451CoB c2241451CoB2 = c2241451CoB;
            return C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2241451CoB2.image) + C2237861CiO.ADAPTER.asRepeated().encodedSizeWithTag(2, c2241451CoB2.mention_info) + c2241451CoB2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241451CoB redact(C2241451CoB c2241451CoB) {
            C2241501CoG c2241501CoGNewBuilder = c2241451CoB.newBuilder();
            C2244091CsR c2244091CsR = c2241501CoGNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2241501CoGNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C1516540pZE.LJIIIZ(c2241501CoGNewBuilder.LJ, C2237861CiO.ADAPTER);
            c2241501CoGNewBuilder.clearUnknownFields();
            return c2241501CoGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241451CoB c2241451CoB) {
            C2241451CoB c2241451CoB2 = c2241451CoB;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2241451CoB2.image);
            C2237861CiO.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2241451CoB2.mention_info);
            protoWriter.writeBytes(c2241451CoB2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotMentionInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2237861CiO> mention_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = ((iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37) + this.mention_info.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2241501CoG newBuilder() {
        C2241501CoG c2241501CoG = new C2241501CoG();
        c2241501CoG.LIZLLL = this.image;
        c2241501CoG.LJ = C1516540pZE.LIZJ("mention_info", this.mention_info);
        c2241501CoG.addUnknownFields(unknownFields());
        return c2241501CoG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (!this.mention_info.isEmpty()) {
            sb.append(", mention_info=");
            sb.append(this.mention_info);
        }
        sb.replace(0, 2, "AIGroupShotResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241451CoB)) {
            return false;
        }
        C2241451CoB c2241451CoB = (C2241451CoB) obj;
        if (unknownFields().equals(c2241451CoB.unknownFields()) && C1516540pZE.LJ(this.image, c2241451CoB.image) && this.mention_info.equals(c2241451CoB.mention_info)) {
            return true;
        }
        return false;
    }

    public C2241451CoB(C2244091CsR c2244091CsR, List<C2237861CiO> list) {
        this(c2244091CsR, list, ByteString.EMPTY);
    }

    public C2241451CoB(C2244091CsR c2244091CsR, List<C2237861CiO> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.mention_info = C1516540pZE.LJFF("mention_info", list);
    }
}
