package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C66, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C66 extends Message<C1C66, C1C68> {
    public static final ProtoAdapter<C1C66> ADAPTER = new ProtoAdapter<C1C66>() { // from class: X.1C67
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C66 decode(ProtoReader protoReader) {
            C1C68 c1c68 = new C1C68();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c68.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c68.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c68.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C66 c1c66) {
            C1C66 c1c662 = c1c66;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c662.select_count) + c1c662.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C66 redact(C1C66 c1c66) {
            C1C68 c1c68NewBuilder = c1c66.newBuilder();
            c1c68NewBuilder.clearUnknownFields();
            return c1c68NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C66 c1c66) {
            C1C66 c1c662 = c1c66;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c662.select_count);
            protoWriter.writeBytes(c1c662.unknownFields());
        }
    };
    public static final Long DEFAULT_SELECT_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long select_count;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.select_count.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C68 newBuilder() {
        C1C68 c1c68 = new C1C68();
        c1c68.LIZLLL = this.select_count;
        c1c68.addUnknownFields(unknownFields());
        return c1c68;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", select_count=");
        sb.append(this.select_count);
        sb.replace(0, 2, "FuncParamsXe0a3d263e30eda08{");
        sb.append('}');
        return sb.toString();
    }

    public C1C66(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C66)) {
            return false;
        }
        C1C66 c1c66 = (C1C66) obj;
        if (unknownFields().equals(c1c66.unknownFields()) && this.select_count.equals(c1c66.select_count)) {
            return true;
        }
        return false;
    }

    public C1C66(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.select_count = l;
    }
}
