package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ3 extends Message<C1CQ3, C1CQ5> {
    public static final ProtoAdapter<C1CQ3> ADAPTER = new ProtoAdapter<C1CQ3>() { // from class: X.1CQ4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ3 decode(ProtoReader protoReader) {
            C1CQ5 c1cq5 = new C1CQ5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cq5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cq5.LIZLLL = C1CQC.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cq5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQ3 c1cq3) {
            C1CQ3 c1cq32 = c1cq3;
            return C1CQC.ADAPTER.encodedSizeWithTag(1, c1cq32.ret) + c1cq32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ3 redact(C1CQ3 c1cq3) {
            C1CQ5 c1cq5NewBuilder = c1cq3.newBuilder();
            c1cq5NewBuilder.LIZLLL = C1CQC.ADAPTER.redact(c1cq5NewBuilder.LIZLLL);
            c1cq5NewBuilder.clearUnknownFields();
            return c1cq5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQ3 c1cq3) {
            C1CQ3 c1cq32 = c1cq3;
            C1CQC.ADAPTER.encodeWithTag(protoWriter, 1, c1cq32.ret);
            protoWriter.writeBytes(c1cq32.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeEditStateResult#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQC ret;

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
    public C1CQ5 newBuilder() {
        C1CQ5 c1cq5 = new C1CQ5();
        c1cq5.LIZLLL = this.ret;
        c1cq5.addUnknownFields(unknownFields());
        return c1cq5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX1c0a05489200e87e{");
        sb.append('}');
        return sb.toString();
    }

    public C1CQ3(C1CQC c1cqc) {
        this(c1cqc, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQ3)) {
            return false;
        }
        C1CQ3 c1cq3 = (C1CQ3) obj;
        if (unknownFields().equals(c1cq3.unknownFields()) && this.ret.equals(c1cq3.ret)) {
            return true;
        }
        return false;
    }

    public C1CQ3(C1CQC c1cqc, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cqc;
    }
}
