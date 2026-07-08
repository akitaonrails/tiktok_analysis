package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226591CCr extends Message<C2226591CCr, C2226601CCs> {
    public static final ProtoAdapter<C2226591CCr> ADAPTER = new ProtoAdapter<C2226591CCr>() { // from class: X.1CCq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226591CCr decode(ProtoReader protoReader) {
            C2226601CCs c2226601CCs = new C2226601CCs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226601CCs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226601CCs.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226601CCs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226591CCr c2226591CCr) {
            C2226591CCr c2226591CCr2 = c2226591CCr;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2226591CCr2.layout_layer) + c2226591CCr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226591CCr redact(C2226591CCr c2226591CCr) {
            C2226601CCs c2226601CCsNewBuilder = c2226591CCr.newBuilder();
            c2226601CCsNewBuilder.clearUnknownFields();
            return c2226601CCsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226591CCr c2226591CCr) {
            C2226591CCr c2226591CCr2 = c2226591CCr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2226591CCr2.layout_layer);
            protoWriter.writeBytes(c2226591CCr2.unknownFields());
        }
    };
    public static final Long DEFAULT_LAYOUT_LAYER = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long layout_layer;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layout_layer.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226601CCs newBuilder() {
        C2226601CCs c2226601CCs = new C2226601CCs();
        c2226601CCs.LIZLLL = this.layout_layer;
        c2226601CCs.addUnknownFields(unknownFields());
        return c2226601CCs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_layer=");
        sb.append(this.layout_layer);
        sb.replace(0, 2, "FuncParamsXb0c03e47aac46c5a{");
        sb.append('}');
        return sb.toString();
    }

    public C2226591CCr(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226591CCr)) {
            return false;
        }
        C2226591CCr c2226591CCr = (C2226591CCr) obj;
        if (unknownFields().equals(c2226591CCr.unknownFields()) && this.layout_layer.equals(c2226591CCr.layout_layer)) {
            return true;
        }
        return false;
    }

    public C2226591CCr(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_layer = l;
    }
}
