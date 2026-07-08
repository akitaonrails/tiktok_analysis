package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225661C9c extends Message<C2225661C9c, C2225681C9e> {
    public static final ProtoAdapter<C2225661C9c> ADAPTER = new ProtoAdapter<C2225661C9c>() { // from class: X.1C9d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225661C9c decode(ProtoReader protoReader) {
            C2225681C9e c2225681C9e = new C2225681C9e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225681C9e.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225681C9e.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225681C9e.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225661C9c c2225661C9c) {
            C2225661C9c c2225661C9c2 = c2225661C9c;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2225661C9c2.should_change) + c2225661C9c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225661C9c redact(C2225661C9c c2225661C9c) {
            C2225681C9e c2225681C9eNewBuilder = c2225661C9c.newBuilder();
            c2225681C9eNewBuilder.clearUnknownFields();
            return c2225681C9eNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225661C9c c2225661C9c) {
            C2225661C9c c2225661C9c2 = c2225661C9c;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2225661C9c2.should_change);
            protoWriter.writeBytes(c2225661C9c2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SHOULD_CHANGE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean should_change;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.should_change.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225681C9e newBuilder() {
        C2225681C9e c2225681C9e = new C2225681C9e();
        c2225681C9e.LIZLLL = this.should_change;
        c2225681C9e.addUnknownFields(unknownFields());
        return c2225681C9e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", should_change=");
        sb.append(this.should_change);
        sb.replace(0, 2, "FuncParamsX14548b63e16ba2db{");
        sb.append('}');
        return sb.toString();
    }

    public C2225661C9c(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225661C9c)) {
            return false;
        }
        C2225661C9c c2225661C9c = (C2225661C9c) obj;
        if (unknownFields().equals(c2225661C9c.unknownFields()) && this.should_change.equals(c2225661C9c.should_change)) {
            return true;
        }
        return false;
    }

    public C2225661C9c(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.should_change = bool;
    }
}
