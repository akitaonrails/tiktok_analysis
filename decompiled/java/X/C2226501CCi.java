package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226501CCi extends Message<C2226501CCi, C2226511CCj> {
    public static final ProtoAdapter<C2226501CCi> ADAPTER = new ProtoAdapter<C2226501CCi>() { // from class: X.1CCh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226501CCi decode(ProtoReader protoReader) {
            C2226511CCj c2226511CCj = new C2226511CCj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226511CCj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226511CCj.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226511CCj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226501CCi c2226501CCi) {
            C2226501CCi c2226501CCi2 = c2226501CCi;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2226501CCi2.state_id) + c2226501CCi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226501CCi redact(C2226501CCi c2226501CCi) {
            C2226511CCj c2226511CCjNewBuilder = c2226501CCi.newBuilder();
            c2226511CCjNewBuilder.clearUnknownFields();
            return c2226511CCjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226501CCi c2226501CCi) {
            C2226501CCi c2226501CCi2 = c2226501CCi;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2226501CCi2.state_id);
            protoWriter.writeBytes(c2226501CCi2.unknownFields());
        }
    };
    public static final Long DEFAULT_STATE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long state_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.state_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226511CCj newBuilder() {
        C2226511CCj c2226511CCj = new C2226511CCj();
        c2226511CCj.LIZLLL = this.state_id;
        c2226511CCj.addUnknownFields(unknownFields());
        return c2226511CCj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state_id=");
        sb.append(this.state_id);
        sb.replace(0, 2, "FuncParamsX279d683598d7ff09{");
        sb.append('}');
        return sb.toString();
    }

    public C2226501CCi(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226501CCi)) {
            return false;
        }
        C2226501CCi c2226501CCi = (C2226501CCi) obj;
        if (unknownFields().equals(c2226501CCi.unknownFields()) && this.state_id.equals(c2226501CCi.state_id)) {
            return true;
        }
        return false;
    }

    public C2226501CCi(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state_id = l;
    }
}
