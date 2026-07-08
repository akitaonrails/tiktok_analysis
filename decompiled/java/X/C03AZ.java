package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoFromEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationProductInfoAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03AZ extends ConstraintLayout implements InterfaceC1164530gPT {
    public C1766800w4s LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public ViewStub LLIZ;
    public SmartImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public ConstraintLayout LLJJ;
    public TuxTextView LLJJI;
    public ViewStub LLJJIII;
    public TuxIconView LLJJIJI;
    public View LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public C799203Ag LLJJJ;
    public TuxTextView LLJJJIL;
    public C425910Gmz LLJJJJ;
    public ConstraintLayout LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C939603lq LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public LinearLayout LLJLIL;
    public ViewStub LLJLILLLLZIIL;
    public AnonymousClass0380 LLJLL;
    public C798703Ab LLJLLIL;
    public C7933037z LLJLLL;
    public ViewStub LLJZ;
    public final LinkedList<C802703Bp> LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public C425910Gmz LLLFF;
    public C812903Fn LLLFFI;
    public LinkedList<C798603Aa> LLLFZ;
    public LinkedList<AnonymousClass0382> LLLI;
    public C719102rN LLLII;
    public boolean LLLIIII;
    public TuxTextView LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;

    private final C7933037z getAuthenticViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_authentic_view);
            this.LLJLLL = (C7933037z) callbackFindViewById;
        }
        return (C7933037z) callbackFindViewById;
    }

    private final LinearLayout getComlianceLabelsLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hdx);
            this.LLJLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    private final AnonymousClass0380 getInsuranceInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_insurance_info_container);
            this.LLJLL = (AnonymousClass0380) callbackFindViewById;
        }
        return (AnonymousClass0380) callbackFindViewById;
    }

    private final ViewStub getPFandInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_main_order_sku_pfand_info);
            this.LLJZ = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    private final ViewStub getPpuPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_main_order_sku_ppu_price);
            this.LLJLILLLLZIIL = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    private final C798703Ab getVirtualInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_virtual_info);
            this.LLJLLIL = (C798703Ab) callbackFindViewById;
        }
        return (C798703Ab) callbackFindViewById;
    }

    public final C812903Fn getBioView() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_bio_view);
            this.LLLFFI = (C812903Fn) callbackFindViewById;
        }
        return (C812903Fn) callbackFindViewById;
    }

    public final C799203Ag getUsOrderSubmitAggregationGiftV2LayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_gift_v2_layout);
            this.LLJJJ = (C799203Ag) callbackFindViewById;
        }
        return (C799203Ag) callbackFindViewById;
    }

    public final C939603lq getUsOrderSubmitAggregationSkuCounterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_counter);
            this.LLJJLIIIJLLLLLLLZ = (C939603lq) callbackFindViewById;
        }
        return (C939603lq) callbackFindViewById;
    }

    public final ConstraintLayout getUsOrderSubmitAggregationSkuDetailLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_detail_layout);
            this.LLJJJJLIIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuDiscountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_discount);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getUsOrderSubmitAggregationSkuFreeGiftLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_free_gift_layout);
            this.LLJJIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final View getUsOrderSubmitAggregationSkuFreeGiftLineFromXml() {
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_free_gift_line);
        this.LLJJIJIIJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuGiftLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_gift_label);
            this.LLJJJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getUsOrderSubmitAggregationSkuImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_img);
            this.LLIZLLLIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C425910Gmz getUsOrderSubmitAggregationSkuLogosFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_logos);
            this.LLJJJJ = (C425910Gmz) callbackFindViewById;
        }
        return (C425910Gmz) callbackFindViewById;
    }

    public final View getUsOrderSubmitAggregationSkuLowStockBgFromXml() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_low_stock_bg);
        this.LLJILJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuLowStockTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_low_stock_tv);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuNumFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_num);
            this.LLJJL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_original_price);
            this.LLJL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ViewStub getUsOrderSubmitAggregationSkuPriceFlowlayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_price_flowlayout);
            this.LLIZ = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuPrimaryPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_primary_price);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getUsOrderSubmitAggregationSkuPromotionIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_promotion_icon);
            this.LLJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuPromotionTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_promotion_text);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuPromotionTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_promotion_time);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuPropsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_props);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getUsOrderSubmitAggregationSkuSnsInfoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_sns_info_container);
            this.LLJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getUsOrderSubmitAggregationSkuSnsNextIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_sns_next_iv);
            this.LLJJIJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ViewStub getUsOrderSubmitAggregationSkuSnsSubTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_sns_sub_tv);
            this.LLJJIII = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationSkuSnsTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_sns_tv);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1766800w4s getUsOrderSubmitAggregationSkuTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_title);
            this.LL = (C1766800w4s) callbackFindViewById;
        }
        return (C1766800w4s) callbackFindViewById;
    }

    public final ConstraintLayout getUsOrderSubmitAggregationSkuUserRightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_sku_user_right);
            this.LLJJJJJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getUsOrderSubmitComboSkuExpressionIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_combo_sku_expression_icon);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getUsOrderSubmitComboSkuExpressionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_combo_sku_expression_layout);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitComboSkuExpressionTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_combo_sku_expression_title);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void i0() {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_osp_promotion_event", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_virtual_info_saved", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_virtual_info_open", this);
        }
    }

    public final void h0() {
        SnsDisplayInfo snsDisplayInfo;
        ECRichText eCRichText;
        SnsDisplayInfo snsDisplayInfo2;
        ECRichText eCRichText2;
        getUsOrderSubmitAggregationSkuCounterFromXml().LJ(false);
        C812903Fn bioView = getBioView();
        if (bioView != null) {
            bioView.h0();
        }
        C21717219z0.LIZIZ(getUsOrderSubmitAggregationSkuCounterFromXml());
        ConstraintLayout usOrderSubmitAggregationSkuSnsInfoContainerFromXml = getUsOrderSubmitAggregationSkuSnsInfoContainerFromXml();
        if (usOrderSubmitAggregationSkuSnsInfoContainerFromXml != null) {
            C21717219z0.LIZIZ(usOrderSubmitAggregationSkuSnsInfoContainerFromXml);
        }
        C719102rN c719102rN = this.LLLII;
        if (c719102rN != null && (snsDisplayInfo2 = c719102rN.LLLILZJ) != null && (eCRichText2 = snsDisplayInfo2.displayInfo) != null) {
            C03C9.LIZIZ(getUsOrderSubmitAggregationSkuSnsTvFromXml(), eCRichText2, false, R.attr.a1p, "order_submit_sku_sns_info", null, false);
        }
        C719102rN c719102rN2 = this.LLLII;
        if (c719102rN2 != null && (snsDisplayInfo = c719102rN2.LLLILZJ) != null && (eCRichText = snsDisplayInfo.subDisplayInfo) != null) {
            C03C9.LIZIZ(this.LLLIIIIL, eCRichText, false, R.attr.a1p, "order_submit_sku_sns_info", null, false);
        }
        C786410Ut5.LJLLLLLL(8, getUsOrderSubmitAggregationSkuSnsNextIvFromXml());
    }

    public final LinkedList<C798603Aa> getGiftSkuScrapViews() {
        return this.LLLFZ;
    }

    public final LinkedList<AnonymousClass0382> getLabelScrapViews() {
        return this.LLLI;
    }

    public final C719102rN getSkuInfoVO() {
        return this.LLLII;
    }

    private final void setLowStockInfo(String str) {
        if (C123100dR.LIZ(str)) {
            C03DZ.LIZJ(getUsOrderSubmitAggregationSkuLowStockBgFromXml());
            C0H1U.LJIIL(getUsOrderSubmitAggregationSkuLowStockTvFromXml(), str, true);
        } else {
            C03DZ.LIZ(getUsOrderSubmitAggregationSkuLowStockBgFromXml());
            C03DZ.LIZ(getUsOrderSubmitAggregationSkuLowStockTvFromXml());
        }
    }

    private final void setPpuPrice(String str) {
        TuxTextView tuxTextView;
        if (str != null) {
            if (this.LLL == null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(getPpuPriceFromXml());
                if (viewLJLLLL instanceof TuxTextView) {
                    tuxTextView = (TuxTextView) viewLJLLLL;
                } else {
                    tuxTextView = null;
                }
                this.LLL = tuxTextView;
            }
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 != null) {
                C03DZ.LIZJ(tuxTextView2);
                tuxTextView2.setText(str);
                return;
            }
        }
        TuxTextView tuxTextView3 = this.LLL;
        if (tuxTextView3 == null) {
            return;
        }
        C03DZ.LIZ(tuxTextView3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setPromotionInfo(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L18
            com.bytedance.tux.input.TuxTextView r0 = r11.getUsOrderSubmitAggregationSkuPromotionTextFromXml()
            X.C03DZ.LIZ(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r11.getUsOrderSubmitAggregationSkuPromotionIconFromXml()
            X.C03DZ.LIZ(r0)
            com.bytedance.tux.input.TuxTextView r0 = r11.getUsOrderSubmitAggregationSkuPromotionTimeFromXml()
            X.C03DZ.LIZ(r0)
            return
        L18:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IEventCenter> r0 = com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.class
            r1 = 0
            r6 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r0 = (com.ss.android.ugc.aweme.ecommerce.service.IEventCenter) r0
            java.lang.String r1 = "ec_osp_promotion_event"
            if (r0 == 0) goto L2e
            r0.LIZJ(r1, r11)
        L2e:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IEventCenter> r5 = com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r0 = (com.ss.android.ugc.aweme.ecommerce.service.IEventCenter) r0
            if (r0 == 0) goto L40
            r0.LIZLLL(r1, r11)
        L40:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r1 = r12.icon
            if (r1 == 0) goto L78
            android.content.Context r0 = r11.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.getIconDark()
        L52:
            if (r0 == 0) goto L78
            X.03IT r1 = r0.toImageUrlModel()
            if (r1 == 0) goto L78
            X.0kdB r0 = X.C1326790kdB.LIZ
            r0.getClass()
            X.0kl3 r1 = X.C1326790kdB.LIZLLL(r1)
            com.bytedance.lighten.loader.SmartImageView r0 = r11.getUsOrderSubmitAggregationSkuPromotionIconFromXml()
            r1.LJJ(r0)
            X.C786410Ut5.h3(r1)
            com.bytedance.lighten.loader.SmartImageView r0 = r11.getUsOrderSubmitAggregationSkuPromotionIconFromXml()
            X.C03DZ.LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L7f
        L78:
            com.bytedance.lighten.loader.SmartImageView r0 = r11.getUsOrderSubmitAggregationSkuPromotionIconFromXml()
            X.C03DZ.LIZ(r0)
        L7f:
            java.lang.String r2 = r12.text
            if (r2 == 0) goto La0
            com.bytedance.tux.input.TuxTextView r1 = r11.getUsOrderSubmitAggregationSkuPromotionTextFromXml()
            r0 = 1
            X.C0H1U.LJIIL(r1, r2, r0)
        L8b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LabelCountDown r0 = r12.countDown
            if (r0 == 0) goto Lad
            java.lang.String r0 = r0.endTime
            if (r0 == 0) goto Lad
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r11.setPromotionLeftTime(r2)
            return
        La0:
            com.bytedance.tux.input.TuxTextView r0 = r11.getUsOrderSubmitAggregationSkuPromotionTextFromXml()
            X.C03DZ.LIZ(r0)
            goto L8b
        La8:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.getIcon()
            goto L52
        Lad:
            com.bytedance.tux.input.TuxTextView r0 = r11.getUsOrderSubmitAggregationSkuPromotionTimeFromXml()
            X.C03DZ.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03AZ.setPromotionInfo(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint):void");
    }

    private final void setPromotionLeftTime(long j) {
        if (j <= 0) {
            C03DZ.LIZ(getUsOrderSubmitAggregationSkuPromotionTimeFromXml());
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = 60;
        C0H1U.LJIIL(getUsOrderSubmitAggregationSkuPromotionTimeFromXml(), C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % j2), Long.valueOf(timeUnit.toSeconds(j) % j2)}, 3)), true);
    }

    private final void setSkuImage(Image image) {
        C03IT thumbFirstImageUrlModel;
        if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("product_image_tag");
            c1331670kl3LIZLLL.LJJ(getUsOrderSubmitAggregationSkuImgFromXml());
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
    }

    private final void setSmallLabel(String str) {
        C0H1U.LJIIL(getUsOrderSubmitAggregationSkuGiftLabelFromXml(), str, true);
    }

    private final void setpFandInfo(String str) {
        TuxTextView tuxTextView;
        if (str != null) {
            if (this.LLLF == null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(getPFandInfoFromXml());
                if (viewLJLLLL instanceof TuxTextView) {
                    tuxTextView = (TuxTextView) viewLJLLLL;
                } else {
                    tuxTextView = null;
                }
                this.LLLF = tuxTextView;
            }
            TuxTextView tuxTextView2 = this.LLLF;
            if (tuxTextView2 != null) {
                C03DZ.LIZJ(tuxTextView2);
                tuxTextView2.setText(str);
                return;
            }
        }
        TuxTextView tuxTextView3 = this.LLLF;
        if (tuxTextView3 == null) {
            return;
        }
        C03DZ.LIZ(tuxTextView3);
    }

    public final void setBioView(C812903Fn c812903Fn) {
        this.LLLFFI = c812903Fn;
    }

    public final void setExpressCounter(C719102rN c719102rN) {
        String strLIZIZ;
        C939603lq usOrderSubmitAggregationSkuCounterFromXml = getUsOrderSubmitAggregationSkuCounterFromXml();
        int visibility = usOrderSubmitAggregationSkuCounterFromXml.getVisibility();
        usOrderSubmitAggregationSkuCounterFromXml.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, usOrderSubmitAggregationSkuCounterFromXml);
        TuxTextView usOrderSubmitAggregationSkuNumFromXml = getUsOrderSubmitAggregationSkuNumFromXml();
        C786410Ut5.LJLLLLLL(0, usOrderSubmitAggregationSkuNumFromXml);
        if (C426750GoL.LIZLLL(usOrderSubmitAggregationSkuNumFromXml.getContext())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c719102rN.LLIZ);
            sbLIZ.append(" x");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("x ");
            sbLIZ2.append(c719102rN.LLIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        usOrderSubmitAggregationSkuNumFromXml.setText(strLIZIZ);
        if (getUsOrderSubmitAggregationSkuLogosFromXml().getVisibility() == 0) {
            C03DZ.LIZJ(getUsOrderSubmitAggregationSkuUserRightFromXml());
        }
    }

    public final void setGiftSkuScrapViews(LinkedList<C798603Aa> linkedList) {
        this.LLLFZ = linkedList;
    }

    public final void setLabelScrapViews(LinkedList<AnonymousClass0382> linkedList) {
        this.LLLI = linkedList;
    }

    public final void setSkuInfoVO(C719102rN c719102rN) {
        this.LLLII = c719102rN;
    }

    public final void setUsOrderSubmitAggregationGiftV2LayoutFromXml(C799203Ag c799203Ag) {
        this.LLJJJ = c799203Ag;
    }

    public final void setUsOrderSubmitAggregationSkuCounterFromXml(C939603lq c939603lq) {
        this.LLJJLIIIJLLLLLLLZ = c939603lq;
    }

    public final void setUsOrderSubmitAggregationSkuDetailLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJJLIIL = constraintLayout;
    }

    public final void setUsOrderSubmitAggregationSkuDiscountFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuFreeGiftLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJIJIL = linearLayout;
    }

    public final void setUsOrderSubmitAggregationSkuFreeGiftLineFromXml(View view) {
        this.LLJJIJIIJIL = view;
    }

    public final void setUsOrderSubmitAggregationSkuGiftLabelFromXml(TuxTextView tuxTextView) {
        this.LLJJJIL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuImgFromXml(SmartImageView smartImageView) {
        this.LLIZLLLIL = smartImageView;
    }

    public final void setUsOrderSubmitAggregationSkuLogosFromXml(C425910Gmz c425910Gmz) {
        this.LLJJJJ = c425910Gmz;
    }

    public final void setUsOrderSubmitAggregationSkuLowStockBgFromXml(View view) {
        this.LLJILJIL = view;
    }

    public final void setUsOrderSubmitAggregationSkuLowStockTvFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuNumFromXml(TuxTextView tuxTextView) {
        this.LLJJL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLJL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuPriceFlowlayoutFromXml(ViewStub viewStub) {
        this.LLIZ = viewStub;
    }

    public final void setUsOrderSubmitAggregationSkuPrimaryPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuPromotionIconFromXml(SmartImageView smartImageView) {
        this.LLJI = smartImageView;
    }

    public final void setUsOrderSubmitAggregationSkuPromotionTextFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuPromotionTimeFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuPropsFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuSnsInfoContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    public final void setUsOrderSubmitAggregationSkuSnsNextIvFromXml(TuxIconView tuxIconView) {
        this.LLJJIJI = tuxIconView;
    }

    public final void setUsOrderSubmitAggregationSkuSnsSubTvFromXml(ViewStub viewStub) {
        this.LLJJIII = viewStub;
    }

    public final void setUsOrderSubmitAggregationSkuSnsTvFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationSkuTitleFromXml(C1766800w4s c1766800w4s) {
        this.LL = c1766800w4s;
    }

    public final void setUsOrderSubmitAggregationSkuUserRightFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJJJIL = constraintLayout;
    }

    public final void setUsOrderSubmitComboSkuExpressionIconFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setUsOrderSubmitComboSkuExpressionLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setUsOrderSubmitComboSkuExpressionTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C03AZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C799103Af c799103Af;
        String str3;
        C798703Ab virtualInfoFromXml;
        Type type;
        VirtualInfoFromEvent virtualInfoFromEvent;
        String str4;
        String str5;
        UserVirtualInfo userVirtualInfo;
        VirtualInfoModule virtualInfoModule;
        C828603Lo c828603Lo;
        String str6;
        String str7;
        SkuCardExtendInfo skuCardExtendInfo;
        VirtualInfoModule virtualInfoModule2;
        String str8;
        C03JV state;
        List<InterfaceC1891350zJl> list;
        InterfaceC1891350zJl next;
        C719102rN c719102rN;
        SkuCardExtendInfo skuCardExtendInfo2;
        VirtualInfoModule virtualInfoModule3;
        String str9;
        SkuCardExtendInfo skuCardExtendInfo3;
        VirtualInfoModule virtualInfoModule4;
        VirtualInfoModule virtualInfoModule5;
        String str10;
        Type type2;
        C719102rN c719102rN2;
        String str11;
        int iHashCode = str.hashCode();
        String str12 = null;
        virtualInfoModule = null;
        VirtualInfoModule virtualInfoModule6 = null;
        if (iHashCode != -1702196826) {
            if (iHashCode != -1225230677) {
                if (iHashCode == 1962809258 && str.equals("ec_osp_promotion_event") && (c719102rN2 = this.LLLII) != null && (str11 = c719102rN2.LLILZLL) != null) {
                    C799403Ai.LIZ.getClass();
                    Long lLIZJ = C799403Ai.LIZJ(str11);
                    if (lLIZJ != null) {
                        setPromotionLeftTime(lLIZJ.longValue());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("ec_virtual_info_saved")) {
                return;
            }
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(VirtualInfoFromEvent.class));
                } else {
                    type2 = new TypeToken<VirtualInfoFromEvent>() { // from class: X.03Ad
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type2);
                if (!(objFromJson instanceof VirtualInfoFromEvent)) {
                    objFromJson = null;
                }
                virtualInfoFromEvent = (VirtualInfoFromEvent) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                virtualInfoFromEvent = null;
            }
            C719102rN c719102rN3 = this.LLLII;
            if (c719102rN3 != null) {
                str4 = c719102rN3.LLILZLL;
            } else {
                str4 = null;
            }
            if (virtualInfoFromEvent != null) {
                str5 = virtualInfoFromEvent.skuId;
            } else {
                str5 = null;
            }
            if (!Intrinsics.LJFF(str4, str5)) {
                return;
            }
            C719102rN c719102rN4 = this.LLLII;
            if (c719102rN4 != null) {
                SkuCardExtendInfo skuCardExtendInfo4 = c719102rN4.LLLILZLLLI;
                if (skuCardExtendInfo4 != null) {
                    if (virtualInfoFromEvent != null && (virtualInfoModule5 = virtualInfoFromEvent.virtualInfoModule) != null) {
                        VirtualInfoModule virtualInfoModule7 = skuCardExtendInfo4.virtualInfo;
                        if (virtualInfoModule7 != null) {
                            str10 = virtualInfoModule7.schema;
                        } else {
                            str10 = null;
                        }
                        virtualInfoModule4 = new VirtualInfoModule(virtualInfoModule5.header, virtualInfoModule5.content, str10, virtualInfoFromEvent.virtualInfo);
                    } else {
                        virtualInfoModule4 = null;
                    }
                    skuCardExtendInfo3 = new SkuCardExtendInfo(skuCardExtendInfo4.vasBadge, virtualInfoModule4, skuCardExtendInfo4.membershipInfo);
                } else {
                    skuCardExtendInfo3 = null;
                }
                c719102rN4.LLLILZLLLI = skuCardExtendInfo3;
            }
            C798703Ab virtualInfoFromXml2 = getVirtualInfoFromXml();
            if (virtualInfoFromXml2 == null) {
                return;
            }
            if (virtualInfoFromEvent != null) {
                userVirtualInfo = virtualInfoFromEvent.virtualInfo;
                virtualInfoModule = virtualInfoFromEvent.virtualInfoModule;
            } else {
                userVirtualInfo = null;
                virtualInfoModule = null;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = virtualInfoFromXml2.LLILLJJLI;
            if (orderSubmitAssemViewModel != null && (state = orderSubmitAssemViewModel.getState()) != null && (list = state.LLILLJJLI) != null) {
                Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof C719102rN) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC1891350zJl interfaceC1891350zJl = next;
                if (interfaceC1891350zJl != null && (interfaceC1891350zJl instanceof C719102rN) && (c719102rN = (C719102rN) interfaceC1891350zJl) != null) {
                    SkuCardExtendInfo skuCardExtendInfo5 = ((C719102rN) interfaceC1891350zJl).LLLILZLLLI;
                    if (skuCardExtendInfo5 != null) {
                        if (virtualInfoModule != null) {
                            VirtualInfoModule virtualInfoModule8 = skuCardExtendInfo5.virtualInfo;
                            if (virtualInfoModule8 != null) {
                                str9 = virtualInfoModule8.schema;
                            } else {
                                str9 = null;
                            }
                            virtualInfoModule3 = new VirtualInfoModule(virtualInfoModule.header, virtualInfoModule.content, str9, userVirtualInfo);
                        } else {
                            virtualInfoModule3 = null;
                        }
                        skuCardExtendInfo2 = new SkuCardExtendInfo(skuCardExtendInfo5.vasBadge, virtualInfoModule3, skuCardExtendInfo5.membershipInfo);
                    } else {
                        skuCardExtendInfo2 = null;
                    }
                    c719102rN.LLLILZLLLI = skuCardExtendInfo2;
                }
            }
            C719102rN c719102rN5 = virtualInfoFromXml2.LLILZ;
            if (c719102rN5 != null) {
                SkuCardExtendInfo skuCardExtendInfo6 = c719102rN5.LLLILZLLLI;
                if (skuCardExtendInfo6 != null) {
                    if (virtualInfoModule != null) {
                        VirtualInfoModule virtualInfoModule9 = skuCardExtendInfo6.virtualInfo;
                        if (virtualInfoModule9 != null) {
                            str8 = virtualInfoModule9.schema;
                        } else {
                            str8 = null;
                        }
                        virtualInfoModule2 = new VirtualInfoModule(virtualInfoModule.header, virtualInfoModule.content, str8, userVirtualInfo);
                    } else {
                        virtualInfoModule2 = null;
                    }
                    skuCardExtendInfo = new SkuCardExtendInfo(skuCardExtendInfo6.vasBadge, virtualInfoModule2, skuCardExtendInfo6.membershipInfo);
                } else {
                    skuCardExtendInfo = null;
                }
                c719102rN5.LLLILZLLLI = skuCardExtendInfo;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = virtualInfoFromXml2.LLILLJJLI;
            if (orderSubmitAssemViewModel2 != null) {
                C719102rN c719102rN6 = virtualInfoFromXml2.LLILZ;
                if (c719102rN6 != null) {
                    str7 = c719102rN6.LLILZLL;
                    SkuCardExtendInfo skuCardExtendInfo7 = c719102rN6.LLLILZLLLI;
                    if (skuCardExtendInfo7 != null) {
                        virtualInfoModule6 = skuCardExtendInfo7.virtualInfo;
                    }
                } else {
                    str7 = null;
                }
                orderSubmitAssemViewModel2.OQ2(virtualInfoModule6, str7);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = virtualInfoFromXml2.LLILLJJLI;
            if (orderSubmitAssemViewModel3 != null && (c828603Lo = orderSubmitAssemViewModel3.h) != null && (str6 = virtualInfoFromXml2.LLILLL) != null && userVirtualInfo != null) {
                c828603Lo.LIZ.put(str6, userVirtualInfo);
            }
            virtualInfoFromXml2.e0(userVirtualInfo, virtualInfoModule);
            return;
        }
        if (!str.equals("ec_virtual_info_open")) {
            return;
        }
        try {
            Gson gsonLJFF2 = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(C799103Af.class));
            } else {
                type = new TypeToken<C799103Af>() { // from class: X.03Ae
                }.getType();
            }
            Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type);
            if (!(objFromJson2 instanceof C799103Af)) {
                objFromJson2 = null;
            }
            c799103Af = (C799103Af) objFromJson2;
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
            c799103Af = null;
        }
        C719102rN c719102rN7 = this.LLLII;
        if (c719102rN7 != null) {
            str3 = c719102rN7.LLILZLL;
        } else {
            str3 = null;
        }
        if (c799103Af != null) {
            str12 = c799103Af.LIZ;
        }
        if (!Intrinsics.LJFF(str3, str12) || (virtualInfoFromXml = getVirtualInfoFromXml()) == null) {
            return;
        }
        HandlerHook.viewPost(virtualInfoFromXml.getContainer(), new ARunnableS101S0100000_1((Object) virtualInfoFromXml, 50));
    }

    public C03AZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJZIJLIL = new LinkedList<>();
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b25, this, true);
        this.LLLFZ = new LinkedList<>();
        this.LLLI = new LinkedList<>();
    }

    public final void j0(C719102rN c719102rN, MainOrderSetting mainOrderSetting, List<? extends Map<String, ? extends Object>> list, C801803Bg c801803Bg, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Boolean bool, Fragment fragment, boolean z) {
        boolean z2;
        boolean z3;
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment;
        C03EQ c03eq;
        Integer num;
        TuxTextView tuxTextView;
        int i;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        int i2;
        TuxTextView tuxTextView4;
        String strLIZIZ;
        QuantityControlInfo quantityControlInfo;
        Integer num2;
        if (mainOrderSetting != null && (num2 = mainOrderSetting.changeProductCount) != null && num2.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z2 || ((quantityControlInfo = c719102rN.LLLF) != null && Intrinsics.LJFF(quantityControlInfo.quantityEditable, Boolean.TRUE))) && !c719102rN.LIZLLL()) {
            C786410Ut5.LJLLLLLL(8, getUsOrderSubmitAggregationSkuNumFromXml());
            C939603lq usOrderSubmitAggregationSkuCounterFromXml = getUsOrderSubmitAggregationSkuCounterFromXml();
            HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
            if (!this.LLLIIII) {
                this.LLLIIII = true;
                C1748720vbi.LIZLLL(usOrderSubmitAggregationSkuCounterFromXml, new C049X(), new AwS367S0200000_1(c719102rN, (C719102rN) mapHi1, (HashMap<String, Object>) 71));
                C1748720vbi.LIZLLL(usOrderSubmitAggregationSkuCounterFromXml, new C049X(), new AwS367S0200000_1(c719102rN, (C719102rN) mapHi1, (HashMap<String, Object>) 72));
            }
            C786410Ut5.LJLLLLLL(0, usOrderSubmitAggregationSkuCounterFromXml);
            usOrderSubmitAggregationSkuCounterFromXml.setCounterStyle(true);
            String str = c719102rN.LLILZLL;
            if (str == null) {
                str = "";
            }
            usOrderSubmitAggregationSkuCounterFromXml.setSkuId(str);
            usOrderSubmitAggregationSkuCounterFromXml.setExtraInfo(mapHi1);
            Map<String, ? extends Object> map = (Map) ListProtector.get(list, 0);
            Map<String, ? extends Object> map2 = (Map) ListProtector.get(list, 1);
            usOrderSubmitAggregationSkuCounterFromXml.LLJ = map;
            usOrderSubmitAggregationSkuCounterFromXml.LLJI = map2;
            usOrderSubmitAggregationSkuCounterFromXml.LLJIJIL = null;
            if (z) {
                usOrderSubmitAggregationSkuCounterFromXml.LLJJJ = true;
            }
            usOrderSubmitAggregationSkuCounterFromXml.setQuantityLimit(c719102rN.LLJILJIL);
            usOrderSubmitAggregationSkuCounterFromXml.setQuantity(c719102rN.LLIZ);
            usOrderSubmitAggregationSkuCounterFromXml.setSku(c719102rN);
            SkuCardStyleInfo skuCardStyleInfo = c719102rN.LLJJJIL;
            if (skuCardStyleInfo != null && (num = skuCardStyleInfo.skuCardStyleType) != null && num.intValue() == 2) {
                usOrderSubmitAggregationSkuCounterFromXml.LIZJ(true);
            }
            usOrderSubmitAggregationSkuCounterFromXml.setQuantityChangeListener(new AwS437S0200000_1(orderSubmitAssemViewModel, c719102rN, 12));
            TuxTextView tuxTextView5 = (TuxTextView) usOrderSubmitAggregationSkuCounterFromXml.getRootView().findViewById(R.id.us_order_submit_aggregation_sku_notice_text);
            c801803Bg.LIZ(tuxTextView5, c719102rN, c719102rN.LIZLLL(), null, null);
            if (tuxTextView5 != null && tuxTextView5.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            usOrderSubmitAggregationSkuCounterFromXml.setCounterBg(z3);
            usOrderSubmitAggregationSkuCounterFromXml.setClickListener(new AwS367S0200000_1(orderSubmitAssemViewModel, fragment, 73));
            if ((fragment instanceof USAggregationProductInfoAssemFragment) && (uSAggregationProductInfoAssemFragment = (USAggregationProductInfoAssemFragment) fragment) != null) {
                AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(usOrderSubmitAggregationSkuCounterFromXml, 106);
                View viewFindViewById = uSAggregationProductInfoAssemFragment.LLILZ;
                if (viewFindViewById == null) {
                    View view = uSAggregationProductInfoAssemFragment.getView();
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.pub);
                    } else {
                        viewFindViewById = null;
                    }
                    uSAggregationProductInfoAssemFragment.LLILZ = (C1318510kPp) viewFindViewById;
                }
                C03BH dispatchTouchInterceptor = ((C1318510kPp) viewFindViewById).getDispatchTouchInterceptor();
                if ((dispatchTouchInterceptor instanceof C03EQ) && (c03eq = (C03EQ) dispatchTouchInterceptor) != null) {
                    c03eq.LIZ = awS580S0100000_1;
                }
            }
            if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                usOrderSubmitAggregationSkuCounterFromXml.LJ(false);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, getUsOrderSubmitAggregationSkuCounterFromXml());
            TuxTextView usOrderSubmitAggregationSkuNumFromXml = getUsOrderSubmitAggregationSkuNumFromXml();
            C786410Ut5.LJLLLLLL(0, usOrderSubmitAggregationSkuNumFromXml);
            if (C426750GoL.LIZLLL(usOrderSubmitAggregationSkuNumFromXml.getContext())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c719102rN.LLIZ);
                sbLIZ.append(" x");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("x ");
                sbLIZ2.append(c719102rN.LLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            usOrderSubmitAggregationSkuNumFromXml.setText(strLIZIZ);
        }
        if (getUsOrderSubmitAggregationSkuGiftLabelFromXml().getVisibility() != 0 && getUsOrderSubmitAggregationSkuLogosFromXml().getVisibility() != 0) {
            C03DZ.LIZ(getUsOrderSubmitAggregationSkuUserRightFromXml());
        } else {
            C03DZ.LIZJ(getUsOrderSubmitAggregationSkuUserRightFromXml());
        }
        if (getUsOrderSubmitAggregationSkuNumFromXml().getVisibility() == 0) {
            ConstraintLayout usOrderSubmitAggregationSkuDetailLayoutFromXml = getUsOrderSubmitAggregationSkuDetailLayoutFromXml();
            TuxTextView tuxTextView6 = this.LLL;
            if (tuxTextView6 != null && tuxTextView6.getVisibility() == 0 && (tuxTextView4 = this.LLLF) != null && tuxTextView4.getVisibility() == 0) {
                i2 = 51;
            } else {
                TuxTextView tuxTextView7 = this.LLL;
                if ((tuxTextView7 != null && tuxTextView7.getVisibility() == 0) || ((tuxTextView3 = this.LLLF) != null && tuxTextView3.getVisibility() == 0)) {
                    i2 = 68;
                } else {
                    i2 = 85;
                }
            }
            usOrderSubmitAggregationSkuDetailLayoutFromXml.setMinHeight(C0H9H.LIZIZ(i2));
            return;
        }
        ConstraintLayout usOrderSubmitAggregationSkuDetailLayoutFromXml2 = getUsOrderSubmitAggregationSkuDetailLayoutFromXml();
        TuxTextView tuxTextView8 = this.LLL;
        if (tuxTextView8 != null && tuxTextView8.getVisibility() == 0 && (tuxTextView2 = this.LLLF) != null && tuxTextView2.getVisibility() == 0) {
            i = 19;
        } else {
            TuxTextView tuxTextView9 = this.LLL;
            if ((tuxTextView9 != null && tuxTextView9.getVisibility() == 0) || ((tuxTextView = this.LLLF) != null && tuxTextView.getVisibility() == 0)) {
                i = 36;
            } else {
                i = 53;
            }
        }
        usOrderSubmitAggregationSkuDetailLayoutFromXml2.setMinHeight(C0H9H.LIZIZ(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0ab5  */
    /* JADX WARN: Type inference failed for: r28v1, types: [X.037V] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e0(final X.C03AZ r35, final X.C719102rN r36, final androidx.fragment.app.Fragment r37, java.lang.String r38, X.C817603Hi r39, kotlin.jvm.functions.Function1 r40, int r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.util.HashMap r45, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r46, boolean r47, boolean r48, int r49) {
        /*
            Method dump skipped, instruction units count: 2829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03AZ.e0(X.03AZ, X.02rN, androidx.fragment.app.Fragment, java.lang.String, X.03Hi, kotlin.jvm.functions.Function1, int, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, boolean, boolean, int):void");
    }
}
