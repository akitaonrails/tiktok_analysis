package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242891CqV extends Message<C2242891CqV, C2242931CqZ> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long comment_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 4)
    public final C2243521CrW comment_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.CommentType#ADAPTER", tag = 6)
    public final EnumC2242941Cqa comment_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 5)
    public final C2244091CsR image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long item_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final C2243521CrW top_inline_text;
    public static final ProtoAdapter<C2242891CqV> ADAPTER = new ProtoAdapter<C2242891CqV>() { // from class: X.1CqW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242891CqV decode(ProtoReader protoReader) {
            C2242931CqZ c2242931CqZ = new C2242931CqZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242931CqZ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2242931CqZ.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2242931CqZ.LJFF = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2242931CqZ.LJI = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242931CqZ.LJII = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2242931CqZ.LJIIIIZZ = EnumC2242941Cqa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2242931CqZ.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2242931CqZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242931CqZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242891CqV c2242891CqV) {
            C2242891CqV c2242891CqV2 = c2242891CqV;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2242891CqV2.item_id) + protoAdapter.encodedSizeWithTag(2, c2242891CqV2.comment_id);
            ProtoAdapter<C2243521CrW> protoAdapter2 = C2243521CrW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2242891CqV2.top_inline_text) + protoAdapter2.encodedSizeWithTag(4, c2242891CqV2.comment_text) + C2244091CsR.ADAPTER.encodedSizeWithTag(5, c2242891CqV2.image) + EnumC2242941Cqa.ADAPTER.encodedSizeWithTag(6, c2242891CqV2.comment_type) + c2242891CqV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242891CqV redact(C2242891CqV c2242891CqV) {
            C2242931CqZ c2242931CqZNewBuilder = c2242891CqV.newBuilder();
            C2243521CrW c2243521CrW = c2242931CqZNewBuilder.LJFF;
            if (c2243521CrW != null) {
                c2242931CqZNewBuilder.LJFF = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2242931CqZNewBuilder.LJI;
            if (c2243521CrW2 != null) {
                c2242931CqZNewBuilder.LJI = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2244091CsR c2244091CsR = c2242931CqZNewBuilder.LJII;
            if (c2244091CsR != null) {
                c2242931CqZNewBuilder.LJII = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2242931CqZNewBuilder.clearUnknownFields();
            return c2242931CqZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242891CqV c2242891CqV) {
            C2242891CqV c2242891CqV2 = c2242891CqV;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2242891CqV2.item_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2242891CqV2.comment_id);
            ProtoAdapter<C2243521CrW> protoAdapter2 = C2243521CrW.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2242891CqV2.top_inline_text);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2242891CqV2.comment_text);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 5, c2242891CqV2.image);
            EnumC2242941Cqa.ADAPTER.encodeWithTag(protoWriter, 6, c2242891CqV2.comment_type);
            protoWriter.writeBytes(c2242891CqV2.unknownFields());
        }
    };
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final Long DEFAULT_COMMENT_ID = 0L;
    public static final EnumC2242941Cqa DEFAULT_COMMENT_TYPE = EnumC2242941Cqa.TYPE_TEXT;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.item_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.comment_id;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.top_inline_text;
        int iHashCode4 = (iHashCode3 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.comment_text;
        int iHashCode5 = (iHashCode4 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode6 = (iHashCode5 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        EnumC2242941Cqa enumC2242941Cqa = this.comment_type;
        int iHashCode7 = iHashCode6 + (enumC2242941Cqa != null ? enumC2242941Cqa.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2242931CqZ newBuilder() {
        C2242931CqZ c2242931CqZ = new C2242931CqZ();
        c2242931CqZ.LIZLLL = this.item_id;
        c2242931CqZ.LJ = this.comment_id;
        c2242931CqZ.LJFF = this.top_inline_text;
        c2242931CqZ.LJI = this.comment_text;
        c2242931CqZ.LJII = this.image;
        c2242931CqZ.LJIIIIZZ = this.comment_type;
        c2242931CqZ.addUnknownFields(unknownFields());
        return c2242931CqZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item_id != null) {
            sb.append(", item_id=");
            sb.append(this.item_id);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.top_inline_text != null) {
            sb.append(", top_inline_text=");
            sb.append(this.top_inline_text);
        }
        if (this.comment_text != null) {
            sb.append(", comment_text=");
            sb.append(this.comment_text);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.comment_type != null) {
            sb.append(", comment_type=");
            sb.append(this.comment_type);
        }
        sb.replace(0, 2, "BaseShareComment{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242891CqV)) {
            return false;
        }
        C2242891CqV c2242891CqV = (C2242891CqV) obj;
        if (unknownFields().equals(c2242891CqV.unknownFields()) && C1516540pZE.LJ(this.item_id, c2242891CqV.item_id) && C1516540pZE.LJ(this.comment_id, c2242891CqV.comment_id) && C1516540pZE.LJ(this.top_inline_text, c2242891CqV.top_inline_text) && C1516540pZE.LJ(this.comment_text, c2242891CqV.comment_text) && C1516540pZE.LJ(this.image, c2242891CqV.image) && C1516540pZE.LJ(this.comment_type, c2242891CqV.comment_type)) {
            return true;
        }
        return false;
    }

    public C2242891CqV(Long l, Long l2, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244091CsR c2244091CsR, EnumC2242941Cqa enumC2242941Cqa) {
        this(l, l2, c2243521CrW, c2243521CrW2, c2244091CsR, enumC2242941Cqa, ByteString.EMPTY);
    }

    public C2242891CqV(Long l, Long l2, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244091CsR c2244091CsR, EnumC2242941Cqa enumC2242941Cqa, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_id = l;
        this.comment_id = l2;
        this.top_inline_text = c2243521CrW;
        this.comment_text = c2243521CrW2;
        this.image = c2244091CsR;
        this.comment_type = enumC2242941Cqa;
    }
}
