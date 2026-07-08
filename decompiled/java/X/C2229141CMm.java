package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229141CMm extends Message<C2229141CMm, C2229161CMo> {
    public static final ProtoAdapter<C2229141CMm> ADAPTER = new ProtoAdapter<C2229141CMm>() { // from class: X.1CMn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229141CMm decode(ProtoReader protoReader) {
            C2229161CMo c2229161CMo = new C2229161CMo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229161CMo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229161CMo.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229161CMo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229161CMo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229141CMm c2229141CMm) {
            C2229141CMm c2229141CMm2 = c2229141CMm;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2229141CMm2.err_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2229141CMm2.err_msg) + c2229141CMm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229141CMm redact(C2229141CMm c2229141CMm) {
            C2229161CMo c2229161CMoNewBuilder = c2229141CMm.newBuilder();
            c2229161CMoNewBuilder.clearUnknownFields();
            return c2229161CMoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229141CMm c2229141CMm) {
            C2229141CMm c2229141CMm2 = c2229141CMm;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2229141CMm2.err_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2229141CMm2.err_msg);
            protoWriter.writeBytes(c2229141CMm2.unknownFields());
        }
    };
    public static final Long DEFAULT_ERR_CODE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long err_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String err_msg;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.err_code.hashCode()) * 37) + this.err_msg.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229161CMo newBuilder() {
        C2229161CMo c2229161CMo = new C2229161CMo();
        c2229161CMo.LIZLLL = this.err_code;
        c2229161CMo.LJ = this.err_msg;
        c2229161CMo.addUnknownFields(unknownFields());
        return c2229161CMo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", err_code=");
        sb.append(this.err_code);
        sb.append(", err_msg=");
        sb.append(this.err_msg);
        sb.replace(0, 2, "SyeSymphonyError{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229141CMm)) {
            return false;
        }
        C2229141CMm c2229141CMm = (C2229141CMm) obj;
        if (unknownFields().equals(c2229141CMm.unknownFields()) && this.err_code.equals(c2229141CMm.err_code) && this.err_msg.equals(c2229141CMm.err_msg)) {
            return true;
        }
        return false;
    }

    public C2229141CMm(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C2229141CMm(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.err_code = l;
        this.err_msg = str;
    }
}
