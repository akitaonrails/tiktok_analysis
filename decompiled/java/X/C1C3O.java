package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3O extends Message<C1C3O, C1C3Q> {
    public static final ProtoAdapter<C1C3O> ADAPTER = new ProtoAdapter<C1C3O>() { // from class: X.1C3P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3O decode(ProtoReader protoReader) {
            C1C3Q c1c3q = new C1C3Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c3q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c3q.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c3q.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3q.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3O c1c3o) {
            C1C3O c1c3o2 = c1c3o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c3o2.key) + protoAdapter.encodedSizeWithTag(2, c1c3o2.value) + c1c3o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3O redact(C1C3O c1c3o) {
            C1C3Q c1c3qNewBuilder = c1c3o.newBuilder();
            c1c3qNewBuilder.clearUnknownFields();
            return c1c3qNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3O c1c3o) {
            C1C3O c1c3o2 = c1c3o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c3o2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c3o2.value);
            protoWriter.writeBytes(c1c3o2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
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
    public C1C3Q newBuilder() {
        C1C3Q c1c3q = new C1C3Q();
        c1c3q.LIZLLL = this.key;
        c1c3q.LJ = this.value;
        c1c3q.addUnknownFields(unknownFields());
        return c1c3q;
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
        sb.replace(0, 2, "MetadataEntry{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3O)) {
            return false;
        }
        C1C3O c1c3o = (C1C3O) obj;
        if (unknownFields().equals(c1c3o.unknownFields()) && C1516540pZE.LJ(this.key, c1c3o.key) && C1516540pZE.LJ(this.value, c1c3o.value)) {
            return true;
        }
        return false;
    }

    public C1C3O(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1C3O(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
    }
}
