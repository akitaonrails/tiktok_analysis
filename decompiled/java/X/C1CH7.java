package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CH7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH7 extends Message<C1CH7, C1CH9> {
    public static final ProtoAdapter<C1CH7> ADAPTER = new ProtoAdapter<C1CH7>() { // from class: X.1CH8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH7 decode(ProtoReader protoReader) {
            C1CH9 c1ch9 = new C1CH9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ch9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ch9.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ch9.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ch9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CH7 c1ch7) {
            C1CH7 c1ch72 = c1ch7;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1ch72.container) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1ch72.source) + c1ch72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH7 redact(C1CH7 c1ch7) {
            C1CH9 c1ch9NewBuilder = c1ch7.newBuilder();
            c1ch9NewBuilder.clearUnknownFields();
            return c1ch9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CH7 c1ch7) {
            C1CH7 c1ch72 = c1ch7;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1ch72.container);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1ch72.source);
            protoWriter.writeBytes(c1ch72.unknownFields());
        }
    };
    public static final Long DEFAULT_CONTAINER = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long container;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.container.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CH9 newBuilder() {
        C1CH9 c1ch9 = new C1CH9();
        c1ch9.LIZLLL = this.container;
        c1ch9.LJ = this.source;
        c1ch9.addUnknownFields(unknownFields());
        return c1ch9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsXa365a10bc9b266fb{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CH7)) {
            return false;
        }
        C1CH7 c1ch7 = (C1CH7) obj;
        if (unknownFields().equals(c1ch7.unknownFields()) && this.container.equals(c1ch7.container) && this.source.equals(c1ch7.source)) {
            return true;
        }
        return false;
    }

    public C1CH7(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C1CH7(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.container = l;
        this.source = str;
    }
}
