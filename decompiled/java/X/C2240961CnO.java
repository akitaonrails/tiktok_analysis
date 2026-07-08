package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240961CnO extends Message<C2240961CnO, C2240951CnN> {
    public static final ProtoAdapter<C2240961CnO> ADAPTER = new ProtoAdapter<C2240961CnO>() { // from class: X.1CnP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240961CnO decode(ProtoReader protoReader) {
            C2240951CnN c2240951CnN = new C2240951CnN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 200) {
                                    if (iNextTag != 201) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2240951CnN.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2240951CnN.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2240951CnN.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2240951CnN.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2240951CnN.LJ = C2243941CsC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2240951CnN.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240951CnN.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240961CnO c2240961CnO) {
            C2240961CnO c2240961CnO2 = c2240961CnO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2240961CnO2.raw) + C2243941CsC.ADAPTER.encodedSizeWithTag(2, c2240961CnO2.preview_hint) + protoAdapter.encodedSizeWithTag(3, c2240961CnO2.context) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2240961CnO2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2240961CnO2.resp_base) + c2240961CnO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240961CnO redact(C2240961CnO c2240961CnO) {
            C2240951CnN c2240951CnNNewBuilder = c2240961CnO.newBuilder();
            C2243941CsC c2243941CsC = c2240951CnNNewBuilder.LJ;
            if (c2243941CsC != null) {
                c2240951CnNNewBuilder.LJ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2240951CnNNewBuilder.LJI;
            if (c1ch0 != null) {
                c2240951CnNNewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2240951CnNNewBuilder.LJII;
            if (c2241571CoN != null) {
                c2240951CnNNewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2240951CnNNewBuilder.clearUnknownFields();
            return c2240951CnNNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240961CnO c2240961CnO) {
            C2240961CnO c2240961CnO2 = c2240961CnO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2240961CnO2.raw);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 2, c2240961CnO2.preview_hint);
            protoAdapter.encodeWithTag(protoWriter, 3, c2240961CnO2.context);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2240961CnO2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2240961CnO2.resp_base);
            protoWriter.writeBytes(c2240961CnO2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String context;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String raw;

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
        String str = this.raw;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        String str2 = this.context;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode5 = (iHashCode4 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode6 = iHashCode5 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2240951CnN newBuilder() {
        C2240951CnN c2240951CnN = new C2240951CnN();
        c2240951CnN.LIZLLL = this.raw;
        c2240951CnN.LJ = this.preview_hint;
        c2240951CnN.LJFF = this.context;
        c2240951CnN.LJI = this.req_base;
        c2240951CnN.LJII = this.resp_base;
        c2240951CnN.addUnknownFields(unknownFields());
        return c2240951CnN;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.raw != null) {
            sb.append(", raw=");
            sb.append(this.raw);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.context != null) {
            sb.append(", context=");
            sb.append(this.context);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "MarkdownCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240961CnO)) {
            return false;
        }
        C2240961CnO c2240961CnO = (C2240961CnO) obj;
        if (unknownFields().equals(c2240961CnO.unknownFields()) && C1516540pZE.LJ(this.raw, c2240961CnO.raw) && C1516540pZE.LJ(this.preview_hint, c2240961CnO.preview_hint) && C1516540pZE.LJ(this.context, c2240961CnO.context) && C1516540pZE.LJ(this.req_base, c2240961CnO.req_base) && C1516540pZE.LJ(this.resp_base, c2240961CnO.resp_base)) {
            return true;
        }
        return false;
    }

    public C2240961CnO(String str, C2243941CsC c2243941CsC, String str2, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(str, c2243941CsC, str2, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2240961CnO(String str, C2243941CsC c2243941CsC, String str2, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.raw = str;
        this.preview_hint = c2243941CsC;
        this.context = str2;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
