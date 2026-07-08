package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229971CPr extends Message<C2229971CPr, C2229991CPt> {
    public static final ProtoAdapter<C2229971CPr> ADAPTER = new ProtoAdapter<C2229971CPr>() { // from class: X.1CPs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229971CPr decode(ProtoReader protoReader) {
            C2229991CPt c2229991CPt = new C2229991CPt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229991CPt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229991CPt.LJ = C1CQM.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2229991CPt.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229991CPt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229971CPr c2229971CPr) {
            C2229971CPr c2229971CPr2 = c2229971CPr;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2229971CPr2.flow_id) + C1CQM.ADAPTER.encodedSizeWithTag(2, c2229971CPr2.state) + c2229971CPr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229971CPr redact(C2229971CPr c2229971CPr) {
            C2229991CPt c2229991CPtNewBuilder = c2229971CPr.newBuilder();
            c2229991CPtNewBuilder.LJ = C1CQM.ADAPTER.redact(c2229991CPtNewBuilder.LJ);
            c2229991CPtNewBuilder.clearUnknownFields();
            return c2229991CPtNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229971CPr c2229971CPr) {
            C2229971CPr c2229971CPr2 = c2229971CPr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2229971CPr2.flow_id);
            C1CQM.ADAPTER.encodeWithTag(protoWriter, 2, c2229971CPr2.state);
            protoWriter.writeBytes(c2229971CPr2.unknownFields());
        }
    };
    public static final Long DEFAULT_FLOW_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long flow_id;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CQM state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.flow_id.hashCode()) * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229991CPt newBuilder() {
        C2229991CPt c2229991CPt = new C2229991CPt();
        c2229991CPt.LIZLLL = this.flow_id;
        c2229991CPt.LJ = this.state;
        c2229991CPt.addUnknownFields(unknownFields());
        return c2229991CPt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", flow_id=");
        sb.append(this.flow_id);
        sb.append(", state=");
        sb.append(this.state);
        sb.replace(0, 2, "FuncParamsX10e7541815490d8f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229971CPr)) {
            return false;
        }
        C2229971CPr c2229971CPr = (C2229971CPr) obj;
        if (unknownFields().equals(c2229971CPr.unknownFields()) && this.flow_id.equals(c2229971CPr.flow_id) && this.state.equals(c2229971CPr.state)) {
            return true;
        }
        return false;
    }

    public C2229971CPr(Long l, C1CQM c1cqm) {
        this(l, c1cqm, ByteString.EMPTY);
    }

    public C2229971CPr(Long l, C1CQM c1cqm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow_id = l;
        this.state = c1cqm;
    }
}
