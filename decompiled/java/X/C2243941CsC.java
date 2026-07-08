package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243941CsC extends Message<C2243941CsC, C2243971CsF> {
    public static final ProtoAdapter<C2243941CsC> ADAPTER = new ProtoAdapter<C2243941CsC>() { // from class: X.1CsB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243941CsC decode(ProtoReader protoReader) {
            C2243971CsF c2243971CsF = new C2243971CsF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2243971CsF.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2243971CsF.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2243971CsF.LJFF = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2243971CsF.LJI = EnumC2243981CsG.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2243971CsF.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2243971CsF.LJII = C2243901Cs8.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2243971CsF.LJIIIIZZ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2243971CsF.LJIIIZ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2243971CsF.LJIIJ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243971CsF.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243971CsF.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243941CsC c2243941CsC) {
            C2243941CsC c2243941CsC2 = c2243941CsC;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2243941CsC2.sender_preview_text) + protoAdapter.encodedSizeWithTag(2, c2243941CsC2.receiver_preview_text) + protoAdapter.encodedSizeWithTag(3, c2243941CsC2.quote_preview_text) + EnumC2243981CsG.ADAPTER.encodedSizeWithTag(4, c2243941CsC2.quote_preview_type) + C2243901Cs8.ADAPTER.encodedSizeWithTag(5, c2243941CsC2.quote_picture_preview) + protoAdapter.encodedSizeWithTag(6, c2243941CsC2.outapp_push_preview) + protoAdapter.encodedSizeWithTag(7, c2243941CsC2.inapp_push_preview) + protoAdapter.encodedSizeWithTag(8, c2243941CsC2.default_inapp_push_preview) + c2243941CsC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243941CsC redact(C2243941CsC c2243941CsC) {
            C2243971CsF c2243971CsFNewBuilder = c2243941CsC.newBuilder();
            C2243521CrW c2243521CrW = c2243971CsFNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243971CsFNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2243971CsFNewBuilder.LJ;
            if (c2243521CrW2 != null) {
                c2243971CsFNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2243521CrW c2243521CrW3 = c2243971CsFNewBuilder.LJFF;
            if (c2243521CrW3 != null) {
                c2243971CsFNewBuilder.LJFF = C2243521CrW.ADAPTER.redact(c2243521CrW3);
            }
            C2243901Cs8 c2243901Cs8 = c2243971CsFNewBuilder.LJII;
            if (c2243901Cs8 != null) {
                c2243971CsFNewBuilder.LJII = C2243901Cs8.ADAPTER.redact(c2243901Cs8);
            }
            C2243521CrW c2243521CrW4 = c2243971CsFNewBuilder.LJIIIIZZ;
            if (c2243521CrW4 != null) {
                c2243971CsFNewBuilder.LJIIIIZZ = C2243521CrW.ADAPTER.redact(c2243521CrW4);
            }
            C2243521CrW c2243521CrW5 = c2243971CsFNewBuilder.LJIIIZ;
            if (c2243521CrW5 != null) {
                c2243971CsFNewBuilder.LJIIIZ = C2243521CrW.ADAPTER.redact(c2243521CrW5);
            }
            C2243521CrW c2243521CrW6 = c2243971CsFNewBuilder.LJIIJ;
            if (c2243521CrW6 != null) {
                c2243971CsFNewBuilder.LJIIJ = C2243521CrW.ADAPTER.redact(c2243521CrW6);
            }
            c2243971CsFNewBuilder.clearUnknownFields();
            return c2243971CsFNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243941CsC c2243941CsC) {
            C2243941CsC c2243941CsC2 = c2243941CsC;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243941CsC2.sender_preview_text);
            protoAdapter.encodeWithTag(protoWriter, 2, c2243941CsC2.receiver_preview_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c2243941CsC2.quote_preview_text);
            EnumC2243981CsG.ADAPTER.encodeWithTag(protoWriter, 4, c2243941CsC2.quote_preview_type);
            C2243901Cs8.ADAPTER.encodeWithTag(protoWriter, 5, c2243941CsC2.quote_picture_preview);
            protoAdapter.encodeWithTag(protoWriter, 6, c2243941CsC2.outapp_push_preview);
            protoAdapter.encodeWithTag(protoWriter, 7, c2243941CsC2.inapp_push_preview);
            protoAdapter.encodeWithTag(protoWriter, 8, c2243941CsC2.default_inapp_push_preview);
            protoWriter.writeBytes(c2243941CsC2.unknownFields());
        }
    };
    public static final EnumC2243981CsG DEFAULT_QUOTE_PREVIEW_TYPE = EnumC2243981CsG.TEXT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 8)
    public final C2243521CrW default_inapp_push_preview;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 7)
    public final C2243521CrW inapp_push_preview;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 6)
    public final C2243521CrW outapp_push_preview;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QuotePicturePreview#ADAPTER", tag = 5)
    public final C2243901Cs8 quote_picture_preview;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final C2243521CrW quote_preview_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QuotePreviewType#ADAPTER", tag = 4)
    public final EnumC2243981CsG quote_preview_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW receiver_preview_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW sender_preview_text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.sender_preview_text;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.receiver_preview_text;
        int iHashCode3 = (iHashCode2 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW3 = this.quote_preview_text;
        int iHashCode4 = (iHashCode3 + (c2243521CrW3 != null ? c2243521CrW3.hashCode() : 0)) * 37;
        EnumC2243981CsG enumC2243981CsG = this.quote_preview_type;
        int iHashCode5 = (iHashCode4 + (enumC2243981CsG != null ? enumC2243981CsG.hashCode() : 0)) * 37;
        C2243901Cs8 c2243901Cs8 = this.quote_picture_preview;
        int iHashCode6 = (iHashCode5 + (c2243901Cs8 != null ? c2243901Cs8.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW4 = this.outapp_push_preview;
        int iHashCode7 = (iHashCode6 + (c2243521CrW4 != null ? c2243521CrW4.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW5 = this.inapp_push_preview;
        int iHashCode8 = (iHashCode7 + (c2243521CrW5 != null ? c2243521CrW5.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW6 = this.default_inapp_push_preview;
        int iHashCode9 = iHashCode8 + (c2243521CrW6 != null ? c2243521CrW6.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public C2243971CsF newBuilder() {
        C2243971CsF c2243971CsF = new C2243971CsF();
        c2243971CsF.LIZLLL = this.sender_preview_text;
        c2243971CsF.LJ = this.receiver_preview_text;
        c2243971CsF.LJFF = this.quote_preview_text;
        c2243971CsF.LJI = this.quote_preview_type;
        c2243971CsF.LJII = this.quote_picture_preview;
        c2243971CsF.LJIIIIZZ = this.outapp_push_preview;
        c2243971CsF.LJIIIZ = this.inapp_push_preview;
        c2243971CsF.LJIIJ = this.default_inapp_push_preview;
        c2243971CsF.addUnknownFields(unknownFields());
        return c2243971CsF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sender_preview_text != null) {
            sb.append(", sender_preview_text=");
            sb.append(this.sender_preview_text);
        }
        if (this.receiver_preview_text != null) {
            sb.append(", receiver_preview_text=");
            sb.append(this.receiver_preview_text);
        }
        if (this.quote_preview_text != null) {
            sb.append(", quote_preview_text=");
            sb.append(this.quote_preview_text);
        }
        if (this.quote_preview_type != null) {
            sb.append(", quote_preview_type=");
            sb.append(this.quote_preview_type);
        }
        if (this.quote_picture_preview != null) {
            sb.append(", quote_picture_preview=");
            sb.append(this.quote_picture_preview);
        }
        if (this.outapp_push_preview != null) {
            sb.append(", outapp_push_preview=");
            sb.append(this.outapp_push_preview);
        }
        if (this.inapp_push_preview != null) {
            sb.append(", inapp_push_preview=");
            sb.append(this.inapp_push_preview);
        }
        if (this.default_inapp_push_preview != null) {
            sb.append(", default_inapp_push_preview=");
            sb.append(this.default_inapp_push_preview);
        }
        sb.replace(0, 2, "PreviewHint{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243941CsC)) {
            return false;
        }
        C2243941CsC c2243941CsC = (C2243941CsC) obj;
        if (unknownFields().equals(c2243941CsC.unknownFields()) && C1516540pZE.LJ(this.sender_preview_text, c2243941CsC.sender_preview_text) && C1516540pZE.LJ(this.receiver_preview_text, c2243941CsC.receiver_preview_text) && C1516540pZE.LJ(this.quote_preview_text, c2243941CsC.quote_preview_text) && C1516540pZE.LJ(this.quote_preview_type, c2243941CsC.quote_preview_type) && C1516540pZE.LJ(this.quote_picture_preview, c2243941CsC.quote_picture_preview) && C1516540pZE.LJ(this.outapp_push_preview, c2243941CsC.outapp_push_preview) && C1516540pZE.LJ(this.inapp_push_preview, c2243941CsC.inapp_push_preview) && C1516540pZE.LJ(this.default_inapp_push_preview, c2243941CsC.default_inapp_push_preview)) {
            return true;
        }
        return false;
    }

    public C2243941CsC(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243521CrW c2243521CrW3, EnumC2243981CsG enumC2243981CsG, C2243901Cs8 c2243901Cs8, C2243521CrW c2243521CrW4, C2243521CrW c2243521CrW5, C2243521CrW c2243521CrW6) {
        this(c2243521CrW, c2243521CrW2, c2243521CrW3, enumC2243981CsG, c2243901Cs8, c2243521CrW4, c2243521CrW5, c2243521CrW6, ByteString.EMPTY);
    }

    public C2243941CsC(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243521CrW c2243521CrW3, EnumC2243981CsG enumC2243981CsG, C2243901Cs8 c2243901Cs8, C2243521CrW c2243521CrW4, C2243521CrW c2243521CrW5, C2243521CrW c2243521CrW6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender_preview_text = c2243521CrW;
        this.receiver_preview_text = c2243521CrW2;
        this.quote_preview_text = c2243521CrW3;
        this.quote_preview_type = enumC2243981CsG;
        this.quote_picture_preview = c2243901Cs8;
        this.outapp_push_preview = c2243521CrW4;
        this.inapp_push_preview = c2243521CrW5;
        this.default_inapp_push_preview = c2243521CrW6;
    }
}
