package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.022C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022C extends Message<C022C, C581102Oj> {
    public static final ProtoAdapter<C022C> ADAPTER = new ProtoAdapter<C022C>() { // from class: X.021T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022C decode(ProtoReader protoReader) {
            C022C c022c = new C022C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022c.installment_plans.add(AnonymousClass0215.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c022c.available_credit = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c022c.disclaimer = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c022c.order_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c022c.display_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c022c.bank_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c022c.bank_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c022c.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022c.icon_url_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022c.installment_fold_num = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022c.interest_fee_promotion_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022c.interest_fee_promotion = C547702Bn.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022c.promotion_info = AnonymousClass0220.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c022c.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c022c.has_financing = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c022c.downpayment_changed_info = C647502fp.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022c.installment_disclaimer = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022c.prequalified_installment_plan_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c022c.bnpl_data = C594402Tm.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c022c.no_preselect_tenure = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022C c022c) {
            C022C c022c2 = c022c;
            int iEncodedSizeWithTag = AnonymousClass0215.ADAPTER.asRepeated().encodedSizeWithTag(1, c022c2.installment_plans);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c022c2.available_credit) + protoAdapter.encodedSizeWithTag(3, c022c2.disclaimer) + C614702aX.ADAPTER.encodedSizeWithTag(4, c022c2.order_amount) + protoAdapter.encodedSizeWithTag(5, c022c2.display_name) + protoAdapter.encodedSizeWithTag(6, c022c2.bank_name) + protoAdapter.encodedSizeWithTag(7, c022c2.bank_code) + protoAdapter.encodedSizeWithTag(8, c022c2.icon_url) + protoAdapter.encodedSizeWithTag(9, c022c2.icon_url_dark) + ProtoAdapter.INT32.encodedSizeWithTag(10, c022c2.installment_fold_num) + protoAdapter.encodedSizeWithTag(11, c022c2.interest_fee_promotion_desc) + C547702Bn.ADAPTER.encodedSizeWithTag(12, c022c2.interest_fee_promotion) + AnonymousClass0220.ADAPTER.encodedSizeWithTag(13, c022c2.promotion_info) + protoAdapter.encodedSizeWithTag(14, c022c2.da_info);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(15, c022c2.has_financing) + C647502fp.ADAPTER.encodedSizeWithTag(16, c022c2.downpayment_changed_info) + protoAdapter.encodedSizeWithTag(17, c022c2.installment_disclaimer) + protoAdapter.encodedSizeWithTag(18, c022c2.prequalified_installment_plan_id) + C594402Tm.ADAPTER.encodedSizeWithTag(19, c022c2.bnpl_data) + protoAdapter2.encodedSizeWithTag(20, c022c2.no_preselect_tenure) + c022c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022C c022c) {
        }
    };
    public String available_credit;
    public String bank_code;
    public String bank_name;
    public C594402Tm bnpl_data;
    public String da_info;
    public String disclaimer;
    public String display_name;
    public C647502fp downpayment_changed_info;
    public Boolean has_financing;
    public String icon_url;
    public String icon_url_dark;
    public String installment_disclaimer;
    public Integer installment_fold_num;
    public List<AnonymousClass0215> installment_plans;
    public C547702Bn interest_fee_promotion;
    public String interest_fee_promotion_desc;
    public Boolean no_preselect_tenure;
    public C614702aX order_amount;
    public String prequalified_installment_plan_id;
    public AnonymousClass0220 promotion_info;

    public C022C() {
        super(ADAPTER, ByteString.EMPTY);
        this.installment_plans = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C581102Oj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
