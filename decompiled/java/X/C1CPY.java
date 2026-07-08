package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPY extends Message<C1CPY, C2229801CPa> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long create_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 1)
    public final ByteString streak_pet_message_content;
    public static final ProtoAdapter<C1CPY> ADAPTER = new ProtoAdapter<C1CPY>() { // from class: X.1CPZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPY decode(ProtoReader protoReader) {
            C2229801CPa c2229801CPa = new C2229801CPa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229801CPa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2229801CPa.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2229801CPa.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229801CPa.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229801CPa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPY c1cpy) {
            C1CPY c1cpy2 = c1cpy;
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, c1cpy2.streak_pet_message_content) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cpy2.scene) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1cpy2.create_time) + c1cpy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPY redact(C1CPY c1cpy) {
            C2229801CPa c2229801CPaNewBuilder = c1cpy.newBuilder();
            c2229801CPaNewBuilder.clearUnknownFields();
            return c2229801CPaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPY c1cpy) {
            C1CPY c1cpy2 = c1cpy;
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, c1cpy2.streak_pet_message_content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cpy2.scene);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1cpy2.create_time);
            protoWriter.writeBytes(c1cpy2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_STREAK_PET_MESSAGE_CONTENT = ByteString.EMPTY;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.streak_pet_message_content;
        int iHashCode2 = (iHashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.scene;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.create_time;
        int iHashCode4 = iHashCode3 + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2229801CPa newBuilder() {
        C2229801CPa c2229801CPa = new C2229801CPa();
        c2229801CPa.LIZLLL = this.streak_pet_message_content;
        c2229801CPa.LJ = this.scene;
        c2229801CPa.LJFF = this.create_time;
        c2229801CPa.addUnknownFields(unknownFields());
        return c2229801CPa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streak_pet_message_content != null) {
            sb.append(", streak_pet_message_content=");
            sb.append(this.streak_pet_message_content);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        sb.replace(0, 2, "StreakPetStatusValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPY)) {
            return false;
        }
        C1CPY c1cpy = (C1CPY) obj;
        if (unknownFields().equals(c1cpy.unknownFields()) && C1516540pZE.LJ(this.streak_pet_message_content, c1cpy.streak_pet_message_content) && C1516540pZE.LJ(this.scene, c1cpy.scene) && C1516540pZE.LJ(this.create_time, c1cpy.create_time)) {
            return true;
        }
        return false;
    }

    public C1CPY(ByteString byteString, String str, Long l) {
        this(byteString, str, l, ByteString.EMPTY);
    }

    public C1CPY(ByteString byteString, String str, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.streak_pet_message_content = byteString;
        this.scene = str;
        this.create_time = l;
    }
}
