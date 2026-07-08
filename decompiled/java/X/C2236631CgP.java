package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236631CgP extends Message<C2236631CgP, C2236651CgR> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicApplyIntent#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2232081CXu apply_intent;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizApplyParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C2236721CgY biz_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean check_perception_center;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPositionData#ADAPTER", tag = 2)
    public final C1CEH position_data;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAgreeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2231981CXk reply_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long version;
    public static final ProtoAdapter<C2236631CgP> ADAPTER = new ProtoAdapter<C2236631CgP>() { // from class: X.1CgQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236631CgP decode(ProtoReader protoReader) {
            C2236651CgR c2236651CgR = new C2236651CgR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2236651CgR.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2236651CgR.LJ = C1CEH.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2236651CgR.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2236651CgR.LJI = EnumC2232081CXu.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236651CgR.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            try {
                                c2236651CgR.LJII = EnumC2231981CXk.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2236651CgR.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            c2236651CgR.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2236651CgR.LJIIIZ = C2236721CgY.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236651CgR.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236651CgR.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236631CgP c2236631CgP) {
            C2236631CgP c2236631CgP2 = c2236631CgP;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2236631CgP2.invoke_id) + C1CEH.ADAPTER.encodedSizeWithTag(2, c2236631CgP2.position_data) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c2236631CgP2.check_perception_center) + EnumC2232081CXu.ADAPTER.encodedSizeWithTag(4, c2236631CgP2.apply_intent) + EnumC2231981CXk.ADAPTER.encodedSizeWithTag(5, c2236631CgP2.reply_status) + ProtoAdapter.INT64.encodedSizeWithTag(6, c2236631CgP2.version) + C2236721CgY.ADAPTER.encodedSizeWithTag(7, c2236631CgP2.biz_param) + c2236631CgP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236631CgP redact(C2236631CgP c2236631CgP) {
            C2236651CgR c2236651CgRNewBuilder = c2236631CgP.newBuilder();
            C1CEH c1ceh = c2236651CgRNewBuilder.LJ;
            if (c1ceh != null) {
                c2236651CgRNewBuilder.LJ = C1CEH.ADAPTER.redact(c1ceh);
            }
            c2236651CgRNewBuilder.LJIIIZ = C2236721CgY.ADAPTER.redact(c2236651CgRNewBuilder.LJIIIZ);
            c2236651CgRNewBuilder.clearUnknownFields();
            return c2236651CgRNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236631CgP c2236631CgP) {
            C2236631CgP c2236631CgP2 = c2236631CgP;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2236631CgP2.invoke_id);
            C1CEH.ADAPTER.encodeWithTag(protoWriter, 2, c2236631CgP2.position_data);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c2236631CgP2.check_perception_center);
            EnumC2232081CXu.ADAPTER.encodeWithTag(protoWriter, 4, c2236631CgP2.apply_intent);
            EnumC2231981CXk.ADAPTER.encodeWithTag(protoWriter, 5, c2236631CgP2.reply_status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, c2236631CgP2.version);
            C2236721CgY.ADAPTER.encodeWithTag(protoWriter, 7, c2236631CgP2.biz_param);
            protoWriter.writeBytes(c2236631CgP2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_CHECK_PERCEPTION_CENTER = Boolean.FALSE;
    public static final EnumC2232081CXu DEFAULT_APPLY_INTENT = EnumC2232081CXu.VAR_LINK_MIC_APPLY_INTENT_NORMAL_APPLY;
    public static final EnumC2231981CXk DEFAULT_REPLY_STATUS = EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    public static final Long DEFAULT_VERSION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37;
        C1CEH c1ceh = this.position_data;
        int iHashCode2 = ((((((((((iHashCode + (c1ceh != null ? c1ceh.hashCode() : 0)) * 37) + this.check_perception_center.hashCode()) * 37) + this.apply_intent.hashCode()) * 37) + this.reply_status.hashCode()) * 37) + this.version.hashCode()) * 37) + this.biz_param.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2236651CgR newBuilder() {
        C2236651CgR c2236651CgR = new C2236651CgR();
        c2236651CgR.LIZLLL = this.invoke_id;
        c2236651CgR.LJ = this.position_data;
        c2236651CgR.LJFF = this.check_perception_center;
        c2236651CgR.LJI = this.apply_intent;
        c2236651CgR.LJII = this.reply_status;
        c2236651CgR.LJIIIIZZ = this.version;
        c2236651CgR.LJIIIZ = this.biz_param;
        c2236651CgR.addUnknownFields(unknownFields());
        return c2236651CgR;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        if (this.position_data != null) {
            sb.append(", position_data=");
            sb.append(this.position_data);
        }
        sb.append(", check_perception_center=");
        sb.append(this.check_perception_center);
        sb.append(", apply_intent=");
        sb.append(this.apply_intent);
        sb.append(", reply_status=");
        sb.append(this.reply_status);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", biz_param=");
        sb.append(this.biz_param);
        sb.replace(0, 2, "LinkMicApplyParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236631CgP)) {
            return false;
        }
        C2236631CgP c2236631CgP = (C2236631CgP) obj;
        if (unknownFields().equals(c2236631CgP.unknownFields()) && this.invoke_id.equals(c2236631CgP.invoke_id) && C1516540pZE.LJ(this.position_data, c2236631CgP.position_data) && this.check_perception_center.equals(c2236631CgP.check_perception_center) && this.apply_intent.equals(c2236631CgP.apply_intent) && this.reply_status.equals(c2236631CgP.reply_status) && this.version.equals(c2236631CgP.version) && this.biz_param.equals(c2236631CgP.biz_param)) {
            return true;
        }
        return false;
    }

    public C2236631CgP(String str, C1CEH c1ceh, Boolean bool, EnumC2232081CXu enumC2232081CXu, EnumC2231981CXk enumC2231981CXk, Long l, C2236721CgY c2236721CgY) {
        this(str, c1ceh, bool, enumC2232081CXu, enumC2231981CXk, l, c2236721CgY, ByteString.EMPTY);
    }

    public C2236631CgP(String str, C1CEH c1ceh, Boolean bool, EnumC2232081CXu enumC2232081CXu, EnumC2231981CXk enumC2231981CXk, Long l, C2236721CgY c2236721CgY, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.position_data = c1ceh;
        this.check_perception_center = bool;
        this.apply_intent = enumC2232081CXu;
        this.reply_status = enumC2231981CXk;
        this.version = l;
        this.biz_param = c2236721CgY;
    }
}
