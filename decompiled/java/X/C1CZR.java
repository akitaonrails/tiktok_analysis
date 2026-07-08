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

/* JADX INFO: renamed from: X.1CZR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZR extends Message<C1CZR, C1CZT> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long cap_fps_max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long cap_fps_min;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long cap_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long cap_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long codec_fps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long codec_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Long codec_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long effect_fps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long effect_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long effect_width;
    public static final ProtoAdapter<C1CZR> ADAPTER = new ProtoAdapter<C1CZR>() { // from class: X.1CZS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZR decode(ProtoReader protoReader) {
            C1CZT c1czt = new C1CZT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1czt.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1czt.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1czt.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1czt.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1czt.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1czt.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1czt.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c1czt.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1czt.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1czt.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1czt.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1czt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1czt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZR c1czr) {
            C1CZR c1czr2 = c1czr;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1czr2.cap_fps_min) + protoAdapter.encodedSizeWithTag(2, c1czr2.cap_fps_max) + protoAdapter.encodedSizeWithTag(3, c1czr2.cap_width) + protoAdapter.encodedSizeWithTag(4, c1czr2.cap_height) + protoAdapter.encodedSizeWithTag(5, c1czr2.effect_fps) + protoAdapter.encodedSizeWithTag(6, c1czr2.effect_width) + protoAdapter.encodedSizeWithTag(7, c1czr2.effect_height) + protoAdapter.encodedSizeWithTag(8, c1czr2.codec_fps) + protoAdapter.encodedSizeWithTag(9, c1czr2.codec_width) + protoAdapter.encodedSizeWithTag(10, c1czr2.codec_height) + ProtoAdapter.STRING.encodedSizeWithTag(11, c1czr2.business_id) + c1czr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZR redact(C1CZR c1czr) {
            C1CZT c1cztNewBuilder = c1czr.newBuilder();
            c1cztNewBuilder.clearUnknownFields();
            return c1cztNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZR c1czr) {
            C1CZR c1czr2 = c1czr;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1czr2.cap_fps_min);
            protoAdapter.encodeWithTag(protoWriter, 2, c1czr2.cap_fps_max);
            protoAdapter.encodeWithTag(protoWriter, 3, c1czr2.cap_width);
            protoAdapter.encodeWithTag(protoWriter, 4, c1czr2.cap_height);
            protoAdapter.encodeWithTag(protoWriter, 5, c1czr2.effect_fps);
            protoAdapter.encodeWithTag(protoWriter, 6, c1czr2.effect_width);
            protoAdapter.encodeWithTag(protoWriter, 7, c1czr2.effect_height);
            protoAdapter.encodeWithTag(protoWriter, 8, c1czr2.codec_fps);
            protoAdapter.encodeWithTag(protoWriter, 9, c1czr2.codec_width);
            protoAdapter.encodeWithTag(protoWriter, 10, c1czr2.codec_height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, c1czr2.business_id);
            protoWriter.writeBytes(c1czr2.unknownFields());
        }
    };
    public static final Long DEFAULT_CAP_FPS_MIN = 0L;
    public static final Long DEFAULT_CAP_FPS_MAX = 0L;
    public static final Long DEFAULT_CAP_WIDTH = 0L;
    public static final Long DEFAULT_CAP_HEIGHT = 0L;
    public static final Long DEFAULT_EFFECT_FPS = 0L;
    public static final Long DEFAULT_EFFECT_WIDTH = 0L;
    public static final Long DEFAULT_EFFECT_HEIGHT = 0L;
    public static final Long DEFAULT_CODEC_FPS = 0L;
    public static final Long DEFAULT_CODEC_WIDTH = 0L;
    public static final Long DEFAULT_CODEC_HEIGHT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.cap_fps_min.hashCode()) * 37) + this.cap_fps_max.hashCode()) * 37) + this.cap_width.hashCode()) * 37) + this.cap_height.hashCode()) * 37) + this.effect_fps.hashCode()) * 37) + this.effect_width.hashCode()) * 37) + this.effect_height.hashCode()) * 37) + this.codec_fps.hashCode()) * 37) + this.codec_width.hashCode()) * 37) + this.codec_height.hashCode()) * 37) + this.business_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CZT newBuilder() {
        C1CZT c1czt = new C1CZT();
        c1czt.LIZLLL = this.cap_fps_min;
        c1czt.LJ = this.cap_fps_max;
        c1czt.LJFF = this.cap_width;
        c1czt.LJI = this.cap_height;
        c1czt.LJII = this.effect_fps;
        c1czt.LJIIIIZZ = this.effect_width;
        c1czt.LJIIIZ = this.effect_height;
        c1czt.LJIIJ = this.codec_fps;
        c1czt.LJIIJJI = this.codec_width;
        c1czt.LJIIL = this.codec_height;
        c1czt.LJIILIIL = this.business_id;
        c1czt.addUnknownFields(unknownFields());
        return c1czt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cap_fps_min=");
        sb.append(this.cap_fps_min);
        sb.append(", cap_fps_max=");
        sb.append(this.cap_fps_max);
        sb.append(", cap_width=");
        sb.append(this.cap_width);
        sb.append(", cap_height=");
        sb.append(this.cap_height);
        sb.append(", effect_fps=");
        sb.append(this.effect_fps);
        sb.append(", effect_width=");
        sb.append(this.effect_width);
        sb.append(", effect_height=");
        sb.append(this.effect_height);
        sb.append(", codec_fps=");
        sb.append(this.codec_fps);
        sb.append(", codec_width=");
        sb.append(this.codec_width);
        sb.append(", codec_height=");
        sb.append(this.codec_height);
        sb.append(", business_id=");
        sb.append(this.business_id);
        sb.replace(0, 2, "LinkMicMediaParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZR)) {
            return false;
        }
        C1CZR c1czr = (C1CZR) obj;
        if (unknownFields().equals(c1czr.unknownFields()) && this.cap_fps_min.equals(c1czr.cap_fps_min) && this.cap_fps_max.equals(c1czr.cap_fps_max) && this.cap_width.equals(c1czr.cap_width) && this.cap_height.equals(c1czr.cap_height) && this.effect_fps.equals(c1czr.effect_fps) && this.effect_width.equals(c1czr.effect_width) && this.effect_height.equals(c1czr.effect_height) && this.codec_fps.equals(c1czr.codec_fps) && this.codec_width.equals(c1czr.codec_width) && this.codec_height.equals(c1czr.codec_height) && this.business_id.equals(c1czr.business_id)) {
            return true;
        }
        return false;
    }

    public C1CZR(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str) {
        this(l, l2, l3, l4, l5, l6, l7, l8, l9, l10, str, ByteString.EMPTY);
    }

    public C1CZR(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cap_fps_min = l;
        this.cap_fps_max = l2;
        this.cap_width = l3;
        this.cap_height = l4;
        this.effect_fps = l5;
        this.effect_width = l6;
        this.effect_height = l7;
        this.codec_fps = l8;
        this.codec_width = l9;
        this.codec_height = l10;
        this.business_id = str;
    }
}
