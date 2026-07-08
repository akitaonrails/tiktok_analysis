package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239531Cl5 extends Message<C2239531Cl5, C2239551Cl7> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Integer conversation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, tag = 5)
    public final List<Integer> exp_for_level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer experience_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 101)
    public final String fe_common_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 102)
    public final String fe_extra_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long hatching_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long inviter_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String inviter_uid_str;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BdTuring.TYPE_ECAF)
    public final Long name_setter_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 201)
    public final String server_data_version;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetStatus#ADAPTER", tag = 2)
    public final C06G0 status;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetSubStatus#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final EnumC1571506Dh substatus;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetTask#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Map<Integer, C2244461Ct2> tasks;
    public static final ProtoAdapter<C2239531Cl5> ADAPTER = new ProtoAdapter<C2239531Cl5>() { // from class: X.1Cl6
        public final ProtoAdapter<Map<Integer, C2244461Ct2>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, C2244461Ct2.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2239531Cl5 decode(ProtoReader protoReader) {
            C2239551Cl7 c2239551Cl7 = new C2239551Cl7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 101) {
                        if (iNextTag != 102) {
                            if (iNextTag != 201) {
                                switch (iNextTag) {
                                    case 1:
                                        c2239551Cl7.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 2:
                                        try {
                                            c2239551Cl7.LJ = C06G0.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c2239551Cl7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                        break;
                                    case 3:
                                        c2239551Cl7.LJFF = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 4:
                                        c2239551Cl7.LJII = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 5:
                                        c2239551Cl7.LJIIIIZZ.add(ProtoAdapter.INT32.decode(protoReader));
                                        break;
                                    case 6:
                                        c2239551Cl7.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 7:
                                        c2239551Cl7.LJIIJ.putAll(this.LIZ.decode(protoReader));
                                        break;
                                    case 8:
                                        c2239551Cl7.LJI = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        c2239551Cl7.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        c2239551Cl7.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        try {
                                            c2239551Cl7.LJIILIIL = EnumC1571506Dh.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            c2239551Cl7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        }
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        c2239551Cl7.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2239551Cl7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                            } else {
                                c2239551Cl7.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2239551Cl7.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2239551Cl7.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2239551Cl7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2239531Cl5 c2239531Cl5) {
            C2239531Cl5 c2239531Cl52 = c2239531Cl5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2239531Cl52.conversation_id) + C06G0.ADAPTER.encodedSizeWithTag(2, c2239531Cl52.status);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2239531Cl52.inviter_uid) + protoAdapter.encodedSizeWithTag(8, c2239531Cl52.inviter_uid_str);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c2239531Cl52.experience_points) + protoAdapter3.asRepeated().encodedSizeWithTag(5, c2239531Cl52.exp_for_level) + protoAdapter.encodedSizeWithTag(6, c2239531Cl52.name) + this.LIZ.encodedSizeWithTag(7, c2239531Cl52.tasks) + protoAdapter2.encodedSizeWithTag(9, c2239531Cl52.name_setter_uid) + protoAdapter2.encodedSizeWithTag(10, c2239531Cl52.hatching_timestamp) + EnumC1571506Dh.ADAPTER.encodedSizeWithTag(11, c2239531Cl52.substatus) + protoAdapter3.encodedSizeWithTag(12, c2239531Cl52.conversation_type) + protoAdapter.encodedSizeWithTag(101, c2239531Cl52.fe_common_data) + protoAdapter.encodedSizeWithTag(102, c2239531Cl52.fe_extra_data) + protoAdapter.encodedSizeWithTag(201, c2239531Cl52.server_data_version) + c2239531Cl52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2239531Cl5 redact(C2239531Cl5 c2239531Cl5) {
            C2239551Cl7 c2239551Cl7NewBuilder = c2239531Cl5.newBuilder();
            C1516540pZE.LJIIJ(c2239551Cl7NewBuilder.LJIIJ, C2244461Ct2.ADAPTER);
            c2239551Cl7NewBuilder.clearUnknownFields();
            return c2239551Cl7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2239531Cl5 c2239531Cl5) {
            C2239531Cl5 c2239531Cl52 = c2239531Cl5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2239531Cl52.conversation_id);
            C06G0.ADAPTER.encodeWithTag(protoWriter, 2, c2239531Cl52.status);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2239531Cl52.inviter_uid);
            protoAdapter.encodeWithTag(protoWriter, 8, c2239531Cl52.inviter_uid_str);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 4, c2239531Cl52.experience_points);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, c2239531Cl52.exp_for_level);
            protoAdapter.encodeWithTag(protoWriter, 6, c2239531Cl52.name);
            this.LIZ.encodeWithTag(protoWriter, 7, c2239531Cl52.tasks);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2239531Cl52.name_setter_uid);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2239531Cl52.hatching_timestamp);
            EnumC1571506Dh.ADAPTER.encodeWithTag(protoWriter, 11, c2239531Cl52.substatus);
            protoAdapter3.encodeWithTag(protoWriter, 12, c2239531Cl52.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 101, c2239531Cl52.fe_common_data);
            protoAdapter.encodeWithTag(protoWriter, 102, c2239531Cl52.fe_extra_data);
            protoAdapter.encodeWithTag(protoWriter, 201, c2239531Cl52.server_data_version);
            protoWriter.writeBytes(c2239531Cl52.unknownFields());
        }
    };
    public static final C06G0 DEFAULT_STATUS = C06G0.StreakPetStatus_Inactive;
    public static final Long DEFAULT_INVITER_UID = 0L;
    public static final Integer DEFAULT_EXPERIENCE_POINTS = 0;
    public static final Long DEFAULT_NAME_SETTER_UID = 0L;
    public static final Long DEFAULT_HATCHING_TIMESTAMP = 0L;
    public static final EnumC1571506Dh DEFAULT_SUBSTATUS = EnumC1571506Dh.StreakPetSubStatus_Unknown;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.conversation_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C06G0 c06g0 = this.status;
        int iHashCode3 = (iHashCode2 + (c06g0 != null ? c06g0.hashCode() : 0)) * 37;
        Long l = this.inviter_uid;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        String str2 = this.inviter_uid_str;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.experience_points;
        int iHashCode6 = (((iHashCode5 + (num != null ? num.hashCode() : 0)) * 37) + this.exp_for_level.hashCode()) * 37;
        String str3 = this.name;
        int iHashCode7 = (((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.tasks.hashCode()) * 37;
        Long l2 = this.name_setter_uid;
        int iHashCode8 = (iHashCode7 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.hatching_timestamp;
        int iHashCode9 = (iHashCode8 + (l3 != null ? l3.hashCode() : 0)) * 37;
        EnumC1571506Dh enumC1571506Dh = this.substatus;
        int iHashCode10 = (iHashCode9 + (enumC1571506Dh != null ? enumC1571506Dh.hashCode() : 0)) * 37;
        Integer num2 = this.conversation_type;
        int iHashCode11 = (iHashCode10 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str4 = this.fe_common_data;
        int iHashCode12 = (iHashCode11 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.fe_extra_data;
        int iHashCode13 = (iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.server_data_version;
        int iHashCode14 = iHashCode13 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public C2239551Cl7 newBuilder() {
        C2239551Cl7 c2239551Cl7 = new C2239551Cl7();
        c2239551Cl7.LIZLLL = this.conversation_id;
        c2239551Cl7.LJ = this.status;
        c2239551Cl7.LJFF = this.inviter_uid;
        c2239551Cl7.LJI = this.inviter_uid_str;
        c2239551Cl7.LJII = this.experience_points;
        c2239551Cl7.LJIIIIZZ = C1516540pZE.LIZJ("exp_for_level", this.exp_for_level);
        c2239551Cl7.LJIIIZ = this.name;
        c2239551Cl7.LJIIJ = C1516540pZE.LIZLLL("tasks", this.tasks);
        c2239551Cl7.LJIIJJI = this.name_setter_uid;
        c2239551Cl7.LJIIL = this.hatching_timestamp;
        c2239551Cl7.LJIILIIL = this.substatus;
        c2239551Cl7.LJIILJJIL = this.conversation_type;
        c2239551Cl7.LJIILL = this.fe_common_data;
        c2239551Cl7.LJIILLIIL = this.fe_extra_data;
        c2239551Cl7.LJIIZILJ = this.server_data_version;
        c2239551Cl7.addUnknownFields(unknownFields());
        return c2239551Cl7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.inviter_uid != null) {
            sb.append(", inviter_uid=");
            sb.append(this.inviter_uid);
        }
        if (this.inviter_uid_str != null) {
            sb.append(", inviter_uid_str=");
            sb.append(this.inviter_uid_str);
        }
        if (this.experience_points != null) {
            sb.append(", experience_points=");
            sb.append(this.experience_points);
        }
        if (!this.exp_for_level.isEmpty()) {
            sb.append(", exp_for_level=");
            sb.append(this.exp_for_level);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.tasks.isEmpty()) {
            sb.append(", tasks=");
            sb.append(this.tasks);
        }
        if (this.name_setter_uid != null) {
            sb.append(", name_setter_uid=");
            sb.append(this.name_setter_uid);
        }
        if (this.hatching_timestamp != null) {
            sb.append(", hatching_timestamp=");
            sb.append(this.hatching_timestamp);
        }
        if (this.substatus != null) {
            sb.append(", substatus=");
            sb.append(this.substatus);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.fe_common_data != null) {
            sb.append(", fe_common_data=");
            sb.append(this.fe_common_data);
        }
        if (this.fe_extra_data != null) {
            sb.append(", fe_extra_data=");
            sb.append(this.fe_extra_data);
        }
        if (this.server_data_version != null) {
            sb.append(", server_data_version=");
            sb.append(this.server_data_version);
        }
        sb.replace(0, 2, "StreakPetValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2239531Cl5)) {
            return false;
        }
        C2239531Cl5 c2239531Cl5 = (C2239531Cl5) obj;
        if (unknownFields().equals(c2239531Cl5.unknownFields()) && C1516540pZE.LJ(this.conversation_id, c2239531Cl5.conversation_id) && C1516540pZE.LJ(this.status, c2239531Cl5.status) && C1516540pZE.LJ(this.inviter_uid, c2239531Cl5.inviter_uid) && C1516540pZE.LJ(this.inviter_uid_str, c2239531Cl5.inviter_uid_str) && C1516540pZE.LJ(this.experience_points, c2239531Cl5.experience_points) && this.exp_for_level.equals(c2239531Cl5.exp_for_level) && C1516540pZE.LJ(this.name, c2239531Cl5.name) && this.tasks.equals(c2239531Cl5.tasks) && C1516540pZE.LJ(this.name_setter_uid, c2239531Cl5.name_setter_uid) && C1516540pZE.LJ(this.hatching_timestamp, c2239531Cl5.hatching_timestamp) && C1516540pZE.LJ(this.substatus, c2239531Cl5.substatus) && C1516540pZE.LJ(this.conversation_type, c2239531Cl5.conversation_type) && C1516540pZE.LJ(this.fe_common_data, c2239531Cl5.fe_common_data) && C1516540pZE.LJ(this.fe_extra_data, c2239531Cl5.fe_extra_data) && C1516540pZE.LJ(this.server_data_version, c2239531Cl5.server_data_version)) {
            return true;
        }
        return false;
    }

    public C2239531Cl5(String str, C06G0 c06g0, Long l, String str2, Integer num, List<Integer> list, String str3, Map<Integer, C2244461Ct2> map, Long l2, Long l3, EnumC1571506Dh enumC1571506Dh, Integer num2, String str4, String str5, String str6) {
        this(str, c06g0, l, str2, num, list, str3, map, l2, l3, enumC1571506Dh, num2, str4, str5, str6, ByteString.EMPTY);
    }

    public C2239531Cl5(String str, C06G0 c06g0, Long l, String str2, Integer num, List<Integer> list, String str3, Map<Integer, C2244461Ct2> map, Long l2, Long l3, EnumC1571506Dh enumC1571506Dh, Integer num2, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.status = c06g0;
        this.inviter_uid = l;
        this.inviter_uid_str = str2;
        this.experience_points = num;
        this.exp_for_level = C1516540pZE.LJFF("exp_for_level", list);
        this.name = str3;
        this.tasks = C1516540pZE.LJI("tasks", map);
        this.name_setter_uid = l2;
        this.hatching_timestamp = l3;
        this.substatus = enumC1571506Dh;
        this.conversation_type = num2;
        this.fe_common_data = str4;
        this.fe_extra_data = str5;
        this.server_data_version = str6;
    }
}
