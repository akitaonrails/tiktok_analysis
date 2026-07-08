package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225691C9f extends Message<C2225691C9f, C2225711C9h> {
    public static final ProtoAdapter<C2225691C9f> ADAPTER = new ProtoAdapter<C2225691C9f>() { // from class: X.1C9g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225691C9f decode(ProtoReader protoReader) {
            C2225711C9h c2225711C9h = new C2225711C9h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225711C9h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225711C9h.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225711C9h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225691C9f c2225691C9f) {
            C2225691C9f c2225691C9f2 = c2225691C9f;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2225691C9f2.need_render) + c2225691C9f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225691C9f redact(C2225691C9f c2225691C9f) {
            C2225711C9h c2225711C9hNewBuilder = c2225691C9f.newBuilder();
            c2225711C9hNewBuilder.clearUnknownFields();
            return c2225711C9hNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225691C9f c2225691C9f) {
            C2225691C9f c2225691C9f2 = c2225691C9f;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2225691C9f2.need_render);
            protoWriter.writeBytes(c2225691C9f2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_NEED_RENDER = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean need_render;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.need_render.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225711C9h newBuilder() {
        C2225711C9h c2225711C9h = new C2225711C9h();
        c2225711C9h.LIZLLL = this.need_render;
        c2225711C9h.addUnknownFields(unknownFields());
        return c2225711C9h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", need_render=");
        sb.append(this.need_render);
        sb.replace(0, 2, "FuncParamsX48192373498ebcf3{");
        sb.append('}');
        return sb.toString();
    }

    public C2225691C9f(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225691C9f)) {
            return false;
        }
        C2225691C9f c2225691C9f = (C2225691C9f) obj;
        if (unknownFields().equals(c2225691C9f.unknownFields()) && this.need_render.equals(c2225691C9f.need_render)) {
            return true;
        }
        return false;
    }

    public C2225691C9f(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_render = bool;
    }
}
