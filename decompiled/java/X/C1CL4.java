package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CL4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL4 extends Message<C1CL4, C1CL6> {
    public static final ProtoAdapter<C1CL4> ADAPTER = new ProtoAdapter<C1CL4>() { // from class: X.1CL5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL4 decode(ProtoReader protoReader) {
            C1CL6 c1cl6 = new C1CL6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cl6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cl6.LJ = C1CLA.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cl6.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cl6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CL4 c1cl4) {
            C1CL4 c1cl42 = c1cl4;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cl42.stream_id) + C1CLA.ADAPTER.encodedSizeWithTag(2, c1cl42.config) + c1cl42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL4 redact(C1CL4 c1cl4) {
            C1CL6 c1cl6NewBuilder = c1cl4.newBuilder();
            C1CLA c1cla = c1cl6NewBuilder.LJ;
            if (c1cla != null) {
                c1cl6NewBuilder.LJ = C1CLA.ADAPTER.redact(c1cla);
            }
            c1cl6NewBuilder.clearUnknownFields();
            return c1cl6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CL4 c1cl4) {
            C1CL4 c1cl42 = c1cl4;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cl42.stream_id);
            C1CLA.ADAPTER.encodeWithTag(protoWriter, 2, c1cl42.config);
            protoWriter.writeBytes(c1cl42.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcAuxStreamConfig#ADAPTER", tag = 2)
    public final C1CLA config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37;
        C1CLA c1cla = this.config;
        int iHashCode2 = iHashCode + (c1cla != null ? c1cla.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CL6 newBuilder() {
        C1CL6 c1cl6 = new C1CL6();
        c1cl6.LIZLLL = this.stream_id;
        c1cl6.LJ = this.config;
        c1cl6.addUnknownFields(unknownFields());
        return c1cl6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        sb.replace(0, 2, "FuncParamsX8b023cc5715bbcef{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CL4)) {
            return false;
        }
        C1CL4 c1cl4 = (C1CL4) obj;
        if (unknownFields().equals(c1cl4.unknownFields()) && this.stream_id.equals(c1cl4.stream_id) && C1516540pZE.LJ(this.config, c1cl4.config)) {
            return true;
        }
        return false;
    }

    public C1CL4(String str, C1CLA c1cla) {
        this(str, c1cla, ByteString.EMPTY);
    }

    public C1CL4(String str, C1CLA c1cla, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.config = c1cla;
    }
}
