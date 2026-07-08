package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248831D0f extends Message<C2248831D0f, C2248851D0h> {
    public static final ProtoAdapter<C2248831D0f> ADAPTER = new ProtoAdapter<C2248831D0f>() { // from class: X.1D0g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248831D0f decode(ProtoReader protoReader) {
            C2248851D0h c2248851D0h = new C2248851D0h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 4) {
                            if (iNextTag != 6) {
                                if (iNextTag != 7) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2248851D0h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2248851D0h.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2248851D0h.LJFF = C2248861D0i.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2248851D0h.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2248851D0h.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248851D0h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248831D0f c2248831D0f) {
            C2248831D0f c2248831D0f2 = c2248831D0f;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c2248831D0f2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2248831D0f2.nickname) + C2248861D0i.ADAPTER.encodedSizeWithTag(6, c2248831D0f2.region) + protoAdapter.encodedSizeWithTag(7, c2248831D0f2.language) + c2248831D0f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248831D0f redact(C2248831D0f c2248831D0f) {
            C2248851D0h c2248851D0hNewBuilder = c2248831D0f.newBuilder();
            C2248861D0i c2248861D0i = c2248851D0hNewBuilder.LJFF;
            if (c2248861D0i != null) {
                c2248851D0hNewBuilder.LJFF = C2248861D0i.ADAPTER.redact(c2248861D0i);
            }
            c2248851D0hNewBuilder.clearUnknownFields();
            return c2248851D0hNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248831D0f c2248831D0f) {
            C2248831D0f c2248831D0f2 = c2248831D0f;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2248831D0f2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c2248831D0f2.nickname);
            C2248861D0i.ADAPTER.encodeWithTag(protoWriter, 6, c2248831D0f2.region);
            protoAdapter.encodeWithTag(protoWriter, 7, c2248831D0f2.language);
            protoWriter.writeBytes(c2248831D0f2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String language;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String nickname;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.RegionStruct#ADAPTER", tag = 6)
    public final C2248861D0i region;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        C2248861D0i c2248861D0i = this.region;
        int iHashCode4 = (iHashCode3 + (c2248861D0i != null ? c2248861D0i.hashCode() : 0)) * 37;
        String str2 = this.language;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2248851D0h newBuilder() {
        C2248851D0h c2248851D0h = new C2248851D0h();
        c2248851D0h.LIZLLL = this.id;
        c2248851D0h.LJ = this.nickname;
        c2248851D0h.LJFF = this.region;
        c2248851D0h.LJI = this.language;
        c2248851D0h.addUnknownFields(unknownFields());
        return c2248851D0h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        sb.replace(0, 2, "UserBaseDTO{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248831D0f)) {
            return false;
        }
        C2248831D0f c2248831D0f = (C2248831D0f) obj;
        if (unknownFields().equals(c2248831D0f.unknownFields()) && C1516540pZE.LJ(this.id, c2248831D0f.id) && C1516540pZE.LJ(this.nickname, c2248831D0f.nickname) && C1516540pZE.LJ(this.region, c2248831D0f.region) && C1516540pZE.LJ(this.language, c2248831D0f.language)) {
            return true;
        }
        return false;
    }

    public C2248831D0f(Long l, String str, C2248861D0i c2248861D0i, String str2) {
        this(l, str, c2248861D0i, str2, ByteString.EMPTY);
    }

    public C2248831D0f(Long l, String str, C2248861D0i c2248861D0i, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.nickname = str;
        this.region = c2248861D0i;
        this.language = str2;
    }
}
