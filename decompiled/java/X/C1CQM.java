package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQM extends Message<C1CQM, C1CQO> {
    public static final ProtoAdapter<C1CQM> ADAPTER = new ProtoAdapter<C1CQM>() { // from class: X.1CQN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQM decode(ProtoReader protoReader) {
            C1CQO c1cqo = new C1CQO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cqo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1cqo.LJI = C1CQZ.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1cqo.LJFF = C1CQV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cqo.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cqo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQM c1cqm) {
            C1CQM c1cqm2 = c1cqm;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cqm2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cqm2.state_type) + C1CQV.ADAPTER.encodedSizeWithTag(3, c1cqm2.task_state_data) + C1CQZ.ADAPTER.encodedSizeWithTag(4, c1cqm2.parallel_state_data) + c1cqm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQM redact(C1CQM c1cqm) {
            C1CQO c1cqoNewBuilder = c1cqm.newBuilder();
            C1CQV c1cqv = c1cqoNewBuilder.LJFF;
            if (c1cqv != null) {
                c1cqoNewBuilder.LJFF = C1CQV.ADAPTER.redact(c1cqv);
            }
            C1CQZ c1cqz = c1cqoNewBuilder.LJI;
            if (c1cqz != null) {
                c1cqoNewBuilder.LJI = C1CQZ.ADAPTER.redact(c1cqz);
            }
            c1cqoNewBuilder.clearUnknownFields();
            return c1cqoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQM c1cqm) {
            C1CQM c1cqm2 = c1cqm;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cqm2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cqm2.state_type);
            C1CQV.ADAPTER.encodeWithTag(protoWriter, 3, c1cqm2.task_state_data);
            C1CQZ.ADAPTER.encodeWithTag(protoWriter, 4, c1cqm2.parallel_state_data);
            protoWriter.writeBytes(c1cqm2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long id;

    @WireField(adapter = "link_mic_sdk.proto.SyeParallelStateData#ADAPTER", tag = 4)
    public final C1CQZ parallel_state_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String state_type;

    @WireField(adapter = "link_mic_sdk.proto.SyeTaskStateData#ADAPTER", tag = 3)
    public final C1CQV task_state_data;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.state_type.hashCode()) * 37;
        C1CQV c1cqv = this.task_state_data;
        int iHashCode2 = (iHashCode + (c1cqv != null ? c1cqv.hashCode() : 0)) * 37;
        C1CQZ c1cqz = this.parallel_state_data;
        int iHashCode3 = iHashCode2 + (c1cqz != null ? c1cqz.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CQO newBuilder() {
        C1CQO c1cqo = new C1CQO();
        c1cqo.LIZLLL = this.id;
        c1cqo.LJ = this.state_type;
        c1cqo.LJFF = this.task_state_data;
        c1cqo.LJI = this.parallel_state_data;
        c1cqo.addUnknownFields(unknownFields());
        return c1cqo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", state_type=");
        sb.append(this.state_type);
        if (this.task_state_data != null) {
            sb.append(", task_state_data=");
            sb.append(this.task_state_data);
        }
        if (this.parallel_state_data != null) {
            sb.append(", parallel_state_data=");
            sb.append(this.parallel_state_data);
        }
        sb.replace(0, 2, "SyeState{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQM)) {
            return false;
        }
        C1CQM c1cqm = (C1CQM) obj;
        if (unknownFields().equals(c1cqm.unknownFields()) && this.id.equals(c1cqm.id) && this.state_type.equals(c1cqm.state_type) && C1516540pZE.LJ(this.task_state_data, c1cqm.task_state_data) && C1516540pZE.LJ(this.parallel_state_data, c1cqm.parallel_state_data)) {
            return true;
        }
        return false;
    }

    public C1CQM(Long l, String str, C1CQV c1cqv, C1CQZ c1cqz) {
        this(l, str, c1cqv, c1cqz, ByteString.EMPTY);
    }

    public C1CQM(Long l, String str, C1CQV c1cqv, C1CQZ c1cqz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.state_type = str;
        this.task_state_data = c1cqv;
        this.parallel_state_data = c1cqz;
    }
}
