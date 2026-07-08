package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232531CZn extends Message<C2232531CZn, C2232551CZp> {
    public static final ProtoAdapter<C2232531CZn> ADAPTER = new ProtoAdapter<C2232531CZn>() { // from class: X.1CZo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232531CZn decode(ProtoReader protoReader) {
            C2232551CZp c2232551CZp = new C2232551CZp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232551CZp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2232551CZp.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 3:
                            c2232551CZp.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            c2232551CZp.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 5:
                            c2232551CZp.LJII = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 6:
                            c2232551CZp.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2232551CZp.LJIIIZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            c2232551CZp.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2232551CZp.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2232551CZp.LJIIL = C1CW4.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2232551CZp.LJIILIIL = C2233181Caq.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2232551CZp.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2232551CZp.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232551CZp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232551CZp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232531CZn c2232531CZn) {
            C2232531CZn c2232531CZn2 = c2232531CZn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2232531CZn2.id);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2232531CZn2.left) + protoAdapter2.encodedSizeWithTag(3, c2232531CZn2.top) + protoAdapter2.encodedSizeWithTag(4, c2232531CZn2.right) + protoAdapter2.encodedSizeWithTag(5, c2232531CZn2.bottom);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c2232531CZn2.z_order) + protoAdapter2.encodedSizeWithTag(7, c2232531CZn2.radius) + protoAdapter.encodedSizeWithTag(8, c2232531CZn2.business_id) + protoAdapter.encodedSizeWithTag(9, c2232531CZn2.config_id) + C1CW4.ADAPTER.encodedSizeWithTag(10, c2232531CZn2.ui_pos) + C2233181Caq.ADAPTER.encodedSizeWithTag(11, c2232531CZn2.spot_extra) + protoAdapter.encodedSizeWithTag(12, c2232531CZn2.content_link_mic_id) + protoAdapter3.encodedSizeWithTag(13, c2232531CZn2.spot_id) + c2232531CZn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232531CZn redact(C2232531CZn c2232531CZn) {
            C2232551CZp c2232551CZpNewBuilder = c2232531CZn.newBuilder();
            C1CW4 c1cw4 = c2232551CZpNewBuilder.LJIIL;
            if (c1cw4 != null) {
                c2232551CZpNewBuilder.LJIIL = C1CW4.ADAPTER.redact(c1cw4);
            }
            c2232551CZpNewBuilder.LJIILIIL = C2233181Caq.ADAPTER.redact(c2232551CZpNewBuilder.LJIILIIL);
            c2232551CZpNewBuilder.clearUnknownFields();
            return c2232551CZpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232531CZn c2232531CZn) {
            C2232531CZn c2232531CZn2 = c2232531CZn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232531CZn2.id);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2232531CZn2.left);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2232531CZn2.top);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2232531CZn2.right);
            protoAdapter2.encodeWithTag(protoWriter, 5, c2232531CZn2.bottom);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 6, c2232531CZn2.z_order);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2232531CZn2.radius);
            protoAdapter.encodeWithTag(protoWriter, 8, c2232531CZn2.business_id);
            protoAdapter.encodeWithTag(protoWriter, 9, c2232531CZn2.config_id);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 10, c2232531CZn2.ui_pos);
            C2233181Caq.ADAPTER.encodeWithTag(protoWriter, 11, c2232531CZn2.spot_extra);
            protoAdapter.encodeWithTag(protoWriter, 12, c2232531CZn2.content_link_mic_id);
            protoAdapter3.encodeWithTag(protoWriter, 13, c2232531CZn2.spot_id);
            protoWriter.writeBytes(c2232531CZn2.unknownFields());
        }
    };
    public static final Double DEFAULT_BOTTOM;
    public static final Double DEFAULT_LEFT;
    public static final Double DEFAULT_RADIUS;
    public static final Double DEFAULT_RIGHT;
    public static final Long DEFAULT_SPOT_ID;
    public static final Double DEFAULT_TOP;
    public static final Long DEFAULT_Z_ORDER;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 5)
    public final Double bottom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 8)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final String config_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final String content_link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double left;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 7)
    public final Double radius;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double right;

    @WireField(adapter = "link_mic_sdk.proto.WindowSpotExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final C2233181Caq spot_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Long spot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double top;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C1CW4 ui_pos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long z_order;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_LEFT = dValueOf;
        DEFAULT_TOP = dValueOf;
        DEFAULT_RIGHT = dValueOf;
        DEFAULT_BOTTOM = dValueOf;
        DEFAULT_Z_ORDER = 0L;
        DEFAULT_RADIUS = dValueOf;
        DEFAULT_SPOT_ID = 0L;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.left.hashCode()) * 37) + this.top.hashCode()) * 37) + this.right.hashCode()) * 37) + this.bottom.hashCode()) * 37) + this.z_order.hashCode()) * 37) + this.radius.hashCode()) * 37) + this.business_id.hashCode()) * 37) + this.config_id.hashCode()) * 37;
        C1CW4 c1cw4 = this.ui_pos;
        int iHashCode2 = (((iHashCode + (c1cw4 != null ? c1cw4.hashCode() : 0)) * 37) + this.spot_extra.hashCode()) * 37;
        String str = this.content_link_mic_id;
        int iHashCode3 = ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.spot_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2232551CZp newBuilder() {
        C2232551CZp c2232551CZp = new C2232551CZp();
        c2232551CZp.LIZLLL = this.id;
        c2232551CZp.LJ = this.left;
        c2232551CZp.LJFF = this.top;
        c2232551CZp.LJI = this.right;
        c2232551CZp.LJII = this.bottom;
        c2232551CZp.LJIIIIZZ = this.z_order;
        c2232551CZp.LJIIIZ = this.radius;
        c2232551CZp.LJIIJ = this.business_id;
        c2232551CZp.LJIIJJI = this.config_id;
        c2232551CZp.LJIIL = this.ui_pos;
        c2232551CZp.LJIILIIL = this.spot_extra;
        c2232551CZp.LJIILJJIL = this.content_link_mic_id;
        c2232551CZp.LJIILL = this.spot_id;
        c2232551CZp.addUnknownFields(unknownFields());
        return c2232551CZp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", z_order=");
        sb.append(this.z_order);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", business_id=");
        sb.append(this.business_id);
        sb.append(", config_id=");
        sb.append(this.config_id);
        if (this.ui_pos != null) {
            sb.append(", ui_pos=");
            sb.append(this.ui_pos);
        }
        sb.append(", spot_extra=");
        sb.append(this.spot_extra);
        if (this.content_link_mic_id != null) {
            sb.append(", content_link_mic_id=");
            sb.append(this.content_link_mic_id);
        }
        sb.append(", spot_id=");
        sb.append(this.spot_id);
        sb.replace(0, 2, "LayoutWindow{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232531CZn)) {
            return false;
        }
        C2232531CZn c2232531CZn = (C2232531CZn) obj;
        if (unknownFields().equals(c2232531CZn.unknownFields()) && this.id.equals(c2232531CZn.id) && this.left.equals(c2232531CZn.left) && this.top.equals(c2232531CZn.top) && this.right.equals(c2232531CZn.right) && this.bottom.equals(c2232531CZn.bottom) && this.z_order.equals(c2232531CZn.z_order) && this.radius.equals(c2232531CZn.radius) && this.business_id.equals(c2232531CZn.business_id) && this.config_id.equals(c2232531CZn.config_id) && C1516540pZE.LJ(this.ui_pos, c2232531CZn.ui_pos) && this.spot_extra.equals(c2232531CZn.spot_extra) && C1516540pZE.LJ(this.content_link_mic_id, c2232531CZn.content_link_mic_id) && this.spot_id.equals(c2232531CZn.spot_id)) {
            return true;
        }
        return false;
    }

    public C2232531CZn(String str, Double d, Double d2, Double d3, Double d4, Long l, Double d5, String str2, String str3, C1CW4 c1cw4, C2233181Caq c2233181Caq, String str4, Long l2) {
        this(str, d, d2, d3, d4, l, d5, str2, str3, c1cw4, c2233181Caq, str4, l2, ByteString.EMPTY);
    }

    public C2232531CZn(String str, Double d, Double d2, Double d3, Double d4, Long l, Double d5, String str2, String str3, C1CW4 c1cw4, C2233181Caq c2233181Caq, String str4, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.left = d;
        this.top = d2;
        this.right = d3;
        this.bottom = d4;
        this.z_order = l;
        this.radius = d5;
        this.business_id = str2;
        this.config_id = str3;
        this.ui_pos = c1cw4;
        this.spot_extra = c2233181Caq;
        this.content_link_mic_id = str4;
        this.spot_id = l2;
    }
}
