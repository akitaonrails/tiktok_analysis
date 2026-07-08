package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJ6 extends Message<C1CJ6, C1CJ7> {
    public static final ProtoAdapter<C1CJ6> ADAPTER = new ProtoAdapter<C1CJ6>() { // from class: X.1CJ5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ6 decode(ProtoReader protoReader) {
            C1CJ7 c1cj7 = new C1CJ7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cj7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cj7.LJ = C2233521CbO.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cj7.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cj7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cj7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJ6 c1cj6) {
            C1CJ6 c1cj62 = c1cj6;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cj62.arch_type) + C2233521CbO.ADAPTER.encodedSizeWithTag(2, c1cj62.info) + c1cj62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ6 redact(C1CJ6 c1cj6) {
            C1CJ7 c1cj7NewBuilder = c1cj6.newBuilder();
            c1cj7NewBuilder.LJ = C2233521CbO.ADAPTER.redact(c1cj7NewBuilder.LJ);
            c1cj7NewBuilder.clearUnknownFields();
            return c1cj7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJ6 c1cj6) {
            C1CJ6 c1cj62 = c1cj6;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cj62.arch_type);
            C2233521CbO.ADAPTER.encodeWithTag(protoWriter, 2, c1cj62.info);
            protoWriter.writeBytes(c1cj62.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.OutsideLayoutInfoModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233521CbO info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CJ7 newBuilder() {
        C1CJ7 c1cj7 = new C1CJ7();
        c1cj7.LIZLLL = this.arch_type;
        c1cj7.LJ = this.info;
        c1cj7.addUnknownFields(unknownFields());
        return c1cj7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", info=");
        sb.append(this.info);
        sb.replace(0, 2, "FuncParamsXc8d431f29f6c450a{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJ6)) {
            return false;
        }
        C1CJ6 c1cj6 = (C1CJ6) obj;
        if (unknownFields().equals(c1cj6.unknownFields()) && this.arch_type.equals(c1cj6.arch_type) && this.info.equals(c1cj6.info)) {
            return true;
        }
        return false;
    }

    public C1CJ6(EnumC2183371Ach enumC2183371Ach, C2233521CbO c2233521CbO) {
        this(enumC2183371Ach, c2233521CbO, ByteString.EMPTY);
    }

    public C1CJ6(EnumC2183371Ach enumC2183371Ach, C2233521CbO c2233521CbO, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.info = c2233521CbO;
    }
}
