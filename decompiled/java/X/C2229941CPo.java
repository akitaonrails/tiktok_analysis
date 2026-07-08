package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229941CPo extends Message<C2229941CPo, C2229961CPq> {
    public static final ProtoAdapter<C2229941CPo> ADAPTER = new ProtoAdapter<C2229941CPo>() { // from class: X.1CPp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229941CPo decode(ProtoReader protoReader) {
            C2229961CPq c2229961CPq = new C2229961CPq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229961CPq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229961CPq.LIZLLL = C1CQM.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229961CPq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229941CPo c2229941CPo) {
            C2229941CPo c2229941CPo2 = c2229941CPo;
            return C1CQM.ADAPTER.encodedSizeWithTag(1, c2229941CPo2.state) + c2229941CPo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229941CPo redact(C2229941CPo c2229941CPo) {
            C2229961CPq c2229961CPqNewBuilder = c2229941CPo.newBuilder();
            c2229961CPqNewBuilder.LIZLLL = C1CQM.ADAPTER.redact(c2229961CPqNewBuilder.LIZLLL);
            c2229961CPqNewBuilder.clearUnknownFields();
            return c2229961CPqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229941CPo c2229941CPo) {
            C2229941CPo c2229941CPo2 = c2229941CPo;
            C1CQM.ADAPTER.encodeWithTag(protoWriter, 1, c2229941CPo2.state);
            protoWriter.writeBytes(c2229941CPo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQM state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229961CPq newBuilder() {
        C2229961CPq c2229961CPq = new C2229961CPq();
        c2229961CPq.LIZLLL = this.state;
        c2229961CPq.addUnknownFields(unknownFields());
        return c2229961CPq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state=");
        sb.append(this.state);
        sb.replace(0, 2, "FuncParamsX0ecd02d4f9e0e5c7{");
        sb.append('}');
        return sb.toString();
    }

    public C2229941CPo(C1CQM c1cqm) {
        this(c1cqm, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229941CPo)) {
            return false;
        }
        C2229941CPo c2229941CPo = (C2229941CPo) obj;
        if (unknownFields().equals(c2229941CPo.unknownFields()) && this.state.equals(c2229941CPo.state)) {
            return true;
        }
        return false;
    }

    public C2229941CPo(C1CQM c1cqm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state = c1cqm;
    }
}
