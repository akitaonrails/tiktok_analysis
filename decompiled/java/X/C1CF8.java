package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CF8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF8 extends Message<C1CF8, C1CF9> {
    public static final ProtoAdapter<C1CF8> ADAPTER = new ProtoAdapter<C1CF8>() { // from class: X.1CF7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF8 decode(ProtoReader protoReader) {
            C1CF9 c1cf9 = new C1CF9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cf9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            c1cf9.LIZLLL = C1CFA.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cf9.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cf9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CF8 c1cf8) {
            C1CF8 c1cf82 = c1cf8;
            return C1CFA.ADAPTER.encodedSizeWithTag(1, c1cf82.ret) + c1cf82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF8 redact(C1CF8 c1cf8) {
            C1CF9 c1cf9NewBuilder = c1cf8.newBuilder();
            c1cf9NewBuilder.clearUnknownFields();
            return c1cf9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CF8 c1cf8) {
            C1CF8 c1cf82 = c1cf8;
            C1CFA.ADAPTER.encodeWithTag(protoWriter, 1, c1cf82.ret);
            protoWriter.writeBytes(c1cf82.unknownFields());
        }
    };
    public static final C1CFA DEFAULT_RET = C1CFA.VAR_LINK_MIC_LAYOUT_TYPE_FLOAT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CFA ret;

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
    public C1CF9 newBuilder() {
        C1CF9 c1cf9 = new C1CF9();
        c1cf9.LIZLLL = this.ret;
        c1cf9.addUnknownFields(unknownFields());
        return c1cf9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX71161f8189a51e8c{");
        sb.append('}');
        return sb.toString();
    }

    public C1CF8(C1CFA c1cfa) {
        this(c1cfa, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CF8)) {
            return false;
        }
        C1CF8 c1cf8 = (C1CF8) obj;
        if (unknownFields().equals(c1cf8.unknownFields()) && this.ret.equals(c1cf8.ret)) {
            return true;
        }
        return false;
    }

    public C1CF8(C1CFA c1cfa, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cfa;
    }
}
