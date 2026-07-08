package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905520Zfi extends Message<C905520Zfi, C905590Zfp> {
    public static final ProtoAdapter<C905520Zfi> ADAPTER = new ProtoAdapter<C905520Zfi>() { // from class: X.0Zfj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905520Zfi decode(ProtoReader protoReader) {
            C905590Zfp c905590Zfp = new C905590Zfp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c905590Zfp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c905590Zfp.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c905590Zfp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905590Zfp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905520Zfi c905520Zfi) {
            C905520Zfi c905520Zfi2 = c905520Zfi;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c905520Zfi2.reply_source_msg_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c905520Zfi2.reply_business_unique_id) + c905520Zfi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905520Zfi redact(C905520Zfi c905520Zfi) {
            C905590Zfp c905590ZfpNewBuilder = c905520Zfi.newBuilder();
            c905590ZfpNewBuilder.clearUnknownFields();
            return c905590ZfpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905520Zfi c905520Zfi) {
            C905520Zfi c905520Zfi2 = c905520Zfi;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c905520Zfi2.reply_source_msg_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c905520Zfi2.reply_business_unique_id);
            protoWriter.writeBytes(c905520Zfi2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPLY_SOURCE_MSG_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String reply_business_unique_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long reply_source_msg_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.reply_source_msg_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.reply_business_unique_id;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C905590Zfp newBuilder() {
        C905590Zfp c905590Zfp = new C905590Zfp();
        c905590Zfp.LIZLLL = this.reply_source_msg_id;
        c905590Zfp.LJ = this.reply_business_unique_id;
        c905590Zfp.addUnknownFields(unknownFields());
        return c905590Zfp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reply_source_msg_id != null) {
            sb.append(", reply_source_msg_id=");
            sb.append(this.reply_source_msg_id);
        }
        if (this.reply_business_unique_id != null) {
            sb.append(", reply_business_unique_id=");
            sb.append(this.reply_business_unique_id);
        }
        sb.replace(0, 2, "ReplyPayload{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905520Zfi)) {
            return false;
        }
        C905520Zfi c905520Zfi = (C905520Zfi) obj;
        if (unknownFields().equals(c905520Zfi.unknownFields()) && C1516540pZE.LJ(this.reply_source_msg_id, c905520Zfi.reply_source_msg_id) && C1516540pZE.LJ(this.reply_business_unique_id, c905520Zfi.reply_business_unique_id)) {
            return true;
        }
        return false;
    }

    public C905520Zfi(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C905520Zfi(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reply_source_msg_id = l;
        this.reply_business_unique_id = str;
    }
}
