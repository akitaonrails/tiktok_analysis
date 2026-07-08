package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJR extends Message<C1CJR, C1CJS> {
    public static final ProtoAdapter<C1CJR> ADAPTER = new ProtoAdapter<C1CJR>() { // from class: X.1CJQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJR decode(ProtoReader protoReader) {
            C1CJS c1cjs = new C1CJS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cjs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cjs.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJR c1cjr) {
            C1CJR c1cjr2 = c1cjr;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cjr2.avatar_id) + c1cjr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJR redact(C1CJR c1cjr) {
            C1CJS c1cjsNewBuilder = c1cjr.newBuilder();
            c1cjsNewBuilder.clearUnknownFields();
            return c1cjsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJR c1cjr) {
            C1CJR c1cjr2 = c1cjr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cjr2.avatar_id);
            protoWriter.writeBytes(c1cjr2.unknownFields());
        }
    };
    public static final Long DEFAULT_AVATAR_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long avatar_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.avatar_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CJS newBuilder() {
        C1CJS c1cjs = new C1CJS();
        c1cjs.LIZLLL = this.avatar_id;
        c1cjs.addUnknownFields(unknownFields());
        return c1cjs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", avatar_id=");
        sb.append(this.avatar_id);
        sb.replace(0, 2, "LinkMicAvatarState{");
        sb.append('}');
        return sb.toString();
    }

    public C1CJR(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJR)) {
            return false;
        }
        C1CJR c1cjr = (C1CJR) obj;
        if (unknownFields().equals(c1cjr.unknownFields()) && this.avatar_id.equals(c1cjr.avatar_id)) {
            return true;
        }
        return false;
    }

    public C1CJR(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar_id = l;
    }
}
