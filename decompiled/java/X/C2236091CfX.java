package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236091CfX extends Message<C2236091CfX, C2236111CfZ> {
    public static final ProtoAdapter<C2236091CfX> ADAPTER = new ProtoAdapter<C2236091CfX>() { // from class: X.1CfY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236091CfX decode(ProtoReader protoReader) {
            C2236111CfZ c2236111CfZ = new C2236111CfZ();
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
                                        c2236111CfZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2236111CfZ.LJII = C2227601CGo.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2236111CfZ.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2236111CfZ.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2236111CfZ.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236111CfZ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236111CfZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236091CfX c2236091CfX) {
            C2236091CfX c2236091CfX2 = c2236091CfX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2236091CfX2.invoke_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2236091CfX2.max_position) + protoAdapter.encodedSizeWithTag(3, c2236091CfX2.layout_id) + protoAdapter2.encodedSizeWithTag(4, c2236091CfX2.scene_version) + C2227601CGo.ADAPTER.encodedSizeWithTag(5, c2236091CfX2.biz_params) + c2236091CfX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236091CfX redact(C2236091CfX c2236091CfX) {
            C2236111CfZ c2236111CfZNewBuilder = c2236091CfX.newBuilder();
            c2236111CfZNewBuilder.LJII = C2227601CGo.ADAPTER.redact(c2236111CfZNewBuilder.LJII);
            c2236111CfZNewBuilder.clearUnknownFields();
            return c2236111CfZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236091CfX c2236091CfX) {
            C2236091CfX c2236091CfX2 = c2236091CfX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236091CfX2.invoke_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2236091CfX2.max_position);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236091CfX2.layout_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2236091CfX2.scene_version);
            C2227601CGo.ADAPTER.encodeWithTag(protoWriter, 5, c2236091CfX2.biz_params);
            protoWriter.writeBytes(c2236091CfX2.unknownFields());
        }
    };
    public static final Long DEFAULT_MAX_POSITION = 0L;
    public static final Long DEFAULT_SCENE_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizChangeLayoutParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C2227601CGo biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long max_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long scene_version;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.max_position.hashCode()) * 37) + this.layout_id.hashCode()) * 37) + this.scene_version.hashCode()) * 37) + this.biz_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236111CfZ newBuilder() {
        C2236111CfZ c2236111CfZ = new C2236111CfZ();
        c2236111CfZ.LIZLLL = this.invoke_id;
        c2236111CfZ.LJ = this.max_position;
        c2236111CfZ.LJFF = this.layout_id;
        c2236111CfZ.LJI = this.scene_version;
        c2236111CfZ.LJII = this.biz_params;
        c2236111CfZ.addUnknownFields(unknownFields());
        return c2236111CfZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", max_position=");
        sb.append(this.max_position);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        sb.append(", scene_version=");
        sb.append(this.scene_version);
        sb.append(", biz_params=");
        sb.append(this.biz_params);
        sb.replace(0, 2, "LinkMicChangeLayoutParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236091CfX)) {
            return false;
        }
        C2236091CfX c2236091CfX = (C2236091CfX) obj;
        if (unknownFields().equals(c2236091CfX.unknownFields()) && this.invoke_id.equals(c2236091CfX.invoke_id) && this.max_position.equals(c2236091CfX.max_position) && this.layout_id.equals(c2236091CfX.layout_id) && this.scene_version.equals(c2236091CfX.scene_version) && this.biz_params.equals(c2236091CfX.biz_params)) {
            return true;
        }
        return false;
    }

    public C2236091CfX(String str, Long l, String str2, Long l2, C2227601CGo c2227601CGo) {
        this(str, l, str2, l2, c2227601CGo, ByteString.EMPTY);
    }

    public C2236091CfX(String str, Long l, String str2, Long l2, C2227601CGo c2227601CGo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.max_position = l;
        this.layout_id = str2;
        this.scene_version = l2;
        this.biz_params = c2227601CGo;
    }
}
