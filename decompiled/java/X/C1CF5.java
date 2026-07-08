package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CF5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF5 extends Message<C1CF5, C1CF6> {
    public static final ProtoAdapter<C1CF5> ADAPTER = new ProtoAdapter<C1CF5>() { // from class: X.1CF4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF5 decode(ProtoReader protoReader) {
            C1CF6 c1cf6 = new C1CF6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cf6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cf6.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cf6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CF5 c1cf5) {
            C1CF5 c1cf52 = c1cf5;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1cf52.ret) + c1cf52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF5 redact(C1CF5 c1cf5) {
            C1CF6 c1cf6NewBuilder = c1cf5.newBuilder();
            C2232021CXo c2232021CXo = c1cf6NewBuilder.LIZLLL;
            if (c2232021CXo != null) {
                c1cf6NewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2232021CXo);
            }
            c1cf6NewBuilder.clearUnknownFields();
            return c1cf6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CF5 c1cf5) {
            C1CF5 c1cf52 = c1cf5;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1cf52.ret);
            protoWriter.writeBytes(c1cf52.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", tag = 1)
    public final C2232021CXo ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2232021CXo c2232021CXo = this.ret;
        int iHashCode2 = iHashCode + (c2232021CXo != null ? c2232021CXo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CF6 newBuilder() {
        C1CF6 c1cf6 = new C1CF6();
        c1cf6.LIZLLL = this.ret;
        c1cf6.addUnknownFields(unknownFields());
        return c1cf6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ret != null) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX8c5b74adbdca3888{");
        sb.append('}');
        return sb.toString();
    }

    public C1CF5(C2232021CXo c2232021CXo) {
        this(c2232021CXo, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CF5)) {
            return false;
        }
        C1CF5 c1cf5 = (C1CF5) obj;
        if (unknownFields().equals(c1cf5.unknownFields()) && C1516540pZE.LJ(this.ret, c1cf5.ret)) {
            return true;
        }
        return false;
    }

    public C1CF5(C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2232021CXo;
    }
}
