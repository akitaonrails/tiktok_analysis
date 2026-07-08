package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231461CVk extends Message<C2231461CVk, C2231481CVm> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 4)
    public final ByteString cohost_resp_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long msg_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double receive_timestamp;
    public static final ProtoAdapter<C2231461CVk> ADAPTER = new ProtoAdapter<C2231461CVk>() { // from class: X.1CVl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231461CVk decode(ProtoReader protoReader) {
            C2231481CVm c2231481CVm = new C2231481CVm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2231481CVm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2231481CVm.LJI = ProtoAdapter.BYTES.decode(protoReader);
                                }
                            } else {
                                c2231481CVm.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c2231481CVm.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2231481CVm.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231481CVm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231461CVk c2231461CVk) {
            C2231461CVk c2231461CVk2 = c2231461CVk;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2231461CVk2.msg_id) + protoAdapter.encodedSizeWithTag(2, c2231461CVk2.group_channel_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c2231461CVk2.receive_timestamp) + ProtoAdapter.BYTES.encodedSizeWithTag(4, c2231461CVk2.cohost_resp_extra) + c2231461CVk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231461CVk redact(C2231461CVk c2231461CVk) {
            C2231481CVm c2231481CVmNewBuilder = c2231461CVk.newBuilder();
            c2231481CVmNewBuilder.clearUnknownFields();
            return c2231481CVmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231461CVk c2231461CVk) {
            C2231461CVk c2231461CVk2 = c2231461CVk;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2231461CVk2.msg_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2231461CVk2.group_channel_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c2231461CVk2.receive_timestamp);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, c2231461CVk2.cohost_resp_extra);
            protoWriter.writeBytes(c2231461CVk2.unknownFields());
        }
    };
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final Double DEFAULT_RECEIVE_TIMESTAMP = Double.valueOf(0.0d);
    public static final ByteString DEFAULT_COHOST_RESP_EXTRA = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.msg_id.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.receive_timestamp.hashCode()) * 37;
        ByteString byteString = this.cohost_resp_extra;
        int iHashCode2 = iHashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2231481CVm newBuilder() {
        C2231481CVm c2231481CVm = new C2231481CVm();
        c2231481CVm.LIZLLL = this.msg_id;
        c2231481CVm.LJ = this.group_channel_id;
        c2231481CVm.LJFF = this.receive_timestamp;
        c2231481CVm.LJI = this.cohost_resp_extra;
        c2231481CVm.addUnknownFields(unknownFields());
        return c2231481CVm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_id=");
        sb.append(this.msg_id);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", receive_timestamp=");
        sb.append(this.receive_timestamp);
        if (this.cohost_resp_extra != null) {
            sb.append(", cohost_resp_extra=");
            sb.append(this.cohost_resp_extra);
        }
        sb.replace(0, 2, "LinkMicListChangeExtraInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231461CVk)) {
            return false;
        }
        C2231461CVk c2231461CVk = (C2231461CVk) obj;
        if (unknownFields().equals(c2231461CVk.unknownFields()) && this.msg_id.equals(c2231461CVk.msg_id) && this.group_channel_id.equals(c2231461CVk.group_channel_id) && this.receive_timestamp.equals(c2231461CVk.receive_timestamp) && C1516540pZE.LJ(this.cohost_resp_extra, c2231461CVk.cohost_resp_extra)) {
            return true;
        }
        return false;
    }

    public C2231461CVk(Long l, Long l2, Double d, ByteString byteString) {
        this(l, l2, d, byteString, ByteString.EMPTY);
    }

    public C2231461CVk(Long l, Long l2, Double d, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.msg_id = l;
        this.group_channel_id = l2;
        this.receive_timestamp = d;
        this.cohost_resp_extra = byteString;
    }
}
