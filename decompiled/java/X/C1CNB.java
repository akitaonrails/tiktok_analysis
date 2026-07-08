package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNB extends Message<C1CNB, C1CND> {
    public static final ProtoAdapter<C1CNB> ADAPTER = new ProtoAdapter<C1CNB>() { // from class: X.1CNC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNB decode(ProtoReader protoReader) {
            C1CND c1cnd = new C1CND();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cnd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cnd.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cnd.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNB c1cnb) {
            C1CNB c1cnb2 = c1cnb;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cnb2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cnb2.user_id) + c1cnb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNB redact(C1CNB c1cnb) {
            C1CND c1cndNewBuilder = c1cnb.newBuilder();
            c1cndNewBuilder.clearUnknownFields();
            return c1cndNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNB c1cnb) {
            C1CNB c1cnb2 = c1cnb;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cnb2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cnb2.user_id);
            protoWriter.writeBytes(c1cnb2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long user_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.conversation_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.user_id;
        int iHashCode3 = iHashCode2 + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CND newBuilder() {
        C1CND c1cnd = new C1CND();
        c1cnd.LIZLLL = this.conversation_id;
        c1cnd.LJ = this.user_id;
        c1cnd.addUnknownFields(unknownFields());
        return c1cnd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        sb.replace(0, 2, "StickerCreationResultEntity{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNB)) {
            return false;
        }
        C1CNB c1cnb = (C1CNB) obj;
        if (unknownFields().equals(c1cnb.unknownFields()) && C1516540pZE.LJ(this.conversation_id, c1cnb.conversation_id) && C1516540pZE.LJ(this.user_id, c1cnb.user_id)) {
            return true;
        }
        return false;
    }

    public C1CNB(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1CNB(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.user_id = l;
    }
}
