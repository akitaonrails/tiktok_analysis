package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNE extends Message<C1CNE, C1CNG> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;
    public static final ProtoAdapter<C1CNE> ADAPTER = new ProtoAdapter<C1CNE>() { // from class: X.1CNF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNE decode(ProtoReader protoReader) {
            C1CNG c1cng = new C1CNG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cng.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cng.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1cng.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cng.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNE c1cne) {
            C1CNE c1cne2 = c1cne;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cne2.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1cne2.position) + c1cne2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNE redact(C1CNE c1cne) {
            C1CNG c1cngNewBuilder = c1cne.newBuilder();
            c1cngNewBuilder.clearUnknownFields();
            return c1cngNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNE c1cne) {
            C1CNE c1cne2 = c1cne;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cne2.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c1cne2.position);
            protoWriter.writeBytes(c1cne2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_POSITION = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.user_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.position;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CNG newBuilder() {
        C1CNG c1cng = new C1CNG();
        c1cng.LIZLLL = this.user_id;
        c1cng.LJ = this.position;
        c1cng.addUnknownFields(unknownFields());
        return c1cng;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        sb.replace(0, 2, "AIGroupShotUserInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNE)) {
            return false;
        }
        C1CNE c1cne = (C1CNE) obj;
        if (unknownFields().equals(c1cne.unknownFields()) && C1516540pZE.LJ(this.user_id, c1cne.user_id) && C1516540pZE.LJ(this.position, c1cne.position)) {
            return true;
        }
        return false;
    }

    public C1CNE(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public C1CNE(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.position = num;
    }
}
