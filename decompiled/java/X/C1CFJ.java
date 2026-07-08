package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFJ extends Message<C1CFJ, C1CFK> {
    public static final ProtoAdapter<C1CFJ> ADAPTER = new ProtoAdapter<C1CFJ>() { // from class: X.1CFI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFJ decode(ProtoReader protoReader) {
            C1CFK c1cfk = new C1CFK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cfk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cfk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFJ c1cfj) {
            C1CFJ c1cfj2 = c1cfj;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cfj2.channel_id) + c1cfj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFJ redact(C1CFJ c1cfj) {
            C1CFK c1cfkNewBuilder = c1cfj.newBuilder();
            c1cfkNewBuilder.clearUnknownFields();
            return c1cfkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFJ c1cfj) {
            C1CFJ c1cfj2 = c1cfj;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cfj2.channel_id);
            protoWriter.writeBytes(c1cfj2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long channel_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFK newBuilder() {
        C1CFK c1cfk = new C1CFK();
        c1cfk.LIZLLL = this.channel_id;
        c1cfk.addUnknownFields(unknownFields());
        return c1cfk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.replace(0, 2, "FuncParamsXd354391b9c74bfb2{");
        sb.append('}');
        return sb.toString();
    }

    public C1CFJ(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFJ)) {
            return false;
        }
        C1CFJ c1cfj = (C1CFJ) obj;
        if (unknownFields().equals(c1cfj.unknownFields()) && this.channel_id.equals(c1cfj.channel_id)) {
            return true;
        }
        return false;
    }

    public C1CFJ(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = l;
    }
}
