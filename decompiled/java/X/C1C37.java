package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C37, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C37 extends Message<C1C37, C1C39> {
    public static final ProtoAdapter<C1C37> ADAPTER = new ProtoAdapter<C1C37>() { // from class: X.1C38
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C37 decode(ProtoReader protoReader) {
            C1C39 c1c39 = new C1C39();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c39.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c39.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c39.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C37 c1c37) {
            C1C37 c1c372 = c1c37;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c372.ret) + c1c372.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C37 redact(C1C37 c1c37) {
            C1C39 c1c39NewBuilder = c1c37.newBuilder();
            c1c39NewBuilder.clearUnknownFields();
            return c1c39NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C37 c1c37) {
            C1C37 c1c372 = c1c37;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c372.ret);
            protoWriter.writeBytes(c1c372.unknownFields());
        }
    };
    public static final Long DEFAULT_RET = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long ret;

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
    public C1C39 newBuilder() {
        C1C39 c1c39 = new C1C39();
        c1c39.LIZLLL = this.ret;
        c1c39.addUnknownFields(unknownFields());
        return c1c39;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX36f57b6df6fc4012{");
        sb.append('}');
        return sb.toString();
    }

    public C1C37(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C37)) {
            return false;
        }
        C1C37 c1c37 = (C1C37) obj;
        if (unknownFields().equals(c1c37.unknownFields()) && this.ret.equals(c1c37.ret)) {
            return true;
        }
        return false;
    }

    public C1C37(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
