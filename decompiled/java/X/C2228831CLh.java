package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228831CLh extends Message<C2228831CLh, C2228851CLj> {
    public static final ProtoAdapter<C2228831CLh> ADAPTER = new ProtoAdapter<C2228831CLh>() { // from class: X.1CLi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228831CLh decode(ProtoReader protoReader) {
            C2228851CLj c2228851CLj = new C2228851CLj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228851CLj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228851CLj.LIZLLL = C2229171CMp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228851CLj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228831CLh c2228831CLh) {
            C2228831CLh c2228831CLh2 = c2228831CLh;
            return C2229171CMp.ADAPTER.encodedSizeWithTag(1, c2228831CLh2.config) + c2228831CLh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228831CLh redact(C2228831CLh c2228831CLh) {
            C2228851CLj c2228851CLjNewBuilder = c2228831CLh.newBuilder();
            c2228851CLjNewBuilder.LIZLLL = C2229171CMp.ADAPTER.redact(c2228851CLjNewBuilder.LIZLLL);
            c2228851CLjNewBuilder.clearUnknownFields();
            return c2228851CLjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228831CLh c2228831CLh) {
            C2228831CLh c2228831CLh2 = c2228831CLh;
            C2229171CMp.ADAPTER.encodeWithTag(protoWriter, 1, c2228831CLh2.config);
            protoWriter.writeBytes(c2228831CLh2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcMixStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229171CMp config;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228851CLj newBuilder() {
        C2228851CLj c2228851CLj = new C2228851CLj();
        c2228851CLj.LIZLLL = this.config;
        c2228851CLj.addUnknownFields(unknownFields());
        return c2228851CLj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsX1e6a97e78c686c96{");
        sb.append('}');
        return sb.toString();
    }

    public C2228831CLh(C2229171CMp c2229171CMp) {
        this(c2229171CMp, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228831CLh)) {
            return false;
        }
        C2228831CLh c2228831CLh = (C2228831CLh) obj;
        if (unknownFields().equals(c2228831CLh.unknownFields()) && this.config.equals(c2228831CLh.config)) {
            return true;
        }
        return false;
    }

    public C2228831CLh(C2229171CMp c2229171CMp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = c2229171CMp;
    }
}
