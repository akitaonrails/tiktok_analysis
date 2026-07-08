package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236031CfR extends Message<C2236031CfR, C2236051CfT> {
    public static final Boolean DEFAULT_CHECK_PERCEPTION_CENTER;
    public static final Boolean DEFAULT_NEED_WITHDRAW;
    public static final Long DEFAULT_TAG_TYPE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 6)
    public final String algo_request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean check_perception_center;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean need_withdraw;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long source_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCohostStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C1CNZ stream_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long tag_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String tag_value;
    public static final ProtoAdapter<C2236031CfR> ADAPTER = new ProtoAdapter<C2236031CfR>() { // from class: X.1CfS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236031CfR decode(ProtoReader protoReader) {
            C2236051CfT c2236051CfT = new C2236051CfT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2236051CfT.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2236051CfT.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2236051CfT.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2236051CfT.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2236051CfT.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2236051CfT.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2236051CfT.LJIIIZ = C1CNZ.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236051CfT.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236051CfT.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236031CfR c2236031CfR) {
            C2236031CfR c2236031CfR2 = c2236031CfR;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2236031CfR2.source_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2236031CfR2.check_perception_center) + protoAdapter.encodedSizeWithTag(3, c2236031CfR2.tag_type);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c2236031CfR2.tag_value) + protoAdapter2.encodedSizeWithTag(5, c2236031CfR2.need_withdraw) + protoAdapter3.encodedSizeWithTag(6, c2236031CfR2.algo_request_id) + C1CNZ.ADAPTER.encodedSizeWithTag(7, c2236031CfR2.stream_config) + c2236031CfR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236031CfR redact(C2236031CfR c2236031CfR) {
            C2236051CfT c2236051CfTNewBuilder = c2236031CfR.newBuilder();
            c2236051CfTNewBuilder.LJIIIZ = C1CNZ.ADAPTER.redact(c2236051CfTNewBuilder.LJIIIZ);
            c2236051CfTNewBuilder.clearUnknownFields();
            return c2236051CfTNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236031CfR c2236031CfR) {
            C2236031CfR c2236031CfR2 = c2236031CfR;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236031CfR2.source_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2236031CfR2.check_perception_center);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236031CfR2.tag_type);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, c2236031CfR2.tag_value);
            protoAdapter2.encodeWithTag(protoWriter, 5, c2236031CfR2.need_withdraw);
            protoAdapter3.encodeWithTag(protoWriter, 6, c2236031CfR2.algo_request_id);
            C1CNZ.ADAPTER.encodeWithTag(protoWriter, 7, c2236031CfR2.stream_config);
            protoWriter.writeBytes(c2236031CfR2.unknownFields());
        }
    };
    public static final Long DEFAULT_SOURCE_TYPE = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_CHECK_PERCEPTION_CENTER = bool;
        DEFAULT_TAG_TYPE = 0L;
        DEFAULT_NEED_WITHDRAW = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.source_type.hashCode()) * 37) + this.check_perception_center.hashCode()) * 37) + this.tag_type.hashCode()) * 37) + this.tag_value.hashCode()) * 37) + this.need_withdraw.hashCode()) * 37) + this.algo_request_id.hashCode()) * 37) + this.stream_config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236051CfT newBuilder() {
        C2236051CfT c2236051CfT = new C2236051CfT();
        c2236051CfT.LIZLLL = this.source_type;
        c2236051CfT.LJ = this.check_perception_center;
        c2236051CfT.LJFF = this.tag_type;
        c2236051CfT.LJI = this.tag_value;
        c2236051CfT.LJII = this.need_withdraw;
        c2236051CfT.LJIIIIZZ = this.algo_request_id;
        c2236051CfT.LJIIIZ = this.stream_config;
        c2236051CfT.addUnknownFields(unknownFields());
        return c2236051CfT;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", check_perception_center=");
        sb.append(this.check_perception_center);
        sb.append(", tag_type=");
        sb.append(this.tag_type);
        sb.append(", tag_value=");
        sb.append(this.tag_value);
        sb.append(", need_withdraw=");
        sb.append(this.need_withdraw);
        sb.append(", algo_request_id=");
        sb.append(this.algo_request_id);
        sb.append(", stream_config=");
        sb.append(this.stream_config);
        sb.replace(0, 2, "LinkMicBizJoinGroupParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236031CfR)) {
            return false;
        }
        C2236031CfR c2236031CfR = (C2236031CfR) obj;
        if (unknownFields().equals(c2236031CfR.unknownFields()) && this.source_type.equals(c2236031CfR.source_type) && this.check_perception_center.equals(c2236031CfR.check_perception_center) && this.tag_type.equals(c2236031CfR.tag_type) && this.tag_value.equals(c2236031CfR.tag_value) && this.need_withdraw.equals(c2236031CfR.need_withdraw) && this.algo_request_id.equals(c2236031CfR.algo_request_id) && this.stream_config.equals(c2236031CfR.stream_config)) {
            return true;
        }
        return false;
    }

    public C2236031CfR(Long l, Boolean bool, Long l2, String str, Boolean bool2, String str2, C1CNZ c1cnz) {
        this(l, bool, l2, str, bool2, str2, c1cnz, ByteString.EMPTY);
    }

    public C2236031CfR(Long l, Boolean bool, Long l2, String str, Boolean bool2, String str2, C1CNZ c1cnz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = l;
        this.check_perception_center = bool;
        this.tag_type = l2;
        this.tag_value = str;
        this.need_withdraw = bool2;
        this.algo_request_id = str2;
        this.stream_config = c1cnz;
    }
}
