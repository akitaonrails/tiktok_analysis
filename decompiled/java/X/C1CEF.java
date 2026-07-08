package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEF extends Message<C1CEF, C1CEG> {
    public static final ProtoAdapter<C1CEF> ADAPTER = new ProtoAdapter<C1CEF>() { // from class: X.1CEE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEF decode(ProtoReader protoReader) {
            C1CEG c1ceg = new C1CEG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ceg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ceg.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ceg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEF c1cef) {
            C1CEF c1cef2 = c1cef;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cef2.mic_position) + c1cef2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEF redact(C1CEF c1cef) {
            C1CEG c1cegNewBuilder = c1cef.newBuilder();
            c1cegNewBuilder.clearUnknownFields();
            return c1cegNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CEF c1cef) {
            C1CEF c1cef2 = c1cef;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cef2.mic_position);
            protoWriter.writeBytes(c1cef2.unknownFields());
        }
    };
    public static final Long DEFAULT_MIC_POSITION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long mic_position;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.mic_position.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CEG newBuilder() {
        C1CEG c1ceg = new C1CEG();
        c1ceg.LIZLLL = this.mic_position;
        c1ceg.addUnknownFields(unknownFields());
        return c1ceg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mic_position=");
        sb.append(this.mic_position);
        sb.replace(0, 2, "LinkMicLinkPosData{");
        sb.append('}');
        return sb.toString();
    }

    public C1CEF(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CEF)) {
            return false;
        }
        C1CEF c1cef = (C1CEF) obj;
        if (unknownFields().equals(c1cef.unknownFields()) && this.mic_position.equals(c1cef.mic_position)) {
            return true;
        }
        return false;
    }

    public C1CEF(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mic_position = l;
    }
}
