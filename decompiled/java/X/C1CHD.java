package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHD extends Message<C1CHD, C1CHF> {
    public static final ProtoAdapter<C1CHD> ADAPTER = new ProtoAdapter<C1CHD>() { // from class: X.1CHE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHD decode(ProtoReader protoReader) {
            C1CHF c1chf = new C1CHF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1chf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1chf.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1chf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHD c1chd) {
            C1CHD c1chd2 = c1chd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1chd2.apply_id) + protoAdapter.encodedSizeWithTag(2, c1chd2.operation) + c1chd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHD redact(C1CHD c1chd) {
            C1CHF c1chfNewBuilder = c1chd.newBuilder();
            c1chfNewBuilder.clearUnknownFields();
            return c1chfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHD c1chd) {
            C1CHD c1chd2 = c1chd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1chd2.apply_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1chd2.operation);
            protoWriter.writeBytes(c1chd2.unknownFields());
        }
    };
    public static final Long DEFAULT_APPLY_ID = 0L;
    public static final Long DEFAULT_OPERATION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long apply_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long operation;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.apply_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.operation;
        int iHashCode3 = iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CHF newBuilder() {
        C1CHF c1chf = new C1CHF();
        c1chf.LIZLLL = this.apply_id;
        c1chf.LJ = this.operation;
        c1chf.addUnknownFields(unknownFields());
        return c1chf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.apply_id != null) {
            sb.append(", apply_id=");
            sb.append(this.apply_id);
        }
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        sb.replace(0, 2, "GroupAuditAckValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHD)) {
            return false;
        }
        C1CHD c1chd = (C1CHD) obj;
        if (unknownFields().equals(c1chd.unknownFields()) && C1516540pZE.LJ(this.apply_id, c1chd.apply_id) && C1516540pZE.LJ(this.operation, c1chd.operation)) {
            return true;
        }
        return false;
    }

    public C1CHD(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C1CHD(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.apply_id = l;
        this.operation = l2;
    }
}
