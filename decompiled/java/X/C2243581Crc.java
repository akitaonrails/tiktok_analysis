package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Crc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243581Crc extends Message<C2243581Crc, C2243661Crk> {
    public static final ProtoAdapter<C2243581Crc> ADAPTER = new ProtoAdapter<C2243581Crc>() { // from class: X.1Crd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243581Crc decode(ProtoReader protoReader) {
            C2243661Crk c2243661Crk = new C2243661Crk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 200) {
                                        if (iNextTag != 201) {
                                            switch (iNextTag) {
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    c2243661Crk.LJII = C2242771CqJ.ADAPTER.decode(protoReader);
                                                    break;
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    c2243661Crk.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    try {
                                                        c2243661Crk.LJIIIZ = C0IBD.ADAPTER.decode(protoReader);
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        c2243661Crk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                                    }
                                                    break;
                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                    c2243661Crk.LJIIJ = C2243651Crj.ADAPTER.decode(protoReader);
                                                    break;
                                                case 14:
                                                    c2243661Crk.LJIIJJI = C2243601Cre.ADAPTER.decode(protoReader);
                                                    break;
                                                case 15:
                                                    try {
                                                        c2243661Crk.LJIIL = EnumC2243761Cru.ADAPTER.decode(protoReader);
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                                        TryCatchGuardChecker.doCheck(e2);
                                                        c2243661Crk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                                    }
                                                    break;
                                                case 16:
                                                    try {
                                                        c2243661Crk.LJIILIIL.add(EnumC19365810pc.ADAPTER.decode(protoReader));
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                                        TryCatchGuardChecker.doCheck(e3);
                                                        c2243661Crk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                                    }
                                                    break;
                                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                    c2243661Crk.LJIILJJIL = C2228461CJw.ADAPTER.decode(protoReader);
                                                    break;
                                                default:
                                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                    c2243661Crk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                    break;
                                            }
                                        } else {
                                            c2243661Crk.LJIILLIIL = C2241571CoN.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2243661Crk.LJIILL = C1CH0.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2243661Crk.LJI = C2243641Cri.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2243661Crk.LJFF = C2243691Crn.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243661Crk.LJ = C2243941CsC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243661Crk.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243661Crk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243581Crc c2243581Crc) {
            C2243581Crc c2243581Crc2 = c2243581Crc;
            return C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2243581Crc2.sticker) + C2243941CsC.ADAPTER.encodedSizeWithTag(2, c2243581Crc2.preview_hint) + C2243691Crn.ADAPTER.encodedSizeWithTag(3, c2243581Crc2.fallback) + C2243641Cri.ADAPTER.encodedSizeWithTag(4, c2243581Crc2.sticker_creator_user_info) + C2242771CqJ.ADAPTER.encodedSizeWithTag(10, c2243581Crc2.attachment) + ProtoAdapter.STRING.encodedSizeWithTag(11, c2243581Crc2.sticker_biz_type) + C0IBD.ADAPTER.encodedSizeWithTag(12, c2243581Crc2.sticker_scene) + C2243651Crj.ADAPTER.encodedSizeWithTag(13, c2243581Crc2.avatar_duo) + C2243601Cre.ADAPTER.encodedSizeWithTag(14, c2243581Crc2.imagine_studio) + EnumC2243761Cru.ADAPTER.encodedSizeWithTag(15, c2243581Crc2.sticker_variant) + EnumC19365810pc.ADAPTER.asRepeated().encodedSizeWithTag(16, c2243581Crc2.block_actions) + C2228461CJw.ADAPTER.encodedSizeWithTag(17, c2243581Crc2.tenor_info) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2243581Crc2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2243581Crc2.resp_base) + c2243581Crc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243581Crc redact(C2243581Crc c2243581Crc) {
            C2243661Crk c2243661CrkNewBuilder = c2243581Crc.newBuilder();
            C2244091CsR c2244091CsR = c2243661CrkNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2243661CrkNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2243941CsC c2243941CsC = c2243661CrkNewBuilder.LJ;
            if (c2243941CsC != null) {
                c2243661CrkNewBuilder.LJ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2243691Crn c2243691Crn = c2243661CrkNewBuilder.LJFF;
            if (c2243691Crn != null) {
                c2243661CrkNewBuilder.LJFF = C2243691Crn.ADAPTER.redact(c2243691Crn);
            }
            C2243641Cri c2243641Cri = c2243661CrkNewBuilder.LJI;
            if (c2243641Cri != null) {
                c2243661CrkNewBuilder.LJI = C2243641Cri.ADAPTER.redact(c2243641Cri);
            }
            C2242771CqJ c2242771CqJ = c2243661CrkNewBuilder.LJII;
            if (c2242771CqJ != null) {
                c2243661CrkNewBuilder.LJII = C2242771CqJ.ADAPTER.redact(c2242771CqJ);
            }
            C2243651Crj c2243651Crj = c2243661CrkNewBuilder.LJIIJ;
            if (c2243651Crj != null) {
                c2243661CrkNewBuilder.LJIIJ = C2243651Crj.ADAPTER.redact(c2243651Crj);
            }
            C2243601Cre c2243601Cre = c2243661CrkNewBuilder.LJIIJJI;
            if (c2243601Cre != null) {
                c2243661CrkNewBuilder.LJIIJJI = C2243601Cre.ADAPTER.redact(c2243601Cre);
            }
            C2228461CJw c2228461CJw = c2243661CrkNewBuilder.LJIILJJIL;
            if (c2228461CJw != null) {
                c2243661CrkNewBuilder.LJIILJJIL = C2228461CJw.ADAPTER.redact(c2228461CJw);
            }
            C1CH0 c1ch0 = c2243661CrkNewBuilder.LJIILL;
            if (c1ch0 != null) {
                c2243661CrkNewBuilder.LJIILL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243661CrkNewBuilder.LJIILLIIL;
            if (c2241571CoN != null) {
                c2243661CrkNewBuilder.LJIILLIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243661CrkNewBuilder.clearUnknownFields();
            return c2243661CrkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243581Crc c2243581Crc) {
            C2243581Crc c2243581Crc2 = c2243581Crc;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2243581Crc2.sticker);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 2, c2243581Crc2.preview_hint);
            C2243691Crn.ADAPTER.encodeWithTag(protoWriter, 3, c2243581Crc2.fallback);
            C2243641Cri.ADAPTER.encodeWithTag(protoWriter, 4, c2243581Crc2.sticker_creator_user_info);
            C2242771CqJ.ADAPTER.encodeWithTag(protoWriter, 10, c2243581Crc2.attachment);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, c2243581Crc2.sticker_biz_type);
            C0IBD.ADAPTER.encodeWithTag(protoWriter, 12, c2243581Crc2.sticker_scene);
            C2243651Crj.ADAPTER.encodeWithTag(protoWriter, 13, c2243581Crc2.avatar_duo);
            C2243601Cre.ADAPTER.encodeWithTag(protoWriter, 14, c2243581Crc2.imagine_studio);
            EnumC2243761Cru.ADAPTER.encodeWithTag(protoWriter, 15, c2243581Crc2.sticker_variant);
            EnumC19365810pc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, c2243581Crc2.block_actions);
            C2228461CJw.ADAPTER.encodeWithTag(protoWriter, 17, c2243581Crc2.tenor_info);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2243581Crc2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2243581Crc2.resp_base);
            protoWriter.writeBytes(c2243581Crc2.unknownFields());
        }
    };
    public static final C0IBD DEFAULT_STICKER_SCENE = C0IBD.StickerCreateScene_Unknown;
    public static final EnumC2243761Cru DEFAULT_STICKER_VARIANT = EnumC2243761Cru.StickerVariant_Unknown;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Attachment#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242771CqJ attachment;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AvatarDuoInfo#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C2243651Crj avatar_duo;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerBlockedActionEnum#ADAPTER", label = WireField.Label.REPEATED, tag = 16)
    public final List<EnumC19365810pc> block_actions;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCardFallbackInfo#ADAPTER", tag = 3)
    public final C2243691Crn fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImagineStudioInfo#ADAPTER", tag = 14)
    public final C2243601Cre imagine_studio;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR sticker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    public final String sticker_biz_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UserInfo#ADAPTER", tag = 4)
    public final C2243641Cri sticker_creator_user_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCreateSceneEnum#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C0IBD sticker_scene;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerVariant#ADAPTER", tag = 15)
    public final EnumC2243761Cru sticker_variant;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TenorInfo#ADAPTER", tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C2228461CJw tenor_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.sticker;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2243691Crn c2243691Crn = this.fallback;
        int iHashCode4 = (iHashCode3 + (c2243691Crn != null ? c2243691Crn.hashCode() : 0)) * 37;
        C2243641Cri c2243641Cri = this.sticker_creator_user_info;
        int iHashCode5 = (iHashCode4 + (c2243641Cri != null ? c2243641Cri.hashCode() : 0)) * 37;
        C2242771CqJ c2242771CqJ = this.attachment;
        int iHashCode6 = (iHashCode5 + (c2242771CqJ != null ? c2242771CqJ.hashCode() : 0)) * 37;
        String str = this.sticker_biz_type;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        C0IBD c0ibd = this.sticker_scene;
        int iHashCode8 = (iHashCode7 + (c0ibd != null ? c0ibd.hashCode() : 0)) * 37;
        C2243651Crj c2243651Crj = this.avatar_duo;
        int iHashCode9 = (iHashCode8 + (c2243651Crj != null ? c2243651Crj.hashCode() : 0)) * 37;
        C2243601Cre c2243601Cre = this.imagine_studio;
        int iHashCode10 = (iHashCode9 + (c2243601Cre != null ? c2243601Cre.hashCode() : 0)) * 37;
        EnumC2243761Cru enumC2243761Cru = this.sticker_variant;
        int iHashCode11 = (((iHashCode10 + (enumC2243761Cru != null ? enumC2243761Cru.hashCode() : 0)) * 37) + this.block_actions.hashCode()) * 37;
        C2228461CJw c2228461CJw = this.tenor_info;
        int iHashCode12 = (iHashCode11 + (c2228461CJw != null ? c2228461CJw.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode13 = (iHashCode12 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode14 = iHashCode13 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public C2243661Crk newBuilder() {
        C2243661Crk c2243661Crk = new C2243661Crk();
        c2243661Crk.LIZLLL = this.sticker;
        c2243661Crk.LJ = this.preview_hint;
        c2243661Crk.LJFF = this.fallback;
        c2243661Crk.LJI = this.sticker_creator_user_info;
        c2243661Crk.LJII = this.attachment;
        c2243661Crk.LJIIIIZZ = this.sticker_biz_type;
        c2243661Crk.LJIIIZ = this.sticker_scene;
        c2243661Crk.LJIIJ = this.avatar_duo;
        c2243661Crk.LJIIJJI = this.imagine_studio;
        c2243661Crk.LJIIL = this.sticker_variant;
        c2243661Crk.LJIILIIL = C1516540pZE.LIZJ("block_actions", this.block_actions);
        c2243661Crk.LJIILJJIL = this.tenor_info;
        c2243661Crk.LJIILL = this.req_base;
        c2243661Crk.LJIILLIIL = this.resp_base;
        c2243661Crk.addUnknownFields(unknownFields());
        return c2243661Crk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sticker != null) {
            sb.append(", sticker=");
            sb.append(this.sticker);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.sticker_creator_user_info != null) {
            sb.append(", sticker_creator_user_info=");
            sb.append(this.sticker_creator_user_info);
        }
        if (this.attachment != null) {
            sb.append(", attachment=");
            sb.append(this.attachment);
        }
        if (this.sticker_biz_type != null) {
            sb.append(", sticker_biz_type=");
            sb.append(this.sticker_biz_type);
        }
        if (this.sticker_scene != null) {
            sb.append(", sticker_scene=");
            sb.append(this.sticker_scene);
        }
        if (this.avatar_duo != null) {
            sb.append(", avatar_duo=");
            sb.append(this.avatar_duo);
        }
        if (this.imagine_studio != null) {
            sb.append(", imagine_studio=");
            sb.append(this.imagine_studio);
        }
        if (this.sticker_variant != null) {
            sb.append(", sticker_variant=");
            sb.append(this.sticker_variant);
        }
        if (!this.block_actions.isEmpty()) {
            sb.append(", block_actions=");
            sb.append(this.block_actions);
        }
        if (this.tenor_info != null) {
            sb.append(", tenor_info=");
            sb.append(this.tenor_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "StickerCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243581Crc)) {
            return false;
        }
        C2243581Crc c2243581Crc = (C2243581Crc) obj;
        if (unknownFields().equals(c2243581Crc.unknownFields()) && C1516540pZE.LJ(this.sticker, c2243581Crc.sticker) && C1516540pZE.LJ(this.preview_hint, c2243581Crc.preview_hint) && C1516540pZE.LJ(this.fallback, c2243581Crc.fallback) && C1516540pZE.LJ(this.sticker_creator_user_info, c2243581Crc.sticker_creator_user_info) && C1516540pZE.LJ(this.attachment, c2243581Crc.attachment) && C1516540pZE.LJ(this.sticker_biz_type, c2243581Crc.sticker_biz_type) && C1516540pZE.LJ(this.sticker_scene, c2243581Crc.sticker_scene) && C1516540pZE.LJ(this.avatar_duo, c2243581Crc.avatar_duo) && C1516540pZE.LJ(this.imagine_studio, c2243581Crc.imagine_studio) && C1516540pZE.LJ(this.sticker_variant, c2243581Crc.sticker_variant) && this.block_actions.equals(c2243581Crc.block_actions) && C1516540pZE.LJ(this.tenor_info, c2243581Crc.tenor_info) && C1516540pZE.LJ(this.req_base, c2243581Crc.req_base) && C1516540pZE.LJ(this.resp_base, c2243581Crc.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243581Crc(C2244091CsR c2244091CsR, C2243941CsC c2243941CsC, C2243691Crn c2243691Crn, C2243641Cri c2243641Cri, C2242771CqJ c2242771CqJ, String str, C0IBD c0ibd, C2243651Crj c2243651Crj, C2243601Cre c2243601Cre, EnumC2243761Cru enumC2243761Cru, List<EnumC19365810pc> list, C2228461CJw c2228461CJw, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2244091CsR, c2243941CsC, c2243691Crn, c2243641Cri, c2242771CqJ, str, c0ibd, c2243651Crj, c2243601Cre, enumC2243761Cru, list, c2228461CJw, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243581Crc(C2244091CsR c2244091CsR, C2243941CsC c2243941CsC, C2243691Crn c2243691Crn, C2243641Cri c2243641Cri, C2242771CqJ c2242771CqJ, String str, C0IBD c0ibd, C2243651Crj c2243651Crj, C2243601Cre c2243601Cre, EnumC2243761Cru enumC2243761Cru, List<EnumC19365810pc> list, C2228461CJw c2228461CJw, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker = c2244091CsR;
        this.preview_hint = c2243941CsC;
        this.fallback = c2243691Crn;
        this.sticker_creator_user_info = c2243641Cri;
        this.attachment = c2242771CqJ;
        this.sticker_biz_type = str;
        this.sticker_scene = c0ibd;
        this.avatar_duo = c2243651Crj;
        this.imagine_studio = c2243601Cre;
        this.sticker_variant = enumC2243761Cru;
        this.block_actions = C1516540pZE.LJFF("block_actions", list);
        this.tenor_info = c2228461CJw;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
