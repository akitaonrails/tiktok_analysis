package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229881CPi extends Message<C2229881CPi, C2229901CPk> {
    public static final ProtoAdapter<C2229881CPi> ADAPTER = new ProtoAdapter<C2229881CPi>() { // from class: X.1CPj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229881CPi decode(ProtoReader protoReader) {
            C2229901CPk c2229901CPk = new C2229901CPk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229901CPk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2229901CPk.LJFF = C1CQM.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2229901CPk.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2229901CPk.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229901CPk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229881CPi c2229881CPi) {
            C2229881CPi c2229881CPi2 = c2229881CPi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.asPacked().encodedSizeWithTag(1, c2229881CPi2.prev_state_ids) + protoAdapter.encodedSizeWithTag(2, c2229881CPi2.next_state_id) + C1CQM.ADAPTER.encodedSizeWithTag(3, c2229881CPi2.state) + c2229881CPi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229881CPi redact(C2229881CPi c2229881CPi) {
            C2229901CPk c2229901CPkNewBuilder = c2229881CPi.newBuilder();
            c2229901CPkNewBuilder.LJFF = C1CQM.ADAPTER.redact(c2229901CPkNewBuilder.LJFF);
            c2229901CPkNewBuilder.clearUnknownFields();
            return c2229901CPkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229881CPi c2229881CPi) {
            C2229881CPi c2229881CPi2 = c2229881CPi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asPacked().encodeWithTag(protoWriter, 1, c2229881CPi2.prev_state_ids);
            protoAdapter.encodeWithTag(protoWriter, 2, c2229881CPi2.next_state_id);
            C1CQM.ADAPTER.encodeWithTag(protoWriter, 3, c2229881CPi2.state);
            protoWriter.writeBytes(c2229881CPi2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long next_state_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> prev_state_ids;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CQM state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.prev_state_ids.hashCode()) * 37) + this.next_state_id.hashCode()) * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229901CPk newBuilder() {
        C2229901CPk c2229901CPk = new C2229901CPk();
        c2229901CPk.LIZLLL = C1516540pZE.LIZJ("prev_state_ids", this.prev_state_ids);
        c2229901CPk.LJ = this.next_state_id;
        c2229901CPk.LJFF = this.state;
        c2229901CPk.addUnknownFields(unknownFields());
        return c2229901CPk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.prev_state_ids.isEmpty()) {
            sb.append(", prev_state_ids=");
            sb.append(this.prev_state_ids);
        }
        sb.append(", next_state_id=");
        sb.append(this.next_state_id);
        sb.append(", state=");
        sb.append(this.state);
        sb.replace(0, 2, "FuncParamsXd604e6a3785c0b98{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229881CPi)) {
            return false;
        }
        C2229881CPi c2229881CPi = (C2229881CPi) obj;
        if (unknownFields().equals(c2229881CPi.unknownFields()) && this.prev_state_ids.equals(c2229881CPi.prev_state_ids) && this.next_state_id.equals(c2229881CPi.next_state_id) && this.state.equals(c2229881CPi.state)) {
            return true;
        }
        return false;
    }

    public C2229881CPi(List<Long> list, Long l, C1CQM c1cqm) {
        this(list, l, c1cqm, ByteString.EMPTY);
    }

    public C2229881CPi(List<Long> list, Long l, C1CQM c1cqm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.prev_state_ids = C1516540pZE.LJFF("prev_state_ids", list);
        this.next_state_id = l;
        this.state = c1cqm;
    }
}
