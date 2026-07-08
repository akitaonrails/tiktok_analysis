package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237221ChM extends Message<C2237221ChM, C2237241ChO> {
    public static final ProtoAdapter<C2237221ChM> ADAPTER = new ProtoAdapter<C2237221ChM>() { // from class: X.1ChN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237221ChM decode(ProtoReader protoReader) {
            C2237241ChO c2237241ChO = new C2237241ChO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237241ChO.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237241ChO.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c2237241ChO.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237241ChO.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237221ChM c2237221ChM) {
            C2237221ChM c2237221ChM2 = c2237221ChM;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c2237221ChM2.x) + protoAdapter.encodedSizeWithTag(2, c2237221ChM2.y) + c2237221ChM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237221ChM redact(C2237221ChM c2237221ChM) {
            C2237241ChO c2237241ChONewBuilder = c2237221ChM.newBuilder();
            c2237241ChONewBuilder.clearUnknownFields();
            return c2237241ChONewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237221ChM c2237221ChM) {
            C2237221ChM c2237221ChM2 = c2237221ChM;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c2237221ChM2.x);
            protoAdapter.encodeWithTag(protoWriter, 2, c2237221ChM2.y);
            protoWriter.writeBytes(c2237221ChM2.unknownFields());
        }
    };
    public static final Double DEFAULT_X;
    public static final Double DEFAULT_Y;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public final Double x;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 2)
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
        int iHashCode = unknownFields().hashCode() * 37;
        Double d = this.x;
        int iHashCode2 = (iHashCode + (d != null ? d.hashCode() : 0)) * 37;
        Double d2 = this.y;
        int iHashCode3 = iHashCode2 + (d2 != null ? d2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2237241ChO newBuilder() {
        C2237241ChO c2237241ChO = new C2237241ChO();
        c2237241ChO.LIZLLL = this.x;
        c2237241ChO.LJ = this.y;
        c2237241ChO.addUnknownFields(unknownFields());
        return c2237241ChO;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.x != null) {
            sb.append(", x=");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append(", y=");
            sb.append(this.y);
        }
        sb.replace(0, 2, "AIGroupShotMentionCoordinate{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237221ChM)) {
            return false;
        }
        C2237221ChM c2237221ChM = (C2237221ChM) obj;
        if (unknownFields().equals(c2237221ChM.unknownFields()) && C1516540pZE.LJ(this.x, c2237221ChM.x) && C1516540pZE.LJ(this.y, c2237221ChM.y)) {
            return true;
        }
        return false;
    }

    public C2237221ChM(Double d, Double d2) {
        this(d, d2, ByteString.EMPTY);
    }

    public C2237221ChM(Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.x = d;
        this.y = d2;
    }
}
