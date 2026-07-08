package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJK extends Message<C1CJK, C1CJM> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 1)
    public final Double ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long width;
    public static final ProtoAdapter<C1CJK> ADAPTER = new ProtoAdapter<C1CJK>() { // from class: X.1CJL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJK decode(ProtoReader protoReader) {
            C1CJM c1cjm = new C1CJM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cjm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cjm.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1cjm.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cjm.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJK c1cjk) {
            C1CJK c1cjk2 = c1cjk;
            int iEncodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c1cjk2.ratio);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cjk2.width) + protoAdapter.encodedSizeWithTag(3, c1cjk2.height) + c1cjk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJK redact(C1CJK c1cjk) {
            C1CJM c1cjmNewBuilder = c1cjk.newBuilder();
            c1cjmNewBuilder.clearUnknownFields();
            return c1cjmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJK c1cjk) {
            C1CJK c1cjk2 = c1cjk;
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, c1cjk2.ratio);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cjk2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cjk2.height);
            protoWriter.writeBytes(c1cjk2.unknownFields());
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
    public C1CJM newBuilder() {
        C1CJM c1cjm = new C1CJM();
        c1cjm.LIZLLL = this.ratio;
        c1cjm.LJ = this.width;
        c1cjm.LJFF = this.height;
        c1cjm.addUnknownFields(unknownFields());
        return c1cjm;
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
        sb.replace(0, 2, "LinkMicRtcMixStreamResolutionInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJK)) {
            return false;
        }
        C1CJK c1cjk = (C1CJK) obj;
        if (unknownFields().equals(c1cjk.unknownFields()) && this.ratio.equals(c1cjk.ratio) && this.width.equals(c1cjk.width) && this.height.equals(c1cjk.height)) {
            return true;
        }
        return false;
    }

    public C1CJK(Double d, Long l, Long l2) {
        this(d, l, l2, ByteString.EMPTY);
    }

    public C1CJK(Double d, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ratio = d;
        this.width = l;
        this.height = l2;
    }
}
