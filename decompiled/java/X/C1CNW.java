package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNW extends Message<C1CNW, C1CNX> {
    public static final ProtoAdapter<C1CNW> ADAPTER = new ProtoAdapter<C1CNW>() { // from class: X.1CNV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNW decode(ProtoReader protoReader) {
            C1CNX c1cnx = new C1CNX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cnx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cnx.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNW c1cnw) {
            C1CNW c1cnw2 = c1cnw;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cnw2.source) + c1cnw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNW redact(C1CNW c1cnw) {
            C1CNX c1cnxNewBuilder = c1cnw.newBuilder();
            c1cnxNewBuilder.clearUnknownFields();
            return c1cnxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNW c1cnw) {
            C1CNW c1cnw2 = c1cnw;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cnw2.source);
            protoWriter.writeBytes(c1cnw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CNX newBuilder() {
        C1CNX c1cnx = new C1CNX();
        c1cnx.LIZLLL = this.source;
        c1cnx.addUnknownFields(unknownFields());
        return c1cnx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "LinkMicImGroupListChangeModel{");
        sb.append('}');
        return sb.toString();
    }

    public C1CNW(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNW)) {
            return false;
        }
        C1CNW c1cnw = (C1CNW) obj;
        if (unknownFields().equals(c1cnw.unknownFields()) && this.source.equals(c1cnw.source)) {
            return true;
        }
        return false;
    }

    public C1CNW(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source = str;
    }
}
