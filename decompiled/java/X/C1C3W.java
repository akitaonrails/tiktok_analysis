package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3W extends Message<C1C3W, C1C3Y> {
    public static final ProtoAdapter<C1C3W> ADAPTER = new ProtoAdapter<C1C3W>() { // from class: X.1C3X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3W decode(ProtoReader protoReader) {
            C1C3Y c1c3y = new C1C3Y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c3y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c3y.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3W c1c3w) {
            C1C3W c1c3w2 = c1c3w;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c3w2.runnable) + c1c3w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3W redact(C1C3W c1c3w) {
            C1C3Y c1c3yNewBuilder = c1c3w.newBuilder();
            c1c3yNewBuilder.clearUnknownFields();
            return c1c3yNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3W c1c3w) {
            C1C3W c1c3w2 = c1c3w;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c3w2.runnable);
            protoWriter.writeBytes(c1c3w2.unknownFields());
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
    public C1C3Y newBuilder() {
        C1C3Y c1c3y = new C1C3Y();
        c1c3y.LIZLLL = this.runnable;
        c1c3y.addUnknownFields(unknownFields());
        return c1c3y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", runnable=");
        sb.append(this.runnable);
        sb.replace(0, 2, "FuncParamsX0f027e44c25a1691{");
        sb.append('}');
        return sb.toString();
    }

    public C1C3W(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3W)) {
            return false;
        }
        C1C3W c1c3w = (C1C3W) obj;
        if (unknownFields().equals(c1c3w.unknownFields()) && this.runnable.equals(c1c3w.runnable)) {
            return true;
        }
        return false;
    }

    public C1C3W(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.runnable = l;
    }
}
