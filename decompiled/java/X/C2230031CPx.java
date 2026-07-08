package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230031CPx extends Message<C2230031CPx, C2230051CPz> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long branch_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long parallel_state_id;
    public static final ProtoAdapter<C2230031CPx> ADAPTER = new ProtoAdapter<C2230031CPx>() { // from class: X.1CPy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230031CPx decode(ProtoReader protoReader) {
            C2230051CPz c2230051CPz = new C2230051CPz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230051CPz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230051CPz.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2230051CPz.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230051CPz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230031CPx c2230031CPx) {
            C2230031CPx c2230031CPx2 = c2230031CPx;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2230031CPx2.parallel_state_id) + protoAdapter.encodedSizeWithTag(2, c2230031CPx2.branch_id) + c2230031CPx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230031CPx redact(C2230031CPx c2230031CPx) {
            C2230051CPz c2230051CPzNewBuilder = c2230031CPx.newBuilder();
            c2230051CPzNewBuilder.clearUnknownFields();
            return c2230051CPzNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230031CPx c2230031CPx) {
            C2230031CPx c2230031CPx2 = c2230031CPx;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230031CPx2.parallel_state_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230031CPx2.branch_id);
            protoWriter.writeBytes(c2230031CPx2.unknownFields());
        }
    };
    public static final Long DEFAULT_PARALLEL_STATE_ID = 0L;
    public static final Long DEFAULT_BRANCH_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.parallel_state_id.hashCode()) * 37) + this.branch_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230051CPz newBuilder() {
        C2230051CPz c2230051CPz = new C2230051CPz();
        c2230051CPz.LIZLLL = this.parallel_state_id;
        c2230051CPz.LJ = this.branch_id;
        c2230051CPz.addUnknownFields(unknownFields());
        return c2230051CPz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", parallel_state_id=");
        sb.append(this.parallel_state_id);
        sb.append(", branch_id=");
        sb.append(this.branch_id);
        sb.replace(0, 2, "FuncParamsXaa11d95b78847733{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230031CPx)) {
            return false;
        }
        C2230031CPx c2230031CPx = (C2230031CPx) obj;
        if (unknownFields().equals(c2230031CPx.unknownFields()) && this.parallel_state_id.equals(c2230031CPx.parallel_state_id) && this.branch_id.equals(c2230031CPx.branch_id)) {
            return true;
        }
        return false;
    }

    public C2230031CPx(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C2230031CPx(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parallel_state_id = l;
        this.branch_id = l2;
    }
}
