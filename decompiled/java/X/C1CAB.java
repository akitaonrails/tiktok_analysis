package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAB extends Message<C1CAB, C1CAD> {
    public static final ProtoAdapter<C1CAB> ADAPTER = new ProtoAdapter<C1CAB>() { // from class: X.1CAC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAB decode(ProtoReader protoReader) {
            C1CAD c1cad = new C1CAD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cad.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cad.LIZLLL = C1CA6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cad.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAB c1cab) {
            C1CAB c1cab2 = c1cab;
            return C1CA6.ADAPTER.encodedSizeWithTag(1, c1cab2.streak_pet_cmd) + c1cab2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAB redact(C1CAB c1cab) {
            C1CAD c1cadNewBuilder = c1cab.newBuilder();
            C1CA6 c1ca6 = c1cadNewBuilder.LIZLLL;
            if (c1ca6 != null) {
                c1cadNewBuilder.LIZLLL = C1CA6.ADAPTER.redact(c1ca6);
            }
            c1cadNewBuilder.clearUnknownFields();
            return c1cadNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CAB c1cab) {
            C1CAB c1cab2 = c1cab;
            C1CA6.ADAPTER.encodeWithTag(protoWriter, 1, c1cab2.streak_pet_cmd);
            protoWriter.writeBytes(c1cab2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetCommandMessage#ADAPTER", tag = 1)
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
    public C1CAD newBuilder() {
        C1CAD c1cad = new C1CAD();
        c1cad.LIZLLL = this.streak_pet_cmd;
        c1cad.addUnknownFields(unknownFields());
        return c1cad;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streak_pet_cmd != null) {
            sb.append(", streak_pet_cmd=");
            sb.append(this.streak_pet_cmd);
        }
        sb.replace(0, 2, "StreakPetRefreshValue{");
        sb.append('}');
        return sb.toString();
    }

    public C1CAB(C1CA6 c1ca6) {
        this(c1ca6, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CAB)) {
            return false;
        }
        C1CAB c1cab = (C1CAB) obj;
        if (unknownFields().equals(c1cab.unknownFields()) && C1516540pZE.LJ(this.streak_pet_cmd, c1cab.streak_pet_cmd)) {
            return true;
        }
        return false;
    }

    public C1CAB(C1CA6 c1ca6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.streak_pet_cmd = c1ca6;
    }
}
