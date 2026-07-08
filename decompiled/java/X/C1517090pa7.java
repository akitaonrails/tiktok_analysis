package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pa7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517090pa7 extends Message<C1517090pa7, C1517110pa9> {
    public static final ProtoAdapter<C1517090pa7> ADAPTER = new ProtoAdapter<C1517090pa7>() { // from class: X.0pa8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517090pa7 decode(ProtoReader protoReader) {
            C1517110pa9 c1517110pa9 = new C1517110pa9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1517110pa9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1517110pa9.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1517110pa9.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517110pa9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517090pa7 c1517090pa7) {
            C1517090pa7 c1517090pa72 = c1517090pa7;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1517090pa72.code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1517090pa72.message) + c1517090pa72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517090pa7 redact(C1517090pa7 c1517090pa7) {
            C1517110pa9 c1517110pa9NewBuilder = c1517090pa7.newBuilder();
            c1517110pa9NewBuilder.clearUnknownFields();
            return c1517110pa9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517090pa7 c1517090pa7) {
            C1517090pa7 c1517090pa72 = c1517090pa7;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1517090pa72.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1517090pa72.message);
            protoWriter.writeBytes(c1517090pa72.unknownFields());
        }
    };
    public static final Integer DEFAULT_CODE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.message;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1517110pa9 newBuilder() {
        C1517110pa9 c1517110pa9 = new C1517110pa9();
        c1517110pa9.LIZLLL = this.code;
        c1517110pa9.LJ = this.message;
        c1517110pa9.addUnknownFields(unknownFields());
        return c1517110pa9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        sb.replace(0, 2, "PbResponse{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1517090pa7)) {
            return false;
        }
        C1517090pa7 c1517090pa7 = (C1517090pa7) obj;
        if (unknownFields().equals(c1517090pa7.unknownFields()) && C1516540pZE.LJ(this.code, c1517090pa7.code) && C1516540pZE.LJ(this.message, c1517090pa7.message)) {
            return true;
        }
        return false;
    }

    public C1517090pa7(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public C1517090pa7(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = num;
        this.message = str;
    }
}
