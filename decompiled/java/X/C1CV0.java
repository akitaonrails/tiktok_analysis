package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CV0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CV0 extends Message<C1CV0, C1CV2> {
    public static final ProtoAdapter<C1CV0> ADAPTER = new ProtoAdapter<C1CV0>() { // from class: X.1CV1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV0 decode(ProtoReader protoReader) {
            C1CV2 c1cv2 = new C1CV2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cv2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cv2.LIZLLL = C2231691CWh.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cv2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CV0 c1cv0) {
            C1CV0 c1cv02 = c1cv0;
            return C2231691CWh.ADAPTER.encodedSizeWithTag(1, c1cv02.im_model) + c1cv02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV0 redact(C1CV0 c1cv0) {
            C1CV2 c1cv2NewBuilder = c1cv0.newBuilder();
            c1cv2NewBuilder.LIZLLL = C2231691CWh.ADAPTER.redact(c1cv2NewBuilder.LIZLLL);
            c1cv2NewBuilder.clearUnknownFields();
            return c1cv2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CV0 c1cv0) {
            C1CV0 c1cv02 = c1cv0;
            C2231691CWh.ADAPTER.encodeWithTag(protoWriter, 1, c1cv02.im_model);
            protoWriter.writeBytes(c1cv02.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicDroppedImModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2231691CWh im_model;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.im_model.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CV2 newBuilder() {
        C1CV2 c1cv2 = new C1CV2();
        c1cv2.LIZLLL = this.im_model;
        c1cv2.addUnknownFields(unknownFields());
        return c1cv2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", im_model=");
        sb.append(this.im_model);
        sb.replace(0, 2, "FuncParamsX2e0a981da3a71f5e{");
        sb.append('}');
        return sb.toString();
    }

    public C1CV0(C2231691CWh c2231691CWh) {
        this(c2231691CWh, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CV0)) {
            return false;
        }
        C1CV0 c1cv0 = (C1CV0) obj;
        if (unknownFields().equals(c1cv0.unknownFields()) && this.im_model.equals(c1cv0.im_model)) {
            return true;
        }
        return false;
    }

    public C1CV0(C2231691CWh c2231691CWh, ByteString byteString) {
        super(ADAPTER, byteString);
        this.im_model = c2231691CWh;
    }
}
