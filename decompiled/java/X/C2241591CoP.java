package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241591CoP extends Message<C2241591CoP, C2241611CoR> {
    public static final ProtoAdapter<C2241591CoP> ADAPTER = new ProtoAdapter<C2241591CoP>() { // from class: X.1CoQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241591CoP decode(ProtoReader protoReader) {
            C2241611CoR c2241611CoR = new C2241611CoR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2241611CoR.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2241611CoR.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241611CoR.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241591CoP c2241591CoP) {
            C2241591CoP c2241591CoP2 = c2241591CoP;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2241591CoP2.expired_at) + c2241591CoP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241591CoP redact(C2241591CoP c2241591CoP) {
            C2241611CoR c2241611CoRNewBuilder = c2241591CoP.newBuilder();
            c2241611CoRNewBuilder.clearUnknownFields();
            return c2241611CoRNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241591CoP c2241591CoP) {
            C2241591CoP c2241591CoP2 = c2241591CoP;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2241591CoP2.expired_at);
            protoWriter.writeBytes(c2241591CoP2.unknownFields());
        }
    };
    public static final Long DEFAULT_EXPIRED_AT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long expired_at;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.expired_at;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2241611CoR newBuilder() {
        C2241611CoR c2241611CoR = new C2241611CoR();
        c2241611CoR.LIZLLL = this.expired_at;
        c2241611CoR.addUnknownFields(unknownFields());
        return c2241611CoR;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.expired_at != null) {
            sb.append(", expired_at=");
            sb.append(this.expired_at);
        }
        sb.replace(0, 2, "TTL{");
        sb.append('}');
        return sb.toString();
    }

    public C2241591CoP(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241591CoP)) {
            return false;
        }
        C2241591CoP c2241591CoP = (C2241591CoP) obj;
        if (unknownFields().equals(c2241591CoP.unknownFields()) && C1516540pZE.LJ(this.expired_at, c2241591CoP.expired_at)) {
            return true;
        }
        return false;
    }

    public C2241591CoP(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.expired_at = l;
    }
}
