package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFP extends Message<C1CFP, C1CFQ> {
    public static final ProtoAdapter<C1CFP> ADAPTER = new ProtoAdapter<C1CFP>() { // from class: X.1CFO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFP decode(ProtoReader protoReader) {
            C1CFQ c1cfq = new C1CFQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cfq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cfq.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFP c1cfp) {
            C1CFP c1cfp2 = c1cfp;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cfp2.group_channel_id) + c1cfp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFP redact(C1CFP c1cfp) {
            C1CFQ c1cfqNewBuilder = c1cfp.newBuilder();
            c1cfqNewBuilder.clearUnknownFields();
            return c1cfqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFP c1cfp) {
            C1CFP c1cfp2 = c1cfp;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cfp2.group_channel_id);
            protoWriter.writeBytes(c1cfp2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long group_channel_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.group_channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFQ newBuilder() {
        C1CFQ c1cfq = new C1CFQ();
        c1cfq.LIZLLL = this.group_channel_id;
        c1cfq.addUnknownFields(unknownFields());
        return c1cfq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.replace(0, 2, "FuncParamsX2f59697e0094f58c{");
        sb.append('}');
        return sb.toString();
    }

    public C1CFP(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFP)) {
            return false;
        }
        C1CFP c1cfp = (C1CFP) obj;
        if (unknownFields().equals(c1cfp.unknownFields()) && this.group_channel_id.equals(c1cfp.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C1CFP(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_channel_id = l;
    }
}
