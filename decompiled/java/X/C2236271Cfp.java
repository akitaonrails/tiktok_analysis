package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236271Cfp extends Message<C2236271Cfp, C2236291Cfr> {
    public static final ProtoAdapter<C2236271Cfp> ADAPTER = new ProtoAdapter<C2236271Cfp>() { // from class: X.1Cfq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236271Cfp decode(ProtoReader protoReader) {
            C2236291Cfr c2236291Cfr = new C2236291Cfr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2236291Cfr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2236291Cfr.LJI = C2236781Cge.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2236291Cfr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            try {
                                c2236291Cfr.LJ = EnumC972810bQF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236291Cfr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        try {
                            c2236291Cfr.LIZLLL = EnumC2231891CXb.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c2236291Cfr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236291Cfr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236271Cfp c2236271Cfp) {
            C2236271Cfp c2236271Cfp2 = c2236271Cfp;
            return EnumC2231891CXb.ADAPTER.encodedSizeWithTag(1, c2236271Cfp2.display_id) + EnumC972810bQF.ADAPTER.encodedSizeWithTag(2, c2236271Cfp2.layout_style) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2236271Cfp2.max_position) + C2236781Cge.ADAPTER.encodedSizeWithTag(4, c2236271Cfp2.user_setting) + c2236271Cfp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236271Cfp redact(C2236271Cfp c2236271Cfp) {
            C2236291Cfr c2236291CfrNewBuilder = c2236271Cfp.newBuilder();
            C2236781Cge c2236781Cge = c2236291CfrNewBuilder.LJI;
            if (c2236781Cge != null) {
                c2236291CfrNewBuilder.LJI = C2236781Cge.ADAPTER.redact(c2236781Cge);
            }
            c2236291CfrNewBuilder.clearUnknownFields();
            return c2236291CfrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236271Cfp c2236271Cfp) {
            C2236271Cfp c2236271Cfp2 = c2236271Cfp;
            EnumC2231891CXb.ADAPTER.encodeWithTag(protoWriter, 1, c2236271Cfp2.display_id);
            EnumC972810bQF.ADAPTER.encodeWithTag(protoWriter, 2, c2236271Cfp2.layout_style);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2236271Cfp2.max_position);
            C2236781Cge.ADAPTER.encodeWithTag(protoWriter, 4, c2236271Cfp2.user_setting);
            protoWriter.writeBytes(c2236271Cfp2.unknownFields());
        }
    };
    public static final EnumC2231891CXb DEFAULT_DISPLAY_ID = EnumC2231891CXb.VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_NONE;
    public static final EnumC972810bQF DEFAULT_LAYOUT_STYLE = EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_UNKNOWN;
    public static final Long DEFAULT_MAX_POSITION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAnchorWindowsDisplayType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2231891CXb display_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutStyle#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC972810bQF layout_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long max_position;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizCreateChannelUserSetting#ADAPTER", tag = 4)
    public final C2236781Cge user_setting;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.display_id.hashCode()) * 37) + this.layout_style.hashCode()) * 37) + this.max_position.hashCode()) * 37;
        C2236781Cge c2236781Cge = this.user_setting;
        int iHashCode2 = iHashCode + (c2236781Cge != null ? c2236781Cge.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2236291Cfr newBuilder() {
        C2236291Cfr c2236291Cfr = new C2236291Cfr();
        c2236291Cfr.LIZLLL = this.display_id;
        c2236291Cfr.LJ = this.layout_style;
        c2236291Cfr.LJFF = this.max_position;
        c2236291Cfr.LJI = this.user_setting;
        c2236291Cfr.addUnknownFields(unknownFields());
        return c2236291Cfr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", display_id=");
        sb.append(this.display_id);
        sb.append(", layout_style=");
        sb.append(this.layout_style);
        sb.append(", max_position=");
        sb.append(this.max_position);
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        sb.replace(0, 2, "LinkMicMultiLiveBizCreateChannelParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236271Cfp)) {
            return false;
        }
        C2236271Cfp c2236271Cfp = (C2236271Cfp) obj;
        if (unknownFields().equals(c2236271Cfp.unknownFields()) && this.display_id.equals(c2236271Cfp.display_id) && this.layout_style.equals(c2236271Cfp.layout_style) && this.max_position.equals(c2236271Cfp.max_position) && C1516540pZE.LJ(this.user_setting, c2236271Cfp.user_setting)) {
            return true;
        }
        return false;
    }

    public C2236271Cfp(EnumC2231891CXb enumC2231891CXb, EnumC972810bQF enumC972810bQF, Long l, C2236781Cge c2236781Cge) {
        this(enumC2231891CXb, enumC972810bQF, l, c2236781Cge, ByteString.EMPTY);
    }

    public C2236271Cfp(EnumC2231891CXb enumC2231891CXb, EnumC972810bQF enumC972810bQF, Long l, C2236781Cge c2236781Cge, ByteString byteString) {
        super(ADAPTER, byteString);
        this.display_id = enumC2231891CXb;
        this.layout_style = enumC972810bQF;
        this.max_position = l;
        this.user_setting = c2236781Cge;
    }
}
