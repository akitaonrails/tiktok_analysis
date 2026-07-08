package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235481CeY extends Message<C2235481CeY, C2235501Cea> {
    public static final ProtoAdapter<C2235481CeY> ADAPTER = new ProtoAdapter<C2235481CeY>() { // from class: X.1CeZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235481CeY decode(ProtoReader protoReader) {
            C2235501Cea c2235501Cea = new C2235501Cea();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2235501Cea.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2235501Cea.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2235501Cea.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2235501Cea.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235501Cea.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235481CeY c2235481CeY) {
            C2235481CeY c2235481CeY2 = c2235481CeY;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2235481CeY2.token);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2235481CeY2.push_data) + protoAdapter.encodedSizeWithTag(3, c2235481CeY2.mix_stream) + c2235481CeY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235481CeY redact(C2235481CeY c2235481CeY) {
            C2235501Cea c2235501CeaNewBuilder = c2235481CeY.newBuilder();
            c2235501CeaNewBuilder.clearUnknownFields();
            return c2235501CeaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235481CeY c2235481CeY) {
            C2235481CeY c2235481CeY2 = c2235481CeY;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2235481CeY2.token);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, c2235481CeY2.push_data);
            protoAdapter.encodeWithTag(protoWriter, 3, c2235481CeY2.mix_stream);
            protoWriter.writeBytes(c2235481CeY2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_MIX_STREAM;
    public static final Boolean DEFAULT_PUSH_DATA;
    public static final String DEFAULT_TOKEN = "";
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean mix_stream;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean push_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String token;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_PUSH_DATA = bool;
        DEFAULT_MIX_STREAM = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.token.hashCode()) * 37) + this.push_data.hashCode()) * 37) + this.mix_stream.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235501Cea newBuilder() {
        C2235501Cea c2235501Cea = new C2235501Cea();
        c2235501Cea.LIZLLL = this.token;
        c2235501Cea.LJ = this.push_data;
        c2235501Cea.LJFF = this.mix_stream;
        c2235501Cea.addUnknownFields(unknownFields());
        return c2235501Cea;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", push_data=");
        sb.append(this.push_data);
        sb.append(", mix_stream=");
        sb.append(this.mix_stream);
        sb.replace(0, 2, "FuncParamsXce417b928ddd0fbc{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235481CeY)) {
            return false;
        }
        C2235481CeY c2235481CeY = (C2235481CeY) obj;
        if (unknownFields().equals(c2235481CeY.unknownFields()) && this.token.equals(c2235481CeY.token) && this.push_data.equals(c2235481CeY.push_data) && this.mix_stream.equals(c2235481CeY.mix_stream)) {
            return true;
        }
        return false;
    }

    public C2235481CeY(String str, Boolean bool, Boolean bool2) {
        this(str, bool, bool2, ByteString.EMPTY);
    }

    public C2235481CeY(String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.push_data = bool;
        this.mix_stream = bool2;
    }
}
