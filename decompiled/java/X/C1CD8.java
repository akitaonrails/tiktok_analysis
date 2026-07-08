package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CD8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD8 extends Message<C1CD8, C1CDA> {
    public static final ProtoAdapter<C1CD8> ADAPTER = new ProtoAdapter<C1CD8>() { // from class: X.1CD9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD8 decode(ProtoReader protoReader) {
            C1CDA c1cda = new C1CDA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cda.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cda.LIZLLL = C1CD5.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cda.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CD8 c1cd8) {
            C1CD8 c1cd82 = c1cd8;
            return C1CD5.ADAPTER.encodedSizeWithTag(1, c1cd82.window_extra) + c1cd82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD8 redact(C1CD8 c1cd8) {
            C1CDA c1cdaNewBuilder = c1cd8.newBuilder();
            c1cdaNewBuilder.LIZLLL = C1CD5.ADAPTER.redact(c1cdaNewBuilder.LIZLLL);
            c1cdaNewBuilder.clearUnknownFields();
            return c1cdaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CD8 c1cd8) {
            C1CD8 c1cd82 = c1cd8;
            C1CD5.ADAPTER.encodeWithTag(protoWriter, 1, c1cd82.window_extra);
            protoWriter.writeBytes(c1cd82.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutCohostLayoutWindowExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CD5 window_extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.window_extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CDA newBuilder() {
        C1CDA c1cda = new C1CDA();
        c1cda.LIZLLL = this.window_extra;
        c1cda.addUnknownFields(unknownFields());
        return c1cda;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", window_extra=");
        sb.append(this.window_extra);
        sb.replace(0, 2, "FuncParamsXce7639c53f8fb639{");
        sb.append('}');
        return sb.toString();
    }

    public C1CD8(C1CD5 c1cd5) {
        this(c1cd5, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CD8)) {
            return false;
        }
        C1CD8 c1cd8 = (C1CD8) obj;
        if (unknownFields().equals(c1cd8.unknownFields()) && this.window_extra.equals(c1cd8.window_extra)) {
            return true;
        }
        return false;
    }

    public C1CD8(C1CD5 c1cd5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.window_extra = c1cd5;
    }
}
