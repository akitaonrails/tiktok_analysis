package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231691CWh extends Message<C2231691CWh, C1CX2> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImApplyGroupModel#ADAPTER", tag = 5)
    public final C2227291CFj apply_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicDroppedImType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXQ im_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImInviteGroupModel#ADAPTER", tag = 3)
    public final C2227321CFm invite_group_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long msg_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImPermitGroupModel#ADAPTER", tag = 6)
    public final C2232931CaR permit_group_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 7)
    public final Double receive_timestamp;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImReplyGroupModel#ADAPTER", tag = 4)
    public final C2232921CaQ reply_group_model;
    public static final ProtoAdapter<C2231691CWh> ADAPTER = new ProtoAdapter<C2231691CWh>() { // from class: X.1CWi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231691CWh decode(ProtoReader protoReader) {
            C1CX2 c1cx2 = new C1CX2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cx2.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c1cx2.LJ = C1CXQ.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cx2.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            c1cx2.LJFF = C2227321CFm.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1cx2.LJI = C2232921CaQ.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1cx2.LJII = C2227291CFj.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1cx2.LJIIIIZZ = C2232931CaR.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1cx2.LJIIIZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cx2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cx2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231691CWh c2231691CWh) {
            C2231691CWh c2231691CWh2 = c2231691CWh;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2231691CWh2.msg_id) + C1CXQ.ADAPTER.encodedSizeWithTag(2, c2231691CWh2.im_type) + C2227321CFm.ADAPTER.encodedSizeWithTag(3, c2231691CWh2.invite_group_model) + C2232921CaQ.ADAPTER.encodedSizeWithTag(4, c2231691CWh2.reply_group_model) + C2227291CFj.ADAPTER.encodedSizeWithTag(5, c2231691CWh2.apply_group_model) + C2232931CaR.ADAPTER.encodedSizeWithTag(6, c2231691CWh2.permit_group_model) + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, c2231691CWh2.receive_timestamp) + c2231691CWh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231691CWh redact(C2231691CWh c2231691CWh) {
            C1CX2 c1cx2NewBuilder = c2231691CWh.newBuilder();
            C2227321CFm c2227321CFm = c1cx2NewBuilder.LJFF;
            if (c2227321CFm != null) {
                c1cx2NewBuilder.LJFF = C2227321CFm.ADAPTER.redact(c2227321CFm);
            }
            C2232921CaQ c2232921CaQ = c1cx2NewBuilder.LJI;
            if (c2232921CaQ != null) {
                c1cx2NewBuilder.LJI = C2232921CaQ.ADAPTER.redact(c2232921CaQ);
            }
            C2227291CFj c2227291CFj = c1cx2NewBuilder.LJII;
            if (c2227291CFj != null) {
                c1cx2NewBuilder.LJII = C2227291CFj.ADAPTER.redact(c2227291CFj);
            }
            C2232931CaR c2232931CaR = c1cx2NewBuilder.LJIIIIZZ;
            if (c2232931CaR != null) {
                c1cx2NewBuilder.LJIIIIZZ = C2232931CaR.ADAPTER.redact(c2232931CaR);
            }
            c1cx2NewBuilder.clearUnknownFields();
            return c1cx2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231691CWh c2231691CWh) {
            C2231691CWh c2231691CWh2 = c2231691CWh;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2231691CWh2.msg_id);
            C1CXQ.ADAPTER.encodeWithTag(protoWriter, 2, c2231691CWh2.im_type);
            C2227321CFm.ADAPTER.encodeWithTag(protoWriter, 3, c2231691CWh2.invite_group_model);
            C2232921CaQ.ADAPTER.encodeWithTag(protoWriter, 4, c2231691CWh2.reply_group_model);
            C2227291CFj.ADAPTER.encodeWithTag(protoWriter, 5, c2231691CWh2.apply_group_model);
            C2232931CaR.ADAPTER.encodeWithTag(protoWriter, 6, c2231691CWh2.permit_group_model);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, c2231691CWh2.receive_timestamp);
            protoWriter.writeBytes(c2231691CWh2.unknownFields());
        }
    };
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final C1CXQ DEFAULT_IM_TYPE = C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_UNKNOWN;
    public static final Double DEFAULT_RECEIVE_TIMESTAMP = Double.valueOf(0.0d);

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.msg_id.hashCode()) * 37) + this.im_type.hashCode()) * 37;
        C2227321CFm c2227321CFm = this.invite_group_model;
        int iHashCode2 = (iHashCode + (c2227321CFm != null ? c2227321CFm.hashCode() : 0)) * 37;
        C2232921CaQ c2232921CaQ = this.reply_group_model;
        int iHashCode3 = (iHashCode2 + (c2232921CaQ != null ? c2232921CaQ.hashCode() : 0)) * 37;
        C2227291CFj c2227291CFj = this.apply_group_model;
        int iHashCode4 = (iHashCode3 + (c2227291CFj != null ? c2227291CFj.hashCode() : 0)) * 37;
        C2232931CaR c2232931CaR = this.permit_group_model;
        int iHashCode5 = ((iHashCode4 + (c2232931CaR != null ? c2232931CaR.hashCode() : 0)) * 37) + this.receive_timestamp.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1CX2 newBuilder() {
        C1CX2 c1cx2 = new C1CX2();
        c1cx2.LIZLLL = this.msg_id;
        c1cx2.LJ = this.im_type;
        c1cx2.LJFF = this.invite_group_model;
        c1cx2.LJI = this.reply_group_model;
        c1cx2.LJII = this.apply_group_model;
        c1cx2.LJIIIIZZ = this.permit_group_model;
        c1cx2.LJIIIZ = this.receive_timestamp;
        c1cx2.addUnknownFields(unknownFields());
        return c1cx2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_id=");
        sb.append(this.msg_id);
        sb.append(", im_type=");
        sb.append(this.im_type);
        if (this.invite_group_model != null) {
            sb.append(", invite_group_model=");
            sb.append(this.invite_group_model);
        }
        if (this.reply_group_model != null) {
            sb.append(", reply_group_model=");
            sb.append(this.reply_group_model);
        }
        if (this.apply_group_model != null) {
            sb.append(", apply_group_model=");
            sb.append(this.apply_group_model);
        }
        if (this.permit_group_model != null) {
            sb.append(", permit_group_model=");
            sb.append(this.permit_group_model);
        }
        sb.append(", receive_timestamp=");
        sb.append(this.receive_timestamp);
        sb.replace(0, 2, "LinkMicDroppedImModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231691CWh)) {
            return false;
        }
        C2231691CWh c2231691CWh = (C2231691CWh) obj;
        if (unknownFields().equals(c2231691CWh.unknownFields()) && this.msg_id.equals(c2231691CWh.msg_id) && this.im_type.equals(c2231691CWh.im_type) && C1516540pZE.LJ(this.invite_group_model, c2231691CWh.invite_group_model) && C1516540pZE.LJ(this.reply_group_model, c2231691CWh.reply_group_model) && C1516540pZE.LJ(this.apply_group_model, c2231691CWh.apply_group_model) && C1516540pZE.LJ(this.permit_group_model, c2231691CWh.permit_group_model) && this.receive_timestamp.equals(c2231691CWh.receive_timestamp)) {
            return true;
        }
        return false;
    }

    public C2231691CWh(Long l, C1CXQ c1cxq, C2227321CFm c2227321CFm, C2232921CaQ c2232921CaQ, C2227291CFj c2227291CFj, C2232931CaR c2232931CaR, Double d) {
        this(l, c1cxq, c2227321CFm, c2232921CaQ, c2227291CFj, c2232931CaR, d, ByteString.EMPTY);
    }

    public C2231691CWh(Long l, C1CXQ c1cxq, C2227321CFm c2227321CFm, C2232921CaQ c2232921CaQ, C2227291CFj c2227291CFj, C2232931CaR c2232931CaR, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_id = l;
        this.im_type = c1cxq;
        this.invite_group_model = c2227321CFm;
        this.reply_group_model = c2232921CaQ;
        this.apply_group_model = c2227291CFj;
        this.permit_group_model = c2232931CaR;
        this.receive_timestamp = d;
    }
}
