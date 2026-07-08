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

/* JADX INFO: renamed from: X.1Cau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233221Cau extends Message<C2233221Cau, C2233241Caw> {
    public static final ProtoAdapter<C2233221Cau> ADAPTER = new ProtoAdapter<C2233221Cau>() { // from class: X.1Cav
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233221Cau decode(ProtoReader protoReader) {
            C2233241Caw c2233241Caw = new C2233241Caw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233241Caw.LIZLLL = C2233171Cap.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2233241Caw.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2233241Caw.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            c2233241Caw.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 5:
                            c2233241Caw.LJII = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 6:
                            c2233241Caw.LJIIIIZZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c2233241Caw.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2233241Caw.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2233241Caw.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2233241Caw.LJIIL = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233241Caw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233241Caw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233221Cau c2233221Cau) {
            C2233221Cau c2233221Cau2 = c2233221Cau;
            int iEncodedSizeWithTag = C2233171Cap.ADAPTER.encodedSizeWithTag(1, c2233221Cau2.spot) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2233221Cau2.content_link_mic_id);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2233221Cau2.x) + protoAdapter.encodedSizeWithTag(4, c2233221Cau2.y) + protoAdapter.encodedSizeWithTag(5, c2233221Cau2.width) + protoAdapter.encodedSizeWithTag(6, c2233221Cau2.height);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(7, c2233221Cau2.z_order_stream) + protoAdapter2.encodedSizeWithTag(8, c2233221Cau2.z_order_round_avatar) + protoAdapter2.encodedSizeWithTag(9, c2233221Cau2.z_order_gauss_bg) + protoAdapter.encodedSizeWithTag(10, c2233221Cau2.radius) + c2233221Cau2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233221Cau redact(C2233221Cau c2233221Cau) {
            C2233241Caw c2233241CawNewBuilder = c2233221Cau.newBuilder();
            c2233241CawNewBuilder.LIZLLL = C2233171Cap.ADAPTER.redact(c2233241CawNewBuilder.LIZLLL);
            c2233241CawNewBuilder.clearUnknownFields();
            return c2233241CawNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233221Cau c2233221Cau) {
            C2233221Cau c2233221Cau2 = c2233221Cau;
            C2233171Cap.ADAPTER.encodeWithTag(protoWriter, 1, c2233221Cau2.spot);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2233221Cau2.content_link_mic_id);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 3, c2233221Cau2.x);
            protoAdapter.encodeWithTag(protoWriter, 4, c2233221Cau2.y);
            protoAdapter.encodeWithTag(protoWriter, 5, c2233221Cau2.width);
            protoAdapter.encodeWithTag(protoWriter, 6, c2233221Cau2.height);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 7, c2233221Cau2.z_order_stream);
            protoAdapter2.encodeWithTag(protoWriter, 8, c2233221Cau2.z_order_round_avatar);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2233221Cau2.z_order_gauss_bg);
            protoAdapter.encodeWithTag(protoWriter, 10, c2233221Cau2.radius);
            protoWriter.writeBytes(c2233221Cau2.unknownFields());
        }
    };
    public static final Double DEFAULT_HEIGHT;
    public static final Double DEFAULT_RADIUS;
    public static final Double DEFAULT_WIDTH;
    public static final Double DEFAULT_X;
    public static final Double DEFAULT_Y;
    public static final Long DEFAULT_Z_ORDER_GAUSS_BG;
    public static final Long DEFAULT_Z_ORDER_ROUND_AVATAR;
    public static final Long DEFAULT_Z_ORDER_STREAM;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content_link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 6)
    public final Double height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Double radius;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSpotInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233171Cap spot;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 5)
    public final Double width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double x;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double y;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Long z_order_gauss_bg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long z_order_round_avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long z_order_stream;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_X = dValueOf;
        DEFAULT_Y = dValueOf;
        DEFAULT_WIDTH = dValueOf;
        DEFAULT_HEIGHT = dValueOf;
        DEFAULT_Z_ORDER_STREAM = 0L;
        DEFAULT_Z_ORDER_ROUND_AVATAR = 0L;
        DEFAULT_Z_ORDER_GAUSS_BG = 0L;
        DEFAULT_RADIUS = dValueOf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.spot.hashCode()) * 37;
        String str = this.content_link_mic_id;
        int iHashCode2 = ((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.x.hashCode()) * 37) + this.y.hashCode()) * 37) + this.width.hashCode()) * 37) + this.height.hashCode()) * 37) + this.z_order_stream.hashCode()) * 37) + this.z_order_round_avatar.hashCode()) * 37) + this.z_order_gauss_bg.hashCode()) * 37) + this.radius.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2233241Caw newBuilder() {
        C2233241Caw c2233241Caw = new C2233241Caw();
        c2233241Caw.LIZLLL = this.spot;
        c2233241Caw.LJ = this.content_link_mic_id;
        c2233241Caw.LJFF = this.x;
        c2233241Caw.LJI = this.y;
        c2233241Caw.LJII = this.width;
        c2233241Caw.LJIIIIZZ = this.height;
        c2233241Caw.LJIIIZ = this.z_order_stream;
        c2233241Caw.LJIIJ = this.z_order_round_avatar;
        c2233241Caw.LJIIJJI = this.z_order_gauss_bg;
        c2233241Caw.LJIIL = this.radius;
        c2233241Caw.addUnknownFields(unknownFields());
        return c2233241Caw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", spot=");
        sb.append(this.spot);
        if (this.content_link_mic_id != null) {
            sb.append(", content_link_mic_id=");
            sb.append(this.content_link_mic_id);
        }
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", z_order_stream=");
        sb.append(this.z_order_stream);
        sb.append(", z_order_round_avatar=");
        sb.append(this.z_order_round_avatar);
        sb.append(", z_order_gauss_bg=");
        sb.append(this.z_order_gauss_bg);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.replace(0, 2, "LinkMicLayoutMixStreamRegionInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233221Cau)) {
            return false;
        }
        C2233221Cau c2233221Cau = (C2233221Cau) obj;
        if (unknownFields().equals(c2233221Cau.unknownFields()) && this.spot.equals(c2233221Cau.spot) && C1516540pZE.LJ(this.content_link_mic_id, c2233221Cau.content_link_mic_id) && this.x.equals(c2233221Cau.x) && this.y.equals(c2233221Cau.y) && this.width.equals(c2233221Cau.width) && this.height.equals(c2233221Cau.height) && this.z_order_stream.equals(c2233221Cau.z_order_stream) && this.z_order_round_avatar.equals(c2233221Cau.z_order_round_avatar) && this.z_order_gauss_bg.equals(c2233221Cau.z_order_gauss_bg) && this.radius.equals(c2233221Cau.radius)) {
            return true;
        }
        return false;
    }

    public C2233221Cau(C2233171Cap c2233171Cap, String str, Double d, Double d2, Double d3, Double d4, Long l, Long l2, Long l3, Double d5) {
        this(c2233171Cap, str, d, d2, d3, d4, l, l2, l3, d5, ByteString.EMPTY);
    }

    public C2233221Cau(C2233171Cap c2233171Cap, String str, Double d, Double d2, Double d3, Double d4, Long l, Long l2, Long l3, Double d5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.spot = c2233171Cap;
        this.content_link_mic_id = str;
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
        this.z_order_stream = l;
        this.z_order_round_avatar = l2;
        this.z_order_gauss_bg = l3;
        this.radius = d5;
    }
}
