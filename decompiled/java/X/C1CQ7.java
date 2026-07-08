package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ7 extends Message<C1CQ7, C1CQ8> {
    public static final ProtoAdapter<C1CQ7> ADAPTER = new ProtoAdapter<C1CQ7>() { // from class: X.1CQ6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ7 decode(ProtoReader protoReader) {
            C1CQ8 c1cq8 = new C1CQ8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cq8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cq8.LIZLLL = C1CQI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cq8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQ7 c1cq7) {
            C1CQ7 c1cq72 = c1cq7;
            return C1CQI.ADAPTER.encodedSizeWithTag(1, c1cq72.ret) + c1cq72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ7 redact(C1CQ7 c1cq7) {
            C1CQ8 c1cq8NewBuilder = c1cq7.newBuilder();
            c1cq8NewBuilder.LIZLLL = C1CQI.ADAPTER.redact(c1cq8NewBuilder.LIZLLL);
            c1cq8NewBuilder.clearUnknownFields();
            return c1cq8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQ7 c1cq7) {
            C1CQ7 c1cq72 = c1cq7;
            C1CQI.ADAPTER.encodeWithTag(protoWriter, 1, c1cq72.ret);
            protoWriter.writeBytes(c1cq72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeRootFlow#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQI ret;

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
    public C1CQ8 newBuilder() {
        C1CQ8 c1cq8 = new C1CQ8();
        c1cq8.LIZLLL = this.ret;
        c1cq8.addUnknownFields(unknownFields());
        return c1cq8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX68b394552850fab3{");
        sb.append('}');
        return sb.toString();
    }

    public C1CQ7(C1CQI c1cqi) {
        this(c1cqi, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQ7)) {
            return false;
        }
        C1CQ7 c1cq7 = (C1CQ7) obj;
        if (unknownFields().equals(c1cq7.unknownFields()) && this.ret.equals(c1cq7.ret)) {
            return true;
        }
        return false;
    }

    public C1CQ7(C1CQI c1cqi, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cqi;
    }
}
