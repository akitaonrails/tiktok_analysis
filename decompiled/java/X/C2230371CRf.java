package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230371CRf extends Message<C2230371CRf, C2230381CRg> {
    public static final ProtoAdapter<C2230371CRf> ADAPTER = new ProtoAdapter<C2230371CRf>() { // from class: X.1CRe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230371CRf decode(ProtoReader protoReader) {
            C2230381CRg c2230381CRg = new C2230381CRg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230381CRg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230381CRg.LJ = C2232561CZq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2230381CRg.LIZLLL = C2232561CZq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230381CRg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230371CRf c2230371CRf) {
            C2230371CRf c2230371CRf2 = c2230371CRf;
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2230371CRf2.fullscreen) + protoAdapter.encodedSizeWithTag(2, c2230371CRf2.central_operate_area) + c2230371CRf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230371CRf redact(C2230371CRf c2230371CRf) {
            C2230381CRg c2230381CRgNewBuilder = c2230371CRf.newBuilder();
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            c2230381CRgNewBuilder.LIZLLL = protoAdapter.redact(c2230381CRgNewBuilder.LIZLLL);
            c2230381CRgNewBuilder.LJ = protoAdapter.redact(c2230381CRgNewBuilder.LJ);
            c2230381CRgNewBuilder.clearUnknownFields();
            return c2230381CRgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230371CRf c2230371CRf) {
            C2230371CRf c2230371CRf2 = c2230371CRf;
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230371CRf2.fullscreen);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230371CRf2.central_operate_area);
            protoWriter.writeBytes(c2230371CRf2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232561CZq central_operate_area;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232561CZq fullscreen;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.fullscreen.hashCode()) * 37) + this.central_operate_area.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2230381CRg newBuilder() {
        C2230381CRg c2230381CRg = new C2230381CRg();
        c2230381CRg.LIZLLL = this.fullscreen;
        c2230381CRg.LJ = this.central_operate_area;
        c2230381CRg.addUnknownFields(unknownFields());
        return c2230381CRg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", fullscreen=");
        sb.append(this.fullscreen);
        sb.append(", central_operate_area=");
        sb.append(this.central_operate_area);
        sb.replace(0, 2, "LayoutTypeContainerRectConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230371CRf)) {
            return false;
        }
        C2230371CRf c2230371CRf = (C2230371CRf) obj;
        if (unknownFields().equals(c2230371CRf.unknownFields()) && this.fullscreen.equals(c2230371CRf.fullscreen) && this.central_operate_area.equals(c2230371CRf.central_operate_area)) {
            return true;
        }
        return false;
    }

    public C2230371CRf(C2232561CZq c2232561CZq, C2232561CZq c2232561CZq2) {
        this(c2232561CZq, c2232561CZq2, ByteString.EMPTY);
    }

    public C2230371CRf(C2232561CZq c2232561CZq, C2232561CZq c2232561CZq2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fullscreen = c2232561CZq;
        this.central_operate_area = c2232561CZq2;
    }
}
