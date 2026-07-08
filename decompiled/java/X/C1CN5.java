package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CN5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CN5 extends Message<C1CN5, C1CN7> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long b_frame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String codec;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long fps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long gop;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcLayoutMixStreamInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CN8 layout_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long profile;
    public static final ProtoAdapter<C1CN5> ADAPTER = new ProtoAdapter<C1CN5>() { // from class: X.1CN6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CN5 decode(ProtoReader protoReader) {
            C1CN7 c1cn7 = new C1CN7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cn7.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cn7.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1cn7.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cn7.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1cn7.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1cn7.LJIIIIZZ = C1CN8.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cn7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cn7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CN5 c1cn5) {
            C1CN5 c1cn52 = c1cn5;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c1cn52.codec);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cn52.b_frame) + protoAdapter.encodedSizeWithTag(3, c1cn52.profile) + protoAdapter.encodedSizeWithTag(4, c1cn52.fps) + protoAdapter.encodedSizeWithTag(5, c1cn52.gop) + C1CN8.ADAPTER.encodedSizeWithTag(6, c1cn52.layout_info) + c1cn52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CN5 redact(C1CN5 c1cn5) {
            C1CN7 c1cn7NewBuilder = c1cn5.newBuilder();
            c1cn7NewBuilder.LJIIIIZZ = C1CN8.ADAPTER.redact(c1cn7NewBuilder.LJIIIIZZ);
            c1cn7NewBuilder.clearUnknownFields();
            return c1cn7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CN5 c1cn5) {
            C1CN5 c1cn52 = c1cn5;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cn52.codec);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cn52.b_frame);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cn52.profile);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cn52.fps);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cn52.gop);
            C1CN8.ADAPTER.encodeWithTag(protoWriter, 6, c1cn52.layout_info);
            protoWriter.writeBytes(c1cn52.unknownFields());
        }
    };
    public static final Long DEFAULT_B_FRAME = 0L;
    public static final Long DEFAULT_PROFILE = 0L;
    public static final Long DEFAULT_FPS = 0L;
    public static final Long DEFAULT_GOP = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.codec.hashCode()) * 37) + this.b_frame.hashCode()) * 37) + this.profile.hashCode()) * 37) + this.fps.hashCode()) * 37) + this.gop.hashCode()) * 37) + this.layout_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CN7 newBuilder() {
        C1CN7 c1cn7 = new C1CN7();
        c1cn7.LIZLLL = this.codec;
        c1cn7.LJ = this.b_frame;
        c1cn7.LJFF = this.profile;
        c1cn7.LJI = this.fps;
        c1cn7.LJII = this.gop;
        c1cn7.LJIIIIZZ = this.layout_info;
        c1cn7.addUnknownFields(unknownFields());
        return c1cn7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", codec=");
        sb.append(this.codec);
        sb.append(", b_frame=");
        sb.append(this.b_frame);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(", gop=");
        sb.append(this.gop);
        sb.append(", layout_info=");
        sb.append(this.layout_info);
        sb.replace(0, 2, "LinkMicRtcVideoMixStreamInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CN5)) {
            return false;
        }
        C1CN5 c1cn5 = (C1CN5) obj;
        if (unknownFields().equals(c1cn5.unknownFields()) && this.codec.equals(c1cn5.codec) && this.b_frame.equals(c1cn5.b_frame) && this.profile.equals(c1cn5.profile) && this.fps.equals(c1cn5.fps) && this.gop.equals(c1cn5.gop) && this.layout_info.equals(c1cn5.layout_info)) {
            return true;
        }
        return false;
    }

    public C1CN5(String str, Long l, Long l2, Long l3, Long l4, C1CN8 c1cn8) {
        this(str, l, l2, l3, l4, c1cn8, ByteString.EMPTY);
    }

    public C1CN5(String str, Long l, Long l2, Long l3, Long l4, C1CN8 c1cn8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.codec = str;
        this.b_frame = l;
        this.profile = l2;
        this.fps = l3;
        this.gop = l4;
        this.layout_info = c1cn8;
    }
}
