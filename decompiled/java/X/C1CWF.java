package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWF extends Message<C1CWF, C1CWH> {
    public static final ProtoAdapter<C1CWF> ADAPTER = new ProtoAdapter<C1CWF>() { // from class: X.1CWG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWF decode(ProtoReader protoReader) {
            C1CWH c1cwh = new C1CWH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cwh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1cwh.LJI = C1CWW.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cwh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c1cwh.LJFF = C1CWW.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1cwh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            c1cwh.LJ = C1CW4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cwh.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            c1cwh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWF c1cwf) {
            C1CWF c1cwf2 = c1cwf;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cwf2.arch_type) + C1CW4.ADAPTER.encodedSizeWithTag(2, c1cwf2.identity);
            ProtoAdapter<C1CWW> protoAdapter = C1CWW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1cwf2.old_state) + protoAdapter.encodedSizeWithTag(4, c1cwf2.new_state) + c1cwf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWF redact(C1CWF c1cwf) {
            C1CWH c1cwhNewBuilder = c1cwf.newBuilder();
            c1cwhNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cwhNewBuilder.LJ);
            c1cwhNewBuilder.clearUnknownFields();
            return c1cwhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWF c1cwf) {
            C1CWF c1cwf2 = c1cwf;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cwf2.arch_type);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c1cwf2.identity);
            ProtoAdapter<C1CWW> protoAdapter = C1CWW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwf2.old_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cwf2.new_state);
            protoWriter.writeBytes(c1cwf2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final C1CWW DEFAULT_NEW_STATE;
    public static final C1CWW DEFAULT_OLD_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW4 identity;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CWW new_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CWW old_state;

    static {
        C1CWW c1cww = C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
        DEFAULT_OLD_STATE = c1cww;
        DEFAULT_NEW_STATE = c1cww;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.identity.hashCode()) * 37) + this.old_state.hashCode()) * 37) + this.new_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CWH newBuilder() {
        C1CWH c1cwh = new C1CWH();
        c1cwh.LIZLLL = this.arch_type;
        c1cwh.LJ = this.identity;
        c1cwh.LJFF = this.old_state;
        c1cwh.LJI = this.new_state;
        c1cwh.addUnknownFields(unknownFields());
        return c1cwh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", identity=");
        sb.append(this.identity);
        sb.append(", old_state=");
        sb.append(this.old_state);
        sb.append(", new_state=");
        sb.append(this.new_state);
        sb.replace(0, 2, "FuncParamsXdbdaf5b7d499c0a7{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWF)) {
            return false;
        }
        C1CWF c1cwf = (C1CWF) obj;
        if (unknownFields().equals(c1cwf.unknownFields()) && this.arch_type.equals(c1cwf.arch_type) && this.identity.equals(c1cwf.identity) && this.old_state.equals(c1cwf.old_state) && this.new_state.equals(c1cwf.new_state)) {
            return true;
        }
        return false;
    }

    public C1CWF(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWW c1cww, C1CWW c1cww2) {
        this(enumC2183371Ach, c1cw4, c1cww, c1cww2, ByteString.EMPTY);
    }

    public C1CWF(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWW c1cww, C1CWW c1cww2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.identity = c1cw4;
        this.old_state = c1cww;
        this.new_state = c1cww2;
    }
}
