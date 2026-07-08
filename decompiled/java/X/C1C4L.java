package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4L extends Message<C1C4L, C1C4N> {
    public static final ProtoAdapter<C1C4L> ADAPTER = new ProtoAdapter<C1C4L>() { // from class: X.1C4M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4L decode(ProtoReader protoReader) {
            C1C4N c1c4n = new C1C4N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c4n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c4n.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4L c1c4l) {
            C1C4L c1c4l2 = c1c4l;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c4l2.timer_id) + c1c4l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4L redact(C1C4L c1c4l) {
            C1C4N c1c4nNewBuilder = c1c4l.newBuilder();
            c1c4nNewBuilder.clearUnknownFields();
            return c1c4nNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C4L c1c4l) {
            C1C4L c1c4l2 = c1c4l;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1c4l2.timer_id);
            protoWriter.writeBytes(c1c4l2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String timer_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.timer_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C4N newBuilder() {
        C1C4N c1c4n = new C1C4N();
        c1c4n.LIZLLL = this.timer_id;
        c1c4n.addUnknownFields(unknownFields());
        return c1c4n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", timer_id=");
        sb.append(this.timer_id);
        sb.replace(0, 2, "FuncParamsXaf222b4412ce421e{");
        sb.append('}');
        return sb.toString();
    }

    public C1C4L(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C4L)) {
            return false;
        }
        C1C4L c1c4l = (C1C4L) obj;
        if (unknownFields().equals(c1c4l.unknownFields()) && this.timer_id.equals(c1c4l.timer_id)) {
            return true;
        }
        return false;
    }

    public C1C4L(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timer_id = str;
    }
}
