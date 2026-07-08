package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQV extends Message<C1CQV, C1CQX> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String comment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String conditions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long min_app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String parameter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 5)
    public final List<Long> prev;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long version;
    public static final ProtoAdapter<C1CQV> ADAPTER = new ProtoAdapter<C1CQV>() { // from class: X.1CQW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQV decode(ProtoReader protoReader) {
            C1CQX c1cqx = new C1CQX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cqx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1cqx.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1cqx.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1cqx.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cqx.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            c1cqx.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1cqx.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c1cqx.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1cqx.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cqx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQV c1cqv) {
            C1CQV c1cqv2 = c1cqv;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cqv2.next) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1cqv2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cqv2.name) + protoAdapter2.encodedSizeWithTag(4, c1cqv2.comment) + protoAdapter.asPacked().encodedSizeWithTag(5, c1cqv2.prev) + protoAdapter.encodedSizeWithTag(6, c1cqv2.version) + protoAdapter.encodedSizeWithTag(7, c1cqv2.min_app_version) + protoAdapter2.encodedSizeWithTag(8, c1cqv2.parameter) + protoAdapter2.encodedSizeWithTag(9, c1cqv2.conditions) + c1cqv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQV redact(C1CQV c1cqv) {
            C1CQX c1cqxNewBuilder = c1cqv.newBuilder();
            c1cqxNewBuilder.clearUnknownFields();
            return c1cqxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQV c1cqv) {
            C1CQV c1cqv2 = c1cqv;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cqv2.next);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c1cqv2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cqv2.name);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1cqv2.comment);
            protoAdapter.asPacked().encodeWithTag(protoWriter, 5, c1cqv2.prev);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cqv2.version);
            protoAdapter.encodeWithTag(protoWriter, 7, c1cqv2.min_app_version);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1cqv2.parameter);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1cqv2.conditions);
            protoWriter.writeBytes(c1cqv2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT = 0L;
    public static final Boolean DEFAULT_END = Boolean.FALSE;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Long DEFAULT_MIN_APP_VERSION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.next.hashCode()) * 37) + this.end.hashCode()) * 37) + this.name.hashCode()) * 37;
        String str = this.comment;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.prev.hashCode()) * 37) + this.version.hashCode()) * 37) + this.min_app_version.hashCode()) * 37;
        String str2 = this.parameter;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.conditions;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CQX newBuilder() {
        C1CQX c1cqx = new C1CQX();
        c1cqx.LIZLLL = this.next;
        c1cqx.LJ = this.end;
        c1cqx.LJFF = this.name;
        c1cqx.LJI = this.comment;
        c1cqx.LJII = C1516540pZE.LIZJ("prev", this.prev);
        c1cqx.LJIIIIZZ = this.version;
        c1cqx.LJIIIZ = this.min_app_version;
        c1cqx.LJIIJ = this.parameter;
        c1cqx.LJIIJJI = this.conditions;
        c1cqx.addUnknownFields(unknownFields());
        return c1cqx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", next=");
        sb.append(this.next);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", name=");
        sb.append(this.name);
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (!this.prev.isEmpty()) {
            sb.append(", prev=");
            sb.append(this.prev);
        }
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", min_app_version=");
        sb.append(this.min_app_version);
        if (this.parameter != null) {
            sb.append(", parameter=");
            sb.append(this.parameter);
        }
        if (this.conditions != null) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        sb.replace(0, 2, "SyeTaskStateData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQV)) {
            return false;
        }
        C1CQV c1cqv = (C1CQV) obj;
        if (unknownFields().equals(c1cqv.unknownFields()) && this.next.equals(c1cqv.next) && this.end.equals(c1cqv.end) && this.name.equals(c1cqv.name) && C1516540pZE.LJ(this.comment, c1cqv.comment) && this.prev.equals(c1cqv.prev) && this.version.equals(c1cqv.version) && this.min_app_version.equals(c1cqv.min_app_version) && C1516540pZE.LJ(this.parameter, c1cqv.parameter) && C1516540pZE.LJ(this.conditions, c1cqv.conditions)) {
            return true;
        }
        return false;
    }

    public C1CQV(Long l, Boolean bool, String str, String str2, List<Long> list, Long l2, Long l3, String str3, String str4) {
        this(l, bool, str, str2, list, l2, l3, str3, str4, ByteString.EMPTY);
    }

    public C1CQV(Long l, Boolean bool, String str, String str2, List<Long> list, Long l2, Long l3, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next = l;
        this.end = bool;
        this.name = str;
        this.comment = str2;
        this.prev = C1516540pZE.LJFF("prev", list);
        this.version = l2;
        this.min_app_version = l3;
        this.parameter = str3;
        this.conditions = str4;
    }
}
