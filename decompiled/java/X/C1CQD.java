package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQD extends Message<C1CQD, C1CQG> {
    public static final ProtoAdapter<C1CQD> ADAPTER = new ProtoAdapter<C1CQD>() { // from class: X.1CQE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQD decode(ProtoReader protoReader) {
            C1CQG c1cqg = new C1CQG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cqg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1cqg.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1cqg.LJFF = C1CQI.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cqg.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cqg.LIZLLL = C2229141CMm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQD c1cqd) {
            C1CQD c1cqd2 = c1cqd;
            int iEncodedSizeWithTag = C2229141CMm.ADAPTER.encodedSizeWithTag(1, c1cqd2.error);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cqd2.new_branch_id) + C1CQI.ADAPTER.encodedSizeWithTag(3, c1cqd2.new_root_flow) + protoAdapter.encodedSizeWithTag(4, c1cqd2.new_state_id) + c1cqd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQD redact(C1CQD c1cqd) {
            C1CQG c1cqgNewBuilder = c1cqd.newBuilder();
            c1cqgNewBuilder.LIZLLL = C2229141CMm.ADAPTER.redact(c1cqgNewBuilder.LIZLLL);
            c1cqgNewBuilder.LJFF = C1CQI.ADAPTER.redact(c1cqgNewBuilder.LJFF);
            c1cqgNewBuilder.clearUnknownFields();
            return c1cqgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQD c1cqd) {
            C1CQD c1cqd2 = c1cqd;
            C2229141CMm.ADAPTER.encodeWithTag(protoWriter, 1, c1cqd2.error);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cqd2.new_branch_id);
            C1CQI.ADAPTER.encodeWithTag(protoWriter, 3, c1cqd2.new_root_flow);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cqd2.new_state_id);
            protoWriter.writeBytes(c1cqd2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEW_BRANCH_ID = 0L;
    public static final Long DEFAULT_NEW_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeSymphonyError#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229141CMm error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long new_branch_id;

    @WireField(adapter = "link_mic_sdk.proto.SyeRootFlow#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CQI new_root_flow;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long new_state_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.error.hashCode()) * 37) + this.new_branch_id.hashCode()) * 37) + this.new_root_flow.hashCode()) * 37) + this.new_state_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQG newBuilder() {
        C1CQG c1cqg = new C1CQG();
        c1cqg.LIZLLL = this.error;
        c1cqg.LJ = this.new_branch_id;
        c1cqg.LJFF = this.new_root_flow;
        c1cqg.LJI = this.new_state_id;
        c1cqg.addUnknownFields(unknownFields());
        return c1cqg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", new_branch_id=");
        sb.append(this.new_branch_id);
        sb.append(", new_root_flow=");
        sb.append(this.new_root_flow);
        sb.append(", new_state_id=");
        sb.append(this.new_state_id);
        sb.replace(0, 2, "SyeEditBranchResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQD)) {
            return false;
        }
        C1CQD c1cqd = (C1CQD) obj;
        if (unknownFields().equals(c1cqd.unknownFields()) && this.error.equals(c1cqd.error) && this.new_branch_id.equals(c1cqd.new_branch_id) && this.new_root_flow.equals(c1cqd.new_root_flow) && this.new_state_id.equals(c1cqd.new_state_id)) {
            return true;
        }
        return false;
    }

    public C1CQD(C2229141CMm c2229141CMm, Long l, C1CQI c1cqi, Long l2) {
        this(c2229141CMm, l, c1cqi, l2, ByteString.EMPTY);
    }

    public C1CQD(C2229141CMm c2229141CMm, Long l, C1CQI c1cqi, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error = c2229141CMm;
        this.new_branch_id = l;
        this.new_root_flow = c1cqi;
        this.new_state_id = l2;
    }
}
