package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1E1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274651E1n extends Message<C2274651E1n, C2274661E1o> {
    public static final ProtoAdapter<C2274651E1n> ADAPTER = new ProtoAdapter<C2274651E1n>() { // from class: X.1E1m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2274651E1n decode(ProtoReader protoReader) {
            C2274651E1n c2274651E1n = new C2274651E1n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2274651E1n.activity_type.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            c2274651E1n.address_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2274651E1n.aid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2274651E1n.app_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2274651E1n.app_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2274651E1n.app_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2274651E1n.app_version = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2274651E1n.version_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2274651E1n.channel = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2274651E1n.carrier_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2274651E1n.new_sign_res = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2274651E1n.device_platform = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2274651E1n.device_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c2274651E1n.f256did = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c2274651E1n.iid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c2274651E1n.fp = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2274651E1n.os_version = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2274651E1n.goods_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c2274651E1n.goods_info.add(C2251631DAz.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c2274651E1n.sku.add(C1CK2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            c2274651E1n.coupon_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c2274651E1n.coupon_currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c2274651E1n.use_coupon = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c2274651E1n.locale = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 25:
                            c2274651E1n.priority_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c2274651E1n.screen_height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 27:
                            c2274651E1n.screen_width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 28:
                            c2274651E1n.session_aid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            c2274651E1n.session_did = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 30:
                            c2274651E1n.sys_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            c2274651E1n.sys_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            c2274651E1n.timezone_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c2274651E1n.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c2274651E1n.user_agent = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 35:
                            c2274651E1n.user_create_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c2274651E1n.user_note.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 37:
                            c2274651E1n.forwarded = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 38:
                            c2274651E1n.sub_merchant_id.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 39:
                            c2274651E1n.amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 40:
                            c2274651E1n.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 41:
                            c2274651E1n.current_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 42:
                            c2274651E1n.mcc_mnc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 43:
                            c2274651E1n.residence = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 44:
                            c2274651E1n.target = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 45:
                            c2274651E1n.amount_breakdown = C2229381CNk.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2274651E1n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2274651E1n c2274651E1n) {
            C2274651E1n c2274651E1n2 = c2274651E1n;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, c2274651E1n2.activity_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2274651E1n2.address_id) + protoAdapter2.encodedSizeWithTag(3, c2274651E1n2.aid) + protoAdapter2.encodedSizeWithTag(4, c2274651E1n2.app_name) + protoAdapter2.encodedSizeWithTag(5, c2274651E1n2.app_language) + protoAdapter2.encodedSizeWithTag(6, c2274651E1n2.app_region) + protoAdapter2.encodedSizeWithTag(7, c2274651E1n2.app_version) + protoAdapter2.encodedSizeWithTag(8, c2274651E1n2.version_name) + protoAdapter2.encodedSizeWithTag(9, c2274651E1n2.channel) + protoAdapter2.encodedSizeWithTag(10, c2274651E1n2.carrier_region) + protoAdapter2.encodedSizeWithTag(11, c2274651E1n2.new_sign_res) + protoAdapter2.encodedSizeWithTag(12, c2274651E1n2.device_platform) + protoAdapter2.encodedSizeWithTag(13, c2274651E1n2.device_type) + protoAdapter2.encodedSizeWithTag(14, c2274651E1n2.f256did) + protoAdapter2.encodedSizeWithTag(15, c2274651E1n2.iid) + protoAdapter2.encodedSizeWithTag(16, c2274651E1n2.fp) + protoAdapter2.encodedSizeWithTag(17, c2274651E1n2.os_version) + protoAdapter2.encodedSizeWithTag(18, c2274651E1n2.goods_desc) + C2251631DAz.ADAPTER.asRepeated().encodedSizeWithTag(19, c2274651E1n2.goods_info) + C1CK2.ADAPTER.asRepeated().encodedSizeWithTag(20, c2274651E1n2.sku) + protoAdapter2.encodedSizeWithTag(21, c2274651E1n2.coupon_amount) + protoAdapter2.encodedSizeWithTag(22, c2274651E1n2.coupon_currency) + ProtoAdapter.BOOL.encodedSizeWithTag(23, c2274651E1n2.use_coupon) + protoAdapter2.encodedSizeWithTag(24, c2274651E1n2.locale) + protoAdapter2.encodedSizeWithTag(25, c2274651E1n2.priority_region) + protoAdapter.encodedSizeWithTag(26, c2274651E1n2.screen_height) + protoAdapter.encodedSizeWithTag(27, c2274651E1n2.screen_width) + protoAdapter2.encodedSizeWithTag(28, c2274651E1n2.session_aid) + protoAdapter2.encodedSizeWithTag(29, c2274651E1n2.session_did) + protoAdapter2.encodedSizeWithTag(30, c2274651E1n2.sys_language) + protoAdapter2.encodedSizeWithTag(31, c2274651E1n2.sys_region) + protoAdapter2.encodedSizeWithTag(32, c2274651E1n2.timezone_name) + protoAdapter2.encodedSizeWithTag(33, c2274651E1n2.uid) + protoAdapter2.encodedSizeWithTag(34, c2274651E1n2.user_agent) + protoAdapter2.encodedSizeWithTag(35, c2274651E1n2.user_create_time) + protoAdapter2.asRepeated().encodedSizeWithTag(36, c2274651E1n2.user_note) + protoAdapter2.encodedSizeWithTag(37, c2274651E1n2.forwarded) + protoAdapter2.asRepeated().encodedSizeWithTag(38, c2274651E1n2.sub_merchant_id) + protoAdapter2.encodedSizeWithTag(39, c2274651E1n2.amount) + protoAdapter2.encodedSizeWithTag(40, c2274651E1n2.currency) + protoAdapter2.encodedSizeWithTag(41, c2274651E1n2.current_region) + protoAdapter2.encodedSizeWithTag(42, c2274651E1n2.mcc_mnc) + protoAdapter2.encodedSizeWithTag(43, c2274651E1n2.residence) + protoAdapter2.encodedSizeWithTag(44, c2274651E1n2.target) + C2229381CNk.ADAPTER.encodedSizeWithTag(45, c2274651E1n2.amount_breakdown) + c2274651E1n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2274651E1n c2274651E1n) {
        }
    };
    public List<Long> activity_type;
    public String address_id;
    public String aid;
    public String amount;
    public C2229381CNk amount_breakdown;
    public String app_language;
    public String app_name;
    public String app_region;
    public String app_version;
    public String carrier_region;
    public String channel;
    public String coupon_amount;
    public String coupon_currency;
    public String currency;
    public String current_region;
    public String device_platform;
    public String device_type;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    public String f256did;
    public String forwarded;
    public String fp;
    public String goods_desc;
    public List<C2251631DAz> goods_info;
    public String iid;
    public String locale;
    public String mcc_mnc;
    public String new_sign_res;
    public String os_version;
    public String priority_region;
    public String residence;
    public Long screen_height;
    public Long screen_width;
    public String session_aid;
    public String session_did;
    public List<C1CK2> sku;
    public List<String> sub_merchant_id;
    public String sys_language;
    public String sys_region;
    public String target;
    public String timezone_name;
    public String uid;
    public Boolean use_coupon;
    public String user_agent;
    public String user_create_time;
    public List<String> user_note;
    public String version_name;

    public C2274651E1n() {
        super(ADAPTER, ByteString.EMPTY);
        this.activity_type = C1516540pZE.LJIIIIZZ();
        this.goods_info = C1516540pZE.LJIIIIZZ();
        this.sku = C1516540pZE.LJIIIIZZ();
        this.user_note = C1516540pZE.LJIIIIZZ();
        this.sub_merchant_id = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2274661E1o newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
