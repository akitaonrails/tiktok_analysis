package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226841CDq extends Message<C2226841CDq, C2226861CDs> {
    public static final ProtoAdapter<C2226841CDq> ADAPTER = new ProtoAdapter<C2226841CDq>() { // from class: X.1CDr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226841CDq decode(ProtoReader protoReader) {
            C2226861CDs c2226861CDs = new C2226861CDs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226861CDs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226861CDs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226861CDs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226841CDq c2226841CDq) {
            C2226841CDq c2226841CDq2 = c2226841CDq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226841CDq2.message) + c2226841CDq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226841CDq redact(C2226841CDq c2226841CDq) {
            C2226861CDs c2226861CDsNewBuilder = c2226841CDq.newBuilder();
            c2226861CDsNewBuilder.clearUnknownFields();
            return c2226861CDsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226841CDq c2226841CDq) {
            C2226841CDq c2226841CDq2 = c2226841CDq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226841CDq2.message);
            protoWriter.writeBytes(c2226841CDq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226861CDs newBuilder() {
        C2226861CDs c2226861CDs = new C2226861CDs();
        c2226861CDs.LIZLLL = this.message;
        c2226861CDs.addUnknownFields(unknownFields());
        return c2226861CDs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", message=");
        sb.append(this.message);
        sb.replace(0, 2, "FuncParamsXe3f0e523826124da{");
        sb.append('}');
        return sb.toString();
    }

    public C2226841CDq(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226841CDq)) {
            return false;
        }
        C2226841CDq c2226841CDq = (C2226841CDq) obj;
        if (unknownFields().equals(c2226841CDq.unknownFields()) && this.message.equals(c2226841CDq.message)) {
            return true;
        }
        return false;
    }

    public C2226841CDq(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = str;
    }
}
