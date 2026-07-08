package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229621COi extends Message<C2229621COi, C2229641COk> {
    public static final ProtoAdapter<C2229621COi> ADAPTER = new ProtoAdapter<C2229621COi>() { // from class: X.1COj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229621COi decode(ProtoReader protoReader) {
            C2229641COk c2229641COk = new C2229641COk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229641COk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229641COk.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        c2229641COk.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229641COk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229621COi c2229621COi) {
            C2229621COi c2229621COi2 = c2229621COi;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2229621COi2.source) + ProtoAdapter.BYTES.encodedSizeWithTag(2, c2229621COi2.perception_info) + c2229621COi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229621COi redact(C2229621COi c2229621COi) {
            C2229641COk c2229641COkNewBuilder = c2229621COi.newBuilder();
            c2229641COkNewBuilder.clearUnknownFields();
            return c2229641COkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229621COi c2229621COi) {
            C2229621COi c2229621COi2 = c2229621COi;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2229621COi2.source);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, c2229621COi2.perception_info);
            protoWriter.writeBytes(c2229621COi2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_PERCEPTION_INFO = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final ByteString perception_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.source.hashCode()) * 37) + this.perception_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229641COk newBuilder() {
        C2229641COk c2229641COk = new C2229641COk();
        c2229641COk.LIZLLL = this.source;
        c2229641COk.LJ = this.perception_info;
        c2229641COk.addUnknownFields(unknownFields());
        return c2229641COk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", perception_info=");
        sb.append(this.perception_info);
        sb.replace(0, 2, "FuncParamsX6c022123f6a310a3{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229621COi)) {
            return false;
        }
        C2229621COi c2229621COi = (C2229621COi) obj;
        if (unknownFields().equals(c2229621COi.unknownFields()) && this.source.equals(c2229621COi.source) && this.perception_info.equals(c2229621COi.perception_info)) {
            return true;
        }
        return false;
    }

    public C2229621COi(String str, ByteString byteString) {
        this(str, byteString, ByteString.EMPTY);
    }

    public C2229621COi(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.source = str;
        this.perception_info = byteString;
    }
}
