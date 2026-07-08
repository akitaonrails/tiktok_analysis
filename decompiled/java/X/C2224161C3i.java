package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224161C3i extends Message<C2224161C3i, C2224181C3k> {
    public static final ProtoAdapter<C2224161C3i> ADAPTER = new ProtoAdapter<C2224161C3i>() { // from class: X.1C3j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224161C3i decode(ProtoReader protoReader) {
            C2224181C3k c2224181C3k = new C2224181C3k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224181C3k.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224181C3k.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224181C3k.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224161C3i c2224161C3i) {
            C2224161C3i c2224161C3i2 = c2224161C3i;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2224161C3i2.ret) + c2224161C3i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224161C3i redact(C2224161C3i c2224161C3i) {
            C2224181C3k c2224181C3kNewBuilder = c2224161C3i.newBuilder();
            c2224181C3kNewBuilder.clearUnknownFields();
            return c2224181C3kNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224161C3i c2224161C3i) {
            C2224161C3i c2224161C3i2 = c2224161C3i;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2224161C3i2.ret);
            protoWriter.writeBytes(c2224161C3i2.unknownFields());
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
    public C2224181C3k newBuilder() {
        C2224181C3k c2224181C3k = new C2224181C3k();
        c2224181C3k.LIZLLL = this.ret;
        c2224181C3k.addUnknownFields(unknownFields());
        return c2224181C3k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX66e160f01bbd6874{");
        sb.append('}');
        return sb.toString();
    }

    public C2224161C3i(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224161C3i)) {
            return false;
        }
        C2224161C3i c2224161C3i = (C2224161C3i) obj;
        if (unknownFields().equals(c2224161C3i.unknownFields()) && this.ret.equals(c2224161C3i.ret)) {
            return true;
        }
        return false;
    }

    public C2224161C3i(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
