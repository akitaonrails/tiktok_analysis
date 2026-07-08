package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3Z extends Message<C1C3Z, C2224091C3b> {
    public static final ProtoAdapter<C1C3Z> ADAPTER = new ProtoAdapter<C1C3Z>() { // from class: X.1C3a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3Z decode(ProtoReader protoReader) {
            C2224091C3b c2224091C3b = new C2224091C3b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224091C3b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224091C3b.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224091C3b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3Z c1c3z) {
            C1C3Z c1c3z2 = c1c3z;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c3z2.runnable) + c1c3z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3Z redact(C1C3Z c1c3z) {
            C2224091C3b c2224091C3bNewBuilder = c1c3z.newBuilder();
            c2224091C3bNewBuilder.clearUnknownFields();
            return c2224091C3bNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3Z c1c3z) {
            C1C3Z c1c3z2 = c1c3z;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c3z2.runnable);
            protoWriter.writeBytes(c1c3z2.unknownFields());
        }
    };
    public static final Long DEFAULT_RUNNABLE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long runnable;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.runnable.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2224091C3b newBuilder() {
        C2224091C3b c2224091C3b = new C2224091C3b();
        c2224091C3b.LIZLLL = this.runnable;
        c2224091C3b.addUnknownFields(unknownFields());
        return c2224091C3b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", runnable=");
        sb.append(this.runnable);
        sb.replace(0, 2, "FuncParamsX7c53b97d9dbe4bb0{");
        sb.append('}');
        return sb.toString();
    }

    public C1C3Z(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3Z)) {
            return false;
        }
        C1C3Z c1c3z = (C1C3Z) obj;
        if (unknownFields().equals(c1c3z.unknownFields()) && this.runnable.equals(c1c3z.runnable)) {
            return true;
        }
        return false;
    }

    public C1C3Z(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.runnable = l;
    }
}
