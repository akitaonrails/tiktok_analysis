package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLA extends Message<C1CLA, C1CLC> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long fps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long width;
    public static final ProtoAdapter<C1CLA> ADAPTER = new ProtoAdapter<C1CLA>() { // from class: X.1CLB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLA decode(ProtoReader protoReader) {
            C1CLC c1clc = new C1CLC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1clc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1clc.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1clc.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1clc.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1clc.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLA c1cla) {
            C1CLA c1cla2 = c1cla;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c1cla2.stream_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cla2.width) + protoAdapter.encodedSizeWithTag(3, c1cla2.height) + protoAdapter.encodedSizeWithTag(4, c1cla2.fps) + c1cla2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLA redact(C1CLA c1cla) {
            C1CLC c1clcNewBuilder = c1cla.newBuilder();
            c1clcNewBuilder.clearUnknownFields();
            return c1clcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLA c1cla) {
            C1CLA c1cla2 = c1cla;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cla2.stream_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cla2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cla2.height);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cla2.fps);
            protoWriter.writeBytes(c1cla2.unknownFields());
        }
    };
    public static final Long DEFAULT_WIDTH = 0L;
    public static final Long DEFAULT_HEIGHT = 0L;
    public static final Long DEFAULT_FPS = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37) + this.width.hashCode()) * 37) + this.height.hashCode()) * 37) + this.fps.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLC newBuilder() {
        C1CLC c1clc = new C1CLC();
        c1clc.LIZLLL = this.stream_id;
        c1clc.LJ = this.width;
        c1clc.LJFF = this.height;
        c1clc.LJI = this.fps;
        c1clc.addUnknownFields(unknownFields());
        return c1clc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.replace(0, 2, "LinkMicRtcAuxStreamConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLA)) {
            return false;
        }
        C1CLA c1cla = (C1CLA) obj;
        if (unknownFields().equals(c1cla.unknownFields()) && this.stream_id.equals(c1cla.stream_id) && this.width.equals(c1cla.width) && this.height.equals(c1cla.height) && this.fps.equals(c1cla.fps)) {
            return true;
        }
        return false;
    }

    public C1CLA(String str, Long l, Long l2, Long l3) {
        this(str, l, l2, l3, ByteString.EMPTY);
    }

    public C1CLA(String str, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.width = l;
        this.height = l2;
        this.fps = l3;
    }
}
