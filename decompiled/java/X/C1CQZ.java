package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQZ extends Message<C1CQZ, C2230071CQb> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String auto_run_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 8)
    public final List<Long> branches;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String comment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String conditions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 7)
    public final List<Long> prev;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String tips;
    public static final ProtoAdapter<C1CQZ> ADAPTER = new ProtoAdapter<C1CQZ>() { // from class: X.1CQa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQZ decode(ProtoReader protoReader) {
            C2230071CQb c2230071CQb = new C2230071CQb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2230071CQb.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2230071CQb.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2230071CQb.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2230071CQb.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2230071CQb.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2230071CQb.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2230071CQb.LJIIIZ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            c2230071CQb.LJIIJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230071CQb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230071CQb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQZ c1cqz) {
            C1CQZ c1cqz2 = c1cqz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cqz2.next) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1cqz2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cqz2.comment) + protoAdapter2.encodedSizeWithTag(4, c1cqz2.tips) + protoAdapter2.encodedSizeWithTag(5, c1cqz2.conditions) + protoAdapter2.encodedSizeWithTag(6, c1cqz2.auto_run_mode) + protoAdapter.asPacked().encodedSizeWithTag(7, c1cqz2.prev) + protoAdapter.asPacked().encodedSizeWithTag(8, c1cqz2.branches) + c1cqz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQZ redact(C1CQZ c1cqz) {
            C2230071CQb c2230071CQbNewBuilder = c1cqz.newBuilder();
            c2230071CQbNewBuilder.clearUnknownFields();
            return c2230071CQbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQZ c1cqz) {
            C1CQZ c1cqz2 = c1cqz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cqz2.next);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c1cqz2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cqz2.comment);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1cqz2.tips);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1cqz2.conditions);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1cqz2.auto_run_mode);
            protoAdapter.asPacked().encodeWithTag(protoWriter, 7, c1cqz2.prev);
            protoAdapter.asPacked().encodeWithTag(protoWriter, 8, c1cqz2.branches);
            protoWriter.writeBytes(c1cqz2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT = 0L;
    public static final Boolean DEFAULT_END = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.next.hashCode()) * 37) + this.end.hashCode()) * 37;
        String str = this.comment;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tips;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.conditions;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.auto_run_mode;
        int iHashCode5 = ((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.prev.hashCode()) * 37) + this.branches.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2230071CQb newBuilder() {
        C2230071CQb c2230071CQb = new C2230071CQb();
        c2230071CQb.LIZLLL = this.next;
        c2230071CQb.LJ = this.end;
        c2230071CQb.LJFF = this.comment;
        c2230071CQb.LJI = this.tips;
        c2230071CQb.LJII = this.conditions;
        c2230071CQb.LJIIIIZZ = this.auto_run_mode;
        c2230071CQb.LJIIIZ = C1516540pZE.LIZJ("prev", this.prev);
        c2230071CQb.LJIIJ = C1516540pZE.LIZJ("branches", this.branches);
        c2230071CQb.addUnknownFields(unknownFields());
        return c2230071CQb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", next=");
        sb.append(this.next);
        sb.append(", end=");
        sb.append(this.end);
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.conditions != null) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        if (this.auto_run_mode != null) {
            sb.append(", auto_run_mode=");
            sb.append(this.auto_run_mode);
        }
        if (!this.prev.isEmpty()) {
            sb.append(", prev=");
            sb.append(this.prev);
        }
        if (!this.branches.isEmpty()) {
            sb.append(", branches=");
            sb.append(this.branches);
        }
        sb.replace(0, 2, "SyeParallelStateData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQZ)) {
            return false;
        }
        C1CQZ c1cqz = (C1CQZ) obj;
        if (unknownFields().equals(c1cqz.unknownFields()) && this.next.equals(c1cqz.next) && this.end.equals(c1cqz.end) && C1516540pZE.LJ(this.comment, c1cqz.comment) && C1516540pZE.LJ(this.tips, c1cqz.tips) && C1516540pZE.LJ(this.conditions, c1cqz.conditions) && C1516540pZE.LJ(this.auto_run_mode, c1cqz.auto_run_mode) && this.prev.equals(c1cqz.prev) && this.branches.equals(c1cqz.branches)) {
            return true;
        }
        return false;
    }

    public C1CQZ(Long l, Boolean bool, String str, String str2, String str3, String str4, List<Long> list, List<Long> list2) {
        this(l, bool, str, str2, str3, str4, list, list2, ByteString.EMPTY);
    }

    public C1CQZ(Long l, Boolean bool, String str, String str2, String str3, String str4, List<Long> list, List<Long> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next = l;
        this.end = bool;
        this.comment = str;
        this.tips = str2;
        this.conditions = str3;
        this.auto_run_mode = str4;
        this.prev = C1516540pZE.LJFF("prev", list);
        this.branches = C1516540pZE.LJFF("branches", list2);
    }
}
