package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242541Cpw extends Message<C2242541Cpw, C2242531Cpv> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 4)
    public final C2244091CsR avatar;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final C2243521CrW description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer follower_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean is_verify;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 5)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 6)
    public final C2243521CrW username;
    public static final ProtoAdapter<C2242541Cpw> ADAPTER = new ProtoAdapter<C2242541Cpw>() { // from class: X.1Cpx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242541Cpw decode(ProtoReader protoReader) {
            C2242531Cpv c2242531Cpv = new C2242531Cpv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242531Cpv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2242531Cpv.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2242531Cpv.LJFF = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2242531Cpv.LJI = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242531Cpv.LJII = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2242531Cpv.LJIIIIZZ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2242531Cpv.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2242531Cpv.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2242531Cpv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242531Cpv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242541Cpw c2242541Cpw) {
            C2242541Cpw c2242541Cpw2 = c2242541Cpw;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c2242541Cpw2.user_id);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2242541Cpw2.nickname) + protoAdapter.encodedSizeWithTag(3, c2242541Cpw2.description) + C2244091CsR.ADAPTER.encodedSizeWithTag(4, c2242541Cpw2.avatar) + C2244321Cso.ADAPTER.encodedSizeWithTag(5, c2242541Cpw2.link_info) + protoAdapter.encodedSizeWithTag(6, c2242541Cpw2.username) + ProtoAdapter.INT32.encodedSizeWithTag(7, c2242541Cpw2.follower_count) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c2242541Cpw2.is_verify) + c2242541Cpw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242541Cpw redact(C2242541Cpw c2242541Cpw) {
            C2242531Cpv c2242531CpvNewBuilder = c2242541Cpw.newBuilder();
            C2243521CrW c2243521CrW = c2242531CpvNewBuilder.LJ;
            if (c2243521CrW != null) {
                c2242531CpvNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2242531CpvNewBuilder.LJFF;
            if (c2243521CrW2 != null) {
                c2242531CpvNewBuilder.LJFF = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2244091CsR c2244091CsR = c2242531CpvNewBuilder.LJI;
            if (c2244091CsR != null) {
                c2242531CpvNewBuilder.LJI = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244321Cso c2244321Cso = c2242531CpvNewBuilder.LJII;
            if (c2244321Cso != null) {
                c2242531CpvNewBuilder.LJII = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2243521CrW c2243521CrW3 = c2242531CpvNewBuilder.LJIIIIZZ;
            if (c2243521CrW3 != null) {
                c2242531CpvNewBuilder.LJIIIIZZ = C2243521CrW.ADAPTER.redact(c2243521CrW3);
            }
            c2242531CpvNewBuilder.clearUnknownFields();
            return c2242531CpvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242541Cpw c2242541Cpw) {
            C2242541Cpw c2242541Cpw2 = c2242541Cpw;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2242541Cpw2.user_id);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c2242541Cpw2.nickname);
            protoAdapter.encodeWithTag(protoWriter, 3, c2242541Cpw2.description);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 4, c2242541Cpw2.avatar);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 5, c2242541Cpw2.link_info);
            protoAdapter.encodeWithTag(protoWriter, 6, c2242541Cpw2.username);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c2242541Cpw2.follower_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, c2242541Cpw2.is_verify);
            protoWriter.writeBytes(c2242541Cpw2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_FOLLOWER_COUNT = 0;
    public static final Boolean DEFAULT_IS_VERIFY = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.user_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.nickname;
        int iHashCode3 = (iHashCode2 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.description;
        int iHashCode4 = (iHashCode3 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.avatar;
        int iHashCode5 = (iHashCode4 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode6 = (iHashCode5 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW3 = this.username;
        int iHashCode7 = (iHashCode6 + (c2243521CrW3 != null ? c2243521CrW3.hashCode() : 0)) * 37;
        Integer num = this.follower_count;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.is_verify;
        int iHashCode9 = iHashCode8 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public C2242531Cpv newBuilder() {
        C2242531Cpv c2242531Cpv = new C2242531Cpv();
        c2242531Cpv.LIZLLL = this.user_id;
        c2242531Cpv.LJ = this.nickname;
        c2242531Cpv.LJFF = this.description;
        c2242531Cpv.LJI = this.avatar;
        c2242531Cpv.LJII = this.link_info;
        c2242531Cpv.LJIIIIZZ = this.username;
        c2242531Cpv.LJIIIZ = this.follower_count;
        c2242531Cpv.LJIIJ = this.is_verify;
        c2242531Cpv.addUnknownFields(unknownFields());
        return c2242531Cpv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.username != null) {
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.follower_count != null) {
            sb.append(", follower_count=");
            sb.append(this.follower_count);
        }
        if (this.is_verify != null) {
            sb.append(", is_verify=");
            sb.append(this.is_verify);
        }
        sb.replace(0, 2, "BaseUser{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242541Cpw)) {
            return false;
        }
        C2242541Cpw c2242541Cpw = (C2242541Cpw) obj;
        if (unknownFields().equals(c2242541Cpw.unknownFields()) && C1516540pZE.LJ(this.user_id, c2242541Cpw.user_id) && C1516540pZE.LJ(this.nickname, c2242541Cpw.nickname) && C1516540pZE.LJ(this.description, c2242541Cpw.description) && C1516540pZE.LJ(this.avatar, c2242541Cpw.avatar) && C1516540pZE.LJ(this.link_info, c2242541Cpw.link_info) && C1516540pZE.LJ(this.username, c2242541Cpw.username) && C1516540pZE.LJ(this.follower_count, c2242541Cpw.follower_count) && C1516540pZE.LJ(this.is_verify, c2242541Cpw.is_verify)) {
            return true;
        }
        return false;
    }

    public C2242541Cpw(Long l, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244091CsR c2244091CsR, C2244321Cso c2244321Cso, C2243521CrW c2243521CrW3, Integer num, Boolean bool) {
        this(l, c2243521CrW, c2243521CrW2, c2244091CsR, c2244321Cso, c2243521CrW3, num, bool, ByteString.EMPTY);
    }

    public C2242541Cpw(Long l, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244091CsR c2244091CsR, C2244321Cso c2244321Cso, C2243521CrW c2243521CrW3, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.nickname = c2243521CrW;
        this.description = c2243521CrW2;
        this.avatar = c2244091CsR;
        this.link_info = c2244321Cso;
        this.username = c2243521CrW3;
        this.follower_count = num;
        this.is_verify = bool;
    }
}
