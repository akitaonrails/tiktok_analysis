package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229791COz extends Message<C2229791COz, C1CP1> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long width;
    public static final ProtoAdapter<C2229791COz> ADAPTER = new ProtoAdapter<C2229791COz>() { // from class: X.1CP0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229791COz decode(ProtoReader protoReader) {
            C1CP1 c1cp1 = new C1CP1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cp1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cp1.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1cp1.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cp1.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cp1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229791COz c2229791COz) {
            C2229791COz c2229791COz2 = c2229791COz;
            int iEncodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c2229791COz2.ratio);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2229791COz2.width) + protoAdapter.encodedSizeWithTag(3, c2229791COz2.height) + c2229791COz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229791COz redact(C2229791COz c2229791COz) {
            C1CP1 c1cp1NewBuilder = c2229791COz.newBuilder();
            c1cp1NewBuilder.clearUnknownFields();
            return c1cp1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229791COz c2229791COz) {
            C2229791COz c2229791COz2 = c2229791COz;
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, c2229791COz2.ratio);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2229791COz2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c2229791COz2.height);
            protoWriter.writeBytes(c2229791COz2.unknownFields());
        }
    };
    public static final Double DEFAULT_RATIO = Double.valueOf(0.0d);
    public static final Long DEFAULT_WIDTH = 0L;
    public static final Long DEFAULT_HEIGHT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.ratio.hashCode()) * 37) + this.width.hashCode()) * 37) + this.height.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CP1 newBuilder() {
        C1CP1 c1cp1 = new C1CP1();
        c1cp1.LIZLLL = this.ratio;
        c1cp1.LJ = this.width;
        c1cp1.LJFF = this.height;
        c1cp1.addUnknownFields(unknownFields());
        return c1cp1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.replace(0, 2, "LinkMicLayoutCanvasResolution{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229791COz)) {
            return false;
        }
        C2229791COz c2229791COz = (C2229791COz) obj;
        if (unknownFields().equals(c2229791COz.unknownFields()) && this.ratio.equals(c2229791COz.ratio) && this.width.equals(c2229791COz.width) && this.height.equals(c2229791COz.height)) {
            return true;
        }
        return false;
    }

    public C2229791COz(Double d, Long l, Long l2) {
        this(d, l, l2, ByteString.EMPTY);
    }

    public C2229791COz(Double d, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ratio = d;
        this.width = l;
        this.height = l2;
    }
}
