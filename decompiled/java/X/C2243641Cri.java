package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243641Cri extends Message<C2243641Cri, C2243771Crv> {
    public static final ProtoAdapter<C2243641Cri> ADAPTER = new ProtoAdapter<C2243641Cri>() { // from class: X.1Crl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243641Cri decode(ProtoReader protoReader) {
            C2243771Crv c2243771Crv = new C2243771Crv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2243771Crv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2243771Crv.LJFF = C2244091CsR.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243771Crv.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2243771Crv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243771Crv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243641Cri c2243641Cri) {
            C2243641Cri c2243641Cri2 = c2243641Cri;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2243641Cri2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2243641Cri2.nick_name) + C2244091CsR.ADAPTER.encodedSizeWithTag(3, c2243641Cri2.avatar_thumb) + c2243641Cri2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243641Cri redact(C2243641Cri c2243641Cri) {
            C2243771Crv c2243771CrvNewBuilder = c2243641Cri.newBuilder();
            C2244091CsR c2244091CsR = c2243771CrvNewBuilder.LJFF;
            if (c2244091CsR != null) {
                c2243771CrvNewBuilder.LJFF = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2243771CrvNewBuilder.clearUnknownFields();
            return c2243771CrvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243641Cri c2243641Cri) {
            C2243641Cri c2243641Cri2 = c2243641Cri;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2243641Cri2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2243641Cri2.nick_name);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 3, c2243641Cri2.avatar_thumb);
            protoWriter.writeBytes(c2243641Cri2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C2244091CsR avatar_thumb;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String nick_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.user_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.nick_name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.avatar_thumb;
        int iHashCode4 = iHashCode3 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2243771Crv newBuilder() {
        C2243771Crv c2243771Crv = new C2243771Crv();
        c2243771Crv.LIZLLL = this.user_id;
        c2243771Crv.LJ = this.nick_name;
        c2243771Crv.LJFF = this.avatar_thumb;
        c2243771Crv.addUnknownFields(unknownFields());
        return c2243771Crv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.nick_name != null) {
            sb.append(", nick_name=");
            sb.append(this.nick_name);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        sb.replace(0, 2, "UserInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243641Cri)) {
            return false;
        }
        C2243641Cri c2243641Cri = (C2243641Cri) obj;
        if (unknownFields().equals(c2243641Cri.unknownFields()) && C1516540pZE.LJ(this.user_id, c2243641Cri.user_id) && C1516540pZE.LJ(this.nick_name, c2243641Cri.nick_name) && C1516540pZE.LJ(this.avatar_thumb, c2243641Cri.avatar_thumb)) {
            return true;
        }
        return false;
    }

    public C2243641Cri(Long l, String str, C2244091CsR c2244091CsR) {
        this(l, str, c2244091CsR, ByteString.EMPTY);
    }

    public C2243641Cri(Long l, String str, C2244091CsR c2244091CsR, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.nick_name = str;
        this.avatar_thumb = c2244091CsR;
    }
}
