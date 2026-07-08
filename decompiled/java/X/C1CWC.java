package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWC extends Message<C1CWC, C1CWE> {
    public static final ProtoAdapter<C1CWC> ADAPTER = new ProtoAdapter<C1CWC>() { // from class: X.1CWD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWC decode(ProtoReader protoReader) {
            C1CWE c1cwe = new C1CWE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cwe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1cwe.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c1cwe.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1cwe.LJ = C1CW4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cwe.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cwe.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWC c1cwc) {
            C1CWC c1cwc2 = c1cwc;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cwc2.arch_type) + C1CW4.ADAPTER.encodedSizeWithTag(2, c1cwc2.identity);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1cwc2.old_state) + protoAdapter.encodedSizeWithTag(4, c1cwc2.new_state) + c1cwc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWC redact(C1CWC c1cwc) {
            C1CWE c1cweNewBuilder = c1cwc.newBuilder();
            c1cweNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cweNewBuilder.LJ);
            c1cweNewBuilder.clearUnknownFields();
            return c1cweNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWC c1cwc) {
            C1CWC c1cwc2 = c1cwc;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cwc2.arch_type);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c1cwc2.identity);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwc2.old_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cwc2.new_state);
            protoWriter.writeBytes(c1cwc2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final Boolean DEFAULT_NEW_STATE;
    public static final Boolean DEFAULT_OLD_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW4 identity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean new_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean old_state;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_OLD_STATE = bool;
        DEFAULT_NEW_STATE = bool;
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
    public C1CWE newBuilder() {
        C1CWE c1cwe = new C1CWE();
        c1cwe.LIZLLL = this.arch_type;
        c1cwe.LJ = this.identity;
        c1cwe.LJFF = this.old_state;
        c1cwe.LJI = this.new_state;
        c1cwe.addUnknownFields(unknownFields());
        return c1cwe;
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
        sb.replace(0, 2, "FuncParamsX7c451ff115c9071a{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWC)) {
            return false;
        }
        C1CWC c1cwc = (C1CWC) obj;
        if (unknownFields().equals(c1cwc.unknownFields()) && this.arch_type.equals(c1cwc.arch_type) && this.identity.equals(c1cwc.identity) && this.old_state.equals(c1cwc.old_state) && this.new_state.equals(c1cwc.new_state)) {
            return true;
        }
        return false;
    }

    public C1CWC(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, Boolean bool, Boolean bool2) {
        this(enumC2183371Ach, c1cw4, bool, bool2, ByteString.EMPTY);
    }

    public C1CWC(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.identity = c1cw4;
        this.old_state = bool;
        this.new_state = bool2;
    }
}
