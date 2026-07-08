package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLJ extends Message<C1CLJ, C1CLL> {
    public static final ProtoAdapter<C1CLJ> ADAPTER = new ProtoAdapter<C1CLJ>() { // from class: X.1CLK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLJ decode(ProtoReader protoReader) {
            C1CLL c1cll = new C1CLL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cll.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cll.LIZLLL = C2229011CLz.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cll.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLJ c1clj) {
            C1CLJ c1clj2 = c1clj;
            return C2229011CLz.ADAPTER.encodedSizeWithTag(1, c1clj2.config) + c1clj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLJ redact(C1CLJ c1clj) {
            C1CLL c1cllNewBuilder = c1clj.newBuilder();
            c1cllNewBuilder.LIZLLL = C2229011CLz.ADAPTER.redact(c1cllNewBuilder.LIZLLL);
            c1cllNewBuilder.clearUnknownFields();
            return c1cllNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLJ c1clj) {
            C1CLJ c1clj2 = c1clj;
            C2229011CLz.ADAPTER.encodeWithTag(protoWriter, 1, c1clj2.config);
            protoWriter.writeBytes(c1clj2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcInteractStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229011CLz config;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLL newBuilder() {
        C1CLL c1cll = new C1CLL();
        c1cll.LIZLLL = this.config;
        c1cll.addUnknownFields(unknownFields());
        return c1cll;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.replace(0, 2, "FuncParamsX90743bf97dc8be1f{");
        sb.append('}');
        return sb.toString();
    }

    public C1CLJ(C2229011CLz c2229011CLz) {
        this(c2229011CLz, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLJ)) {
            return false;
        }
        C1CLJ c1clj = (C1CLJ) obj;
        if (unknownFields().equals(c1clj.unknownFields()) && this.config.equals(c1clj.config)) {
            return true;
        }
        return false;
    }

    public C1CLJ(C2229011CLz c2229011CLz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = c2229011CLz;
    }
}
