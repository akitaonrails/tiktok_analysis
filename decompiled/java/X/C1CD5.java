package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CD5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD5 extends Message<C1CD5, C1CD7> {
    public static final ProtoAdapter<C1CD5> ADAPTER = new ProtoAdapter<C1CD5>() { // from class: X.1CD6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD5 decode(ProtoReader protoReader) {
            C1CD7 c1cd7 = new C1CD7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cd7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cd7.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cd7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CD5 c1cd5) {
            C1CD5 c1cd52 = c1cd5;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cd52.content_type) + c1cd52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD5 redact(C1CD5 c1cd5) {
            C1CD7 c1cd7NewBuilder = c1cd5.newBuilder();
            c1cd7NewBuilder.clearUnknownFields();
            return c1cd7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CD5 c1cd5) {
            C1CD5 c1cd52 = c1cd5;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cd52.content_type);
            protoWriter.writeBytes(c1cd52.unknownFields());
        }
    };
    public static final Long DEFAULT_CONTENT_TYPE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long content_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.content_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CD7 newBuilder() {
        C1CD7 c1cd7 = new C1CD7();
        c1cd7.LIZLLL = this.content_type;
        c1cd7.addUnknownFields(unknownFields());
        return c1cd7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.replace(0, 2, "LinkMicLayoutCohostLayoutWindowExtra{");
        sb.append('}');
        return sb.toString();
    }

    public C1CD5(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CD5)) {
            return false;
        }
        C1CD5 c1cd5 = (C1CD5) obj;
        if (unknownFields().equals(c1cd5.unknownFields()) && this.content_type.equals(c1cd5.content_type)) {
            return true;
        }
        return false;
    }

    public C1CD5(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content_type = l;
    }
}
