package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0R extends Message<C1D0R, C1D0S> {
    public static final ProtoAdapter<C1D0R> ADAPTER = new ProtoAdapter<C1D0R>() { // from class: X.1D0Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0R decode(ProtoReader protoReader) {
            C1D0S c1d0s = new C1D0S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d0s.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1d0s.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1d0s.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d0s.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D0R c1d0r) {
            C1D0R c1d0r2 = c1d0r;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1d0r2.isMaf) + protoAdapter.encodedSizeWithTag(2, c1d0r2.isMuf) + c1d0r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0R redact(C1D0R c1d0r) {
            C1D0S c1d0sNewBuilder = c1d0r.newBuilder();
            c1d0sNewBuilder.clearUnknownFields();
            return c1d0sNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D0R c1d0r) {
            C1D0R c1d0r2 = c1d0r;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d0r2.isMaf);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d0r2.isMuf);
            protoWriter.writeBytes(c1d0r2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ISMAF;
    public static final Boolean DEFAULT_ISMUF;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean isMaf;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean isMuf;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_ISMAF = bool;
        DEFAULT_ISMUF = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.isMaf;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.isMuf;
        int iHashCode3 = iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1D0S newBuilder() {
        C1D0S c1d0s = new C1D0S();
        c1d0s.LIZLLL = this.isMaf;
        c1d0s.LJ = this.isMuf;
        c1d0s.addUnknownFields(unknownFields());
        return c1d0s;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isMaf != null) {
            sb.append(", isMaf=");
            sb.append(this.isMaf);
        }
        if (this.isMuf != null) {
            sb.append(", isMuf=");
            sb.append(this.isMuf);
        }
        sb.replace(0, 2, "UserRelationStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1D0R)) {
            return false;
        }
        C1D0R c1d0r = (C1D0R) obj;
        if (unknownFields().equals(c1d0r.unknownFields()) && C1516540pZE.LJ(this.isMaf, c1d0r.isMaf) && C1516540pZE.LJ(this.isMuf, c1d0r.isMuf)) {
            return true;
        }
        return false;
    }

    public C1D0R(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public C1D0R(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.isMaf = bool;
        this.isMuf = bool2;
    }
}
