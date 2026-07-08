package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ca6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232721Ca6 extends Message<C2232721Ca6, C2232741Ca8> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 7)
    public final List<Long> consumer_list;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutInsets#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C2232771CaB custom_insets;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final C2233351Cb7 layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String layout_key;

    @WireField(adapter = "link_mic_sdk.proto.LayoutContainer#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C2232731Ca7 link_layout_container;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 5)
    public final Double ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long ver;

    @WireField(adapter = "link_mic_sdk.proto.LayoutWindow#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, C2232531CZn> windows;
    public static final ProtoAdapter<C2232721Ca6> ADAPTER = new ProtoAdapter<C2232721Ca6>() { // from class: X.1Ca5
        public final ProtoAdapter<Map<String, C2232531CZn>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C2232531CZn.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232721Ca6 decode(ProtoReader protoReader) {
            C2232741Ca8 c2232741Ca8 = new C2232741Ca8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232741Ca8.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2232741Ca8.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2232741Ca8.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2232741Ca8.LJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 5:
                            c2232741Ca8.LJII = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 6:
                            c2232741Ca8.LJIIIIZZ = C2232731Ca7.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2232741Ca8.LJIIIZ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            c2232741Ca8.LJIIJ = C2233351Cb7.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2232741Ca8.LJIIJJI = C2232771CaB.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232741Ca8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232741Ca8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232721Ca6 c2232721Ca6) {
            C2232721Ca6 c2232721Ca62 = c2232721Ca6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2232721Ca62.layout_id) + protoAdapter.encodedSizeWithTag(2, c2232721Ca62.layout_key);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2232721Ca62.ver) + this.LIZ.encodedSizeWithTag(4, c2232721Ca62.windows) + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, c2232721Ca62.ratio) + C2232731Ca7.ADAPTER.encodedSizeWithTag(6, c2232721Ca62.link_layout_container) + protoAdapter2.asPacked().encodedSizeWithTag(7, c2232721Ca62.consumer_list) + C2233351Cb7.ADAPTER.encodedSizeWithTag(8, c2232721Ca62.layout_extra) + C2232771CaB.ADAPTER.encodedSizeWithTag(9, c2232721Ca62.custom_insets) + c2232721Ca62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232721Ca6 redact(C2232721Ca6 c2232721Ca6) {
            C2232741Ca8 c2232741Ca8NewBuilder = c2232721Ca6.newBuilder();
            C1516540pZE.LJIIJ(c2232741Ca8NewBuilder.LJI, C2232531CZn.ADAPTER);
            c2232741Ca8NewBuilder.LJIIIIZZ = C2232731Ca7.ADAPTER.redact(c2232741Ca8NewBuilder.LJIIIIZZ);
            c2232741Ca8NewBuilder.LJIIJ = C2233351Cb7.ADAPTER.redact(c2232741Ca8NewBuilder.LJIIJ);
            C2232771CaB c2232771CaB = c2232741Ca8NewBuilder.LJIIJJI;
            if (c2232771CaB != null) {
                c2232741Ca8NewBuilder.LJIIJJI = C2232771CaB.ADAPTER.redact(c2232771CaB);
            }
            c2232741Ca8NewBuilder.clearUnknownFields();
            return c2232741Ca8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232721Ca6 c2232721Ca6) {
            C2232721Ca6 c2232721Ca62 = c2232721Ca6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232721Ca62.layout_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232721Ca62.layout_key);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2232721Ca62.ver);
            this.LIZ.encodeWithTag(protoWriter, 4, c2232721Ca62.windows);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, c2232721Ca62.ratio);
            C2232731Ca7.ADAPTER.encodeWithTag(protoWriter, 6, c2232721Ca62.link_layout_container);
            protoAdapter2.asPacked().encodeWithTag(protoWriter, 7, c2232721Ca62.consumer_list);
            C2233351Cb7.ADAPTER.encodeWithTag(protoWriter, 8, c2232721Ca62.layout_extra);
            C2232771CaB.ADAPTER.encodeWithTag(protoWriter, 9, c2232721Ca62.custom_insets);
            protoWriter.writeBytes(c2232721Ca62.unknownFields());
        }
    };
    public static final Long DEFAULT_VER = 0L;
    public static final Double DEFAULT_RATIO = Double.valueOf(0.0d);

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.layout_id;
        int iHashCode2 = (((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.layout_key.hashCode()) * 37) + this.ver.hashCode()) * 37) + this.windows.hashCode()) * 37) + this.ratio.hashCode()) * 37) + this.link_layout_container.hashCode()) * 37) + this.consumer_list.hashCode()) * 37) + this.layout_extra.hashCode()) * 37;
        C2232771CaB c2232771CaB = this.custom_insets;
        int iHashCode3 = iHashCode2 + (c2232771CaB != null ? c2232771CaB.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2232741Ca8 newBuilder() {
        C2232741Ca8 c2232741Ca8 = new C2232741Ca8();
        c2232741Ca8.LIZLLL = this.layout_id;
        c2232741Ca8.LJ = this.layout_key;
        c2232741Ca8.LJFF = this.ver;
        c2232741Ca8.LJI = C1516540pZE.LIZLLL("windows", this.windows);
        c2232741Ca8.LJII = this.ratio;
        c2232741Ca8.LJIIIIZZ = this.link_layout_container;
        c2232741Ca8.LJIIIZ = C1516540pZE.LIZJ("consumer_list", this.consumer_list);
        c2232741Ca8.LJIIJ = this.layout_extra;
        c2232741Ca8.LJIIJJI = this.custom_insets;
        c2232741Ca8.addUnknownFields(unknownFields());
        return c2232741Ca8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.layout_id != null) {
            sb.append(", layout_id=");
            sb.append(this.layout_id);
        }
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", ver=");
        sb.append(this.ver);
        if (!this.windows.isEmpty()) {
            sb.append(", windows=");
            sb.append(this.windows);
        }
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.append(", link_layout_container=");
        sb.append(this.link_layout_container);
        if (!this.consumer_list.isEmpty()) {
            sb.append(", consumer_list=");
            sb.append(this.consumer_list);
        }
        sb.append(", layout_extra=");
        sb.append(this.layout_extra);
        if (this.custom_insets != null) {
            sb.append(", custom_insets=");
            sb.append(this.custom_insets);
        }
        sb.replace(0, 2, "LayoutModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232721Ca6)) {
            return false;
        }
        C2232721Ca6 c2232721Ca6 = (C2232721Ca6) obj;
        if (unknownFields().equals(c2232721Ca6.unknownFields()) && C1516540pZE.LJ(this.layout_id, c2232721Ca6.layout_id) && this.layout_key.equals(c2232721Ca6.layout_key) && this.ver.equals(c2232721Ca6.ver) && this.windows.equals(c2232721Ca6.windows) && this.ratio.equals(c2232721Ca6.ratio) && this.link_layout_container.equals(c2232721Ca6.link_layout_container) && this.consumer_list.equals(c2232721Ca6.consumer_list) && this.layout_extra.equals(c2232721Ca6.layout_extra) && C1516540pZE.LJ(this.custom_insets, c2232721Ca6.custom_insets)) {
            return true;
        }
        return false;
    }

    public C2232721Ca6(String str, String str2, Long l, Map<String, C2232531CZn> map, Double d, C2232731Ca7 c2232731Ca7, List<Long> list, C2233351Cb7 c2233351Cb7, C2232771CaB c2232771CaB) {
        this(str, str2, l, map, d, c2232731Ca7, list, c2233351Cb7, c2232771CaB, ByteString.EMPTY);
    }

    public C2232721Ca6(String str, String str2, Long l, Map<String, C2232531CZn> map, Double d, C2232731Ca7 c2232731Ca7, List<Long> list, C2233351Cb7 c2233351Cb7, C2232771CaB c2232771CaB, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_id = str;
        this.layout_key = str2;
        this.ver = l;
        this.windows = C1516540pZE.LJI("windows", map);
        this.ratio = d;
        this.link_layout_container = c2232731Ca7;
        this.consumer_list = C1516540pZE.LJFF("consumer_list", list);
        this.layout_extra = c2233351Cb7;
        this.custom_insets = c2232771CaB;
    }
}
