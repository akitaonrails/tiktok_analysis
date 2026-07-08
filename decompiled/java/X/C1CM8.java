package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CM8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM8 extends Message<C1CM8, C1CMA> {
    public static final ProtoAdapter<C1CM8> ADAPTER = new ProtoAdapter<C1CM8>() { // from class: X.1CM9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM8 decode(ProtoReader protoReader) {
            C1CMA c1cma = new C1CMA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cma.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cma.LJ = C1CMV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cma.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cma.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CM8 c1cm8) {
            C1CM8 c1cm82 = c1cm8;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cm82.retry_count) + C1CMV.ADAPTER.encodedSizeWithTag(2, c1cm82.error) + c1cm82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM8 redact(C1CM8 c1cm8) {
            C1CMA c1cmaNewBuilder = c1cm8.newBuilder();
            c1cmaNewBuilder.LJ = C1CMV.ADAPTER.redact(c1cmaNewBuilder.LJ);
            c1cmaNewBuilder.clearUnknownFields();
            return c1cmaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CM8 c1cm8) {
            C1CM8 c1cm82 = c1cm8;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cm82.retry_count);
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 2, c1cm82.error);
            protoWriter.writeBytes(c1cm82.unknownFields());
        }
    };
    public static final Long DEFAULT_RETRY_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CMV error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long retry_count;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.retry_count.hashCode()) * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CMA newBuilder() {
        C1CMA c1cma = new C1CMA();
        c1cma.LIZLLL = this.retry_count;
        c1cma.LJ = this.error;
        c1cma.addUnknownFields(unknownFields());
        return c1cma;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", retry_count=");
        sb.append(this.retry_count);
        sb.append(", error=");
        sb.append(this.error);
        sb.replace(0, 2, "FuncParamsX9dc0b1e296cce89b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CM8)) {
            return false;
        }
        C1CM8 c1cm8 = (C1CM8) obj;
        if (unknownFields().equals(c1cm8.unknownFields()) && this.retry_count.equals(c1cm8.retry_count) && this.error.equals(c1cm8.error)) {
            return true;
        }
        return false;
    }

    public C1CM8(Long l, C1CMV c1cmv) {
        this(l, c1cmv, ByteString.EMPTY);
    }

    public C1CM8(Long l, C1CMV c1cmv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.retry_count = l;
        this.error = c1cmv;
    }
}
