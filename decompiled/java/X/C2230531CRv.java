package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230531CRv extends Message<C2230531CRv, C2230551CRx> {
    public static final ProtoAdapter<C2230531CRv> ADAPTER = new ProtoAdapter<C2230531CRv>() { // from class: X.1CRw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230531CRv decode(ProtoReader protoReader) {
            C2230551CRx c2230551CRx = new C2230551CRx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2230551CRx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2230551CRx.LJFF = C2233401CbC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2230551CRx.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c2230551CRx.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2230551CRx.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230551CRx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230531CRv c2230531CRv) {
            C2230531CRv c2230531CRv2 = c2230531CRv;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2230531CRv2.arch_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2230531CRv2.layout_key) + C2233401CbC.ADAPTER.encodedSizeWithTag(3, c2230531CRv2.source) + c2230531CRv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230531CRv redact(C2230531CRv c2230531CRv) {
            C2230551CRx c2230551CRxNewBuilder = c2230531CRv.newBuilder();
            c2230551CRxNewBuilder.LJFF = C2233401CbC.ADAPTER.redact(c2230551CRxNewBuilder.LJFF);
            c2230551CRxNewBuilder.clearUnknownFields();
            return c2230551CRxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230531CRv c2230531CRv) {
            C2230531CRv c2230531CRv2 = c2230531CRv;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2230531CRv2.arch_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2230531CRv2.layout_key);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 3, c2230531CRv2.source);
            protoWriter.writeBytes(c2230531CRv2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String layout_key;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233401CbC source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.layout_key.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230551CRx newBuilder() {
        C2230551CRx c2230551CRx = new C2230551CRx();
        c2230551CRx.LIZLLL = this.arch_type;
        c2230551CRx.LJ = this.layout_key;
        c2230551CRx.LJFF = this.source;
        c2230551CRx.addUnknownFields(unknownFields());
        return c2230551CRx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXead04f6e2e033ad9{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230531CRv)) {
            return false;
        }
        C2230531CRv c2230531CRv = (C2230531CRv) obj;
        if (unknownFields().equals(c2230531CRv.unknownFields()) && this.arch_type.equals(c2230531CRv.arch_type) && this.layout_key.equals(c2230531CRv.layout_key) && this.source.equals(c2230531CRv.source)) {
            return true;
        }
        return false;
    }

    public C2230531CRv(EnumC2183371Ach enumC2183371Ach, String str, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, str, c2233401CbC, ByteString.EMPTY);
    }

    public C2230531CRv(EnumC2183371Ach enumC2183371Ach, String str, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.layout_key = str;
        this.source = c2233401CbC;
    }
}
