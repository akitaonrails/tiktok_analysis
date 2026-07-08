package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWI extends Message<C1CWI, C1CWK> {
    public static final ProtoAdapter<C1CWI> ADAPTER = new ProtoAdapter<C1CWI>() { // from class: X.1CWJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWI decode(ProtoReader protoReader) {
            C1CWK c1cwk = new C1CWK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cwk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1cwk.LJI = C1CXN.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cwk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c1cwk.LJFF = C1CXN.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1cwk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            c1cwk.LJ = C1CW4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cwk.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            c1cwk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWI c1cwi) {
            C1CWI c1cwi2 = c1cwi;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cwi2.arch_type) + C1CW4.ADAPTER.encodedSizeWithTag(2, c1cwi2.identity);
            ProtoAdapter<C1CXN> protoAdapter = C1CXN.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1cwi2.old_state) + protoAdapter.encodedSizeWithTag(4, c1cwi2.new_state) + c1cwi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWI redact(C1CWI c1cwi) {
            C1CWK c1cwkNewBuilder = c1cwi.newBuilder();
            c1cwkNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cwkNewBuilder.LJ);
            c1cwkNewBuilder.clearUnknownFields();
            return c1cwkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWI c1cwi) {
            C1CWI c1cwi2 = c1cwi;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cwi2.arch_type);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c1cwi2.identity);
            ProtoAdapter<C1CXN> protoAdapter = C1CXN.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwi2.old_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cwi2.new_state);
            protoWriter.writeBytes(c1cwi2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final C1CXN DEFAULT_NEW_STATE;
    public static final C1CXN DEFAULT_OLD_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW4 identity;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CXN new_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXN old_state;

    static {
        C1CXN c1cxn = C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
        DEFAULT_OLD_STATE = c1cxn;
        DEFAULT_NEW_STATE = c1cxn;
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
    public C1CWK newBuilder() {
        C1CWK c1cwk = new C1CWK();
        c1cwk.LIZLLL = this.arch_type;
        c1cwk.LJ = this.identity;
        c1cwk.LJFF = this.old_state;
        c1cwk.LJI = this.new_state;
        c1cwk.addUnknownFields(unknownFields());
        return c1cwk;
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
        sb.replace(0, 2, "FuncParamsX81ad3333680a19c2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWI)) {
            return false;
        }
        C1CWI c1cwi = (C1CWI) obj;
        if (unknownFields().equals(c1cwi.unknownFields()) && this.arch_type.equals(c1cwi.arch_type) && this.identity.equals(c1cwi.identity) && this.old_state.equals(c1cwi.old_state) && this.new_state.equals(c1cwi.new_state)) {
            return true;
        }
        return false;
    }

    public C1CWI(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CXN c1cxn, C1CXN c1cxn2) {
        this(enumC2183371Ach, c1cw4, c1cxn, c1cxn2, ByteString.EMPTY);
    }

    public C1CWI(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CXN c1cxn, C1CXN c1cxn2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.identity = c1cw4;
        this.old_state = c1cxn;
        this.new_state = c1cxn2;
    }
}
