package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWA extends Message<C1CWA, C1CWB> {
    public static final ProtoAdapter<C1CWA> ADAPTER = new ProtoAdapter<C1CWA>() { // from class: X.1CW9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWA decode(ProtoReader protoReader) {
            C1CWB c1cwb = new C1CWB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cwb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1cwb.LJI = C1CWY.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cwb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c1cwb.LJFF = C1CWY.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1cwb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            c1cwb.LJ = C1CW4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cwb.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            c1cwb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWA c1cwa) {
            C1CWA c1cwa2 = c1cwa;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cwa2.arch_type) + C1CW4.ADAPTER.encodedSizeWithTag(2, c1cwa2.identity);
            ProtoAdapter<C1CWY> protoAdapter = C1CWY.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1cwa2.old_state) + protoAdapter.encodedSizeWithTag(4, c1cwa2.new_state) + c1cwa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWA redact(C1CWA c1cwa) {
            C1CWB c1cwbNewBuilder = c1cwa.newBuilder();
            c1cwbNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cwbNewBuilder.LJ);
            c1cwbNewBuilder.clearUnknownFields();
            return c1cwbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWA c1cwa) {
            C1CWA c1cwa2 = c1cwa;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cwa2.arch_type);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c1cwa2.identity);
            ProtoAdapter<C1CWY> protoAdapter = C1CWY.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwa2.old_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cwa2.new_state);
            protoWriter.writeBytes(c1cwa2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final C1CWY DEFAULT_NEW_STATE;
    public static final C1CWY DEFAULT_OLD_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW4 identity;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CWY new_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CWY old_state;

    static {
        C1CWY c1cwy = C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
        DEFAULT_OLD_STATE = c1cwy;
        DEFAULT_NEW_STATE = c1cwy;
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
    public C1CWB newBuilder() {
        C1CWB c1cwb = new C1CWB();
        c1cwb.LIZLLL = this.arch_type;
        c1cwb.LJ = this.identity;
        c1cwb.LJFF = this.old_state;
        c1cwb.LJI = this.new_state;
        c1cwb.addUnknownFields(unknownFields());
        return c1cwb;
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
        sb.replace(0, 2, "FuncParamsXaf403d897493d250{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWA)) {
            return false;
        }
        C1CWA c1cwa = (C1CWA) obj;
        if (unknownFields().equals(c1cwa.unknownFields()) && this.arch_type.equals(c1cwa.arch_type) && this.identity.equals(c1cwa.identity) && this.old_state.equals(c1cwa.old_state) && this.new_state.equals(c1cwa.new_state)) {
            return true;
        }
        return false;
    }

    public C1CWA(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWY c1cwy, C1CWY c1cwy2) {
        this(enumC2183371Ach, c1cw4, c1cwy, c1cwy2, ByteString.EMPTY);
    }

    public C1CWA(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWY c1cwy, C1CWY c1cwy2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.identity = c1cw4;
        this.old_state = c1cwy;
        this.new_state = c1cwy2;
    }
}
