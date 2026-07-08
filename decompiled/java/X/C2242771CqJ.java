package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242771CqJ extends Message<C2242771CqJ, C2242761CqI> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final Integer aweme_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UrlStruct#ADAPTER", tag = 4)
    public final C1CUV cover;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 23)
    public final Long expire_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 21)
    public final Boolean is_story;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long origin_author_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long original_create_time;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackStatus#ADAPTER", tag = 22)
    public final C0IBA status;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AttachmentType#ADAPTER", tag = 1)
    public final EnumC2244491Ct5 type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long uid;
    public static final ProtoAdapter<C2242771CqJ> ADAPTER = new ProtoAdapter<C2242771CqJ>() { // from class: X.1CqK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242771CqJ decode(ProtoReader protoReader) {
            C2242761CqI c2242761CqI = new C2242761CqI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2242761CqI.LIZLLL = EnumC2244491Ct5.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2242761CqI.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2242761CqI.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2242761CqI.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2242761CqI.LJI = C1CUV.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242761CqI.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2242761CqI.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    c2242761CqI.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 21:
                                    c2242761CqI.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 22:
                                    try {
                                        c2242761CqI.LJIIJJI = C0IBA.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        c2242761CqI.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                    break;
                                case 23:
                                    c2242761CqI.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242761CqI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242761CqI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242771CqJ c2242771CqJ) {
            C2242771CqJ c2242771CqJ2 = c2242771CqJ;
            int iEncodedSizeWithTag = EnumC2244491Ct5.ADAPTER.encodedSizeWithTag(1, c2242771CqJ2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2242771CqJ2.id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2242771CqJ2.uid) + C1CUV.ADAPTER.encodedSizeWithTag(4, c2242771CqJ2.cover) + protoAdapter.encodedSizeWithTag(5, c2242771CqJ2.origin_author_uid) + protoAdapter.encodedSizeWithTag(6, c2242771CqJ2.original_create_time) + ProtoAdapter.INT32.encodedSizeWithTag(20, c2242771CqJ2.aweme_type) + ProtoAdapter.BOOL.encodedSizeWithTag(21, c2242771CqJ2.is_story) + C0IBA.ADAPTER.encodedSizeWithTag(22, c2242771CqJ2.status) + protoAdapter.encodedSizeWithTag(23, c2242771CqJ2.expire_at) + c2242771CqJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242771CqJ redact(C2242771CqJ c2242771CqJ) {
            C2242761CqI c2242761CqINewBuilder = c2242771CqJ.newBuilder();
            C1CUV c1cuv = c2242761CqINewBuilder.LJI;
            if (c1cuv != null) {
                c2242761CqINewBuilder.LJI = C1CUV.ADAPTER.redact(c1cuv);
            }
            c2242761CqINewBuilder.clearUnknownFields();
            return c2242761CqINewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242771CqJ c2242771CqJ) {
            C2242771CqJ c2242771CqJ2 = c2242771CqJ;
            EnumC2244491Ct5.ADAPTER.encodeWithTag(protoWriter, 1, c2242771CqJ2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2242771CqJ2.id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c2242771CqJ2.uid);
            C1CUV.ADAPTER.encodeWithTag(protoWriter, 4, c2242771CqJ2.cover);
            protoAdapter.encodeWithTag(protoWriter, 5, c2242771CqJ2.origin_author_uid);
            protoAdapter.encodeWithTag(protoWriter, 6, c2242771CqJ2.original_create_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, c2242771CqJ2.aweme_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, c2242771CqJ2.is_story);
            C0IBA.ADAPTER.encodeWithTag(protoWriter, 22, c2242771CqJ2.status);
            protoAdapter.encodeWithTag(protoWriter, 23, c2242771CqJ2.expire_at);
            protoWriter.writeBytes(c2242771CqJ2.unknownFields());
        }
    };
    public static final EnumC2244491Ct5 DEFAULT_TYPE = EnumC2244491Ct5.ATTACHMENT_TYPE_DEFAULT;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_ORIGIN_AUTHOR_UID = 0L;
    public static final Long DEFAULT_ORIGINAL_CREATE_TIME = 0L;
    public static final Integer DEFAULT_AWEME_TYPE = 0;
    public static final Boolean DEFAULT_IS_STORY = Boolean.FALSE;
    public static final C0IBA DEFAULT_STATUS = C0IBA.UNKNOWN;
    public static final Long DEFAULT_EXPIRE_AT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC2244491Ct5 enumC2244491Ct5 = this.type;
        int iHashCode2 = (iHashCode + (enumC2244491Ct5 != null ? enumC2244491Ct5.hashCode() : 0)) * 37;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.uid;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        C1CUV c1cuv = this.cover;
        int iHashCode5 = (iHashCode4 + (c1cuv != null ? c1cuv.hashCode() : 0)) * 37;
        Long l2 = this.origin_author_uid;
        int iHashCode6 = (iHashCode5 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.original_create_time;
        int iHashCode7 = (iHashCode6 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Integer num = this.aweme_type;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.is_story;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 37;
        C0IBA c0iba = this.status;
        int iHashCode10 = (iHashCode9 + (c0iba != null ? c0iba.hashCode() : 0)) * 37;
        Long l4 = this.expire_at;
        int iHashCode11 = iHashCode10 + (l4 != null ? l4.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public C2242761CqI newBuilder() {
        C2242761CqI c2242761CqI = new C2242761CqI();
        c2242761CqI.LIZLLL = this.type;
        c2242761CqI.LJ = this.id;
        c2242761CqI.LJFF = this.uid;
        c2242761CqI.LJI = this.cover;
        c2242761CqI.LJII = this.origin_author_uid;
        c2242761CqI.LJIIIIZZ = this.original_create_time;
        c2242761CqI.LJIIIZ = this.aweme_type;
        c2242761CqI.LJIIJ = this.is_story;
        c2242761CqI.LJIIJJI = this.status;
        c2242761CqI.LJIIL = this.expire_at;
        c2242761CqI.addUnknownFields(unknownFields());
        return c2242761CqI;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.origin_author_uid != null) {
            sb.append(", origin_author_uid=");
            sb.append(this.origin_author_uid);
        }
        if (this.original_create_time != null) {
            sb.append(", original_create_time=");
            sb.append(this.original_create_time);
        }
        if (this.aweme_type != null) {
            sb.append(", aweme_type=");
            sb.append(this.aweme_type);
        }
        if (this.is_story != null) {
            sb.append(", is_story=");
            sb.append(this.is_story);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.expire_at != null) {
            sb.append(", expire_at=");
            sb.append(this.expire_at);
        }
        sb.replace(0, 2, "Attachment{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242771CqJ)) {
            return false;
        }
        C2242771CqJ c2242771CqJ = (C2242771CqJ) obj;
        if (unknownFields().equals(c2242771CqJ.unknownFields()) && C1516540pZE.LJ(this.type, c2242771CqJ.type) && C1516540pZE.LJ(this.id, c2242771CqJ.id) && C1516540pZE.LJ(this.uid, c2242771CqJ.uid) && C1516540pZE.LJ(this.cover, c2242771CqJ.cover) && C1516540pZE.LJ(this.origin_author_uid, c2242771CqJ.origin_author_uid) && C1516540pZE.LJ(this.original_create_time, c2242771CqJ.original_create_time) && C1516540pZE.LJ(this.aweme_type, c2242771CqJ.aweme_type) && C1516540pZE.LJ(this.is_story, c2242771CqJ.is_story) && C1516540pZE.LJ(this.status, c2242771CqJ.status) && C1516540pZE.LJ(this.expire_at, c2242771CqJ.expire_at)) {
            return true;
        }
        return false;
    }

    public C2242771CqJ(EnumC2244491Ct5 enumC2244491Ct5, String str, Long l, C1CUV c1cuv, Long l2, Long l3, Integer num, Boolean bool, C0IBA c0iba, Long l4) {
        this(enumC2244491Ct5, str, l, c1cuv, l2, l3, num, bool, c0iba, l4, ByteString.EMPTY);
    }

    public C2242771CqJ(EnumC2244491Ct5 enumC2244491Ct5, String str, Long l, C1CUV c1cuv, Long l2, Long l3, Integer num, Boolean bool, C0IBA c0iba, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = enumC2244491Ct5;
        this.id = str;
        this.uid = l;
        this.cover = c1cuv;
        this.origin_author_uid = l2;
        this.original_create_time = l3;
        this.aweme_type = num;
        this.is_story = bool;
        this.status = c0iba;
        this.expire_at = l4;
    }
}
