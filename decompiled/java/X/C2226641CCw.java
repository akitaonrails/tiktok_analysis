package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226641CCw extends Message<C2226641CCw, C2226661CCy> {
    public static final ProtoAdapter<C2226641CCw> ADAPTER = new ProtoAdapter<C2226641CCw>() { // from class: X.1CCx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226641CCw decode(ProtoReader protoReader) {
            C2226661CCy c2226661CCy = new C2226661CCy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226661CCy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226661CCy.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2226661CCy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226661CCy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226641CCw c2226641CCw) {
            C2226641CCw c2226641CCw2 = c2226641CCw;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226641CCw2.layout_key) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2226641CCw2.callback) + c2226641CCw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226641CCw redact(C2226641CCw c2226641CCw) {
            C2226661CCy c2226661CCyNewBuilder = c2226641CCw.newBuilder();
            c2226661CCyNewBuilder.clearUnknownFields();
            return c2226661CCyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226641CCw c2226641CCw) {
            C2226641CCw c2226641CCw2 = c2226641CCw;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226641CCw2.layout_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2226641CCw2.callback);
            protoWriter.writeBytes(c2226641CCw2.unknownFields());
        }
    };
    public static final Long DEFAULT_CALLBACK = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.layout_key.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226661CCy newBuilder() {
        C2226661CCy c2226661CCy = new C2226661CCy();
        c2226661CCy.LIZLLL = this.layout_key;
        c2226661CCy.LJ = this.callback;
        c2226661CCy.addUnknownFields(unknownFields());
        return c2226661CCy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX76d01dd92cfaf4e5{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226641CCw)) {
            return false;
        }
        C2226641CCw c2226641CCw = (C2226641CCw) obj;
        if (unknownFields().equals(c2226641CCw.unknownFields()) && this.layout_key.equals(c2226641CCw.layout_key) && this.callback.equals(c2226641CCw.callback)) {
            return true;
        }
        return false;
    }

    public C2226641CCw(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C2226641CCw(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_key = str;
        this.callback = l;
    }
}
