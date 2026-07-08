package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906250Zgt extends Message<C906250Zgt, C906180Zgm> {
    public static final Integer DEFAULT_ERROR_CODE;
    public static final Integer DEFAULT_FIRST_SEQ_ID;
    public static final Boolean DEFAULT_IS_FINISH;
    public static final Boolean DEFAULT_RESET_CONTENT;
    public static final Integer DEFAULT_SEQ_ID;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.StreamBlock#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public final List<C906290Zgx> blocks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final Integer error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Integer first_seq_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 8)
    public final Boolean is_finish;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer message_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String reply_client_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long reply_server_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final Boolean reset_content;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.RetryInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C906230Zgr retry_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String send_client_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long send_server_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Integer seq_id;
    public static final ProtoAdapter<C906250Zgt> ADAPTER = new ProtoAdapter<C906250Zgt>() { // from class: X.0Zgs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906250Zgt decode(ProtoReader protoReader) {
            C906180Zgm c906180Zgm = new C906180Zgm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 20) {
                        if (iNextTag != 21) {
                            switch (iNextTag) {
                                case 1:
                                    c906180Zgm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c906180Zgm.LJ = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 3:
                                    c906180Zgm.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    c906180Zgm.LJI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 5:
                                    c906180Zgm.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 6:
                                    c906180Zgm.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c906180Zgm.LJIIIZ.add(C906290Zgx.ADAPTER.decode(protoReader));
                                    break;
                                case 8:
                                    c906180Zgm.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c906180Zgm.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c906180Zgm.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c906180Zgm.LJIILIIL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c906180Zgm.LJIILJJIL = C906230Zgr.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c906180Zgm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c906180Zgm.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c906180Zgm.LJIILL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906180Zgm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906250Zgt c906250Zgt) {
            C906250Zgt c906250Zgt2 = c906250Zgt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c906250Zgt2.send_client_message_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c906250Zgt2.send_server_message_id) + protoAdapter.encodedSizeWithTag(3, c906250Zgt2.reply_client_message_id) + protoAdapter2.encodedSizeWithTag(4, c906250Zgt2.reply_server_message_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c906250Zgt2.message_type) + protoAdapter.encodedSizeWithTag(6, c906250Zgt2.scene) + C906290Zgx.ADAPTER.asRepeated().encodedSizeWithTag(7, c906250Zgt2.blocks);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(8, c906250Zgt2.is_finish) + protoAdapter3.encodedSizeWithTag(9, c906250Zgt2.seq_id) + protoAdapter3.encodedSizeWithTag(10, c906250Zgt2.first_seq_id) + protoAdapter4.encodedSizeWithTag(11, c906250Zgt2.reset_content) + C906230Zgr.ADAPTER.encodedSizeWithTag(12, c906250Zgt2.retry_info) + protoAdapter3.encodedSizeWithTag(20, c906250Zgt2.error_code) + protoAdapter.encodedSizeWithTag(21, c906250Zgt2.error_message) + c906250Zgt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906250Zgt redact(C906250Zgt c906250Zgt) {
            C906180Zgm c906180ZgmNewBuilder = c906250Zgt.newBuilder();
            C1516540pZE.LJIIIZ(c906180ZgmNewBuilder.LJIIIZ, C906290Zgx.ADAPTER);
            C906230Zgr c906230Zgr = c906180ZgmNewBuilder.LJIILJJIL;
            if (c906230Zgr != null) {
                c906180ZgmNewBuilder.LJIILJJIL = C906230Zgr.ADAPTER.redact(c906230Zgr);
            }
            c906180ZgmNewBuilder.clearUnknownFields();
            return c906180ZgmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906250Zgt c906250Zgt) {
            C906250Zgt c906250Zgt2 = c906250Zgt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c906250Zgt2.send_client_message_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c906250Zgt2.send_server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c906250Zgt2.reply_client_message_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c906250Zgt2.reply_server_message_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c906250Zgt2.message_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c906250Zgt2.scene);
            C906290Zgx.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, c906250Zgt2.blocks);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 8, c906250Zgt2.is_finish);
            protoAdapter3.encodeWithTag(protoWriter, 9, c906250Zgt2.seq_id);
            protoAdapter3.encodeWithTag(protoWriter, 10, c906250Zgt2.first_seq_id);
            protoAdapter4.encodeWithTag(protoWriter, 11, c906250Zgt2.reset_content);
            C906230Zgr.ADAPTER.encodeWithTag(protoWriter, 12, c906250Zgt2.retry_info);
            protoAdapter3.encodeWithTag(protoWriter, 20, c906250Zgt2.error_code);
            protoAdapter.encodeWithTag(protoWriter, 21, c906250Zgt2.error_message);
            protoWriter.writeBytes(c906250Zgt2.unknownFields());
        }
    };
    public static final Long DEFAULT_SEND_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_REPLY_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_FINISH = bool;
        DEFAULT_SEQ_ID = 0;
        DEFAULT_FIRST_SEQ_ID = 0;
        DEFAULT_RESET_CONTENT = bool;
        DEFAULT_ERROR_CODE = 0;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.send_client_message_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.send_server_message_id;
        int iHashCode3 = (((((iHashCode2 + (l != null ? l.hashCode() : 0)) * 37) + this.reply_client_message_id.hashCode()) * 37) + this.reply_server_message_id.hashCode()) * 37;
        Integer num = this.message_type;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.scene;
        int iHashCode5 = (((((((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.blocks.hashCode()) * 37) + this.is_finish.hashCode()) * 37) + this.seq_id.hashCode()) * 37) + this.first_seq_id.hashCode()) * 37) + this.reset_content.hashCode()) * 37;
        C906230Zgr c906230Zgr = this.retry_info;
        int iHashCode6 = (iHashCode5 + (c906230Zgr != null ? c906230Zgr.hashCode() : 0)) * 37;
        Integer num2 = this.error_code;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str3 = this.error_message;
        int iHashCode8 = iHashCode7 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C906180Zgm newBuilder() {
        C906180Zgm c906180Zgm = new C906180Zgm();
        c906180Zgm.LIZLLL = this.send_client_message_id;
        c906180Zgm.LJ = this.send_server_message_id;
        c906180Zgm.LJFF = this.reply_client_message_id;
        c906180Zgm.LJI = this.reply_server_message_id;
        c906180Zgm.LJII = this.message_type;
        c906180Zgm.LJIIIIZZ = this.scene;
        c906180Zgm.LJIIIZ = C1516540pZE.LIZJ("blocks", this.blocks);
        c906180Zgm.LJIIJ = this.is_finish;
        c906180Zgm.LJIIJJI = this.seq_id;
        c906180Zgm.LJIIL = this.first_seq_id;
        c906180Zgm.LJIILIIL = this.reset_content;
        c906180Zgm.LJIILJJIL = this.retry_info;
        c906180Zgm.LJIILL = this.error_code;
        c906180Zgm.LJIILLIIL = this.error_message;
        c906180Zgm.addUnknownFields(unknownFields());
        return c906180Zgm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_client_message_id != null) {
            sb.append(", send_client_message_id=");
            sb.append(this.send_client_message_id);
        }
        if (this.send_server_message_id != null) {
            sb.append(", send_server_message_id=");
            sb.append(this.send_server_message_id);
        }
        sb.append(", reply_client_message_id=");
        sb.append(this.reply_client_message_id);
        sb.append(", reply_server_message_id=");
        sb.append(this.reply_server_message_id);
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (!this.blocks.isEmpty()) {
            sb.append(", blocks=");
            sb.append(this.blocks);
        }
        sb.append(", is_finish=");
        sb.append(this.is_finish);
        sb.append(", seq_id=");
        sb.append(this.seq_id);
        sb.append(", first_seq_id=");
        sb.append(this.first_seq_id);
        sb.append(", reset_content=");
        sb.append(this.reset_content);
        if (this.retry_info != null) {
            sb.append(", retry_info=");
            sb.append(this.retry_info);
        }
        if (this.error_code != null) {
            sb.append(", error_code=");
            sb.append(this.error_code);
        }
        if (this.error_message != null) {
            sb.append(", error_message=");
            sb.append(this.error_message);
        }
        sb.replace(0, 2, "tiktok_v2_im_get_streaming_msg_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906250Zgt)) {
            return false;
        }
        C906250Zgt c906250Zgt = (C906250Zgt) obj;
        if (unknownFields().equals(c906250Zgt.unknownFields()) && C1516540pZE.LJ(this.send_client_message_id, c906250Zgt.send_client_message_id) && C1516540pZE.LJ(this.send_server_message_id, c906250Zgt.send_server_message_id) && this.reply_client_message_id.equals(c906250Zgt.reply_client_message_id) && this.reply_server_message_id.equals(c906250Zgt.reply_server_message_id) && C1516540pZE.LJ(this.message_type, c906250Zgt.message_type) && C1516540pZE.LJ(this.scene, c906250Zgt.scene) && this.blocks.equals(c906250Zgt.blocks) && this.is_finish.equals(c906250Zgt.is_finish) && this.seq_id.equals(c906250Zgt.seq_id) && this.first_seq_id.equals(c906250Zgt.first_seq_id) && this.reset_content.equals(c906250Zgt.reset_content) && C1516540pZE.LJ(this.retry_info, c906250Zgt.retry_info) && C1516540pZE.LJ(this.error_code, c906250Zgt.error_code) && C1516540pZE.LJ(this.error_message, c906250Zgt.error_message)) {
            return true;
        }
        return false;
    }

    public C906250Zgt(String str, Long l, String str2, Long l2, Integer num, String str3, List<C906290Zgx> list, Boolean bool, Integer num2, Integer num3, Boolean bool2, C906230Zgr c906230Zgr, Integer num4, String str4) {
        this(str, l, str2, l2, num, str3, list, bool, num2, num3, bool2, c906230Zgr, num4, str4, ByteString.EMPTY);
    }

    public C906250Zgt(String str, Long l, String str2, Long l2, Integer num, String str3, List<C906290Zgx> list, Boolean bool, Integer num2, Integer num3, Boolean bool2, C906230Zgr c906230Zgr, Integer num4, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_client_message_id = str;
        this.send_server_message_id = l;
        this.reply_client_message_id = str2;
        this.reply_server_message_id = l2;
        this.message_type = num;
        this.scene = str3;
        this.blocks = C1516540pZE.LJFF("blocks", list);
        this.is_finish = bool;
        this.seq_id = num2;
        this.first_seq_id = num3;
        this.reset_content = bool2;
        this.retry_info = c906230Zgr;
        this.error_code = num4;
        this.error_message = str4;
    }
}
