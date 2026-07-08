package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228711CKv extends Message<C2228711CKv, C2228731CKx> {
    public static final ProtoAdapter<C2228711CKv> ADAPTER = new ProtoAdapter<C2228711CKv>() { // from class: X.1CKw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228711CKv decode(ProtoReader protoReader) {
            C2228731CKx c2228731CKx = new C2228731CKx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228731CKx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228731CKx.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2228731CKx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228731CKx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228711CKv c2228711CKv) {
            C2228711CKv c2228711CKv2 = c2228711CKv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2228711CKv2.cdid) + protoAdapter.encodedSizeWithTag(2, c2228711CKv2.config) + c2228711CKv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228711CKv redact(C2228711CKv c2228711CKv) {
            C2228731CKx c2228731CKxNewBuilder = c2228711CKv.newBuilder();
            c2228731CKxNewBuilder.clearUnknownFields();
            return c2228731CKxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228711CKv c2228711CKv) {
            C2228711CKv c2228711CKv2 = c2228711CKv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228711CKv2.cdid);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228711CKv2.config);
            protoWriter.writeBytes(c2228711CKv2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String cdid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String config;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.cdid.hashCode()) * 37) + this.config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228731CKx newBuilder() {
        C2228731CKx c2228731CKx = new C2228731CKx();
        c2228731CKx.LIZLLL = this.cdid;
        c2228731CKx.LJ = this.config;
        c2228731CKx.addUnknownFields(unknownFields());
        return c2228731CKx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cdid=");
        sb.append(this.cdid);
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsXbe4b8e0afe1bbe0f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228711CKv)) {
            return false;
        }
        C2228711CKv c2228711CKv = (C2228711CKv) obj;
        if (unknownFields().equals(c2228711CKv.unknownFields()) && this.cdid.equals(c2228711CKv.cdid) && this.config.equals(c2228711CKv.config)) {
            return true;
        }
        return false;
    }

    public C2228711CKv(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2228711CKv(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cdid = str;
        this.config = str2;
    }
}
