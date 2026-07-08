package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518250pbz extends Message<C1518250pbz, C1518270pc1> {
    public static final ProtoAdapter<C1518250pbz> ADAPTER = new ProtoAdapter<C1518250pbz>() { // from class: X.0pc0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518250pbz decode(ProtoReader protoReader) {
            C1518270pc1 c1518270pc1 = new C1518270pc1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1518270pc1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1518270pc1.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1518270pc1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518270pc1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518250pbz c1518250pbz) {
            C1518250pbz c1518250pbz2 = c1518250pbz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1518250pbz2.key) + protoAdapter.encodedSizeWithTag(2, c1518250pbz2.value) + c1518250pbz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518250pbz redact(C1518250pbz c1518250pbz) {
            C1518270pc1 c1518270pc1NewBuilder = c1518250pbz.newBuilder();
            c1518270pc1NewBuilder.clearUnknownFields();
            return c1518270pc1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518250pbz c1518250pbz) {
            C1518250pbz c1518250pbz2 = c1518250pbz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1518250pbz2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c1518250pbz2.value);
            protoWriter.writeBytes(c1518250pbz2.unknownFields());
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
    public C1518270pc1 newBuilder() {
        C1518270pc1 c1518270pc1 = new C1518270pc1();
        c1518270pc1.LIZLLL = this.key;
        c1518270pc1.LJ = this.value;
        c1518270pc1.addUnknownFields(unknownFields());
        return c1518270pc1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.replace(0, 2, "ExtendedEntry{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1518250pbz)) {
            return false;
        }
        C1518250pbz c1518250pbz = (C1518250pbz) obj;
        if (unknownFields().equals(c1518250pbz.unknownFields()) && this.key.equals(c1518250pbz.key) && this.value.equals(c1518250pbz.value)) {
            return true;
        }
        return false;
    }

    public C1518250pbz(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1518250pbz(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
    }
}
