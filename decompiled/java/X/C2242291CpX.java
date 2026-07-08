package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242291CpX extends Message<C2242291CpX, C2242311CpZ> {
    public static final ProtoAdapter<C2242291CpX> ADAPTER = new ProtoAdapter<C2242291CpX>() { // from class: X.1CpY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242291CpX decode(ProtoReader protoReader) {
            C2242311CpZ c2242311CpZ = new C2242311CpZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2242311CpZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2242311CpZ.LIZLLL = C2244541CtA.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242311CpZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242291CpX c2242291CpX) {
            C2242291CpX c2242291CpX2 = c2242291CpX;
            return C2244541CtA.ADAPTER.encodedSizeWithTag(200, c2242291CpX2.streak_cmd) + c2242291CpX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242291CpX redact(C2242291CpX c2242291CpX) {
            C2242311CpZ c2242311CpZNewBuilder = c2242291CpX.newBuilder();
            C2244541CtA c2244541CtA = c2242311CpZNewBuilder.LIZLLL;
            if (c2244541CtA != null) {
                c2242311CpZNewBuilder.LIZLLL = C2244541CtA.ADAPTER.redact(c2244541CtA);
            }
            c2242311CpZNewBuilder.clearUnknownFields();
            return c2242311CpZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242291CpX c2242291CpX) {
            C2242291CpX c2242291CpX2 = c2242291CpX;
            C2244541CtA.ADAPTER.encodeWithTag(protoWriter, 200, c2242291CpX2.streak_cmd);
            protoWriter.writeBytes(c2242291CpX2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakCommandMessage#ADAPTER", tag = 200)
    public final C2244541CtA streak_cmd;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244541CtA c2244541CtA = this.streak_cmd;
        int iHashCode2 = iHashCode + (c2244541CtA != null ? c2244541CtA.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2242311CpZ newBuilder() {
        C2242311CpZ c2242311CpZ = new C2242311CpZ();
        c2242311CpZ.LIZLLL = this.streak_cmd;
        c2242311CpZ.addUnknownFields(unknownFields());
        return c2242311CpZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streak_cmd != null) {
            sb.append(", streak_cmd=");
            sb.append(this.streak_cmd);
        }
        sb.replace(0, 2, "StreakMessageContent{");
        sb.append('}');
        return sb.toString();
    }

    public C2242291CpX(C2244541CtA c2244541CtA) {
        this(c2244541CtA, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242291CpX)) {
            return false;
        }
        C2242291CpX c2242291CpX = (C2242291CpX) obj;
        if (unknownFields().equals(c2242291CpX.unknownFields()) && C1516540pZE.LJ(this.streak_cmd, c2242291CpX.streak_cmd)) {
            return true;
        }
        return false;
    }

    public C2242291CpX(C2244541CtA c2244541CtA, ByteString byteString) {
        super(ADAPTER, byteString);
        this.streak_cmd = c2244541CtA;
    }
}
