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

/* JADX INFO: renamed from: X.021J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021J extends Message<C021J, C584002Pm> {
    public static final ProtoAdapter<C021J> ADAPTER = new ProtoAdapter<C021J>() { // from class: X.021B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021J decode(ProtoReader protoReader) {
            C021J c021j = new C021J();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021j.order_promotion_cache_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c021j.platform_discount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c021j.voucher_selected_info.add(AnonymousClass0248.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c021j.coupon_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c021j.discount_back = C554502Ed.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c021j.coupon_status = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c021j.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c021j.unused_vouchers_count = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021j.promotion_tag_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c021j.first_screen_banner_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021j.unused_coupon_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021j.highlight_promotion = C601502Wf.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021j.discount_brief.add(C02DO.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            c021j.bonus_info = C5224021u.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c021j.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c021j.promotion_banner = C5435029x.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021j.promotion_tag_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021j.voucher_back = C681002lE.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c021j.discount_labels.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021j.discount_brief_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c021j.deal_labels.add(C561402Gu.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c021j.promotion_coupon_module = C5294024m.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c021j.title_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c021j.title_icon_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 25:
                            c021j.entrance_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c021j.promotion_notice.add(C02VR.ADAPTER.decode(protoReader));
                            break;
                        case 27:
                            c021j.promotion_selling_point.add(C02B1.ADAPTER.decode(protoReader));
                            break;
                        case 28:
                            c021j.platform_discount_brief = C02GX.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021J c021j) {
            C021J c021j2 = c021j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c021j2.order_promotion_cache_key) + protoAdapter.encodedSizeWithTag(2, c021j2.platform_discount) + AnonymousClass0248.ADAPTER.asRepeated().encodedSizeWithTag(3, c021j2.voucher_selected_info) + protoAdapter.encodedSizeWithTag(4, c021j2.coupon_schema) + C554502Ed.ADAPTER.encodedSizeWithTag(5, c021j2.discount_back) + protoAdapter.encodedSizeWithTag(6, c021j2.coupon_status) + protoAdapter.encodedSizeWithTag(7, c021j2.title) + protoAdapter.encodedSizeWithTag(8, c021j2.unused_vouchers_count) + protoAdapter.encodedSizeWithTag(9, c021j2.promotion_tag_text) + protoAdapter.encodedSizeWithTag(10, c021j2.first_screen_banner_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, c021j2.unused_coupon_count) + C601502Wf.ADAPTER.encodedSizeWithTag(12, c021j2.highlight_promotion) + C02DO.ADAPTER.asRepeated().encodedSizeWithTag(13, c021j2.discount_brief) + C5224021u.ADAPTER.encodedSizeWithTag(14, c021j2.bonus_info) + protoAdapter.encodedSizeWithTag(15, c021j2.da_info) + C5435029x.ADAPTER.encodedSizeWithTag(16, c021j2.promotion_banner) + protoAdapter2.encodedSizeWithTag(17, c021j2.promotion_tag_style) + C681002lE.ADAPTER.encodedSizeWithTag(18, c021j2.voucher_back) + protoAdapter.asRepeated().encodedSizeWithTag(19, c021j2.discount_labels) + protoAdapter2.encodedSizeWithTag(20, c021j2.discount_brief_style) + C561402Gu.ADAPTER.asRepeated().encodedSizeWithTag(21, c021j2.deal_labels) + C5294024m.ADAPTER.encodedSizeWithTag(22, c021j2.promotion_coupon_module) + C029C.ADAPTER.encodedSizeWithTag(23, c021j2.title_icon) + protoAdapter2.encodedSizeWithTag(24, c021j2.title_icon_style) + protoAdapter.encodedSizeWithTag(25, c021j2.entrance_title) + C02VR.ADAPTER.asRepeated().encodedSizeWithTag(26, c021j2.promotion_notice) + C02B1.ADAPTER.asRepeated().encodedSizeWithTag(27, c021j2.promotion_selling_point) + C02GX.ADAPTER.encodedSizeWithTag(28, c021j2.platform_discount_brief) + c021j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C021J c021j) {
        }
    };
    public C5224021u bonus_info;
    public String coupon_schema;
    public String coupon_status;
    public String da_info;
    public List<C561402Gu> deal_labels;
    public C554502Ed discount_back;
    public List<C02DO> discount_brief;
    public Integer discount_brief_style;
    public List<String> discount_labels;
    public String entrance_title;
    public String first_screen_banner_text;
    public C601502Wf highlight_promotion;
    public String order_promotion_cache_key;
    public String platform_discount;
    public C02GX platform_discount_brief;
    public C5435029x promotion_banner;
    public C5294024m promotion_coupon_module;
    public List<C02VR> promotion_notice;
    public List<C02B1> promotion_selling_point;
    public Integer promotion_tag_style;
    public String promotion_tag_text;
    public String title;
    public C029C title_icon;
    public Integer title_icon_style;
    public Integer unused_coupon_count;
    public String unused_vouchers_count;
    public C681002lE voucher_back;
    public List<AnonymousClass0248> voucher_selected_info;

    public C021J() {
        super(ADAPTER, ByteString.EMPTY);
        this.voucher_selected_info = C1516540pZE.LJIIIIZZ();
        this.discount_brief = C1516540pZE.LJIIIIZZ();
        this.discount_labels = C1516540pZE.LJIIIIZZ();
        this.deal_labels = C1516540pZE.LJIIIIZZ();
        this.promotion_notice = C1516540pZE.LJIIIIZZ();
        this.promotion_selling_point = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C584002Pm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
