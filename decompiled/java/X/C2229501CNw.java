package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229501CNw extends Message<C2229501CNw, C2229511CNx> {
    public static final ProtoAdapter<C2229501CNw> ADAPTER = new ProtoAdapter<C2229501CNw>() { // from class: X.1CNv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229501CNw decode(ProtoReader protoReader) {
            C2229511CNx c2229511CNx = new C2229511CNx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229511CNx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229511CNx.LIZLLL = C2229461CNs.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229511CNx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229501CNw c2229501CNw) {
            C2229501CNw c2229501CNw2 = c2229501CNw;
            return C2229461CNs.ADAPTER.encodedSizeWithTag(1, c2229501CNw2.im_model) + c2229501CNw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229501CNw redact(C2229501CNw c2229501CNw) {
            C2229511CNx c2229511CNxNewBuilder = c2229501CNw.newBuilder();
            c2229511CNxNewBuilder.LIZLLL = C2229461CNs.ADAPTER.redact(c2229511CNxNewBuilder.LIZLLL);
            c2229511CNxNewBuilder.clearUnknownFields();
            return c2229511CNxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229501CNw c2229501CNw) {
            C2229501CNw c2229501CNw2 = c2229501CNw;
            C2229461CNs.ADAPTER.encodeWithTag(protoWriter, 1, c2229501CNw2.im_model);
            protoWriter.writeBytes(c2229501CNw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImSelfShouldLeaveGroupModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229461CNs im_model;

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
    public C2229511CNx newBuilder() {
        C2229511CNx c2229511CNx = new C2229511CNx();
        c2229511CNx.LIZLLL = this.im_model;
        c2229511CNx.addUnknownFields(unknownFields());
        return c2229511CNx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", im_model=");
        sb.append(this.im_model);
        sb.replace(0, 2, "FuncParamsX96ae8d3deb0c5182{");
        sb.append('}');
        return sb.toString();
    }

    public C2229501CNw(C2229461CNs c2229461CNs) {
        this(c2229461CNs, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229501CNw)) {
            return false;
        }
        C2229501CNw c2229501CNw = (C2229501CNw) obj;
        if (unknownFields().equals(c2229501CNw.unknownFields()) && this.im_model.equals(c2229501CNw.im_model)) {
            return true;
        }
        return false;
    }

    public C2229501CNw(C2229461CNs c2229461CNs, ByteString byteString) {
        super(ADAPTER, byteString);
        this.im_model = c2229461CNs;
    }
}
