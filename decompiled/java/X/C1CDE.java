package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDE extends Message<C1CDE, C1CDG> {
    public static final ProtoAdapter<C1CDE> ADAPTER = new ProtoAdapter<C1CDE>() { // from class: X.1CDF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDE decode(ProtoReader protoReader) {
            C1CDG c1cdg = new C1CDG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cdg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cdg.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDE c1cde) {
            C1CDE c1cde2 = c1cde;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cde2.volume) + c1cde2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDE redact(C1CDE c1cde) {
            C1CDG c1cdgNewBuilder = c1cde.newBuilder();
            c1cdgNewBuilder.clearUnknownFields();
            return c1cdgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDE c1cde) {
            C1CDE c1cde2 = c1cde;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cde2.volume);
            protoWriter.writeBytes(c1cde2.unknownFields());
        }
    };
    public static final Long DEFAULT_VOLUME = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long volume;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.volume.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CDG newBuilder() {
        C1CDG c1cdg = new C1CDG();
        c1cdg.LIZLLL = this.volume;
        c1cdg.addUnknownFields(unknownFields());
        return c1cdg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", volume=");
        sb.append(this.volume);
        sb.replace(0, 2, "FuncParamsX9d301c6d981981ac{");
        sb.append('}');
        return sb.toString();
    }

    public C1CDE(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDE)) {
            return false;
        }
        C1CDE c1cde = (C1CDE) obj;
        if (unknownFields().equals(c1cde.unknownFields()) && this.volume.equals(c1cde.volume)) {
            return true;
        }
        return false;
    }

    public C1CDE(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.volume = l;
    }
}
