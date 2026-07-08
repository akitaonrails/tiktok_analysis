package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232561CZq extends Message<C2232561CZq, C2232581CZs> {
    public static final ProtoAdapter<C2232561CZq> ADAPTER = new ProtoAdapter<C2232561CZq>() { // from class: X.1CZr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232561CZq decode(ProtoReader protoReader) {
            C2232581CZs c2232581CZs = new C2232581CZs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2232581CZs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2232581CZs.LJII = ProtoAdapter.DOUBLE.decode(protoReader);
                                    }
                                } else {
                                    c2232581CZs.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c2232581CZs.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c2232581CZs.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c2232581CZs.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232581CZs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232561CZq c2232561CZq) {
            C2232561CZq c2232561CZq2 = c2232561CZq;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c2232561CZq2.left) + protoAdapter.encodedSizeWithTag(2, c2232561CZq2.top) + protoAdapter.encodedSizeWithTag(3, c2232561CZq2.right) + protoAdapter.encodedSizeWithTag(4, c2232561CZq2.bottom) + protoAdapter.encodedSizeWithTag(5, c2232561CZq2.radius) + c2232561CZq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232561CZq redact(C2232561CZq c2232561CZq) {
            C2232581CZs c2232581CZsNewBuilder = c2232561CZq.newBuilder();
            c2232581CZsNewBuilder.clearUnknownFields();
            return c2232581CZsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232561CZq c2232561CZq) {
            C2232561CZq c2232561CZq2 = c2232561CZq;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232561CZq2.left);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232561CZq2.top);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232561CZq2.right);
            protoAdapter.encodeWithTag(protoWriter, 4, c2232561CZq2.bottom);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232561CZq2.radius);
            protoWriter.writeBytes(c2232561CZq2.unknownFields());
        }
    };
    public static final Double DEFAULT_BOTTOM;
    public static final Double DEFAULT_LEFT;
    public static final Double DEFAULT_RADIUS;
    public static final Double DEFAULT_RIGHT;
    public static final Double DEFAULT_TOP;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double bottom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double left;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 5)
    public final Double radius;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double right;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double top;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_LEFT = dValueOf;
        DEFAULT_TOP = dValueOf;
        DEFAULT_RIGHT = dValueOf;
        DEFAULT_BOTTOM = dValueOf;
        DEFAULT_RADIUS = dValueOf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.left.hashCode()) * 37) + this.top.hashCode()) * 37) + this.right.hashCode()) * 37) + this.bottom.hashCode()) * 37) + this.radius.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232581CZs newBuilder() {
        C2232581CZs c2232581CZs = new C2232581CZs();
        c2232581CZs.LIZLLL = this.left;
        c2232581CZs.LJ = this.top;
        c2232581CZs.LJFF = this.right;
        c2232581CZs.LJI = this.bottom;
        c2232581CZs.LJII = this.radius;
        c2232581CZs.addUnknownFields(unknownFields());
        return c2232581CZs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.replace(0, 2, "LinkMicLayoutRect{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232561CZq)) {
            return false;
        }
        C2232561CZq c2232561CZq = (C2232561CZq) obj;
        if (unknownFields().equals(c2232561CZq.unknownFields()) && this.left.equals(c2232561CZq.left) && this.top.equals(c2232561CZq.top) && this.right.equals(c2232561CZq.right) && this.bottom.equals(c2232561CZq.bottom) && this.radius.equals(c2232561CZq.radius)) {
            return true;
        }
        return false;
    }

    public C2232561CZq(Double d, Double d2, Double d3, Double d4, Double d5) {
        this(d, d2, d3, d4, d5, ByteString.EMPTY);
    }

    public C2232561CZq(Double d, Double d2, Double d3, Double d4, Double d5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.left = d;
        this.top = d2;
        this.right = d3;
        this.bottom = d4;
        this.radius = d5;
    }
}
