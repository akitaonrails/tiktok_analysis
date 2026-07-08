package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236421Cg4 extends Message<C2236421Cg4, C2236441Cg6> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long is_turn_off_invitation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long link_type;
    public static final ProtoAdapter<C2236421Cg4> ADAPTER = new ProtoAdapter<C2236421Cg4>() { // from class: X.1Cg5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236421Cg4 decode(ProtoReader protoReader) {
            C2236441Cg6 c2236441Cg6 = new C2236441Cg6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236441Cg6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236441Cg6.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236441Cg6.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236441Cg6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236421Cg4 c2236421Cg4) {
            C2236421Cg4 c2236421Cg42 = c2236421Cg4;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2236421Cg42.link_type) + protoAdapter.encodedSizeWithTag(2, c2236421Cg42.is_turn_off_invitation) + c2236421Cg42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236421Cg4 redact(C2236421Cg4 c2236421Cg4) {
            C2236441Cg6 c2236441Cg6NewBuilder = c2236421Cg4.newBuilder();
            c2236441Cg6NewBuilder.clearUnknownFields();
            return c2236441Cg6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236421Cg4 c2236421Cg4) {
            C2236421Cg4 c2236421Cg42 = c2236421Cg4;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236421Cg42.link_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c2236421Cg42.is_turn_off_invitation);
            protoWriter.writeBytes(c2236421Cg42.unknownFields());
        }
    };
    public static final Long DEFAULT_LINK_TYPE = 0L;
    public static final Long DEFAULT_IS_TURN_OFF_INVITATION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_type.hashCode()) * 37) + this.is_turn_off_invitation.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236441Cg6 newBuilder() {
        C2236441Cg6 c2236441Cg6 = new C2236441Cg6();
        c2236441Cg6.LIZLLL = this.link_type;
        c2236441Cg6.LJ = this.is_turn_off_invitation;
        c2236441Cg6.addUnknownFields(unknownFields());
        return c2236441Cg6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_type=");
        sb.append(this.link_type);
        sb.append(", is_turn_off_invitation=");
        sb.append(this.is_turn_off_invitation);
        sb.replace(0, 2, "LinkMicMultiLiveBizReplyParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236421Cg4)) {
            return false;
        }
        C2236421Cg4 c2236421Cg4 = (C2236421Cg4) obj;
        if (unknownFields().equals(c2236421Cg4.unknownFields()) && this.link_type.equals(c2236421Cg4.link_type) && this.is_turn_off_invitation.equals(c2236421Cg4.is_turn_off_invitation)) {
            return true;
        }
        return false;
    }

    public C2236421Cg4(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C2236421Cg4(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_type = l;
        this.is_turn_off_invitation = l2;
    }
}
