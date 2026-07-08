package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ca7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232731Ca7 extends Message<C2232731Ca7, C2232761CaA> {
    public static final ProtoAdapter<C2232731Ca7> ADAPTER = new ProtoAdapter<C2232731Ca7>() { // from class: X.1Ca9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232731Ca7 decode(ProtoReader protoReader) {
            C2232761CaA c2232761CaA = new C2232761CaA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232761CaA.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2232761CaA.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2232761CaA.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232761CaA.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232731Ca7 c2232731Ca7) {
            C2232731Ca7 c2232731Ca72 = c2232731Ca7;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2232731Ca72.mode) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2232731Ca72.has_split_line) + c2232731Ca72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232731Ca7 redact(C2232731Ca7 c2232731Ca7) {
            C2232761CaA c2232761CaANewBuilder = c2232731Ca7.newBuilder();
            c2232761CaANewBuilder.clearUnknownFields();
            return c2232761CaANewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232731Ca7 c2232731Ca7) {
            C2232731Ca7 c2232731Ca72 = c2232731Ca7;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2232731Ca72.mode);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2232731Ca72.has_split_line);
            protoWriter.writeBytes(c2232731Ca72.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_SPLIT_LINE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean has_split_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String mode;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.mode.hashCode()) * 37) + this.has_split_line.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232761CaA newBuilder() {
        C2232761CaA c2232761CaA = new C2232761CaA();
        c2232761CaA.LIZLLL = this.mode;
        c2232761CaA.LJ = this.has_split_line;
        c2232761CaA.addUnknownFields(unknownFields());
        return c2232761CaA;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", has_split_line=");
        sb.append(this.has_split_line);
        sb.replace(0, 2, "LayoutContainer{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232731Ca7)) {
            return false;
        }
        C2232731Ca7 c2232731Ca7 = (C2232731Ca7) obj;
        if (unknownFields().equals(c2232731Ca7.unknownFields()) && this.mode.equals(c2232731Ca7.mode) && this.has_split_line.equals(c2232731Ca7.has_split_line)) {
            return true;
        }
        return false;
    }

    public C2232731Ca7(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public C2232731Ca7(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mode = str;
        this.has_split_line = bool;
    }
}
