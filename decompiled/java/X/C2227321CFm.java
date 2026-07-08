package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227321CFm extends Message<C2227321CFm, C2227341CFo> {
    public static final ProtoAdapter<C2227321CFm> ADAPTER = new ProtoAdapter<C2227321CFm>() { // from class: X.1CFn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227321CFm decode(ProtoReader protoReader) {
            C2227341CFo c2227341CFo = new C2227341CFo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227341CFo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227341CFo.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227341CFo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227341CFo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227321CFm c2227321CFm) {
            C2227321CFm c2227321CFm2 = c2227321CFm;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227321CFm2.group_channel_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2227321CFm2.joiner) + c2227321CFm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227321CFm redact(C2227321CFm c2227321CFm) {
            C2227341CFo c2227341CFoNewBuilder = c2227321CFm.newBuilder();
            c2227341CFoNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2227341CFoNewBuilder.LJ);
            c2227341CFoNewBuilder.clearUnknownFields();
            return c2227341CFoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227321CFm c2227321CFm) {
            C2227321CFm c2227321CFm2 = c2227321CFm;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227321CFm2.group_channel_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2227321CFm2.joiner);
            protoWriter.writeBytes(c2227321CFm2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long group_channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo joiner;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.group_channel_id.hashCode()) * 37) + this.joiner.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227341CFo newBuilder() {
        C2227341CFo c2227341CFo = new C2227341CFo();
        c2227341CFo.LIZLLL = this.group_channel_id;
        c2227341CFo.LJ = this.joiner;
        c2227341CFo.addUnknownFields(unknownFields());
        return c2227341CFo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", joiner=");
        sb.append(this.joiner);
        sb.replace(0, 2, "LinkMicImInviteGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227321CFm)) {
            return false;
        }
        C2227321CFm c2227321CFm = (C2227321CFm) obj;
        if (unknownFields().equals(c2227321CFm.unknownFields()) && this.group_channel_id.equals(c2227321CFm.group_channel_id) && this.joiner.equals(c2227321CFm.joiner)) {
            return true;
        }
        return false;
    }

    public C2227321CFm(Long l, C2232021CXo c2232021CXo) {
        this(l, c2232021CXo, ByteString.EMPTY);
    }

    public C2227321CFm(Long l, C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_channel_id = l;
        this.joiner = c2232021CXo;
    }
}
