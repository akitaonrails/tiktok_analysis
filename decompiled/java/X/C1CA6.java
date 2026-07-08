package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CA6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA6 extends Message<C1CA6, C1CA7> {
    public static final ProtoAdapter<C1CA6> ADAPTER = new ProtoAdapter<C1CA6>() { // from class: X.1CA5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA6 decode(ProtoReader protoReader) {
            C1CA7 c1ca7 = new C1CA7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1ca7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1ca7.LJFF.add(C1CA0.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1ca7.LJ = C2239531Cl5.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1ca7.LIZLLL = EnumC19363410pE.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1ca7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ca7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CA6 c1ca6) {
            C1CA6 c1ca62 = c1ca6;
            return EnumC19363410pE.ADAPTER.encodedSizeWithTag(1, c1ca62.cmd_type) + C2239531Cl5.ADAPTER.encodedSizeWithTag(2, c1ca62.pet_value) + C1CA0.ADAPTER.asRepeated().encodedSizeWithTag(3, c1ca62.action_infos) + c1ca62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA6 redact(C1CA6 c1ca6) {
            C1CA7 c1ca7NewBuilder = c1ca6.newBuilder();
            C2239531Cl5 c2239531Cl5 = c1ca7NewBuilder.LJ;
            if (c2239531Cl5 != null) {
                c1ca7NewBuilder.LJ = C2239531Cl5.ADAPTER.redact(c2239531Cl5);
            }
            C1516540pZE.LJIIIZ(c1ca7NewBuilder.LJFF, C1CA0.ADAPTER);
            c1ca7NewBuilder.clearUnknownFields();
            return c1ca7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CA6 c1ca6) {
            C1CA6 c1ca62 = c1ca6;
            EnumC19363410pE.ADAPTER.encodeWithTag(protoWriter, 1, c1ca62.cmd_type);
            C2239531Cl5.ADAPTER.encodeWithTag(protoWriter, 2, c1ca62.pet_value);
            C1CA0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1ca62.action_infos);
            protoWriter.writeBytes(c1ca62.unknownFields());
        }
    };
    public static final EnumC19363410pE DEFAULT_CMD_TYPE = EnumC19363410pE.StreakPetCmdUnknown;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetActionInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C1CA0> action_infos;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetCommandType#ADAPTER", tag = 1)
    public final EnumC19363410pE cmd_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetValue#ADAPTER", tag = 2)
    public final C2239531Cl5 pet_value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC19363410pE enumC19363410pE = this.cmd_type;
        int iHashCode2 = (iHashCode + (enumC19363410pE != null ? enumC19363410pE.hashCode() : 0)) * 37;
        C2239531Cl5 c2239531Cl5 = this.pet_value;
        int iHashCode3 = ((iHashCode2 + (c2239531Cl5 != null ? c2239531Cl5.hashCode() : 0)) * 37) + this.action_infos.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CA7 newBuilder() {
        C1CA7 c1ca7 = new C1CA7();
        c1ca7.LIZLLL = this.cmd_type;
        c1ca7.LJ = this.pet_value;
        c1ca7.LJFF = C1516540pZE.LIZJ("action_infos", this.action_infos);
        c1ca7.addUnknownFields(unknownFields());
        return c1ca7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd_type != null) {
            sb.append(", cmd_type=");
            sb.append(this.cmd_type);
        }
        if (this.pet_value != null) {
            sb.append(", pet_value=");
            sb.append(this.pet_value);
        }
        if (!this.action_infos.isEmpty()) {
            sb.append(", action_infos=");
            sb.append(this.action_infos);
        }
        sb.replace(0, 2, "StreakPetCommandMessage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CA6)) {
            return false;
        }
        C1CA6 c1ca6 = (C1CA6) obj;
        if (unknownFields().equals(c1ca6.unknownFields()) && C1516540pZE.LJ(this.cmd_type, c1ca6.cmd_type) && C1516540pZE.LJ(this.pet_value, c1ca6.pet_value) && this.action_infos.equals(c1ca6.action_infos)) {
            return true;
        }
        return false;
    }

    public C1CA6(EnumC19363410pE enumC19363410pE, C2239531Cl5 c2239531Cl5, List<C1CA0> list) {
        this(enumC19363410pE, c2239531Cl5, list, ByteString.EMPTY);
    }

    public C1CA6(EnumC19363410pE enumC19363410pE, C2239531Cl5 c2239531Cl5, List<C1CA0> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd_type = enumC19363410pE;
        this.pet_value = c2239531Cl5;
        this.action_infos = C1516540pZE.LJFF("action_infos", list);
    }
}
