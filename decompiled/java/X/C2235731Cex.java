package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235731Cex extends Message<C2235731Cex, C2235751Cez> {
    public static final Boolean DEFAULT_ARCH_DATA_ERROR;
    public static final Boolean DEFAULT_IS_FORCE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean arch_data_error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_force;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRechargeSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CX8 recharge_reason;
    public static final ProtoAdapter<C2235731Cex> ADAPTER = new ProtoAdapter<C2235731Cex>() { // from class: X.1Cey
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235731Cex decode(ProtoReader protoReader) {
            C2235751Cez c2235751Cez = new C2235751Cez();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2235751Cez.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2235751Cez.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2235751Cez.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            try {
                                c2235751Cez.LJ = C1CX8.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2235751Cez.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2235751Cez.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235751Cez.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235731Cex c2235731Cex) {
            C2235731Cex c2235731Cex2 = c2235731Cex;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2235731Cex2.invoke_id) + C1CX8.ADAPTER.encodedSizeWithTag(2, c2235731Cex2.recharge_reason);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2235731Cex2.is_force) + protoAdapter.encodedSizeWithTag(4, c2235731Cex2.arch_data_error) + c2235731Cex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235731Cex redact(C2235731Cex c2235731Cex) {
            C2235751Cez c2235751CezNewBuilder = c2235731Cex.newBuilder();
            c2235751CezNewBuilder.clearUnknownFields();
            return c2235751CezNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235731Cex c2235731Cex) {
            C2235731Cex c2235731Cex2 = c2235731Cex;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2235731Cex2.invoke_id);
            C1CX8.ADAPTER.encodeWithTag(protoWriter, 2, c2235731Cex2.recharge_reason);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c2235731Cex2.is_force);
            protoAdapter.encodeWithTag(protoWriter, 4, c2235731Cex2.arch_data_error);
            protoWriter.writeBytes(c2235731Cex2.unknownFields());
        }
    };
    public static final C1CX8 DEFAULT_RECHARGE_REASON = C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_POSITIVE;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_FORCE = bool;
        DEFAULT_ARCH_DATA_ERROR = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.invoke_id;
        int iHashCode2 = ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.recharge_reason.hashCode()) * 37) + this.is_force.hashCode()) * 37) + this.arch_data_error.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2235751Cez newBuilder() {
        C2235751Cez c2235751Cez = new C2235751Cez();
        c2235751Cez.LIZLLL = this.invoke_id;
        c2235751Cez.LJ = this.recharge_reason;
        c2235751Cez.LJFF = this.is_force;
        c2235751Cez.LJI = this.arch_data_error;
        c2235751Cez.addUnknownFields(unknownFields());
        return c2235751Cez;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.invoke_id != null) {
            sb.append(", invoke_id=");
            sb.append(this.invoke_id);
        }
        sb.append(", recharge_reason=");
        sb.append(this.recharge_reason);
        sb.append(", is_force=");
        sb.append(this.is_force);
        sb.append(", arch_data_error=");
        sb.append(this.arch_data_error);
        sb.replace(0, 2, "LinkMicCompensateGroupListChangeParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235731Cex)) {
            return false;
        }
        C2235731Cex c2235731Cex = (C2235731Cex) obj;
        if (unknownFields().equals(c2235731Cex.unknownFields()) && C1516540pZE.LJ(this.invoke_id, c2235731Cex.invoke_id) && this.recharge_reason.equals(c2235731Cex.recharge_reason) && this.is_force.equals(c2235731Cex.is_force) && this.arch_data_error.equals(c2235731Cex.arch_data_error)) {
            return true;
        }
        return false;
    }

    public C2235731Cex(String str, C1CX8 c1cx8, Boolean bool, Boolean bool2) {
        this(str, c1cx8, bool, bool2, ByteString.EMPTY);
    }

    public C2235731Cex(String str, C1CX8 c1cx8, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.recharge_reason = c1cx8;
        this.is_force = bool;
        this.arch_data_error = bool2;
    }
}
