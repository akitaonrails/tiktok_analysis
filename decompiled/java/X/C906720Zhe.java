package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906720Zhe extends Message<C906720Zhe, C906740Zhg> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 6)
    public final Integer final_seq_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean interrupted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String reply_client_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long reply_server_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String send_client_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long send_server_message_id;
    public static final ProtoAdapter<C906720Zhe> ADAPTER = new ProtoAdapter<C906720Zhe>() { // from class: X.0Zhf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906720Zhe decode(ProtoReader protoReader) {
            C906740Zhg c906740Zhg = new C906740Zhg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c906740Zhg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c906740Zhg.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c906740Zhg.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c906740Zhg.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c906740Zhg.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c906740Zhg.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c906740Zhg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906740Zhg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906720Zhe c906720Zhe) {
            C906720Zhe c906720Zhe2 = c906720Zhe;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c906720Zhe2.send_client_message_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c906720Zhe2.send_server_message_id) + protoAdapter.encodedSizeWithTag(3, c906720Zhe2.reply_client_message_id) + protoAdapter2.encodedSizeWithTag(4, c906720Zhe2.reply_server_message_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c906720Zhe2.interrupted) + ProtoAdapter.INT32.encodedSizeWithTag(6, c906720Zhe2.final_seq_id) + c906720Zhe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906720Zhe redact(C906720Zhe c906720Zhe) {
            C906740Zhg c906740ZhgNewBuilder = c906720Zhe.newBuilder();
            c906740ZhgNewBuilder.clearUnknownFields();
            return c906740ZhgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906720Zhe c906720Zhe) {
            C906720Zhe c906720Zhe2 = c906720Zhe;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c906720Zhe2.send_client_message_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c906720Zhe2.send_server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c906720Zhe2.reply_client_message_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c906720Zhe2.reply_server_message_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c906720Zhe2.interrupted);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c906720Zhe2.final_seq_id);
            protoWriter.writeBytes(c906720Zhe2.unknownFields());
        }
    };
    public static final Long DEFAULT_SEND_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_REPLY_SERVER_MESSAGE_ID = 0L;
    public static final Boolean DEFAULT_INTERRUPTED = Boolean.FALSE;
    public static final Integer DEFAULT_FINAL_SEQ_ID = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.send_client_message_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.send_server_message_id;
        int iHashCode3 = ((((((((iHashCode2 + (l != null ? l.hashCode() : 0)) * 37) + this.reply_client_message_id.hashCode()) * 37) + this.reply_server_message_id.hashCode()) * 37) + this.interrupted.hashCode()) * 37) + this.final_seq_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C906740Zhg newBuilder() {
        C906740Zhg c906740Zhg = new C906740Zhg();
        c906740Zhg.LIZLLL = this.send_client_message_id;
        c906740Zhg.LJ = this.send_server_message_id;
        c906740Zhg.LJFF = this.reply_client_message_id;
        c906740Zhg.LJI = this.reply_server_message_id;
        c906740Zhg.LJII = this.interrupted;
        c906740Zhg.LJIIIIZZ = this.final_seq_id;
        c906740Zhg.addUnknownFields(unknownFields());
        return c906740Zhg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_client_message_id != null) {
            sb.append(", send_client_message_id=");
            sb.append(this.send_client_message_id);
        }
        if (this.send_server_message_id != null) {
            sb.append(", send_server_message_id=");
            sb.append(this.send_server_message_id);
        }
        sb.append(", reply_client_message_id=");
        sb.append(this.reply_client_message_id);
        sb.append(", reply_server_message_id=");
        sb.append(this.reply_server_message_id);
        sb.append(", interrupted=");
        sb.append(this.interrupted);
        sb.append(", final_seq_id=");
        sb.append(this.final_seq_id);
        sb.replace(0, 2, "tiktok_v2_im_interrupt_streaming_msg_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906720Zhe)) {
            return false;
        }
        C906720Zhe c906720Zhe = (C906720Zhe) obj;
        if (unknownFields().equals(c906720Zhe.unknownFields()) && C1516540pZE.LJ(this.send_client_message_id, c906720Zhe.send_client_message_id) && C1516540pZE.LJ(this.send_server_message_id, c906720Zhe.send_server_message_id) && this.reply_client_message_id.equals(c906720Zhe.reply_client_message_id) && this.reply_server_message_id.equals(c906720Zhe.reply_server_message_id) && this.interrupted.equals(c906720Zhe.interrupted) && this.final_seq_id.equals(c906720Zhe.final_seq_id)) {
            return true;
        }
        return false;
    }

    public C906720Zhe(String str, Long l, String str2, Long l2, Boolean bool, Integer num) {
        this(str, l, str2, l2, bool, num, ByteString.EMPTY);
    }

    public C906720Zhe(String str, Long l, String str2, Long l2, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_client_message_id = str;
        this.send_server_message_id = l;
        this.reply_client_message_id = str2;
        this.reply_server_message_id = l2;
        this.interrupted = bool;
        this.final_seq_id = num;
    }
}
