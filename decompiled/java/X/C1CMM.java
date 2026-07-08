package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMM extends Message<C1CMM, C1CMO> {
    public static final ProtoAdapter<C1CMM> ADAPTER = new ProtoAdapter<C1CMM>() { // from class: X.1CMN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMM decode(ProtoReader protoReader) {
            C1CMO c1cmo = new C1CMO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cmo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cmo.LIZLLL = C1CMP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMM c1cmm) {
            C1CMM c1cmm2 = c1cmm;
            return C1CMP.ADAPTER.encodedSizeWithTag(1, c1cmm2.res) + c1cmm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMM redact(C1CMM c1cmm) {
            C1CMO c1cmoNewBuilder = c1cmm.newBuilder();
            c1cmoNewBuilder.LIZLLL = C1CMP.ADAPTER.redact(c1cmoNewBuilder.LIZLLL);
            c1cmoNewBuilder.clearUnknownFields();
            return c1cmoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMM c1cmm) {
            C1CMM c1cmm2 = c1cmm;
            C1CMP.ADAPTER.encodeWithTag(protoWriter, 1, c1cmm2.res);
            protoWriter.writeBytes(c1cmm2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicReqSuccessModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CMP res;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.res.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CMO newBuilder() {
        C1CMO c1cmo = new C1CMO();
        c1cmo.LIZLLL = this.res;
        c1cmo.addUnknownFields(unknownFields());
        return c1cmo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", res=");
        sb.append(this.res);
        sb.replace(0, 2, "FuncParamsXf53ab4c7bda9d297{");
        sb.append('}');
        return sb.toString();
    }

    public C1CMM(C1CMP c1cmp) {
        this(c1cmp, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMM)) {
            return false;
        }
        C1CMM c1cmm = (C1CMM) obj;
        if (unknownFields().equals(c1cmm.unknownFields()) && this.res.equals(c1cmm.res)) {
            return true;
        }
        return false;
    }

    public C1CMM(C1CMP c1cmp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.res = c1cmp;
    }
}
