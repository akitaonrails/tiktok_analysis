package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSD extends Message<C1CSD, C1CSF> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double corner_radius;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_talk;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CSG rect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long win_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long z_order;
    public static final ProtoAdapter<C1CSD> ADAPTER = new ProtoAdapter<C1CSD>() { // from class: X.1CSE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSD decode(ProtoReader protoReader) {
            C1CSF c1csf = new C1CSF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1csf.LIZLLL = C1CSG.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1csf.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1csf.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1csf.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 5:
                            c1csf.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1csf.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1csf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSD c1csd) {
            C1CSD c1csd2 = c1csd;
            int iEncodedSizeWithTag = C1CSG.ADAPTER.encodedSizeWithTag(1, c1csd2.rect) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1csd2.is_talk);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1csd2.z_order) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, c1csd2.corner_radius) + ProtoAdapter.STRING.encodedSizeWithTag(5, c1csd2.extra) + protoAdapter.encodedSizeWithTag(6, c1csd2.win_id) + c1csd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSD redact(C1CSD c1csd) {
            C1CSF c1csfNewBuilder = c1csd.newBuilder();
            c1csfNewBuilder.LIZLLL = C1CSG.ADAPTER.redact(c1csfNewBuilder.LIZLLL);
            c1csfNewBuilder.clearUnknownFields();
            return c1csfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSD c1csd) {
            C1CSD c1csd2 = c1csd;
            C1CSG.ADAPTER.encodeWithTag(protoWriter, 1, c1csd2.rect);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c1csd2.is_talk);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c1csd2.z_order);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, c1csd2.corner_radius);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c1csd2.extra);
            protoAdapter.encodeWithTag(protoWriter, 6, c1csd2.win_id);
            protoWriter.writeBytes(c1csd2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_TALK = Boolean.FALSE;
    public static final Long DEFAULT_Z_ORDER = 0L;
    public static final Double DEFAULT_CORNER_RADIUS = Double.valueOf(0.0d);
    public static final Long DEFAULT_WIN_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.rect.hashCode()) * 37) + this.is_talk.hashCode()) * 37) + this.z_order.hashCode()) * 37) + this.corner_radius.hashCode()) * 37;
        String str = this.extra;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.win_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CSF newBuilder() {
        C1CSF c1csf = new C1CSF();
        c1csf.LIZLLL = this.rect;
        c1csf.LJ = this.is_talk;
        c1csf.LJFF = this.z_order;
        c1csf.LJI = this.corner_radius;
        c1csf.LJII = this.extra;
        c1csf.LJIIIIZZ = this.win_id;
        c1csf.addUnknownFields(unknownFields());
        return c1csf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rect=");
        sb.append(this.rect);
        sb.append(", is_talk=");
        sb.append(this.is_talk);
        sb.append(", z_order=");
        sb.append(this.z_order);
        sb.append(", corner_radius=");
        sb.append(this.corner_radius);
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.append(", win_id=");
        sb.append(this.win_id);
        sb.replace(0, 2, "LinkMicRtcSeiGridInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSD)) {
            return false;
        }
        C1CSD c1csd = (C1CSD) obj;
        if (unknownFields().equals(c1csd.unknownFields()) && this.rect.equals(c1csd.rect) && this.is_talk.equals(c1csd.is_talk) && this.z_order.equals(c1csd.z_order) && this.corner_radius.equals(c1csd.corner_radius) && C1516540pZE.LJ(this.extra, c1csd.extra) && this.win_id.equals(c1csd.win_id)) {
            return true;
        }
        return false;
    }

    public C1CSD(C1CSG c1csg, Boolean bool, Long l, Double d, String str, Long l2) {
        this(c1csg, bool, l, d, str, l2, ByteString.EMPTY);
    }

    public C1CSD(C1CSG c1csg, Boolean bool, Long l, Double d, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rect = c1csg;
        this.is_talk = bool;
        this.z_order = l;
        this.corner_radius = d;
        this.extra = str;
        this.win_id = l2;
    }
}
