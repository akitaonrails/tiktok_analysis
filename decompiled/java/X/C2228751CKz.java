package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228751CKz extends Message<C2228751CKz, C1CL0> {
    public static final Double DEFAULT_WINDOW_HEIGHT_RATIO;
    public static final Double DEFAULT_WINDOW_WIDTH_RATIO;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long canvas_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long canvas_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, String> extra_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 4)
    public final Double window_height_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double window_width_ratio;
    public static final ProtoAdapter<C2228751CKz> ADAPTER = new ProtoAdapter<C2228751CKz>() { // from class: X.1CKy
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228751CKz decode(ProtoReader protoReader) {
            C1CL0 c1cl0 = new C1CL0();
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
                                        c1cl0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1cl0.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c1cl0.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c1cl0.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1cl0.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cl0.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cl0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228751CKz c2228751CKz) {
            C2228751CKz c2228751CKz2 = c2228751CKz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2228751CKz2.canvas_width) + protoAdapter.encodedSizeWithTag(2, c2228751CKz2.canvas_height);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2228751CKz2.window_width_ratio) + protoAdapter2.encodedSizeWithTag(4, c2228751CKz2.window_height_ratio) + this.LIZ.encodedSizeWithTag(5, c2228751CKz2.extra_params) + c2228751CKz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228751CKz redact(C2228751CKz c2228751CKz) {
            C1CL0 c1cl0NewBuilder = c2228751CKz.newBuilder();
            c1cl0NewBuilder.clearUnknownFields();
            return c1cl0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228751CKz c2228751CKz) {
            C2228751CKz c2228751CKz2 = c2228751CKz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228751CKz2.canvas_width);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228751CKz2.canvas_height);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2228751CKz2.window_width_ratio);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2228751CKz2.window_height_ratio);
            this.LIZ.encodeWithTag(protoWriter, 5, c2228751CKz2.extra_params);
            protoWriter.writeBytes(c2228751CKz2.unknownFields());
        }
    };
    public static final Long DEFAULT_CANVAS_WIDTH = 0L;
    public static final Long DEFAULT_CANVAS_HEIGHT = 0L;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_WINDOW_WIDTH_RATIO = dValueOf;
        DEFAULT_WINDOW_HEIGHT_RATIO = dValueOf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.canvas_width.hashCode()) * 37) + this.canvas_height.hashCode()) * 37) + this.window_width_ratio.hashCode()) * 37) + this.window_height_ratio.hashCode()) * 37) + this.extra_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CL0 newBuilder() {
        C1CL0 c1cl0 = new C1CL0();
        c1cl0.LIZLLL = this.canvas_width;
        c1cl0.LJ = this.canvas_height;
        c1cl0.LJFF = this.window_width_ratio;
        c1cl0.LJI = this.window_height_ratio;
        c1cl0.LJII = C1516540pZE.LIZLLL("extra_params", this.extra_params);
        c1cl0.addUnknownFields(unknownFields());
        return c1cl0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", canvas_width=");
        sb.append(this.canvas_width);
        sb.append(", canvas_height=");
        sb.append(this.canvas_height);
        sb.append(", window_width_ratio=");
        sb.append(this.window_width_ratio);
        sb.append(", window_height_ratio=");
        sb.append(this.window_height_ratio);
        if (!this.extra_params.isEmpty()) {
            sb.append(", extra_params=");
            sb.append(this.extra_params);
        }
        sb.replace(0, 2, "LinkMicAdaptiveRtcMediaInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228751CKz)) {
            return false;
        }
        C2228751CKz c2228751CKz = (C2228751CKz) obj;
        if (unknownFields().equals(c2228751CKz.unknownFields()) && this.canvas_width.equals(c2228751CKz.canvas_width) && this.canvas_height.equals(c2228751CKz.canvas_height) && this.window_width_ratio.equals(c2228751CKz.window_width_ratio) && this.window_height_ratio.equals(c2228751CKz.window_height_ratio) && this.extra_params.equals(c2228751CKz.extra_params)) {
            return true;
        }
        return false;
    }

    public C2228751CKz(Long l, Long l2, Double d, Double d2, Map<String, String> map) {
        this(l, l2, d, d2, map, ByteString.EMPTY);
    }

    public C2228751CKz(Long l, Long l2, Double d, Double d2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.canvas_width = l;
        this.canvas_height = l2;
        this.window_width_ratio = d;
        this.window_height_ratio = d2;
        this.extra_params = C1516540pZE.LJI("extra_params", map);
    }
}
