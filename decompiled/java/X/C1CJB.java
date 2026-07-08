package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJB extends Message<C1CJB, C1CJD> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long uid;
    public static final ProtoAdapter<C1CJB> ADAPTER = new ProtoAdapter<C1CJB>() { // from class: X.1CJC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJB decode(ProtoReader protoReader) {
            C1CJD c1cjd = new C1CJD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cjd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cjd.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cjd.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJB c1cjb) {
            C1CJB c1cjb2 = c1cjb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cjb2.uid) + protoAdapter.encodedSizeWithTag(2, c1cjb2.timestamp) + c1cjb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJB redact(C1CJB c1cjb) {
            C1CJD c1cjdNewBuilder = c1cjb.newBuilder();
            c1cjdNewBuilder.clearUnknownFields();
            return c1cjdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJB c1cjb) {
            C1CJB c1cjb2 = c1cjb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cjb2.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cjb2.timestamp);
            protoWriter.writeBytes(c1cjb2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_TIMESTAMP = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.uid;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.timestamp;
        int iHashCode3 = iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CJD newBuilder() {
        C1CJD c1cjd = new C1CJD();
        c1cjd.LIZLLL = this.uid;
        c1cjd.LJ = this.timestamp;
        c1cjd.addUnknownFields(unknownFields());
        return c1cjd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        sb.replace(0, 2, "StreakUser{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJB)) {
            return false;
        }
        C1CJB c1cjb = (C1CJB) obj;
        if (unknownFields().equals(c1cjb.unknownFields()) && C1516540pZE.LJ(this.uid, c1cjb.uid) && C1516540pZE.LJ(this.timestamp, c1cjb.timestamp)) {
            return true;
        }
        return false;
    }

    public C1CJB(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C1CJB(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.timestamp = l2;
    }
}
