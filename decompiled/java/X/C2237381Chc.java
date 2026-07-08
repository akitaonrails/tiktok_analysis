package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Chc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237381Chc extends Message<C2237381Chc, C2237401Che> {
    public static final ProtoAdapter<C2237381Chc> ADAPTER = new ProtoAdapter<C2237381Chc>() { // from class: X.1Chd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237381Chc decode(ProtoReader protoReader) {
            C2237401Che c2237401Che = new C2237401Che();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237401Che.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2237401Che.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2237401Che.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237401Che.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237401Che.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237381Chc c2237381Chc) {
            C2237381Chc c2237381Chc2 = c2237381Chc;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2237381Chc2.is_zoom_layout) + protoAdapter.encodedSizeWithTag(2, c2237381Chc2.offset_y) + protoAdapter.encodedSizeWithTag(3, c2237381Chc2.scene) + c2237381Chc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237381Chc redact(C2237381Chc c2237381Chc) {
            C2237401Che c2237401CheNewBuilder = c2237381Chc.newBuilder();
            c2237401CheNewBuilder.clearUnknownFields();
            return c2237401CheNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237381Chc c2237381Chc) {
            C2237381Chc c2237381Chc2 = c2237381Chc;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2237381Chc2.is_zoom_layout);
            protoAdapter.encodeWithTag(protoWriter, 2, c2237381Chc2.offset_y);
            protoAdapter.encodeWithTag(protoWriter, 3, c2237381Chc2.scene);
            protoWriter.writeBytes(c2237381Chc2.unknownFields());
        }
    };
    public static final Long DEFAULT_IS_ZOOM_LAYOUT = 0L;
    public static final Long DEFAULT_OFFSET_Y = 0L;
    public static final Long DEFAULT_SCENE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long is_zoom_layout;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long offset_y;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long scene;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.is_zoom_layout.hashCode()) * 37) + this.offset_y.hashCode()) * 37) + this.scene.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237401Che newBuilder() {
        C2237401Che c2237401Che = new C2237401Che();
        c2237401Che.LIZLLL = this.is_zoom_layout;
        c2237401Che.LJ = this.offset_y;
        c2237401Che.LJFF = this.scene;
        c2237401Che.addUnknownFields(unknownFields());
        return c2237401Che;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_zoom_layout=");
        sb.append(this.is_zoom_layout);
        sb.append(", offset_y=");
        sb.append(this.offset_y);
        sb.append(", scene=");
        sb.append(this.scene);
        sb.replace(0, 2, "LinkMicLayoutCohostLayoutExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237381Chc)) {
            return false;
        }
        C2237381Chc c2237381Chc = (C2237381Chc) obj;
        if (unknownFields().equals(c2237381Chc.unknownFields()) && this.is_zoom_layout.equals(c2237381Chc.is_zoom_layout) && this.offset_y.equals(c2237381Chc.offset_y) && this.scene.equals(c2237381Chc.scene)) {
            return true;
        }
        return false;
    }

    public C2237381Chc(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C2237381Chc(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_zoom_layout = l;
        this.offset_y = l2;
        this.scene = l3;
    }
}
