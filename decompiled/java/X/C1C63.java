package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C63, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C63 extends Message<C1C63, C1C65> {
    public static final ProtoAdapter<C1C63> ADAPTER = new ProtoAdapter<C1C63>() { // from class: X.1C64
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C63 decode(ProtoReader protoReader) {
            C1C65 c1c65 = new C1C65();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c65.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c65.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c65.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C63 c1c63) {
            C1C63 c1c632 = c1c63;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c632.invitee_uid) + c1c632.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C63 redact(C1C63 c1c63) {
            C1C65 c1c65NewBuilder = c1c63.newBuilder();
            c1c65NewBuilder.clearUnknownFields();
            return c1c65NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C63 c1c63) {
            C1C63 c1c632 = c1c63;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c632.invitee_uid);
            protoWriter.writeBytes(c1c632.unknownFields());
        }
    };
    public static final Long DEFAULT_INVITEE_UID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long invitee_uid;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.invitee_uid.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C65 newBuilder() {
        C1C65 c1c65 = new C1C65();
        c1c65.LIZLLL = this.invitee_uid;
        c1c65.addUnknownFields(unknownFields());
        return c1c65;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invitee_uid=");
        sb.append(this.invitee_uid);
        sb.replace(0, 2, "FuncParamsX1281e724f8eeffff{");
        sb.append('}');
        return sb.toString();
    }

    public C1C63(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C63)) {
            return false;
        }
        C1C63 c1c63 = (C1C63) obj;
        if (unknownFields().equals(c1c63.unknownFields()) && this.invitee_uid.equals(c1c63.invitee_uid)) {
            return true;
        }
        return false;
    }

    public C1C63(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitee_uid = l;
    }
}
