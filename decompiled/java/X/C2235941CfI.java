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

/* JADX INFO: renamed from: X.1CfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235941CfI extends Message<C2235941CfI, C2235961CfK> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizPermitJoinGroupParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C2236001CfO biz_param;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<C1C4J> content_info_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean force;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo joiner;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAgreeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2231981CXk reply_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 7)
    public final String source;
    public static final ProtoAdapter<C2235941CfI> ADAPTER = new ProtoAdapter<C2235941CfI>() { // from class: X.1CfJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235941CfI decode(ProtoReader protoReader) {
            C2235961CfK c2235961CfK = new C2235961CfK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2235961CfK.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2235961CfK.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c2235961CfK.LJFF = EnumC2231981CXk.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2235961CfK.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            c2235961CfK.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2235961CfK.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2235961CfK.LJIIIIZZ = C2236001CfO.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2235961CfK.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2235961CfK.LJIIJ.add(C1C4J.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235961CfK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235961CfK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235941CfI c2235941CfI) {
            C2235941CfI c2235941CfI2 = c2235941CfI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2235941CfI2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2235941CfI2.joiner) + EnumC2231981CXk.ADAPTER.encodedSizeWithTag(3, c2235941CfI2.reply_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, c2235941CfI2.group_channel_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c2235941CfI2.force) + C2236001CfO.ADAPTER.encodedSizeWithTag(6, c2235941CfI2.biz_param) + protoAdapter.encodedSizeWithTag(7, c2235941CfI2.source) + C1C4J.ADAPTER.asRepeated().encodedSizeWithTag(8, c2235941CfI2.content_info_list) + c2235941CfI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235941CfI redact(C2235941CfI c2235941CfI) {
            C2235961CfK c2235961CfKNewBuilder = c2235941CfI.newBuilder();
            c2235961CfKNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2235961CfKNewBuilder.LJ);
            c2235961CfKNewBuilder.LJIIIIZZ = C2236001CfO.ADAPTER.redact(c2235961CfKNewBuilder.LJIIIIZZ);
            C1516540pZE.LJIIIZ(c2235961CfKNewBuilder.LJIIJ, C1C4J.ADAPTER);
            c2235961CfKNewBuilder.clearUnknownFields();
            return c2235961CfKNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235941CfI c2235941CfI) {
            C2235941CfI c2235941CfI2 = c2235941CfI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2235941CfI2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2235941CfI2.joiner);
            EnumC2231981CXk.ADAPTER.encodeWithTag(protoWriter, 3, c2235941CfI2.reply_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c2235941CfI2.group_channel_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c2235941CfI2.force);
            C2236001CfO.ADAPTER.encodeWithTag(protoWriter, 6, c2235941CfI2.biz_param);
            protoAdapter.encodeWithTag(protoWriter, 7, c2235941CfI2.source);
            C1C4J.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c2235941CfI2.content_info_list);
            protoWriter.writeBytes(c2235941CfI2.unknownFields());
        }
    };
    public static final EnumC2231981CXk DEFAULT_REPLY_TYPE = EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final Boolean DEFAULT_FORCE = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.joiner.hashCode()) * 37) + this.reply_type.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.force.hashCode()) * 37) + this.biz_param.hashCode()) * 37) + this.source.hashCode()) * 37) + this.content_info_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235961CfK newBuilder() {
        C2235961CfK c2235961CfK = new C2235961CfK();
        c2235961CfK.LIZLLL = this.invoke_id;
        c2235961CfK.LJ = this.joiner;
        c2235961CfK.LJFF = this.reply_type;
        c2235961CfK.LJI = this.group_channel_id;
        c2235961CfK.LJII = this.force;
        c2235961CfK.LJIIIIZZ = this.biz_param;
        c2235961CfK.LJIIIZ = this.source;
        c2235961CfK.LJIIJ = C1516540pZE.LIZJ("content_info_list", this.content_info_list);
        c2235961CfK.addUnknownFields(unknownFields());
        return c2235961CfK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", joiner=");
        sb.append(this.joiner);
        sb.append(", reply_type=");
        sb.append(this.reply_type);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", force=");
        sb.append(this.force);
        sb.append(", biz_param=");
        sb.append(this.biz_param);
        sb.append(", source=");
        sb.append(this.source);
        if (!this.content_info_list.isEmpty()) {
            sb.append(", content_info_list=");
            sb.append(this.content_info_list);
        }
        sb.replace(0, 2, "LinkMicPermitGroupParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235941CfI)) {
            return false;
        }
        C2235941CfI c2235941CfI = (C2235941CfI) obj;
        if (unknownFields().equals(c2235941CfI.unknownFields()) && this.invoke_id.equals(c2235941CfI.invoke_id) && this.joiner.equals(c2235941CfI.joiner) && this.reply_type.equals(c2235941CfI.reply_type) && this.group_channel_id.equals(c2235941CfI.group_channel_id) && this.force.equals(c2235941CfI.force) && this.biz_param.equals(c2235941CfI.biz_param) && this.source.equals(c2235941CfI.source) && this.content_info_list.equals(c2235941CfI.content_info_list)) {
            return true;
        }
        return false;
    }

    public C2235941CfI(String str, C2232021CXo c2232021CXo, EnumC2231981CXk enumC2231981CXk, Long l, Boolean bool, C2236001CfO c2236001CfO, String str2, List<C1C4J> list) {
        this(str, c2232021CXo, enumC2231981CXk, l, bool, c2236001CfO, str2, list, ByteString.EMPTY);
    }

    public C2235941CfI(String str, C2232021CXo c2232021CXo, EnumC2231981CXk enumC2231981CXk, Long l, Boolean bool, C2236001CfO c2236001CfO, String str2, List<C1C4J> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.joiner = c2232021CXo;
        this.reply_type = enumC2231981CXk;
        this.group_channel_id = l;
        this.force = bool;
        this.biz_param = c2236001CfO;
        this.source = str2;
        this.content_info_list = C1516540pZE.LJFF("content_info_list", list);
    }
}
