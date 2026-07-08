package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235791Cf3 extends Message<C2235791Cf3, C2235811Cf5> {
    public static final ProtoAdapter<C2235791Cf3> ADAPTER = new ProtoAdapter<C2235791Cf3>() { // from class: X.1Cf4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235791Cf3 decode(ProtoReader protoReader) {
            C2235811Cf5 c2235811Cf5 = new C2235811Cf5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2235811Cf5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2235811Cf5.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2235811Cf5.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2235811Cf5.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235811Cf5.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235811Cf5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235791Cf3 c2235791Cf3) {
            C2235791Cf3 c2235791Cf32 = c2235791Cf3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2235791Cf32.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2235791Cf32.target) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2235791Cf32.group_channel_id) + protoAdapter.encodedSizeWithTag(4, c2235791Cf32.source) + c2235791Cf32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235791Cf3 redact(C2235791Cf3 c2235791Cf3) {
            C2235811Cf5 c2235811Cf5NewBuilder = c2235791Cf3.newBuilder();
            c2235811Cf5NewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2235811Cf5NewBuilder.LJ);
            c2235811Cf5NewBuilder.clearUnknownFields();
            return c2235811Cf5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235791Cf3 c2235791Cf3) {
            C2235791Cf3 c2235791Cf32 = c2235791Cf3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2235791Cf32.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2235791Cf32.target);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2235791Cf32.group_channel_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c2235791Cf32.source);
            protoWriter.writeBytes(c2235791Cf32.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo target;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.target.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235811Cf5 newBuilder() {
        C2235811Cf5 c2235811Cf5 = new C2235811Cf5();
        c2235811Cf5.LIZLLL = this.invoke_id;
        c2235811Cf5.LJ = this.target;
        c2235811Cf5.LJFF = this.group_channel_id;
        c2235811Cf5.LJI = this.source;
        c2235811Cf5.addUnknownFields(unknownFields());
        return c2235811Cf5;
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
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "LinkMicCancelJoinGroupParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235791Cf3)) {
            return false;
        }
        C2235791Cf3 c2235791Cf3 = (C2235791Cf3) obj;
        if (unknownFields().equals(c2235791Cf3.unknownFields()) && this.invoke_id.equals(c2235791Cf3.invoke_id) && this.target.equals(c2235791Cf3.target) && this.group_channel_id.equals(c2235791Cf3.group_channel_id) && this.source.equals(c2235791Cf3.source)) {
            return true;
        }
        return false;
    }

    public C2235791Cf3(String str, C2232021CXo c2232021CXo, Long l, String str2) {
        this(str, c2232021CXo, l, str2, ByteString.EMPTY);
    }

    public C2235791Cf3(String str, C2232021CXo c2232021CXo, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.target = c2232021CXo;
        this.group_channel_id = l;
        this.source = str2;
    }
}
