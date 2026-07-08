package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232921CaQ extends Message<C2232921CaQ, C2232971CaV> {
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
    public static final ProtoAdapter<C2232921CaQ> ADAPTER = new ProtoAdapter<C2232921CaQ>() { // from class: X.1CaT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232921CaQ decode(ProtoReader protoReader) {
            C2232971CaV c2232971CaV = new C2232971CaV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232971CaV.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2232971CaV.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2232971CaV.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2232971CaV.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2232971CaV.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2232971CaV.LJIIIIZZ = EnumC2231901CXc.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2232971CaV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232971CaV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232971CaV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232921CaQ c2232921CaQ) {
            C2232921CaQ c2232921CaQ2 = c2232921CaQ;
            int iEncodedSizeWithTag = C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2232921CaQ2.approver) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2232921CaQ2.is_agree) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2232921CaQ2.group_channel_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2232921CaQ2.self_group_linkmic_id) + protoAdapter.encodedSizeWithTag(5, c2232921CaQ2.target_group_linkmic_id) + EnumC2231901CXc.ADAPTER.encodedSizeWithTag(6, c2232921CaQ2.msg_mode) + c2232921CaQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232921CaQ redact(C2232921CaQ c2232921CaQ) {
            C2232971CaV c2232971CaVNewBuilder = c2232921CaQ.newBuilder();
            c2232971CaVNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2232971CaVNewBuilder.LIZLLL);
            c2232971CaVNewBuilder.clearUnknownFields();
            return c2232971CaVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232921CaQ c2232921CaQ) {
            C2232921CaQ c2232921CaQ2 = c2232921CaQ;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2232921CaQ2.approver);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2232921CaQ2.is_agree);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2232921CaQ2.group_channel_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c2232921CaQ2.self_group_linkmic_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232921CaQ2.target_group_linkmic_id);
            EnumC2231901CXc.ADAPTER.encodeWithTag(protoWriter, 6, c2232921CaQ2.msg_mode);
            protoWriter.writeBytes(c2232921CaQ2.unknownFields());
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
    public C2232971CaV newBuilder() {
        C2232971CaV c2232971CaV = new C2232971CaV();
        c2232971CaV.LIZLLL = this.approver;
        c2232971CaV.LJ = this.is_agree;
        c2232971CaV.LJFF = this.group_channel_id;
        c2232971CaV.LJI = this.self_group_linkmic_id;
        c2232971CaV.LJII = this.target_group_linkmic_id;
        c2232971CaV.LJIIIIZZ = this.msg_mode;
        c2232971CaV.addUnknownFields(unknownFields());
        return c2232971CaV;
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
        sb.replace(0, 2, "LinkMicImReplyGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232921CaQ)) {
            return false;
        }
        C2232921CaQ c2232921CaQ = (C2232921CaQ) obj;
        if (unknownFields().equals(c2232921CaQ.unknownFields()) && this.approver.equals(c2232921CaQ.approver) && this.is_agree.equals(c2232921CaQ.is_agree) && this.group_channel_id.equals(c2232921CaQ.group_channel_id) && this.self_group_linkmic_id.equals(c2232921CaQ.self_group_linkmic_id) && this.target_group_linkmic_id.equals(c2232921CaQ.target_group_linkmic_id) && this.msg_mode.equals(c2232921CaQ.msg_mode)) {
            return true;
        }
        return false;
    }

    public C2232921CaQ(C2232021CXo c2232021CXo, Boolean bool, Long l, String str, String str2, EnumC2231901CXc enumC2231901CXc) {
        this(c2232021CXo, bool, l, str, str2, enumC2231901CXc, ByteString.EMPTY);
    }

    public C2232921CaQ(C2232021CXo c2232021CXo, Boolean bool, Long l, String str, String str2, EnumC2231901CXc enumC2231901CXc, ByteString byteString) {
        super(ADAPTER, byteString);
        this.approver = c2232021CXo;
        this.is_agree = bool;
        this.group_channel_id = l;
        this.self_group_linkmic_id = str;
        this.target_group_linkmic_id = str2;
        this.msg_mode = enumC2231901CXc;
    }
}
