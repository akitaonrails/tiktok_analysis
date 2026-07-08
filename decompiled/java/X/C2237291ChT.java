package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237291ChT extends Message<C2237291ChT, C2237311ChV> {
    public static final ProtoAdapter<C2237291ChT> ADAPTER = new ProtoAdapter<C2237291ChT>() { // from class: X.1ChU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237291ChT decode(ProtoReader protoReader) {
            C2237311ChV c2237311ChV = new C2237311ChV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237311ChV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237311ChV.LIZLLL = C2237321ChW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237311ChV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237291ChT c2237291ChT) {
            C2237291ChT c2237291ChT2 = c2237291ChT;
            return C2237321ChW.ADAPTER.encodedSizeWithTag(1, c2237291ChT2.spot_extra) + c2237291ChT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237291ChT redact(C2237291ChT c2237291ChT) {
            C2237311ChV c2237311ChVNewBuilder = c2237291ChT.newBuilder();
            c2237311ChVNewBuilder.LIZLLL = C2237321ChW.ADAPTER.redact(c2237311ChVNewBuilder.LIZLLL);
            c2237311ChVNewBuilder.clearUnknownFields();
            return c2237311ChVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237291ChT c2237291ChT) {
            C2237291ChT c2237291ChT2 = c2237291ChT;
            C2237321ChW.ADAPTER.encodeWithTag(protoWriter, 1, c2237291ChT2.spot_extra);
            protoWriter.writeBytes(c2237291ChT2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutMultiGuestLayoutExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2237321ChW spot_extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.spot_extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237311ChV newBuilder() {
        C2237311ChV c2237311ChV = new C2237311ChV();
        c2237311ChV.LIZLLL = this.spot_extra;
        c2237311ChV.addUnknownFields(unknownFields());
        return c2237311ChV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", spot_extra=");
        sb.append(this.spot_extra);
        sb.replace(0, 2, "FuncParamsXf34cd325e6ee9b07{");
        sb.append('}');
        return sb.toString();
    }

    public C2237291ChT(C2237321ChW c2237321ChW) {
        this(c2237321ChW, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237291ChT)) {
            return false;
        }
        C2237291ChT c2237291ChT = (C2237291ChT) obj;
        if (unknownFields().equals(c2237291ChT.unknownFields()) && this.spot_extra.equals(c2237291ChT.spot_extra)) {
            return true;
        }
        return false;
    }

    public C2237291ChT(C2237321ChW c2237321ChW, ByteString byteString) {
        super(ADAPTER, byteString);
        this.spot_extra = c2237321ChW;
    }
}
