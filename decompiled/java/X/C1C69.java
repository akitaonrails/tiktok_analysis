package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C69, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C69 extends Message<C1C69, C1C6B> {
    public static final ProtoAdapter<C1C69> ADAPTER = new ProtoAdapter<C1C69>() { // from class: X.1C6A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C69 decode(ProtoReader protoReader) {
            C1C6B c1c6b = new C1C6B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c6b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c6b.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C69 c1c69) {
            C1C69 c1c692 = c1c69;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c692.b_frame_mode) + c1c692.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C69 redact(C1C69 c1c69) {
            C1C6B c1c6bNewBuilder = c1c69.newBuilder();
            c1c6bNewBuilder.clearUnknownFields();
            return c1c6bNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C69 c1c69) {
            C1C69 c1c692 = c1c69;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c692.b_frame_mode);
            protoWriter.writeBytes(c1c692.unknownFields());
        }
    };
    public static final Long DEFAULT_B_FRAME_MODE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long b_frame_mode;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.b_frame_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C6B newBuilder() {
        C1C6B c1c6b = new C1C6B();
        c1c6b.LIZLLL = this.b_frame_mode;
        c1c6b.addUnknownFields(unknownFields());
        return c1c6b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", b_frame_mode=");
        sb.append(this.b_frame_mode);
        sb.replace(0, 2, "FuncParamsX136d789e2bcbd7f7{");
        sb.append('}');
        return sb.toString();
    }

    public C1C69(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C69)) {
            return false;
        }
        C1C69 c1c69 = (C1C69) obj;
        if (unknownFields().equals(c1c69.unknownFields()) && this.b_frame_mode.equals(c1c69.b_frame_mode)) {
            return true;
        }
        return false;
    }

    public C1C69(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.b_frame_mode = l;
    }
}
