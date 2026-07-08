package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224191C3l extends Message<C2224191C3l, C2224211C3n> {
    public static final ProtoAdapter<C2224191C3l> ADAPTER = new ProtoAdapter<C2224191C3l>() { // from class: X.1C3m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224191C3l decode(ProtoReader protoReader) {
            C2224211C3n c2224211C3n = new C2224211C3n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224211C3n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224211C3n.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224211C3n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224191C3l c2224191C3l) {
            C2224191C3l c2224191C3l2 = c2224191C3l;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2224191C3l2.ret) + c2224191C3l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224191C3l redact(C2224191C3l c2224191C3l) {
            C2224211C3n c2224211C3nNewBuilder = c2224191C3l.newBuilder();
            c2224211C3nNewBuilder.clearUnknownFields();
            return c2224211C3nNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224191C3l c2224191C3l) {
            C2224191C3l c2224191C3l2 = c2224191C3l;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2224191C3l2.ret);
            protoWriter.writeBytes(c2224191C3l2.unknownFields());
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
    public C2224211C3n newBuilder() {
        C2224211C3n c2224211C3n = new C2224211C3n();
        c2224211C3n.LIZLLL = this.ret;
        c2224211C3n.addUnknownFields(unknownFields());
        return c2224211C3n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX939be0c637c10770{");
        sb.append('}');
        return sb.toString();
    }

    public C2224191C3l(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224191C3l)) {
            return false;
        }
        C2224191C3l c2224191C3l = (C2224191C3l) obj;
        if (unknownFields().equals(c2224191C3l.unknownFields()) && this.ret.equals(c2224191C3l.ret)) {
            return true;
        }
        return false;
    }

    public C2224191C3l(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
