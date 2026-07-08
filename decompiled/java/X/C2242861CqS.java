package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242861CqS extends Message<C2242861CqS, C2242911CqX> {
    public static final ProtoAdapter<C2242861CqS> ADAPTER = new ProtoAdapter<C2242861CqS>() { // from class: X.1CqT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242861CqS decode(ProtoReader protoReader) {
            C2242911CqX c2242911CqX = new C2242911CqX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 10) {
                                            if (iNextTag != 200) {
                                                if (iNextTag != 201) {
                                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                    c2242911CqX.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                } else {
                                                    c2242911CqX.LJIIJ = C2241571CoN.ADAPTER.decode(protoReader);
                                                }
                                            } else {
                                                c2242911CqX.LJIIIZ = C1CH0.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2242911CqX.LJIIIIZZ = C2242771CqJ.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        try {
                                            c2242911CqX.LJII = EnumC2242921CqY.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c2242911CqX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    c2242911CqX.LJI.add(C2243521CrW.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2242911CqX.LJFF = C2242541Cpw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2242911CqX.LJ = C2243941CsC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242911CqX.LIZLLL = C2242891CqV.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242911CqX.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242861CqS c2242861CqS) {
            C2242861CqS c2242861CqS2 = c2242861CqS;
            return C2242891CqV.ADAPTER.encodedSizeWithTag(1, c2242861CqS2.comment) + C2243941CsC.ADAPTER.encodedSizeWithTag(2, c2242861CqS2.preview_hint) + C2242541Cpw.ADAPTER.encodedSizeWithTag(3, c2242861CqS2.user_info) + C2243521CrW.ADAPTER.asRepeated().encodedSizeWithTag(4, c2242861CqS2.mention_username) + EnumC2242921CqY.ADAPTER.encodedSizeWithTag(5, c2242861CqS2.fallback) + C2242771CqJ.ADAPTER.encodedSizeWithTag(10, c2242861CqS2.attachment) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242861CqS2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242861CqS2.resp_base) + c2242861CqS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242861CqS redact(C2242861CqS c2242861CqS) {
            C2242911CqX c2242911CqXNewBuilder = c2242861CqS.newBuilder();
            C2242891CqV c2242891CqV = c2242911CqXNewBuilder.LIZLLL;
            if (c2242891CqV != null) {
                c2242911CqXNewBuilder.LIZLLL = C2242891CqV.ADAPTER.redact(c2242891CqV);
            }
            C2243941CsC c2243941CsC = c2242911CqXNewBuilder.LJ;
            if (c2243941CsC != null) {
                c2242911CqXNewBuilder.LJ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2242541Cpw c2242541Cpw = c2242911CqXNewBuilder.LJFF;
            if (c2242541Cpw != null) {
                c2242911CqXNewBuilder.LJFF = C2242541Cpw.ADAPTER.redact(c2242541Cpw);
            }
            C1516540pZE.LJIIIZ(c2242911CqXNewBuilder.LJI, C2243521CrW.ADAPTER);
            C2242771CqJ c2242771CqJ = c2242911CqXNewBuilder.LJIIIIZZ;
            if (c2242771CqJ != null) {
                c2242911CqXNewBuilder.LJIIIIZZ = C2242771CqJ.ADAPTER.redact(c2242771CqJ);
            }
            C1CH0 c1ch0 = c2242911CqXNewBuilder.LJIIIZ;
            if (c1ch0 != null) {
                c2242911CqXNewBuilder.LJIIIZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242911CqXNewBuilder.LJIIJ;
            if (c2241571CoN != null) {
                c2242911CqXNewBuilder.LJIIJ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242911CqXNewBuilder.clearUnknownFields();
            return c2242911CqXNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242861CqS c2242861CqS) {
            C2242861CqS c2242861CqS2 = c2242861CqS;
            C2242891CqV.ADAPTER.encodeWithTag(protoWriter, 1, c2242861CqS2.comment);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 2, c2242861CqS2.preview_hint);
            C2242541Cpw.ADAPTER.encodeWithTag(protoWriter, 3, c2242861CqS2.user_info);
            C2243521CrW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2242861CqS2.mention_username);
            EnumC2242921CqY.ADAPTER.encodeWithTag(protoWriter, 5, c2242861CqS2.fallback);
            C2242771CqJ.ADAPTER.encodeWithTag(protoWriter, 10, c2242861CqS2.attachment);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242861CqS2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242861CqS2.resp_base);
            protoWriter.writeBytes(c2242861CqS2.unknownFields());
        }
    };
    public static final EnumC2242921CqY DEFAULT_FALLBACK = EnumC2242921CqY.STATUS_COMMENT_VISIBLE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Attachment#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242771CqJ attachment;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseShareComment#ADAPTER", tag = 1)
    public final C2242891CqV comment;

    @WireField(adapter = "com.bytedance.im.message.template.proto.CommentFallbackStatus#ADAPTER", tag = 5)
    public final EnumC2242921CqY fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C2243521CrW> mention_username;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 3)
    public final C2242541Cpw user_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2242891CqV c2242891CqV = this.comment;
        int iHashCode2 = (iHashCode + (c2242891CqV != null ? c2242891CqV.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2242541Cpw c2242541Cpw = this.user_info;
        int iHashCode4 = (((iHashCode3 + (c2242541Cpw != null ? c2242541Cpw.hashCode() : 0)) * 37) + this.mention_username.hashCode()) * 37;
        EnumC2242921CqY enumC2242921CqY = this.fallback;
        int iHashCode5 = (iHashCode4 + (enumC2242921CqY != null ? enumC2242921CqY.hashCode() : 0)) * 37;
        C2242771CqJ c2242771CqJ = this.attachment;
        int iHashCode6 = (iHashCode5 + (c2242771CqJ != null ? c2242771CqJ.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode7 = (iHashCode6 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode8 = iHashCode7 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2242911CqX newBuilder() {
        C2242911CqX c2242911CqX = new C2242911CqX();
        c2242911CqX.LIZLLL = this.comment;
        c2242911CqX.LJ = this.preview_hint;
        c2242911CqX.LJFF = this.user_info;
        c2242911CqX.LJI = C1516540pZE.LIZJ("mention_username", this.mention_username);
        c2242911CqX.LJII = this.fallback;
        c2242911CqX.LJIIIIZZ = this.attachment;
        c2242911CqX.LJIIIZ = this.req_base;
        c2242911CqX.LJIIJ = this.resp_base;
        c2242911CqX.addUnknownFields(unknownFields());
        return c2242911CqX;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (!this.mention_username.isEmpty()) {
            sb.append(", mention_username=");
            sb.append(this.mention_username);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.attachment != null) {
            sb.append(", attachment=");
            sb.append(this.attachment);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "ShareCommentCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242861CqS)) {
            return false;
        }
        C2242861CqS c2242861CqS = (C2242861CqS) obj;
        if (unknownFields().equals(c2242861CqS.unknownFields()) && C1516540pZE.LJ(this.comment, c2242861CqS.comment) && C1516540pZE.LJ(this.preview_hint, c2242861CqS.preview_hint) && C1516540pZE.LJ(this.user_info, c2242861CqS.user_info) && this.mention_username.equals(c2242861CqS.mention_username) && C1516540pZE.LJ(this.fallback, c2242861CqS.fallback) && C1516540pZE.LJ(this.attachment, c2242861CqS.attachment) && C1516540pZE.LJ(this.req_base, c2242861CqS.req_base) && C1516540pZE.LJ(this.resp_base, c2242861CqS.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242861CqS(C2242891CqV c2242891CqV, C2243941CsC c2243941CsC, C2242541Cpw c2242541Cpw, List<C2243521CrW> list, EnumC2242921CqY enumC2242921CqY, C2242771CqJ c2242771CqJ, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2242891CqV, c2243941CsC, c2242541Cpw, list, enumC2242921CqY, c2242771CqJ, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242861CqS(C2242891CqV c2242891CqV, C2243941CsC c2243941CsC, C2242541Cpw c2242541Cpw, List<C2243521CrW> list, EnumC2242921CqY enumC2242921CqY, C2242771CqJ c2242771CqJ, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = c2242891CqV;
        this.preview_hint = c2243941CsC;
        this.user_info = c2242541Cpw;
        this.mention_username = C1516540pZE.LJFF("mention_username", list);
        this.fallback = enumC2242921CqY;
        this.attachment = c2242771CqJ;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
