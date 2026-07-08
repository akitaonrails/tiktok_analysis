package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243171Cqx extends Message<C2243171Cqx, C2243231Cr3> {
    public static final ProtoAdapter<C2243171Cqx> ADAPTER = new ProtoAdapter<C2243171Cqx>() { // from class: X.1Cqy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243171Cqx decode(ProtoReader protoReader) {
            C2243231Cr3 c2243231Cr3 = new C2243231Cr3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 101) {
                                if (iNextTag != 200) {
                                    if (iNextTag != 201) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2243231Cr3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2243231Cr3.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2243231Cr3.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2243231Cr3.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243231Cr3.LJ = C2243191Cqz.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243231Cr3.LIZLLL = C2243211Cr1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243231Cr3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243171Cqx c2243171Cqx) {
            C2243171Cqx c2243171Cqx2 = c2243171Cqx;
            return C2243211Cr1.ADAPTER.encodedSizeWithTag(1, c2243171Cqx2.fortune_cookie_info) + C2243191Cqz.ADAPTER.encodedSizeWithTag(2, c2243171Cqx2.greeting_card_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(101, c2243171Cqx2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2243171Cqx2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2243171Cqx2.resp_base) + c2243171Cqx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243171Cqx redact(C2243171Cqx c2243171Cqx) {
            C2243231Cr3 c2243231Cr3NewBuilder = c2243171Cqx.newBuilder();
            C2243211Cr1 c2243211Cr1 = c2243231Cr3NewBuilder.LIZLLL;
            if (c2243211Cr1 != null) {
                c2243231Cr3NewBuilder.LIZLLL = C2243211Cr1.ADAPTER.redact(c2243211Cr1);
            }
            C2243191Cqz c2243191Cqz = c2243231Cr3NewBuilder.LJ;
            if (c2243191Cqz != null) {
                c2243231Cr3NewBuilder.LJ = C2243191Cqz.ADAPTER.redact(c2243191Cqz);
            }
            C2243941CsC c2243941CsC = c2243231Cr3NewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2243231Cr3NewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2243231Cr3NewBuilder.LJI;
            if (c1ch0 != null) {
                c2243231Cr3NewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243231Cr3NewBuilder.LJII;
            if (c2241571CoN != null) {
                c2243231Cr3NewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243231Cr3NewBuilder.clearUnknownFields();
            return c2243231Cr3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243171Cqx c2243171Cqx) {
            C2243171Cqx c2243171Cqx2 = c2243171Cqx;
            C2243211Cr1.ADAPTER.encodeWithTag(protoWriter, 1, c2243171Cqx2.fortune_cookie_info);
            C2243191Cqz.ADAPTER.encodeWithTag(protoWriter, 2, c2243171Cqx2.greeting_card_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 101, c2243171Cqx2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2243171Cqx2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2243171Cqx2.resp_base);
            protoWriter.writeBytes(c2243171Cqx2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FortuneCookieInfo#ADAPTER", tag = 1)
    public final C2243211Cr1 fortune_cookie_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GreetingCardInfo#ADAPTER", tag = 2)
    public final C2243191Cqz greeting_card_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 101)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243211Cr1 c2243211Cr1 = this.fortune_cookie_info;
        int iHashCode2 = (iHashCode + (c2243211Cr1 != null ? c2243211Cr1.hashCode() : 0)) * 37;
        C2243191Cqz c2243191Cqz = this.greeting_card_info;
        int iHashCode3 = (iHashCode2 + (c2243191Cqz != null ? c2243191Cqz.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode4 = (iHashCode3 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode5 = (iHashCode4 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode6 = iHashCode5 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2243231Cr3 newBuilder() {
        C2243231Cr3 c2243231Cr3 = new C2243231Cr3();
        c2243231Cr3.LIZLLL = this.fortune_cookie_info;
        c2243231Cr3.LJ = this.greeting_card_info;
        c2243231Cr3.LJFF = this.preview_hint;
        c2243231Cr3.LJI = this.req_base;
        c2243231Cr3.LJII = this.resp_base;
        c2243231Cr3.addUnknownFields(unknownFields());
        return c2243231Cr3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fortune_cookie_info != null) {
            sb.append(", fortune_cookie_info=");
            sb.append(this.fortune_cookie_info);
        }
        if (this.greeting_card_info != null) {
            sb.append(", greeting_card_info=");
            sb.append(this.greeting_card_info);
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
        sb.replace(0, 2, "InteractionCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243171Cqx)) {
            return false;
        }
        C2243171Cqx c2243171Cqx = (C2243171Cqx) obj;
        if (unknownFields().equals(c2243171Cqx.unknownFields()) && C1516540pZE.LJ(this.fortune_cookie_info, c2243171Cqx.fortune_cookie_info) && C1516540pZE.LJ(this.greeting_card_info, c2243171Cqx.greeting_card_info) && C1516540pZE.LJ(this.preview_hint, c2243171Cqx.preview_hint) && C1516540pZE.LJ(this.req_base, c2243171Cqx.req_base) && C1516540pZE.LJ(this.resp_base, c2243171Cqx.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243171Cqx(C2243211Cr1 c2243211Cr1, C2243191Cqz c2243191Cqz, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243211Cr1, c2243191Cqz, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243171Cqx(C2243211Cr1 c2243211Cr1, C2243191Cqz c2243191Cqz, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fortune_cookie_info = c2243211Cr1;
        this.greeting_card_info = c2243191Cqz;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
