package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898010ZKt extends Message<C898010ZKt, C897990ZKr> {
    public static final ProtoAdapter<C898010ZKt> ADAPTER = new ProtoAdapter<C898010ZKt>() { // from class: X.0ZKs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C898010ZKt decode(ProtoReader protoReader) {
            C897990ZKr c897990ZKr = new C897990ZKr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c897990ZKr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c897990ZKr.LJ = C2228481CJy.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c897990ZKr.LJFF = C2228481CJy.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c897990ZKr.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c897990ZKr.LJII = C905440Zfa.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c897990ZKr.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c897990ZKr.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c897990ZKr.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c897990ZKr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c897990ZKr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C898010ZKt c898010ZKt) {
            C898010ZKt c898010ZKt2 = c898010ZKt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c898010ZKt2.reply_type);
            ProtoAdapter<C2228481CJy> protoAdapter2 = C2228481CJy.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c898010ZKt2.from_user_info) + protoAdapter2.encodedSizeWithTag(3, c898010ZKt2.to_user_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, c898010ZKt2.live_backstage_sender_uid) + C905440Zfa.ADAPTER.encodedSizeWithTag(5, c898010ZKt2.reply_source_payload) + protoAdapter.encodedSizeWithTag(6, c898010ZKt2.entity_type) + protoAdapter.encodedSizeWithTag(7, c898010ZKt2.entity_id) + protoAdapter.encodedSizeWithTag(8, c898010ZKt2.traffic_type) + c898010ZKt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C898010ZKt redact(C898010ZKt c898010ZKt) {
            C897990ZKr c897990ZKrNewBuilder = c898010ZKt.newBuilder();
            C2228481CJy c2228481CJy = c897990ZKrNewBuilder.LJ;
            if (c2228481CJy != null) {
                c897990ZKrNewBuilder.LJ = C2228481CJy.ADAPTER.redact(c2228481CJy);
            }
            C2228481CJy c2228481CJy2 = c897990ZKrNewBuilder.LJFF;
            if (c2228481CJy2 != null) {
                c897990ZKrNewBuilder.LJFF = C2228481CJy.ADAPTER.redact(c2228481CJy2);
            }
            C905440Zfa c905440Zfa = c897990ZKrNewBuilder.LJII;
            if (c905440Zfa != null) {
                c897990ZKrNewBuilder.LJII = C905440Zfa.ADAPTER.redact(c905440Zfa);
            }
            c897990ZKrNewBuilder.clearUnknownFields();
            return c897990ZKrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C898010ZKt c898010ZKt) {
            C898010ZKt c898010ZKt2 = c898010ZKt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c898010ZKt2.reply_type);
            ProtoAdapter<C2228481CJy> protoAdapter2 = C2228481CJy.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 2, c898010ZKt2.from_user_info);
            protoAdapter2.encodeWithTag(protoWriter, 3, c898010ZKt2.to_user_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c898010ZKt2.live_backstage_sender_uid);
            C905440Zfa.ADAPTER.encodeWithTag(protoWriter, 5, c898010ZKt2.reply_source_payload);
            protoAdapter.encodeWithTag(protoWriter, 6, c898010ZKt2.entity_type);
            protoAdapter.encodeWithTag(protoWriter, 7, c898010ZKt2.entity_id);
            protoAdapter.encodeWithTag(protoWriter, 8, c898010ZKt2.traffic_type);
            protoWriter.writeBytes(c898010ZKt2.unknownFields());
        }
    };
    public static final Long DEFAULT_LIVE_BACKSTAGE_SENDER_UID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String entity_type;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.B2CUserInfo#ADAPTER", tag = 2)
    public final C2228481CJy from_user_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long live_backstage_sender_uid;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.ReplySourcePayload#ADAPTER", tag = 5)
    public final C905440Zfa reply_source_payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String reply_type;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.B2CUserInfo#ADAPTER", tag = 3)
    public final C2228481CJy to_user_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String traffic_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.reply_type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C2228481CJy c2228481CJy = this.from_user_info;
        int iHashCode3 = (iHashCode2 + (c2228481CJy != null ? c2228481CJy.hashCode() : 0)) * 37;
        C2228481CJy c2228481CJy2 = this.to_user_info;
        int iHashCode4 = (iHashCode3 + (c2228481CJy2 != null ? c2228481CJy2.hashCode() : 0)) * 37;
        Long l = this.live_backstage_sender_uid;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        C905440Zfa c905440Zfa = this.reply_source_payload;
        int iHashCode6 = (iHashCode5 + (c905440Zfa != null ? c905440Zfa.hashCode() : 0)) * 37;
        String str2 = this.entity_type;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.entity_id;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.traffic_type;
        int iHashCode9 = iHashCode8 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public C897990ZKr newBuilder() {
        C897990ZKr c897990ZKr = new C897990ZKr();
        c897990ZKr.LIZLLL = this.reply_type;
        c897990ZKr.LJ = this.from_user_info;
        c897990ZKr.LJFF = this.to_user_info;
        c897990ZKr.LJI = this.live_backstage_sender_uid;
        c897990ZKr.LJII = this.reply_source_payload;
        c897990ZKr.LJIIIIZZ = this.entity_type;
        c897990ZKr.LJIIIZ = this.entity_id;
        c897990ZKr.LJIIJ = this.traffic_type;
        c897990ZKr.addUnknownFields(unknownFields());
        return c897990ZKr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.reply_type != null) {
            sb.append(", reply_type=");
            sb.append(this.reply_type);
        }
        if (this.from_user_info != null) {
            sb.append(", from_user_info=");
            sb.append(this.from_user_info);
        }
        if (this.to_user_info != null) {
            sb.append(", to_user_info=");
            sb.append(this.to_user_info);
        }
        if (this.live_backstage_sender_uid != null) {
            sb.append(", live_backstage_sender_uid=");
            sb.append(this.live_backstage_sender_uid);
        }
        if (this.reply_source_payload != null) {
            sb.append(", reply_source_payload=");
            sb.append(this.reply_source_payload);
        }
        if (this.entity_type != null) {
            sb.append(", entity_type=");
            sb.append(this.entity_type);
        }
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.traffic_type != null) {
            sb.append(", traffic_type=");
            sb.append(this.traffic_type);
        }
        sb.replace(0, 2, "B2CInfoStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C898010ZKt)) {
            return false;
        }
        C898010ZKt c898010ZKt = (C898010ZKt) obj;
        if (unknownFields().equals(c898010ZKt.unknownFields()) && C1516540pZE.LJ(this.reply_type, c898010ZKt.reply_type) && C1516540pZE.LJ(this.from_user_info, c898010ZKt.from_user_info) && C1516540pZE.LJ(this.to_user_info, c898010ZKt.to_user_info) && C1516540pZE.LJ(this.live_backstage_sender_uid, c898010ZKt.live_backstage_sender_uid) && C1516540pZE.LJ(this.reply_source_payload, c898010ZKt.reply_source_payload) && C1516540pZE.LJ(this.entity_type, c898010ZKt.entity_type) && C1516540pZE.LJ(this.entity_id, c898010ZKt.entity_id) && C1516540pZE.LJ(this.traffic_type, c898010ZKt.traffic_type)) {
            return true;
        }
        return false;
    }

    public C898010ZKt(String str, C2228481CJy c2228481CJy, C2228481CJy c2228481CJy2, Long l, C905440Zfa c905440Zfa, String str2, String str3, String str4) {
        this(str, c2228481CJy, c2228481CJy2, l, c905440Zfa, str2, str3, str4, ByteString.EMPTY);
    }

    public C898010ZKt(String str, C2228481CJy c2228481CJy, C2228481CJy c2228481CJy2, Long l, C905440Zfa c905440Zfa, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reply_type = str;
        this.from_user_info = c2228481CJy;
        this.to_user_info = c2228481CJy2;
        this.live_backstage_sender_uid = l;
        this.reply_source_payload = c905440Zfa;
        this.entity_type = str2;
        this.entity_id = str3;
        this.traffic_type = str4;
    }
}
