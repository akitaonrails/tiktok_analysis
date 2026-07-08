package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228461CJw extends Message<C2228461CJw, C2228471CJx> {
    public static final ProtoAdapter<C2228461CJw> ADAPTER = new ProtoAdapter<C2228461CJw>() { // from class: X.1CJv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228461CJw decode(ProtoReader protoReader) {
            C2228471CJx c2228471CJx = new C2228471CJx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228471CJx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228471CJx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228471CJx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228461CJw c2228461CJw) {
            C2228461CJw c2228461CJw2 = c2228461CJw;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228461CJw2.tenor_id) + c2228461CJw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228461CJw redact(C2228461CJw c2228461CJw) {
            C2228471CJx c2228471CJxNewBuilder = c2228461CJw.newBuilder();
            c2228471CJxNewBuilder.clearUnknownFields();
            return c2228471CJxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228461CJw c2228461CJw) {
            C2228461CJw c2228461CJw2 = c2228461CJw;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228461CJw2.tenor_id);
            protoWriter.writeBytes(c2228461CJw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String tenor_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.tenor_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2228471CJx newBuilder() {
        C2228471CJx c2228471CJx = new C2228471CJx();
        c2228471CJx.LIZLLL = this.tenor_id;
        c2228471CJx.addUnknownFields(unknownFields());
        return c2228471CJx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.tenor_id != null) {
            sb.append(", tenor_id=");
            sb.append(this.tenor_id);
        }
        sb.replace(0, 2, "TenorInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2228461CJw(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228461CJw)) {
            return false;
        }
        C2228461CJw c2228461CJw = (C2228461CJw) obj;
        if (unknownFields().equals(c2228461CJw.unknownFields()) && C1516540pZE.LJ(this.tenor_id, c2228461CJw.tenor_id)) {
            return true;
        }
        return false;
    }

    public C2228461CJw(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenor_id = str;
    }
}
