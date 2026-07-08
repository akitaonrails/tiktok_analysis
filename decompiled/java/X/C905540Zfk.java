package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905540Zfk extends Message<C905540Zfk, C905610Zfr> {
    public static final ProtoAdapter<C905540Zfk> ADAPTER = new ProtoAdapter<C905540Zfk>() { // from class: X.0Zfl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905540Zfk decode(ProtoReader protoReader) {
            C905610Zfr c905610Zfr = new C905610Zfr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c905610Zfr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c905610Zfr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905610Zfr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905540Zfk c905540Zfk) {
            C905540Zfk c905540Zfk2 = c905540Zfk;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c905540Zfk2.chat_bubble_id) + c905540Zfk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905540Zfk redact(C905540Zfk c905540Zfk) {
            C905610Zfr c905610ZfrNewBuilder = c905540Zfk.newBuilder();
            c905610ZfrNewBuilder.clearUnknownFields();
            return c905610ZfrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905540Zfk c905540Zfk) {
            C905540Zfk c905540Zfk2 = c905540Zfk;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c905540Zfk2.chat_bubble_id);
            protoWriter.writeBytes(c905540Zfk2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHAT_BUBBLE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long chat_bubble_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.chat_bubble_id;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C905610Zfr newBuilder() {
        C905610Zfr c905610Zfr = new C905610Zfr();
        c905610Zfr.LIZLLL = this.chat_bubble_id;
        c905610Zfr.addUnknownFields(unknownFields());
        return c905610Zfr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.chat_bubble_id != null) {
            sb.append(", chat_bubble_id=");
            sb.append(this.chat_bubble_id);
        }
        sb.replace(0, 2, "MessageStyleInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C905540Zfk(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905540Zfk)) {
            return false;
        }
        C905540Zfk c905540Zfk = (C905540Zfk) obj;
        if (unknownFields().equals(c905540Zfk.unknownFields()) && C1516540pZE.LJ(this.chat_bubble_id, c905540Zfk.chat_bubble_id)) {
            return true;
        }
        return false;
    }

    public C905540Zfk(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_bubble_id = l;
    }
}
