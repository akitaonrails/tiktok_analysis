package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232601CZu extends Message<C2232601CZu, C2232661Ca0> {
    public static final ProtoAdapter<C2232601CZu> ADAPTER = new ProtoAdapter<C2232601CZu>() { // from class: X.1CZw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232601CZu decode(ProtoReader protoReader) {
            C2232661Ca0 c2232661Ca0 = new C2232661Ca0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232661Ca0.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2232661Ca0.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2232661Ca0.LJFF = C2228421CJs.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2232661Ca0.LJI.add(C1CZJ.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c2232661Ca0.LJII.add(C2232631CZx.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c2232661Ca0.LJIIIIZZ.add(C1CZJ.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c2232661Ca0.LJIIIZ = C2233351Cb7.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2232661Ca0.LJIIJ = C2233351Cb7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232661Ca0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232661Ca0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232601CZu c2232601CZu) {
            C2232601CZu c2232601CZu2 = c2232601CZu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2232601CZu2.layout_key) + protoAdapter.encodedSizeWithTag(2, c2232601CZu2.old_layout_key) + C2228421CJs.ADAPTER.encodedSizeWithTag(3, c2232601CZu2.layout_container_view_info);
            ProtoAdapter<C1CZJ> protoAdapter2 = C1CZJ.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(4, c2232601CZu2.new_windows_info) + C2232631CZx.ADAPTER.asRepeated().encodedSizeWithTag(5, c2232601CZu2.updated_windows_info) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c2232601CZu2.removed_windows_info);
            ProtoAdapter<C2233351Cb7> protoAdapter3 = C2233351Cb7.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c2232601CZu2.layout_extra) + protoAdapter3.encodedSizeWithTag(8, c2232601CZu2.old_layout_extra) + c2232601CZu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232601CZu redact(C2232601CZu c2232601CZu) {
            C2232661Ca0 c2232661Ca0NewBuilder = c2232601CZu.newBuilder();
            C2228421CJs c2228421CJs = c2232661Ca0NewBuilder.LJFF;
            if (c2228421CJs != null) {
                c2232661Ca0NewBuilder.LJFF = C2228421CJs.ADAPTER.redact(c2228421CJs);
            }
            List<C1CZJ> list = c2232661Ca0NewBuilder.LJI;
            ProtoAdapter<C1CZJ> protoAdapter = C1CZJ.ADAPTER;
            C1516540pZE.LJIIIZ(list, protoAdapter);
            C1516540pZE.LJIIIZ(c2232661Ca0NewBuilder.LJII, C2232631CZx.ADAPTER);
            C1516540pZE.LJIIIZ(c2232661Ca0NewBuilder.LJIIIIZZ, protoAdapter);
            C2233351Cb7 c2233351Cb7 = c2232661Ca0NewBuilder.LJIIIZ;
            if (c2233351Cb7 != null) {
                c2232661Ca0NewBuilder.LJIIIZ = C2233351Cb7.ADAPTER.redact(c2233351Cb7);
            }
            C2233351Cb7 c2233351Cb72 = c2232661Ca0NewBuilder.LJIIJ;
            if (c2233351Cb72 != null) {
                c2232661Ca0NewBuilder.LJIIJ = C2233351Cb7.ADAPTER.redact(c2233351Cb72);
            }
            c2232661Ca0NewBuilder.clearUnknownFields();
            return c2232661Ca0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232601CZu c2232601CZu) {
            C2232601CZu c2232601CZu2 = c2232601CZu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232601CZu2.layout_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232601CZu2.old_layout_key);
            C2228421CJs.ADAPTER.encodeWithTag(protoWriter, 3, c2232601CZu2.layout_container_view_info);
            ProtoAdapter<C1CZJ> protoAdapter2 = C1CZJ.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c2232601CZu2.new_windows_info);
            C2232631CZx.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c2232601CZu2.updated_windows_info);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, c2232601CZu2.removed_windows_info);
            ProtoAdapter<C2233351Cb7> protoAdapter3 = C2233351Cb7.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 7, c2232601CZu2.layout_extra);
            protoAdapter3.encodeWithTag(protoWriter, 8, c2232601CZu2.old_layout_extra);
            protoWriter.writeBytes(c2232601CZu2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutViewInfo#ADAPTER", tag = 3)
    public final C2228421CJs layout_container_view_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", tag = 7)
    public final C2233351Cb7 layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_key;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CZJ> new_windows_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", tag = 8)
    public final C2233351Cb7 old_layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String old_layout_key;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<C1CZJ> removed_windows_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutUpdatedWindowInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C2232631CZx> updated_windows_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.layout_key.hashCode()) * 37) + this.old_layout_key.hashCode()) * 37;
        C2228421CJs c2228421CJs = this.layout_container_view_info;
        int iHashCode2 = (((((((iHashCode + (c2228421CJs != null ? c2228421CJs.hashCode() : 0)) * 37) + this.new_windows_info.hashCode()) * 37) + this.updated_windows_info.hashCode()) * 37) + this.removed_windows_info.hashCode()) * 37;
        C2233351Cb7 c2233351Cb7 = this.layout_extra;
        int iHashCode3 = (iHashCode2 + (c2233351Cb7 != null ? c2233351Cb7.hashCode() : 0)) * 37;
        C2233351Cb7 c2233351Cb72 = this.old_layout_extra;
        int iHashCode4 = iHashCode3 + (c2233351Cb72 != null ? c2233351Cb72.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2232661Ca0 newBuilder() {
        C2232661Ca0 c2232661Ca0 = new C2232661Ca0();
        c2232661Ca0.LIZLLL = this.layout_key;
        c2232661Ca0.LJ = this.old_layout_key;
        c2232661Ca0.LJFF = this.layout_container_view_info;
        c2232661Ca0.LJI = C1516540pZE.LIZJ("new_windows_info", this.new_windows_info);
        c2232661Ca0.LJII = C1516540pZE.LIZJ("updated_windows_info", this.updated_windows_info);
        c2232661Ca0.LJIIIIZZ = C1516540pZE.LIZJ("removed_windows_info", this.removed_windows_info);
        c2232661Ca0.LJIIIZ = this.layout_extra;
        c2232661Ca0.LJIIJ = this.old_layout_extra;
        c2232661Ca0.addUnknownFields(unknownFields());
        return c2232661Ca0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", old_layout_key=");
        sb.append(this.old_layout_key);
        if (this.layout_container_view_info != null) {
            sb.append(", layout_container_view_info=");
            sb.append(this.layout_container_view_info);
        }
        if (!this.new_windows_info.isEmpty()) {
            sb.append(", new_windows_info=");
            sb.append(this.new_windows_info);
        }
        if (!this.updated_windows_info.isEmpty()) {
            sb.append(", updated_windows_info=");
            sb.append(this.updated_windows_info);
        }
        if (!this.removed_windows_info.isEmpty()) {
            sb.append(", removed_windows_info=");
            sb.append(this.removed_windows_info);
        }
        if (this.layout_extra != null) {
            sb.append(", layout_extra=");
            sb.append(this.layout_extra);
        }
        if (this.old_layout_extra != null) {
            sb.append(", old_layout_extra=");
            sb.append(this.old_layout_extra);
        }
        sb.replace(0, 2, "LinkMicLayoutDiffInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232601CZu)) {
            return false;
        }
        C2232601CZu c2232601CZu = (C2232601CZu) obj;
        if (unknownFields().equals(c2232601CZu.unknownFields()) && this.layout_key.equals(c2232601CZu.layout_key) && this.old_layout_key.equals(c2232601CZu.old_layout_key) && C1516540pZE.LJ(this.layout_container_view_info, c2232601CZu.layout_container_view_info) && this.new_windows_info.equals(c2232601CZu.new_windows_info) && this.updated_windows_info.equals(c2232601CZu.updated_windows_info) && this.removed_windows_info.equals(c2232601CZu.removed_windows_info) && C1516540pZE.LJ(this.layout_extra, c2232601CZu.layout_extra) && C1516540pZE.LJ(this.old_layout_extra, c2232601CZu.old_layout_extra)) {
            return true;
        }
        return false;
    }

    public C2232601CZu(String str, String str2, C2228421CJs c2228421CJs, List<C1CZJ> list, List<C2232631CZx> list2, List<C1CZJ> list3, C2233351Cb7 c2233351Cb7, C2233351Cb7 c2233351Cb72) {
        this(str, str2, c2228421CJs, list, list2, list3, c2233351Cb7, c2233351Cb72, ByteString.EMPTY);
    }

    public C2232601CZu(String str, String str2, C2228421CJs c2228421CJs, List<C1CZJ> list, List<C2232631CZx> list2, List<C1CZJ> list3, C2233351Cb7 c2233351Cb7, C2233351Cb7 c2233351Cb72, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_key = str;
        this.old_layout_key = str2;
        this.layout_container_view_info = c2228421CJs;
        this.new_windows_info = C1516540pZE.LJFF("new_windows_info", list);
        this.updated_windows_info = C1516540pZE.LJFF("updated_windows_info", list2);
        this.removed_windows_info = C1516540pZE.LJFF("removed_windows_info", list3);
        this.layout_extra = c2233351Cb7;
        this.old_layout_extra = c2233351Cb72;
    }
}
