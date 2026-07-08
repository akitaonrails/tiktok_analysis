package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226521CCk extends Message<C2226521CCk, C2226541CCm> {
    public static final ProtoAdapter<C2226521CCk> ADAPTER = new ProtoAdapter<C2226521CCk>() { // from class: X.1CCl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226521CCk decode(ProtoReader protoReader) {
            C2226541CCm c2226541CCm = new C2226541CCm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226541CCm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226541CCm.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c2226541CCm.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226541CCm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226521CCk c2226521CCk) {
            C2226521CCk c2226521CCk2 = c2226521CCk;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2226521CCk2.state_id) + protoAdapter.asPacked().encodedSizeWithTag(2, c2226521CCk2.prev_state_ids) + c2226521CCk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226521CCk redact(C2226521CCk c2226521CCk) {
            C2226541CCm c2226541CCmNewBuilder = c2226521CCk.newBuilder();
            c2226541CCmNewBuilder.clearUnknownFields();
            return c2226541CCmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226521CCk c2226521CCk) {
            C2226521CCk c2226521CCk2 = c2226521CCk;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2226521CCk2.state_id);
            protoAdapter.asPacked().encodeWithTag(protoWriter, 2, c2226521CCk2.prev_state_ids);
            protoWriter.writeBytes(c2226521CCk2.unknownFields());
        }
    };
    public static final Long DEFAULT_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 2)
    public final List<Long> prev_state_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long state_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.state_id.hashCode()) * 37) + this.prev_state_ids.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226541CCm newBuilder() {
        C2226541CCm c2226541CCm = new C2226541CCm();
        c2226541CCm.LIZLLL = this.state_id;
        c2226541CCm.LJ = C1516540pZE.LIZJ("prev_state_ids", this.prev_state_ids);
        c2226541CCm.addUnknownFields(unknownFields());
        return c2226541CCm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state_id=");
        sb.append(this.state_id);
        if (!this.prev_state_ids.isEmpty()) {
            sb.append(", prev_state_ids=");
            sb.append(this.prev_state_ids);
        }
        sb.replace(0, 2, "FuncParamsXc71f3cf1c02a29e2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226521CCk)) {
            return false;
        }
        C2226521CCk c2226521CCk = (C2226521CCk) obj;
        if (unknownFields().equals(c2226521CCk.unknownFields()) && this.state_id.equals(c2226521CCk.state_id) && this.prev_state_ids.equals(c2226521CCk.prev_state_ids)) {
            return true;
        }
        return false;
    }

    public C2226521CCk(Long l, List<Long> list) {
        this(l, list, ByteString.EMPTY);
    }

    public C2226521CCk(Long l, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state_id = l;
        this.prev_state_ids = C1516540pZE.LJFF("prev_state_ids", list);
    }
}
