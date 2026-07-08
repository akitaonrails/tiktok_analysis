package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJU extends Message<C1CJU, C1CJV> {
    public static final ProtoAdapter<C1CJU> ADAPTER = new ProtoAdapter<C1CJU>() { // from class: X.1CJT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJU decode(ProtoReader protoReader) {
            C1CJV c1cjv = new C1CJV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cjv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cjv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJU c1cju) {
            C1CJU c1cju2 = c1cju;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cju2.ret) + c1cju2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJU redact(C1CJU c1cju) {
            C1CJV c1cjvNewBuilder = c1cju.newBuilder();
            c1cjvNewBuilder.clearUnknownFields();
            return c1cjvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJU c1cju) {
            C1CJU c1cju2 = c1cju;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cju2.ret);
            protoWriter.writeBytes(c1cju2.unknownFields());
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
    public C1CJV newBuilder() {
        C1CJV c1cjv = new C1CJV();
        c1cjv.LIZLLL = this.ret;
        c1cjv.addUnknownFields(unknownFields());
        return c1cjv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX1d6b299344bab347{");
        sb.append('}');
        return sb.toString();
    }

    public C1CJU(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJU)) {
            return false;
        }
        C1CJU c1cju = (C1CJU) obj;
        if (unknownFields().equals(c1cju.unknownFields()) && this.ret.equals(c1cju.ret)) {
            return true;
        }
        return false;
    }

    public C1CJU(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = l;
    }
}
