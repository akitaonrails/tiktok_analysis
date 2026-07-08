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

/* JADX INFO: renamed from: X.1Cb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233371Cb9 extends Message<C2233371Cb9, C2233391CbB> {
    public static final ProtoAdapter<C2233371Cb9> ADAPTER = new ProtoAdapter<C2233371Cb9>() { // from class: X.1CbA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233371Cb9 decode(ProtoReader protoReader) {
            C2233391CbB c2233391CbB = new C2233391CbB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233391CbB.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233391CbB.LJI = C2233401CbC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2233391CbB.LJFF = C2233351Cb7.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2233391CbB.LJ.add(C1CZJ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        try {
                            c2233391CbB.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2233391CbB.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233391CbB.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233371Cb9 c2233371Cb9) {
            C2233371Cb9 c2233371Cb92 = c2233371Cb9;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233371Cb92.arch_type) + C1CZJ.ADAPTER.asRepeated().encodedSizeWithTag(2, c2233371Cb92.changed_windows_info) + C2233351Cb7.ADAPTER.encodedSizeWithTag(3, c2233371Cb92.new_layout_extra) + C2233401CbC.ADAPTER.encodedSizeWithTag(4, c2233371Cb92.source) + c2233371Cb92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233371Cb9 redact(C2233371Cb9 c2233371Cb9) {
            C2233391CbB c2233391CbBNewBuilder = c2233371Cb9.newBuilder();
            C1516540pZE.LJIIIZ(c2233391CbBNewBuilder.LJ, C1CZJ.ADAPTER);
            C2233351Cb7 c2233351Cb7 = c2233391CbBNewBuilder.LJFF;
            if (c2233351Cb7 != null) {
                c2233391CbBNewBuilder.LJFF = C2233351Cb7.ADAPTER.redact(c2233351Cb7);
            }
            c2233391CbBNewBuilder.LJI = C2233401CbC.ADAPTER.redact(c2233391CbBNewBuilder.LJI);
            c2233391CbBNewBuilder.clearUnknownFields();
            return c2233391CbBNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233371Cb9 c2233371Cb9) {
            C2233371Cb9 c2233371Cb92 = c2233371Cb9;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233371Cb92.arch_type);
            C1CZJ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2233371Cb92.changed_windows_info);
            C2233351Cb7.ADAPTER.encodeWithTag(protoWriter, 3, c2233371Cb92.new_layout_extra);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 4, c2233371Cb92.source);
            protoWriter.writeBytes(c2233371Cb92.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C1CZJ> changed_windows_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutExtra#ADAPTER", tag = 3)
    public final C2233351Cb7 new_layout_extra;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2233401CbC source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.changed_windows_info.hashCode()) * 37;
        C2233351Cb7 c2233351Cb7 = this.new_layout_extra;
        int iHashCode2 = ((iHashCode + (c2233351Cb7 != null ? c2233351Cb7.hashCode() : 0)) * 37) + this.source.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2233391CbB newBuilder() {
        C2233391CbB c2233391CbB = new C2233391CbB();
        c2233391CbB.LIZLLL = this.arch_type;
        c2233391CbB.LJ = C1516540pZE.LIZJ("changed_windows_info", this.changed_windows_info);
        c2233391CbB.LJFF = this.new_layout_extra;
        c2233391CbB.LJI = this.source;
        c2233391CbB.addUnknownFields(unknownFields());
        return c2233391CbB;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        if (!this.changed_windows_info.isEmpty()) {
            sb.append(", changed_windows_info=");
            sb.append(this.changed_windows_info);
        }
        if (this.new_layout_extra != null) {
            sb.append(", new_layout_extra=");
            sb.append(this.new_layout_extra);
        }
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsX4d0e64ba5a1387a0{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233371Cb9)) {
            return false;
        }
        C2233371Cb9 c2233371Cb9 = (C2233371Cb9) obj;
        if (unknownFields().equals(c2233371Cb9.unknownFields()) && this.arch_type.equals(c2233371Cb9.arch_type) && this.changed_windows_info.equals(c2233371Cb9.changed_windows_info) && C1516540pZE.LJ(this.new_layout_extra, c2233371Cb9.new_layout_extra) && this.source.equals(c2233371Cb9.source)) {
            return true;
        }
        return false;
    }

    public C2233371Cb9(EnumC2183371Ach enumC2183371Ach, List<C1CZJ> list, C2233351Cb7 c2233351Cb7, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, list, c2233351Cb7, c2233401CbC, ByteString.EMPTY);
    }

    public C2233371Cb9(EnumC2183371Ach enumC2183371Ach, List<C1CZJ> list, C2233351Cb7 c2233351Cb7, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.changed_windows_info = C1516540pZE.LJFF("changed_windows_info", list);
        this.new_layout_extra = c2233351Cb7;
        this.source = c2233401CbC;
    }
}
