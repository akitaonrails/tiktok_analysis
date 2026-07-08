package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHW extends Message<C1CHW, C1CHY> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long cross_linker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long layout_layer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long multi_linker;
    public static final ProtoAdapter<C1CHW> ADAPTER = new ProtoAdapter<C1CHW>() { // from class: X.1CHX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHW decode(ProtoReader protoReader) {
            C1CHY c1chy = new C1CHY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1chy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1chy.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1chy.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1chy.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHW c1chw) {
            C1CHW c1chw2 = c1chw;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1chw2.multi_linker) + protoAdapter.encodedSizeWithTag(2, c1chw2.cross_linker) + protoAdapter.encodedSizeWithTag(3, c1chw2.layout_layer) + c1chw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHW redact(C1CHW c1chw) {
            C1CHY c1chyNewBuilder = c1chw.newBuilder();
            c1chyNewBuilder.clearUnknownFields();
            return c1chyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHW c1chw) {
            C1CHW c1chw2 = c1chw;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1chw2.multi_linker);
            protoAdapter.encodeWithTag(protoWriter, 2, c1chw2.cross_linker);
            protoAdapter.encodeWithTag(protoWriter, 3, c1chw2.layout_layer);
            protoWriter.writeBytes(c1chw2.unknownFields());
        }
    };
    public static final Long DEFAULT_MULTI_LINKER = 0L;
    public static final Long DEFAULT_CROSS_LINKER = 0L;
    public static final Long DEFAULT_LAYOUT_LAYER = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.multi_linker;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.cross_linker;
        int iHashCode3 = ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.layout_layer.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CHY newBuilder() {
        C1CHY c1chy = new C1CHY();
        c1chy.LIZLLL = this.multi_linker;
        c1chy.LJ = this.cross_linker;
        c1chy.LJFF = this.layout_layer;
        c1chy.addUnknownFields(unknownFields());
        return c1chy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.multi_linker != null) {
            sb.append(", multi_linker=");
            sb.append(this.multi_linker);
        }
        if (this.cross_linker != null) {
            sb.append(", cross_linker=");
            sb.append(this.cross_linker);
        }
        sb.append(", layout_layer=");
        sb.append(this.layout_layer);
        sb.replace(0, 2, "FuncParamsXfe27a2e54bae2852{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHW)) {
            return false;
        }
        C1CHW c1chw = (C1CHW) obj;
        if (unknownFields().equals(c1chw.unknownFields()) && C1516540pZE.LJ(this.multi_linker, c1chw.multi_linker) && C1516540pZE.LJ(this.cross_linker, c1chw.cross_linker) && this.layout_layer.equals(c1chw.layout_layer)) {
            return true;
        }
        return false;
    }

    public C1CHW(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C1CHW(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.multi_linker = l;
        this.cross_linker = l2;
        this.layout_layer = l3;
    }
}
