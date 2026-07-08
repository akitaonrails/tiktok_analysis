package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225951CAf extends Message<C2225951CAf, C2225971CAh> {
    public static final ProtoAdapter<C2225951CAf> ADAPTER = new ProtoAdapter<C2225951CAf>() { // from class: X.1CAg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225951CAf decode(ProtoReader protoReader) {
            C2225971CAh c2225971CAh = new C2225971CAh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225971CAh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225971CAh.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225971CAh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225951CAf c2225951CAf) {
            C2225951CAf c2225951CAf2 = c2225951CAf;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2225951CAf2.config) + c2225951CAf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225951CAf redact(C2225951CAf c2225951CAf) {
            C2225971CAh c2225971CAhNewBuilder = c2225951CAf.newBuilder();
            c2225971CAhNewBuilder.clearUnknownFields();
            return c2225971CAhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225951CAf c2225951CAf) {
            C2225951CAf c2225951CAf2 = c2225951CAf;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2225951CAf2.config);
            protoWriter.writeBytes(c2225951CAf2.unknownFields());
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
    public C2225971CAh newBuilder() {
        C2225971CAh c2225971CAh = new C2225971CAh();
        c2225971CAh.LIZLLL = this.config;
        c2225971CAh.addUnknownFields(unknownFields());
        return c2225971CAh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsXf78569e4a67d407b{");
        sb.append('}');
        return sb.toString();
    }

    public C2225951CAf(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225951CAf)) {
            return false;
        }
        C2225951CAf c2225951CAf = (C2225951CAf) obj;
        if (unknownFields().equals(c2225951CAf.unknownFields()) && this.config.equals(c2225951CAf.config)) {
            return true;
        }
        return false;
    }

    public C2225951CAf(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = l;
    }
}
