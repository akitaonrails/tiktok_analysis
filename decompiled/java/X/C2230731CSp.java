package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230731CSp extends Message<C2230731CSp, C2230751CSr> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conv_short_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;
    public static final ProtoAdapter<C2230731CSp> ADAPTER = new ProtoAdapter<C2230731CSp>() { // from class: X.1CSq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230731CSp decode(ProtoReader protoReader) {
            C2230751CSr c2230751CSr = new C2230751CSr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230751CSr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230751CSr.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2230751CSr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230751CSr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230731CSp c2230731CSp) {
            C2230731CSp c2230731CSp2 = c2230731CSp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2230731CSp2.user_id) + protoAdapter.encodedSizeWithTag(2, c2230731CSp2.conv_short_id) + c2230731CSp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230731CSp redact(C2230731CSp c2230731CSp) {
            C2230751CSr c2230751CSrNewBuilder = c2230731CSp.newBuilder();
            c2230751CSrNewBuilder.clearUnknownFields();
            return c2230751CSrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230731CSp c2230731CSp) {
            C2230731CSp c2230731CSp2 = c2230731CSp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230731CSp2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230731CSp2.conv_short_id);
            protoWriter.writeBytes(c2230731CSp2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.user_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.conv_short_id;
        int iHashCode3 = iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2230751CSr newBuilder() {
        C2230751CSr c2230751CSr = new C2230751CSr();
        c2230751CSr.LIZLLL = this.user_id;
        c2230751CSr.LJ = this.conv_short_id;
        c2230751CSr.addUnknownFields(unknownFields());
        return c2230751CSr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        sb.replace(0, 2, "GroupAuditAckEntity{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230731CSp)) {
            return false;
        }
        C2230731CSp c2230731CSp = (C2230731CSp) obj;
        if (unknownFields().equals(c2230731CSp.unknownFields()) && C1516540pZE.LJ(this.user_id, c2230731CSp.user_id) && C1516540pZE.LJ(this.conv_short_id, c2230731CSp.conv_short_id)) {
            return true;
        }
        return false;
    }

    public C2230731CSp(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C2230731CSp(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.conv_short_id = l2;
    }
}
