package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225801C9q extends Message<C2225801C9q, C2225821C9s> {
    public static final ProtoAdapter<C2225801C9q> ADAPTER = new ProtoAdapter<C2225801C9q>() { // from class: X.1C9r
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225801C9q decode(ProtoReader protoReader) {
            C2225821C9s c2225821C9s = new C2225821C9s();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2225821C9s.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2225821C9s.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c2225821C9s.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225821C9s.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225801C9q c2225801C9q) {
            C2225801C9q c2225801C9q2 = c2225801C9q;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2225801C9q2.event_key) + this.LIZ.encodedSizeWithTag(2, c2225801C9q2.params) + c2225801C9q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225801C9q redact(C2225801C9q c2225801C9q) {
            C2225821C9s c2225821C9sNewBuilder = c2225801C9q.newBuilder();
            c2225821C9sNewBuilder.clearUnknownFields();
            return c2225821C9sNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225801C9q c2225801C9q) {
            C2225801C9q c2225801C9q2 = c2225801C9q;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2225801C9q2.event_key);
            this.LIZ.encodeWithTag(protoWriter, 2, c2225801C9q2.params);
            protoWriter.writeBytes(c2225801C9q2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String event_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, String> params;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.event_key.hashCode()) * 37) + this.params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225821C9s newBuilder() {
        C2225821C9s c2225821C9s = new C2225821C9s();
        c2225821C9s.LIZLLL = this.event_key;
        c2225821C9s.LJ = C1516540pZE.LIZLLL("params", this.params);
        c2225821C9s.addUnknownFields(unknownFields());
        return c2225821C9s;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event_key=");
        sb.append(this.event_key);
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        sb.replace(0, 2, "LinkMicStatEvent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225801C9q)) {
            return false;
        }
        C2225801C9q c2225801C9q = (C2225801C9q) obj;
        if (unknownFields().equals(c2225801C9q.unknownFields()) && this.event_key.equals(c2225801C9q.event_key) && this.params.equals(c2225801C9q.params)) {
            return true;
        }
        return false;
    }

    public C2225801C9q(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public C2225801C9q(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_key = str;
        this.params = C1516540pZE.LJI("params", map);
    }
}
