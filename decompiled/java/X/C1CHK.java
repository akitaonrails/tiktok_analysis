package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHK extends Message<C1CHK, C1CHM> {
    public static final ProtoAdapter<C1CHK> ADAPTER = new ProtoAdapter<C1CHK>() { // from class: X.1CHL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHK decode(ProtoReader protoReader) {
            C1CHM c1chm = new C1CHM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1chm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1chm.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1chm.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHK c1chk) {
            C1CHK c1chk2 = c1chk;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1chk2.is_explosive) + protoAdapter.encodedSizeWithTag(2, c1chk2.is_ai) + c1chk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHK redact(C1CHK c1chk) {
            C1CHM c1chmNewBuilder = c1chk.newBuilder();
            c1chmNewBuilder.clearUnknownFields();
            return c1chmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHK c1chk) {
            C1CHK c1chk2 = c1chk;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1chk2.is_explosive);
            protoAdapter.encodeWithTag(protoWriter, 2, c1chk2.is_ai);
            protoWriter.writeBytes(c1chk2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_AI;
    public static final Boolean DEFAULT_IS_EXPLOSIVE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_ai;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean is_explosive;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_EXPLOSIVE = bool;
        DEFAULT_IS_AI = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_explosive;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_ai;
        int iHashCode3 = iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CHM newBuilder() {
        C1CHM c1chm = new C1CHM();
        c1chm.LIZLLL = this.is_explosive;
        c1chm.LJ = this.is_ai;
        c1chm.addUnknownFields(unknownFields());
        return c1chm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_explosive != null) {
            sb.append(", is_explosive=");
            sb.append(this.is_explosive);
        }
        if (this.is_ai != null) {
            sb.append(", is_ai=");
            sb.append(this.is_ai);
        }
        sb.replace(0, 2, "PropertyItemBizExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHK)) {
            return false;
        }
        C1CHK c1chk = (C1CHK) obj;
        if (unknownFields().equals(c1chk.unknownFields()) && C1516540pZE.LJ(this.is_explosive, c1chk.is_explosive) && C1516540pZE.LJ(this.is_ai, c1chk.is_ai)) {
            return true;
        }
        return false;
    }

    public C1CHK(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public C1CHK(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_explosive = bool;
        this.is_ai = bool2;
    }
}
