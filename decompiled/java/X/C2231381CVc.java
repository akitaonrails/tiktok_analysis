package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231381CVc extends Message<C2231381CVc, C2231401CVe> {
    public static final ProtoAdapter<C2231381CVc> ADAPTER = new ProtoAdapter<C2231381CVc>() { // from class: X.1CVd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231381CVc decode(ProtoReader protoReader) {
            C2231401CVe c2231401CVe = new C2231401CVe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2231401CVe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2231401CVe.LIZLLL = C2231851CWx.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231401CVe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231381CVc c2231381CVc) {
            C2231381CVc c2231381CVc2 = c2231381CVc;
            return C2231851CWx.ADAPTER.encodedSizeWithTag(1, c2231381CVc2.link_state_change_context) + c2231381CVc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231381CVc redact(C2231381CVc c2231381CVc) {
            C2231401CVe c2231401CVeNewBuilder = c2231381CVc.newBuilder();
            c2231401CVeNewBuilder.LIZLLL = C2231851CWx.ADAPTER.redact(c2231401CVeNewBuilder.LIZLLL);
            c2231401CVeNewBuilder.clearUnknownFields();
            return c2231401CVeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231381CVc c2231381CVc) {
            C2231381CVc c2231381CVc2 = c2231381CVc;
            C2231851CWx.ADAPTER.encodeWithTag(protoWriter, 1, c2231381CVc2.link_state_change_context);
            protoWriter.writeBytes(c2231381CVc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkStateChangeContext#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2231851CWx link_state_change_context;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.link_state_change_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231401CVe newBuilder() {
        C2231401CVe c2231401CVe = new C2231401CVe();
        c2231401CVe.LIZLLL = this.link_state_change_context;
        c2231401CVe.addUnknownFields(unknownFields());
        return c2231401CVe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_state_change_context=");
        sb.append(this.link_state_change_context);
        sb.replace(0, 2, "FuncParamsXa9cb303e744a54d8{");
        sb.append('}');
        return sb.toString();
    }

    public C2231381CVc(C2231851CWx c2231851CWx) {
        this(c2231851CWx, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231381CVc)) {
            return false;
        }
        C2231381CVc c2231381CVc = (C2231381CVc) obj;
        if (unknownFields().equals(c2231381CVc.unknownFields()) && this.link_state_change_context.equals(c2231381CVc.link_state_change_context)) {
            return true;
        }
        return false;
    }

    public C2231381CVc(C2231851CWx c2231851CWx, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_state_change_context = c2231851CWx;
    }
}
