package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CN8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CN8 extends Message<C1CN8, C1CNA> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long bitrate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long width;
    public static final ProtoAdapter<C1CN8> ADAPTER = new ProtoAdapter<C1CN8>() { // from class: X.1CN9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CN8 decode(ProtoReader protoReader) {
            C1CNA c1cna = new C1CNA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cna.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cna.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1cna.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cna.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cna.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CN8 c1cn8) {
            C1CN8 c1cn82 = c1cn8;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cn82.width) + protoAdapter.encodedSizeWithTag(2, c1cn82.height) + protoAdapter.encodedSizeWithTag(3, c1cn82.bitrate) + c1cn82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CN8 redact(C1CN8 c1cn8) {
            C1CNA c1cnaNewBuilder = c1cn8.newBuilder();
            c1cnaNewBuilder.clearUnknownFields();
            return c1cnaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CN8 c1cn8) {
            C1CN8 c1cn82 = c1cn8;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cn82.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cn82.height);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cn82.bitrate);
            protoWriter.writeBytes(c1cn82.unknownFields());
        }
    };
    public static final Long DEFAULT_WIDTH = 0L;
    public static final Long DEFAULT_HEIGHT = 0L;
    public static final Long DEFAULT_BITRATE = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.width.hashCode()) * 37) + this.height.hashCode()) * 37) + this.bitrate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CNA newBuilder() {
        C1CNA c1cna = new C1CNA();
        c1cna.LIZLLL = this.width;
        c1cna.LJ = this.height;
        c1cna.LJFF = this.bitrate;
        c1cna.addUnknownFields(unknownFields());
        return c1cna;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.replace(0, 2, "LinkMicRtcLayoutMixStreamInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CN8)) {
            return false;
        }
        C1CN8 c1cn8 = (C1CN8) obj;
        if (unknownFields().equals(c1cn8.unknownFields()) && this.width.equals(c1cn8.width) && this.height.equals(c1cn8.height) && this.bitrate.equals(c1cn8.bitrate)) {
            return true;
        }
        return false;
    }

    public C1CN8(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C1CN8(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = l;
        this.height = l2;
        this.bitrate = l3;
    }
}
