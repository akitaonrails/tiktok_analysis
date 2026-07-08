package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CL7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL7 extends Message<C1CL7, C1CL9> {
    public static final ProtoAdapter<C1CL7> ADAPTER = new ProtoAdapter<C1CL7>() { // from class: X.1CL8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL7 decode(ProtoReader protoReader) {
            C1CL9 c1cl9 = new C1CL9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cl9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cl9.LJ = C1CLA.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cl9.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cl9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CL7 c1cl7) {
            C1CL7 c1cl72 = c1cl7;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cl72.stream_id) + C1CLA.ADAPTER.encodedSizeWithTag(2, c1cl72.config) + c1cl72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL7 redact(C1CL7 c1cl7) {
            C1CL9 c1cl9NewBuilder = c1cl7.newBuilder();
            c1cl9NewBuilder.LJ = C1CLA.ADAPTER.redact(c1cl9NewBuilder.LJ);
            c1cl9NewBuilder.clearUnknownFields();
            return c1cl9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CL7 c1cl7) {
            C1CL7 c1cl72 = c1cl7;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cl72.stream_id);
            C1CLA.ADAPTER.encodeWithTag(protoWriter, 2, c1cl72.config);
            protoWriter.writeBytes(c1cl72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcAuxStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CLA config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37) + this.config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CL9 newBuilder() {
        C1CL9 c1cl9 = new C1CL9();
        c1cl9.LIZLLL = this.stream_id;
        c1cl9.LJ = this.config;
        c1cl9.addUnknownFields(unknownFields());
        return c1cl9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsX61effa5054c0c179{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CL7)) {
            return false;
        }
        C1CL7 c1cl7 = (C1CL7) obj;
        if (unknownFields().equals(c1cl7.unknownFields()) && this.stream_id.equals(c1cl7.stream_id) && this.config.equals(c1cl7.config)) {
            return true;
        }
        return false;
    }

    public C1CL7(String str, C1CLA c1cla) {
        this(str, c1cla, ByteString.EMPTY);
    }

    public C1CL7(String str, C1CLA c1cla, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.config = c1cla;
    }
}
