package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240191Cm9 extends Message<C2240191Cm9, C2240211CmB> {
    public static final ProtoAdapter<C2240191Cm9> ADAPTER = new ProtoAdapter<C2240191Cm9>() { // from class: X.1CmA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240191Cm9 decode(ProtoReader protoReader) {
            C2240211CmB c2240211CmB = new C2240211CmB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2240211CmB.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2240211CmB.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240211CmB.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240191Cm9 c2240191Cm9) {
            C2240191Cm9 c2240191Cm92 = c2240191Cm9;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2240191Cm92.text) + c2240191Cm92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240191Cm9 redact(C2240191Cm9 c2240191Cm9) {
            C2240211CmB c2240211CmBNewBuilder = c2240191Cm9.newBuilder();
            c2240211CmBNewBuilder.clearUnknownFields();
            return c2240211CmBNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240191Cm9 c2240191Cm9) {
            C2240191Cm9 c2240191Cm92 = c2240191Cm9;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2240191Cm92.text);
            protoWriter.writeBytes(c2240191Cm92.unknownFields());
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
    public C2240211CmB newBuilder() {
        C2240211CmB c2240211CmB = new C2240211CmB();
        c2240211CmB.LIZLLL = this.text;
        c2240211CmB.addUnknownFields(unknownFields());
        return c2240211CmB;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        sb.replace(0, 2, "MarkdownStreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public C2240191Cm9(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240191Cm9)) {
            return false;
        }
        C2240191Cm9 c2240191Cm9 = (C2240191Cm9) obj;
        if (unknownFields().equals(c2240191Cm9.unknownFields()) && C1516540pZE.LJ(this.text, c2240191Cm9.text)) {
            return true;
        }
        return false;
    }

    public C2240191Cm9(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
