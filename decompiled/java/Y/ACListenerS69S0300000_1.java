package Y;

import X.AnonymousClass0498;
import X.C03FA;
import X.C03FE;
import X.C03FG;
import X.C03GO;
import X.C03ZF;
import X.C045D;
import X.C049Y;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19EG;
import X.C2097608Jq;
import X.C2327809Ae;
import X.C714302qb;
import X.C7736030k;
import X.C786410Ut5;
import X.C903803g4;
import X.C958103op;
import X.C960203pA;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS69S0300000_1 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.03FF, android.view.View] */
    public static final void onClick$0(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        String str;
        String str2;
        String priceStr;
        Integer priceTextColor;
        SpannableStringBuilder spannableStringBuilderLIZ;
        SpannableStringBuilder spannableStringBuilderLIZ2;
        List<LogisticLinkRichText> list;
        LogisticLinkRichText logisticLinkRichText;
        LogisticLinkRichText logisticLinkRichText2;
        String priceVal;
        Set<String> set = C03FA.LIZ;
        Float fLJIIIIZZ = null;
        String currency = null;
        Map<String, String> map = ((LogisticDTO) aCListenerS69S0300000_1.l0).eventTrackInfo;
        final AttributeSet attributeSet = null;
        if (map != null) {
            str = map.get("is_next_day_delivery");
        } else {
            str = null;
        }
        C03FA.LIZLLL("next_day_delivery_info", null, null, null, null, str, null, null);
        String str3 = ((DeliveryPanelViewModel) ((ExtraLogisticsInfoViewHolder) aCListenerS69S0300000_1.l1).LLJILLL.getValue()).LLJILLL;
        Price price = ((LogisticDTO) aCListenerS69S0300000_1.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
        }
        Price price2 = ((LogisticDTO) aCListenerS69S0300000_1.l0).shippingFee;
        if (price2 != null) {
            currency = price2.getCurrency();
        }
        C03FA.LJIIIIZZ(str3, fLJIIIIZZ, currency, null, 24);
        ExtraLogisticsInfoViewHolder extraLogisticsInfoViewHolder = (ExtraLogisticsInfoViewHolder) aCListenerS69S0300000_1.l1;
        Context context = ((C03FG) aCListenerS69S0300000_1.l2).getContext();
        LogisticDTO logisticDTO = (LogisticDTO) aCListenerS69S0300000_1.l0;
        extraLogisticsInfoViewHolder.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final Context context2 = extraLogisticsInfoViewHolder.itemView.getContext();
        final int i = 0;
        ?? r8 = new ConstraintLayout(context2, attributeSet, i) { // from class: X.03FF
            public TuxTextView LL;
            public TuxTextView LLILLJJLI;
            public TuxTextView LLILLL;
            public TuxTextView LLILZ;
            public View LLILZIL;
            public TuxTextView LLILZLL;
            public TuxTextView LLIZ;

            public final TuxTextView getCommerceNextDayDeliveryExplainBodyFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLIZ;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh3);
                    this.LLIZ = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final TuxTextView getCommerceNextDayDeliveryExplainTitleFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh4);
                    this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final TuxTextView getCommerceNextDayDeliveryFooterFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZ;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh5);
                    this.LLILZ = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final View getCommerceNextDayDeliveryFooterSeparatorFromXml() {
                View view2 = this.LLILZIL;
                if (view2 != null) {
                    return view2;
                }
                View viewFindViewById = findViewById(R.id.eh6);
                this.LLILZIL = viewFindViewById;
                return viewFindViewById;
            }

            public final TuxTextView getCommerceNextDayDeliveryPriceFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh7);
                    this.LLILLL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final TuxTextView getCommerceNextDayDeliveryShippingMethodFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh9);
                    this.LL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final TuxTextView getCommerceNextDayDeliveryTimeFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.eh_);
                    this.LLILZLL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final void setCommerceNextDayDeliveryExplainBodyFromXml(TuxTextView tuxTextView) {
                this.LLIZ = tuxTextView;
            }

            public final void setCommerceNextDayDeliveryExplainTitleFromXml(TuxTextView tuxTextView) {
                this.LLILLJJLI = tuxTextView;
            }

            public final void setCommerceNextDayDeliveryFooterFromXml(TuxTextView tuxTextView) {
                this.LLILZ = tuxTextView;
            }

            public final void setCommerceNextDayDeliveryFooterSeparatorFromXml(View view2) {
                this.LLILZIL = view2;
            }

            public final void setCommerceNextDayDeliveryPriceFromXml(TuxTextView tuxTextView) {
                this.LLILLL = tuxTextView;
            }

            public final void setCommerceNextDayDeliveryShippingMethodFromXml(TuxTextView tuxTextView) {
                this.LL = tuxTextView;
            }

            public final void setCommerceNextDayDeliveryTimeFromXml(TuxTextView tuxTextView) {
                this.LLILZLL = tuxTextView;
            }

            {
                super(context2, attributeSet, i);
                C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.aoj, this, true);
            }
        };
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C903803g4.LIZ.getClass();
        c1250250idj.LIZJ = C903803g4.LIZ();
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new C03FE(jElapsedRealtime, extraLogisticsInfoViewHolder, logisticDTO));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = r8;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = (int) C958103op.LIZIZ();
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        extraLogisticsInfoViewHolder.LLJJI = tuxSheet2;
        r8.getCommerceNextDayDeliveryShippingMethodFromXml().setText(logisticDTO.deliveryName);
        TuxTextView commerceNextDayDeliveryExplainTitleFromXml = r8.getCommerceNextDayDeliveryExplainTitleFromXml();
        LogisticsDescription logisticsDescription = logisticDTO.logisticsDescription;
        if (logisticsDescription != null) {
            str2 = logisticsDescription.descriptionTitle;
        } else {
            str2 = null;
        }
        commerceNextDayDeliveryExplainTitleFromXml.setText(str2);
        TuxTextView commerceNextDayDeliveryPriceFromXml = r8.getCommerceNextDayDeliveryPriceFromXml();
        Price price3 = logisticDTO.shippingFee;
        if (price3 != null) {
            priceStr = price3.getPriceStr();
        } else {
            priceStr = null;
        }
        commerceNextDayDeliveryPriceFromXml.setText(String.valueOf(priceStr));
        Price price4 = logisticDTO.shippingFee;
        if (price4 != null) {
            priceTextColor = price4.getPriceTextColor();
        } else {
            priceTextColor = null;
        }
        commerceNextDayDeliveryPriceFromXml.setTextColorRes(C7736030k.LIZ(priceTextColor, null));
        LogisticsDescription logisticsDescription2 = logisticDTO.logisticsDescription;
        if (logisticsDescription2 != null && (logisticLinkRichText2 = logisticsDescription2.appendixTemplate) != null) {
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(389);
            richTextUtil.getClass();
            spannableStringBuilderLIZ = RichTextUtil.LIZ(logisticLinkRichText2, r8, aFwS228S0000000_1);
        } else {
            spannableStringBuilderLIZ = null;
        }
        r8.getCommerceNextDayDeliveryFooterFromXml().setText(spannableStringBuilderLIZ);
        C786410Ut5.LLLLZLL(r8.getCommerceNextDayDeliveryFooterFromXml(), 0);
        C786410Ut5.LJLLLLLL(0, r8.getCommerceNextDayDeliveryFooterSeparatorFromXml());
        LogisticsDescription logisticsDescription3 = logisticDTO.logisticsDescription;
        if (logisticsDescription3 != null && (logisticLinkRichText = logisticsDescription3.logisticsRichText) != null) {
            RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
            AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(390);
            richTextUtil2.getClass();
            spannableStringBuilderLIZ2 = RichTextUtil.LIZ(logisticLinkRichText, r8, aFwS228S0000000_12);
        } else {
            spannableStringBuilderLIZ2 = null;
        }
        r8.getCommerceNextDayDeliveryTimeFromXml().setText(spannableStringBuilderLIZ2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        LogisticsDescription logisticsDescription4 = logisticDTO.logisticsDescription;
        if (logisticsDescription4 != null && (list = logisticsDescription4.descriptions) != null) {
            for (LogisticLinkRichText logisticLinkRichText3 : list) {
                RichTextUtil richTextUtil3 = RichTextUtil.LIZ;
                AFwS228S0000000_1 aFwS228S0000000_13 = AFwS228S0000000_1.get$arr$(388);
                richTextUtil3.getClass();
                spannableStringBuilder.append((CharSequence) RichTextUtil.LIZ(logisticLinkRichText3, null, aFwS228S0000000_13));
                spannableStringBuilder.append((CharSequence) "\n\n");
            }
        }
        r8.getCommerceNextDayDeliveryExplainBodyFromXml().setText(spannableStringBuilder);
        TuxSheet tuxSheet3 = extraLogisticsInfoViewHolder.LLJJI;
        if (tuxSheet3 != null) {
            tuxSheet3.show(((C19EG) context).getSupportFragmentManager(), "next_day_delivery");
        }
    }

    public static final void onClick$1(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        Function2 function2 = (Function2) aCListenerS69S0300000_1.l0;
        if (function2 != null) {
            function2.invoke((PaymentMethod) aCListenerS69S0300000_1.l1, ((InstallmentInfo) aCListenerS69S0300000_1.l2).interestFeePromotion);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129 A[PHI: r7
      0x0129: PHI (r7v2 int) = (r7v0 int), (r7v12 int) binds: [B:37:0x00e5, B:54:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS69S0300000_1 r35, android.view.View r36) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS69S0300000_1.onClick$2(Y.ACListenerS69S0300000_1, android.view.View):void");
    }

    public static final void onClick$3(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        C1748720vbi.LIZLLL(((UsPdpTopStoreIdentityReusedAssem) aCListenerS69S0300000_1.l0).getContentView(), new AnonymousClass0498(), new AwS367S0200000_1((UsPdpTopStoreIdentityModuleVO) aCListenerS69S0300000_1.l1, (UsPdpTopStoreIdentityModuleVO) aCListenerS69S0300000_1.l2, (Map<String, ? extends Object>) 191));
        UsPdpTopStoreIdentityVM usPdpTopStoreIdentityVMFp = ((UsPdpTopStoreIdentityReusedAssem) aCListenerS69S0300000_1.l0).Fp();
        UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO = (UsPdpTopStoreIdentityModuleVO) aCListenerS69S0300000_1.l1;
        usPdpTopStoreIdentityVMFp.getClass();
        String str = usPdpTopStoreIdentityModuleVO.jumpSchema;
        String strLIZ = null;
        if (str != null && (!a0.LJJJIL(str))) {
            UsPdpTopStoreIdentityReusedAssem usPdpTopStoreIdentityReusedAssem = (UsPdpTopStoreIdentityReusedAssem) aCListenerS69S0300000_1.l0;
            UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO2 = (UsPdpTopStoreIdentityModuleVO) aCListenerS69S0300000_1.l1;
            UsPdpTopStoreIdentityVM usPdpTopStoreIdentityVMFp2 = usPdpTopStoreIdentityReusedAssem.Fp();
            Context context = usPdpTopStoreIdentityReusedAssem.LJJIJL().getContext();
            usPdpTopStoreIdentityReusedAssem.Fp().getClass();
            String str2 = usPdpTopStoreIdentityModuleVO2.btm;
            if (str2 != null && (!a0.LJJJIL(str2))) {
                strLIZ = C045D.LIZ(str2, "d0");
            }
            Map<String, ? extends Object> mapLJIIJ = C1741890vQh.LJIIJ(usPdpTopStoreIdentityModuleVO2.jumpSchemaTrackParams);
            if (mapLJIIJ == null) {
                mapLJIIJ = C2097608Jq.LJ();
            }
            usPdpTopStoreIdentityVMFp2.yQ2(context, str, strLIZ, mapLJIIJ);
        }
    }

    public static final void onClick$4(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> onInstallmentPromotionClickListener = ((C03ZF) aCListenerS69S0300000_1.l0).getOnInstallmentPromotionClickListener();
        if (onInstallmentPromotionClickListener != null) {
            onInstallmentPromotionClickListener.invoke((PaymentMethod) aCListenerS69S0300000_1.l1, (InstallmentPlan) aCListenerS69S0300000_1.l2, Boolean.TRUE);
        }
    }

    public static final void onClick$5(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        InterfaceC1631620sYq<PaymentMethod, InstallmentPlan, Boolean, Unit> onInstallmentPromotionClickListener = ((C03ZF) aCListenerS69S0300000_1.l0).getOnInstallmentPromotionClickListener();
        if (onInstallmentPromotionClickListener != null) {
            onInstallmentPromotionClickListener.invoke((PaymentMethod) aCListenerS69S0300000_1.l1, (InstallmentPlan) aCListenerS69S0300000_1.l2, Boolean.FALSE);
        }
    }

    public static final void onClick$6(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        Function2<PaymentMethod, InterestFeePromotion, Unit> onInterestingFeePromotionClickListener = ((C03ZF) aCListenerS69S0300000_1.l0).getOnInterestingFeePromotionClickListener();
        if (onInterestingFeePromotionClickListener != null) {
            onInterestingFeePromotionClickListener.invoke((PaymentMethod) aCListenerS69S0300000_1.l1, ((InstallmentPlan) aCListenerS69S0300000_1.l2).interestFeePromotion);
        }
    }

    public static final void onClick$7(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        int i;
        List<BillItem> list;
        C1748720vbi.LIZLLL((C03GO) aCListenerS69S0300000_1.l0, new C049Y(), new AwS367S0200000_1((C714302qb) aCListenerS69S0300000_1.l2, (SummaryCell) aCListenerS69S0300000_1.l1, 279));
        if (!((SummaryCell) aCListenerS69S0300000_1.l1).LLJIJIL) {
            list = ((C714302qb) aCListenerS69S0300000_1.l2).LJIIJ;
            i = R.raw.icon_chevron_up;
        } else {
            i = R.raw.icon_chevron_down;
            list = null;
        }
        ((C03GO) aCListenerS69S0300000_1.l0).LJFF(C960203pA.LIZ(R.attr.a1h, ((C03GO) aCListenerS69S0300000_1.l0).getContext()), Integer.valueOf(i));
        ((C03GO) aCListenerS69S0300000_1.l0).LIZJ(((SummaryCell) aCListenerS69S0300000_1.l1).getFragment(), list);
        ((SummaryCell) aCListenerS69S0300000_1.l1).LLJIJIL = !r1.LLJIJIL;
    }

    public static final void onClick$8(ACListenerS69S0300000_1 aCListenerS69S0300000_1, View view) {
        int i;
        List<BillItem> list;
        C1748720vbi.LIZLLL((C03GO) aCListenerS69S0300000_1.l0, new C049Y(), AFwS228S0000000_1.get$arr$(684));
        if (!((SummaryCell) aCListenerS69S0300000_1.l1).LLJIJIL) {
            list = ((C714302qb) aCListenerS69S0300000_1.l2).LJIIJ;
            i = R.raw.icon_chevron_up;
        } else {
            i = R.raw.icon_chevron_down;
            list = null;
        }
        ((C03GO) aCListenerS69S0300000_1.l0).LJFF(C960203pA.LIZ(R.attr.a1h, ((C03GO) aCListenerS69S0300000_1.l0).getContext()), Integer.valueOf(i));
        ((C03GO) aCListenerS69S0300000_1.l0).setSubItem(list);
        ((SummaryCell) aCListenerS69S0300000_1.l1).LLJIJIL = !r1.LLJIJIL;
    }

    public ACListenerS69S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ACListenerS69S0300000_1(SkuHeaderReusedAssem skuHeaderReusedAssem, LinearLayout linearLayout, DeductibleVoucherReminder deductibleVoucherReminder, PromotionExtraInfo promotionExtraInfo, int i) {
        this.$t = i;
        this.l0 = skuHeaderReusedAssem;
        this.l1 = deductibleVoucherReminder;
        this.l2 = promotionExtraInfo;
    }
}
