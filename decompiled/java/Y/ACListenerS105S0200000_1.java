package Y;

import X.AbstractC1585810rMx;
import X.C03DR;
import X.C03F3;
import X.C03IV;
import X.C03U4;
import X.C03WH;
import X.C03YX;
import X.C048W;
import X.C10516049i;
import X.C1054104Ah;
import X.C1064604Ei;
import X.C1257480ipO;
import X.C1338430kvx;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C1744610vV5;
import X.C1748720vbi;
import X.C197039127h;
import X.C19EG;
import X.C343970De7;
import X.C736802uE;
import X.C889703dn;
import X.C890103dr;
import X.C895403ei;
import X.C895903en;
import X.C926003je;
import X.C941003m4;
import X.C942403mI;
import X.C948503nH;
import X.C955803oS;
import X.C963403pg;
import X.EnumC863903Zd;
import X.InterfaceC1065204Eo;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo.SeaPudoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMSaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCPromotionBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UserStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SeeMoreViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.InsuranceDisplay;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.InsuranceDisplayVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS105S0200000_1 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS105S0200000_1 r50, android.view.View r51) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS105S0200000_1.onClick$0(Y.ACListenerS105S0200000_1, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        JediViewModel jediViewModel = (JediViewModel) ((SeaPudoViewHolder) aCListenerS105S0200000_1.l0).LLJILJIL.getValue();
        C03F3 c03f3 = (C03F3) aCListenerS105S0200000_1.l1;
        jediViewModel.getClass();
        jediViewModel.setState(new AwS580S0100000_1(c03f3, 380));
    }

    public static final void onClick$10(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        String str;
        boolean z = !((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0).L5().isChecked();
        C890103dr c890103dr = C890103dr.LIZ;
        HashMap map = new HashMap();
        map.put("page_name", "atm_card_info");
        if (z) {
            str = "save";
        } else {
            str = "cancel";
        }
        map.put("button_type", str);
        map.put("pay_bind_status", CardStruct.IStatusCode.DEFAULT);
        C890103dr.LJFF(c890103dr, "save", map, null, null, null, null, null, 124);
        ExceptionUX exceptionUX = ((C895403ei) aCListenerS105S0200000_1.l1).LLILLJJLI;
        if (exceptionUX != null && z) {
            C03U4 c03u4 = C03U4.LIZ;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(313);
            AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(314);
            c03u4.getClass();
            C03U4.LIZ(view, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, null);
            return;
        }
        int i = C1257480ipO.LIZ.getInt("ccdc_local_retention_count", 0);
        int i2 = C895903en.LIZJ;
        if (i2 != 0 && i < i2 && !z) {
            ATMCardViewModel aTMCardViewModelR5 = ((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0).R5();
            aTMCardViewModelR5.LLIZ = new AwS580S0100000_1((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0, 543);
            aTMCardViewModelR5.setState(AFwS228S0000000_1.get$arr$(533));
        } else {
            ((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0).L5().setChecked(z);
            ((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0).I5().setChecked(z);
            ((ATMSaveNewCardViewHolder) aCListenerS105S0200000_1.l0).R5().LLILZ = z;
        }
    }

    public static final void onClick$11(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        BasicPopUp basicPopUp = ((InsuranceDisplay) aCListenerS105S0200000_1.l0).insurancePopup;
        if (basicPopUp != null) {
            InsuranceDisplayVH insuranceDisplayVH = (InsuranceDisplayVH) aCListenerS105S0200000_1.l1;
            insuranceDisplayVH.c6().LLLLJ.LJIIL(basicPopUp, null);
            C1748720vbi.LIZLLL(insuranceDisplayVH.itemView, new C10516049i(), AFwS228S0000000_1.get$arr$(583));
        }
    }

    public static final void onClick$12(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        C1748720vbi.LIZIZ((AddressListActivity) aCListenerS105S0200000_1.l0, new C048W(), AFwS228S0000000_1.get$arr$(680));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS105S0200000_1.l1, C343970De7.LIZ);
    }

    public static final void onClick$13(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        InterfaceC1065204Eo interfaceC1065204Eo = ((C1064604Ei) aCListenerS105S0200000_1.l0).LLJI;
        if (interfaceC1065204Eo != null) {
            interfaceC1065204Eo.LJLJLLL((SizeGuide) aCListenerS105S0200000_1.l1);
        }
    }

    public static final void onClick$14(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        boolean z;
        C03WH paymentLogger;
        Map<String, Long> map;
        C03WH paymentLogger2 = ((C941003m4) aCListenerS105S0200000_1.l0).getPaymentLogger();
        if (paymentLogger2 != null && (map = paymentLogger2.LJIIJ) != null && !map.containsKey(C941003m4.class.getSimpleName())) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z && (paymentLogger = ((C941003m4) aCListenerS105S0200000_1.l0).getPaymentLogger()) != null) {
            paymentLogger.LIZJ(null, "card_number");
            paymentLogger.LJJIIJ(C941003m4.class.getSimpleName());
        }
        C03WH paymentLogger3 = ((C941003m4) aCListenerS105S0200000_1.l0).getPaymentLogger();
        if (paymentLogger3 != null) {
            BindInfo bindInfo = ((PaymentMethod) aCListenerS105S0200000_1.l1).bindInfo;
            if (bindInfo != null) {
                str = bindInfo.bindStatus;
            }
            C03WH.LJIIL(paymentLogger3, "card_number_ocr", null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, 524252);
        }
        C03WH paymentLogger4 = ((C941003m4) aCListenerS105S0200000_1.l0).getPaymentLogger();
        if (paymentLogger4 != null) {
            paymentLogger4.LJJIIJ("ocr_scanning");
        }
        ((C941003m4) aCListenerS105S0200000_1.l0).getRequestOcr().invoke();
    }

    public static final void onClick$15(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        int size;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C942403mI) aCListenerS105S0200000_1.l0).getContext());
        if (c19egLIZIZ != null) {
            ElementDTO elementDTO = (ElementDTO) aCListenerS105S0200000_1.l1;
            C942403mI c942403mI = (C942403mI) aCListenerS105S0200000_1.l0;
            List<ElementDTO> list = elementDTO.subElementDTOList;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            C1744610vV5.LIZIZ(0, null, null, size, c19egLIZIZ.getSupportFragmentManager(), null, new AwS545S0100000_1(c942403mI, 1675), new AwS615S0100000_1(c942403mI, 203), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 268435023);
            c942403mI.getOnRegionPanelStatus().invoke(EnumC863903Zd.Open);
        }
    }

    public static final void onClick$16(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        boolean z = !((C926003je) aCListenerS105S0200000_1.l0).getCheckBox().isChecked();
        ExceptionUX exceptionUX = ((PaymentMethod) aCListenerS105S0200000_1.l1).exceptionUX;
        if (exceptionUX != null && z) {
            C03U4 c03u4 = C03U4.LIZ;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(469);
            AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(470);
            c03u4.getClass();
            C03U4.LIZ(view, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, null);
            return;
        }
        ((C926003je) aCListenerS105S0200000_1.l0).getCheckBox().setChecked(z);
        ((C926003je) aCListenerS105S0200000_1.l0).getOnValueChange().invoke(((C926003je) aCListenerS105S0200000_1.l0).getValue());
    }

    public static final void onClick$17(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((CCDCPromotionBannerViewHolder) aCListenerS105S0200000_1.l0).S5((C889703dn) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$18(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((CCDCPromotionBannerViewHolder) aCListenerS105S0200000_1.l0).S5((C889703dn) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$19(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        PaymentSettings paymentSettings;
        UserStatus userStatus;
        String string = ((PaymentBanner) aCListenerS105S0200000_1.l0).redirectInfo.redirectLink;
        if (string != null) {
            PaymentBannerViewHolder paymentBannerViewHolder = (PaymentBannerViewHolder) aCListenerS105S0200000_1.l1;
            Context context = paymentBannerViewHolder.LLJILJIL.getContext();
            PaymentMethodsData paymentMethodsData = ((PaymentViewModel) paymentBannerViewHolder.LLJILLL.getValue()).LLJJIJIL;
            if (paymentMethodsData != null && (paymentSettings = paymentMethodsData.settings) != null && (userStatus = paymentSettings.userStatus) != null && C736802uE.LIZ[userStatus.ordinal()] == 1) {
                string = UriProtector.parse(string).buildUpon().appendQueryParameter("return_url", "aweme://ec/generally_refresh_payment").toString();
            }
            SmartRouter.buildRoute(context, string).open();
        }
    }

    public static final void onClick$2(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((Function1) aCListenerS105S0200000_1.l0).invoke((PaymentMethod) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$20(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        PaymentViewModel paymentViewModel = (PaymentViewModel) ((SeeMoreViewHolder) aCListenerS105S0200000_1.l0).LLJILJIL.getValue();
        C03YX c03yx = (C03YX) aCListenerS105S0200000_1.l1;
        paymentViewModel.getClass();
        paymentViewModel.setState(new AwS580S0100000_1(c03yx, paymentViewModel, 154));
    }

    public static final void onClick$21(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        Function1 function1 = (Function1) aCListenerS105S0200000_1.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((C03DR) aCListenerS105S0200000_1.l1).getAbsoluteAdapterPosition()));
        }
    }

    public static final void onClick$22(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        Integer num = ((SelectionBar) aCListenerS105S0200000_1.l0).selectionType;
        if (num != null) {
            ((C963403pg) aCListenerS105S0200000_1.l1).LIZIZ.invoke(num);
        }
    }

    public static final void onClick$3(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((Function1) aCListenerS105S0200000_1.l0).invoke((PaymentMethod) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$4(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((Function1) aCListenerS105S0200000_1.l0).invoke((C197039127h) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$5(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        ((Function1) aCListenerS105S0200000_1.l0).invoke((PaymentMethod) aCListenerS105S0200000_1.l1);
    }

    public static final void onClick$6(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        C1054104Ah c1054104Ah = ((SeaPdpBodyWidget) aCListenerS105S0200000_1.l0).LJIIIZ().LLJLIL;
        if (c1054104Ah != null) {
            C1054104Ah.LJIIJJI(c1054104Ah, "to_top", null, null, null, 62);
        }
        final C1338430kvx c1338430kvx = (C1338430kvx) ((View) aCListenerS105S0200000_1.l1).findViewById(R.id.t0h);
        final AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((SeaPdpBodyWidget) aCListenerS105S0200000_1.l0, 1367);
        c1338430kvx.getClass();
        c1338430kvx.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.04CT
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    Function0<Unit> function0 = awS545S0100000_1;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    c1338430kvx.removeOnScrollListener(this);
                }
            }
        });
        c1338430kvx.smoothScrollToPosition(0);
    }

    public static final void onClick$7(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) aCListenerS105S0200000_1.l0;
        skuPanelCounterWidget.withState(skuPanelCounterWidget.LJII(), new AwS367S0200000_1((SkuPanelCounterWidget) aCListenerS105S0200000_1.l0, (TuxIconView) aCListenerS105S0200000_1.l1, 131));
        ((SkuPanelCounterWidget) aCListenerS105S0200000_1.l0).LJIIJJI();
    }

    public static final void onClick$8(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) aCListenerS105S0200000_1.l0;
        skuPanelCounterWidget.withState(skuPanelCounterWidget.LJII(), new AwS367S0200000_1((SkuPanelCounterWidget) aCListenerS105S0200000_1.l0, (TuxIconView) aCListenerS105S0200000_1.l1, 132));
        ((SkuPanelCounterWidget) aCListenerS105S0200000_1.l0).LJIIJJI();
    }

    public static final void onClick$9(ACListenerS105S0200000_1 aCListenerS105S0200000_1, View view) {
        String str;
        String str2;
        SeaUserRightViewHolderV2 seaUserRightViewHolderV2 = (SeaUserRightViewHolderV2) aCListenerS105S0200000_1.l0;
        ExposeUserRightPanel exposeUserRightPanel = ((C03IV) aCListenerS105S0200000_1.l1).LL.exposeUserRightPanel;
        if (exposeUserRightPanel != null) {
            str = exposeUserRightPanel.schema;
            str2 = exposeUserRightPanel.daInfo;
        } else {
            str = null;
            str2 = null;
        }
        seaUserRightViewHolderV2.getClass();
        if (str != null && str.length() != 0) {
            C948503nH.LJIIIIZZ(seaUserRightViewHolderV2.LLJJIJIL, new C955803oS(seaUserRightViewHolderV2, str, str2, null));
        }
    }

    public ACListenerS105S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
