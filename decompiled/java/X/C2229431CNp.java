package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229431CNp extends Message<C2229431CNp, C2229451CNr> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long bits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long bits_1_2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 8)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long effect_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long effect_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long fps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long h;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long w;
    public static final ProtoAdapter<C2229431CNp> ADAPTER = new ProtoAdapter<C2229431CNp>() { // from class: X.1CNq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229431CNp decode(ProtoReader protoReader) {
            C2229451CNr c2229451CNr = new C2229451CNr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2229451CNr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2229451CNr.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2229451CNr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2229451CNr.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2229451CNr.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2229451CNr.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2229451CNr.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2229451CNr.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229451CNr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229451CNr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229431CNp c2229431CNp) {
            C2229431CNp c2229431CNp2 = c2229431CNp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2229431CNp2.effect_width) + protoAdapter.encodedSizeWithTag(2, c2229431CNp2.effect_height) + protoAdapter.encodedSizeWithTag(3, c2229431CNp2.w) + protoAdapter.encodedSizeWithTag(4, c2229431CNp2.h) + protoAdapter.encodedSizeWithTag(5, c2229431CNp2.fps) + protoAdapter.encodedSizeWithTag(6, c2229431CNp2.bits) + protoAdapter.encodedSizeWithTag(7, c2229431CNp2.bits_1_2) + ProtoAdapter.STRING.encodedSizeWithTag(8, c2229431CNp2.business_id) + c2229431CNp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229431CNp redact(C2229431CNp c2229431CNp) {
            C2229451CNr c2229451CNrNewBuilder = c2229431CNp.newBuilder();
            c2229451CNrNewBuilder.clearUnknownFields();
            return c2229451CNrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229431CNp c2229431CNp) {
            C2229431CNp c2229431CNp2 = c2229431CNp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2229431CNp2.effect_width);
            protoAdapter.encodeWithTag(protoWriter, 2, c2229431CNp2.effect_height);
            protoAdapter.encodeWithTag(protoWriter, 3, c2229431CNp2.w);
            protoAdapter.encodeWithTag(protoWriter, 4, c2229431CNp2.h);
            protoAdapter.encodeWithTag(protoWriter, 5, c2229431CNp2.fps);
            protoAdapter.encodeWithTag(protoWriter, 6, c2229431CNp2.bits);
            protoAdapter.encodeWithTag(protoWriter, 7, c2229431CNp2.bits_1_2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, c2229431CNp2.business_id);
            protoWriter.writeBytes(c2229431CNp2.unknownFields());
        }
    };
    public static final Long DEFAULT_EFFECT_WIDTH = 0L;
    public static final Long DEFAULT_EFFECT_HEIGHT = 0L;
    public static final Long DEFAULT_W = 0L;
    public static final Long DEFAULT_H = 0L;
    public static final Long DEFAULT_FPS = 0L;
    public static final Long DEFAULT_BITS = 0L;
    public static final Long DEFAULT_BITS_1_2 = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.effect_width.hashCode()) * 37) + this.effect_height.hashCode()) * 37) + this.w.hashCode()) * 37) + this.h.hashCode()) * 37) + this.fps.hashCode()) * 37) + this.bits.hashCode()) * 37) + this.bits_1_2.hashCode()) * 37) + this.business_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229451CNr newBuilder() {
        C2229451CNr c2229451CNr = new C2229451CNr();
        c2229451CNr.LIZLLL = this.effect_width;
        c2229451CNr.LJ = this.effect_height;
        c2229451CNr.LJFF = this.w;
        c2229451CNr.LJI = this.h;
        c2229451CNr.LJII = this.fps;
        c2229451CNr.LJIIIIZZ = this.bits;
        c2229451CNr.LJIIIZ = this.bits_1_2;
        c2229451CNr.LJIIJ = this.business_id;
        c2229451CNr.addUnknownFields(unknownFields());
        return c2229451CNr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", effect_width=");
        sb.append(this.effect_width);
        sb.append(", effect_height=");
        sb.append(this.effect_height);
        sb.append(", w=");
        sb.append(this.w);
        sb.append(", h=");
        sb.append(this.h);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(", bits=");
        sb.append(this.bits);
        sb.append(", bits_1_2=");
        sb.append(this.bits_1_2);
        sb.append(", business_id=");
        sb.append(this.business_id);
        sb.replace(0, 2, "LinkMicResolutionModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229431CNp)) {
            return false;
        }
        C2229431CNp c2229431CNp = (C2229431CNp) obj;
        if (unknownFields().equals(c2229431CNp.unknownFields()) && this.effect_width.equals(c2229431CNp.effect_width) && this.effect_height.equals(c2229431CNp.effect_height) && this.w.equals(c2229431CNp.w) && this.h.equals(c2229431CNp.h) && this.fps.equals(c2229431CNp.fps) && this.bits.equals(c2229431CNp.bits) && this.bits_1_2.equals(c2229431CNp.bits_1_2) && this.business_id.equals(c2229431CNp.business_id)) {
            return true;
        }
        return false;
    }

    public C2229431CNp(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str) {
        this(l, l2, l3, l4, l5, l6, l7, str, ByteString.EMPTY);
    }

    public C2229431CNp(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.effect_width = l;
        this.effect_height = l2;
        this.w = l3;
        this.h = l4;
        this.fps = l5;
        this.bits = l6;
        this.bits_1_2 = l7;
        this.business_id = str;
    }
}
