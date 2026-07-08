package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDS extends Message<C1CDS, C1CDU> {
    public static final ProtoAdapter<C1CDS> ADAPTER = new ProtoAdapter<C1CDS>() { // from class: X.1CDT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDS decode(ProtoReader protoReader) {
            C1CDU c1cdu = new C1CDU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cdu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cdu.LJ.add(C2240651Cmt.ADAPTER.decode(protoReader));
                        }
                    } else {
                        try {
                            c1cdu.LIZLLL = EnumC19363610pG.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cdu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDS c1cds) {
            C1CDS c1cds2 = c1cds;
            return EnumC19363610pG.ADAPTER.encodedSizeWithTag(1, c1cds2.sticker_type) + C2240651Cmt.ADAPTER.asRepeated().encodedSizeWithTag(2, c1cds2.sticker_base) + c1cds2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDS redact(C1CDS c1cds) {
            C1CDU c1cduNewBuilder = c1cds.newBuilder();
            C1516540pZE.LJIIIZ(c1cduNewBuilder.LJ, C2240651Cmt.ADAPTER);
            c1cduNewBuilder.clearUnknownFields();
            return c1cduNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDS c1cds) {
            C1CDS c1cds2 = c1cds;
            EnumC19363610pG.ADAPTER.encodeWithTag(protoWriter, 1, c1cds2.sticker_type);
            C2240651Cmt.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1cds2.sticker_base);
            protoWriter.writeBytes(c1cds2.unknownFields());
        }
    };
    public static final EnumC19363610pG DEFAULT_STICKER_TYPE = EnumC19363610pG.STICKER_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerBase#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2240651Cmt> sticker_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCreationResultType#ADAPTER", tag = 1)
    public final EnumC19363610pG sticker_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC19363610pG enumC19363610pG = this.sticker_type;
        int iHashCode2 = ((iHashCode + (enumC19363610pG != null ? enumC19363610pG.hashCode() : 0)) * 37) + this.sticker_base.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CDU newBuilder() {
        C1CDU c1cdu = new C1CDU();
        c1cdu.LIZLLL = this.sticker_type;
        c1cdu.LJ = C1516540pZE.LIZJ("sticker_base", this.sticker_base);
        c1cdu.addUnknownFields(unknownFields());
        return c1cdu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sticker_type != null) {
            sb.append(", sticker_type=");
            sb.append(this.sticker_type);
        }
        if (!this.sticker_base.isEmpty()) {
            sb.append(", sticker_base=");
            sb.append(this.sticker_base);
        }
        sb.replace(0, 2, "StickerCreationResultValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDS)) {
            return false;
        }
        C1CDS c1cds = (C1CDS) obj;
        if (unknownFields().equals(c1cds.unknownFields()) && C1516540pZE.LJ(this.sticker_type, c1cds.sticker_type) && this.sticker_base.equals(c1cds.sticker_base)) {
            return true;
        }
        return false;
    }

    public C1CDS(EnumC19363610pG enumC19363610pG, List<C2240651Cmt> list) {
        this(enumC19363610pG, list, ByteString.EMPTY);
    }

    public C1CDS(EnumC19363610pG enumC19363610pG, List<C2240651Cmt> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_type = enumC19363610pG;
        this.sticker_base = C1516540pZE.LJFF("sticker_base", list);
    }
}
