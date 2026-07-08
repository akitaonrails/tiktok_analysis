package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240651Cmt extends Message<C2240651Cmt, C2240671Cmv> {
    public static final ProtoAdapter<C2240651Cmt> ADAPTER = new ProtoAdapter<C2240651Cmt>() { // from class: X.1Cmu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240651Cmt decode(ProtoReader protoReader) {
            C2240671Cmv c2240671Cmv = new C2240671Cmv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 6) {
                                        if (iNextTag != 10) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2240671Cmv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c2240671Cmv.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c2240671Cmv.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c2240671Cmv.LJI = EnumC2240681Cmw.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2240671Cmv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2240671Cmv.LJFF = C2240621Cmq.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2240671Cmv.LJ = C2240621Cmq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2240671Cmv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240671Cmv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240651Cmt c2240651Cmt) {
            C2240651Cmt c2240651Cmt2 = c2240651Cmt;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c2240651Cmt2.id);
            ProtoAdapter<C2240621Cmq> protoAdapter = C2240621Cmq.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2240651Cmt2.image) + protoAdapter.encodedSizeWithTag(3, c2240651Cmt2.thumbnail) + EnumC2240681Cmw.ADAPTER.encodedSizeWithTag(4, c2240651Cmt2.sticker_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, c2240651Cmt2.title) + protoAdapter2.encodedSizeWithTag(10, c2240651Cmt2.third_party_str_id) + c2240651Cmt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240651Cmt redact(C2240651Cmt c2240651Cmt) {
            C2240671Cmv c2240671CmvNewBuilder = c2240651Cmt.newBuilder();
            C2240621Cmq c2240621Cmq = c2240671CmvNewBuilder.LJ;
            if (c2240621Cmq != null) {
                c2240671CmvNewBuilder.LJ = C2240621Cmq.ADAPTER.redact(c2240621Cmq);
            }
            C2240621Cmq c2240621Cmq2 = c2240671CmvNewBuilder.LJFF;
            if (c2240621Cmq2 != null) {
                c2240671CmvNewBuilder.LJFF = C2240621Cmq.ADAPTER.redact(c2240621Cmq2);
            }
            c2240671CmvNewBuilder.clearUnknownFields();
            return c2240671CmvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240651Cmt c2240651Cmt) {
            C2240651Cmt c2240651Cmt2 = c2240651Cmt;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2240651Cmt2.id);
            ProtoAdapter<C2240621Cmq> protoAdapter = C2240621Cmq.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c2240651Cmt2.image);
            protoAdapter.encodeWithTag(protoWriter, 3, c2240651Cmt2.thumbnail);
            EnumC2240681Cmw.ADAPTER.encodeWithTag(protoWriter, 4, c2240651Cmt2.sticker_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 6, c2240651Cmt2.title);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2240651Cmt2.third_party_str_id);
            protoWriter.writeBytes(c2240651Cmt2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final EnumC2240681Cmw DEFAULT_STICKER_TYPE = EnumC2240681Cmw.StickerTypeUnknown;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerImage#ADAPTER", tag = 2)
    public final C2240621Cmq image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerTypeEnum#ADAPTER", tag = 4)
    public final EnumC2240681Cmw sticker_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final String third_party_str_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerImage#ADAPTER", tag = 3)
    public final C2240621Cmq thumbnail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String title;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        C2240621Cmq c2240621Cmq = this.image;
        int iHashCode3 = (iHashCode2 + (c2240621Cmq != null ? c2240621Cmq.hashCode() : 0)) * 37;
        C2240621Cmq c2240621Cmq2 = this.thumbnail;
        int iHashCode4 = (iHashCode3 + (c2240621Cmq2 != null ? c2240621Cmq2.hashCode() : 0)) * 37;
        EnumC2240681Cmw enumC2240681Cmw = this.sticker_type;
        int iHashCode5 = (iHashCode4 + (enumC2240681Cmw != null ? enumC2240681Cmw.hashCode() : 0)) * 37;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.third_party_str_id;
        int iHashCode7 = iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2240671Cmv newBuilder() {
        C2240671Cmv c2240671Cmv = new C2240671Cmv();
        c2240671Cmv.LIZLLL = this.id;
        c2240671Cmv.LJ = this.image;
        c2240671Cmv.LJFF = this.thumbnail;
        c2240671Cmv.LJI = this.sticker_type;
        c2240671Cmv.LJII = this.title;
        c2240671Cmv.LJIIIIZZ = this.third_party_str_id;
        c2240671Cmv.addUnknownFields(unknownFields());
        return c2240671Cmv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.sticker_type != null) {
            sb.append(", sticker_type=");
            sb.append(this.sticker_type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.third_party_str_id != null) {
            sb.append(", third_party_str_id=");
            sb.append(this.third_party_str_id);
        }
        sb.replace(0, 2, "StickerBase{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240651Cmt)) {
            return false;
        }
        C2240651Cmt c2240651Cmt = (C2240651Cmt) obj;
        if (unknownFields().equals(c2240651Cmt.unknownFields()) && C1516540pZE.LJ(this.id, c2240651Cmt.id) && C1516540pZE.LJ(this.image, c2240651Cmt.image) && C1516540pZE.LJ(this.thumbnail, c2240651Cmt.thumbnail) && C1516540pZE.LJ(this.sticker_type, c2240651Cmt.sticker_type) && C1516540pZE.LJ(this.title, c2240651Cmt.title) && C1516540pZE.LJ(this.third_party_str_id, c2240651Cmt.third_party_str_id)) {
            return true;
        }
        return false;
    }

    public C2240651Cmt(Long l, C2240621Cmq c2240621Cmq, C2240621Cmq c2240621Cmq2, EnumC2240681Cmw enumC2240681Cmw, String str, String str2) {
        this(l, c2240621Cmq, c2240621Cmq2, enumC2240681Cmw, str, str2, ByteString.EMPTY);
    }

    public C2240651Cmt(Long l, C2240621Cmq c2240621Cmq, C2240621Cmq c2240621Cmq2, EnumC2240681Cmw enumC2240681Cmw, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.image = c2240621Cmq;
        this.thumbnail = c2240621Cmq2;
        this.sticker_type = enumC2240681Cmw;
        this.title = str;
        this.third_party_str_id = str2;
    }
}
