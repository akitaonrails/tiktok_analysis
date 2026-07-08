package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGQ extends Message<C1CGQ, C1CGS> {
    public static final ProtoAdapter<C1CGQ> ADAPTER = new ProtoAdapter<C1CGQ>() { // from class: X.1CGR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGQ decode(ProtoReader protoReader) {
            C1CGS c1cgs = new C1CGS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cgs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cgs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGQ c1cgq) {
            C1CGQ c1cgq2 = c1cgq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cgq2.biz_session_id) + c1cgq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGQ redact(C1CGQ c1cgq) {
            C1CGS c1cgsNewBuilder = c1cgq.newBuilder();
            c1cgsNewBuilder.clearUnknownFields();
            return c1cgsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CGQ c1cgq) {
            C1CGQ c1cgq2 = c1cgq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cgq2.biz_session_id);
            protoWriter.writeBytes(c1cgq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String biz_session_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.biz_session_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CGS newBuilder() {
        C1CGS c1cgs = new C1CGS();
        c1cgs.LIZLLL = this.biz_session_id;
        c1cgs.addUnknownFields(unknownFields());
        return c1cgs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_session_id=");
        sb.append(this.biz_session_id);
        sb.replace(0, 2, "FuncParamsXa6dc6dc5d861e154{");
        sb.append('}');
        return sb.toString();
    }

    public C1CGQ(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CGQ)) {
            return false;
        }
        C1CGQ c1cgq = (C1CGQ) obj;
        if (unknownFields().equals(c1cgq.unknownFields()) && this.biz_session_id.equals(c1cgq.biz_session_id)) {
            return true;
        }
        return false;
    }

    public C1CGQ(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_session_id = str;
    }
}
