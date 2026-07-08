package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CE6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE6 extends Message<C1CE6, C1CE7> {
    public static final ProtoAdapter<C1CE6> ADAPTER = new ProtoAdapter<C1CE6>() { // from class: X.1CE5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE6 decode(ProtoReader protoReader) {
            C1CE7 c1ce7 = new C1CE7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ce7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ce7.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ce7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CE6 c1ce6) {
            C1CE6 c1ce62 = c1ce6;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1ce62.enabled) + c1ce62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE6 redact(C1CE6 c1ce6) {
            C1CE7 c1ce7NewBuilder = c1ce6.newBuilder();
            c1ce7NewBuilder.clearUnknownFields();
            return c1ce7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CE6 c1ce6) {
            C1CE6 c1ce62 = c1ce6;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1ce62.enabled);
            protoWriter.writeBytes(c1ce62.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ENABLED = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enabled;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CE7 newBuilder() {
        C1CE7 c1ce7 = new C1CE7();
        c1ce7.LIZLLL = this.enabled;
        c1ce7.addUnknownFields(unknownFields());
        return c1ce7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        sb.replace(0, 2, "HistoryVisibilityExt{");
        sb.append('}');
        return sb.toString();
    }

    public C1CE6(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CE6)) {
            return false;
        }
        C1CE6 c1ce6 = (C1CE6) obj;
        if (unknownFields().equals(c1ce6.unknownFields()) && C1516540pZE.LJ(this.enabled, c1ce6.enabled)) {
            return true;
        }
        return false;
    }

    public C1CE6(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
    }
}
