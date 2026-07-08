package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227361CFq extends Message<C2227361CFq, C2227371CFr> {
    public static final ProtoAdapter<C2227361CFq> ADAPTER = new ProtoAdapter<C2227361CFq>() { // from class: X.1CFp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227361CFq decode(ProtoReader protoReader) {
            C2227371CFr c2227371CFr = new C2227371CFr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227371CFr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227371CFr.LJ = C1CEH.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227371CFr.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227371CFr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227361CFq c2227361CFq) {
            C2227361CFq c2227361CFq2 = c2227361CFq;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2227361CFq2.player) + C1CEH.ADAPTER.encodedSizeWithTag(2, c2227361CFq2.invitee_pos) + c2227361CFq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227361CFq redact(C2227361CFq c2227361CFq) {
            C2227371CFr c2227371CFrNewBuilder = c2227361CFq.newBuilder();
            c2227371CFrNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2227371CFrNewBuilder.LIZLLL);
            C1CEH c1ceh = c2227371CFrNewBuilder.LJ;
            if (c1ceh != null) {
                c2227371CFrNewBuilder.LJ = C1CEH.ADAPTER.redact(c1ceh);
            }
            c2227371CFrNewBuilder.clearUnknownFields();
            return c2227371CFrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227361CFq c2227361CFq) {
            C2227361CFq c2227361CFq2 = c2227361CFq;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2227361CFq2.player);
            C1CEH.ADAPTER.encodeWithTag(protoWriter, 2, c2227361CFq2.invitee_pos);
            protoWriter.writeBytes(c2227361CFq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPositionData#ADAPTER", tag = 2)
    public final C1CEH invitee_pos;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo player;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.player.hashCode()) * 37;
        C1CEH c1ceh = this.invitee_pos;
        int iHashCode2 = iHashCode + (c1ceh != null ? c1ceh.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227371CFr newBuilder() {
        C2227371CFr c2227371CFr = new C2227371CFr();
        c2227371CFr.LIZLLL = this.player;
        c2227371CFr.LJ = this.invitee_pos;
        c2227371CFr.addUnknownFields(unknownFields());
        return c2227371CFr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", player=");
        sb.append(this.player);
        if (this.invitee_pos != null) {
            sb.append(", invitee_pos=");
            sb.append(this.invitee_pos);
        }
        sb.replace(0, 2, "LinkMicInviteeParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227361CFq)) {
            return false;
        }
        C2227361CFq c2227361CFq = (C2227361CFq) obj;
        if (unknownFields().equals(c2227361CFq.unknownFields()) && this.player.equals(c2227361CFq.player) && C1516540pZE.LJ(this.invitee_pos, c2227361CFq.invitee_pos)) {
            return true;
        }
        return false;
    }

    public C2227361CFq(C2232021CXo c2232021CXo, C1CEH c1ceh) {
        this(c2232021CXo, c1ceh, ByteString.EMPTY);
    }

    public C2227361CFq(C2232021CXo c2232021CXo, C1CEH c1ceh, ByteString byteString) {
        super(ADAPTER, byteString);
        this.player = c2232021CXo;
        this.invitee_pos = c1ceh;
    }
}
