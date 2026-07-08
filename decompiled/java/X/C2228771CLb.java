package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228771CLb extends Message<C2228771CLb, C2228791CLd> {
    public static final ProtoAdapter<C2228771CLb> ADAPTER = new ProtoAdapter<C2228771CLb>() { // from class: X.1CLc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228771CLb decode(ProtoReader protoReader) {
            C2228791CLd c2228791CLd = new C2228791CLd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228791CLd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228791CLd.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228791CLd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228771CLb c2228771CLb) {
            C2228771CLb c2228771CLb2 = c2228771CLb;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228771CLb2.stream_id) + c2228771CLb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228771CLb redact(C2228771CLb c2228771CLb) {
            C2228791CLd c2228791CLdNewBuilder = c2228771CLb.newBuilder();
            c2228791CLdNewBuilder.clearUnknownFields();
            return c2228791CLdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228771CLb c2228771CLb) {
            C2228771CLb c2228771CLb2 = c2228771CLb;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228771CLb2.stream_id);
            protoWriter.writeBytes(c2228771CLb2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.stream_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228791CLd newBuilder() {
        C2228791CLd c2228791CLd = new C2228791CLd();
        c2228791CLd.LIZLLL = this.stream_id;
        c2228791CLd.addUnknownFields(unknownFields());
        return c2228791CLd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.replace(0, 2, "FuncParamsX944ffc95f500d2de{");
        sb.append('}');
        return sb.toString();
    }

    public C2228771CLb(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228771CLb)) {
            return false;
        }
        C2228771CLb c2228771CLb = (C2228771CLb) obj;
        if (unknownFields().equals(c2228771CLb.unknownFields()) && this.stream_id.equals(c2228771CLb.stream_id)) {
            return true;
        }
        return false;
    }

    public C2228771CLb(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
    }
}
