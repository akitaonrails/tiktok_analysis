package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226671CCz extends Message<C2226671CCz, C1CD1> {
    public static final ProtoAdapter<C2226671CCz> ADAPTER = new ProtoAdapter<C2226671CCz>() { // from class: X.1CD0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226671CCz decode(ProtoReader protoReader) {
            C1CD1 c1cd1 = new C1CD1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cd1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cd1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cd1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226671CCz c2226671CCz) {
            C2226671CCz c2226671CCz2 = c2226671CCz;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226671CCz2.layout_key) + c2226671CCz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226671CCz redact(C2226671CCz c2226671CCz) {
            C1CD1 c1cd1NewBuilder = c2226671CCz.newBuilder();
            c1cd1NewBuilder.clearUnknownFields();
            return c1cd1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226671CCz c2226671CCz) {
            C2226671CCz c2226671CCz2 = c2226671CCz;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226671CCz2.layout_key);
            protoWriter.writeBytes(c2226671CCz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layout_key.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CD1 newBuilder() {
        C1CD1 c1cd1 = new C1CD1();
        c1cd1.LIZLLL = this.layout_key;
        c1cd1.addUnknownFields(unknownFields());
        return c1cd1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.replace(0, 2, "FuncParamsX67934ce05f53bb24{");
        sb.append('}');
        return sb.toString();
    }

    public C2226671CCz(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226671CCz)) {
            return false;
        }
        C2226671CCz c2226671CCz = (C2226671CCz) obj;
        if (unknownFields().equals(c2226671CCz.unknownFields()) && this.layout_key.equals(c2226671CCz.layout_key)) {
            return true;
        }
        return false;
    }

    public C2226671CCz(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_key = str;
    }
}
