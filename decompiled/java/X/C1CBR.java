package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBR extends Message<C1CBR, C1CBT> {
    public static final ProtoAdapter<C1CBR> ADAPTER = new ProtoAdapter<C1CBR>() { // from class: X.1CBS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBR decode(ProtoReader protoReader) {
            C1CBT c1cbt = new C1CBT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cbt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cbt.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBR c1cbr) {
            C1CBR c1cbr2 = c1cbr;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cbr2.message_method) + c1cbr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBR redact(C1CBR c1cbr) {
            C1CBT c1cbtNewBuilder = c1cbr.newBuilder();
            c1cbtNewBuilder.clearUnknownFields();
            return c1cbtNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBR c1cbr) {
            C1CBR c1cbr2 = c1cbr;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cbr2.message_method);
            protoWriter.writeBytes(c1cbr2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String message_method;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.message_method.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBT newBuilder() {
        C1CBT c1cbt = new C1CBT();
        c1cbt.LIZLLL = this.message_method;
        c1cbt.addUnknownFields(unknownFields());
        return c1cbt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", message_method=");
        sb.append(this.message_method);
        sb.replace(0, 2, "FuncParamsX90d58dfa19cbe144{");
        sb.append('}');
        return sb.toString();
    }

    public C1CBR(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBR)) {
            return false;
        }
        C1CBR c1cbr = (C1CBR) obj;
        if (unknownFields().equals(c1cbr.unknownFields()) && this.message_method.equals(c1cbr.message_method)) {
            return true;
        }
        return false;
    }

    public C1CBR(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_method = str;
    }
}
