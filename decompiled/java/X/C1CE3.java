package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CE3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE3 extends Message<C1CE3, C1CE4> {
    public static final ProtoAdapter<C1CE3> ADAPTER = new ProtoAdapter<C1CE3>() { // from class: X.1CE2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE3 decode(ProtoReader protoReader) {
            C1CE4 c1ce4 = new C1CE4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ce4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ce4.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ce4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CE3 c1ce3) {
            C1CE3 c1ce32 = c1ce3;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1ce32.accept_rate) + c1ce32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE3 redact(C1CE3 c1ce3) {
            C1CE4 c1ce4NewBuilder = c1ce3.newBuilder();
            c1ce4NewBuilder.clearUnknownFields();
            return c1ce4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CE3 c1ce3) {
            C1CE3 c1ce32 = c1ce3;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1ce32.accept_rate);
            protoWriter.writeBytes(c1ce32.unknownFields());
        }
    };
    public static final Long DEFAULT_ACCEPT_RATE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long accept_rate;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.accept_rate;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CE4 newBuilder() {
        C1CE4 c1ce4 = new C1CE4();
        c1ce4.LIZLLL = this.accept_rate;
        c1ce4.addUnknownFields(unknownFields());
        return c1ce4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.accept_rate != null) {
            sb.append(", accept_rate=");
            sb.append(this.accept_rate);
        }
        sb.replace(0, 2, "B2CMessageRequest{");
        sb.append('}');
        return sb.toString();
    }

    public C1CE3(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CE3)) {
            return false;
        }
        C1CE3 c1ce3 = (C1CE3) obj;
        if (unknownFields().equals(c1ce3.unknownFields()) && C1516540pZE.LJ(this.accept_rate, c1ce3.accept_rate)) {
            return true;
        }
        return false;
    }

    public C1CE3(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.accept_rate = l;
    }
}
