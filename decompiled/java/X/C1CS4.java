package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CS4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS4 extends Message<C1CS4, C1CS6> {
    public static final ProtoAdapter<C1CS4> ADAPTER = new ProtoAdapter<C1CS4>() { // from class: X.1CS5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS4 decode(ProtoReader protoReader) {
            C1CS6 c1cs6 = new C1CS6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cs6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cs6.LJFF = C2233401CbC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cs6.LJ = C2232721Ca6.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cs6.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cs6.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cs6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CS4 c1cs4) {
            C1CS4 c1cs42 = c1cs4;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cs42.arch_type) + C2232721Ca6.ADAPTER.encodedSizeWithTag(2, c1cs42.model) + C2233401CbC.ADAPTER.encodedSizeWithTag(3, c1cs42.source) + c1cs42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS4 redact(C1CS4 c1cs4) {
            C1CS6 c1cs6NewBuilder = c1cs4.newBuilder();
            c1cs6NewBuilder.LJ = C2232721Ca6.ADAPTER.redact(c1cs6NewBuilder.LJ);
            c1cs6NewBuilder.LJFF = C2233401CbC.ADAPTER.redact(c1cs6NewBuilder.LJFF);
            c1cs6NewBuilder.clearUnknownFields();
            return c1cs6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CS4 c1cs4) {
            C1CS4 c1cs42 = c1cs4;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cs42.arch_type);
            C2232721Ca6.ADAPTER.encodeWithTag(protoWriter, 2, c1cs42.model);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 3, c1cs42.source);
            protoWriter.writeBytes(c1cs42.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LayoutModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232721Ca6 model;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233401CbC source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.model.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CS6 newBuilder() {
        C1CS6 c1cs6 = new C1CS6();
        c1cs6.LIZLLL = this.arch_type;
        c1cs6.LJ = this.model;
        c1cs6.LJFF = this.source;
        c1cs6.addUnknownFields(unknownFields());
        return c1cs6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXd8410d41afc98d9f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CS4)) {
            return false;
        }
        C1CS4 c1cs4 = (C1CS4) obj;
        if (unknownFields().equals(c1cs4.unknownFields()) && this.arch_type.equals(c1cs4.arch_type) && this.model.equals(c1cs4.model) && this.source.equals(c1cs4.source)) {
            return true;
        }
        return false;
    }

    public C1CS4(EnumC2183371Ach enumC2183371Ach, C2232721Ca6 c2232721Ca6, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, c2232721Ca6, c2233401CbC, ByteString.EMPTY);
    }

    public C1CS4(EnumC2183371Ach enumC2183371Ach, C2232721Ca6 c2232721Ca6, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.model = c2232721Ca6;
        this.source = c2233401CbC;
    }
}
