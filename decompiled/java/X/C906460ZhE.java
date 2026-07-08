package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906460ZhE extends Message<C906460ZhE, C906510ZhJ> {
    public static final ProtoAdapter<C906460ZhE> ADAPTER = new ProtoAdapter<C906460ZhE>() { // from class: X.0ZhC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906460ZhE decode(ProtoReader protoReader) {
            C906510ZhJ c906510ZhJ = new C906510ZhJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c906510ZhJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c906510ZhJ.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c906510ZhJ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906510ZhJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906460ZhE c906460ZhE) {
            C906460ZhE c906460ZhE2 = c906460ZhE;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c906460ZhE2.key) + protoAdapter.encodedSizeWithTag(2, c906460ZhE2.value) + c906460ZhE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906460ZhE redact(C906460ZhE c906460ZhE) {
            C906510ZhJ c906510ZhJNewBuilder = c906460ZhE.newBuilder();
            c906510ZhJNewBuilder.clearUnknownFields();
            return c906510ZhJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906460ZhE c906460ZhE) {
            C906460ZhE c906460ZhE2 = c906460ZhE;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c906460ZhE2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c906460ZhE2.value);
            protoWriter.writeBytes(c906460ZhE2.unknownFields());
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
        int iHashCode = (((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C906510ZhJ newBuilder() {
        C906510ZhJ c906510ZhJ = new C906510ZhJ();
        c906510ZhJ.LIZLLL = this.key;
        c906510ZhJ.LJ = this.value;
        c906510ZhJ.addUnknownFields(unknownFields());
        return c906510ZhJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.replace(0, 2, "MetadataEntry{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906460ZhE)) {
            return false;
        }
        C906460ZhE c906460ZhE = (C906460ZhE) obj;
        if (unknownFields().equals(c906460ZhE.unknownFields()) && this.key.equals(c906460ZhE.key) && this.value.equals(c906460ZhE.value)) {
            return true;
        }
        return false;
    }

    public C906460ZhE(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C906460ZhE(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
    }
}
