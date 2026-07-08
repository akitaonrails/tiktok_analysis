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

/* JADX INFO: renamed from: X.0Zfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905470Zfd extends Message<C905470Zfd, C905560Zfm> {
    public static final ProtoAdapter<C905470Zfd> ADAPTER = new ProtoAdapter<C905470Zfd>() { // from class: X.0Zff
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905470Zfd decode(ProtoReader protoReader) {
            C905560Zfm c905560Zfm = new C905560Zfm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 201) {
                        switch (iNextTag) {
                            case 1:
                                c905560Zfm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c905560Zfm.LJ = C905460Zfc.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c905560Zfm.LJFF = C2226441CCc.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c905560Zfm.LJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                c905560Zfm.LJII = C905500Zfg.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c905560Zfm.LJIIIIZZ = C889080YuI.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c905560Zfm.LJIIIZ = C905540Zfk.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c905560Zfm.LJIIJ = C905440Zfa.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c905560Zfm.LJIIJJI = C1C1D.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c905560Zfm.LJIIL = C0ZGR.ADAPTER.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c905560Zfm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c905560Zfm.LJIILIIL = C1DA9.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905560Zfm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905470Zfd c905470Zfd) {
            C905470Zfd c905470Zfd2 = c905470Zfd;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c905470Zfd2.im_session_id) + C905460Zfc.ADAPTER.encodedSizeWithTag(2, c905470Zfd2.track_info) + C2226441CCc.ADAPTER.encodedSizeWithTag(3, c905470Zfd2.streak_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, c905470Zfd2.pre_entrance_type) + C905500Zfg.ADAPTER.encodedSizeWithTag(5, c905470Zfd2.b2c_info) + C889080YuI.ADAPTER.encodedSizeWithTag(6, c905470Zfd2.bot_interaction) + C905540Zfk.ADAPTER.encodedSizeWithTag(7, c905470Zfd2.message_style_info) + C905440Zfa.ADAPTER.encodedSizeWithTag(8, c905470Zfd2.reply_source_payload) + C1C1D.ADAPTER.encodedSizeWithTag(9, c905470Zfd2.bot_feedback) + C0ZGR.ADAPTER.encodedSizeWithTag(10, c905470Zfd2.feature_attachment) + C1DA9.ADAPTER.encodedSizeWithTag(201, c905470Zfd2.opera_biz_persistent_extra) + c905470Zfd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905470Zfd redact(C905470Zfd c905470Zfd) {
            C905560Zfm c905560ZfmNewBuilder = c905470Zfd.newBuilder();
            C905460Zfc c905460Zfc = c905560ZfmNewBuilder.LJ;
            if (c905460Zfc != null) {
                c905560ZfmNewBuilder.LJ = C905460Zfc.ADAPTER.redact(c905460Zfc);
            }
            C2226441CCc c2226441CCc = c905560ZfmNewBuilder.LJFF;
            if (c2226441CCc != null) {
                c905560ZfmNewBuilder.LJFF = C2226441CCc.ADAPTER.redact(c2226441CCc);
            }
            C905500Zfg c905500Zfg = c905560ZfmNewBuilder.LJII;
            if (c905500Zfg != null) {
                c905560ZfmNewBuilder.LJII = C905500Zfg.ADAPTER.redact(c905500Zfg);
            }
            C889080YuI c889080YuI = c905560ZfmNewBuilder.LJIIIIZZ;
            if (c889080YuI != null) {
                c905560ZfmNewBuilder.LJIIIIZZ = C889080YuI.ADAPTER.redact(c889080YuI);
            }
            C905540Zfk c905540Zfk = c905560ZfmNewBuilder.LJIIIZ;
            if (c905540Zfk != null) {
                c905560ZfmNewBuilder.LJIIIZ = C905540Zfk.ADAPTER.redact(c905540Zfk);
            }
            C905440Zfa c905440Zfa = c905560ZfmNewBuilder.LJIIJ;
            if (c905440Zfa != null) {
                c905560ZfmNewBuilder.LJIIJ = C905440Zfa.ADAPTER.redact(c905440Zfa);
            }
            C1C1D c1c1d = c905560ZfmNewBuilder.LJIIJJI;
            if (c1c1d != null) {
                c905560ZfmNewBuilder.LJIIJJI = C1C1D.ADAPTER.redact(c1c1d);
            }
            C0ZGR c0zgr = c905560ZfmNewBuilder.LJIIL;
            if (c0zgr != null) {
                c905560ZfmNewBuilder.LJIIL = C0ZGR.ADAPTER.redact(c0zgr);
            }
            C1DA9 c1da9 = c905560ZfmNewBuilder.LJIILIIL;
            if (c1da9 != null) {
                c905560ZfmNewBuilder.LJIILIIL = C1DA9.ADAPTER.redact(c1da9);
            }
            c905560ZfmNewBuilder.clearUnknownFields();
            return c905560ZfmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905470Zfd c905470Zfd) {
            C905470Zfd c905470Zfd2 = c905470Zfd;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c905470Zfd2.im_session_id);
            C905460Zfc.ADAPTER.encodeWithTag(protoWriter, 2, c905470Zfd2.track_info);
            C2226441CCc.ADAPTER.encodeWithTag(protoWriter, 3, c905470Zfd2.streak_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c905470Zfd2.pre_entrance_type);
            C905500Zfg.ADAPTER.encodeWithTag(protoWriter, 5, c905470Zfd2.b2c_info);
            C889080YuI.ADAPTER.encodeWithTag(protoWriter, 6, c905470Zfd2.bot_interaction);
            C905540Zfk.ADAPTER.encodeWithTag(protoWriter, 7, c905470Zfd2.message_style_info);
            C905440Zfa.ADAPTER.encodeWithTag(protoWriter, 8, c905470Zfd2.reply_source_payload);
            C1C1D.ADAPTER.encodeWithTag(protoWriter, 9, c905470Zfd2.bot_feedback);
            C0ZGR.ADAPTER.encodeWithTag(protoWriter, 10, c905470Zfd2.feature_attachment);
            C1DA9.ADAPTER.encodeWithTag(protoWriter, 201, c905470Zfd2.opera_biz_persistent_extra);
            protoWriter.writeBytes(c905470Zfd2.unknownFields());
        }
    };
    public static final Long DEFAULT_PRE_ENTRANCE_TYPE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.B2CPersistentInfo#ADAPTER", tag = 5)
    public final C905500Zfg b2c_info;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.BotFeedback#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C1C1D bot_feedback;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.BotInteraction#ADAPTER", tag = 6)
    public final C889080YuI bot_interaction;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.FeatureAttachment#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C0ZGR feature_attachment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String im_session_id;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.MessageStyleInfo#ADAPTER", tag = 7)
    public final C905540Zfk message_style_info;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.OperaBizPersistentExtra#ADAPTER", tag = 201)
    public final C1DA9 opera_biz_persistent_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long pre_entrance_type;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.ReplySourcePayload#ADAPTER", tag = 8)
    public final C905440Zfa reply_source_payload;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.StreakInfo#ADAPTER", tag = 3)
    public final C2226441CCc streak_info;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.TrackInfo#ADAPTER", tag = 2)
    public final C905460Zfc track_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.im_session_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C905460Zfc c905460Zfc = this.track_info;
        int iHashCode3 = (iHashCode2 + (c905460Zfc != null ? c905460Zfc.hashCode() : 0)) * 37;
        C2226441CCc c2226441CCc = this.streak_info;
        int iHashCode4 = (iHashCode3 + (c2226441CCc != null ? c2226441CCc.hashCode() : 0)) * 37;
        Long l = this.pre_entrance_type;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        C905500Zfg c905500Zfg = this.b2c_info;
        int iHashCode6 = (iHashCode5 + (c905500Zfg != null ? c905500Zfg.hashCode() : 0)) * 37;
        C889080YuI c889080YuI = this.bot_interaction;
        int iHashCode7 = (iHashCode6 + (c889080YuI != null ? c889080YuI.hashCode() : 0)) * 37;
        C905540Zfk c905540Zfk = this.message_style_info;
        int iHashCode8 = (iHashCode7 + (c905540Zfk != null ? c905540Zfk.hashCode() : 0)) * 37;
        C905440Zfa c905440Zfa = this.reply_source_payload;
        int iHashCode9 = (iHashCode8 + (c905440Zfa != null ? c905440Zfa.hashCode() : 0)) * 37;
        C1C1D c1c1d = this.bot_feedback;
        int iHashCode10 = (iHashCode9 + (c1c1d != null ? c1c1d.hashCode() : 0)) * 37;
        C0ZGR c0zgr = this.feature_attachment;
        int iHashCode11 = (iHashCode10 + (c0zgr != null ? c0zgr.hashCode() : 0)) * 37;
        C1DA9 c1da9 = this.opera_biz_persistent_extra;
        int iHashCode12 = iHashCode11 + (c1da9 != null ? c1da9.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public C905560Zfm newBuilder() {
        C905560Zfm c905560Zfm = new C905560Zfm();
        c905560Zfm.LIZLLL = this.im_session_id;
        c905560Zfm.LJ = this.track_info;
        c905560Zfm.LJFF = this.streak_info;
        c905560Zfm.LJI = this.pre_entrance_type;
        c905560Zfm.LJII = this.b2c_info;
        c905560Zfm.LJIIIIZZ = this.bot_interaction;
        c905560Zfm.LJIIIZ = this.message_style_info;
        c905560Zfm.LJIIJ = this.reply_source_payload;
        c905560Zfm.LJIIJJI = this.bot_feedback;
        c905560Zfm.LJIIL = this.feature_attachment;
        c905560Zfm.LJIILIIL = this.opera_biz_persistent_extra;
        c905560Zfm.addUnknownFields(unknownFields());
        return c905560Zfm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.im_session_id != null) {
            sb.append(", im_session_id=");
            sb.append(this.im_session_id);
        }
        if (this.track_info != null) {
            sb.append(", track_info=");
            sb.append(this.track_info);
        }
        if (this.streak_info != null) {
            sb.append(", streak_info=");
            sb.append(this.streak_info);
        }
        if (this.pre_entrance_type != null) {
            sb.append(", pre_entrance_type=");
            sb.append(this.pre_entrance_type);
        }
        if (this.b2c_info != null) {
            sb.append(", b2c_info=");
            sb.append(this.b2c_info);
        }
        if (this.bot_interaction != null) {
            sb.append(", bot_interaction=");
            sb.append(this.bot_interaction);
        }
        if (this.message_style_info != null) {
            sb.append(", message_style_info=");
            sb.append(this.message_style_info);
        }
        if (this.reply_source_payload != null) {
            sb.append(", reply_source_payload=");
            sb.append(this.reply_source_payload);
        }
        if (this.bot_feedback != null) {
            sb.append(", bot_feedback=");
            sb.append(this.bot_feedback);
        }
        if (this.feature_attachment != null) {
            sb.append(", feature_attachment=");
            sb.append(this.feature_attachment);
        }
        if (this.opera_biz_persistent_extra != null) {
            sb.append(", opera_biz_persistent_extra=");
            sb.append(this.opera_biz_persistent_extra);
        }
        sb.replace(0, 2, "PersistentExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905470Zfd)) {
            return false;
        }
        C905470Zfd c905470Zfd = (C905470Zfd) obj;
        if (unknownFields().equals(c905470Zfd.unknownFields()) && C1516540pZE.LJ(this.im_session_id, c905470Zfd.im_session_id) && C1516540pZE.LJ(this.track_info, c905470Zfd.track_info) && C1516540pZE.LJ(this.streak_info, c905470Zfd.streak_info) && C1516540pZE.LJ(this.pre_entrance_type, c905470Zfd.pre_entrance_type) && C1516540pZE.LJ(this.b2c_info, c905470Zfd.b2c_info) && C1516540pZE.LJ(this.bot_interaction, c905470Zfd.bot_interaction) && C1516540pZE.LJ(this.message_style_info, c905470Zfd.message_style_info) && C1516540pZE.LJ(this.reply_source_payload, c905470Zfd.reply_source_payload) && C1516540pZE.LJ(this.bot_feedback, c905470Zfd.bot_feedback) && C1516540pZE.LJ(this.feature_attachment, c905470Zfd.feature_attachment) && C1516540pZE.LJ(this.opera_biz_persistent_extra, c905470Zfd.opera_biz_persistent_extra)) {
            return true;
        }
        return false;
    }

    public C905470Zfd(String str, C905460Zfc c905460Zfc, C2226441CCc c2226441CCc, Long l, C905500Zfg c905500Zfg, C889080YuI c889080YuI, C905540Zfk c905540Zfk, C905440Zfa c905440Zfa, C1C1D c1c1d, C0ZGR c0zgr, C1DA9 c1da9) {
        this(str, c905460Zfc, c2226441CCc, l, c905500Zfg, c889080YuI, c905540Zfk, c905440Zfa, c1c1d, c0zgr, c1da9, ByteString.EMPTY);
    }

    public C905470Zfd(String str, C905460Zfc c905460Zfc, C2226441CCc c2226441CCc, Long l, C905500Zfg c905500Zfg, C889080YuI c889080YuI, C905540Zfk c905540Zfk, C905440Zfa c905440Zfa, C1C1D c1c1d, C0ZGR c0zgr, C1DA9 c1da9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.im_session_id = str;
        this.track_info = c905460Zfc;
        this.streak_info = c2226441CCc;
        this.pre_entrance_type = l;
        this.b2c_info = c905500Zfg;
        this.bot_interaction = c889080YuI;
        this.message_style_info = c905540Zfk;
        this.reply_source_payload = c905440Zfa;
        this.bot_feedback = c1c1d;
        this.feature_attachment = c0zgr;
        this.opera_biz_persistent_extra = c1da9;
    }
}
