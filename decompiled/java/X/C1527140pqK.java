package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527140pqK extends Message<C1527140pqK, C1527230pqT> {
    public static final ProtoAdapter<C1527140pqK> ADAPTER = new ProtoAdapter<C1527140pqK>() { // from class: X.0pqM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527140pqK decode(ProtoReader protoReader) {
            C1527230pqT c1527230pqT = new C1527230pqT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1527230pqT.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1527230pqT.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527230pqT.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527140pqK c1527140pqK) {
            C1527140pqK c1527140pqK2 = c1527140pqK;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1527140pqK2.cursor) + c1527140pqK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527140pqK redact(C1527140pqK c1527140pqK) {
            C1527230pqT c1527230pqTNewBuilder = c1527140pqK.newBuilder();
            c1527230pqTNewBuilder.clearUnknownFields();
            return c1527230pqTNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527140pqK c1527140pqK) {
            C1527140pqK c1527140pqK2 = c1527140pqK;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1527140pqK2.cursor);
            protoWriter.writeBytes(c1527140pqK2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long cursor;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.cursor.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1527230pqT newBuilder() {
        C1527230pqT c1527230pqT = new C1527230pqT();
        c1527230pqT.LIZLLL = this.cursor;
        c1527230pqT.addUnknownFields(unknownFields());
        return c1527230pqT;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.replace(0, 2, "BsyncCursor{");
        sb.append('}');
        return sb.toString();
    }

    public C1527140pqK(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527140pqK)) {
            return false;
        }
        C1527140pqK c1527140pqK = (C1527140pqK) obj;
        if (unknownFields().equals(c1527140pqK.unknownFields()) && this.cursor.equals(c1527140pqK.cursor)) {
            return true;
        }
        return false;
    }

    public C1527140pqK(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
    }
}
