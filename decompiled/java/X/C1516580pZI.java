package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516580pZI extends Message<C1516580pZI, C1516560pZG> {
    public static final ProtoAdapter<C1516580pZI> ADAPTER = new ProtoAdapter<C1516580pZI>() { // from class: X.0pZJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1516580pZI decode(ProtoReader protoReader) {
            C1516560pZG c1516560pZG = new C1516560pZG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1516560pZG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1516560pZG.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1516560pZG.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1516560pZG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1516580pZI c1516580pZI) {
            C1516580pZI c1516580pZI2 = c1516580pZI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1516580pZI2.key) + protoAdapter.encodedSizeWithTag(2, c1516580pZI2.value) + c1516580pZI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1516580pZI redact(C1516580pZI c1516580pZI) {
            C1516560pZG c1516560pZGNewBuilder = c1516580pZI.newBuilder();
            c1516560pZGNewBuilder.clearUnknownFields();
            return c1516560pZGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1516580pZI c1516580pZI) {
            C1516580pZI c1516580pZI2 = c1516580pZI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1516580pZI2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c1516580pZI2.value);
            protoWriter.writeBytes(c1516580pZI2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.value;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1516560pZG newBuilder() {
        C1516560pZG c1516560pZG = new C1516560pZG();
        c1516560pZG.LIZLLL = this.key;
        c1516560pZG.LJ = this.value;
        c1516560pZG.addUnknownFields(unknownFields());
        return c1516560pZG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        sb.replace(0, 2, "ExtendedEntry{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1516580pZI)) {
            return false;
        }
        C1516580pZI c1516580pZI = (C1516580pZI) obj;
        if (C1516540pZE.LJ(unknownFields(), c1516580pZI.unknownFields()) && C1516540pZE.LJ(this.key, c1516580pZI.key) && C1516540pZE.LJ(this.value, c1516580pZI.value)) {
            return true;
        }
        return false;
    }

    public C1516580pZI(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1516580pZI(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
    }
}
