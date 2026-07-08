package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMG extends Message<C1CMG, C1CMI> {
    public static final ProtoAdapter<C1CMG> ADAPTER = new ProtoAdapter<C1CMG>() { // from class: X.1CMH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMG decode(ProtoReader protoReader) {
            C1CMI c1cmi = new C1CMI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cmi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cmi.LIZLLL = C1CMD.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMG c1cmg) {
            C1CMG c1cmg2 = c1cmg;
            return C1CMD.ADAPTER.encodedSizeWithTag(1, c1cmg2.res) + c1cmg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMG redact(C1CMG c1cmg) {
            C1CMI c1cmiNewBuilder = c1cmg.newBuilder();
            c1cmiNewBuilder.LIZLLL = C1CMD.ADAPTER.redact(c1cmiNewBuilder.LIZLLL);
            c1cmiNewBuilder.clearUnknownFields();
            return c1cmiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMG c1cmg) {
            C1CMG c1cmg2 = c1cmg;
            C1CMD.ADAPTER.encodeWithTag(protoWriter, 1, c1cmg2.res);
            protoWriter.writeBytes(c1cmg2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicReqFailedModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CMD res;

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
    public C1CMI newBuilder() {
        C1CMI c1cmi = new C1CMI();
        c1cmi.LIZLLL = this.res;
        c1cmi.addUnknownFields(unknownFields());
        return c1cmi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", res=");
        sb.append(this.res);
        sb.replace(0, 2, "FuncParamsXe26f79d0f3219713{");
        sb.append('}');
        return sb.toString();
    }

    public C1CMG(C1CMD c1cmd) {
        this(c1cmd, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMG)) {
            return false;
        }
        C1CMG c1cmg = (C1CMG) obj;
        if (unknownFields().equals(c1cmg.unknownFields()) && this.res.equals(c1cmg.res)) {
            return true;
        }
        return false;
    }

    public C1CMG(C1CMD c1cmd, ByteString byteString) {
        super(ADAPTER, byteString);
        this.res = c1cmd;
    }
}
