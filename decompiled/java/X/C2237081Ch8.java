package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ch8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237081Ch8 extends Message<C2237081Ch8, C2237101ChA> {
    public static final ProtoAdapter<C2237081Ch8> ADAPTER = new ProtoAdapter<C2237081Ch8>() { // from class: X.1Ch9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237081Ch8 decode(ProtoReader protoReader) {
            C2237101ChA c2237101ChA = new C2237101ChA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237101ChA.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237101ChA.LIZLLL = C2237061Ch6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237101ChA.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237081Ch8 c2237081Ch8) {
            C2237081Ch8 c2237081Ch82 = c2237081Ch8;
            return C2237061Ch6.ADAPTER.encodedSizeWithTag(1, c2237081Ch82.message) + c2237081Ch82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237081Ch8 redact(C2237081Ch8 c2237081Ch8) {
            C2237101ChA c2237101ChANewBuilder = c2237081Ch8.newBuilder();
            c2237101ChANewBuilder.LIZLLL = C2237061Ch6.ADAPTER.redact(c2237101ChANewBuilder.LIZLLL);
            c2237101ChANewBuilder.clearUnknownFields();
            return c2237101ChANewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237081Ch8 c2237081Ch8) {
            C2237081Ch8 c2237081Ch82 = c2237081Ch8;
            C2237061Ch6.ADAPTER.encodeWithTag(protoWriter, 1, c2237081Ch82.message);
            protoWriter.writeBytes(c2237081Ch82.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBaseMessage#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2237061Ch6 message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237101ChA newBuilder() {
        C2237101ChA c2237101ChA = new C2237101ChA();
        c2237101ChA.LIZLLL = this.message;
        c2237101ChA.addUnknownFields(unknownFields());
        return c2237101ChA;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", message=");
        sb.append(this.message);
        sb.replace(0, 2, "FuncParamsXca36c171fe8337bd{");
        sb.append('}');
        return sb.toString();
    }

    public C2237081Ch8(C2237061Ch6 c2237061Ch6) {
        this(c2237061Ch6, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237081Ch8)) {
            return false;
        }
        C2237081Ch8 c2237081Ch8 = (C2237081Ch8) obj;
        if (unknownFields().equals(c2237081Ch8.unknownFields()) && this.message.equals(c2237081Ch8.message)) {
            return true;
        }
        return false;
    }

    public C2237081Ch8(C2237061Ch6 c2237061Ch6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = c2237061Ch6;
    }
}
