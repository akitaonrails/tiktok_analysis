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

/* JADX INFO: renamed from: X.1Cnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241171Cnj extends Message<C2241171Cnj, C2241221Cno> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetErrorInfo#ADAPTER", tag = 1)
    public final C2241211Cnn error_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final Map<String, String> extra;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetQuota#ADAPTER", tag = 2)
    public final C2241191Cnl quota;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long reply_message_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean retried;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String task_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetTnS#ADAPTER", tag = 3)
    public final C2238691Cjj tns;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long update_time;
    public static final ProtoAdapter<C2241171Cnj> ADAPTER = new ProtoAdapter<C2241171Cnj>() { // from class: X.1Cnk
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241171Cnj decode(ProtoReader protoReader) {
            C2241221Cno c2241221Cno = new C2241221Cno();
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
                                            c2241221Cno.LIZLLL = C2241211Cnn.ADAPTER.decode(protoReader);
                                            break;
                                        case 2:
                                            c2241221Cno.LJ = C2241191Cnl.ADAPTER.decode(protoReader);
                                            break;
                                        case 3:
                                            c2241221Cno.LJFF = C2238691Cjj.ADAPTER.decode(protoReader);
                                            break;
                                        case 4:
                                            c2241221Cno.LJI = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 5:
                                            c2241221Cno.LJII = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 6:
                                            c2241221Cno.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 7:
                                            c2241221Cno.LJIIIZ.putAll(this.LIZ.decode(protoReader));
                                            break;
                                        case 8:
                                            c2241221Cno.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2241221Cno.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                } else {
                                    c2241221Cno.LJIILJJIL = C2241571CoN.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2241221Cno.LJIILIIL = C1CH0.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2241221Cno.LJIIL = C2243941CsC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241221Cno.LJIIJJI = C2242211CpP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241221Cno.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241171Cnj c2241171Cnj) {
            C2241171Cnj c2241171Cnj2 = c2241171Cnj;
            int iEncodedSizeWithTag = C2241211Cnn.ADAPTER.encodedSizeWithTag(1, c2241171Cnj2.error_info) + C2241191Cnl.ADAPTER.encodedSizeWithTag(2, c2241171Cnj2.quota) + C2238691Cjj.ADAPTER.encodedSizeWithTag(3, c2241171Cnj2.tns);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2241171Cnj2.reply_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, c2241171Cnj2.task_id) + protoAdapter.encodedSizeWithTag(6, c2241171Cnj2.update_time) + this.LIZ.encodedSizeWithTag(7, c2241171Cnj2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c2241171Cnj2.retried) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2241171Cnj2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2241171Cnj2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241171Cnj2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241171Cnj2.resp_base) + c2241171Cnj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241171Cnj redact(C2241171Cnj c2241171Cnj) {
            C2241221Cno c2241221CnoNewBuilder = c2241171Cnj.newBuilder();
            C2241211Cnn c2241211Cnn = c2241221CnoNewBuilder.LIZLLL;
            if (c2241211Cnn != null) {
                c2241221CnoNewBuilder.LIZLLL = C2241211Cnn.ADAPTER.redact(c2241211Cnn);
            }
            C2241191Cnl c2241191Cnl = c2241221CnoNewBuilder.LJ;
            if (c2241191Cnl != null) {
                c2241221CnoNewBuilder.LJ = C2241191Cnl.ADAPTER.redact(c2241191Cnl);
            }
            C2238691Cjj c2238691Cjj = c2241221CnoNewBuilder.LJFF;
            if (c2238691Cjj != null) {
                c2241221CnoNewBuilder.LJFF = C2238691Cjj.ADAPTER.redact(c2238691Cjj);
            }
            C2242211CpP c2242211CpP = c2241221CnoNewBuilder.LJIIJJI;
            if (c2242211CpP != null) {
                c2241221CnoNewBuilder.LJIIJJI = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2241221CnoNewBuilder.LJIIL;
            if (c2243941CsC != null) {
                c2241221CnoNewBuilder.LJIIL = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241221CnoNewBuilder.LJIILIIL;
            if (c1ch0 != null) {
                c2241221CnoNewBuilder.LJIILIIL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241221CnoNewBuilder.LJIILJJIL;
            if (c2241571CoN != null) {
                c2241221CnoNewBuilder.LJIILJJIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241221CnoNewBuilder.clearUnknownFields();
            return c2241221CnoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241171Cnj c2241171Cnj) {
            C2241171Cnj c2241171Cnj2 = c2241171Cnj;
            C2241211Cnn.ADAPTER.encodeWithTag(protoWriter, 1, c2241171Cnj2.error_info);
            C2241191Cnl.ADAPTER.encodeWithTag(protoWriter, 2, c2241171Cnj2.quota);
            C2238691Cjj.ADAPTER.encodeWithTag(protoWriter, 3, c2241171Cnj2.tns);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 4, c2241171Cnj2.reply_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c2241171Cnj2.task_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c2241171Cnj2.update_time);
            this.LIZ.encodeWithTag(protoWriter, 7, c2241171Cnj2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, c2241171Cnj2.retried);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2241171Cnj2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2241171Cnj2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241171Cnj2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241171Cnj2.resp_base);
            protoWriter.writeBytes(c2241171Cnj2.unknownFields());
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
        C2241211Cnn c2241211Cnn = this.error_info;
        int iHashCode2 = (iHashCode + (c2241211Cnn != null ? c2241211Cnn.hashCode() : 0)) * 37;
        C2241191Cnl c2241191Cnl = this.quota;
        int iHashCode3 = (iHashCode2 + (c2241191Cnl != null ? c2241191Cnl.hashCode() : 0)) * 37;
        C2238691Cjj c2238691Cjj = this.tns;
        int iHashCode4 = (iHashCode3 + (c2238691Cjj != null ? c2238691Cjj.hashCode() : 0)) * 37;
        Long l = this.reply_message_id;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.task_id;
        int iHashCode6 = (iHashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.update_time;
        int iHashCode7 = (((iHashCode6 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.extra.hashCode()) * 37;
        Boolean bool = this.retried;
        int iHashCode8 = (iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode9 = (iHashCode8 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode10 = (iHashCode9 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode11 = (iHashCode10 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode12 = iHashCode11 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public C2241221Cno newBuilder() {
        C2241221Cno c2241221Cno = new C2241221Cno();
        c2241221Cno.LIZLLL = this.error_info;
        c2241221Cno.LJ = this.quota;
        c2241221Cno.LJFF = this.tns;
        c2241221Cno.LJI = this.reply_message_id;
        c2241221Cno.LJII = this.task_id;
        c2241221Cno.LJIIIIZZ = this.update_time;
        c2241221Cno.LJIIIZ = C1516540pZE.LIZLLL("extra", this.extra);
        c2241221Cno.LJIIJ = this.retried;
        c2241221Cno.LJIIJJI = this.fallback_info;
        c2241221Cno.LJIIL = this.preview_hint;
        c2241221Cno.LJIILIIL = this.req_base;
        c2241221Cno.LJIILJJIL = this.resp_base;
        c2241221Cno.addUnknownFields(unknownFields());
        return c2241221Cno;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.error_info != null) {
            sb.append(", error_info=");
            sb.append(this.error_info);
        }
        if (this.quota != null) {
            sb.append(", quota=");
            sb.append(this.quota);
        }
        if (this.tns != null) {
            sb.append(", tns=");
            sb.append(this.tns);
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
        sb.replace(0, 2, "VisualPoetErrorCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241171Cnj)) {
            return false;
        }
        C2241171Cnj c2241171Cnj = (C2241171Cnj) obj;
        if (unknownFields().equals(c2241171Cnj.unknownFields()) && C1516540pZE.LJ(this.error_info, c2241171Cnj.error_info) && C1516540pZE.LJ(this.quota, c2241171Cnj.quota) && C1516540pZE.LJ(this.tns, c2241171Cnj.tns) && C1516540pZE.LJ(this.reply_message_id, c2241171Cnj.reply_message_id) && C1516540pZE.LJ(this.task_id, c2241171Cnj.task_id) && C1516540pZE.LJ(this.update_time, c2241171Cnj.update_time) && this.extra.equals(c2241171Cnj.extra) && C1516540pZE.LJ(this.retried, c2241171Cnj.retried) && C1516540pZE.LJ(this.fallback_info, c2241171Cnj.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2241171Cnj.preview_hint) && C1516540pZE.LJ(this.req_base, c2241171Cnj.req_base) && C1516540pZE.LJ(this.resp_base, c2241171Cnj.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241171Cnj(C2241211Cnn c2241211Cnn, C2241191Cnl c2241191Cnl, C2238691Cjj c2238691Cjj, Long l, String str, Long l2, Map<String, String> map, Boolean bool, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2241211Cnn, c2241191Cnl, c2238691Cjj, l, str, l2, map, bool, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241171Cnj(C2241211Cnn c2241211Cnn, C2241191Cnl c2241191Cnl, C2238691Cjj c2238691Cjj, Long l, String str, Long l2, Map<String, String> map, Boolean bool, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error_info = c2241211Cnn;
        this.quota = c2241191Cnl;
        this.tns = c2238691Cjj;
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
