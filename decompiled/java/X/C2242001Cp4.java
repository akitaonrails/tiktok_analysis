package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242001Cp4 extends Message<C2242001Cp4, C2242021Cp6> {
    public static final ProtoAdapter<C2242001Cp4> ADAPTER = new ProtoAdapter<C2242001Cp4>() { // from class: X.1Cp5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242001Cp4 decode(ProtoReader protoReader) {
            C2242021Cp6 c2242021Cp6 = new C2242021Cp6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 200) {
                                            if (iNextTag != 201) {
                                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                c2242021Cp6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            } else {
                                                c2242021Cp6.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2242021Cp6.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2242021Cp6.LJII = C2243941CsC.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2242021Cp6.LJI = C2243521CrW.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2242021Cp6.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2242021Cp6.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242021Cp6.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242021Cp6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242001Cp4 c2242001Cp4) {
            C2242001Cp4 c2242001Cp42 = c2242001Cp4;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2242001Cp42.plain_notice) + protoAdapter.encodedSizeWithTag(2, c2242001Cp42.interactive_notice) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2242001Cp42.query_message_id) + protoAdapter.encodedSizeWithTag(4, c2242001Cp42.query_content) + C2243941CsC.ADAPTER.encodedSizeWithTag(5, c2242001Cp42.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242001Cp42.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242001Cp42.resp_base) + c2242001Cp42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242001Cp4 redact(C2242001Cp4 c2242001Cp4) {
            C2242021Cp6 c2242021Cp6NewBuilder = c2242001Cp4.newBuilder();
            C2243521CrW c2243521CrW = c2242021Cp6NewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2242021Cp6NewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2242021Cp6NewBuilder.LJ;
            if (c2243521CrW2 != null) {
                c2242021Cp6NewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2243521CrW c2243521CrW3 = c2242021Cp6NewBuilder.LJI;
            if (c2243521CrW3 != null) {
                c2242021Cp6NewBuilder.LJI = C2243521CrW.ADAPTER.redact(c2243521CrW3);
            }
            C2243941CsC c2243941CsC = c2242021Cp6NewBuilder.LJII;
            if (c2243941CsC != null) {
                c2242021Cp6NewBuilder.LJII = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2242021Cp6NewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2242021Cp6NewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242021Cp6NewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2242021Cp6NewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242021Cp6NewBuilder.clearUnknownFields();
            return c2242021Cp6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242001Cp4 c2242001Cp4) {
            C2242001Cp4 c2242001Cp42 = c2242001Cp4;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2242001Cp42.plain_notice);
            protoAdapter.encodeWithTag(protoWriter, 2, c2242001Cp42.interactive_notice);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2242001Cp42.query_message_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c2242001Cp42.query_content);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 5, c2242001Cp42.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242001Cp42.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242001Cp42.resp_base);
            protoWriter.writeBytes(c2242001Cp42.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW interactive_notice;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW plain_notice;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 5)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 4)
    public final C2243521CrW query_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String query_message_id;

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
        C2243521CrW c2243521CrW = this.plain_notice;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.interactive_notice;
        int iHashCode3 = (iHashCode2 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        String str = this.query_message_id;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW3 = this.query_content;
        int iHashCode5 = (iHashCode4 + (c2243521CrW3 != null ? c2243521CrW3.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode6 = (iHashCode5 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode7 = (iHashCode6 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode8 = iHashCode7 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2242021Cp6 newBuilder() {
        C2242021Cp6 c2242021Cp6 = new C2242021Cp6();
        c2242021Cp6.LIZLLL = this.plain_notice;
        c2242021Cp6.LJ = this.interactive_notice;
        c2242021Cp6.LJFF = this.query_message_id;
        c2242021Cp6.LJI = this.query_content;
        c2242021Cp6.LJII = this.preview_hint;
        c2242021Cp6.LJIIIIZZ = this.req_base;
        c2242021Cp6.LJIIIZ = this.resp_base;
        c2242021Cp6.addUnknownFields(unknownFields());
        return c2242021Cp6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.plain_notice != null) {
            sb.append(", plain_notice=");
            sb.append(this.plain_notice);
        }
        if (this.interactive_notice != null) {
            sb.append(", interactive_notice=");
            sb.append(this.interactive_notice);
        }
        if (this.query_message_id != null) {
            sb.append(", query_message_id=");
            sb.append(this.query_message_id);
        }
        if (this.query_content != null) {
            sb.append(", query_content=");
            sb.append(this.query_content);
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
        sb.replace(0, 2, "InteractiveNoticeCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242001Cp4)) {
            return false;
        }
        C2242001Cp4 c2242001Cp4 = (C2242001Cp4) obj;
        if (unknownFields().equals(c2242001Cp4.unknownFields()) && C1516540pZE.LJ(this.plain_notice, c2242001Cp4.plain_notice) && C1516540pZE.LJ(this.interactive_notice, c2242001Cp4.interactive_notice) && C1516540pZE.LJ(this.query_message_id, c2242001Cp4.query_message_id) && C1516540pZE.LJ(this.query_content, c2242001Cp4.query_content) && C1516540pZE.LJ(this.preview_hint, c2242001Cp4.preview_hint) && C1516540pZE.LJ(this.req_base, c2242001Cp4.req_base) && C1516540pZE.LJ(this.resp_base, c2242001Cp4.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242001Cp4(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, String str, C2243521CrW c2243521CrW3, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243521CrW, c2243521CrW2, str, c2243521CrW3, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242001Cp4(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, String str, C2243521CrW c2243521CrW3, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.plain_notice = c2243521CrW;
        this.interactive_notice = c2243521CrW2;
        this.query_message_id = str;
        this.query_content = c2243521CrW3;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
