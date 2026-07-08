package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228541CKe extends Message<C2228541CKe, C2228561CKg> {
    public static final ProtoAdapter<C2228541CKe> ADAPTER = new ProtoAdapter<C2228541CKe>() { // from class: X.1CKf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228541CKe decode(ProtoReader protoReader) {
            C2228561CKg c2228561CKg = new C2228561CKg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228561CKg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228561CKg.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2228561CKg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228561CKg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228541CKe c2228541CKe) {
            C2228541CKe c2228541CKe2 = c2228541CKe;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228541CKe2.stream_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2228541CKe2.mute) + c2228541CKe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228541CKe redact(C2228541CKe c2228541CKe) {
            C2228561CKg c2228561CKgNewBuilder = c2228541CKe.newBuilder();
            c2228561CKgNewBuilder.clearUnknownFields();
            return c2228561CKgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228541CKe c2228541CKe) {
            C2228541CKe c2228541CKe2 = c2228541CKe;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228541CKe2.stream_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2228541CKe2.mute);
            protoWriter.writeBytes(c2228541CKe2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37) + this.mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228561CKg newBuilder() {
        C2228561CKg c2228561CKg = new C2228561CKg();
        c2228561CKg.LIZLLL = this.stream_id;
        c2228561CKg.LJ = this.mute;
        c2228561CKg.addUnknownFields(unknownFields());
        return c2228561CKg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", mute=");
        sb.append(this.mute);
        sb.replace(0, 2, "FuncParamsX63dc3fb523989f70{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228541CKe)) {
            return false;
        }
        C2228541CKe c2228541CKe = (C2228541CKe) obj;
        if (unknownFields().equals(c2228541CKe.unknownFields()) && this.stream_id.equals(c2228541CKe.stream_id) && this.mute.equals(c2228541CKe.mute)) {
            return true;
        }
        return false;
    }

    public C2228541CKe(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public C2228541CKe(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.mute = bool;
    }
}
