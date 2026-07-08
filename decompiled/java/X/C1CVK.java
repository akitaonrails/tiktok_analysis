package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVK extends Message<C1CVK, C1CVM> {
    public static final ProtoAdapter<C1CVK> ADAPTER = new ProtoAdapter<C1CVK>() { // from class: X.1CVL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVK decode(ProtoReader protoReader) {
            C1CVM c1cvm = new C1CVM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cvm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cvm.LIZLLL = C1CVI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVK c1cvk) {
            C1CVK c1cvk2 = c1cvk;
            return C1CVI.ADAPTER.encodedSizeWithTag(1, c1cvk2.flags) + c1cvk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVK redact(C1CVK c1cvk) {
            C1CVM c1cvmNewBuilder = c1cvk.newBuilder();
            c1cvmNewBuilder.LIZLLL = C1CVI.ADAPTER.redact(c1cvmNewBuilder.LIZLLL);
            c1cvmNewBuilder.clearUnknownFields();
            return c1cvmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVK c1cvk) {
            C1CVK c1cvk2 = c1cvk;
            C1CVI.ADAPTER.encodeWithTag(protoWriter, 1, c1cvk2.flags);
            protoWriter.writeBytes(c1cvk2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicFlags#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CVI flags;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.flags.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVM newBuilder() {
        C1CVM c1cvm = new C1CVM();
        c1cvm.LIZLLL = this.flags;
        c1cvm.addUnknownFields(unknownFields());
        return c1cvm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", flags=");
        sb.append(this.flags);
        sb.replace(0, 2, "FuncParamsXf2557f0105c82496{");
        sb.append('}');
        return sb.toString();
    }

    public C1CVK(C1CVI c1cvi) {
        this(c1cvi, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVK)) {
            return false;
        }
        C1CVK c1cvk = (C1CVK) obj;
        if (unknownFields().equals(c1cvk.unknownFields()) && this.flags.equals(c1cvk.flags)) {
            return true;
        }
        return false;
    }

    public C1CVK(C1CVI c1cvi, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flags = c1cvi;
    }
}
