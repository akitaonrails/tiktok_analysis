package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237861CiO extends Message<C2237861CiO, C2237881CiQ> {
    public static final ProtoAdapter<C2237861CiO> ADAPTER = new ProtoAdapter<C2237861CiO>() { // from class: X.1CiP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237861CiO decode(ProtoReader protoReader) {
            C2237881CiQ c2237881CiQ = new C2237881CiQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237881CiQ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2237881CiQ.LJFF = C2237221ChM.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2237881CiQ.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237881CiQ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237881CiQ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237861CiO c2237861CiO) {
            C2237861CiO c2237861CiO2 = c2237861CiO;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2237861CiO2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2237861CiO2.nickname) + C2237221ChM.ADAPTER.encodedSizeWithTag(3, c2237861CiO2.coordinate) + c2237861CiO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237861CiO redact(C2237861CiO c2237861CiO) {
            C2237881CiQ c2237881CiQNewBuilder = c2237861CiO.newBuilder();
            C2237221ChM c2237221ChM = c2237881CiQNewBuilder.LJFF;
            if (c2237221ChM != null) {
                c2237881CiQNewBuilder.LJFF = C2237221ChM.ADAPTER.redact(c2237221ChM);
            }
            c2237881CiQNewBuilder.clearUnknownFields();
            return c2237881CiQNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237861CiO c2237861CiO) {
            C2237861CiO c2237861CiO2 = c2237861CiO;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2237861CiO2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2237861CiO2.nickname);
            C2237221ChM.ADAPTER.encodeWithTag(protoWriter, 3, c2237861CiO2.coordinate);
            protoWriter.writeBytes(c2237861CiO2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotMentionCoordinate#ADAPTER", tag = 3)
    public final C2237221ChM coordinate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String nickname;

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
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        C2237221ChM c2237221ChM = this.coordinate;
        int iHashCode4 = iHashCode3 + (c2237221ChM != null ? c2237221ChM.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2237881CiQ newBuilder() {
        C2237881CiQ c2237881CiQ = new C2237881CiQ();
        c2237881CiQ.LIZLLL = this.user_id;
        c2237881CiQ.LJ = this.nickname;
        c2237881CiQ.LJFF = this.coordinate;
        c2237881CiQ.addUnknownFields(unknownFields());
        return c2237881CiQ;
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
        if (this.coordinate != null) {
            sb.append(", coordinate=");
            sb.append(this.coordinate);
        }
        sb.replace(0, 2, "AIGroupShotMentionInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237861CiO)) {
            return false;
        }
        C2237861CiO c2237861CiO = (C2237861CiO) obj;
        if (unknownFields().equals(c2237861CiO.unknownFields()) && C1516540pZE.LJ(this.user_id, c2237861CiO.user_id) && C1516540pZE.LJ(this.nickname, c2237861CiO.nickname) && C1516540pZE.LJ(this.coordinate, c2237861CiO.coordinate)) {
            return true;
        }
        return false;
    }

    public C2237861CiO(Long l, String str, C2237221ChM c2237221ChM) {
        this(l, str, c2237221ChM, ByteString.EMPTY);
    }

    public C2237861CiO(Long l, String str, C2237221ChM c2237221ChM, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.nickname = str;
        this.coordinate = c2237221ChM;
    }
}
