package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235911CfF extends Message<C2235911CfF, C2235931CfH> {
    public static final ProtoAdapter<C2235911CfF> ADAPTER = new ProtoAdapter<C2235911CfF>() { // from class: X.1CfG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235911CfF decode(ProtoReader protoReader) {
            C2235931CfH c2235931CfH = new C2235931CfH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2235931CfH.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2235931CfH.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2235931CfH.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2235931CfH.LJI = C2236031CfR.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2235931CfH.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2235931CfH.LJIIIIZZ.add(C1C4J.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235931CfH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235931CfH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235911CfF c2235911CfF) {
            C2235911CfF c2235911CfF2 = c2235911CfF;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2235911CfF2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2235911CfF2.target) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2235911CfF2.group_channel_id) + C2236031CfR.ADAPTER.encodedSizeWithTag(4, c2235911CfF2.biz_param) + protoAdapter.encodedSizeWithTag(5, c2235911CfF2.source) + C1C4J.ADAPTER.asRepeated().encodedSizeWithTag(6, c2235911CfF2.content_info_list) + c2235911CfF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235911CfF redact(C2235911CfF c2235911CfF) {
            C2235931CfH c2235931CfHNewBuilder = c2235911CfF.newBuilder();
            c2235931CfHNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2235931CfHNewBuilder.LJ);
            c2235931CfHNewBuilder.LJI = C2236031CfR.ADAPTER.redact(c2235931CfHNewBuilder.LJI);
            C1516540pZE.LJIIIZ(c2235931CfHNewBuilder.LJIIIIZZ, C1C4J.ADAPTER);
            c2235931CfHNewBuilder.clearUnknownFields();
            return c2235931CfHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235911CfF c2235911CfF) {
            C2235911CfF c2235911CfF2 = c2235911CfF;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2235911CfF2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2235911CfF2.target);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2235911CfF2.group_channel_id);
            C2236031CfR.ADAPTER.encodeWithTag(protoWriter, 4, c2235911CfF2.biz_param);
            protoAdapter.encodeWithTag(protoWriter, 5, c2235911CfF2.source);
            C1C4J.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c2235911CfF2.content_info_list);
            protoWriter.writeBytes(c2235911CfF2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizJoinGroupParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2236031CfR biz_param;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<C1C4J> content_info_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo target;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.target.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.biz_param.hashCode()) * 37) + this.source.hashCode()) * 37) + this.content_info_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235931CfH newBuilder() {
        C2235931CfH c2235931CfH = new C2235931CfH();
        c2235931CfH.LIZLLL = this.invoke_id;
        c2235931CfH.LJ = this.target;
        c2235931CfH.LJFF = this.group_channel_id;
        c2235931CfH.LJI = this.biz_param;
        c2235931CfH.LJII = this.source;
        c2235931CfH.LJIIIIZZ = C1516540pZE.LIZJ("content_info_list", this.content_info_list);
        c2235931CfH.addUnknownFields(unknownFields());
        return c2235931CfH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", biz_param=");
        sb.append(this.biz_param);
        sb.append(", source=");
        sb.append(this.source);
        if (!this.content_info_list.isEmpty()) {
            sb.append(", content_info_list=");
            sb.append(this.content_info_list);
        }
        sb.replace(0, 2, "LinkMicJoinGroupParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235911CfF)) {
            return false;
        }
        C2235911CfF c2235911CfF = (C2235911CfF) obj;
        if (unknownFields().equals(c2235911CfF.unknownFields()) && this.invoke_id.equals(c2235911CfF.invoke_id) && this.target.equals(c2235911CfF.target) && this.group_channel_id.equals(c2235911CfF.group_channel_id) && this.biz_param.equals(c2235911CfF.biz_param) && this.source.equals(c2235911CfF.source) && this.content_info_list.equals(c2235911CfF.content_info_list)) {
            return true;
        }
        return false;
    }

    public C2235911CfF(String str, C2232021CXo c2232021CXo, Long l, C2236031CfR c2236031CfR, String str2, List<C1C4J> list) {
        this(str, c2232021CXo, l, c2236031CfR, str2, list, ByteString.EMPTY);
    }

    public C2235911CfF(String str, C2232021CXo c2232021CXo, Long l, C2236031CfR c2236031CfR, String str2, List<C1C4J> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.target = c2232021CXo;
        this.group_channel_id = l;
        this.biz_param = c2236031CfR;
        this.source = str2;
        this.content_info_list = C1516540pZE.LJFF("content_info_list", list);
    }
}
