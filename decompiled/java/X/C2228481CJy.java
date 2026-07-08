package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228481CJy extends Message<C2228481CJy, C1CK0> {
    public static final ProtoAdapter<C2228481CJy> ADAPTER = new ProtoAdapter<C2228481CJy>() { // from class: X.1CJz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228481CJy decode(ProtoReader protoReader) {
            C1CK0 c1ck0 = new C1CK0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1ck0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1ck0.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1ck0.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1ck0.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ck0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228481CJy c2228481CJy) {
            C2228481CJy c2228481CJy2 = c2228481CJy;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228481CJy2.category_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2228481CJy2.follower_count) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c2228481CJy2.is_blue_v) + c2228481CJy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228481CJy redact(C2228481CJy c2228481CJy) {
            C1CK0 c1ck0NewBuilder = c2228481CJy.newBuilder();
            c1ck0NewBuilder.clearUnknownFields();
            return c1ck0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228481CJy c2228481CJy) {
            C2228481CJy c2228481CJy2 = c2228481CJy;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228481CJy2.category_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2228481CJy2.follower_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c2228481CJy2.is_blue_v);
            protoWriter.writeBytes(c2228481CJy2.unknownFields());
        }
    };
    public static final Long DEFAULT_FOLLOWER_COUNT = 0L;
    public static final Boolean DEFAULT_IS_BLUE_V = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String category_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long follower_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean is_blue_v;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.category_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.follower_count;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        Boolean bool = this.is_blue_v;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CK0 newBuilder() {
        C1CK0 c1ck0 = new C1CK0();
        c1ck0.LIZLLL = this.category_id;
        c1ck0.LJ = this.follower_count;
        c1ck0.LJFF = this.is_blue_v;
        c1ck0.addUnknownFields(unknownFields());
        return c1ck0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category_id != null) {
            sb.append(", category_id=");
            sb.append(this.category_id);
        }
        if (this.follower_count != null) {
            sb.append(", follower_count=");
            sb.append(this.follower_count);
        }
        if (this.is_blue_v != null) {
            sb.append(", is_blue_v=");
            sb.append(this.is_blue_v);
        }
        sb.replace(0, 2, "B2CUserInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228481CJy)) {
            return false;
        }
        C2228481CJy c2228481CJy = (C2228481CJy) obj;
        if (unknownFields().equals(c2228481CJy.unknownFields()) && C1516540pZE.LJ(this.category_id, c2228481CJy.category_id) && C1516540pZE.LJ(this.follower_count, c2228481CJy.follower_count) && C1516540pZE.LJ(this.is_blue_v, c2228481CJy.is_blue_v)) {
            return true;
        }
        return false;
    }

    public C2228481CJy(String str, Long l, Boolean bool) {
        this(str, l, bool, ByteString.EMPTY);
    }

    public C2228481CJy(String str, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_id = str;
        this.follower_count = l;
        this.is_blue_v = bool;
    }
}
