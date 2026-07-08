package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CS1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS1 extends Message<C1CS1, C1CS3> {
    public static final ProtoAdapter<C1CS1> ADAPTER = new ProtoAdapter<C1CS1>() { // from class: X.1CS2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS1 decode(ProtoReader protoReader) {
            C1CS3 c1cs3 = new C1CS3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cs3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cs3.LJFF = C2233401CbC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cs3.LJ = C1CSA.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cs3.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cs3.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cs3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CS1 c1cs1) {
            C1CS1 c1cs12 = c1cs1;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cs12.arch_type) + C1CSA.ADAPTER.encodedSizeWithTag(2, c1cs12.result) + C2233401CbC.ADAPTER.encodedSizeWithTag(3, c1cs12.source) + c1cs12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS1 redact(C1CS1 c1cs1) {
            C1CS3 c1cs3NewBuilder = c1cs1.newBuilder();
            c1cs3NewBuilder.LJ = C1CSA.ADAPTER.redact(c1cs3NewBuilder.LJ);
            c1cs3NewBuilder.LJFF = C2233401CbC.ADAPTER.redact(c1cs3NewBuilder.LJFF);
            c1cs3NewBuilder.clearUnknownFields();
            return c1cs3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CS1 c1cs1) {
            C1CS1 c1cs12 = c1cs1;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cs12.arch_type);
            C1CSA.ADAPTER.encodeWithTag(protoWriter, 2, c1cs12.result);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 3, c1cs12.source);
            protoWriter.writeBytes(c1cs12.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderResult#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CSA result;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233401CbC source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.result.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CS3 newBuilder() {
        C1CS3 c1cs3 = new C1CS3();
        c1cs3.LIZLLL = this.arch_type;
        c1cs3.LJ = this.result;
        c1cs3.LJFF = this.source;
        c1cs3.addUnknownFields(unknownFields());
        return c1cs3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXd5135dce468cca03{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CS1)) {
            return false;
        }
        C1CS1 c1cs1 = (C1CS1) obj;
        if (unknownFields().equals(c1cs1.unknownFields()) && this.arch_type.equals(c1cs1.arch_type) && this.result.equals(c1cs1.result) && this.source.equals(c1cs1.source)) {
            return true;
        }
        return false;
    }

    public C1CS1(EnumC2183371Ach enumC2183371Ach, C1CSA c1csa, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, c1csa, c2233401CbC, ByteString.EMPTY);
    }

    public C1CS1(EnumC2183371Ach enumC2183371Ach, C1CSA c1csa, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.result = c1csa;
        this.source = c2233401CbC;
    }
}
