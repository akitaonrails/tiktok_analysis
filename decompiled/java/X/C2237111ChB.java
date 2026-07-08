package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237111ChB extends Message<C2237111ChB, C2237131ChD> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long native_after_decode_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long native_im_sdk_received_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long native_msg_from;
    public static final ProtoAdapter<C2237111ChB> ADAPTER = new ProtoAdapter<C2237111ChB>() { // from class: X.1ChC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237111ChB decode(ProtoReader protoReader) {
            C2237131ChD c2237131ChD = new C2237131ChD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237131ChD.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2237131ChD.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2237131ChD.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237131ChD.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237131ChD.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237111ChB c2237111ChB) {
            C2237111ChB c2237111ChB2 = c2237111ChB;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2237111ChB2.native_im_sdk_received_time) + protoAdapter.encodedSizeWithTag(2, c2237111ChB2.native_after_decode_time) + protoAdapter.encodedSizeWithTag(3, c2237111ChB2.native_msg_from) + c2237111ChB2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237111ChB redact(C2237111ChB c2237111ChB) {
            C2237131ChD c2237131ChDNewBuilder = c2237111ChB.newBuilder();
            c2237131ChDNewBuilder.clearUnknownFields();
            return c2237131ChDNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237111ChB c2237111ChB) {
            C2237111ChB c2237111ChB2 = c2237111ChB;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2237111ChB2.native_im_sdk_received_time);
            protoAdapter.encodeWithTag(protoWriter, 2, c2237111ChB2.native_after_decode_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c2237111ChB2.native_msg_from);
            protoWriter.writeBytes(c2237111ChB2.unknownFields());
        }
    };
    public static final Long DEFAULT_NATIVE_IM_SDK_RECEIVED_TIME = 0L;
    public static final Long DEFAULT_NATIVE_AFTER_DECODE_TIME = 0L;
    public static final Long DEFAULT_NATIVE_MSG_FROM = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.native_im_sdk_received_time.hashCode()) * 37) + this.native_after_decode_time.hashCode()) * 37) + this.native_msg_from.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237131ChD newBuilder() {
        C2237131ChD c2237131ChD = new C2237131ChD();
        c2237131ChD.LIZLLL = this.native_im_sdk_received_time;
        c2237131ChD.LJ = this.native_after_decode_time;
        c2237131ChD.LJFF = this.native_msg_from;
        c2237131ChD.addUnknownFields(unknownFields());
        return c2237131ChD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", native_im_sdk_received_time=");
        sb.append(this.native_im_sdk_received_time);
        sb.append(", native_after_decode_time=");
        sb.append(this.native_after_decode_time);
        sb.append(", native_msg_from=");
        sb.append(this.native_msg_from);
        sb.replace(0, 2, "LinkMicImMessageExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237111ChB)) {
            return false;
        }
        C2237111ChB c2237111ChB = (C2237111ChB) obj;
        if (unknownFields().equals(c2237111ChB.unknownFields()) && this.native_im_sdk_received_time.equals(c2237111ChB.native_im_sdk_received_time) && this.native_after_decode_time.equals(c2237111ChB.native_after_decode_time) && this.native_msg_from.equals(c2237111ChB.native_msg_from)) {
            return true;
        }
        return false;
    }

    public C2237111ChB(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C2237111ChB(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.native_im_sdk_received_time = l;
        this.native_after_decode_time = l2;
        this.native_msg_from = l3;
    }
}
