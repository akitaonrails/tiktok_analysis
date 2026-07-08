package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244541CtA extends Message<C2244541CtA, C2244561CtC> {
    public static final ProtoAdapter<C2244541CtA> ADAPTER = new ProtoAdapter<C2244541CtA>() { // from class: X.1CtB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244541CtA decode(ProtoReader protoReader) {
            C2244561CtC c2244561CtC = new C2244561CtC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2244561CtC.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c2244561CtC.LJFF = EnumC1567006Bo.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2244561CtC.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2244561CtC.LJ = C2272741DxY.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2244561CtC.LIZLLL = C06BD.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c2244561CtC.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244561CtC.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244541CtA c2244541CtA) {
            C2244541CtA c2244541CtA2 = c2244541CtA;
            return C06BD.ADAPTER.encodedSizeWithTag(1, c2244541CtA2.cmd_type) + C2272741DxY.ADAPTER.encodedSizeWithTag(2, c2244541CtA2.streak_value) + EnumC1567006Bo.ADAPTER.encodedSizeWithTag(3, c2244541CtA2.streak_action) + c2244541CtA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244541CtA redact(C2244541CtA c2244541CtA) {
            C2244561CtC c2244561CtCNewBuilder = c2244541CtA.newBuilder();
            C2272741DxY c2272741DxY = c2244561CtCNewBuilder.LJ;
            if (c2272741DxY != null) {
                c2244561CtCNewBuilder.LJ = C2272741DxY.ADAPTER.redact(c2272741DxY);
            }
            c2244561CtCNewBuilder.clearUnknownFields();
            return c2244561CtCNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244541CtA c2244541CtA) {
            C2244541CtA c2244541CtA2 = c2244541CtA;
            C06BD.ADAPTER.encodeWithTag(protoWriter, 1, c2244541CtA2.cmd_type);
            C2272741DxY.ADAPTER.encodeWithTag(protoWriter, 2, c2244541CtA2.streak_value);
            EnumC1567006Bo.ADAPTER.encodeWithTag(protoWriter, 3, c2244541CtA2.streak_action);
            protoWriter.writeBytes(c2244541CtA2.unknownFields());
        }
    };
    public static final C06BD DEFAULT_CMD_TYPE = C06BD.StreakCmdUnknown;
    public static final EnumC1567006Bo DEFAULT_STREAK_ACTION = EnumC1567006Bo.StreakActionUnkown;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakCommandType#ADAPTER", tag = 1)
    public final C06BD cmd_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakActionType#ADAPTER", tag = 3)
    public final EnumC1567006Bo streak_action;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakValue#ADAPTER", tag = 2)
    public final C2272741DxY streak_value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C06BD c06bd = this.cmd_type;
        int iHashCode2 = (iHashCode + (c06bd != null ? c06bd.hashCode() : 0)) * 37;
        C2272741DxY c2272741DxY = this.streak_value;
        int iHashCode3 = (iHashCode2 + (c2272741DxY != null ? c2272741DxY.hashCode() : 0)) * 37;
        EnumC1567006Bo enumC1567006Bo = this.streak_action;
        int iHashCode4 = iHashCode3 + (enumC1567006Bo != null ? enumC1567006Bo.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2244561CtC newBuilder() {
        C2244561CtC c2244561CtC = new C2244561CtC();
        c2244561CtC.LIZLLL = this.cmd_type;
        c2244561CtC.LJ = this.streak_value;
        c2244561CtC.LJFF = this.streak_action;
        c2244561CtC.addUnknownFields(unknownFields());
        return c2244561CtC;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd_type != null) {
            sb.append(", cmd_type=");
            sb.append(this.cmd_type);
        }
        if (this.streak_value != null) {
            sb.append(", streak_value=");
            sb.append(this.streak_value);
        }
        if (this.streak_action != null) {
            sb.append(", streak_action=");
            sb.append(this.streak_action);
        }
        sb.replace(0, 2, "StreakCommandMessage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244541CtA)) {
            return false;
        }
        C2244541CtA c2244541CtA = (C2244541CtA) obj;
        if (unknownFields().equals(c2244541CtA.unknownFields()) && C1516540pZE.LJ(this.cmd_type, c2244541CtA.cmd_type) && C1516540pZE.LJ(this.streak_value, c2244541CtA.streak_value) && C1516540pZE.LJ(this.streak_action, c2244541CtA.streak_action)) {
            return true;
        }
        return false;
    }

    public C2244541CtA(C06BD c06bd, C2272741DxY c2272741DxY, EnumC1567006Bo enumC1567006Bo) {
        this(c06bd, c2272741DxY, enumC1567006Bo, ByteString.EMPTY);
    }

    public C2244541CtA(C06BD c06bd, C2272741DxY c2272741DxY, EnumC1567006Bo enumC1567006Bo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd_type = c06bd;
        this.streak_value = c2272741DxY;
        this.streak_action = enumC1567006Bo;
    }
}
