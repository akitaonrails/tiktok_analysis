package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243211Cr1 extends Message<C2243211Cr1, C2243251Cr5> {
    public static final ProtoAdapter<C2243211Cr1> ADAPTER = new ProtoAdapter<C2243211Cr1>() { // from class: X.1Cr2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243211Cr1 decode(ProtoReader protoReader) {
            C2243251Cr5 c2243251Cr5 = new C2243251Cr5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2243251Cr5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2243251Cr5.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2243251Cr5.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243251Cr5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243211Cr1 c2243211Cr1) {
            C2243211Cr1 c2243211Cr12 = c2243211Cr1;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2243211Cr12.message_tips) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2243211Cr12.show_message) + c2243211Cr12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243211Cr1 redact(C2243211Cr1 c2243211Cr1) {
            C2243251Cr5 c2243251Cr5NewBuilder = c2243211Cr1.newBuilder();
            c2243251Cr5NewBuilder.clearUnknownFields();
            return c2243251Cr5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243211Cr1 c2243211Cr1) {
            C2243211Cr1 c2243211Cr12 = c2243211Cr1;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2243211Cr12.message_tips);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2243211Cr12.show_message);
            protoWriter.writeBytes(c2243211Cr12.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SHOW_MESSAGE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String message_tips;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean show_message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.message_tips;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.show_message;
        int iHashCode3 = iHashCode2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2243251Cr5 newBuilder() {
        C2243251Cr5 c2243251Cr5 = new C2243251Cr5();
        c2243251Cr5.LIZLLL = this.message_tips;
        c2243251Cr5.LJ = this.show_message;
        c2243251Cr5.addUnknownFields(unknownFields());
        return c2243251Cr5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message_tips != null) {
            sb.append(", message_tips=");
            sb.append(this.message_tips);
        }
        if (this.show_message != null) {
            sb.append(", show_message=");
            sb.append(this.show_message);
        }
        sb.replace(0, 2, "FortuneCookieInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243211Cr1)) {
            return false;
        }
        C2243211Cr1 c2243211Cr1 = (C2243211Cr1) obj;
        if (unknownFields().equals(c2243211Cr1.unknownFields()) && C1516540pZE.LJ(this.message_tips, c2243211Cr1.message_tips) && C1516540pZE.LJ(this.show_message, c2243211Cr1.show_message)) {
            return true;
        }
        return false;
    }

    public C2243211Cr1(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public C2243211Cr1(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_tips = str;
        this.show_message = bool;
    }
}
