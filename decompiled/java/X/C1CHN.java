package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHN extends Message<C1CHN, C1CHP> {
    public static final ProtoAdapter<C1CHN> ADAPTER = new ProtoAdapter<C1CHN>() { // from class: X.1CHO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHN decode(ProtoReader protoReader) {
            C1CHP c1chp = new C1CHP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1chp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1chp.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1chp.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1chp.LIZLLL.add(C2232021CXo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHN c1chn) {
            C1CHN c1chn2 = c1chn;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c1chn2.leavers) + protoAdapter.encodedSizeWithTag(2, c1chn2.operator_user) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1chn2.group_channel_id) + c1chn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHN redact(C1CHN c1chn) {
            C1CHP c1chpNewBuilder = c1chn.newBuilder();
            List<C2232021CXo> list = c1chpNewBuilder.LIZLLL;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            C1516540pZE.LJIIIZ(list, protoAdapter);
            c1chpNewBuilder.LJ = protoAdapter.redact(c1chpNewBuilder.LJ);
            c1chpNewBuilder.clearUnknownFields();
            return c1chpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHN c1chn) {
            C1CHN c1chn2 = c1chn;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c1chn2.leavers);
            protoAdapter.encodeWithTag(protoWriter, 2, c1chn2.operator_user);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1chn2.group_channel_id);
            protoWriter.writeBytes(c1chn2.unknownFields());
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
    public C1CHP newBuilder() {
        C1CHP c1chp = new C1CHP();
        c1chp.LIZLLL = C1516540pZE.LIZJ("leavers", this.leavers);
        c1chp.LJ = this.operator_user;
        c1chp.LJFF = this.group_channel_id;
        c1chp.addUnknownFields(unknownFields());
        return c1chp;
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
        sb.replace(0, 2, "LinkMicImCancelApplyGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHN)) {
            return false;
        }
        C1CHN c1chn = (C1CHN) obj;
        if (unknownFields().equals(c1chn.unknownFields()) && this.leavers.equals(c1chn.leavers) && this.operator_user.equals(c1chn.operator_user) && this.group_channel_id.equals(c1chn.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C1CHN(List<C2232021CXo> list, C2232021CXo c2232021CXo, Long l) {
        this(list, c2232021CXo, l, ByteString.EMPTY);
    }

    public C1CHN(List<C2232021CXo> list, C2232021CXo c2232021CXo, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.leavers = C1516540pZE.LJFF("leavers", list);
        this.operator_user = c2232021CXo;
        this.group_channel_id = l;
    }
}
