package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHQ extends Message<C1CHQ, C1CHS> {
    public static final ProtoAdapter<C1CHQ> ADAPTER = new ProtoAdapter<C1CHQ>() { // from class: X.1CHR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHQ decode(ProtoReader protoReader) {
            C1CHS c1chs = new C1CHS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1chs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1chs.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1chs.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1chs.LIZLLL.add(C2232021CXo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHQ c1chq) {
            C1CHQ c1chq2 = c1chq;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c1chq2.leavers) + protoAdapter.encodedSizeWithTag(2, c1chq2.operator_user) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1chq2.group_channel_id) + c1chq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHQ redact(C1CHQ c1chq) {
            C1CHS c1chsNewBuilder = c1chq.newBuilder();
            List<C2232021CXo> list = c1chsNewBuilder.LIZLLL;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            C1516540pZE.LJIIIZ(list, protoAdapter);
            c1chsNewBuilder.LJ = protoAdapter.redact(c1chsNewBuilder.LJ);
            c1chsNewBuilder.clearUnknownFields();
            return c1chsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHQ c1chq) {
            C1CHQ c1chq2 = c1chq;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c1chq2.leavers);
            protoAdapter.encodeWithTag(protoWriter, 2, c1chq2.operator_user);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1chq2.group_channel_id);
            protoWriter.writeBytes(c1chq2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long group_channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2232021CXo> leavers;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo operator_user;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.leavers.hashCode()) * 37) + this.operator_user.hashCode()) * 37) + this.group_channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CHS newBuilder() {
        C1CHS c1chs = new C1CHS();
        c1chs.LIZLLL = C1516540pZE.LIZJ("leavers", this.leavers);
        c1chs.LJ = this.operator_user;
        c1chs.LJFF = this.group_channel_id;
        c1chs.addUnknownFields(unknownFields());
        return c1chs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.leavers.isEmpty()) {
            sb.append(", leavers=");
            sb.append(this.leavers);
        }
        sb.append(", operator_user=");
        sb.append(this.operator_user);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.replace(0, 2, "LinkMicImCancelInviteGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHQ)) {
            return false;
        }
        C1CHQ c1chq = (C1CHQ) obj;
        if (unknownFields().equals(c1chq.unknownFields()) && this.leavers.equals(c1chq.leavers) && this.operator_user.equals(c1chq.operator_user) && this.group_channel_id.equals(c1chq.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C1CHQ(List<C2232021CXo> list, C2232021CXo c2232021CXo, Long l) {
        this(list, c2232021CXo, l, ByteString.EMPTY);
    }

    public C1CHQ(List<C2232021CXo> list, C2232021CXo c2232021CXo, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.leavers = C1516540pZE.LJFF("leavers", list);
        this.operator_user = c2232021CXo;
        this.group_channel_id = l;
    }
}
