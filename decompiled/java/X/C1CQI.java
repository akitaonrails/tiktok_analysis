package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQI extends Message<C1CQI, C1CQK> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeFlow#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C1CQP> flows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long min_app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long start_at_flow_id;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CQM> states;
    public static final ProtoAdapter<C1CQI> ADAPTER = new ProtoAdapter<C1CQI>() { // from class: X.1CQJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQI decode(ProtoReader protoReader) {
            C1CQK c1cqk = new C1CQK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cqk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1cqk.LJI.add(C1CQM.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1cqk.LJFF.add(C1CQP.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1cqk.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cqk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQI c1cqi) {
            C1CQI c1cqi2 = c1cqi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cqi2.start_at_flow_id) + protoAdapter.encodedSizeWithTag(2, c1cqi2.min_app_version) + C1CQP.ADAPTER.asRepeated().encodedSizeWithTag(3, c1cqi2.flows) + C1CQM.ADAPTER.asRepeated().encodedSizeWithTag(4, c1cqi2.states) + c1cqi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQI redact(C1CQI c1cqi) {
            C1CQK c1cqkNewBuilder = c1cqi.newBuilder();
            C1516540pZE.LJIIIZ(c1cqkNewBuilder.LJFF, C1CQP.ADAPTER);
            C1516540pZE.LJIIIZ(c1cqkNewBuilder.LJI, C1CQM.ADAPTER);
            c1cqkNewBuilder.clearUnknownFields();
            return c1cqkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQI c1cqi) {
            C1CQI c1cqi2 = c1cqi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cqi2.start_at_flow_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cqi2.min_app_version);
            C1CQP.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1cqi2.flows);
            C1CQM.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1cqi2.states);
            protoWriter.writeBytes(c1cqi2.unknownFields());
        }
    };
    public static final Long DEFAULT_START_AT_FLOW_ID = 0L;
    public static final Long DEFAULT_MIN_APP_VERSION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.start_at_flow_id.hashCode()) * 37) + this.min_app_version.hashCode()) * 37) + this.flows.hashCode()) * 37) + this.states.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQK newBuilder() {
        C1CQK c1cqk = new C1CQK();
        c1cqk.LIZLLL = this.start_at_flow_id;
        c1cqk.LJ = this.min_app_version;
        c1cqk.LJFF = C1516540pZE.LIZJ("flows", this.flows);
        c1cqk.LJI = C1516540pZE.LIZJ("states", this.states);
        c1cqk.addUnknownFields(unknownFields());
        return c1cqk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_at_flow_id=");
        sb.append(this.start_at_flow_id);
        sb.append(", min_app_version=");
        sb.append(this.min_app_version);
        if (!this.flows.isEmpty()) {
            sb.append(", flows=");
            sb.append(this.flows);
        }
        if (!this.states.isEmpty()) {
            sb.append(", states=");
            sb.append(this.states);
        }
        sb.replace(0, 2, "SyeRootFlow{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQI)) {
            return false;
        }
        C1CQI c1cqi = (C1CQI) obj;
        if (unknownFields().equals(c1cqi.unknownFields()) && this.start_at_flow_id.equals(c1cqi.start_at_flow_id) && this.min_app_version.equals(c1cqi.min_app_version) && this.flows.equals(c1cqi.flows) && this.states.equals(c1cqi.states)) {
            return true;
        }
        return false;
    }

    public C1CQI(Long l, Long l2, List<C1CQP> list, List<C1CQM> list2) {
        this(l, l2, list, list2, ByteString.EMPTY);
    }

    public C1CQI(Long l, Long l2, List<C1CQP> list, List<C1CQM> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_at_flow_id = l;
        this.min_app_version = l2;
        this.flows = C1516540pZE.LJFF("flows", list);
        this.states = C1516540pZE.LJFF("states", list2);
    }
}
