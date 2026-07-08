package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236331Cfv extends Message<C2236331Cfv, C2236351Cfx> {
    public static final ProtoAdapter<C2236331Cfv> ADAPTER = new ProtoAdapter<C2236331Cfv>() { // from class: X.1Cfw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236331Cfv decode(ProtoReader protoReader) {
            C2236351Cfx c2236351Cfx = new C2236351Cfx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2236351Cfx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2236351Cfx.LJII = C2236421Cg4.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2236351Cfx.LJI = C2232021CXo.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2236351Cfx.LJFF = C2232021CXo.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2236351Cfx.LJ = EnumC2231981CXk.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236351Cfx.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2236351Cfx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236351Cfx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236331Cfv c2236331Cfv) {
            C2236331Cfv c2236331Cfv2 = c2236331Cfv;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2236331Cfv2.invoke_id) + EnumC2231981CXk.ADAPTER.encodedSizeWithTag(2, c2236331Cfv2.reply_type);
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2236331Cfv2.invitor) + protoAdapter.encodedSizeWithTag(4, c2236331Cfv2.operator_p) + C2236421Cg4.ADAPTER.encodedSizeWithTag(5, c2236331Cfv2.biz_params) + c2236331Cfv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236331Cfv redact(C2236331Cfv c2236331Cfv) {
            C2236351Cfx c2236351CfxNewBuilder = c2236331Cfv.newBuilder();
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            c2236351CfxNewBuilder.LJFF = protoAdapter.redact(c2236351CfxNewBuilder.LJFF);
            c2236351CfxNewBuilder.LJI = protoAdapter.redact(c2236351CfxNewBuilder.LJI);
            c2236351CfxNewBuilder.LJII = C2236421Cg4.ADAPTER.redact(c2236351CfxNewBuilder.LJII);
            c2236351CfxNewBuilder.clearUnknownFields();
            return c2236351CfxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236331Cfv c2236331Cfv) {
            C2236331Cfv c2236331Cfv2 = c2236331Cfv;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2236331Cfv2.invoke_id);
            EnumC2231981CXk.ADAPTER.encodeWithTag(protoWriter, 2, c2236331Cfv2.reply_type);
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c2236331Cfv2.invitor);
            protoAdapter.encodeWithTag(protoWriter, 4, c2236331Cfv2.operator_p);
            C2236421Cg4.ADAPTER.encodeWithTag(protoWriter, 5, c2236331Cfv2.biz_params);
            protoWriter.writeBytes(c2236331Cfv2.unknownFields());
        }
    };
    public static final EnumC2231981CXk DEFAULT_REPLY_TYPE = EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizReplyParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C2236421Cg4 biz_params;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2232021CXo invitor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2232021CXo operator_p;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAgreeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2231981CXk reply_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.reply_type.hashCode()) * 37) + this.invitor.hashCode()) * 37) + this.operator_p.hashCode()) * 37) + this.biz_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236351Cfx newBuilder() {
        C2236351Cfx c2236351Cfx = new C2236351Cfx();
        c2236351Cfx.LIZLLL = this.invoke_id;
        c2236351Cfx.LJ = this.reply_type;
        c2236351Cfx.LJFF = this.invitor;
        c2236351Cfx.LJI = this.operator_p;
        c2236351Cfx.LJII = this.biz_params;
        c2236351Cfx.addUnknownFields(unknownFields());
        return c2236351Cfx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", reply_type=");
        sb.append(this.reply_type);
        sb.append(", invitor=");
        sb.append(this.invitor);
        sb.append(", operator_p=");
        sb.append(this.operator_p);
        sb.append(", biz_params=");
        sb.append(this.biz_params);
        sb.replace(0, 2, "LinkMicReplyParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236331Cfv)) {
            return false;
        }
        C2236331Cfv c2236331Cfv = (C2236331Cfv) obj;
        if (unknownFields().equals(c2236331Cfv.unknownFields()) && this.invoke_id.equals(c2236331Cfv.invoke_id) && this.reply_type.equals(c2236331Cfv.reply_type) && this.invitor.equals(c2236331Cfv.invitor) && this.operator_p.equals(c2236331Cfv.operator_p) && this.biz_params.equals(c2236331Cfv.biz_params)) {
            return true;
        }
        return false;
    }

    public C2236331Cfv(String str, EnumC2231981CXk enumC2231981CXk, C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2236421Cg4 c2236421Cg4) {
        this(str, enumC2231981CXk, c2232021CXo, c2232021CXo2, c2236421Cg4, ByteString.EMPTY);
    }

    public C2236331Cfv(String str, EnumC2231981CXk enumC2231981CXk, C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2236421Cg4 c2236421Cg4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.reply_type = enumC2231981CXk;
        this.invitor = c2232021CXo;
        this.operator_p = c2232021CXo2;
        this.biz_params = c2236421Cg4;
    }
}
