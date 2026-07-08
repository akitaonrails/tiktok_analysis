package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CA9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA9 extends Message<C1CA9, C1CAA> {
    public static final ProtoAdapter<C1CA9> ADAPTER = new ProtoAdapter<C1CA9>() { // from class: X.1CA8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA9 decode(ProtoReader protoReader) {
            C1CAA c1caa = new C1CAA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 201) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1caa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1caa.LIZLLL = C1CA6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1caa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CA9 c1ca9) {
            C1CA9 c1ca92 = c1ca9;
            return C1CA6.ADAPTER.encodedSizeWithTag(201, c1ca92.streak_pet_cmd) + c1ca92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA9 redact(C1CA9 c1ca9) {
            C1CAA c1caaNewBuilder = c1ca9.newBuilder();
            C1CA6 c1ca6 = c1caaNewBuilder.LIZLLL;
            if (c1ca6 != null) {
                c1caaNewBuilder.LIZLLL = C1CA6.ADAPTER.redact(c1ca6);
            }
            c1caaNewBuilder.clearUnknownFields();
            return c1caaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CA9 c1ca9) {
            C1CA9 c1ca92 = c1ca9;
            C1CA6.ADAPTER.encodeWithTag(protoWriter, 201, c1ca92.streak_pet_cmd);
            protoWriter.writeBytes(c1ca92.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetCommandMessage#ADAPTER", tag = 201)
    public final C1CA6 streak_pet_cmd;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1CA6 c1ca6 = this.streak_pet_cmd;
        int iHashCode2 = iHashCode + (c1ca6 != null ? c1ca6.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CAA newBuilder() {
        C1CAA c1caa = new C1CAA();
        c1caa.LIZLLL = this.streak_pet_cmd;
        c1caa.addUnknownFields(unknownFields());
        return c1caa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streak_pet_cmd != null) {
            sb.append(", streak_pet_cmd=");
            sb.append(this.streak_pet_cmd);
        }
        sb.replace(0, 2, "StreakPetMessageContent{");
        sb.append('}');
        return sb.toString();
    }

    public C1CA9(C1CA6 c1ca6) {
        this(c1ca6, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CA9)) {
            return false;
        }
        C1CA9 c1ca9 = (C1CA9) obj;
        if (unknownFields().equals(c1ca9.unknownFields()) && C1516540pZE.LJ(this.streak_pet_cmd, c1ca9.streak_pet_cmd)) {
            return true;
        }
        return false;
    }

    public C1CA9(C1CA6 c1ca6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.streak_pet_cmd = c1ca6;
    }
}
