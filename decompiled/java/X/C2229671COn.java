package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229671COn extends Message<C2229671COn, C2229691COp> {
    public static final ProtoAdapter<C2229671COn> ADAPTER = new ProtoAdapter<C2229671COn>() { // from class: X.1COo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229671COn decode(ProtoReader protoReader) {
            C2229691COp c2229691COp = new C2229691COp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229691COp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229691COp.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c2229691COp.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229691COp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229671COn c2229671COn) {
            C2229671COn c2229671COn2 = c2229671COn;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c2229671COn2.width) + protoAdapter.encodedSizeWithTag(2, c2229671COn2.height) + c2229671COn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229671COn redact(C2229671COn c2229671COn) {
            C2229691COp c2229691COpNewBuilder = c2229671COn.newBuilder();
            c2229691COpNewBuilder.clearUnknownFields();
            return c2229691COpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229671COn c2229671COn) {
            C2229671COn c2229671COn2 = c2229671COn;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c2229671COn2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c2229671COn2.height);
            protoWriter.writeBytes(c2229671COn2.unknownFields());
        }
    };
    public static final Double DEFAULT_HEIGHT;
    public static final Double DEFAULT_WIDTH;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double width;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_WIDTH = dValueOf;
        DEFAULT_HEIGHT = dValueOf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.width.hashCode()) * 37) + this.height.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229691COp newBuilder() {
        C2229691COp c2229691COp = new C2229691COp();
        c2229691COp.LIZLLL = this.width;
        c2229691COp.LJ = this.height;
        c2229691COp.addUnknownFields(unknownFields());
        return c2229691COp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.replace(0, 2, "LinkMicSize{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229671COn)) {
            return false;
        }
        C2229671COn c2229671COn = (C2229671COn) obj;
        if (unknownFields().equals(c2229671COn.unknownFields()) && this.width.equals(c2229671COn.width) && this.height.equals(c2229671COn.height)) {
            return true;
        }
        return false;
    }

    public C2229671COn(Double d, Double d2) {
        this(d, d2, ByteString.EMPTY);
    }

    public C2229671COn(Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = d;
        this.height = d2;
    }
}
