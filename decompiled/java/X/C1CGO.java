package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGO extends Message<C1CGO, C1CGP> {
    public static final ProtoAdapter<C1CGO> ADAPTER = new ProtoAdapter<C1CGO>() { // from class: X.1CGN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGO decode(ProtoReader protoReader) {
            C1CGP c1cgp = new C1CGP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cgp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cgp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGO c1cgo) {
            C1CGO c1cgo2 = c1cgo;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cgo2.json) + c1cgo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGO redact(C1CGO c1cgo) {
            C1CGP c1cgpNewBuilder = c1cgo.newBuilder();
            c1cgpNewBuilder.clearUnknownFields();
            return c1cgpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CGO c1cgo) {
            C1CGO c1cgo2 = c1cgo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cgo2.json);
            protoWriter.writeBytes(c1cgo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String json;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.json.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CGP newBuilder() {
        C1CGP c1cgp = new C1CGP();
        c1cgp.LIZLLL = this.json;
        c1cgp.addUnknownFields(unknownFields());
        return c1cgp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", json=");
        sb.append(this.json);
        sb.replace(0, 2, "FuncParamsX58bc6b4dec54b032{");
        sb.append('}');
        return sb.toString();
    }

    public C1CGO(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CGO)) {
            return false;
        }
        C1CGO c1cgo = (C1CGO) obj;
        if (unknownFields().equals(c1cgo.unknownFields()) && this.json.equals(c1cgo.json)) {
            return true;
        }
        return false;
    }

    public C1CGO(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.json = str;
    }
}
