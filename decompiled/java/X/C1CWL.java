package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWL extends Message<C1CWL, C1CWN> {
    public static final ProtoAdapter<C1CWL> ADAPTER = new ProtoAdapter<C1CWL>() { // from class: X.1CWM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWL decode(ProtoReader protoReader) {
            C1CWN c1cwn = new C1CWN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cwn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1cwn.LJI = C1CWO.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cwn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c1cwn.LJFF = C1CWO.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1cwn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            c1cwn.LJ = C1CW4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cwn.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            c1cwn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWL c1cwl) {
            C1CWL c1cwl2 = c1cwl;
            int iEncodedSizeWithTag = EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c1cwl2.arch_type) + C1CW4.ADAPTER.encodedSizeWithTag(2, c1cwl2.identity);
            ProtoAdapter<C1CWO> protoAdapter = C1CWO.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1cwl2.old_state) + protoAdapter.encodedSizeWithTag(4, c1cwl2.new_state) + c1cwl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWL redact(C1CWL c1cwl) {
            C1CWN c1cwnNewBuilder = c1cwl.newBuilder();
            c1cwnNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cwnNewBuilder.LJ);
            c1cwnNewBuilder.clearUnknownFields();
            return c1cwnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWL c1cwl) {
            C1CWL c1cwl2 = c1cwl;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c1cwl2.arch_type);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c1cwl2.identity);
            ProtoAdapter<C1CWO> protoAdapter = C1CWO.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwl2.old_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cwl2.new_state);
            protoWriter.writeBytes(c1cwl2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final C1CWO DEFAULT_NEW_STATE;
    public static final C1CWO DEFAULT_OLD_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW4 identity;

    @WireField(adapter = "link_mic_sdk.proto.LayoutRenderWindowState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CWO new_state;

    @WireField(adapter = "link_mic_sdk.proto.LayoutRenderWindowState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CWO old_state;

    static {
        C1CWO c1cwo = C1CWO.VAR_LAYOUT_RENDER_WINDOW_STATE_INIT_STATE;
        DEFAULT_OLD_STATE = c1cwo;
        DEFAULT_NEW_STATE = c1cwo;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.identity.hashCode()) * 37) + this.old_state.hashCode()) * 37) + this.new_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CWN newBuilder() {
        C1CWN c1cwn = new C1CWN();
        c1cwn.LIZLLL = this.arch_type;
        c1cwn.LJ = this.identity;
        c1cwn.LJFF = this.old_state;
        c1cwn.LJI = this.new_state;
        c1cwn.addUnknownFields(unknownFields());
        return c1cwn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", identity=");
        sb.append(this.identity);
        sb.append(", old_state=");
        sb.append(this.old_state);
        sb.append(", new_state=");
        sb.append(this.new_state);
        sb.replace(0, 2, "FuncParamsXb9786bb9d3e56211{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWL)) {
            return false;
        }
        C1CWL c1cwl = (C1CWL) obj;
        if (unknownFields().equals(c1cwl.unknownFields()) && this.arch_type.equals(c1cwl.arch_type) && this.identity.equals(c1cwl.identity) && this.old_state.equals(c1cwl.old_state) && this.new_state.equals(c1cwl.new_state)) {
            return true;
        }
        return false;
    }

    public C1CWL(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWO c1cwo, C1CWO c1cwo2) {
        this(enumC2183371Ach, c1cw4, c1cwo, c1cwo2, ByteString.EMPTY);
    }

    public C1CWL(EnumC2183371Ach enumC2183371Ach, C1CW4 c1cw4, C1CWO c1cwo, C1CWO c1cwo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.identity = c1cw4;
        this.old_state = c1cwo;
        this.new_state = c1cwo2;
    }
}
