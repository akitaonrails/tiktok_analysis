package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232931CaR extends Message<C2232931CaR, C2232961CaU> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo approver;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_agree;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final EnumC2231901CXc msg_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String self_group_linkmic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String target_group_linkmic_id;
    public static final ProtoAdapter<C2232931CaR> ADAPTER = new ProtoAdapter<C2232931CaR>() { // from class: X.1CaS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232931CaR decode(ProtoReader protoReader) {
            C2232961CaU c2232961CaU = new C2232961CaU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232961CaU.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2232961CaU.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2232961CaU.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2232961CaU.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2232961CaU.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2232961CaU.LJIIIIZZ = EnumC2231901CXc.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2232961CaU.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232961CaU.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232961CaU.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232931CaR c2232931CaR) {
            C2232931CaR c2232931CaR2 = c2232931CaR;
            int iEncodedSizeWithTag = C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2232931CaR2.approver) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2232931CaR2.is_agree) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2232931CaR2.group_channel_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2232931CaR2.self_group_linkmic_id) + protoAdapter.encodedSizeWithTag(5, c2232931CaR2.target_group_linkmic_id) + EnumC2231901CXc.ADAPTER.encodedSizeWithTag(6, c2232931CaR2.msg_mode) + c2232931CaR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232931CaR redact(C2232931CaR c2232931CaR) {
            C2232961CaU c2232961CaUNewBuilder = c2232931CaR.newBuilder();
            c2232961CaUNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2232961CaUNewBuilder.LIZLLL);
            c2232961CaUNewBuilder.clearUnknownFields();
            return c2232961CaUNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232931CaR c2232931CaR) {
            C2232931CaR c2232931CaR2 = c2232931CaR;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2232931CaR2.approver);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2232931CaR2.is_agree);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2232931CaR2.group_channel_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c2232931CaR2.self_group_linkmic_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232931CaR2.target_group_linkmic_id);
            EnumC2231901CXc.ADAPTER.encodeWithTag(protoWriter, 6, c2232931CaR2.msg_mode);
            protoWriter.writeBytes(c2232931CaR2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_AGREE = Boolean.FALSE;
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final EnumC2231901CXc DEFAULT_MSG_MODE = EnumC2231901CXc.VAR_LINK_MIC_IM_MODE_IM;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.approver.hashCode()) * 37) + this.is_agree.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.self_group_linkmic_id.hashCode()) * 37) + this.target_group_linkmic_id.hashCode()) * 37) + this.msg_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232961CaU newBuilder() {
        C2232961CaU c2232961CaU = new C2232961CaU();
        c2232961CaU.LIZLLL = this.approver;
        c2232961CaU.LJ = this.is_agree;
        c2232961CaU.LJFF = this.group_channel_id;
        c2232961CaU.LJI = this.self_group_linkmic_id;
        c2232961CaU.LJII = this.target_group_linkmic_id;
        c2232961CaU.LJIIIIZZ = this.msg_mode;
        c2232961CaU.addUnknownFields(unknownFields());
        return c2232961CaU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", approver=");
        sb.append(this.approver);
        sb.append(", is_agree=");
        sb.append(this.is_agree);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", self_group_linkmic_id=");
        sb.append(this.self_group_linkmic_id);
        sb.append(", target_group_linkmic_id=");
        sb.append(this.target_group_linkmic_id);
        sb.append(", msg_mode=");
        sb.append(this.msg_mode);
        sb.replace(0, 2, "LinkMicImPermitGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232931CaR)) {
            return false;
        }
        C2232931CaR c2232931CaR = (C2232931CaR) obj;
        if (unknownFields().equals(c2232931CaR.unknownFields()) && this.approver.equals(c2232931CaR.approver) && this.is_agree.equals(c2232931CaR.is_agree) && this.group_channel_id.equals(c2232931CaR.group_channel_id) && this.self_group_linkmic_id.equals(c2232931CaR.self_group_linkmic_id) && this.target_group_linkmic_id.equals(c2232931CaR.target_group_linkmic_id) && this.msg_mode.equals(c2232931CaR.msg_mode)) {
            return true;
        }
        return false;
    }

    public C2232931CaR(C2232021CXo c2232021CXo, Boolean bool, Long l, String str, String str2, EnumC2231901CXc enumC2231901CXc) {
        this(c2232021CXo, bool, l, str, str2, enumC2231901CXc, ByteString.EMPTY);
    }

    public C2232931CaR(C2232021CXo c2232021CXo, Boolean bool, Long l, String str, String str2, EnumC2231901CXc enumC2231901CXc, ByteString byteString) {
        super(ADAPTER, byteString);
        this.approver = c2232021CXo;
        this.is_agree = bool;
        this.group_channel_id = l;
        this.self_group_linkmic_id = str;
        this.target_group_linkmic_id = str2;
        this.msg_mode = enumC2231901CXc;
    }
}
