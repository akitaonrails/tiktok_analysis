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

/* JADX INFO: renamed from: X.1Cbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233671Cbd extends Message<C2233671Cbd, C2233691Cbf> {
    public static final ProtoAdapter<C2233671Cbd> ADAPTER = new ProtoAdapter<C2233671Cbd>() { // from class: X.1Cbe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233671Cbd decode(ProtoReader protoReader) {
            C2233691Cbf c2233691Cbf = new C2233691Cbf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2233691Cbf.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233691Cbf.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2233691Cbf.LJ = C2233461CbI.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2233691Cbf.LJFF.add(C2233221Cau.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c2233691Cbf.LJI = C2233761Cbm.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2233691Cbf.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2233691Cbf.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2233691Cbf.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2233691Cbf.LJIIJ.add(C1CWT.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233691Cbf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233691Cbf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233671Cbd c2233671Cbd) {
            C2233671Cbd c2233671Cbd2 = c2233671Cbd;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233671Cbd2.arch_type) + C2233461CbI.ADAPTER.encodedSizeWithTag(2, c2233671Cbd2.container_info) + C2233221Cau.ADAPTER.asRepeated().encodedSizeWithTag(3, c2233671Cbd2.windows_info) + C2233761Cbm.ADAPTER.encodedSizeWithTag(4, c2233671Cbd2.resolution);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, c2233671Cbd2.multi_guest_layout_extra) + protoAdapter.encodedSizeWithTag(6, c2233671Cbd2.cohost_layout_extra) + protoAdapter.encodedSizeWithTag(7, c2233671Cbd2.anchor_link_mic_id) + C1CWT.ADAPTER.asRepeated().encodedSizeWithTag(8, c2233671Cbd2.user_states) + c2233671Cbd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233671Cbd redact(C2233671Cbd c2233671Cbd) {
            C2233691Cbf c2233691CbfNewBuilder = c2233671Cbd.newBuilder();
            c2233691CbfNewBuilder.LJ = C2233461CbI.ADAPTER.redact(c2233691CbfNewBuilder.LJ);
            C1516540pZE.LJIIIZ(c2233691CbfNewBuilder.LJFF, C2233221Cau.ADAPTER);
            c2233691CbfNewBuilder.LJI = C2233761Cbm.ADAPTER.redact(c2233691CbfNewBuilder.LJI);
            C1516540pZE.LJIIIZ(c2233691CbfNewBuilder.LJIIJ, C1CWT.ADAPTER);
            c2233691CbfNewBuilder.clearUnknownFields();
            return c2233691CbfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233671Cbd c2233671Cbd) {
            C2233671Cbd c2233671Cbd2 = c2233671Cbd;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233671Cbd2.arch_type);
            C2233461CbI.ADAPTER.encodeWithTag(protoWriter, 2, c2233671Cbd2.container_info);
            C2233221Cau.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2233671Cbd2.windows_info);
            C2233761Cbm.ADAPTER.encodeWithTag(protoWriter, 4, c2233671Cbd2.resolution);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 5, c2233671Cbd2.multi_guest_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 6, c2233671Cbd2.cohost_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 7, c2233671Cbd2.anchor_link_mic_id);
            C1CWT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c2233671Cbd2.user_states);
            protoWriter.writeBytes(c2233671Cbd2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String anchor_link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String cohost_layout_extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSeiContainerInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233461CbI container_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String multi_guest_layout_extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutStreamPlayerResolution#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2233761Cbm resolution;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicUserStateSei#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<C1CWT> user_states;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutMixStreamRegionInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C2233221Cau> windows_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.container_info.hashCode()) * 37) + this.windows_info.hashCode()) * 37) + this.resolution.hashCode()) * 37;
        String str = this.multi_guest_layout_extra;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cohost_layout_extra;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.anchor_link_mic_id;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.user_states.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2233691Cbf newBuilder() {
        C2233691Cbf c2233691Cbf = new C2233691Cbf();
        c2233691Cbf.LIZLLL = this.arch_type;
        c2233691Cbf.LJ = this.container_info;
        c2233691Cbf.LJFF = C1516540pZE.LIZJ("windows_info", this.windows_info);
        c2233691Cbf.LJI = this.resolution;
        c2233691Cbf.LJII = this.multi_guest_layout_extra;
        c2233691Cbf.LJIIIIZZ = this.cohost_layout_extra;
        c2233691Cbf.LJIIIZ = this.anchor_link_mic_id;
        c2233691Cbf.LJIIJ = C1516540pZE.LIZJ("user_states", this.user_states);
        c2233691Cbf.addUnknownFields(unknownFields());
        return c2233691Cbf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", container_info=");
        sb.append(this.container_info);
        if (!this.windows_info.isEmpty()) {
            sb.append(", windows_info=");
            sb.append(this.windows_info);
        }
        sb.append(", resolution=");
        sb.append(this.resolution);
        if (this.multi_guest_layout_extra != null) {
            sb.append(", multi_guest_layout_extra=");
            sb.append(this.multi_guest_layout_extra);
        }
        if (this.cohost_layout_extra != null) {
            sb.append(", cohost_layout_extra=");
            sb.append(this.cohost_layout_extra);
        }
        if (this.anchor_link_mic_id != null) {
            sb.append(", anchor_link_mic_id=");
            sb.append(this.anchor_link_mic_id);
        }
        if (!this.user_states.isEmpty()) {
            sb.append(", user_states=");
            sb.append(this.user_states);
        }
        sb.replace(0, 2, "LinkMicLayoutSeiLayoutModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233671Cbd)) {
            return false;
        }
        C2233671Cbd c2233671Cbd = (C2233671Cbd) obj;
        if (unknownFields().equals(c2233671Cbd.unknownFields()) && this.arch_type.equals(c2233671Cbd.arch_type) && this.container_info.equals(c2233671Cbd.container_info) && this.windows_info.equals(c2233671Cbd.windows_info) && this.resolution.equals(c2233671Cbd.resolution) && C1516540pZE.LJ(this.multi_guest_layout_extra, c2233671Cbd.multi_guest_layout_extra) && C1516540pZE.LJ(this.cohost_layout_extra, c2233671Cbd.cohost_layout_extra) && C1516540pZE.LJ(this.anchor_link_mic_id, c2233671Cbd.anchor_link_mic_id) && this.user_states.equals(c2233671Cbd.user_states)) {
            return true;
        }
        return false;
    }

    public C2233671Cbd(EnumC2183371Ach enumC2183371Ach, C2233461CbI c2233461CbI, List<C2233221Cau> list, C2233761Cbm c2233761Cbm, String str, String str2, String str3, List<C1CWT> list2) {
        this(enumC2183371Ach, c2233461CbI, list, c2233761Cbm, str, str2, str3, list2, ByteString.EMPTY);
    }

    public C2233671Cbd(EnumC2183371Ach enumC2183371Ach, C2233461CbI c2233461CbI, List<C2233221Cau> list, C2233761Cbm c2233761Cbm, String str, String str2, String str3, List<C1CWT> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.container_info = c2233461CbI;
        this.windows_info = C1516540pZE.LJFF("windows_info", list);
        this.resolution = c2233761Cbm;
        this.multi_guest_layout_extra = str;
        this.cohost_layout_extra = str2;
        this.anchor_link_mic_id = str3;
        this.user_states = C1516540pZE.LJFF("user_states", list2);
    }
}
