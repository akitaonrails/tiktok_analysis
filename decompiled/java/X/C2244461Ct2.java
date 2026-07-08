package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ct2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244461Ct2 extends Message<C2244461Ct2, C2244481Ct4> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean completed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer reward_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer task_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetTaskType#ADAPTER", tag = 4)
    public final EnumC19362110p1 type;
    public static final ProtoAdapter<C2244461Ct2> ADAPTER = new ProtoAdapter<C2244461Ct2>() { // from class: X.1Ct3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244461Ct2 decode(ProtoReader protoReader) {
            C2244481Ct4 c2244481Ct4 = new C2244481Ct4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2244481Ct4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2244481Ct4.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2244481Ct4.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2244481Ct4.LJI = EnumC19362110p1.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2244481Ct4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2244481Ct4.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2244481Ct4.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2244481Ct4.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2244481Ct4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244481Ct4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244461Ct2 c2244461Ct2) {
            C2244461Ct2 c2244461Ct22 = c2244461Ct2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2244461Ct22.description);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2244461Ct22.reward_points) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c2244461Ct22.completed) + EnumC19362110p1.ADAPTER.encodedSizeWithTag(4, c2244461Ct22.type) + protoAdapter2.encodedSizeWithTag(5, c2244461Ct22.order) + protoAdapter.encodedSizeWithTag(6, c2244461Ct22.icon_url) + protoAdapter2.encodedSizeWithTag(7, c2244461Ct22.task_id) + c2244461Ct22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244461Ct2 redact(C2244461Ct2 c2244461Ct2) {
            C2244481Ct4 c2244481Ct4NewBuilder = c2244461Ct2.newBuilder();
            c2244481Ct4NewBuilder.clearUnknownFields();
            return c2244481Ct4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244461Ct2 c2244461Ct2) {
            C2244461Ct2 c2244461Ct22 = c2244461Ct2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244461Ct22.description);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2244461Ct22.reward_points);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c2244461Ct22.completed);
            EnumC19362110p1.ADAPTER.encodeWithTag(protoWriter, 4, c2244461Ct22.type);
            protoAdapter2.encodeWithTag(protoWriter, 5, c2244461Ct22.order);
            protoAdapter.encodeWithTag(protoWriter, 6, c2244461Ct22.icon_url);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2244461Ct22.task_id);
            protoWriter.writeBytes(c2244461Ct22.unknownFields());
        }
    };
    public static final Integer DEFAULT_REWARD_POINTS = 0;
    public static final Boolean DEFAULT_COMPLETED = Boolean.FALSE;
    public static final EnumC19362110p1 DEFAULT_TYPE = EnumC19362110p1.StreakPetTaskType_Unknown;
    public static final Integer DEFAULT_ORDER = 0;
    public static final Integer DEFAULT_TASK_ID = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.reward_points;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.completed;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        EnumC19362110p1 enumC19362110p1 = this.type;
        int iHashCode5 = (iHashCode4 + (enumC19362110p1 != null ? enumC19362110p1.hashCode() : 0)) * 37;
        Integer num2 = this.order;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str2 = this.icon_url;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num3 = this.task_id;
        int iHashCode8 = iHashCode7 + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2244481Ct4 newBuilder() {
        C2244481Ct4 c2244481Ct4 = new C2244481Ct4();
        c2244481Ct4.LIZLLL = this.description;
        c2244481Ct4.LJ = this.reward_points;
        c2244481Ct4.LJFF = this.completed;
        c2244481Ct4.LJI = this.type;
        c2244481Ct4.LJII = this.order;
        c2244481Ct4.LJIIIIZZ = this.icon_url;
        c2244481Ct4.LJIIIZ = this.task_id;
        c2244481Ct4.addUnknownFields(unknownFields());
        return c2244481Ct4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.reward_points != null) {
            sb.append(", reward_points=");
            sb.append(this.reward_points);
        }
        if (this.completed != null) {
            sb.append(", completed=");
            sb.append(this.completed);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        sb.replace(0, 2, "StreakPetTask{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244461Ct2)) {
            return false;
        }
        C2244461Ct2 c2244461Ct2 = (C2244461Ct2) obj;
        if (unknownFields().equals(c2244461Ct2.unknownFields()) && C1516540pZE.LJ(this.description, c2244461Ct2.description) && C1516540pZE.LJ(this.reward_points, c2244461Ct2.reward_points) && C1516540pZE.LJ(this.completed, c2244461Ct2.completed) && C1516540pZE.LJ(this.type, c2244461Ct2.type) && C1516540pZE.LJ(this.order, c2244461Ct2.order) && C1516540pZE.LJ(this.icon_url, c2244461Ct2.icon_url) && C1516540pZE.LJ(this.task_id, c2244461Ct2.task_id)) {
            return true;
        }
        return false;
    }

    public C2244461Ct2(String str, Integer num, Boolean bool, EnumC19362110p1 enumC19362110p1, Integer num2, String str2, Integer num3) {
        this(str, num, bool, enumC19362110p1, num2, str2, num3, ByteString.EMPTY);
    }

    public C2244461Ct2(String str, Integer num, Boolean bool, EnumC19362110p1 enumC19362110p1, Integer num2, String str2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.description = str;
        this.reward_points = num;
        this.completed = bool;
        this.type = enumC19362110p1;
        this.order = num2;
        this.icon_url = str2;
        this.task_id = num3;
    }
}
