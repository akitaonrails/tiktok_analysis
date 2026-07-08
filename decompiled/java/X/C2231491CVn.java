package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231491CVn extends Message<C2231491CVn, C2231511CVp> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizLeaveGroupParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C2227631CGr biz_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long current_group_channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSdkFinishReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CW2 finish_link_mic_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLeaveReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC1282030jSz leave_reason;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo leaver;
    public static final ProtoAdapter<C2231491CVn> ADAPTER = new ProtoAdapter<C2231491CVn>() { // from class: X.1CVo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231491CVn decode(ProtoReader protoReader) {
            C2231511CVp c2231511CVp = new C2231511CVp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2231511CVp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2231511CVp.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2231511CVp.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2231511CVp.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c2231511CVp.LJII = EnumC1282030jSz.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231511CVp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 6:
                            try {
                                c2231511CVp.LJIIIIZZ = C1CW2.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2231511CVp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 7:
                            c2231511CVp.LJIIIZ = C2227631CGr.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231511CVp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231511CVp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231491CVn c2231491CVn) {
            C2231491CVn c2231491CVn2 = c2231491CVn;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2231491CVn2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2231491CVn2.leaver);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2231491CVn2.group_channel_id) + protoAdapter.encodedSizeWithTag(4, c2231491CVn2.current_group_channel_id) + EnumC1282030jSz.ADAPTER.encodedSizeWithTag(5, c2231491CVn2.leave_reason) + C1CW2.ADAPTER.encodedSizeWithTag(6, c2231491CVn2.finish_link_mic_reason) + C2227631CGr.ADAPTER.encodedSizeWithTag(7, c2231491CVn2.biz_param) + c2231491CVn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231491CVn redact(C2231491CVn c2231491CVn) {
            C2231511CVp c2231511CVpNewBuilder = c2231491CVn.newBuilder();
            c2231511CVpNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2231511CVpNewBuilder.LJ);
            c2231511CVpNewBuilder.LJIIIZ = C2227631CGr.ADAPTER.redact(c2231511CVpNewBuilder.LJIIIZ);
            c2231511CVpNewBuilder.clearUnknownFields();
            return c2231511CVpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231491CVn c2231491CVn) {
            C2231491CVn c2231491CVn2 = c2231491CVn;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2231491CVn2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2231491CVn2.leaver);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c2231491CVn2.group_channel_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c2231491CVn2.current_group_channel_id);
            EnumC1282030jSz.ADAPTER.encodeWithTag(protoWriter, 5, c2231491CVn2.leave_reason);
            C1CW2.ADAPTER.encodeWithTag(protoWriter, 6, c2231491CVn2.finish_link_mic_reason);
            C2227631CGr.ADAPTER.encodeWithTag(protoWriter, 7, c2231491CVn2.biz_param);
            protoWriter.writeBytes(c2231491CVn2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final Long DEFAULT_CURRENT_GROUP_CHANNEL_ID = 0L;
    public static final EnumC1282030jSz DEFAULT_LEAVE_REASON = EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_UNKNOWN;
    public static final C1CW2 DEFAULT_FINISH_LINK_MIC_REASON = C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.leaver.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.current_group_channel_id.hashCode()) * 37) + this.leave_reason.hashCode()) * 37) + this.finish_link_mic_reason.hashCode()) * 37) + this.biz_param.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231511CVp newBuilder() {
        C2231511CVp c2231511CVp = new C2231511CVp();
        c2231511CVp.LIZLLL = this.invoke_id;
        c2231511CVp.LJ = this.leaver;
        c2231511CVp.LJFF = this.group_channel_id;
        c2231511CVp.LJI = this.current_group_channel_id;
        c2231511CVp.LJII = this.leave_reason;
        c2231511CVp.LJIIIIZZ = this.finish_link_mic_reason;
        c2231511CVp.LJIIIZ = this.biz_param;
        c2231511CVp.addUnknownFields(unknownFields());
        return c2231511CVp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", leaver=");
        sb.append(this.leaver);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", current_group_channel_id=");
        sb.append(this.current_group_channel_id);
        sb.append(", leave_reason=");
        sb.append(this.leave_reason);
        sb.append(", finish_link_mic_reason=");
        sb.append(this.finish_link_mic_reason);
        sb.append(", biz_param=");
        sb.append(this.biz_param);
        sb.replace(0, 2, "LinkMicLeaveGroupParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231491CVn)) {
            return false;
        }
        C2231491CVn c2231491CVn = (C2231491CVn) obj;
        if (unknownFields().equals(c2231491CVn.unknownFields()) && this.invoke_id.equals(c2231491CVn.invoke_id) && this.leaver.equals(c2231491CVn.leaver) && this.group_channel_id.equals(c2231491CVn.group_channel_id) && this.current_group_channel_id.equals(c2231491CVn.current_group_channel_id) && this.leave_reason.equals(c2231491CVn.leave_reason) && this.finish_link_mic_reason.equals(c2231491CVn.finish_link_mic_reason) && this.biz_param.equals(c2231491CVn.biz_param)) {
            return true;
        }
        return false;
    }

    public C2231491CVn(String str, C2232021CXo c2232021CXo, Long l, Long l2, EnumC1282030jSz enumC1282030jSz, C1CW2 c1cw2, C2227631CGr c2227631CGr) {
        this(str, c2232021CXo, l, l2, enumC1282030jSz, c1cw2, c2227631CGr, ByteString.EMPTY);
    }

    public C2231491CVn(String str, C2232021CXo c2232021CXo, Long l, Long l2, EnumC1282030jSz enumC1282030jSz, C1CW2 c1cw2, C2227631CGr c2227631CGr, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.leaver = c2232021CXo;
        this.group_channel_id = l;
        this.current_group_channel_id = l2;
        this.leave_reason = enumC1282030jSz;
        this.finish_link_mic_reason = c1cw2;
        this.biz_param = c2227631CGr;
    }
}
