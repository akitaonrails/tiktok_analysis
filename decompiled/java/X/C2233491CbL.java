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

/* JADX INFO: renamed from: X.1CbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233491CbL extends Message<C2233491CbL, C2233511CbN> {
    public static final ProtoAdapter<C2233491CbL> ADAPTER = new ProtoAdapter<C2233491CbL>() { // from class: X.1CbM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233491CbL decode(ProtoReader protoReader) {
            C2233511CbN c2233511CbN = new C2233511CbN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233511CbN.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233511CbN.LJI = C2233401CbC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2233511CbN.LJFF.add(C2233171Cap.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2233511CbN.LJ = C2233581CbU.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2233511CbN.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2233511CbN.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233511CbN.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233491CbL c2233491CbL) {
            C2233491CbL c2233491CbL2 = c2233491CbL;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233491CbL2.arch_type) + C2233581CbU.ADAPTER.encodedSizeWithTag(2, c2233491CbL2.layout_state) + C2233171Cap.ADAPTER.asRepeated().encodedSizeWithTag(3, c2233491CbL2.spot_list) + C2233401CbC.ADAPTER.encodedSizeWithTag(4, c2233491CbL2.source) + c2233491CbL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233491CbL redact(C2233491CbL c2233491CbL) {
            C2233511CbN c2233511CbNNewBuilder = c2233491CbL.newBuilder();
            c2233511CbNNewBuilder.LJ = C2233581CbU.ADAPTER.redact(c2233511CbNNewBuilder.LJ);
            C1516540pZE.LJIIIZ(c2233511CbNNewBuilder.LJFF, C2233171Cap.ADAPTER);
            c2233511CbNNewBuilder.LJI = C2233401CbC.ADAPTER.redact(c2233511CbNNewBuilder.LJI);
            c2233511CbNNewBuilder.clearUnknownFields();
            return c2233511CbNNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233491CbL c2233491CbL) {
            C2233491CbL c2233491CbL2 = c2233491CbL;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233491CbL2.arch_type);
            C2233581CbU.ADAPTER.encodeWithTag(protoWriter, 2, c2233491CbL2.layout_state);
            C2233171Cap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2233491CbL2.spot_list);
            C2233401CbC.ADAPTER.encodeWithTag(protoWriter, 4, c2233491CbL2.source);
            protoWriter.writeBytes(c2233491CbL2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233581CbU layout_state;

    @WireField(adapter = "link_mic_sdk.proto.PipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2233401CbC source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSpotInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C2233171Cap> spot_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.layout_state.hashCode()) * 37) + this.spot_list.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233511CbN newBuilder() {
        C2233511CbN c2233511CbN = new C2233511CbN();
        c2233511CbN.LIZLLL = this.arch_type;
        c2233511CbN.LJ = this.layout_state;
        c2233511CbN.LJFF = C1516540pZE.LIZJ("spot_list", this.spot_list);
        c2233511CbN.LJI = this.source;
        c2233511CbN.addUnknownFields(unknownFields());
        return c2233511CbN;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", layout_state=");
        sb.append(this.layout_state);
        if (!this.spot_list.isEmpty()) {
            sb.append(", spot_list=");
            sb.append(this.spot_list);
        }
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXca8a490f704a50ca{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233491CbL)) {
            return false;
        }
        C2233491CbL c2233491CbL = (C2233491CbL) obj;
        if (unknownFields().equals(c2233491CbL.unknownFields()) && this.arch_type.equals(c2233491CbL.arch_type) && this.layout_state.equals(c2233491CbL.layout_state) && this.spot_list.equals(c2233491CbL.spot_list) && this.source.equals(c2233491CbL.source)) {
            return true;
        }
        return false;
    }

    public C2233491CbL(EnumC2183371Ach enumC2183371Ach, C2233581CbU c2233581CbU, List<C2233171Cap> list, C2233401CbC c2233401CbC) {
        this(enumC2183371Ach, c2233581CbU, list, c2233401CbC, ByteString.EMPTY);
    }

    public C2233491CbL(EnumC2183371Ach enumC2183371Ach, C2233581CbU c2233581CbU, List<C2233171Cap> list, C2233401CbC c2233401CbC, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.layout_state = c2233581CbU;
        this.spot_list = C1516540pZE.LJFF("spot_list", list);
        this.source = c2233401CbC;
    }
}
