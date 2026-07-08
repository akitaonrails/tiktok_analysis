package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229051CMd extends Message<C2229051CMd, C2229071CMf> {
    public static final ProtoAdapter<C2229051CMd> ADAPTER = new ProtoAdapter<C2229051CMd>() { // from class: X.1CMe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229051CMd decode(ProtoReader protoReader) {
            C2229071CMf c2229071CMf = new C2229071CMf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229071CMf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229071CMf.LIZLLL = C1CMY.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229071CMf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229051CMd c2229051CMd) {
            C2229051CMd c2229051CMd2 = c2229051CMd;
            return C1CMY.ADAPTER.encodedSizeWithTag(1, c2229051CMd2.response) + c2229051CMd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229051CMd redact(C2229051CMd c2229051CMd) {
            C2229071CMf c2229071CMfNewBuilder = c2229051CMd.newBuilder();
            c2229071CMfNewBuilder.LIZLLL = C1CMY.ADAPTER.redact(c2229071CMfNewBuilder.LIZLLL);
            c2229071CMfNewBuilder.clearUnknownFields();
            return c2229071CMfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229051CMd c2229051CMd) {
            C2229051CMd c2229051CMd2 = c2229051CMd;
            C1CMY.ADAPTER.encodeWithTag(protoWriter, 1, c2229051CMd2.response);
            protoWriter.writeBytes(c2229051CMd2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicResponse#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CMY response;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.response.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229071CMf newBuilder() {
        C2229071CMf c2229071CMf = new C2229071CMf();
        c2229071CMf.LIZLLL = this.response;
        c2229071CMf.addUnknownFields(unknownFields());
        return c2229071CMf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", response=");
        sb.append(this.response);
        sb.replace(0, 2, "FuncParamsXe476ee99d0922e40{");
        sb.append('}');
        return sb.toString();
    }

    public C2229051CMd(C1CMY c1cmy) {
        this(c1cmy, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229051CMd)) {
            return false;
        }
        C2229051CMd c2229051CMd = (C2229051CMd) obj;
        if (unknownFields().equals(c2229051CMd.unknownFields()) && this.response.equals(c2229051CMd.response)) {
            return true;
        }
        return false;
    }

    public C2229051CMd(C1CMY c1cmy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.response = c1cmy;
    }
}
