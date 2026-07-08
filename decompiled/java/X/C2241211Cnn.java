package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241211Cnn extends Message<C2241211Cnn, C2241241Cnq> {
    public static final ProtoAdapter<C2241211Cnn> ADAPTER = new ProtoAdapter<C2241211Cnn>() { // from class: X.1Cnp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241211Cnn decode(ProtoReader protoReader) {
            C2241241Cnq c2241241Cnq = new C2241241Cnq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2241241Cnq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2241241Cnq.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2241241Cnq.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2241241Cnq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241241Cnq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241211Cnn c2241211Cnn) {
            C2241211Cnn c2241211Cnn2 = c2241211Cnn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241211Cnn2.code) + protoAdapter.encodedSizeWithTag(2, c2241211Cnn2.message) + protoAdapter.encodedSizeWithTag(3, c2241211Cnn2.detail) + c2241211Cnn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241211Cnn redact(C2241211Cnn c2241211Cnn) {
            C2241241Cnq c2241241CnqNewBuilder = c2241211Cnn.newBuilder();
            c2241241CnqNewBuilder.clearUnknownFields();
            return c2241241CnqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241211Cnn c2241211Cnn) {
            C2241211Cnn c2241211Cnn2 = c2241211Cnn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241211Cnn2.code);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241211Cnn2.message);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241211Cnn2.detail);
            protoWriter.writeBytes(c2241211Cnn2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.code.hashCode()) * 37) + this.message.hashCode()) * 37;
        String str = this.detail;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2241241Cnq newBuilder() {
        C2241241Cnq c2241241Cnq = new C2241241Cnq();
        c2241241Cnq.LIZLLL = this.code;
        c2241241Cnq.LJ = this.message;
        c2241241Cnq.LJFF = this.detail;
        c2241241Cnq.addUnknownFields(unknownFields());
        return c2241241Cnq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        if (this.detail != null) {
            sb.append(", detail=");
            sb.append(this.detail);
        }
        sb.replace(0, 2, "VisualPoetErrorInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241211Cnn)) {
            return false;
        }
        C2241211Cnn c2241211Cnn = (C2241211Cnn) obj;
        if (unknownFields().equals(c2241211Cnn.unknownFields()) && this.code.equals(c2241211Cnn.code) && this.message.equals(c2241211Cnn.message) && C1516540pZE.LJ(this.detail, c2241211Cnn.detail)) {
            return true;
        }
        return false;
    }

    public C2241211Cnn(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C2241211Cnn(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = str;
        this.message = str2;
        this.detail = str3;
    }
}
