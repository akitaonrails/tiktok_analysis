package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230561CRy extends Message<C2230561CRy, C1CS0> {
    public static final ProtoAdapter<C2230561CRy> ADAPTER = new ProtoAdapter<C2230561CRy>() { // from class: X.1CRz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230561CRy decode(ProtoReader protoReader) {
            C1CS0 c1cs0 = new C1CS0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cs0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cs0.LJFF = C2233401CbC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c1cs0.LJ = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cs0.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        try {
                            c1cs0.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c1cs0.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cs0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230561CRy c2230561CRy) {
            C2230561CRy c2230561CRy2 = c2230561CRy;
            ProtoAdapter<EnumC2183371Ach> protoAdapter = EnumC2183371Ach.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2230561CRy2.old_arch_type) + protoAdapter.encodedSizeWithTag(2, c2230561CRy2.new_arch_type) + C2233401CbC.ADAPTER.encodedSizeWithTag(3, c2230561CRy2.source) + c2230561CRy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230561CRy redact(C2230561CRy c2230561CRy) {
            C1CS0 c1cs0NewBuilder = c2230561CRy.newBuilder();
            c1cs0NewBuilder.LJFF = C2233401CbC.ADAPTER.redact(c1cs0NewBuilder.LJFF);
            c1cs0NewBuilder.clearUnknownFields();
            return c1cs0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230561CRy c2230561CRy) {
            C2230561CRy c2230561CRy2 = c2230561CRy;
            ProtoAdapter<EnumC2183371Ach> protoAdapter = EnumC2183371Ach.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230561CRy2.old_arch_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230561CRy2.new_arch_type);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 3, c2230561CRy2.source);
            protoWriter.writeBytes(c2230561CRy2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_NEW_ARCH_TYPE;
    public static final EnumC2183371Ach DEFAULT_OLD_ARCH_TYPE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183371Ach new_arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach old_arch_type;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233401CbC source;

    static {
        EnumC2183371Ach enumC2183371Ach = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
        DEFAULT_OLD_ARCH_TYPE = enumC2183371Ach;
        DEFAULT_NEW_ARCH_TYPE = enumC2183371Ach;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.old_arch_type.hashCode()) * 37) + this.new_arch_type.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CS0 newBuilder() {
        C1CS0 c1cs0 = new C1CS0();
        c1cs0.LIZLLL = this.old_arch_type;
        c1cs0.LJ = this.new_arch_type;
        c1cs0.LJFF = this.source;
        c1cs0.addUnknownFields(unknownFields());
        return c1cs0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", old_arch_type=");
        sb.append(this.old_arch_type);
        sb.append(", new_arch_type=");
        sb.append(this.new_arch_type);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsX5d1d672f0710e7f4{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230561CRy)) {
            return false;
        }
        C2230561CRy c2230561CRy = (C2230561CRy) obj;
        if (unknownFields().equals(c2230561CRy.unknownFields()) && this.old_arch_type.equals(c2230561CRy.old_arch_type) && this.new_arch_type.equals(c2230561CRy.new_arch_type) && this.source.equals(c2230561CRy.source)) {
            return true;
        }
        return false;
    }

    public C2230561CRy(EnumC2183371Ach enumC2183371Ach, EnumC2183371Ach enumC2183371Ach2, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, enumC2183371Ach2, c2233401CbC, ByteString.EMPTY);
    }

    public C2230561CRy(EnumC2183371Ach enumC2183371Ach, EnumC2183371Ach enumC2183371Ach2, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.old_arch_type = enumC2183371Ach;
        this.new_arch_type = enumC2183371Ach2;
        this.source = c2233401CbC;
    }
}
