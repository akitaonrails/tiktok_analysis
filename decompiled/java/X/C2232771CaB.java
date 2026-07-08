package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232771CaB extends Message<C2232771CaB, C2232791CaD> {
    public static final ProtoAdapter<C2232771CaB> ADAPTER = new ProtoAdapter<C2232771CaB>() { // from class: X.1CaC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232771CaB decode(ProtoReader protoReader) {
            C2232791CaD c2232791CaD = new C2232791CaD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2232791CaD.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2232791CaD.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c2232791CaD.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c2232791CaD.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c2232791CaD.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232791CaD.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232771CaB c2232771CaB) {
            C2232771CaB c2232771CaB2 = c2232771CaB;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c2232771CaB2.left) + protoAdapter.encodedSizeWithTag(2, c2232771CaB2.top) + protoAdapter.encodedSizeWithTag(3, c2232771CaB2.right) + protoAdapter.encodedSizeWithTag(4, c2232771CaB2.bottom) + c2232771CaB2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232771CaB redact(C2232771CaB c2232771CaB) {
            C2232791CaD c2232791CaDNewBuilder = c2232771CaB.newBuilder();
            c2232791CaDNewBuilder.clearUnknownFields();
            return c2232791CaDNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232771CaB c2232771CaB) {
            C2232771CaB c2232771CaB2 = c2232771CaB;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232771CaB2.left);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232771CaB2.top);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232771CaB2.right);
            protoAdapter.encodeWithTag(protoWriter, 4, c2232771CaB2.bottom);
            protoWriter.writeBytes(c2232771CaB2.unknownFields());
        }
    };
    public static final Double DEFAULT_BOTTOM;
    public static final Double DEFAULT_LEFT;
    public static final Double DEFAULT_RIGHT;
    public static final Double DEFAULT_TOP;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double bottom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double left;

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
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.left.hashCode()) * 37) + this.top.hashCode()) * 37) + this.right.hashCode()) * 37) + this.bottom.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232791CaD newBuilder() {
        C2232791CaD c2232791CaD = new C2232791CaD();
        c2232791CaD.LIZLLL = this.left;
        c2232791CaD.LJ = this.top;
        c2232791CaD.LJFF = this.right;
        c2232791CaD.LJI = this.bottom;
        c2232791CaD.addUnknownFields(unknownFields());
        return c2232791CaD;
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
        sb.replace(0, 2, "LinkMicLayoutInsets{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232771CaB)) {
            return false;
        }
        C2232771CaB c2232771CaB = (C2232771CaB) obj;
        if (unknownFields().equals(c2232771CaB.unknownFields()) && this.left.equals(c2232771CaB.left) && this.top.equals(c2232771CaB.top) && this.right.equals(c2232771CaB.right) && this.bottom.equals(c2232771CaB.bottom)) {
            return true;
        }
        return false;
    }

    public C2232771CaB(Double d, Double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, ByteString.EMPTY);
    }

    public C2232771CaB(Double d, Double d2, Double d3, Double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.left = d;
        this.top = d2;
        this.right = d3;
        this.bottom = d4;
    }
}
