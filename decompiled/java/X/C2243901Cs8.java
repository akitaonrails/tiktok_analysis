package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243901Cs8 extends Message<C2243901Cs8, C2243951CsD> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.IconType#ADAPTER", tag = 4)
    public final EnumC2244051CsN fallback_icon;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C2244091CsR preview_image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewIconType#ADAPTER", tag = 5)
    public final EnumC2243991CsH quote_preview_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String resource_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long sender_uid;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TTL#ADAPTER", tag = 7)
    public final C2241591CoP ttl;
    public static final ProtoAdapter<C2243901Cs8> ADAPTER = new ProtoAdapter<C2243901Cs8>() { // from class: X.1Cs9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243901Cs8 decode(ProtoReader protoReader) {
            C2243951CsD c2243951CsD = new C2243951CsD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2243951CsD.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2243951CsD.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2243951CsD.LJFF = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2243951CsD.LJI = EnumC2244051CsN.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2243951CsD.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            try {
                                c2243951CsD.LJII = EnumC2243991CsH.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2243951CsD.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            c2243951CsD.LJIIIIZZ = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2243951CsD.LJIIIZ = C2241591CoP.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243951CsD.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243951CsD.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243901Cs8 c2243901Cs8) {
            C2243901Cs8 c2243901Cs82 = c2243901Cs8;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2243901Cs82.resource_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2243901Cs82.sender_uid) + C2244091CsR.ADAPTER.encodedSizeWithTag(3, c2243901Cs82.preview_image) + EnumC2244051CsN.ADAPTER.encodedSizeWithTag(4, c2243901Cs82.fallback_icon) + EnumC2243991CsH.ADAPTER.encodedSizeWithTag(5, c2243901Cs82.quote_preview_icon) + C2244321Cso.ADAPTER.encodedSizeWithTag(6, c2243901Cs82.link_info) + C2241591CoP.ADAPTER.encodedSizeWithTag(7, c2243901Cs82.ttl) + c2243901Cs82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243901Cs8 redact(C2243901Cs8 c2243901Cs8) {
            C2243951CsD c2243951CsDNewBuilder = c2243901Cs8.newBuilder();
            C2244091CsR c2244091CsR = c2243951CsDNewBuilder.LJFF;
            if (c2244091CsR != null) {
                c2243951CsDNewBuilder.LJFF = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244321Cso c2244321Cso = c2243951CsDNewBuilder.LJIIIIZZ;
            if (c2244321Cso != null) {
                c2243951CsDNewBuilder.LJIIIIZZ = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2241591CoP c2241591CoP = c2243951CsDNewBuilder.LJIIIZ;
            if (c2241591CoP != null) {
                c2243951CsDNewBuilder.LJIIIZ = C2241591CoP.ADAPTER.redact(c2241591CoP);
            }
            c2243951CsDNewBuilder.clearUnknownFields();
            return c2243951CsDNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243901Cs8 c2243901Cs8) {
            C2243901Cs8 c2243901Cs82 = c2243901Cs8;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2243901Cs82.resource_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2243901Cs82.sender_uid);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 3, c2243901Cs82.preview_image);
            EnumC2244051CsN.ADAPTER.encodeWithTag(protoWriter, 4, c2243901Cs82.fallback_icon);
            EnumC2243991CsH.ADAPTER.encodeWithTag(protoWriter, 5, c2243901Cs82.quote_preview_icon);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 6, c2243901Cs82.link_info);
            C2241591CoP.ADAPTER.encodeWithTag(protoWriter, 7, c2243901Cs82.ttl);
            protoWriter.writeBytes(c2243901Cs82.unknownFields());
        }
    };
    public static final Long DEFAULT_SENDER_UID = 0L;
    public static final EnumC2244051CsN DEFAULT_FALLBACK_ICON = EnumC2244051CsN.Default;
    public static final EnumC2243991CsH DEFAULT_QUOTE_PREVIEW_ICON = EnumC2243991CsH.NoIcon;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.resource_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.sender_uid;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.preview_image;
        int iHashCode4 = (iHashCode3 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        EnumC2244051CsN enumC2244051CsN = this.fallback_icon;
        int iHashCode5 = (iHashCode4 + (enumC2244051CsN != null ? enumC2244051CsN.hashCode() : 0)) * 37;
        EnumC2243991CsH enumC2243991CsH = this.quote_preview_icon;
        int iHashCode6 = (iHashCode5 + (enumC2243991CsH != null ? enumC2243991CsH.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode7 = (iHashCode6 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2241591CoP c2241591CoP = this.ttl;
        int iHashCode8 = iHashCode7 + (c2241591CoP != null ? c2241591CoP.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2243951CsD newBuilder() {
        C2243951CsD c2243951CsD = new C2243951CsD();
        c2243951CsD.LIZLLL = this.resource_id;
        c2243951CsD.LJ = this.sender_uid;
        c2243951CsD.LJFF = this.preview_image;
        c2243951CsD.LJI = this.fallback_icon;
        c2243951CsD.LJII = this.quote_preview_icon;
        c2243951CsD.LJIIIIZZ = this.link_info;
        c2243951CsD.LJIIIZ = this.ttl;
        c2243951CsD.addUnknownFields(unknownFields());
        return c2243951CsD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        if (this.sender_uid != null) {
            sb.append(", sender_uid=");
            sb.append(this.sender_uid);
        }
        if (this.preview_image != null) {
            sb.append(", preview_image=");
            sb.append(this.preview_image);
        }
        if (this.fallback_icon != null) {
            sb.append(", fallback_icon=");
            sb.append(this.fallback_icon);
        }
        if (this.quote_preview_icon != null) {
            sb.append(", quote_preview_icon=");
            sb.append(this.quote_preview_icon);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        sb.replace(0, 2, "QuotePicturePreview{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243901Cs8)) {
            return false;
        }
        C2243901Cs8 c2243901Cs8 = (C2243901Cs8) obj;
        if (unknownFields().equals(c2243901Cs8.unknownFields()) && C1516540pZE.LJ(this.resource_id, c2243901Cs8.resource_id) && C1516540pZE.LJ(this.sender_uid, c2243901Cs8.sender_uid) && C1516540pZE.LJ(this.preview_image, c2243901Cs8.preview_image) && C1516540pZE.LJ(this.fallback_icon, c2243901Cs8.fallback_icon) && C1516540pZE.LJ(this.quote_preview_icon, c2243901Cs8.quote_preview_icon) && C1516540pZE.LJ(this.link_info, c2243901Cs8.link_info) && C1516540pZE.LJ(this.ttl, c2243901Cs8.ttl)) {
            return true;
        }
        return false;
    }

    public C2243901Cs8(String str, Long l, C2244091CsR c2244091CsR, EnumC2244051CsN enumC2244051CsN, EnumC2243991CsH enumC2243991CsH, C2244321Cso c2244321Cso, C2241591CoP c2241591CoP) {
        this(str, l, c2244091CsR, enumC2244051CsN, enumC2243991CsH, c2244321Cso, c2241591CoP, ByteString.EMPTY);
    }

    public C2243901Cs8(String str, Long l, C2244091CsR c2244091CsR, EnumC2244051CsN enumC2244051CsN, EnumC2243991CsH enumC2243991CsH, C2244321Cso c2244321Cso, C2241591CoP c2241591CoP, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_id = str;
        this.sender_uid = l;
        this.preview_image = c2244091CsR;
        this.fallback_icon = enumC2244051CsN;
        this.quote_preview_icon = enumC2243991CsH;
        this.link_info = c2244321Cso;
        this.ttl = c2241591CoP;
    }
}
