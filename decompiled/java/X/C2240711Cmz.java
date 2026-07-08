package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240711Cmz extends Message<C2240711Cmz, C2240721Cn0> {
    public static final ProtoAdapter<C2240711Cmz> ADAPTER = new ProtoAdapter<C2240711Cmz>() { // from class: X.1Cmy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240711Cmz decode(ProtoReader protoReader) {
            C2240721Cn0 c2240721Cn0 = new C2240721Cn0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2240721Cn0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2240721Cn0.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240721Cn0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240711Cmz c2240711Cmz) {
            C2240711Cmz c2240711Cmz2 = c2240711Cmz;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2240711Cmz2.text) + c2240711Cmz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240711Cmz redact(C2240711Cmz c2240711Cmz) {
            C2240721Cn0 c2240721Cn0NewBuilder = c2240711Cmz.newBuilder();
            c2240721Cn0NewBuilder.clearUnknownFields();
            return c2240721Cn0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240711Cmz c2240711Cmz) {
            C2240711Cmz c2240711Cmz2 = c2240711Cmz;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2240711Cmz2.text);
            protoWriter.writeBytes(c2240711Cmz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2240721Cn0 newBuilder() {
        C2240721Cn0 c2240721Cn0 = new C2240721Cn0();
        c2240721Cn0.LIZLLL = this.text;
        c2240721Cn0.addUnknownFields(unknownFields());
        return c2240721Cn0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        sb.replace(0, 2, "VisualPoetBotText{");
        sb.append('}');
        return sb.toString();
    }

    public C2240711Cmz(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240711Cmz)) {
            return false;
        }
        C2240711Cmz c2240711Cmz = (C2240711Cmz) obj;
        if (unknownFields().equals(c2240711Cmz.unknownFields()) && C1516540pZE.LJ(this.text, c2240711Cmz.text)) {
            return true;
        }
        return false;
    }

    public C2240711Cmz(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
