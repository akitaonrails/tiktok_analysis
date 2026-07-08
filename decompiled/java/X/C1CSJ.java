package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSJ extends Message<C1CSJ, C1CSL> {
    public static final ProtoAdapter<C1CSJ> ADAPTER = new ProtoAdapter<C1CSJ>() { // from class: X.1CSK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSJ decode(ProtoReader protoReader) {
            C1CSL c1csl = new C1CSL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1csl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1csl.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1csl.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSJ c1csj) {
            C1CSJ c1csj2 = c1csj;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c1csj2.x) + protoAdapter.encodedSizeWithTag(2, c1csj2.y) + c1csj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSJ redact(C1CSJ c1csj) {
            C1CSL c1cslNewBuilder = c1csj.newBuilder();
            c1cslNewBuilder.clearUnknownFields();
            return c1cslNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSJ c1csj) {
            C1CSJ c1csj2 = c1csj;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c1csj2.x);
            protoAdapter.encodeWithTag(protoWriter, 2, c1csj2.y);
            protoWriter.writeBytes(c1csj2.unknownFields());
        }
    };
    public static final Double DEFAULT_X;
    public static final Double DEFAULT_Y;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double x;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double y;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_X = dValueOf;
        DEFAULT_Y = dValueOf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.x.hashCode()) * 37) + this.y.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CSL newBuilder() {
        C1CSL c1csl = new C1CSL();
        c1csl.LIZLLL = this.x;
        c1csl.LJ = this.y;
        c1csl.addUnknownFields(unknownFields());
        return c1csl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.replace(0, 2, "LinkMicPoint{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSJ)) {
            return false;
        }
        C1CSJ c1csj = (C1CSJ) obj;
        if (unknownFields().equals(c1csj.unknownFields()) && this.x.equals(c1csj.x) && this.y.equals(c1csj.y)) {
            return true;
        }
        return false;
    }

    public C1CSJ(Double d, Double d2) {
        this(d, d2, ByteString.EMPTY);
    }

    public C1CSJ(Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.x = d;
        this.y = d2;
    }
}
