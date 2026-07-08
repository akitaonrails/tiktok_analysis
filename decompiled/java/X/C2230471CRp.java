package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230471CRp extends Message<C2230471CRp, C2230491CRr> {
    public static final ProtoAdapter<C2230471CRp> ADAPTER = new ProtoAdapter<C2230471CRp>() { // from class: X.1CRq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230471CRp decode(ProtoReader protoReader) {
            C2230491CRr c2230491CRr = new C2230491CRr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230491CRr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230491CRr.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c2230491CRr.LIZLLL = EnumC2231811CWt.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2230491CRr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230491CRr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230471CRp c2230471CRp) {
            C2230471CRp c2230471CRp2 = c2230471CRp;
            return EnumC2231811CWt.ADAPTER.encodedSizeWithTag(1, c2230471CRp2.code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2230471CRp2.msg) + c2230471CRp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230471CRp redact(C2230471CRp c2230471CRp) {
            C2230491CRr c2230491CRrNewBuilder = c2230471CRp.newBuilder();
            c2230491CRrNewBuilder.clearUnknownFields();
            return c2230491CRrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230471CRp c2230471CRp) {
            C2230471CRp c2230471CRp2 = c2230471CRp;
            EnumC2231811CWt.ADAPTER.encodeWithTag(protoWriter, 1, c2230471CRp2.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2230471CRp2.msg);
            protoWriter.writeBytes(c2230471CRp2.unknownFields());
        }
    };
    public static final EnumC2231811CWt DEFAULT_CODE = EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_NO_ERROR;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutErrorCode#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2231811CWt code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String msg;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.code.hashCode()) * 37) + this.msg.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230491CRr newBuilder() {
        C2230491CRr c2230491CRr = new C2230491CRr();
        c2230491CRr.LIZLLL = this.code;
        c2230491CRr.LJ = this.msg;
        c2230491CRr.addUnknownFields(unknownFields());
        return c2230491CRr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", msg=");
        sb.append(this.msg);
        sb.replace(0, 2, "LinkMicLayoutError{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230471CRp)) {
            return false;
        }
        C2230471CRp c2230471CRp = (C2230471CRp) obj;
        if (unknownFields().equals(c2230471CRp.unknownFields()) && this.code.equals(c2230471CRp.code) && this.msg.equals(c2230471CRp.msg)) {
            return true;
        }
        return false;
    }

    public C2230471CRp(EnumC2231811CWt enumC2231811CWt, String str) {
        this(enumC2231811CWt, str, ByteString.EMPTY);
    }

    public C2230471CRp(EnumC2231811CWt enumC2231811CWt, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = enumC2231811CWt;
        this.msg = str;
    }
}
