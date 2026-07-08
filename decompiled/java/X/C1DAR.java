package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAR extends Message<C1DAR, C1DAT> {
    public static final ProtoAdapter<C1DAR> ADAPTER = new ProtoAdapter<C1DAR>() { // from class: X.1DAS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAR decode(ProtoReader protoReader) {
            C1DAT c1dat = new C1DAT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1dat.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1dat.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1dat.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1dat.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dat.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAR c1dar) {
            C1DAR c1dar2 = c1dar;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1dar2.nickname) + protoAdapter.encodedSizeWithTag(2, c1dar2.unique_name) + protoAdapter.encodedSizeWithTag(3, c1dar2.avatar_url) + c1dar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAR redact(C1DAR c1dar) {
            C1DAT c1datNewBuilder = c1dar.newBuilder();
            c1datNewBuilder.clearUnknownFields();
            return c1datNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DAR c1dar) {
            C1DAR c1dar2 = c1dar;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1dar2.nickname);
            protoAdapter.encodeWithTag(protoWriter, 2, c1dar2.unique_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c1dar2.avatar_url);
            protoWriter.writeBytes(c1dar2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String avatar_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String unique_name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.unique_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.avatar_url;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1DAT newBuilder() {
        C1DAT c1dat = new C1DAT();
        c1dat.LIZLLL = this.nickname;
        c1dat.LJ = this.unique_name;
        c1dat.LJFF = this.avatar_url;
        c1dat.addUnknownFields(unknownFields());
        return c1dat;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.unique_name != null) {
            sb.append(", unique_name=");
            sb.append(this.unique_name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        sb.replace(0, 2, "BotAccountInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1DAR)) {
            return false;
        }
        C1DAR c1dar = (C1DAR) obj;
        if (unknownFields().equals(c1dar.unknownFields()) && C1516540pZE.LJ(this.nickname, c1dar.nickname) && C1516540pZE.LJ(this.unique_name, c1dar.unique_name) && C1516540pZE.LJ(this.avatar_url, c1dar.avatar_url)) {
            return true;
        }
        return false;
    }

    public C1DAR(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C1DAR(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.nickname = str;
        this.unique_name = str2;
        this.avatar_url = str3;
    }
}
