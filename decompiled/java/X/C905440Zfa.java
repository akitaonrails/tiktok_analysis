package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905440Zfa extends Message<C905440Zfa, C905580Zfo> {
    public static final ProtoAdapter<C905440Zfa> ADAPTER = new ProtoAdapter<C905440Zfa>() { // from class: X.0ZfZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905440Zfa decode(ProtoReader protoReader) {
            C905580Zfo c905580Zfo = new C905580Zfo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c905580Zfo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c905580Zfo.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c905580Zfo.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c905580Zfo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905580Zfo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905440Zfa c905440Zfa) {
            C905440Zfa c905440Zfa2 = c905440Zfa;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c905440Zfa2.reply_source_msg_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c905440Zfa2.reply_source_unique_id) + protoAdapter.encodedSizeWithTag(3, c905440Zfa2.client_message_id_for_reply) + c905440Zfa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905440Zfa redact(C905440Zfa c905440Zfa) {
            C905580Zfo c905580ZfoNewBuilder = c905440Zfa.newBuilder();
            c905580ZfoNewBuilder.clearUnknownFields();
            return c905580ZfoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905440Zfa c905440Zfa) {
            C905440Zfa c905440Zfa2 = c905440Zfa;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c905440Zfa2.reply_source_msg_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c905440Zfa2.reply_source_unique_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c905440Zfa2.client_message_id_for_reply);
            protoWriter.writeBytes(c905440Zfa2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPLY_SOURCE_MSG_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String client_message_id_for_reply;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long reply_source_msg_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String reply_source_unique_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.reply_source_msg_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.reply_source_unique_id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.client_message_id_for_reply;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C905580Zfo newBuilder() {
        C905580Zfo c905580Zfo = new C905580Zfo();
        c905580Zfo.LIZLLL = this.reply_source_msg_id;
        c905580Zfo.LJ = this.reply_source_unique_id;
        c905580Zfo.LJFF = this.client_message_id_for_reply;
        c905580Zfo.addUnknownFields(unknownFields());
        return c905580Zfo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reply_source_msg_id != null) {
            sb.append(", reply_source_msg_id=");
            sb.append(this.reply_source_msg_id);
        }
        if (this.reply_source_unique_id != null) {
            sb.append(", reply_source_unique_id=");
            sb.append(this.reply_source_unique_id);
        }
        if (this.client_message_id_for_reply != null) {
            sb.append(", client_message_id_for_reply=");
            sb.append(this.client_message_id_for_reply);
        }
        sb.replace(0, 2, "ReplySourcePayload{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905440Zfa)) {
            return false;
        }
        C905440Zfa c905440Zfa = (C905440Zfa) obj;
        if (unknownFields().equals(c905440Zfa.unknownFields()) && C1516540pZE.LJ(this.reply_source_msg_id, c905440Zfa.reply_source_msg_id) && C1516540pZE.LJ(this.reply_source_unique_id, c905440Zfa.reply_source_unique_id) && C1516540pZE.LJ(this.client_message_id_for_reply, c905440Zfa.client_message_id_for_reply)) {
            return true;
        }
        return false;
    }

    public C905440Zfa(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public C905440Zfa(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reply_source_msg_id = l;
        this.reply_source_unique_id = str;
        this.client_message_id_for_reply = str2;
    }
}
