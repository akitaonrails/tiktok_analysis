package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236001CfO extends Message<C2236001CfO, C2236021CfQ> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String algo_request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long matched_preference_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long reply_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long source_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCohostStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CNZ stream_config;
    public static final ProtoAdapter<C2236001CfO> ADAPTER = new ProtoAdapter<C2236001CfO>() { // from class: X.1CfP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236001CfO decode(ProtoReader protoReader) {
            C2236021CfQ c2236021CfQ = new C2236021CfQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2236021CfQ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2236021CfQ.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2236021CfQ.LJI = C1CNZ.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2236021CfQ.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2236021CfQ.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236021CfQ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236021CfQ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236001CfO c2236001CfO) {
            C2236001CfO c2236001CfO2 = c2236001CfO;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2236001CfO2.reply_status) + protoAdapter.encodedSizeWithTag(2, c2236001CfO2.source_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2236001CfO2.algo_request_id) + C1CNZ.ADAPTER.encodedSizeWithTag(4, c2236001CfO2.stream_config) + protoAdapter.encodedSizeWithTag(5, c2236001CfO2.matched_preference_tag) + c2236001CfO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236001CfO redact(C2236001CfO c2236001CfO) {
            C2236021CfQ c2236021CfQNewBuilder = c2236001CfO.newBuilder();
            c2236021CfQNewBuilder.LJI = C1CNZ.ADAPTER.redact(c2236021CfQNewBuilder.LJI);
            c2236021CfQNewBuilder.clearUnknownFields();
            return c2236021CfQNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236001CfO c2236001CfO) {
            C2236001CfO c2236001CfO2 = c2236001CfO;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236001CfO2.reply_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c2236001CfO2.source_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2236001CfO2.algo_request_id);
            C1CNZ.ADAPTER.encodeWithTag(protoWriter, 4, c2236001CfO2.stream_config);
            protoAdapter.encodeWithTag(protoWriter, 5, c2236001CfO2.matched_preference_tag);
            protoWriter.writeBytes(c2236001CfO2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPLY_STATUS = 0L;
    public static final Long DEFAULT_SOURCE_TYPE = 0L;
    public static final Long DEFAULT_MATCHED_PREFERENCE_TAG = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.reply_status.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.algo_request_id.hashCode()) * 37) + this.stream_config.hashCode()) * 37) + this.matched_preference_tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236021CfQ newBuilder() {
        C2236021CfQ c2236021CfQ = new C2236021CfQ();
        c2236021CfQ.LIZLLL = this.reply_status;
        c2236021CfQ.LJ = this.source_type;
        c2236021CfQ.LJFF = this.algo_request_id;
        c2236021CfQ.LJI = this.stream_config;
        c2236021CfQ.LJII = this.matched_preference_tag;
        c2236021CfQ.addUnknownFields(unknownFields());
        return c2236021CfQ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", reply_status=");
        sb.append(this.reply_status);
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", algo_request_id=");
        sb.append(this.algo_request_id);
        sb.append(", stream_config=");
        sb.append(this.stream_config);
        sb.append(", matched_preference_tag=");
        sb.append(this.matched_preference_tag);
        sb.replace(0, 2, "LinkMicBizPermitJoinGroupParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236001CfO)) {
            return false;
        }
        C2236001CfO c2236001CfO = (C2236001CfO) obj;
        if (unknownFields().equals(c2236001CfO.unknownFields()) && this.reply_status.equals(c2236001CfO.reply_status) && this.source_type.equals(c2236001CfO.source_type) && this.algo_request_id.equals(c2236001CfO.algo_request_id) && this.stream_config.equals(c2236001CfO.stream_config) && this.matched_preference_tag.equals(c2236001CfO.matched_preference_tag)) {
            return true;
        }
        return false;
    }

    public C2236001CfO(Long l, Long l2, String str, C1CNZ c1cnz, Long l3) {
        this(l, l2, str, c1cnz, l3, ByteString.EMPTY);
    }

    public C2236001CfO(Long l, Long l2, String str, C1CNZ c1cnz, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reply_status = l;
        this.source_type = l2;
        this.algo_request_id = str;
        this.stream_config = c1cnz;
        this.matched_preference_tag = l3;
    }
}
