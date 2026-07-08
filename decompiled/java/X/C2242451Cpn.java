package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242451Cpn extends Message<C2242451Cpn, C2242491Cpr> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long item_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 3)
    public final C2242541Cpw item_user_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long repost_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 6)
    public final C2244091CsR repost_image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 5)
    public final C2243521CrW repost_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 4)
    public final C2242541Cpw repost_user_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.RepostCardStatus#ADAPTER", tag = 7)
    public final C0IBL status;
    public static final ProtoAdapter<C2242451Cpn> ADAPTER = new ProtoAdapter<C2242451Cpn>() { // from class: X.1Cpo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242451Cpn decode(ProtoReader protoReader) {
            C2242491Cpr c2242491Cpr = new C2242491Cpr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242491Cpr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2242491Cpr.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2242491Cpr.LJFF = C2242541Cpw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2242491Cpr.LJI = C2242541Cpw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242491Cpr.LJII = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2242491Cpr.LJIIIIZZ = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            try {
                                c2242491Cpr.LJIIIZ = C0IBL.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2242491Cpr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2242491Cpr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242491Cpr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242451Cpn c2242451Cpn) {
            C2242451Cpn c2242451Cpn2 = c2242451Cpn;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2242451Cpn2.repost_id) + protoAdapter.encodedSizeWithTag(2, c2242451Cpn2.item_id);
            ProtoAdapter<C2242541Cpw> protoAdapter2 = C2242541Cpw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2242451Cpn2.item_user_info) + protoAdapter2.encodedSizeWithTag(4, c2242451Cpn2.repost_user_info) + C2243521CrW.ADAPTER.encodedSizeWithTag(5, c2242451Cpn2.repost_text) + C2244091CsR.ADAPTER.encodedSizeWithTag(6, c2242451Cpn2.repost_image) + C0IBL.ADAPTER.encodedSizeWithTag(7, c2242451Cpn2.status) + c2242451Cpn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242451Cpn redact(C2242451Cpn c2242451Cpn) {
            C2242491Cpr c2242491CprNewBuilder = c2242451Cpn.newBuilder();
            C2242541Cpw c2242541Cpw = c2242491CprNewBuilder.LJFF;
            if (c2242541Cpw != null) {
                c2242491CprNewBuilder.LJFF = C2242541Cpw.ADAPTER.redact(c2242541Cpw);
            }
            C2242541Cpw c2242541Cpw2 = c2242491CprNewBuilder.LJI;
            if (c2242541Cpw2 != null) {
                c2242491CprNewBuilder.LJI = C2242541Cpw.ADAPTER.redact(c2242541Cpw2);
            }
            C2243521CrW c2243521CrW = c2242491CprNewBuilder.LJII;
            if (c2243521CrW != null) {
                c2242491CprNewBuilder.LJII = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2244091CsR c2244091CsR = c2242491CprNewBuilder.LJIIIIZZ;
            if (c2244091CsR != null) {
                c2242491CprNewBuilder.LJIIIIZZ = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2242491CprNewBuilder.clearUnknownFields();
            return c2242491CprNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242451Cpn c2242451Cpn) {
            C2242451Cpn c2242451Cpn2 = c2242451Cpn;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2242451Cpn2.repost_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2242451Cpn2.item_id);
            ProtoAdapter<C2242541Cpw> protoAdapter2 = C2242541Cpw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2242451Cpn2.item_user_info);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2242451Cpn2.repost_user_info);
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 5, c2242451Cpn2.repost_text);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 6, c2242451Cpn2.repost_image);
            C0IBL.ADAPTER.encodeWithTag(protoWriter, 7, c2242451Cpn2.status);
            protoWriter.writeBytes(c2242451Cpn2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPOST_ID = 0L;
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final C0IBL DEFAULT_STATUS = C0IBL.REPOST_CARD_STATUS_REPOST_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.repost_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.item_id;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C2242541Cpw c2242541Cpw = this.item_user_info;
        int iHashCode4 = (iHashCode3 + (c2242541Cpw != null ? c2242541Cpw.hashCode() : 0)) * 37;
        C2242541Cpw c2242541Cpw2 = this.repost_user_info;
        int iHashCode5 = (iHashCode4 + (c2242541Cpw2 != null ? c2242541Cpw2.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.repost_text;
        int iHashCode6 = (iHashCode5 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.repost_image;
        int iHashCode7 = (iHashCode6 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C0IBL c0ibl = this.status;
        int iHashCode8 = iHashCode7 + (c0ibl != null ? c0ibl.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2242491Cpr newBuilder() {
        C2242491Cpr c2242491Cpr = new C2242491Cpr();
        c2242491Cpr.LIZLLL = this.repost_id;
        c2242491Cpr.LJ = this.item_id;
        c2242491Cpr.LJFF = this.item_user_info;
        c2242491Cpr.LJI = this.repost_user_info;
        c2242491Cpr.LJII = this.repost_text;
        c2242491Cpr.LJIIIIZZ = this.repost_image;
        c2242491Cpr.LJIIIZ = this.status;
        c2242491Cpr.addUnknownFields(unknownFields());
        return c2242491Cpr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.repost_id != null) {
            sb.append(", repost_id=");
            sb.append(this.repost_id);
        }
        if (this.item_id != null) {
            sb.append(", item_id=");
            sb.append(this.item_id);
        }
        if (this.item_user_info != null) {
            sb.append(", item_user_info=");
            sb.append(this.item_user_info);
        }
        if (this.repost_user_info != null) {
            sb.append(", repost_user_info=");
            sb.append(this.repost_user_info);
        }
        if (this.repost_text != null) {
            sb.append(", repost_text=");
            sb.append(this.repost_text);
        }
        if (this.repost_image != null) {
            sb.append(", repost_image=");
            sb.append(this.repost_image);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        sb.replace(0, 2, "ShareRepost{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242451Cpn)) {
            return false;
        }
        C2242451Cpn c2242451Cpn = (C2242451Cpn) obj;
        if (unknownFields().equals(c2242451Cpn.unknownFields()) && C1516540pZE.LJ(this.repost_id, c2242451Cpn.repost_id) && C1516540pZE.LJ(this.item_id, c2242451Cpn.item_id) && C1516540pZE.LJ(this.item_user_info, c2242451Cpn.item_user_info) && C1516540pZE.LJ(this.repost_user_info, c2242451Cpn.repost_user_info) && C1516540pZE.LJ(this.repost_text, c2242451Cpn.repost_text) && C1516540pZE.LJ(this.repost_image, c2242451Cpn.repost_image) && C1516540pZE.LJ(this.status, c2242451Cpn.status)) {
            return true;
        }
        return false;
    }

    public C2242451Cpn(Long l, Long l2, C2242541Cpw c2242541Cpw, C2242541Cpw c2242541Cpw2, C2243521CrW c2243521CrW, C2244091CsR c2244091CsR, C0IBL c0ibl) {
        this(l, l2, c2242541Cpw, c2242541Cpw2, c2243521CrW, c2244091CsR, c0ibl, ByteString.EMPTY);
    }

    public C2242451Cpn(Long l, Long l2, C2242541Cpw c2242541Cpw, C2242541Cpw c2242541Cpw2, C2243521CrW c2243521CrW, C2244091CsR c2244091CsR, C0IBL c0ibl, ByteString byteString) {
        super(ADAPTER, byteString);
        this.repost_id = l;
        this.item_id = l2;
        this.item_user_info = c2242541Cpw;
        this.repost_user_info = c2242541Cpw2;
        this.repost_text = c2243521CrW;
        this.repost_image = c2244091CsR;
        this.status = c0ibl;
    }
}
