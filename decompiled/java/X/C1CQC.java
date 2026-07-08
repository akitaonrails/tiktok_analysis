package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQC extends Message<C1CQC, C1CQH> {
    public static final ProtoAdapter<C1CQC> ADAPTER = new ProtoAdapter<C1CQC>() { // from class: X.1CQF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQC decode(ProtoReader protoReader) {
            C1CQH c1cqh = new C1CQH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cqh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cqh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1cqh.LJ = C1CQI.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cqh.LIZLLL = C2229141CMm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQC c1cqc) {
            C1CQC c1cqc2 = c1cqc;
            return C2229141CMm.ADAPTER.encodedSizeWithTag(1, c1cqc2.error) + C1CQI.ADAPTER.encodedSizeWithTag(2, c1cqc2.new_root_flow) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1cqc2.new_state_id) + c1cqc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQC redact(C1CQC c1cqc) {
            C1CQH c1cqhNewBuilder = c1cqc.newBuilder();
            c1cqhNewBuilder.LIZLLL = C2229141CMm.ADAPTER.redact(c1cqhNewBuilder.LIZLLL);
            c1cqhNewBuilder.LJ = C1CQI.ADAPTER.redact(c1cqhNewBuilder.LJ);
            c1cqhNewBuilder.clearUnknownFields();
            return c1cqhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQC c1cqc) {
            C1CQC c1cqc2 = c1cqc;
            C2229141CMm.ADAPTER.encodeWithTag(protoWriter, 1, c1cqc2.error);
            C1CQI.ADAPTER.encodeWithTag(protoWriter, 2, c1cqc2.new_root_flow);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1cqc2.new_state_id);
            protoWriter.writeBytes(c1cqc2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEW_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeSymphonyError#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229141CMm error;

    @WireField(adapter = "link_mic_sdk.proto.SyeRootFlow#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CQI new_root_flow;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long new_state_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.error.hashCode()) * 37) + this.new_root_flow.hashCode()) * 37) + this.new_state_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQH newBuilder() {
        C1CQH c1cqh = new C1CQH();
        c1cqh.LIZLLL = this.error;
        c1cqh.LJ = this.new_root_flow;
        c1cqh.LJFF = this.new_state_id;
        c1cqh.addUnknownFields(unknownFields());
        return c1cqh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", new_root_flow=");
        sb.append(this.new_root_flow);
        sb.append(", new_state_id=");
        sb.append(this.new_state_id);
        sb.replace(0, 2, "SyeEditStateResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQC)) {
            return false;
        }
        C1CQC c1cqc = (C1CQC) obj;
        if (unknownFields().equals(c1cqc.unknownFields()) && this.error.equals(c1cqc.error) && this.new_root_flow.equals(c1cqc.new_root_flow) && this.new_state_id.equals(c1cqc.new_state_id)) {
            return true;
        }
        return false;
    }

    public C1CQC(C2229141CMm c2229141CMm, C1CQI c1cqi, Long l) {
        this(c2229141CMm, c1cqi, l, ByteString.EMPTY);
    }

    public C1CQC(C2229141CMm c2229141CMm, C1CQI c1cqi, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error = c2229141CMm;
        this.new_root_flow = c1cqi;
        this.new_state_id = l;
    }
}
