package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241271Cnt extends Message<C2241271Cnt, C2241261Cns> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetBotPicture#ADAPTER", tag = 2)
    public final C2241301Cnw bot_picture;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetBotText#ADAPTER", tag = 1)
    public final C2240711Cmz bot_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final Map<String, String> extra;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long reply_message_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean retried;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String task_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long update_time;
    public static final ProtoAdapter<C2241271Cnt> ADAPTER = new ProtoAdapter<C2241271Cnt>() { // from class: X.1Cnv
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241271Cnt decode(ProtoReader protoReader) {
            C2241261Cns c2241261Cns = new C2241261Cns();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 10) {
                        if (iNextTag != 11) {
                            if (iNextTag != 200) {
                                if (iNextTag != 201) {
                                    switch (iNextTag) {
                                        case 1:
                                            c2241261Cns.LIZLLL = C2240711Cmz.ADAPTER.decode(protoReader);
                                            break;
                                        case 2:
                                            c2241261Cns.LJ = C2241301Cnw.ADAPTER.decode(protoReader);
                                            break;
                                        case 3:
                                            c2241261Cns.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 4:
                                            c2241261Cns.LJI = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 5:
                                            c2241261Cns.LJII = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 6:
                                            c2241261Cns.LJIIIIZZ.putAll(this.LIZ.decode(protoReader));
                                            break;
                                        case 7:
                                            c2241261Cns.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2241261Cns.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                } else {
                                    c2241261Cns.LJIILIIL = C2241571CoN.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2241261Cns.LJIIL = C1CH0.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2241261Cns.LJIIJJI = C2243941CsC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241261Cns.LJIIJ = C2242211CpP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241261Cns.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241271Cnt c2241271Cnt) {
            C2241271Cnt c2241271Cnt2 = c2241271Cnt;
            int iEncodedSizeWithTag = C2240711Cmz.ADAPTER.encodedSizeWithTag(1, c2241271Cnt2.bot_text) + C2241301Cnw.ADAPTER.encodedSizeWithTag(2, c2241271Cnt2.bot_picture);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2241271Cnt2.reply_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, c2241271Cnt2.task_id) + protoAdapter.encodedSizeWithTag(5, c2241271Cnt2.update_time) + this.LIZ.encodedSizeWithTag(6, c2241271Cnt2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c2241271Cnt2.retried) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2241271Cnt2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2241271Cnt2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241271Cnt2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241271Cnt2.resp_base) + c2241271Cnt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241271Cnt redact(C2241271Cnt c2241271Cnt) {
            C2241261Cns c2241261CnsNewBuilder = c2241271Cnt.newBuilder();
            C2240711Cmz c2240711Cmz = c2241261CnsNewBuilder.LIZLLL;
            if (c2240711Cmz != null) {
                c2241261CnsNewBuilder.LIZLLL = C2240711Cmz.ADAPTER.redact(c2240711Cmz);
            }
            C2241301Cnw c2241301Cnw = c2241261CnsNewBuilder.LJ;
            if (c2241301Cnw != null) {
                c2241261CnsNewBuilder.LJ = C2241301Cnw.ADAPTER.redact(c2241301Cnw);
            }
            C2242211CpP c2242211CpP = c2241261CnsNewBuilder.LJIIJ;
            if (c2242211CpP != null) {
                c2241261CnsNewBuilder.LJIIJ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2241261CnsNewBuilder.LJIIJJI;
            if (c2243941CsC != null) {
                c2241261CnsNewBuilder.LJIIJJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241261CnsNewBuilder.LJIIL;
            if (c1ch0 != null) {
                c2241261CnsNewBuilder.LJIIL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241261CnsNewBuilder.LJIILIIL;
            if (c2241571CoN != null) {
                c2241261CnsNewBuilder.LJIILIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241261CnsNewBuilder.clearUnknownFields();
            return c2241261CnsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241271Cnt c2241271Cnt) {
            C2241271Cnt c2241271Cnt2 = c2241271Cnt;
            C2240711Cmz.ADAPTER.encodeWithTag(protoWriter, 1, c2241271Cnt2.bot_text);
            C2241301Cnw.ADAPTER.encodeWithTag(protoWriter, 2, c2241271Cnt2.bot_picture);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c2241271Cnt2.reply_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c2241271Cnt2.task_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c2241271Cnt2.update_time);
            this.LIZ.encodeWithTag(protoWriter, 6, c2241271Cnt2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c2241271Cnt2.retried);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2241271Cnt2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2241271Cnt2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241271Cnt2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241271Cnt2.resp_base);
            protoWriter.writeBytes(c2241271Cnt2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPLY_MESSAGE_ID = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Boolean DEFAULT_RETRIED = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2240711Cmz c2240711Cmz = this.bot_text;
        int iHashCode2 = (iHashCode + (c2240711Cmz != null ? c2240711Cmz.hashCode() : 0)) * 37;
        C2241301Cnw c2241301Cnw = this.bot_picture;
        int iHashCode3 = (iHashCode2 + (c2241301Cnw != null ? c2241301Cnw.hashCode() : 0)) * 37;
        Long l = this.reply_message_id;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.task_id;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.update_time;
        int iHashCode6 = (((iHashCode5 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.extra.hashCode()) * 37;
        Boolean bool = this.retried;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode8 = (iHashCode7 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode9 = (iHashCode8 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode10 = (iHashCode9 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode11 = iHashCode10 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public C2241261Cns newBuilder() {
        C2241261Cns c2241261Cns = new C2241261Cns();
        c2241261Cns.LIZLLL = this.bot_text;
        c2241261Cns.LJ = this.bot_picture;
        c2241261Cns.LJFF = this.reply_message_id;
        c2241261Cns.LJI = this.task_id;
        c2241261Cns.LJII = this.update_time;
        c2241261Cns.LJIIIIZZ = C1516540pZE.LIZLLL("extra", this.extra);
        c2241261Cns.LJIIIZ = this.retried;
        c2241261Cns.LJIIJ = this.fallback_info;
        c2241261Cns.LJIIJJI = this.preview_hint;
        c2241261Cns.LJIIL = this.req_base;
        c2241261Cns.LJIILIIL = this.resp_base;
        c2241261Cns.addUnknownFields(unknownFields());
        return c2241261Cns;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bot_text != null) {
            sb.append(", bot_text=");
            sb.append(this.bot_text);
        }
        if (this.bot_picture != null) {
            sb.append(", bot_picture=");
            sb.append(this.bot_picture);
        }
        if (this.reply_message_id != null) {
            sb.append(", reply_message_id=");
            sb.append(this.reply_message_id);
        }
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.retried != null) {
            sb.append(", retried=");
            sb.append(this.retried);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "VisualPoetBotCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241271Cnt)) {
            return false;
        }
        C2241271Cnt c2241271Cnt = (C2241271Cnt) obj;
        if (unknownFields().equals(c2241271Cnt.unknownFields()) && C1516540pZE.LJ(this.bot_text, c2241271Cnt.bot_text) && C1516540pZE.LJ(this.bot_picture, c2241271Cnt.bot_picture) && C1516540pZE.LJ(this.reply_message_id, c2241271Cnt.reply_message_id) && C1516540pZE.LJ(this.task_id, c2241271Cnt.task_id) && C1516540pZE.LJ(this.update_time, c2241271Cnt.update_time) && this.extra.equals(c2241271Cnt.extra) && C1516540pZE.LJ(this.retried, c2241271Cnt.retried) && C1516540pZE.LJ(this.fallback_info, c2241271Cnt.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2241271Cnt.preview_hint) && C1516540pZE.LJ(this.req_base, c2241271Cnt.req_base) && C1516540pZE.LJ(this.resp_base, c2241271Cnt.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241271Cnt(C2240711Cmz c2240711Cmz, C2241301Cnw c2241301Cnw, Long l, String str, Long l2, Map<String, String> map, Boolean bool, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2240711Cmz, c2241301Cnw, l, str, l2, map, bool, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241271Cnt(C2240711Cmz c2240711Cmz, C2241301Cnw c2241301Cnw, Long l, String str, Long l2, Map<String, String> map, Boolean bool, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bot_text = c2240711Cmz;
        this.bot_picture = c2241301Cnw;
        this.reply_message_id = l;
        this.task_id = str;
        this.update_time = l2;
        this.extra = C1516540pZE.LJI("extra", map);
        this.retried = bool;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
