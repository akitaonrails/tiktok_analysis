package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLS extends Message<C1CLS, C1CLU> {
    public static final ProtoAdapter<C1CLS> ADAPTER = new ProtoAdapter<C1CLS>() { // from class: X.1CLT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLS decode(ProtoReader protoReader) {
            C1CLU c1clu = new C1CLU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1clu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1clu.LIZLLL = C1CLV.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLS c1cls) {
            C1CLS c1cls2 = c1cls;
            return C1CLV.ADAPTER.encodedSizeWithTag(1, c1cls2.ret) + c1cls2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLS redact(C1CLS c1cls) {
            C1CLU c1cluNewBuilder = c1cls.newBuilder();
            c1cluNewBuilder.LIZLLL = C1CLV.ADAPTER.redact(c1cluNewBuilder.LIZLLL);
            c1cluNewBuilder.clearUnknownFields();
            return c1cluNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLS c1cls) {
            C1CLS c1cls2 = c1cls;
            C1CLV.ADAPTER.encodeWithTag(protoWriter, 1, c1cls2.ret);
            protoWriter.writeBytes(c1cls2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcAuxStreamInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CLV ret;

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
    public C1CLU newBuilder() {
        C1CLU c1clu = new C1CLU();
        c1clu.LIZLLL = this.ret;
        c1clu.addUnknownFields(unknownFields());
        return c1clu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnXd12761006ecbeeef{");
        sb.append('}');
        return sb.toString();
    }

    public C1CLS(C1CLV c1clv) {
        this(c1clv, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLS)) {
            return false;
        }
        C1CLS c1cls = (C1CLS) obj;
        if (unknownFields().equals(c1cls.unknownFields()) && this.ret.equals(c1cls.ret)) {
            return true;
        }
        return false;
    }

    public C1CLS(C1CLV c1clv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1clv;
    }
}
