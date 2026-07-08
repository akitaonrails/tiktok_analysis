package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CP2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP2 extends Message<C1CP2, C1CP4> {
    public static final ProtoAdapter<C1CP2> ADAPTER = new ProtoAdapter<C1CP2>() { // from class: X.1CP3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CP2 decode(ProtoReader protoReader) {
            C1CP4 c1cp4 = new C1CP4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cp4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cp4.LIZLLL = C2229791COz.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cp4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CP2 c1cp2) {
            C1CP2 c1cp22 = c1cp2;
            return C2229791COz.ADAPTER.encodedSizeWithTag(1, c1cp22.ret) + c1cp22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CP2 redact(C1CP2 c1cp2) {
            C1CP4 c1cp4NewBuilder = c1cp2.newBuilder();
            c1cp4NewBuilder.LIZLLL = C2229791COz.ADAPTER.redact(c1cp4NewBuilder.LIZLLL);
            c1cp4NewBuilder.clearUnknownFields();
            return c1cp4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CP2 c1cp2) {
            C1CP2 c1cp22 = c1cp2;
            C2229791COz.ADAPTER.encodeWithTag(protoWriter, 1, c1cp22.ret);
            protoWriter.writeBytes(c1cp22.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutCanvasResolution#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229791COz ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CP4 newBuilder() {
        C1CP4 c1cp4 = new C1CP4();
        c1cp4.LIZLLL = this.ret;
        c1cp4.addUnknownFields(unknownFields());
        return c1cp4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX0a64a01452f87642{");
        sb.append('}');
        return sb.toString();
    }

    public C1CP2(C2229791COz c2229791COz) {
        this(c2229791COz, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CP2)) {
            return false;
        }
        C1CP2 c1cp2 = (C1CP2) obj;
        if (unknownFields().equals(c1cp2.unknownFields()) && this.ret.equals(c1cp2.ret)) {
            return true;
        }
        return false;
    }

    public C1CP2(C2229791COz c2229791COz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2229791COz;
    }
}
