package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906410Zh9 extends Message<C906410Zh9, C906540ZhM> {
    public static final ProtoAdapter<C906410Zh9> ADAPTER = new ProtoAdapter<C906410Zh9>() { // from class: X.0ZhB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906410Zh9 decode(ProtoReader protoReader) {
            C906540ZhM c906540ZhM = new C906540ZhM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c906540ZhM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c906540ZhM.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906540ZhM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906410Zh9 c906410Zh9) {
            C906410Zh9 c906410Zh92 = c906410Zh9;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c906410Zh92.text) + c906410Zh92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906410Zh9 redact(C906410Zh9 c906410Zh9) {
            C906540ZhM c906540ZhMNewBuilder = c906410Zh9.newBuilder();
            c906540ZhMNewBuilder.clearUnknownFields();
            return c906540ZhMNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906410Zh9 c906410Zh9) {
            C906410Zh9 c906410Zh92 = c906410Zh9;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c906410Zh92.text);
            protoWriter.writeBytes(c906410Zh92.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C906540ZhM newBuilder() {
        C906540ZhM c906540ZhM = new C906540ZhM();
        c906540ZhM.LIZLLL = this.text;
        c906540ZhM.addUnknownFields(unknownFields());
        return c906540ZhM;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.text);
        sb.replace(0, 2, "TextStreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public C906410Zh9(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906410Zh9)) {
            return false;
        }
        C906410Zh9 c906410Zh9 = (C906410Zh9) obj;
        if (unknownFields().equals(c906410Zh9.unknownFields()) && this.text.equals(c906410Zh9.text)) {
            return true;
        }
        return false;
    }

    public C906410Zh9(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
