package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226441CCc extends Message<C2226441CCc, C2226461CCe> {
    public static final ProtoAdapter<C2226441CCc> ADAPTER = new ProtoAdapter<C2226441CCc>() { // from class: X.1CCd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226441CCc decode(ProtoReader protoReader) {
            C2226461CCe c2226461CCe = new C2226461CCe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226461CCe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226461CCe.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226461CCe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226441CCc c2226441CCc) {
            C2226441CCc c2226441CCc2 = c2226441CCc;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226441CCc2.invite_source) + c2226441CCc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226441CCc redact(C2226441CCc c2226441CCc) {
            C2226461CCe c2226461CCeNewBuilder = c2226441CCc.newBuilder();
            c2226461CCeNewBuilder.clearUnknownFields();
            return c2226461CCeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226441CCc c2226441CCc) {
            C2226441CCc c2226441CCc2 = c2226441CCc;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226441CCc2.invite_source);
            protoWriter.writeBytes(c2226441CCc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String invite_source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.invite_source;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2226461CCe newBuilder() {
        C2226461CCe c2226461CCe = new C2226461CCe();
        c2226461CCe.LIZLLL = this.invite_source;
        c2226461CCe.addUnknownFields(unknownFields());
        return c2226461CCe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.invite_source != null) {
            sb.append(", invite_source=");
            sb.append(this.invite_source);
        }
        sb.replace(0, 2, "StreakInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2226441CCc(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226441CCc)) {
            return false;
        }
        C2226441CCc c2226441CCc = (C2226441CCc) obj;
        if (unknownFields().equals(c2226441CCc.unknownFields()) && C1516540pZE.LJ(this.invite_source, c2226441CCc.invite_source)) {
            return true;
        }
        return false;
    }

    public C2226441CCc(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invite_source = str;
    }
}
