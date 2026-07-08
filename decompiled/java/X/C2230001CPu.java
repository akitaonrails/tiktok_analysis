package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230001CPu extends Message<C2230001CPu, C2230021CPw> {
    public static final ProtoAdapter<C2230001CPu> ADAPTER = new ProtoAdapter<C2230001CPu>() { // from class: X.1CPv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230001CPu decode(ProtoReader protoReader) {
            C2230021CPw c2230021CPw = new C2230021CPw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230021CPw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230021CPw.LJ = C1CQM.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2230021CPw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230021CPw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230001CPu c2230001CPu) {
            C2230001CPu c2230001CPu2 = c2230001CPu;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2230001CPu2.parallel_state_id) + C1CQM.ADAPTER.encodedSizeWithTag(2, c2230001CPu2.state) + c2230001CPu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230001CPu redact(C2230001CPu c2230001CPu) {
            C2230021CPw c2230021CPwNewBuilder = c2230001CPu.newBuilder();
            c2230021CPwNewBuilder.LJ = C1CQM.ADAPTER.redact(c2230021CPwNewBuilder.LJ);
            c2230021CPwNewBuilder.clearUnknownFields();
            return c2230021CPwNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230001CPu c2230001CPu) {
            C2230001CPu c2230001CPu2 = c2230001CPu;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2230001CPu2.parallel_state_id);
            C1CQM.ADAPTER.encodeWithTag(protoWriter, 2, c2230001CPu2.state);
            protoWriter.writeBytes(c2230001CPu2.unknownFields());
        }
    };
    public static final Long DEFAULT_PARALLEL_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long parallel_state_id;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CQM state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.parallel_state_id.hashCode()) * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230021CPw newBuilder() {
        C2230021CPw c2230021CPw = new C2230021CPw();
        c2230021CPw.LIZLLL = this.parallel_state_id;
        c2230021CPw.LJ = this.state;
        c2230021CPw.addUnknownFields(unknownFields());
        return c2230021CPw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", parallel_state_id=");
        sb.append(this.parallel_state_id);
        sb.append(", state=");
        sb.append(this.state);
        sb.replace(0, 2, "FuncParamsXd80712e103da705f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230001CPu)) {
            return false;
        }
        C2230001CPu c2230001CPu = (C2230001CPu) obj;
        if (unknownFields().equals(c2230001CPu.unknownFields()) && this.parallel_state_id.equals(c2230001CPu.parallel_state_id) && this.state.equals(c2230001CPu.state)) {
            return true;
        }
        return false;
    }

    public C2230001CPu(Long l, C1CQM c1cqm) {
        this(l, c1cqm, ByteString.EMPTY);
    }

    public C2230001CPu(Long l, C1CQM c1cqm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parallel_state_id = l;
        this.state = c1cqm;
    }
}
