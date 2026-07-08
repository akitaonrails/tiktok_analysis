package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228151CIr extends Message<C2228151CIr, C2228161CIs> {
    public static final ProtoAdapter<C2228151CIr> ADAPTER = new ProtoAdapter<C2228151CIr>() { // from class: X.1CIq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228151CIr decode(ProtoReader protoReader) {
            C2228161CIs c2228161CIs = new C2228161CIs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228161CIs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            c2228161CIs.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2228161CIs.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228161CIs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228151CIr c2228151CIr) {
            C2228151CIr c2228151CIr2 = c2228151CIr;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2228151CIr2.ret) + c2228151CIr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228151CIr redact(C2228151CIr c2228151CIr) {
            C2228161CIs c2228161CIsNewBuilder = c2228151CIr.newBuilder();
            c2228161CIsNewBuilder.clearUnknownFields();
            return c2228161CIsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228151CIr c2228151CIr) {
            C2228151CIr c2228151CIr2 = c2228151CIr;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2228151CIr2.ret);
            protoWriter.writeBytes(c2228151CIr2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_RET = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228161CIs newBuilder() {
        C2228161CIs c2228161CIs = new C2228161CIs();
        c2228161CIs.LIZLLL = this.ret;
        c2228161CIs.addUnknownFields(unknownFields());
        return c2228161CIs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX3d0dd5d23458d184{");
        sb.append('}');
        return sb.toString();
    }

    public C2228151CIr(EnumC2183371Ach enumC2183371Ach) {
        this(enumC2183371Ach, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228151CIr)) {
            return false;
        }
        C2228151CIr c2228151CIr = (C2228151CIr) obj;
        if (unknownFields().equals(c2228151CIr.unknownFields()) && this.ret.equals(c2228151CIr.ret)) {
            return true;
        }
        return false;
    }

    public C2228151CIr(EnumC2183371Ach enumC2183371Ach, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = enumC2183371Ach;
    }
}
