package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225861C9w extends Message<C2225861C9w, C2225881C9y> {
    public static final ProtoAdapter<C2225861C9w> ADAPTER = new ProtoAdapter<C2225861C9w>() { // from class: X.1C9x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225861C9w decode(ProtoReader protoReader) {
            C2225881C9y c2225881C9y = new C2225881C9y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225881C9y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225881C9y.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225881C9y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225861C9w c2225861C9w) {
            C2225861C9w c2225861C9w2 = c2225861C9w;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2225861C9w2.ret) + c2225861C9w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225861C9w redact(C2225861C9w c2225861C9w) {
            C2225881C9y c2225881C9yNewBuilder = c2225861C9w.newBuilder();
            c2225881C9yNewBuilder.clearUnknownFields();
            return c2225881C9yNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225861C9w c2225861C9w) {
            C2225861C9w c2225861C9w2 = c2225861C9w;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2225861C9w2.ret);
            protoWriter.writeBytes(c2225861C9w2.unknownFields());
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
    public C2225881C9y newBuilder() {
        C2225881C9y c2225881C9y = new C2225881C9y();
        c2225881C9y.LIZLLL = this.ret;
        c2225881C9y.addUnknownFields(unknownFields());
        return c2225881C9y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX1cd59060845fa240{");
        sb.append('}');
        return sb.toString();
    }

    public C2225861C9w(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225861C9w)) {
            return false;
        }
        C2225861C9w c2225861C9w = (C2225861C9w) obj;
        if (unknownFields().equals(c2225861C9w.unknownFields()) && this.ret.equals(c2225861C9w.ret)) {
            return true;
        }
        return false;
    }

    public C2225861C9w(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
