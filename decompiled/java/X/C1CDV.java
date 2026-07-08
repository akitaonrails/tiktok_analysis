package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDV extends Message<C1CDV, C1CDX> {
    public static final ProtoAdapter<C1CDV> ADAPTER = new ProtoAdapter<C1CDV>() { // from class: X.1CDW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDV decode(ProtoReader protoReader) {
            C1CDX c1cdx = new C1CDX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cdx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cdx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDV c1cdv) {
            C1CDV c1cdv2 = c1cdv;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cdv2.token) + c1cdv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDV redact(C1CDV c1cdv) {
            C1CDX c1cdxNewBuilder = c1cdv.newBuilder();
            c1cdxNewBuilder.clearUnknownFields();
            return c1cdxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDV c1cdv) {
            C1CDV c1cdv2 = c1cdv;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cdv2.token);
            protoWriter.writeBytes(c1cdv2.unknownFields());
        }
    };
    public static final String DEFAULT_TOKEN = "";
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String token;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CDX newBuilder() {
        C1CDX c1cdx = new C1CDX();
        c1cdx.LIZLLL = this.token;
        c1cdx.addUnknownFields(unknownFields());
        return c1cdx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        sb.replace(0, 2, "FuncParamsX9f8d1b152bb4e31a{");
        sb.append('}');
        return sb.toString();
    }

    public C1CDV(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDV)) {
            return false;
        }
        C1CDV c1cdv = (C1CDV) obj;
        if (unknownFields().equals(c1cdv.unknownFields()) && this.token.equals(c1cdv.token)) {
            return true;
        }
        return false;
    }

    public C1CDV(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
