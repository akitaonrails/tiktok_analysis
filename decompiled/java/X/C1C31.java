package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C31, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C31 extends Message<C1C31, C1C33> {
    public static final ProtoAdapter<C1C31> ADAPTER = new ProtoAdapter<C1C31>() { // from class: X.1C32
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C31 decode(ProtoReader protoReader) {
            C1C33 c1c33 = new C1C33();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c33.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c33.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c33.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C31 c1c31) {
            C1C31 c1c312 = c1c31;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c312.ret) + c1c312.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C31 redact(C1C31 c1c31) {
            C1C33 c1c33NewBuilder = c1c31.newBuilder();
            c1c33NewBuilder.clearUnknownFields();
            return c1c33NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C31 c1c31) {
            C1C31 c1c312 = c1c31;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c312.ret);
            protoWriter.writeBytes(c1c312.unknownFields());
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
    public C1C33 newBuilder() {
        C1C33 c1c33 = new C1C33();
        c1c33.LIZLLL = this.ret;
        c1c33.addUnknownFields(unknownFields());
        return c1c33;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX9729f7382ffc20cd{");
        sb.append('}');
        return sb.toString();
    }

    public C1C31(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C31)) {
            return false;
        }
        C1C31 c1c31 = (C1C31) obj;
        if (unknownFields().equals(c1c31.unknownFields()) && this.ret.equals(c1c31.ret)) {
            return true;
        }
        return false;
    }

    public C1C31(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
