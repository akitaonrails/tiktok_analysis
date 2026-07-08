package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241321Cny extends Message<C2241321Cny, C2241361Co2> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer estimated_time_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer process_end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer process_start;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer stage;
    public static final ProtoAdapter<C2241321Cny> ADAPTER = new ProtoAdapter<C2241321Cny>() { // from class: X.1Cnz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241321Cny decode(ProtoReader protoReader) {
            C2241361Co2 c2241361Co2 = new C2241361Co2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2241361Co2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2241361Co2.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2241361Co2.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2241361Co2.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2241361Co2.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241361Co2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241321Cny c2241321Cny) {
            C2241321Cny c2241321Cny2 = c2241321Cny;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2241321Cny2.process_start) + protoAdapter.encodedSizeWithTag(2, c2241321Cny2.process_end) + protoAdapter.encodedSizeWithTag(3, c2241321Cny2.estimated_time_cost) + protoAdapter.encodedSizeWithTag(4, c2241321Cny2.stage) + c2241321Cny2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241321Cny redact(C2241321Cny c2241321Cny) {
            C2241361Co2 c2241361Co2NewBuilder = c2241321Cny.newBuilder();
            c2241361Co2NewBuilder.clearUnknownFields();
            return c2241361Co2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241321Cny c2241321Cny) {
            C2241321Cny c2241321Cny2 = c2241321Cny;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241321Cny2.process_start);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241321Cny2.process_end);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241321Cny2.estimated_time_cost);
            protoAdapter.encodeWithTag(protoWriter, 4, c2241321Cny2.stage);
            protoWriter.writeBytes(c2241321Cny2.unknownFields());
        }
    };
    public static final Integer DEFAULT_PROCESS_START = 0;
    public static final Integer DEFAULT_PROCESS_END = 0;
    public static final Integer DEFAULT_ESTIMATED_TIME_COST = 0;
    public static final Integer DEFAULT_STAGE = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.process_start;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.process_end;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.estimated_time_cost;
        int iHashCode4 = (iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.stage;
        int iHashCode5 = iHashCode4 + (num4 != null ? num4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2241361Co2 newBuilder() {
        C2241361Co2 c2241361Co2 = new C2241361Co2();
        c2241361Co2.LIZLLL = this.process_start;
        c2241361Co2.LJ = this.process_end;
        c2241361Co2.LJFF = this.estimated_time_cost;
        c2241361Co2.LJI = this.stage;
        c2241361Co2.addUnknownFields(unknownFields());
        return c2241361Co2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.process_start != null) {
            sb.append(", process_start=");
            sb.append(this.process_start);
        }
        if (this.process_end != null) {
            sb.append(", process_end=");
            sb.append(this.process_end);
        }
        if (this.estimated_time_cost != null) {
            sb.append(", estimated_time_cost=");
            sb.append(this.estimated_time_cost);
        }
        if (this.stage != null) {
            sb.append(", stage=");
            sb.append(this.stage);
        }
        sb.replace(0, 2, "VisualPoetProcess{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241321Cny)) {
            return false;
        }
        C2241321Cny c2241321Cny = (C2241321Cny) obj;
        if (unknownFields().equals(c2241321Cny.unknownFields()) && C1516540pZE.LJ(this.process_start, c2241321Cny.process_start) && C1516540pZE.LJ(this.process_end, c2241321Cny.process_end) && C1516540pZE.LJ(this.estimated_time_cost, c2241321Cny.estimated_time_cost) && C1516540pZE.LJ(this.stage, c2241321Cny.stage)) {
            return true;
        }
        return false;
    }

    public C2241321Cny(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public C2241321Cny(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.process_start = num;
        this.process_end = num2;
        this.estimated_time_cost = num3;
        this.stage = num4;
    }
}
