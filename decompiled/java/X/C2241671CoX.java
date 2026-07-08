package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241671CoX extends Message<C2241671CoX, C2241691CoZ> {
    public static final ProtoAdapter<C2241671CoX> ADAPTER = new ProtoAdapter<C2241671CoX>() { // from class: X.1CoY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241671CoX decode(ProtoReader protoReader) {
            C2241691CoZ c2241691CoZ = new C2241691CoZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2241691CoZ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2241691CoZ.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2241691CoZ.LJFF = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2241691CoZ.LJI = EnumC19361210os.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2241691CoZ.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2241691CoZ.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2241691CoZ.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2241691CoZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241691CoZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241671CoX c2241671CoX) {
            C2241671CoX c2241671CoX2 = c2241671CoX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241671CoX2.game_id) + protoAdapter.encodedSizeWithTag(2, c2241671CoX2.game_name) + C2244091CsR.ADAPTER.encodedSizeWithTag(3, c2241671CoX2.game_thumbnail) + EnumC19361210os.ADAPTER.encodedSizeWithTag(4, c2241671CoX2.order) + ProtoAdapter.INT32.encodedSizeWithTag(5, c2241671CoX2.rank_type) + protoAdapter.encodedSizeWithTag(6, c2241671CoX2.resource_id) + c2241671CoX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241671CoX redact(C2241671CoX c2241671CoX) {
            C2241691CoZ c2241691CoZNewBuilder = c2241671CoX.newBuilder();
            C2244091CsR c2244091CsR = c2241691CoZNewBuilder.LJFF;
            if (c2244091CsR != null) {
                c2241691CoZNewBuilder.LJFF = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2241691CoZNewBuilder.clearUnknownFields();
            return c2241691CoZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241671CoX c2241671CoX) {
            C2241671CoX c2241671CoX2 = c2241671CoX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241671CoX2.game_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241671CoX2.game_name);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 3, c2241671CoX2.game_thumbnail);
            EnumC19361210os.ADAPTER.encodeWithTag(protoWriter, 4, c2241671CoX2.order);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c2241671CoX2.rank_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c2241671CoX2.resource_id);
            protoWriter.writeBytes(c2241671CoX2.unknownFields());
        }
    };
    public static final EnumC19361210os DEFAULT_ORDER = EnumC19361210os.GAME_RANKING_ORDER_UNKNOWN;
    public static final Integer DEFAULT_RANK_TYPE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String game_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String game_name;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C2244091CsR game_thumbnail;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GameRankingOrder#ADAPTER", tag = 4)
    public final EnumC19361210os order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer rank_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String resource_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.game_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.game_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.game_thumbnail;
        int iHashCode4 = (iHashCode3 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        EnumC19361210os enumC19361210os = this.order;
        int iHashCode5 = (iHashCode4 + (enumC19361210os != null ? enumC19361210os.hashCode() : 0)) * 37;
        Integer num = this.rank_type;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        String str3 = this.resource_id;
        int iHashCode7 = iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2241691CoZ newBuilder() {
        C2241691CoZ c2241691CoZ = new C2241691CoZ();
        c2241691CoZ.LIZLLL = this.game_id;
        c2241691CoZ.LJ = this.game_name;
        c2241691CoZ.LJFF = this.game_thumbnail;
        c2241691CoZ.LJI = this.order;
        c2241691CoZ.LJII = this.rank_type;
        c2241691CoZ.LJIIIIZZ = this.resource_id;
        c2241691CoZ.addUnknownFields(unknownFields());
        return c2241691CoZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.game_id != null) {
            sb.append(", game_id=");
            sb.append(this.game_id);
        }
        if (this.game_name != null) {
            sb.append(", game_name=");
            sb.append(this.game_name);
        }
        if (this.game_thumbnail != null) {
            sb.append(", game_thumbnail=");
            sb.append(this.game_thumbnail);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        if (this.rank_type != null) {
            sb.append(", rank_type=");
            sb.append(this.rank_type);
        }
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        sb.replace(0, 2, "GameInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241671CoX)) {
            return false;
        }
        C2241671CoX c2241671CoX = (C2241671CoX) obj;
        if (unknownFields().equals(c2241671CoX.unknownFields()) && C1516540pZE.LJ(this.game_id, c2241671CoX.game_id) && C1516540pZE.LJ(this.game_name, c2241671CoX.game_name) && C1516540pZE.LJ(this.game_thumbnail, c2241671CoX.game_thumbnail) && C1516540pZE.LJ(this.order, c2241671CoX.order) && C1516540pZE.LJ(this.rank_type, c2241671CoX.rank_type) && C1516540pZE.LJ(this.resource_id, c2241671CoX.resource_id)) {
            return true;
        }
        return false;
    }

    public C2241671CoX(String str, String str2, C2244091CsR c2244091CsR, EnumC19361210os enumC19361210os, Integer num, String str3) {
        this(str, str2, c2244091CsR, enumC19361210os, num, str3, ByteString.EMPTY);
    }

    public C2241671CoX(String str, String str2, C2244091CsR c2244091CsR, EnumC19361210os enumC19361210os, Integer num, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.game_id = str;
        this.game_name = str2;
        this.game_thumbnail = c2244091CsR;
        this.order = enumC19361210os;
        this.rank_type = num;
        this.resource_id = str3;
    }
}
