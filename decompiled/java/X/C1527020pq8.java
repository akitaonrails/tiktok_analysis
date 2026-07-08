package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527020pq8 extends Message<C1527020pq8, C1527110pqH> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Bucket#ADAPTER", tag = 2)
    public final EnumC1527250pqV bucket;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BdTuring.TYPE_ECAF)
    public final Long expire_time;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Flag#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC1527170pqN flag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long new_cursor;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.BsyncPacket#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public final List<C1527130pqJ> packets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long ref_cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 255)
    public final String req_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long sync_id;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.TopicStatus#ADAPTER", tag = 8)
    public final EnumC1527240pqU topic_status;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.TopicType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC1525890poJ topic_type;
    public static final ProtoAdapter<C1527020pq8> ADAPTER = new ProtoAdapter<C1527020pq8>() { // from class: X.0pqA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527020pq8 decode(ProtoReader protoReader) {
            C1527110pqH c1527110pqH = new C1527110pqH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    c1527110pqH.LIZLLL = EnumC1527170pqN.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1527110pqH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                break;
                            case 2:
                                try {
                                    c1527110pqH.LJ = EnumC1527250pqV.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1527110pqH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                break;
                            case 3:
                                try {
                                    c1527110pqH.LJFF = EnumC1525890poJ.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    c1527110pqH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                break;
                            case 4:
                                c1527110pqH.LJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                c1527110pqH.LJII = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                c1527110pqH.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                c1527110pqH.LJIIIZ.add(C1527130pqJ.ADAPTER.decode(protoReader));
                                break;
                            case 8:
                                try {
                                    c1527110pqH.LJIIJ = EnumC1527240pqU.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    c1527110pqH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c1527110pqH.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1527110pqH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c1527110pqH.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527110pqH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527020pq8 c1527020pq8) {
            C1527020pq8 c1527020pq82 = c1527020pq8;
            int iEncodedSizeWithTag = EnumC1527170pqN.ADAPTER.encodedSizeWithTag(1, c1527020pq82.flag) + EnumC1527250pqV.ADAPTER.encodedSizeWithTag(2, c1527020pq82.bucket) + EnumC1525890poJ.ADAPTER.encodedSizeWithTag(3, c1527020pq82.topic_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c1527020pq82.sync_id) + protoAdapter.encodedSizeWithTag(5, c1527020pq82.ref_cursor) + protoAdapter.encodedSizeWithTag(6, c1527020pq82.new_cursor) + C1527130pqJ.ADAPTER.asRepeated().encodedSizeWithTag(7, c1527020pq82.packets) + EnumC1527240pqU.ADAPTER.encodedSizeWithTag(8, c1527020pq82.topic_status) + protoAdapter.encodedSizeWithTag(9, c1527020pq82.expire_time) + ProtoAdapter.STRING.encodedSizeWithTag(255, c1527020pq82.req_id) + c1527020pq82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527020pq8 redact(C1527020pq8 c1527020pq8) {
            C1527110pqH c1527110pqHNewBuilder = c1527020pq8.newBuilder();
            C1516540pZE.LJIIIZ(c1527110pqHNewBuilder.LJIIIZ, C1527130pqJ.ADAPTER);
            c1527110pqHNewBuilder.clearUnknownFields();
            return c1527110pqHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527020pq8 c1527020pq8) {
            C1527020pq8 c1527020pq82 = c1527020pq8;
            EnumC1527170pqN.ADAPTER.encodeWithTag(protoWriter, 1, c1527020pq82.flag);
            EnumC1527250pqV.ADAPTER.encodeWithTag(protoWriter, 2, c1527020pq82.bucket);
            EnumC1525890poJ.ADAPTER.encodeWithTag(protoWriter, 3, c1527020pq82.topic_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 4, c1527020pq82.sync_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c1527020pq82.ref_cursor);
            protoAdapter.encodeWithTag(protoWriter, 6, c1527020pq82.new_cursor);
            C1527130pqJ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, c1527020pq82.packets);
            EnumC1527240pqU.ADAPTER.encodeWithTag(protoWriter, 8, c1527020pq82.topic_status);
            protoAdapter.encodeWithTag(protoWriter, 9, c1527020pq82.expire_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 255, c1527020pq82.req_id);
            protoWriter.writeBytes(c1527020pq82.unknownFields());
        }
    };
    public static final EnumC1527170pqN DEFAULT_FLAG = EnumC1527170pqN.None;
    public static final EnumC1527250pqV DEFAULT_BUCKET = EnumC1527250pqV.Device;
    public static final EnumC1525890poJ DEFAULT_TOPIC_TYPE = EnumC1525890poJ.SpecTopic;
    public static final Long DEFAULT_SYNC_ID = 0L;
    public static final Long DEFAULT_REF_CURSOR = 0L;
    public static final Long DEFAULT_NEW_CURSOR = 0L;
    public static final EnumC1527240pqU DEFAULT_TOPIC_STATUS = EnumC1527240pqU.NotExist;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.flag.hashCode()) * 37;
        EnumC1527250pqV enumC1527250pqV = this.bucket;
        int iHashCode2 = (((iHashCode + (enumC1527250pqV != null ? enumC1527250pqV.hashCode() : 0)) * 37) + this.topic_type.hashCode()) * 37;
        Long l = this.sync_id;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.ref_cursor;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.new_cursor;
        int iHashCode5 = (((iHashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37) + this.packets.hashCode()) * 37;
        EnumC1527240pqU enumC1527240pqU = this.topic_status;
        int iHashCode6 = (iHashCode5 + (enumC1527240pqU != null ? enumC1527240pqU.hashCode() : 0)) * 37;
        Long l4 = this.expire_time;
        int iHashCode7 = (iHashCode6 + (l4 != null ? l4.hashCode() : 0)) * 37;
        String str = this.req_id;
        int iHashCode8 = iHashCode7 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C1527110pqH newBuilder() {
        C1527110pqH c1527110pqH = new C1527110pqH();
        c1527110pqH.LIZLLL = this.flag;
        c1527110pqH.LJ = this.bucket;
        c1527110pqH.LJFF = this.topic_type;
        c1527110pqH.LJI = this.sync_id;
        c1527110pqH.LJII = this.ref_cursor;
        c1527110pqH.LJIIIIZZ = this.new_cursor;
        c1527110pqH.LJIIIZ = C1516540pZE.LIZJ("packets", this.packets);
        c1527110pqH.LJIIJ = this.topic_status;
        c1527110pqH.LJIIJJI = this.expire_time;
        c1527110pqH.LJIIL = this.req_id;
        c1527110pqH.addUnknownFields(unknownFields());
        return c1527110pqH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", flag=");
        sb.append(this.flag);
        if (this.bucket != null) {
            sb.append(", bucket=");
            sb.append(this.bucket);
        }
        sb.append(", topic_type=");
        sb.append(this.topic_type);
        if (this.sync_id != null) {
            sb.append(", sync_id=");
            sb.append(this.sync_id);
        }
        if (this.ref_cursor != null) {
            sb.append(", ref_cursor=");
            sb.append(this.ref_cursor);
        }
        if (this.new_cursor != null) {
            sb.append(", new_cursor=");
            sb.append(this.new_cursor);
        }
        if (!this.packets.isEmpty()) {
            sb.append(", packets=");
            sb.append(this.packets);
        }
        if (this.topic_status != null) {
            sb.append(", topic_status=");
            sb.append(this.topic_status);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.req_id != null) {
            sb.append(", req_id=");
            sb.append(this.req_id);
        }
        sb.replace(0, 2, "BsyncTopic{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527020pq8)) {
            return false;
        }
        C1527020pq8 c1527020pq8 = (C1527020pq8) obj;
        if (unknownFields().equals(c1527020pq8.unknownFields()) && this.flag.equals(c1527020pq8.flag) && C1516540pZE.LJ(this.bucket, c1527020pq8.bucket) && this.topic_type.equals(c1527020pq8.topic_type) && C1516540pZE.LJ(this.sync_id, c1527020pq8.sync_id) && C1516540pZE.LJ(this.ref_cursor, c1527020pq8.ref_cursor) && C1516540pZE.LJ(this.new_cursor, c1527020pq8.new_cursor) && this.packets.equals(c1527020pq8.packets) && C1516540pZE.LJ(this.topic_status, c1527020pq8.topic_status) && C1516540pZE.LJ(this.expire_time, c1527020pq8.expire_time) && C1516540pZE.LJ(this.req_id, c1527020pq8.req_id)) {
            return true;
        }
        return false;
    }

    public C1527020pq8(EnumC1527170pqN enumC1527170pqN, EnumC1527250pqV enumC1527250pqV, EnumC1525890poJ enumC1525890poJ, Long l, Long l2, Long l3, List<C1527130pqJ> list, EnumC1527240pqU enumC1527240pqU, Long l4, String str) {
        this(enumC1527170pqN, enumC1527250pqV, enumC1525890poJ, l, l2, l3, list, enumC1527240pqU, l4, str, ByteString.EMPTY);
    }

    public C1527020pq8(EnumC1527170pqN enumC1527170pqN, EnumC1527250pqV enumC1527250pqV, EnumC1525890poJ enumC1525890poJ, Long l, Long l2, Long l3, List<C1527130pqJ> list, EnumC1527240pqU enumC1527240pqU, Long l4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flag = enumC1527170pqN;
        this.bucket = enumC1527250pqV;
        this.topic_type = enumC1525890poJ;
        this.sync_id = l;
        this.ref_cursor = l2;
        this.new_cursor = l3;
        this.packets = C1516540pZE.LJFF("packets", list);
        this.topic_status = enumC1527240pqU;
        this.expire_time = l4;
        this.req_id = str;
    }
}
