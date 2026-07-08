package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227631CGr extends Message<C2227631CGr, C2227641CGs> {
    public static final ProtoAdapter<C2227631CGr> ADAPTER = new ProtoAdapter<C2227631CGr>() { // from class: X.1CGq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227631CGr decode(ProtoReader protoReader) {
            C2227641CGs c2227641CGs = new C2227641CGs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227641CGs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227641CGs.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227641CGs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227631CGr c2227631CGr) {
            C2227631CGr c2227631CGr2 = c2227631CGr;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227631CGr2.not_suggest_to_uid) + c2227631CGr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227631CGr redact(C2227631CGr c2227631CGr) {
            C2227641CGs c2227641CGsNewBuilder = c2227631CGr.newBuilder();
            c2227641CGsNewBuilder.clearUnknownFields();
            return c2227641CGsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227631CGr c2227631CGr) {
            C2227631CGr c2227631CGr2 = c2227631CGr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227631CGr2.not_suggest_to_uid);
            protoWriter.writeBytes(c2227631CGr2.unknownFields());
        }
    };
    public static final Long DEFAULT_NOT_SUGGEST_TO_UID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long not_suggest_to_uid;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.not_suggest_to_uid.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227641CGs newBuilder() {
        C2227641CGs c2227641CGs = new C2227641CGs();
        c2227641CGs.LIZLLL = this.not_suggest_to_uid;
        c2227641CGs.addUnknownFields(unknownFields());
        return c2227641CGs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", not_suggest_to_uid=");
        sb.append(this.not_suggest_to_uid);
        sb.replace(0, 2, "LinkMicBizLeaveGroupParams{");
        sb.append('}');
        return sb.toString();
    }

    public C2227631CGr(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227631CGr)) {
            return false;
        }
        C2227631CGr c2227631CGr = (C2227631CGr) obj;
        if (unknownFields().equals(c2227631CGr.unknownFields()) && this.not_suggest_to_uid.equals(c2227631CGr.not_suggest_to_uid)) {
            return true;
        }
        return false;
    }

    public C2227631CGr(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.not_suggest_to_uid = l;
    }
}
