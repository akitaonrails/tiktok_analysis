package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHU extends Message<C1CHU, C1CHV> {
    public static final ProtoAdapter<C1CHU> ADAPTER = new ProtoAdapter<C1CHU>() { // from class: X.1CHT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHU decode(ProtoReader protoReader) {
            C1CHV c1chv = new C1CHV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1chv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1chv.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHU c1chu) {
            C1CHU c1chu2 = c1chu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1chu2.transcript_text) + c1chu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHU redact(C1CHU c1chu) {
            C1CHV c1chvNewBuilder = c1chu.newBuilder();
            c1chvNewBuilder.clearUnknownFields();
            return c1chvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHU c1chu) {
            C1CHU c1chu2 = c1chu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1chu2.transcript_text);
            protoWriter.writeBytes(c1chu2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String transcript_text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.transcript_text;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CHV newBuilder() {
        C1CHV c1chv = new C1CHV();
        c1chv.LIZLLL = this.transcript_text;
        c1chv.addUnknownFields(unknownFields());
        return c1chv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.transcript_text != null) {
            sb.append(", transcript_text=");
            sb.append(this.transcript_text);
        }
        sb.replace(0, 2, "TnSData{");
        sb.append('}');
        return sb.toString();
    }

    public C1CHU(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CHU)) {
            return false;
        }
        C1CHU c1chu = (C1CHU) obj;
        if (unknownFields().equals(c1chu.unknownFields()) && C1516540pZE.LJ(this.transcript_text, c1chu.transcript_text)) {
            return true;
        }
        return false;
    }

    public C1CHU(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.transcript_text = str;
    }
}
