package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232591CZt extends Message<C2232591CZt, C2232651CZz> {
    public static final ProtoAdapter<C2232591CZt> ADAPTER = new ProtoAdapter<C2232591CZt>() { // from class: X.1CZv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232591CZt decode(ProtoReader protoReader) {
            C2232651CZz c2232651CZz = new C2232651CZz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232651CZz.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2232651CZz.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2232651CZz.LJFF = C2228421CJs.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2232651CZz.LJI.add(C1CZJ.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c2232651CZz.LJII = C2232561CZq.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2232651CZz.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2232651CZz.LJIIIZ = C2233351Cb7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232651CZz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232651CZz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232591CZt c2232591CZt) {
            C2232591CZt c2232591CZt2 = c2232591CZt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2232591CZt2.layout_key) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2232591CZt2.has_split_line) + C2228421CJs.ADAPTER.encodedSizeWithTag(3, c2232591CZt2.layout_container_view_info) + C1CZJ.ADAPTER.asRepeated().encodedSizeWithTag(4, c2232591CZt2.windows_info) + C2232561CZq.ADAPTER.encodedSizeWithTag(5, c2232591CZt2.player_frame) + protoAdapter.encodedSizeWithTag(6, c2232591CZt2.layout_id) + C2233351Cb7.ADAPTER.encodedSizeWithTag(7, c2232591CZt2.layout_extra) + c2232591CZt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232591CZt redact(C2232591CZt c2232591CZt) {
            C2232651CZz c2232651CZzNewBuilder = c2232591CZt.newBuilder();
            c2232651CZzNewBuilder.LJFF = C2228421CJs.ADAPTER.redact(c2232651CZzNewBuilder.LJFF);
            C1516540pZE.LJIIIZ(c2232651CZzNewBuilder.LJI, C1CZJ.ADAPTER);
            c2232651CZzNewBuilder.LJII = C2232561CZq.ADAPTER.redact(c2232651CZzNewBuilder.LJII);
            c2232651CZzNewBuilder.LJIIIZ = C2233351Cb7.ADAPTER.redact(c2232651CZzNewBuilder.LJIIIZ);
            c2232651CZzNewBuilder.clearUnknownFields();
            return c2232651CZzNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232591CZt c2232591CZt) {
            C2232591CZt c2232591CZt2 = c2232591CZt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232591CZt2.layout_key);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2232591CZt2.has_split_line);
            C2228421CJs.ADAPTER.encodeWithTag(protoWriter, 3, c2232591CZt2.layout_container_view_info);
            C1CZJ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2232591CZt2.windows_info);
            C2232561CZq.ADAPTER.encodeWithTag(protoWriter, 5, c2232591CZt2.player_frame);
            protoAdapter.encodeWithTag(protoWriter, 6, c2232591CZt2.layout_id);
            C2233351Cb7.ADAPTER.encodeWithTag(protoWriter, 7, c2232591CZt2.layout_extra);
            protoWriter.writeBytes(c2232591CZt2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_SPLIT_LINE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean has_split_line;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutViewInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2228421CJs layout_container_view_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C2233351Cb7 layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_key;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C2232561CZq player_frame;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CZJ> windows_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.layout_key.hashCode()) * 37) + this.has_split_line.hashCode()) * 37) + this.layout_container_view_info.hashCode()) * 37) + this.windows_info.hashCode()) * 37) + this.player_frame.hashCode()) * 37;
        String str = this.layout_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.layout_extra.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2232651CZz newBuilder() {
        C2232651CZz c2232651CZz = new C2232651CZz();
        c2232651CZz.LIZLLL = this.layout_key;
        c2232651CZz.LJ = this.has_split_line;
        c2232651CZz.LJFF = this.layout_container_view_info;
        c2232651CZz.LJI = C1516540pZE.LIZJ("windows_info", this.windows_info);
        c2232651CZz.LJII = this.player_frame;
        c2232651CZz.LJIIIIZZ = this.layout_id;
        c2232651CZz.LJIIIZ = this.layout_extra;
        c2232651CZz.addUnknownFields(unknownFields());
        return c2232651CZz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", has_split_line=");
        sb.append(this.has_split_line);
        sb.append(", layout_container_view_info=");
        sb.append(this.layout_container_view_info);
        if (!this.windows_info.isEmpty()) {
            sb.append(", windows_info=");
            sb.append(this.windows_info);
        }
        sb.append(", player_frame=");
        sb.append(this.player_frame);
        if (this.layout_id != null) {
            sb.append(", layout_id=");
            sb.append(this.layout_id);
        }
        sb.append(", layout_extra=");
        sb.append(this.layout_extra);
        sb.replace(0, 2, "LinkMicLayoutRenderInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232591CZt)) {
            return false;
        }
        C2232591CZt c2232591CZt = (C2232591CZt) obj;
        if (unknownFields().equals(c2232591CZt.unknownFields()) && this.layout_key.equals(c2232591CZt.layout_key) && this.has_split_line.equals(c2232591CZt.has_split_line) && this.layout_container_view_info.equals(c2232591CZt.layout_container_view_info) && this.windows_info.equals(c2232591CZt.windows_info) && this.player_frame.equals(c2232591CZt.player_frame) && C1516540pZE.LJ(this.layout_id, c2232591CZt.layout_id) && this.layout_extra.equals(c2232591CZt.layout_extra)) {
            return true;
        }
        return false;
    }

    public C2232591CZt(String str, Boolean bool, C2228421CJs c2228421CJs, List<C1CZJ> list, C2232561CZq c2232561CZq, String str2, C2233351Cb7 c2233351Cb7) {
        this(str, bool, c2228421CJs, list, c2232561CZq, str2, c2233351Cb7, ByteString.EMPTY);
    }

    public C2232591CZt(String str, Boolean bool, C2228421CJs c2228421CJs, List<C1CZJ> list, C2232561CZq c2232561CZq, String str2, C2233351Cb7 c2233351Cb7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_key = str;
        this.has_split_line = bool;
        this.layout_container_view_info = c2228421CJs;
        this.windows_info = C1516540pZE.LJFF("windows_info", list);
        this.player_frame = c2232561CZq;
        this.layout_id = str2;
        this.layout_extra = c2233351Cb7;
    }
}
