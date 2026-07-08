package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CV3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CV3 extends Message<C1CV3, C1CV5> {
    public static final ProtoAdapter<C1CV3> ADAPTER = new ProtoAdapter<C1CV3>() { // from class: X.1CV4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV3 decode(ProtoReader protoReader) {
            C1CV5 c1cv5 = new C1CV5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cv5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cv5.LIZLLL = C2231661CWe.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cv5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CV3 c1cv3) {
            C1CV3 c1cv32 = c1cv3;
            return C2231661CWe.ADAPTER.encodedSizeWithTag(1, c1cv32.im_model) + c1cv32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV3 redact(C1CV3 c1cv3) {
            C1CV5 c1cv5NewBuilder = c1cv3.newBuilder();
            c1cv5NewBuilder.LIZLLL = C2231661CWe.ADAPTER.redact(c1cv5NewBuilder.LIZLLL);
            c1cv5NewBuilder.clearUnknownFields();
            return c1cv5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CV3 c1cv3) {
            C1CV3 c1cv32 = c1cv3;
            C2231661CWe.ADAPTER.encodeWithTag(protoWriter, 1, c1cv32.im_model);
            protoWriter.writeBytes(c1cv32.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2231661CWe im_model;

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
    public C1CV5 newBuilder() {
        C1CV5 c1cv5 = new C1CV5();
        c1cv5.LIZLLL = this.im_model;
        c1cv5.addUnknownFields(unknownFields());
        return c1cv5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", im_model=");
        sb.append(this.im_model);
        sb.replace(0, 2, "FuncParamsX1835d34e8c22d099{");
        sb.append('}');
        return sb.toString();
    }

    public C1CV3(C2231661CWe c2231661CWe) {
        this(c2231661CWe, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CV3)) {
            return false;
        }
        C1CV3 c1cv3 = (C1CV3) obj;
        if (unknownFields().equals(c1cv3.unknownFields()) && this.im_model.equals(c1cv3.im_model)) {
            return true;
        }
        return false;
    }

    public C1CV3(C2231661CWe c2231661CWe, ByteString byteString) {
        super(ADAPTER, byteString);
        this.im_model = c2231661CWe;
    }
}
