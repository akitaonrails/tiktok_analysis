package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240101Cm0 extends Message<C2240101Cm0, C2240111Cm1> {
    public static final ProtoAdapter<C2240101Cm0> ADAPTER = new ProtoAdapter<C2240101Cm0>() { // from class: X.1Clz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240101Cm0 decode(ProtoReader protoReader) {
            C2240111Cm1 c2240111Cm1 = new C2240111Cm1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2240111Cm1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2240111Cm1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240111Cm1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240101Cm0 c2240101Cm0) {
            C2240101Cm0 c2240101Cm02 = c2240101Cm0;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2240101Cm02.text) + c2240101Cm02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240101Cm0 redact(C2240101Cm0 c2240101Cm0) {
            C2240111Cm1 c2240111Cm1NewBuilder = c2240101Cm0.newBuilder();
            c2240111Cm1NewBuilder.clearUnknownFields();
            return c2240111Cm1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240101Cm0 c2240101Cm0) {
            C2240101Cm0 c2240101Cm02 = c2240101Cm0;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2240101Cm02.text);
            protoWriter.writeBytes(c2240101Cm02.unknownFields());
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
    public C2240111Cm1 newBuilder() {
        C2240111Cm1 c2240111Cm1 = new C2240111Cm1();
        c2240111Cm1.LIZLLL = this.text;
        c2240111Cm1.addUnknownFields(unknownFields());
        return c2240111Cm1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        sb.replace(0, 2, "TextStreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public C2240101Cm0(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240101Cm0)) {
            return false;
        }
        C2240101Cm0 c2240101Cm0 = (C2240101Cm0) obj;
        if (unknownFields().equals(c2240101Cm0.unknownFields()) && C1516540pZE.LJ(this.text, c2240101Cm0.text)) {
            return true;
        }
        return false;
    }

    public C2240101Cm0(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
