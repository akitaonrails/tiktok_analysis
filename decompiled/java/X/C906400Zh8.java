package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906400Zh8 extends Message<C906400Zh8, C906530ZhL> {
    public static final ProtoAdapter<C906400Zh8> ADAPTER = new ProtoAdapter<C906400Zh8>() { // from class: X.0ZhA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906400Zh8 decode(ProtoReader protoReader) {
            C906530ZhL c906530ZhL = new C906530ZhL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c906530ZhL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c906530ZhL.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906530ZhL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906400Zh8 c906400Zh8) {
            C906400Zh8 c906400Zh82 = c906400Zh8;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c906400Zh82.text) + c906400Zh82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906400Zh8 redact(C906400Zh8 c906400Zh8) {
            C906530ZhL c906530ZhLNewBuilder = c906400Zh8.newBuilder();
            c906530ZhLNewBuilder.clearUnknownFields();
            return c906530ZhLNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906400Zh8 c906400Zh8) {
            C906400Zh8 c906400Zh82 = c906400Zh8;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c906400Zh82.text);
            protoWriter.writeBytes(c906400Zh82.unknownFields());
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
    public C906530ZhL newBuilder() {
        C906530ZhL c906530ZhL = new C906530ZhL();
        c906530ZhL.LIZLLL = this.text;
        c906530ZhL.addUnknownFields(unknownFields());
        return c906530ZhL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", text=");
        sb.append(this.text);
        sb.replace(0, 2, "MarkdownStreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public C906400Zh8(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906400Zh8)) {
            return false;
        }
        C906400Zh8 c906400Zh8 = (C906400Zh8) obj;
        if (unknownFields().equals(c906400Zh8.unknownFields()) && this.text.equals(c906400Zh8.text)) {
            return true;
        }
        return false;
    }

    public C906400Zh8(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
