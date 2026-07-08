package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVN extends Message<C1CVN, C1CVP> {
    public static final ProtoAdapter<C1CVN> ADAPTER = new ProtoAdapter<C1CVN>() { // from class: X.1CVO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVN decode(ProtoReader protoReader) {
            C1CVP c1cvp = new C1CVP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cvp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cvp.LIZLLL = C1CVQ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVN c1cvn) {
            C1CVN c1cvn2 = c1cvn;
            return C1CVQ.ADAPTER.encodedSizeWithTag(1, c1cvn2.layout_context) + c1cvn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVN redact(C1CVN c1cvn) {
            C1CVP c1cvpNewBuilder = c1cvn.newBuilder();
            c1cvpNewBuilder.LIZLLL = C1CVQ.ADAPTER.redact(c1cvpNewBuilder.LIZLLL);
            c1cvpNewBuilder.clearUnknownFields();
            return c1cvpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVN c1cvn) {
            C1CVN c1cvn2 = c1cvn;
            C1CVQ.ADAPTER.encodeWithTag(protoWriter, 1, c1cvn2.layout_context);
            protoWriter.writeBytes(c1cvn2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutContext#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CVQ layout_context;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layout_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVP newBuilder() {
        C1CVP c1cvp = new C1CVP();
        c1cvp.LIZLLL = this.layout_context;
        c1cvp.addUnknownFields(unknownFields());
        return c1cvp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_context=");
        sb.append(this.layout_context);
        sb.replace(0, 2, "FuncParamsXd70777a39229a6dd{");
        sb.append('}');
        return sb.toString();
    }

    public C1CVN(C1CVQ c1cvq) {
        this(c1cvq, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVN)) {
            return false;
        }
        C1CVN c1cvn = (C1CVN) obj;
        if (unknownFields().equals(c1cvn.unknownFields()) && this.layout_context.equals(c1cvn.layout_context)) {
            return true;
        }
        return false;
    }

    public C1CVN(C1CVQ c1cvq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_context = c1cvq;
    }
}
