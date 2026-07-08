package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225831C9t extends Message<C2225831C9t, C2225851C9v> {
    public static final ProtoAdapter<C2225831C9t> ADAPTER = new ProtoAdapter<C2225831C9t>() { // from class: X.1C9u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225831C9t decode(ProtoReader protoReader) {
            C2225851C9v c2225851C9v = new C2225851C9v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225851C9v.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225851C9v.LIZLLL = C2225801C9q.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225851C9v.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225831C9t c2225831C9t) {
            C2225831C9t c2225831C9t2 = c2225831C9t;
            return C2225801C9q.ADAPTER.encodedSizeWithTag(1, c2225831C9t2.event) + c2225831C9t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225831C9t redact(C2225831C9t c2225831C9t) {
            C2225851C9v c2225851C9vNewBuilder = c2225831C9t.newBuilder();
            c2225851C9vNewBuilder.LIZLLL = C2225801C9q.ADAPTER.redact(c2225851C9vNewBuilder.LIZLLL);
            c2225851C9vNewBuilder.clearUnknownFields();
            return c2225851C9vNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225831C9t c2225831C9t) {
            C2225831C9t c2225831C9t2 = c2225831C9t;
            C2225801C9q.ADAPTER.encodeWithTag(protoWriter, 1, c2225831C9t2.event);
            protoWriter.writeBytes(c2225831C9t2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicStatEvent#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2225801C9q event;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.event.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225851C9v newBuilder() {
        C2225851C9v c2225851C9v = new C2225851C9v();
        c2225851C9v.LIZLLL = this.event;
        c2225851C9v.addUnknownFields(unknownFields());
        return c2225851C9v;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        sb.replace(0, 2, "FuncParamsXf0fe87f35485c1bc{");
        sb.append('}');
        return sb.toString();
    }

    public C2225831C9t(C2225801C9q c2225801C9q) {
        this(c2225801C9q, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225831C9t)) {
            return false;
        }
        C2225831C9t c2225831C9t = (C2225831C9t) obj;
        if (unknownFields().equals(c2225831C9t.unknownFields()) && this.event.equals(c2225831C9t.event)) {
            return true;
        }
        return false;
    }

    public C2225831C9t(C2225801C9q c2225801C9q, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = c2225801C9q;
    }
}
