package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248921D0o extends Message<C2248921D0o, C2248941D0q> {
    public static final Long DEFAULT_DECODER_OUTPUT_FRAME_RATE;
    public static final Long DEFAULT_E2E_DELAY;
    public static final Long DEFAULT_FROZEN_RATE;
    public static final Boolean DEFAULT_IS_SCREEN;
    public static final Long DEFAULT_RECEIVED_FRAME_RATE;
    public static final Double DEFAULT_RECEIVED_KB;
    public static final Long DEFAULT_RENDER_OUTPUT_FRAME_RATE;
    public static final Long DEFAULT_RTT;
    public static final Long DEFAULT_STALL_COUNT;
    public static final Long DEFAULT_STALL_DURATION;
    public static final Long DEFAULT_STATS_INTERVAL;
    public static final Long DEFAULT_VIDEO_INDEX;
    public static final Double DEFAULT_VIDEO_LOSS_RATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long decoder_output_frame_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long delay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Long e2e_delay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 16)
    public final Long frozen_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Boolean is_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long received_frame_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 6)
    public final Double received_kb;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Long render_output_frame_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 15)
    public final Long rtt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long stall_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final Long stall_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 14)
    public final Long stats_interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final Long video_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 5)
    public final Double video_loss_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long width;
    public static final ProtoAdapter<C2248921D0o> ADAPTER = new ProtoAdapter<C2248921D0o>() { // from class: X.1D0p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248921D0o decode(ProtoReader protoReader) {
            C2248941D0q c2248941D0q = new C2248941D0q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2248941D0q.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2248941D0q.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2248941D0q.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2248941D0q.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2248941D0q.LJII = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 6:
                            c2248941D0q.LJIIIIZZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c2248941D0q.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2248941D0q.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2248941D0q.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2248941D0q.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2248941D0q.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2248941D0q.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2248941D0q.LJIILL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c2248941D0q.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c2248941D0q.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c2248941D0q.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2248941D0q.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2248941D0q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248941D0q.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248921D0o c2248921D0o) {
            C2248921D0o c2248921D0o2 = c2248921D0o;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2248921D0o2.link_mic_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2248921D0o2.delay) + protoAdapter.encodedSizeWithTag(3, c2248921D0o2.width) + protoAdapter.encodedSizeWithTag(4, c2248921D0o2.height);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c2248921D0o2.video_loss_rate) + protoAdapter2.encodedSizeWithTag(6, c2248921D0o2.received_kb) + protoAdapter.encodedSizeWithTag(7, c2248921D0o2.received_frame_rate) + protoAdapter.encodedSizeWithTag(8, c2248921D0o2.decoder_output_frame_rate) + protoAdapter.encodedSizeWithTag(9, c2248921D0o2.render_output_frame_rate) + protoAdapter.encodedSizeWithTag(10, c2248921D0o2.stall_count) + protoAdapter.encodedSizeWithTag(11, c2248921D0o2.stall_duration) + protoAdapter.encodedSizeWithTag(12, c2248921D0o2.e2e_delay) + ProtoAdapter.BOOL.encodedSizeWithTag(13, c2248921D0o2.is_screen) + protoAdapter.encodedSizeWithTag(14, c2248921D0o2.stats_interval) + protoAdapter.encodedSizeWithTag(15, c2248921D0o2.rtt) + protoAdapter.encodedSizeWithTag(16, c2248921D0o2.frozen_rate) + protoAdapter.encodedSizeWithTag(17, c2248921D0o2.video_index) + c2248921D0o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248921D0o redact(C2248921D0o c2248921D0o) {
            C2248941D0q c2248941D0qNewBuilder = c2248921D0o.newBuilder();
            c2248941D0qNewBuilder.clearUnknownFields();
            return c2248941D0qNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248921D0o c2248921D0o) {
            C2248921D0o c2248921D0o2 = c2248921D0o;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2248921D0o2.link_mic_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2248921D0o2.delay);
            protoAdapter.encodeWithTag(protoWriter, 3, c2248921D0o2.width);
            protoAdapter.encodeWithTag(protoWriter, 4, c2248921D0o2.height);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            protoAdapter2.encodeWithTag(protoWriter, 5, c2248921D0o2.video_loss_rate);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2248921D0o2.received_kb);
            protoAdapter.encodeWithTag(protoWriter, 7, c2248921D0o2.received_frame_rate);
            protoAdapter.encodeWithTag(protoWriter, 8, c2248921D0o2.decoder_output_frame_rate);
            protoAdapter.encodeWithTag(protoWriter, 9, c2248921D0o2.render_output_frame_rate);
            protoAdapter.encodeWithTag(protoWriter, 10, c2248921D0o2.stall_count);
            protoAdapter.encodeWithTag(protoWriter, 11, c2248921D0o2.stall_duration);
            protoAdapter.encodeWithTag(protoWriter, 12, c2248921D0o2.e2e_delay);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, c2248921D0o2.is_screen);
            protoAdapter.encodeWithTag(protoWriter, 14, c2248921D0o2.stats_interval);
            protoAdapter.encodeWithTag(protoWriter, 15, c2248921D0o2.rtt);
            protoAdapter.encodeWithTag(protoWriter, 16, c2248921D0o2.frozen_rate);
            protoAdapter.encodeWithTag(protoWriter, 17, c2248921D0o2.video_index);
            protoWriter.writeBytes(c2248921D0o2.unknownFields());
        }
    };
    public static final Long DEFAULT_DELAY = 0L;
    public static final Long DEFAULT_WIDTH = 0L;
    public static final Long DEFAULT_HEIGHT = 0L;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_VIDEO_LOSS_RATE = dValueOf;
        DEFAULT_RECEIVED_KB = dValueOf;
        DEFAULT_RECEIVED_FRAME_RATE = 0L;
        DEFAULT_DECODER_OUTPUT_FRAME_RATE = 0L;
        DEFAULT_RENDER_OUTPUT_FRAME_RATE = 0L;
        DEFAULT_STALL_COUNT = 0L;
        DEFAULT_STALL_DURATION = 0L;
        DEFAULT_E2E_DELAY = 0L;
        DEFAULT_IS_SCREEN = Boolean.FALSE;
        DEFAULT_STATS_INTERVAL = 0L;
        DEFAULT_RTT = 0L;
        DEFAULT_FROZEN_RATE = 0L;
        DEFAULT_VIDEO_INDEX = 0L;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.link_mic_id;
        int iHashCode2 = ((((((((((((((((((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.delay.hashCode()) * 37) + this.width.hashCode()) * 37) + this.height.hashCode()) * 37) + this.video_loss_rate.hashCode()) * 37) + this.received_kb.hashCode()) * 37) + this.received_frame_rate.hashCode()) * 37) + this.decoder_output_frame_rate.hashCode()) * 37) + this.render_output_frame_rate.hashCode()) * 37) + this.stall_count.hashCode()) * 37) + this.stall_duration.hashCode()) * 37) + this.e2e_delay.hashCode()) * 37) + this.is_screen.hashCode()) * 37) + this.stats_interval.hashCode()) * 37) + this.rtt.hashCode()) * 37) + this.frozen_rate.hashCode()) * 37) + this.video_index.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2248941D0q newBuilder() {
        C2248941D0q c2248941D0q = new C2248941D0q();
        c2248941D0q.LIZLLL = this.link_mic_id;
        c2248941D0q.LJ = this.delay;
        c2248941D0q.LJFF = this.width;
        c2248941D0q.LJI = this.height;
        c2248941D0q.LJII = this.video_loss_rate;
        c2248941D0q.LJIIIIZZ = this.received_kb;
        c2248941D0q.LJIIIZ = this.received_frame_rate;
        c2248941D0q.LJIIJ = this.decoder_output_frame_rate;
        c2248941D0q.LJIIJJI = this.render_output_frame_rate;
        c2248941D0q.LJIIL = this.stall_count;
        c2248941D0q.LJIILIIL = this.stall_duration;
        c2248941D0q.LJIILJJIL = this.e2e_delay;
        c2248941D0q.LJIILL = this.is_screen;
        c2248941D0q.LJIILLIIL = this.stats_interval;
        c2248941D0q.LJIIZILJ = this.rtt;
        c2248941D0q.LJIJ = this.frozen_rate;
        c2248941D0q.LJIJI = this.video_index;
        c2248941D0q.addUnknownFields(unknownFields());
        return c2248941D0q;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link_mic_id != null) {
            sb.append(", link_mic_id=");
            sb.append(this.link_mic_id);
        }
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", video_loss_rate=");
        sb.append(this.video_loss_rate);
        sb.append(", received_kb=");
        sb.append(this.received_kb);
        sb.append(", received_frame_rate=");
        sb.append(this.received_frame_rate);
        sb.append(", decoder_output_frame_rate=");
        sb.append(this.decoder_output_frame_rate);
        sb.append(", render_output_frame_rate=");
        sb.append(this.render_output_frame_rate);
        sb.append(", stall_count=");
        sb.append(this.stall_count);
        sb.append(", stall_duration=");
        sb.append(this.stall_duration);
        sb.append(", e2e_delay=");
        sb.append(this.e2e_delay);
        sb.append(", is_screen=");
        sb.append(this.is_screen);
        sb.append(", stats_interval=");
        sb.append(this.stats_interval);
        sb.append(", rtt=");
        sb.append(this.rtt);
        sb.append(", frozen_rate=");
        sb.append(this.frozen_rate);
        sb.append(", video_index=");
        sb.append(this.video_index);
        sb.replace(0, 2, "LinkMicRtcRemoteVideoStats{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248921D0o)) {
            return false;
        }
        C2248921D0o c2248921D0o = (C2248921D0o) obj;
        if (unknownFields().equals(c2248921D0o.unknownFields()) && C1516540pZE.LJ(this.link_mic_id, c2248921D0o.link_mic_id) && this.delay.equals(c2248921D0o.delay) && this.width.equals(c2248921D0o.width) && this.height.equals(c2248921D0o.height) && this.video_loss_rate.equals(c2248921D0o.video_loss_rate) && this.received_kb.equals(c2248921D0o.received_kb) && this.received_frame_rate.equals(c2248921D0o.received_frame_rate) && this.decoder_output_frame_rate.equals(c2248921D0o.decoder_output_frame_rate) && this.render_output_frame_rate.equals(c2248921D0o.render_output_frame_rate) && this.stall_count.equals(c2248921D0o.stall_count) && this.stall_duration.equals(c2248921D0o.stall_duration) && this.e2e_delay.equals(c2248921D0o.e2e_delay) && this.is_screen.equals(c2248921D0o.is_screen) && this.stats_interval.equals(c2248921D0o.stats_interval) && this.rtt.equals(c2248921D0o.rtt) && this.frozen_rate.equals(c2248921D0o.frozen_rate) && this.video_index.equals(c2248921D0o.video_index)) {
            return true;
        }
        return false;
    }

    public C2248921D0o(String str, Long l, Long l2, Long l3, Double d, Double d2, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Boolean bool, Long l10, Long l11, Long l12, Long l13) {
        this(str, l, l2, l3, d, d2, l4, l5, l6, l7, l8, l9, bool, l10, l11, l12, l13, ByteString.EMPTY);
    }

    public C2248921D0o(String str, Long l, Long l2, Long l3, Double d, Double d2, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Boolean bool, Long l10, Long l11, Long l12, Long l13, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.delay = l;
        this.width = l2;
        this.height = l3;
        this.video_loss_rate = d;
        this.received_kb = d2;
        this.received_frame_rate = l4;
        this.decoder_output_frame_rate = l5;
        this.render_output_frame_rate = l6;
        this.stall_count = l7;
        this.stall_duration = l8;
        this.e2e_delay = l9;
        this.is_screen = bool;
        this.stats_interval = l10;
        this.rtt = l11;
        this.frozen_rate = l12;
        this.video_index = l13;
    }
}
