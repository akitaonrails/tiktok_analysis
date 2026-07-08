package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233941Cc4 extends Message<C2233941Cc4, C2233961Cc6> {
    public static final ProtoAdapter<C2233941Cc4> ADAPTER = new ProtoAdapter<C2233941Cc4>() { // from class: X.1Cc5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233941Cc4 decode(ProtoReader protoReader) {
            C2233961Cc6 c2233961Cc6 = new C2233961Cc6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2233961Cc6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2233961Cc6.LIZLLL = C2233611CbX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233961Cc6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233941Cc4 c2233941Cc4) {
            C2233941Cc4 c2233941Cc42 = c2233941Cc4;
            return C2233611CbX.ADAPTER.encodedSizeWithTag(1, c2233941Cc42.source) + c2233941Cc42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233941Cc4 redact(C2233941Cc4 c2233941Cc4) {
            C2233961Cc6 c2233961Cc6NewBuilder = c2233941Cc4.newBuilder();
            c2233961Cc6NewBuilder.LIZLLL = C2233611CbX.ADAPTER.redact(c2233961Cc6NewBuilder.LIZLLL);
            c2233961Cc6NewBuilder.clearUnknownFields();
            return c2233961Cc6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233941Cc4 c2233941Cc4) {
            C2233941Cc4 c2233941Cc42 = c2233941Cc4;
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 1, c2233941Cc42.source);
            protoWriter.writeBytes(c2233941Cc42.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233611CbX source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233961Cc6 newBuilder() {
        C2233961Cc6 c2233961Cc6 = new C2233961Cc6();
        c2233961Cc6.LIZLLL = this.source;
        c2233961Cc6.addUnknownFields(unknownFields());
        return c2233961Cc6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsX25d6643ee6507ef3{");
        sb.append('}');
        return sb.toString();
    }

    public C2233941Cc4(C2233611CbX c2233611CbX) {
        this(c2233611CbX, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233941Cc4)) {
            return false;
        }
        C2233941Cc4 c2233941Cc4 = (C2233941Cc4) obj;
        if (unknownFields().equals(c2233941Cc4.unknownFields()) && this.source.equals(c2233941Cc4.source)) {
            return true;
        }
        return false;
    }

    public C2233941Cc4(C2233611CbX c2233611CbX, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source = c2233611CbX;
    }
}
