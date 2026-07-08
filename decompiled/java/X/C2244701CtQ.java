package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244701CtQ extends Message<C2244701CtQ, C2244721CtS> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String question;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String reply;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long topic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String topic_name;
    public static final ProtoAdapter<C2244701CtQ> ADAPTER = new ProtoAdapter<C2244701CtQ>() { // from class: X.1CtR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244701CtQ decode(ProtoReader protoReader) {
            C2244721CtS c2244721CtS = new C2244721CtS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2244721CtS.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2244721CtS.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2244721CtS.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2244721CtS.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2244721CtS.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2244721CtS.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244721CtS.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244701CtQ c2244701CtQ) {
            C2244701CtQ c2244701CtQ2 = c2244701CtQ;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2244701CtQ2.topic_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2244701CtQ2.topic_name) + protoAdapter2.encodedSizeWithTag(3, c2244701CtQ2.question) + protoAdapter2.encodedSizeWithTag(4, c2244701CtQ2.reply) + protoAdapter.encodedSizeWithTag(5, c2244701CtQ2.message_id) + c2244701CtQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244701CtQ redact(C2244701CtQ c2244701CtQ) {
            C2244721CtS c2244721CtSNewBuilder = c2244701CtQ.newBuilder();
            c2244721CtSNewBuilder.clearUnknownFields();
            return c2244721CtSNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244701CtQ c2244701CtQ) {
            C2244701CtQ c2244701CtQ2 = c2244701CtQ;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244701CtQ2.topic_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2244701CtQ2.topic_name);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2244701CtQ2.question);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2244701CtQ2.reply);
            protoAdapter.encodeWithTag(protoWriter, 5, c2244701CtQ2.message_id);
            protoWriter.writeBytes(c2244701CtQ2.unknownFields());
        }
    };
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_MESSAGE_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.topic_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.topic_name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.question;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.reply;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l2 = this.message_id;
        int iHashCode6 = iHashCode5 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2244721CtS newBuilder() {
        C2244721CtS c2244721CtS = new C2244721CtS();
        c2244721CtS.LIZLLL = this.topic_id;
        c2244721CtS.LJ = this.topic_name;
        c2244721CtS.LJFF = this.question;
        c2244721CtS.LJI = this.reply;
        c2244721CtS.LJII = this.message_id;
        c2244721CtS.addUnknownFields(unknownFields());
        return c2244721CtS;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.topic_id != null) {
            sb.append(", topic_id=");
            sb.append(this.topic_id);
        }
        if (this.topic_name != null) {
            sb.append(", topic_name=");
            sb.append(this.topic_name);
        }
        if (this.question != null) {
            sb.append(", question=");
            sb.append(this.question);
        }
        if (this.reply != null) {
            sb.append(", reply=");
            sb.append(this.reply);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.replace(0, 2, "ActionParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244701CtQ)) {
            return false;
        }
        C2244701CtQ c2244701CtQ = (C2244701CtQ) obj;
        if (unknownFields().equals(c2244701CtQ.unknownFields()) && C1516540pZE.LJ(this.topic_id, c2244701CtQ.topic_id) && C1516540pZE.LJ(this.topic_name, c2244701CtQ.topic_name) && C1516540pZE.LJ(this.question, c2244701CtQ.question) && C1516540pZE.LJ(this.reply, c2244701CtQ.reply) && C1516540pZE.LJ(this.message_id, c2244701CtQ.message_id)) {
            return true;
        }
        return false;
    }

    public C2244701CtQ(Long l, String str, String str2, String str3, Long l2) {
        this(l, str, str2, str3, l2, ByteString.EMPTY);
    }

    public C2244701CtQ(Long l, String str, String str2, String str3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic_id = l;
        this.topic_name = str;
        this.question = str2;
        this.reply = str3;
        this.message_id = l2;
    }
}
