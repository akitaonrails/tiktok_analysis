package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9V extends Message<C1C9V, C1C9X> {
    public static final ProtoAdapter<C1C9V> ADAPTER = new ProtoAdapter<C1C9V>() { // from class: X.1C9W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C9V decode(ProtoReader protoReader) {
            C1C9X c1c9x = new C1C9X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c9x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c9x.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c9x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C9V c1c9v) {
            C1C9V c1c9v2 = c1c9v;
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c1c9v2.duration) + c1c9v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C9V redact(C1C9V c1c9v) {
            C1C9X c1c9xNewBuilder = c1c9v.newBuilder();
            c1c9xNewBuilder.clearUnknownFields();
            return c1c9xNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C9V c1c9v) {
            C1C9V c1c9v2 = c1c9v;
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, c1c9v2.duration);
            protoWriter.writeBytes(c1c9v2.unknownFields());
        }
    };
    public static final Double DEFAULT_DURATION = Double.valueOf(0.0d);
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double duration;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.duration.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C9X newBuilder() {
        C1C9X c1c9x = new C1C9X();
        c1c9x.LIZLLL = this.duration;
        c1c9x.addUnknownFields(unknownFields());
        return c1c9x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", duration=");
        sb.append(this.duration);
        sb.replace(0, 2, "FuncParamsX93ae812b7e8701a9{");
        sb.append('}');
        return sb.toString();
    }

    public C1C9V(Double d) {
        this(d, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C9V)) {
            return false;
        }
        C1C9V c1c9v = (C1C9V) obj;
        if (unknownFields().equals(c1c9v.unknownFields()) && this.duration.equals(c1c9v.duration)) {
            return true;
        }
        return false;
    }

    public C1C9V(Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.duration = d;
    }
}
