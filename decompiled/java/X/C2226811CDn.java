package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226811CDn extends Message<C2226811CDn, C2226831CDp> {
    public static final ProtoAdapter<C2226811CDn> ADAPTER = new ProtoAdapter<C2226811CDn>() { // from class: X.1CDo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226811CDn decode(ProtoReader protoReader) {
            C2226831CDp c2226831CDp = new C2226831CDp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226831CDp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226831CDp.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226831CDp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226811CDn c2226811CDn) {
            C2226811CDn c2226811CDn2 = c2226811CDn;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2226811CDn2.mute) + c2226811CDn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226811CDn redact(C2226811CDn c2226811CDn) {
            C2226831CDp c2226831CDpNewBuilder = c2226811CDn.newBuilder();
            c2226831CDpNewBuilder.clearUnknownFields();
            return c2226831CDpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226811CDn c2226811CDn) {
            C2226811CDn c2226811CDn2 = c2226811CDn;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2226811CDn2.mute);
            protoWriter.writeBytes(c2226811CDn2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean mute;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226831CDp newBuilder() {
        C2226831CDp c2226831CDp = new C2226831CDp();
        c2226831CDp.LIZLLL = this.mute;
        c2226831CDp.addUnknownFields(unknownFields());
        return c2226831CDp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mute=");
        sb.append(this.mute);
        sb.replace(0, 2, "FuncParamsXad4678e957538517{");
        sb.append('}');
        return sb.toString();
    }

    public C2226811CDn(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226811CDn)) {
            return false;
        }
        C2226811CDn c2226811CDn = (C2226811CDn) obj;
        if (unknownFields().equals(c2226811CDn.unknownFields()) && this.mute.equals(c2226811CDn.mute)) {
            return true;
        }
        return false;
    }

    public C2226811CDn(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mute = bool;
    }
}
