package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224221C3o extends Message<C2224221C3o, C2224241C3q> {
    public static final ProtoAdapter<C2224221C3o> ADAPTER = new ProtoAdapter<C2224221C3o>() { // from class: X.1C3p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224221C3o decode(ProtoReader protoReader) {
            C2224241C3q c2224241C3q = new C2224241C3q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224241C3q.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224241C3q.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224241C3q.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224221C3o c2224221C3o) {
            C2224221C3o c2224221C3o2 = c2224221C3o;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2224221C3o2.ret) + c2224221C3o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224221C3o redact(C2224221C3o c2224221C3o) {
            C2224241C3q c2224241C3qNewBuilder = c2224221C3o.newBuilder();
            c2224241C3qNewBuilder.clearUnknownFields();
            return c2224241C3qNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224221C3o c2224221C3o) {
            C2224221C3o c2224221C3o2 = c2224221C3o;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2224221C3o2.ret);
            protoWriter.writeBytes(c2224221C3o2.unknownFields());
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
    public C2224241C3q newBuilder() {
        C2224241C3q c2224241C3q = new C2224241C3q();
        c2224241C3q.LIZLLL = this.ret;
        c2224241C3q.addUnknownFields(unknownFields());
        return c2224241C3q;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnXa48c7028df3b8373{");
        sb.append('}');
        return sb.toString();
    }

    public C2224221C3o(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224221C3o)) {
            return false;
        }
        C2224221C3o c2224221C3o = (C2224221C3o) obj;
        if (unknownFields().equals(c2224221C3o.unknownFields()) && this.ret.equals(c2224221C3o.ret)) {
            return true;
        }
        return false;
    }

    public C2224221C3o(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
