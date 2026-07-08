package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225981CAi extends Message<C2225981CAi, C2226001CAk> {
    public static final ProtoAdapter<C2225981CAi> ADAPTER = new ProtoAdapter<C2225981CAi>() { // from class: X.1CAj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225981CAi decode(ProtoReader protoReader) {
            C2226001CAk c2226001CAk = new C2226001CAk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226001CAk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226001CAk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226001CAk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225981CAi c2225981CAi) {
            C2225981CAi c2225981CAi2 = c2225981CAi;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2225981CAi2.config) + c2225981CAi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225981CAi redact(C2225981CAi c2225981CAi) {
            C2226001CAk c2226001CAkNewBuilder = c2225981CAi.newBuilder();
            c2226001CAkNewBuilder.clearUnknownFields();
            return c2226001CAkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225981CAi c2225981CAi) {
            C2225981CAi c2225981CAi2 = c2225981CAi;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2225981CAi2.config);
            protoWriter.writeBytes(c2225981CAi2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONFIG = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long config;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226001CAk newBuilder() {
        C2226001CAk c2226001CAk = new C2226001CAk();
        c2226001CAk.LIZLLL = this.config;
        c2226001CAk.addUnknownFields(unknownFields());
        return c2226001CAk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsX3fea69fc677ba027{");
        sb.append('}');
        return sb.toString();
    }

    public C2225981CAi(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225981CAi)) {
            return false;
        }
        C2225981CAi c2225981CAi = (C2225981CAi) obj;
        if (unknownFields().equals(c2225981CAi.unknownFields()) && this.config.equals(c2225981CAi.config)) {
            return true;
        }
        return false;
    }

    public C2225981CAi(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = l;
    }
}
