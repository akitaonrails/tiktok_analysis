package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSP extends Message<C1CSP, C1CSR> {
    public static final Double DEFAULT_HEIGHT;
    public static final Double DEFAULT_WIDTH;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double width;
    public static final ProtoAdapter<C1CSP> ADAPTER = new ProtoAdapter<C1CSP>() { // from class: X.1CSQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSP decode(ProtoReader protoReader) {
            C1CSR c1csr = new C1CSR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1csr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1csr.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1csr.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1csr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSP c1csp) {
            C1CSP c1csp2 = c1csp;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1csp2.id);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1csp2.width) + protoAdapter.encodedSizeWithTag(3, c1csp2.height) + c1csp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSP redact(C1CSP c1csp) {
            C1CSR c1csrNewBuilder = c1csp.newBuilder();
            c1csrNewBuilder.clearUnknownFields();
            return c1csrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSP c1csp) {
            C1CSP c1csp2 = c1csp;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1csp2.id);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 2, c1csp2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c1csp2.height);
            protoWriter.writeBytes(c1csp2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;

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
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.width.hashCode()) * 37) + this.height.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CSR newBuilder() {
        C1CSR c1csr = new C1CSR();
        c1csr.LIZLLL = this.id;
        c1csr.LJ = this.width;
        c1csr.LJFF = this.height;
        c1csr.addUnknownFields(unknownFields());
        return c1csr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.replace(0, 2, "LinkMicLayoutParentContainerInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSP)) {
            return false;
        }
        C1CSP c1csp = (C1CSP) obj;
        if (unknownFields().equals(c1csp.unknownFields()) && this.id.equals(c1csp.id) && this.width.equals(c1csp.width) && this.height.equals(c1csp.height)) {
            return true;
        }
        return false;
    }

    public C1CSP(Long l, Double d, Double d2) {
        this(l, d, d2, ByteString.EMPTY);
    }

    public C1CSP(Long l, Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.width = d;
        this.height = d2;
    }
}
