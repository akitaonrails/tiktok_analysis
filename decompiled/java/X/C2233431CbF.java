package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233431CbF extends Message<C2233431CbF, C2233451CbH> {
    public static final ProtoAdapter<C2233431CbF> ADAPTER = new ProtoAdapter<C2233431CbF>() { // from class: X.1CbG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233431CbF decode(ProtoReader protoReader) {
            C2233451CbH c2233451CbH = new C2233451CbH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2233451CbH.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233451CbH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2233451CbH.LJ.add(C2233221Cau.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c2233451CbH.LJFF = C2229791COz.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2233451CbH.LJI = C2233461CbI.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2233451CbH.LJII.add(C2233171Cap.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c2233451CbH.LJIIIIZZ = C2233351Cb7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233451CbH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233451CbH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233431CbF c2233431CbF) {
            C2233431CbF c2233431CbF2 = c2233431CbF;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233431CbF2.arch_type) + C2233221Cau.ADAPTER.asRepeated().encodedSizeWithTag(2, c2233431CbF2.canvas_regions) + C2229791COz.ADAPTER.encodedSizeWithTag(3, c2233431CbF2.canvas_size) + C2233461CbI.ADAPTER.encodedSizeWithTag(4, c2233431CbF2.sei_container_info) + C2233171Cap.ADAPTER.asRepeated().encodedSizeWithTag(5, c2233431CbF2.spot_list) + C2233351Cb7.ADAPTER.encodedSizeWithTag(6, c2233431CbF2.layout_extra) + c2233431CbF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233431CbF redact(C2233431CbF c2233431CbF) {
            C2233451CbH c2233451CbHNewBuilder = c2233431CbF.newBuilder();
            C1516540pZE.LJIIIZ(c2233451CbHNewBuilder.LJ, C2233221Cau.ADAPTER);
            c2233451CbHNewBuilder.LJFF = C2229791COz.ADAPTER.redact(c2233451CbHNewBuilder.LJFF);
            c2233451CbHNewBuilder.LJI = C2233461CbI.ADAPTER.redact(c2233451CbHNewBuilder.LJI);
            C1516540pZE.LJIIIZ(c2233451CbHNewBuilder.LJII, C2233171Cap.ADAPTER);
            c2233451CbHNewBuilder.LJIIIIZZ = C2233351Cb7.ADAPTER.redact(c2233451CbHNewBuilder.LJIIIIZZ);
            c2233451CbHNewBuilder.clearUnknownFields();
            return c2233451CbHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233431CbF c2233431CbF) {
            C2233431CbF c2233431CbF2 = c2233431CbF;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233431CbF2.arch_type);
            C2233221Cau.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2233431CbF2.canvas_regions);
            C2229791COz.ADAPTER.encodeWithTag(protoWriter, 3, c2233431CbF2.canvas_size);
            C2233461CbI.ADAPTER.encodeWithTag(protoWriter, 4, c2233431CbF2.sei_container_info);
            C2233171Cap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c2233431CbF2.spot_list);
            C2233351Cb7.ADAPTER.encodeWithTag(protoWriter, 6, c2233431CbF2.layout_extra);
            protoWriter.writeBytes(c2233431CbF2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutMixStreamRegionInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2233221Cau> canvas_regions;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutCanvasResolution#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2229791COz canvas_size;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C2233351Cb7 layout_extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSeiContainerInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2233461CbI sei_container_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSpotInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C2233171Cap> spot_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.canvas_regions.hashCode()) * 37) + this.canvas_size.hashCode()) * 37) + this.sei_container_info.hashCode()) * 37) + this.spot_list.hashCode()) * 37) + this.layout_extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233451CbH newBuilder() {
        C2233451CbH c2233451CbH = new C2233451CbH();
        c2233451CbH.LIZLLL = this.arch_type;
        c2233451CbH.LJ = C1516540pZE.LIZJ("canvas_regions", this.canvas_regions);
        c2233451CbH.LJFF = this.canvas_size;
        c2233451CbH.LJI = this.sei_container_info;
        c2233451CbH.LJII = C1516540pZE.LIZJ("spot_list", this.spot_list);
        c2233451CbH.LJIIIIZZ = this.layout_extra;
        c2233451CbH.addUnknownFields(unknownFields());
        return c2233451CbH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        if (!this.canvas_regions.isEmpty()) {
            sb.append(", canvas_regions=");
            sb.append(this.canvas_regions);
        }
        sb.append(", canvas_size=");
        sb.append(this.canvas_size);
        sb.append(", sei_container_info=");
        sb.append(this.sei_container_info);
        if (!this.spot_list.isEmpty()) {
            sb.append(", spot_list=");
            sb.append(this.spot_list);
        }
        sb.append(", layout_extra=");
        sb.append(this.layout_extra);
        sb.replace(0, 2, "FuncParamsX7128fd76862e9cfd{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233431CbF)) {
            return false;
        }
        C2233431CbF c2233431CbF = (C2233431CbF) obj;
        if (unknownFields().equals(c2233431CbF.unknownFields()) && this.arch_type.equals(c2233431CbF.arch_type) && this.canvas_regions.equals(c2233431CbF.canvas_regions) && this.canvas_size.equals(c2233431CbF.canvas_size) && this.sei_container_info.equals(c2233431CbF.sei_container_info) && this.spot_list.equals(c2233431CbF.spot_list) && this.layout_extra.equals(c2233431CbF.layout_extra)) {
            return true;
        }
        return false;
    }

    public C2233431CbF(EnumC2183371Ach enumC2183371Ach, List<C2233221Cau> list, C2229791COz c2229791COz, C2233461CbI c2233461CbI, List<C2233171Cap> list2, C2233351Cb7 c2233351Cb7) {
        this(enumC2183371Ach, list, c2229791COz, c2233461CbI, list2, c2233351Cb7, ByteString.EMPTY);
    }

    public C2233431CbF(EnumC2183371Ach enumC2183371Ach, List<C2233221Cau> list, C2229791COz c2229791COz, C2233461CbI c2233461CbI, List<C2233171Cap> list2, C2233351Cb7 c2233351Cb7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.canvas_regions = C1516540pZE.LJFF("canvas_regions", list);
        this.canvas_size = c2229791COz;
        this.sei_container_info = c2233461CbI;
        this.spot_list = C1516540pZE.LJFF("spot_list", list2);
        this.layout_extra = c2233351Cb7;
    }
}
