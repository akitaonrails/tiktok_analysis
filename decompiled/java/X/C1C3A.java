package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3A extends Message<C1C3A, C1C3C> {
    public static final ProtoAdapter<C1C3A> ADAPTER = new ProtoAdapter<C1C3A>() { // from class: X.1C3B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3A decode(ProtoReader protoReader) {
            C1C3C c1c3c = new C1C3C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c3c.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c3c.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3c.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3A c1c3a) {
            C1C3A c1c3a2 = c1c3a;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c3a2.priority) + c1c3a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3A redact(C1C3A c1c3a) {
            C1C3C c1c3cNewBuilder = c1c3a.newBuilder();
            c1c3cNewBuilder.clearUnknownFields();
            return c1c3cNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3A c1c3a) {
            C1C3A c1c3a2 = c1c3a;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c3a2.priority);
            protoWriter.writeBytes(c1c3a2.unknownFields());
        }
    };
    public static final Long DEFAULT_PRIORITY = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long priority;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.priority.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C3C newBuilder() {
        C1C3C c1c3c = new C1C3C();
        c1c3c.LIZLLL = this.priority;
        c1c3c.addUnknownFields(unknownFields());
        return c1c3c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", priority=");
        sb.append(this.priority);
        sb.replace(0, 2, "FuncParamsX280eb091274a5c22{");
        sb.append('}');
        return sb.toString();
    }

    public C1C3A(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3A)) {
            return false;
        }
        C1C3A c1c3a = (C1C3A) obj;
        if (unknownFields().equals(c1c3a.unknownFields()) && this.priority.equals(c1c3a.priority)) {
            return true;
        }
        return false;
    }

    public C1C3A(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.priority = l;
    }
}
