package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQP extends Message<C1CQP, C1CQR> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long end_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long start_at;
    public static final ProtoAdapter<C1CQP> ADAPTER = new ProtoAdapter<C1CQP>() { // from class: X.1CQQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQP decode(ProtoReader protoReader) {
            C1CQR c1cqr = new C1CQR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cqr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cqr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1cqr.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cqr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQP c1cqp) {
            C1CQP c1cqp2 = c1cqp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cqp2.id) + protoAdapter.encodedSizeWithTag(2, c1cqp2.start_at) + protoAdapter.encodedSizeWithTag(3, c1cqp2.end_at) + c1cqp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQP redact(C1CQP c1cqp) {
            C1CQR c1cqrNewBuilder = c1cqp.newBuilder();
            c1cqrNewBuilder.clearUnknownFields();
            return c1cqrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQP c1cqp) {
            C1CQP c1cqp2 = c1cqp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cqp2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cqp2.start_at);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cqp2.end_at);
            protoWriter.writeBytes(c1cqp2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_START_AT = 0L;
    public static final Long DEFAULT_END_AT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.start_at.hashCode()) * 37) + this.end_at.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQR newBuilder() {
        C1CQR c1cqr = new C1CQR();
        c1cqr.LIZLLL = this.id;
        c1cqr.LJ = this.start_at;
        c1cqr.LJFF = this.end_at;
        c1cqr.addUnknownFields(unknownFields());
        return c1cqr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", start_at=");
        sb.append(this.start_at);
        sb.append(", end_at=");
        sb.append(this.end_at);
        sb.replace(0, 2, "SyeFlow{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQP)) {
            return false;
        }
        C1CQP c1cqp = (C1CQP) obj;
        if (unknownFields().equals(c1cqp.unknownFields()) && this.id.equals(c1cqp.id) && this.start_at.equals(c1cqp.start_at) && this.end_at.equals(c1cqp.end_at)) {
            return true;
        }
        return false;
    }

    public C1CQP(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C1CQP(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.start_at = l2;
        this.end_at = l3;
    }
}
