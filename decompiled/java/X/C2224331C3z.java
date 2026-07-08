package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224331C3z extends Message<C2224331C3z, C1C41> {
    public static final ProtoAdapter<C2224331C3z> ADAPTER = new ProtoAdapter<C2224331C3z>() { // from class: X.1C40
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224331C3z decode(ProtoReader protoReader) {
            C1C41 c1c41 = new C1C41();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c41.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c41.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c41.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c41.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c41.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224331C3z c2224331C3z) {
            C2224331C3z c2224331C3z2 = c2224331C3z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2224331C3z2.room_id) + protoAdapter.encodedSizeWithTag(2, c2224331C3z2.token) + protoAdapter.encodedSizeWithTag(3, c2224331C3z2.rtc_ext_info) + c2224331C3z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224331C3z redact(C2224331C3z c2224331C3z) {
            C1C41 c1c41NewBuilder = c2224331C3z.newBuilder();
            c1c41NewBuilder.clearUnknownFields();
            return c1c41NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224331C3z c2224331C3z) {
            C2224331C3z c2224331C3z2 = c2224331C3z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2224331C3z2.room_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2224331C3z2.token);
            protoAdapter.encodeWithTag(protoWriter, 3, c2224331C3z2.rtc_ext_info);
            protoWriter.writeBytes(c2224331C3z2.unknownFields());
        }
    };
    public static final String DEFAULT_TOKEN = "";
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String room_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String rtc_ext_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String token;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.room_id.hashCode()) * 37) + this.token.hashCode()) * 37) + this.rtc_ext_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C41 newBuilder() {
        C1C41 c1c41 = new C1C41();
        c1c41.LIZLLL = this.room_id;
        c1c41.LJ = this.token;
        c1c41.LJFF = this.rtc_ext_info;
        c1c41.addUnknownFields(unknownFields());
        return c1c41;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_id=");
        sb.append(this.room_id);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", rtc_ext_info=");
        sb.append(this.rtc_ext_info);
        sb.replace(0, 2, "LinkMicInteractForwardStreamConfiguration{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224331C3z)) {
            return false;
        }
        C2224331C3z c2224331C3z = (C2224331C3z) obj;
        if (unknownFields().equals(c2224331C3z.unknownFields()) && this.room_id.equals(c2224331C3z.room_id) && this.token.equals(c2224331C3z.token) && this.rtc_ext_info.equals(c2224331C3z.rtc_ext_info)) {
            return true;
        }
        return false;
    }

    public C2224331C3z(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C2224331C3z(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_id = str;
        this.token = str2;
        this.rtc_ext_info = str3;
    }
}
