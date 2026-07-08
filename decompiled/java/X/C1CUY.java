package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUY extends Message<C1CUY, C2231101CUa> {
    public static final ProtoAdapter<C1CUY> ADAPTER = new ProtoAdapter<C1CUY>() { // from class: X.1CUZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUY decode(ProtoReader protoReader) {
            C2231101CUa c2231101CUa = new C2231101CUa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231101CUa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2231101CUa.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2231101CUa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231101CUa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CUY c1cuy) {
            C1CUY c1cuy2 = c1cuy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cuy2.link_mic_id) + protoAdapter.encodedSizeWithTag(2, c1cuy2.source) + c1cuy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUY redact(C1CUY c1cuy) {
            C2231101CUa c2231101CUaNewBuilder = c1cuy.newBuilder();
            c2231101CUaNewBuilder.clearUnknownFields();
            return c2231101CUaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CUY c1cuy) {
            C1CUY c1cuy2 = c1cuy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cuy2.link_mic_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cuy2.source);
            protoWriter.writeBytes(c1cuy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231101CUa newBuilder() {
        C2231101CUa c2231101CUa = new C2231101CUa();
        c2231101CUa.LIZLLL = this.link_mic_id;
        c2231101CUa.LJ = this.source;
        c2231101CUa.addUnknownFields(unknownFields());
        return c2231101CUa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsX7e5df4bbc90a9ca1{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CUY)) {
            return false;
        }
        C1CUY c1cuy = (C1CUY) obj;
        if (unknownFields().equals(c1cuy.unknownFields()) && this.link_mic_id.equals(c1cuy.link_mic_id) && this.source.equals(c1cuy.source)) {
            return true;
        }
        return false;
    }

    public C1CUY(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1CUY(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.source = str2;
    }
}
