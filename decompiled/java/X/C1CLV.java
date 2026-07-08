package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLV extends Message<C1CLV, C1CLX> {
    public static final ProtoAdapter<C1CLV> ADAPTER = new ProtoAdapter<C1CLV>() { // from class: X.1CLW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLV decode(ProtoReader protoReader) {
            C1CLX c1clx = new C1CLX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1clx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1clx.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1clx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLV c1clv) {
            C1CLV c1clv2 = c1clv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1clv2.stream_id) + protoAdapter.encodedSizeWithTag(2, c1clv2.link_mic_id) + c1clv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLV redact(C1CLV c1clv) {
            C1CLX c1clxNewBuilder = c1clv.newBuilder();
            c1clxNewBuilder.clearUnknownFields();
            return c1clxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLV c1clv) {
            C1CLV c1clv2 = c1clv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1clv2.stream_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1clv2.link_mic_id);
            protoWriter.writeBytes(c1clv2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLX newBuilder() {
        C1CLX c1clx = new C1CLX();
        c1clx.LIZLLL = this.stream_id;
        c1clx.LJ = this.link_mic_id;
        c1clx.addUnknownFields(unknownFields());
        return c1clx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "LinkMicRtcAuxStreamInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLV)) {
            return false;
        }
        C1CLV c1clv = (C1CLV) obj;
        if (unknownFields().equals(c1clv.unknownFields()) && this.stream_id.equals(c1clv.stream_id) && this.link_mic_id.equals(c1clv.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CLV(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1CLV(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.link_mic_id = str2;
    }
}
