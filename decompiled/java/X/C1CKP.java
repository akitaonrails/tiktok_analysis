package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKP extends Message<C1CKP, C1CKQ> {
    public static final ProtoAdapter<C1CKP> ADAPTER = new ProtoAdapter<C1CKP>() { // from class: X.1CKO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKP decode(ProtoReader protoReader) {
            C1CKQ c1ckq = new C1CKQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1ckq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1ckq.LJFF = C2227531CGh.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c1ckq.LJ = EnumC1282030jSz.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1ckq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1ckq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CKP c1ckp) {
            C1CKP c1ckp2 = c1ckp;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1ckp2.invoke_id) + EnumC1282030jSz.ADAPTER.encodedSizeWithTag(2, c1ckp2.leave_reason) + C2227531CGh.ADAPTER.encodedSizeWithTag(3, c1ckp2.biz_params) + c1ckp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKP redact(C1CKP c1ckp) {
            C1CKQ c1ckqNewBuilder = c1ckp.newBuilder();
            C2227531CGh c2227531CGh = c1ckqNewBuilder.LJFF;
            if (c2227531CGh != null) {
                c1ckqNewBuilder.LJFF = C2227531CGh.ADAPTER.redact(c2227531CGh);
            }
            c1ckqNewBuilder.clearUnknownFields();
            return c1ckqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CKP c1ckp) {
            C1CKP c1ckp2 = c1ckp;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1ckp2.invoke_id);
            EnumC1282030jSz.ADAPTER.encodeWithTag(protoWriter, 2, c1ckp2.leave_reason);
            C2227531CGh.ADAPTER.encodeWithTag(protoWriter, 3, c1ckp2.biz_params);
            protoWriter.writeBytes(c1ckp2.unknownFields());
        }
    };
    public static final EnumC1282030jSz DEFAULT_LEAVE_REASON = EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizLeaveParams#ADAPTER", tag = 3)
    public final C2227531CGh biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLeaveReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1282030jSz leave_reason;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.leave_reason.hashCode()) * 37;
        C2227531CGh c2227531CGh = this.biz_params;
        int iHashCode2 = iHashCode + (c2227531CGh != null ? c2227531CGh.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CKQ newBuilder() {
        C1CKQ c1ckq = new C1CKQ();
        c1ckq.LIZLLL = this.invoke_id;
        c1ckq.LJ = this.leave_reason;
        c1ckq.LJFF = this.biz_params;
        c1ckq.addUnknownFields(unknownFields());
        return c1ckq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", leave_reason=");
        sb.append(this.leave_reason);
        if (this.biz_params != null) {
            sb.append(", biz_params=");
            sb.append(this.biz_params);
        }
        sb.replace(0, 2, "LinkMicLeaveParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CKP)) {
            return false;
        }
        C1CKP c1ckp = (C1CKP) obj;
        if (unknownFields().equals(c1ckp.unknownFields()) && this.invoke_id.equals(c1ckp.invoke_id) && this.leave_reason.equals(c1ckp.leave_reason) && C1516540pZE.LJ(this.biz_params, c1ckp.biz_params)) {
            return true;
        }
        return false;
    }

    public C1CKP(String str, EnumC1282030jSz enumC1282030jSz, C2227531CGh c2227531CGh) {
        this(str, enumC1282030jSz, c2227531CGh, ByteString.EMPTY);
    }

    public C1CKP(String str, EnumC1282030jSz enumC1282030jSz, C2227531CGh c2227531CGh, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.leave_reason = enumC1282030jSz;
        this.biz_params = c2227531CGh;
    }
}
