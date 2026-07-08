package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230511CRt extends Message<C2230511CRt, C2230521CRu> {
    public static final ProtoAdapter<C2230511CRt> ADAPTER = new ProtoAdapter<C2230511CRt>() { // from class: X.1CRs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230511CRt decode(ProtoReader protoReader) {
            C2230521CRu c2230521CRu = new C2230521CRu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2230521CRu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2230521CRu.LJFF = C2233401CbC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2230521CRu.LJ = C2230471CRp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2230521CRu.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2230521CRu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230521CRu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230511CRt c2230511CRt) {
            C2230511CRt c2230511CRt2 = c2230511CRt;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2230511CRt2.arch_type) + C2230471CRp.ADAPTER.encodedSizeWithTag(2, c2230511CRt2.error) + C2233401CbC.ADAPTER.encodedSizeWithTag(3, c2230511CRt2.source) + c2230511CRt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230511CRt redact(C2230511CRt c2230511CRt) {
            C2230521CRu c2230521CRuNewBuilder = c2230511CRt.newBuilder();
            c2230521CRuNewBuilder.LJ = C2230471CRp.ADAPTER.redact(c2230521CRuNewBuilder.LJ);
            c2230521CRuNewBuilder.LJFF = C2233401CbC.ADAPTER.redact(c2230521CRuNewBuilder.LJFF);
            c2230521CRuNewBuilder.clearUnknownFields();
            return c2230521CRuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230511CRt c2230511CRt) {
            C2230511CRt c2230511CRt2 = c2230511CRt;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2230511CRt2.arch_type);
            C2230471CRp.ADAPTER.encodeWithTag(protoWriter, 2, c2230511CRt2.error);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 3, c2230511CRt2.source);
            protoWriter.writeBytes(c2230511CRt2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutError#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2230471CRp error;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233401CbC source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.error.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230521CRu newBuilder() {
        C2230521CRu c2230521CRu = new C2230521CRu();
        c2230521CRu.LIZLLL = this.arch_type;
        c2230521CRu.LJ = this.error;
        c2230521CRu.LJFF = this.source;
        c2230521CRu.addUnknownFields(unknownFields());
        return c2230521CRu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXa39e08436deb00c7{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230511CRt)) {
            return false;
        }
        C2230511CRt c2230511CRt = (C2230511CRt) obj;
        if (unknownFields().equals(c2230511CRt.unknownFields()) && this.arch_type.equals(c2230511CRt.arch_type) && this.error.equals(c2230511CRt.error) && this.source.equals(c2230511CRt.source)) {
            return true;
        }
        return false;
    }

    public C2230511CRt(EnumC2183371Ach enumC2183371Ach, C2230471CRp c2230471CRp, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, c2230471CRp, c2233401CbC, ByteString.EMPTY);
    }

    public C2230511CRt(EnumC2183371Ach enumC2183371Ach, C2230471CRp c2230471CRp, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.error = c2230471CRp;
        this.source = c2233401CbC;
    }
}
