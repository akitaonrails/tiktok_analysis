package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNI extends Message<C1CNI, C1CNK> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer rank;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 2)
    public final Double score;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;
    public static final ProtoAdapter<C1CNI> ADAPTER = new ProtoAdapter<C1CNI>() { // from class: X.1CNJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNI decode(ProtoReader protoReader) {
            C1CNK c1cnk = new C1CNK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cnk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cnk.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1cnk.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1cnk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNI c1cni) {
            C1CNI c1cni2 = c1cni;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cni2.user_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c1cni2.score) + ProtoAdapter.INT32.encodedSizeWithTag(3, c1cni2.rank) + c1cni2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNI redact(C1CNI c1cni) {
            C1CNK c1cnkNewBuilder = c1cni.newBuilder();
            c1cnkNewBuilder.clearUnknownFields();
            return c1cnkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNI c1cni) {
            C1CNI c1cni2 = c1cni;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cni2.user_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, c1cni2.score);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c1cni2.rank);
            protoWriter.writeBytes(c1cni2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Double DEFAULT_SCORE = Double.valueOf(0.0d);
    public static final Integer DEFAULT_RANK = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.user_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Double d = this.score;
        int iHashCode3 = (iHashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        Integer num = this.rank;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CNK newBuilder() {
        C1CNK c1cnk = new C1CNK();
        c1cnk.LIZLLL = this.user_id;
        c1cnk.LJ = this.score;
        c1cnk.LJFF = this.rank;
        c1cnk.addUnknownFields(unknownFields());
        return c1cnk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        sb.replace(0, 2, "GameParticipantScore{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNI)) {
            return false;
        }
        C1CNI c1cni = (C1CNI) obj;
        if (unknownFields().equals(c1cni.unknownFields()) && C1516540pZE.LJ(this.user_id, c1cni.user_id) && C1516540pZE.LJ(this.score, c1cni.score) && C1516540pZE.LJ(this.rank, c1cni.rank)) {
            return true;
        }
        return false;
    }

    public C1CNI(Long l, Double d, Integer num) {
        this(l, d, num, ByteString.EMPTY);
    }

    public C1CNI(Long l, Double d, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.score = d;
        this.rank = num;
    }
}
