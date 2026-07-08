package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230441CRm extends Message<C2230441CRm, C2230461CRo> {
    public static final ProtoAdapter<C2230441CRm> ADAPTER = new ProtoAdapter<C2230441CRm>() { // from class: X.1CRn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230441CRm decode(ProtoReader protoReader) {
            C2230461CRo c2230461CRo = new C2230461CRo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2230461CRo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2230461CRo.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2230461CRo.LJ = EnumC2231811CWt.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2230461CRo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2230461CRo.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230461CRo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230441CRm c2230441CRm) {
            C2230441CRm c2230441CRm2 = c2230441CRm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2230441CRm2.switch_id) + EnumC2231811CWt.ADAPTER.encodedSizeWithTag(2, c2230441CRm2.code) + protoAdapter.encodedSizeWithTag(3, c2230441CRm2.message) + c2230441CRm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230441CRm redact(C2230441CRm c2230441CRm) {
            C2230461CRo c2230461CRoNewBuilder = c2230441CRm.newBuilder();
            c2230461CRoNewBuilder.clearUnknownFields();
            return c2230461CRoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230441CRm c2230441CRm) {
            C2230441CRm c2230441CRm2 = c2230441CRm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230441CRm2.switch_id);
            EnumC2231811CWt.ADAPTER.encodeWithTag(protoWriter, 2, c2230441CRm2.code);
            protoAdapter.encodeWithTag(protoWriter, 3, c2230441CRm2.message);
            protoWriter.writeBytes(c2230441CRm2.unknownFields());
        }
    };
    public static final EnumC2231811CWt DEFAULT_CODE = EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_NO_ERROR;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutErrorCode#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2231811CWt code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String switch_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.switch_id.hashCode()) * 37) + this.code.hashCode()) * 37;
        String str = this.message;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2230461CRo newBuilder() {
        C2230461CRo c2230461CRo = new C2230461CRo();
        c2230461CRo.LIZLLL = this.switch_id;
        c2230461CRo.LJ = this.code;
        c2230461CRo.LJFF = this.message;
        c2230461CRo.addUnknownFields(unknownFields());
        return c2230461CRo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", switch_id=");
        sb.append(this.switch_id);
        sb.append(", code=");
        sb.append(this.code);
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        sb.replace(0, 2, "FuncParamsX449e99bf1ee98502{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230441CRm)) {
            return false;
        }
        C2230441CRm c2230441CRm = (C2230441CRm) obj;
        if (unknownFields().equals(c2230441CRm.unknownFields()) && this.switch_id.equals(c2230441CRm.switch_id) && this.code.equals(c2230441CRm.code) && C1516540pZE.LJ(this.message, c2230441CRm.message)) {
            return true;
        }
        return false;
    }

    public C2230441CRm(String str, EnumC2231811CWt enumC2231811CWt, String str2) {
        this(str, enumC2231811CWt, str2, ByteString.EMPTY);
    }

    public C2230441CRm(String str, EnumC2231811CWt enumC2231811CWt, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_id = str;
        this.code = enumC2231811CWt;
        this.message = str2;
    }
}
