package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243601Cre extends Message<C2243601Cre, C2243721Crq> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    public final String element_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImagineStudioElementTypeEnum#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final EnumC2243741Crs element_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final String element_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_SMS_VOICE)
    public final String element_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String emoji_element;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long material_sticker_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerTypeEnum#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2240681Cmw material_sticker_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String prompt_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final String remixee_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BdTuring.TYPE_ECAF)
    public final Long remixee_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String remixer_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long remixer_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text_element;
    public static final ProtoAdapter<C2243601Cre> ADAPTER = new ProtoAdapter<C2243601Cre>() { // from class: X.1Crh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243601Cre decode(ProtoReader protoReader) {
            C2243721Crq c2243721Crq = new C2243721Crq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2243721Crq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2243721Crq.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2243721Crq.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2243721Crq.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c2243721Crq.LJII = EnumC2240681Cmw.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2243721Crq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 6:
                            try {
                                c2243721Crq.LJIIIIZZ = EnumC2243741Crs.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2243721Crq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 7:
                            c2243721Crq.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2243721Crq.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2243721Crq.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2243721Crq.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2243721Crq.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2243721Crq.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2243721Crq.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243721Crq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243721Crq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243601Cre c2243601Cre) {
            C2243601Cre c2243601Cre2 = c2243601Cre;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2243601Cre2.text_element) + protoAdapter.encodedSizeWithTag(2, c2243601Cre2.emoji_element) + protoAdapter.encodedSizeWithTag(3, c2243601Cre2.prompt_text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2243601Cre2.material_sticker_id) + EnumC2240681Cmw.ADAPTER.encodedSizeWithTag(5, c2243601Cre2.material_sticker_type) + EnumC2243741Crs.ADAPTER.encodedSizeWithTag(6, c2243601Cre2.element_type) + protoAdapter2.encodedSizeWithTag(7, c2243601Cre2.remixer_uid) + protoAdapter.encodedSizeWithTag(8, c2243601Cre2.remixer_nickname) + protoAdapter2.encodedSizeWithTag(9, c2243601Cre2.remixee_uid) + protoAdapter.encodedSizeWithTag(10, c2243601Cre2.remixee_nickname) + protoAdapter.encodedSizeWithTag(11, c2243601Cre2.element_id) + protoAdapter.encodedSizeWithTag(12, c2243601Cre2.element_uri) + protoAdapter.encodedSizeWithTag(13, c2243601Cre2.element_url) + c2243601Cre2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243601Cre redact(C2243601Cre c2243601Cre) {
            C2243721Crq c2243721CrqNewBuilder = c2243601Cre.newBuilder();
            c2243721CrqNewBuilder.clearUnknownFields();
            return c2243721CrqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243601Cre c2243601Cre) {
            C2243601Cre c2243601Cre2 = c2243601Cre;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243601Cre2.text_element);
            protoAdapter.encodeWithTag(protoWriter, 2, c2243601Cre2.emoji_element);
            protoAdapter.encodeWithTag(protoWriter, 3, c2243601Cre2.prompt_text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2243601Cre2.material_sticker_id);
            EnumC2240681Cmw.ADAPTER.encodeWithTag(protoWriter, 5, c2243601Cre2.material_sticker_type);
            EnumC2243741Crs.ADAPTER.encodeWithTag(protoWriter, 6, c2243601Cre2.element_type);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2243601Cre2.remixer_uid);
            protoAdapter.encodeWithTag(protoWriter, 8, c2243601Cre2.remixer_nickname);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2243601Cre2.remixee_uid);
            protoAdapter.encodeWithTag(protoWriter, 10, c2243601Cre2.remixee_nickname);
            protoAdapter.encodeWithTag(protoWriter, 11, c2243601Cre2.element_id);
            protoAdapter.encodeWithTag(protoWriter, 12, c2243601Cre2.element_uri);
            protoAdapter.encodeWithTag(protoWriter, 13, c2243601Cre2.element_url);
            protoWriter.writeBytes(c2243601Cre2.unknownFields());
        }
    };
    public static final Long DEFAULT_MATERIAL_STICKER_ID = 0L;
    public static final EnumC2240681Cmw DEFAULT_MATERIAL_STICKER_TYPE = EnumC2240681Cmw.StickerTypeUnknown;
    public static final EnumC2243741Crs DEFAULT_ELEMENT_TYPE = EnumC2243741Crs.ImagineStudioElementType_Unknown;
    public static final Long DEFAULT_REMIXER_UID = 0L;
    public static final Long DEFAULT_REMIXEE_UID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text_element;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.emoji_element;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.prompt_text;
        int iHashCode4 = (((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.material_sticker_id.hashCode()) * 37) + this.material_sticker_type.hashCode()) * 37) + this.element_type.hashCode()) * 37;
        Long l = this.remixer_uid;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        String str4 = this.remixer_nickname;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l2 = this.remixee_uid;
        int iHashCode7 = (iHashCode6 + (l2 != null ? l2.hashCode() : 0)) * 37;
        String str5 = this.remixee_nickname;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.element_id;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.element_uri;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.element_url;
        int iHashCode11 = iHashCode10 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public C2243721Crq newBuilder() {
        C2243721Crq c2243721Crq = new C2243721Crq();
        c2243721Crq.LIZLLL = this.text_element;
        c2243721Crq.LJ = this.emoji_element;
        c2243721Crq.LJFF = this.prompt_text;
        c2243721Crq.LJI = this.material_sticker_id;
        c2243721Crq.LJII = this.material_sticker_type;
        c2243721Crq.LJIIIIZZ = this.element_type;
        c2243721Crq.LJIIIZ = this.remixer_uid;
        c2243721Crq.LJIIJ = this.remixer_nickname;
        c2243721Crq.LJIIJJI = this.remixee_uid;
        c2243721Crq.LJIIL = this.remixee_nickname;
        c2243721Crq.LJIILIIL = this.element_id;
        c2243721Crq.LJIILJJIL = this.element_uri;
        c2243721Crq.LJIILL = this.element_url;
        c2243721Crq.addUnknownFields(unknownFields());
        return c2243721Crq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text_element != null) {
            sb.append(", text_element=");
            sb.append(this.text_element);
        }
        if (this.emoji_element != null) {
            sb.append(", emoji_element=");
            sb.append(this.emoji_element);
        }
        if (this.prompt_text != null) {
            sb.append(", prompt_text=");
            sb.append(this.prompt_text);
        }
        sb.append(", material_sticker_id=");
        sb.append(this.material_sticker_id);
        sb.append(", material_sticker_type=");
        sb.append(this.material_sticker_type);
        sb.append(", element_type=");
        sb.append(this.element_type);
        if (this.remixer_uid != null) {
            sb.append(", remixer_uid=");
            sb.append(this.remixer_uid);
        }
        if (this.remixer_nickname != null) {
            sb.append(", remixer_nickname=");
            sb.append(this.remixer_nickname);
        }
        if (this.remixee_uid != null) {
            sb.append(", remixee_uid=");
            sb.append(this.remixee_uid);
        }
        if (this.remixee_nickname != null) {
            sb.append(", remixee_nickname=");
            sb.append(this.remixee_nickname);
        }
        if (this.element_id != null) {
            sb.append(", element_id=");
            sb.append(this.element_id);
        }
        if (this.element_uri != null) {
            sb.append(", element_uri=");
            sb.append(this.element_uri);
        }
        if (this.element_url != null) {
            sb.append(", element_url=");
            sb.append(this.element_url);
        }
        sb.replace(0, 2, "ImagineStudioInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243601Cre)) {
            return false;
        }
        C2243601Cre c2243601Cre = (C2243601Cre) obj;
        if (unknownFields().equals(c2243601Cre.unknownFields()) && C1516540pZE.LJ(this.text_element, c2243601Cre.text_element) && C1516540pZE.LJ(this.emoji_element, c2243601Cre.emoji_element) && C1516540pZE.LJ(this.prompt_text, c2243601Cre.prompt_text) && this.material_sticker_id.equals(c2243601Cre.material_sticker_id) && this.material_sticker_type.equals(c2243601Cre.material_sticker_type) && this.element_type.equals(c2243601Cre.element_type) && C1516540pZE.LJ(this.remixer_uid, c2243601Cre.remixer_uid) && C1516540pZE.LJ(this.remixer_nickname, c2243601Cre.remixer_nickname) && C1516540pZE.LJ(this.remixee_uid, c2243601Cre.remixee_uid) && C1516540pZE.LJ(this.remixee_nickname, c2243601Cre.remixee_nickname) && C1516540pZE.LJ(this.element_id, c2243601Cre.element_id) && C1516540pZE.LJ(this.element_uri, c2243601Cre.element_uri) && C1516540pZE.LJ(this.element_url, c2243601Cre.element_url)) {
            return true;
        }
        return false;
    }

    public C2243601Cre(String str, String str2, String str3, Long l, EnumC2240681Cmw enumC2240681Cmw, EnumC2243741Crs enumC2243741Crs, Long l2, String str4, Long l3, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, l, enumC2240681Cmw, enumC2243741Crs, l2, str4, l3, str5, str6, str7, str8, ByteString.EMPTY);
    }

    public C2243601Cre(String str, String str2, String str3, Long l, EnumC2240681Cmw enumC2240681Cmw, EnumC2243741Crs enumC2243741Crs, Long l2, String str4, Long l3, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text_element = str;
        this.emoji_element = str2;
        this.prompt_text = str3;
        this.material_sticker_id = l;
        this.material_sticker_type = enumC2240681Cmw;
        this.element_type = enumC2243741Crs;
        this.remixer_uid = l2;
        this.remixer_nickname = str4;
        this.remixee_uid = l3;
        this.remixee_nickname = str5;
        this.element_id = str6;
        this.element_uri = str7;
        this.element_url = str8;
    }
}
