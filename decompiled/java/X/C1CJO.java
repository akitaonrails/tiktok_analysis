package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJO extends Message<C1CJO, C1CJP> {
    public static final ProtoAdapter<C1CJO> ADAPTER = new ProtoAdapter<C1CJO>() { // from class: X.1CJN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJO decode(ProtoReader protoReader) {
            C1CJP c1cjp = new C1CJP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cjp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cjp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJO c1cjo) {
            C1CJO c1cjo2 = c1cjo;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cjo2.list_change_type) + c1cjo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJO redact(C1CJO c1cjo) {
            C1CJP c1cjpNewBuilder = c1cjo.newBuilder();
            c1cjpNewBuilder.clearUnknownFields();
            return c1cjpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJO c1cjo) {
            C1CJO c1cjo2 = c1cjo;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cjo2.list_change_type);
            protoWriter.writeBytes(c1cjo2.unknownFields());
        }
    };
    public static final Long DEFAULT_LIST_CHANGE_TYPE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long list_change_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.list_change_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CJP newBuilder() {
        C1CJP c1cjp = new C1CJP();
        c1cjp.LIZLLL = this.list_change_type;
        c1cjp.addUnknownFields(unknownFields());
        return c1cjp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", list_change_type=");
        sb.append(this.list_change_type);
        sb.replace(0, 2, "LinkMicImListChangeModel{");
        sb.append('}');
        return sb.toString();
    }

    public C1CJO(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJO)) {
            return false;
        }
        C1CJO c1cjo = (C1CJO) obj;
        if (unknownFields().equals(c1cjo.unknownFields()) && this.list_change_type.equals(c1cjo.list_change_type)) {
            return true;
        }
        return false;
    }

    public C1CJO(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.list_change_type = l;
    }
}
