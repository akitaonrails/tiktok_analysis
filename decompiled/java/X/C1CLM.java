package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLM extends Message<C1CLM, C1CLO> {
    public static final ProtoAdapter<C1CLM> ADAPTER = new ProtoAdapter<C1CLM>() { // from class: X.1CLN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLM decode(ProtoReader protoReader) {
            C1CLO c1clo = new C1CLO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1clo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1clo.LIZLLL = C1CLP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLM c1clm) {
            C1CLM c1clm2 = c1clm;
            return C1CLP.ADAPTER.encodedSizeWithTag(1, c1clm2.ret) + c1clm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLM redact(C1CLM c1clm) {
            C1CLO c1cloNewBuilder = c1clm.newBuilder();
            c1cloNewBuilder.LIZLLL = C1CLP.ADAPTER.redact(c1cloNewBuilder.LIZLLL);
            c1cloNewBuilder.clearUnknownFields();
            return c1cloNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLM c1clm) {
            C1CLM c1clm2 = c1clm;
            C1CLP.ADAPTER.encodeWithTag(protoWriter, 1, c1clm2.ret);
            protoWriter.writeBytes(c1clm2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMediaConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CLP ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLO newBuilder() {
        C1CLO c1clo = new C1CLO();
        c1clo.LIZLLL = this.ret;
        c1clo.addUnknownFields(unknownFields());
        return c1clo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX572c850c15479968{");
        sb.append('}');
        return sb.toString();
    }

    public C1CLM(C1CLP c1clp) {
        this(c1clp, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLM)) {
            return false;
        }
        C1CLM c1clm = (C1CLM) obj;
        if (unknownFields().equals(c1clm.unknownFields()) && this.ret.equals(c1clm.ret)) {
            return true;
        }
        return false;
    }

    public C1CLM(C1CLP c1clp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1clp;
    }
}
