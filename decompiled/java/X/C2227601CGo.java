package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227601CGo extends Message<C2227601CGo, C2227611CGp> {
    public static final ProtoAdapter<C2227601CGo> ADAPTER = new ProtoAdapter<C2227601CGo>() { // from class: X.1CGn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227601CGo decode(ProtoReader protoReader) {
            C2227611CGp c2227611CGp = new C2227611CGp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227611CGp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227611CGp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227611CGp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227601CGo c2227601CGo) {
            C2227601CGo c2227601CGo2 = c2227601CGo;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227601CGo2.display_id) + c2227601CGo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227601CGo redact(C2227601CGo c2227601CGo) {
            C2227611CGp c2227611CGpNewBuilder = c2227601CGo.newBuilder();
            c2227611CGpNewBuilder.clearUnknownFields();
            return c2227611CGpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227601CGo c2227601CGo) {
            C2227601CGo c2227601CGo2 = c2227601CGo;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227601CGo2.display_id);
            protoWriter.writeBytes(c2227601CGo2.unknownFields());
        }
    };
    public static final Long DEFAULT_DISPLAY_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long display_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.display_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227611CGp newBuilder() {
        C2227611CGp c2227611CGp = new C2227611CGp();
        c2227611CGp.LIZLLL = this.display_id;
        c2227611CGp.addUnknownFields(unknownFields());
        return c2227611CGp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", display_id=");
        sb.append(this.display_id);
        sb.replace(0, 2, "LinkMicMultiLiveBizChangeLayoutParams{");
        sb.append('}');
        return sb.toString();
    }

    public C2227601CGo(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227601CGo)) {
            return false;
        }
        C2227601CGo c2227601CGo = (C2227601CGo) obj;
        if (unknownFields().equals(c2227601CGo.unknownFields()) && this.display_id.equals(c2227601CGo.display_id)) {
            return true;
        }
        return false;
    }

    public C2227601CGo(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.display_id = l;
    }
}
