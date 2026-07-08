package Y;

import X.AbstractC1842530y31;
import X.C098200Yq;
import X.C0WZX;
import X.C1034990d2X;
import X.C1054004Ag;
import X.C1295960jpS;
import X.C1323820kYO;
import X.C13LZ;
import X.C1440005kM;
import X.C1697810uHb;
import X.C1704130uRn;
import X.C1713160ugM;
import X.C1716310ulR;
import X.C1717490unL;
import X.C1719160uq2;
import X.C1721300utU;
import X.C1721420utg;
import X.C1723940uxk;
import X.C1724240uyE;
import X.C1758210vr1;
import X.C1762020vxA;
import X.C1762400vxm;
import X.C189200o6;
import X.C1909107dp;
import X.C1948507kB;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C497740JfY;
import X.C672920QaQ;
import X.C712350Rwv;
import X.C786410Ut5;
import X.EnumC1059790dgX;
import X.InterfaceC1063920dnC;
import X.InterfaceC1704110uRl;
import X.InterfaceC1716260ulM;
import X.InterfaceC1723820uxY;
import X.InterfaceC1723830uxZ;
import X.InterfaceC1724300uyK;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.LottieDO;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncFragment;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS59S0300000_26 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Map<String, Object> mapLJ;
        String str;
        String str2;
        PdpViewModel pdpViewModel = (PdpViewModel) this.l0;
        C19EG c19eg = (C19EG) this.l1;
        ((PdpBodyAssem) this.l2).kp();
        pdpViewModel.cS2(c19eg);
        PdpViewModel pdpViewModel2 = (PdpViewModel) this.l0;
        C1054004Ag c1054004Ag = pdpViewModel2.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            c1054004Ag.LJJIZ(pdpViewModel2, pdpViewModel2.LLLIIII, false);
        }
        PdpViewModel pdpViewModel3 = (PdpViewModel) this.l0;
        C1054004Ag c1054004Ag2 = pdpViewModel3.LLJLILLLLZIIL;
        if (c1054004Ag2 != null) {
            c1054004Ag2.LJJIL(pdpViewModel3);
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) this.l0).LLJI;
        if (pdpEnterParam == null || (mapLJ = pdpEnterParam.trackParams) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashMap map = new HashMap(mapLJ);
        PdpViewModel pdpViewModel4 = (PdpViewModel) this.l0;
        ProductPackStruct productPackStruct = pdpViewModel4.LLJILLL;
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        boolean z = pdpViewModel4.LLJIJIL;
        IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpViewModel4.LLJI;
        String str3 = null;
        if (pdpEnterParam2 != null) {
            str2 = pdpEnterParam2.awemeId;
            str3 = pdpEnterParam2.clickFrom;
        } else {
            str2 = null;
        }
        C1440005kM.LIZ(C1034990d2X.LIZ(str, str2, str3, z));
        C672920QaQ.LIZ("pdp real", map);
    }

    public final void LIZ$2() throws Throwable {
        if (((C19EG) this.l0).isFinishing()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("KEY_PIN_CONFIRM_RESULT", (C1719160uq2) this.l1);
        C2204961BRm.LLJJIJIL(102, intent, (C19EG) this.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/B0jdsW6Xyl5+4GyywsM4ylUXCw/6SHxhI2j4Kaia2ZaLBf3A4jZBZ", null));
        ((C19EG) this.l0).finish();
        if (Intrinsics.LJFF(((PinConfirmViewAssem) this.l2).No().LLILZ, "flow_template_tiktok_pay_register") || Intrinsics.LJFF(((PinConfirmViewAssem) this.l2).No().LLILZ, "flow_template_tiktok_pay_register_and_kyc")) {
            C786410Ut5.ce((C19EG) this.l0, 0, 0);
        }
    }

    public final void LIZ$3() {
        ViewGroup.LayoutParams layoutParams;
        if (((View) this.l0).getParent() == null || ((View) this.l0).getWidth() <= 0) {
            return;
        }
        int width = ((View) this.l0).getWidth();
        C1721300utU c1721300utU = C1721300utU.LIZ;
        String width2 = ((LottieDO) this.l1).getWidth();
        Context context = ((View) this.l0).getContext();
        c1721300utU.getClass();
        if (width < C1721300utU.LJJIII(context, width2)) {
            C1295960jpS c1295960jpS = ((C1721420utg) this.l2).LLILZ;
            if (c1295960jpS != null) {
                layoutParams = c1295960jpS.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = ((View) this.l0).getWidth();
                    layoutParams.height = (int) (C1721300utU.LJIILLIIL(((View) this.l0).getContext(), ((LottieDO) this.l1).getHeight()) * (((View) this.l0).getWidth() / C1721300utU.LJJIII(((View) this.l0).getContext(), ((LottieDO) this.l1).getWidth())));
                }
            } else {
                layoutParams = null;
            }
            C1295960jpS c1295960jpS2 = ((C1721420utg) this.l2).LLILZ;
            if (c1295960jpS2 != null) {
                C786410Ut5.s6(c1295960jpS2, layoutParams);
            }
        }
    }

    public final void LIZ$4() {
        View view;
        Object parent = ((AppCompatImageView) this.l0).getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        ImageDO imageDO = (ImageDO) this.l1;
        View view2 = (View) this.l2;
        if (view.getWidth() > 0) {
            int width = view.getWidth();
            C1721300utU c1721300utU = C1721300utU.LIZ;
            String width2 = imageDO.getWidth();
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2;
            Context context = appCompatImageView.getContext();
            c1721300utU.getClass();
            if (width < C1721300utU.LJJIII(context, width2)) {
                ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = view.getWidth();
                    layoutParams.height = (int) (C1721300utU.LJIILLIIL(appCompatImageView.getContext(), imageDO.getHeight()) * (view.getWidth() / C1721300utU.LJJIII(appCompatImageView.getContext(), imageDO.getWidth())));
                }
                C786410Ut5.h6(appCompatImageView, layoutParams);
            }
        }
    }

    public final void LIZ$5() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("number_fetch_flag", "mismatch");
        String strInvoke = ((C1717490unL) this.l0).LJII.invoke();
        if (C1948507kB.LIZ(strInvoke)) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(new LinkedHashMap(C1716310ulR.LIZ(strInvoke)));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) this.l1, "//pipo/wallet/openca_sync");
        smartRouteBuildRoute.withParam("step_name", "OPEN_CA_ACCOUNT_NEED_SYNC");
        smartRouteBuildRoute.withParam(Scene.SCENE_SERVICE, ((C1717490unL) this.l0).LJFF);
        smartRouteBuildRoute.withParam("need_get_user_placement", ((C1717490unL) this.l0).LJI);
        smartRouteBuildRoute.withAnimation(0, 0);
        final C1717490unL c1717490unL = (C1717490unL) this.l0;
        final InterfaceC1716260ulM interfaceC1716260ulM = (InterfaceC1716260ulM) this.l2;
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0unM
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str, String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                String str = OpenCANeedSyncFragment._pnsPageId;
                String str2 = c1717490unL.LJFF;
                final InterfaceC1716260ulM interfaceC1716260ulM2 = interfaceC1716260ulM;
                OpenCANeedSyncFragment.LLJIJIL.put(str2, new InterfaceC1221990hu9() { // from class: X.0unN
                    @Override // X.InterfaceC1221990hu9
                    public final void onSuccess() {
                    }

                    @Override // X.InterfaceC1221990hu9
                    public final void onCancel() {
                        interfaceC1716260ulM2.LIZ(null);
                    }

                    @Override // X.InterfaceC1221990hu9
                    public final void onSuccess(String str3) {
                        interfaceC1716260ulM2.LIZJ(null, str3, null);
                    }
                });
            }
        });
        smartRouteBuildRoute.open();
    }

    public final void LIZ$6() {
        C1724240uyE c1724240uyE = (C1724240uyE) this.l0;
        InterfaceC1724300uyK interfaceC1724300uyK = (InterfaceC1724300uyK) this.l1;
        final CompletionBlock completionBlock = (CompletionBlock) this.l2;
        try {
            JSONObject json = interfaceC1724300uyK.toJSON();
            c1724240uyE.getClass();
            new C1723940uxk().LIZIZ(new C1323820kYO(json), new InterfaceC1063920dnC() { // from class: X.09Zb
                @Override // X.InterfaceC1063920dnC
                public final void LIZ(Map<String, Object> map) {
                    CompletionBlock<InterfaceC2392609Zc> completionBlock2 = completionBlock;
                    try {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ocr: wakeTheOcrActivity ");
                        sbLIZ.append(map.size());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                        XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC2392609Zc.class));
                        ((InterfaceC2392609Zc) xBaseModelLIZLLL).setOriginalResult(map);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }, EnumC1059790dgX.ALL);
            C189200o6.m2constructorimpl(json);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Marquee ONCE - ");
        Layout layout = ((TextView) this.l0).getLayout();
        sbLIZ.append(layout != null ? layout.getLineWidth(0) : 0.0f);
        sbLIZ.append(" - ");
        sbLIZ.append(((TextView) this.l0).getWidth());
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        Layout layout2 = ((TextView) this.l0).getLayout();
        final int lineWidth = (int) ((layout2 != null ? layout2.getLineWidth(0) : 0.0f) - ((TextView) this.l0).getWidth());
        if (lineWidth <= 0) {
            InterfaceC1704110uRl interfaceC1704110uRl = (InterfaceC1704110uRl) this.l2;
            if (interfaceC1704110uRl != null) {
                interfaceC1704110uRl.LIZ(0);
                return;
            }
            return;
        }
        ((AbstractC1842530y31) this.l1).LJJII = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((TextView) this.l0).getScrollX(), C497740JfY.LJJ() ? ((AbstractC1842530y31) this.l1).LJIILIIL.getScrollX() - lineWidth : ((AbstractC1842530y31) this.l1).LJIILIIL.getScrollX() + lineWidth);
        final AbstractC1842530y31 abstractC1842530y31 = (AbstractC1842530y31) this.l1;
        TextView textView = (TextView) this.l0;
        final InterfaceC1704110uRl interfaceC1704110uRl2 = (InterfaceC1704110uRl) this.l2;
        valueAnimatorOfInt.setDuration((long) (((lineWidth * 1.0f) / abstractC1842530y31.LIZIZ.LJII) * 1000));
        valueAnimatorOfInt.setStartDelay(abstractC1842530y31.LJJIIJ);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS274S0100000_26(textView, 10));
        valueAnimatorOfInt.addListener(new C1704130uRn() { // from class: X.0uRm
            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C20441214yg.LIZIZ("Ranking Entrance Unification", "Marquee END");
                AbstractC1842530y31 abstractC1842530y312 = abstractC1842530y31;
                C1DFH c1dfh = C0PEM.LIZ;
                abstractC1842530y312.LJJIII = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1704100uRk(abstractC1842530y31, interfaceC1704110uRl2, lineWidth, null), 3);
            }
        });
        valueAnimatorOfInt.start();
    }

    public static final void run$0(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.scrollToSelection$1");
        try {
            Integer num = (Integer) aRunnableS59S0300000_26.l0;
            if (num != null) {
                C1762020vxA c1762020vxA = (C1762020vxA) aRunnableS59S0300000_26.l1;
                UsHeaderVH usHeaderVH = (UsHeaderVH) aRunnableS59S0300000_26.l2;
                int iIntValue = num.intValue();
                int iLJIIJ = C1697810uHb.LJIIJ(c1762020vxA.LLJ);
                if (iLJIIJ >= 0) {
                    C1762400vxm c1762400vxmI6 = usHeaderVH.i6();
                    C712350Rwv.LIZ(c1762400vxmI6.getCommerceHeaderPagerFromXml(), C13LZ.LJ(iIntValue, 0, iLJIIJ));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.scrollToSelection$1");
    }

    public static final void run$1(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpBodyAssem@f8a4.onGlobalLayoutListener$1$2");
        try {
            aRunnableS59S0300000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpBodyAssem@f8a4.onGlobalLayoutListener$1$2");
    }

    public static final void run$10(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.calculateScrollPosition$1");
        try {
            Integer num = (Integer) aRunnableS59S0300000_26.l0;
            if (num != null) {
                UsHeaderVH usHeaderVH = (UsHeaderVH) aRunnableS59S0300000_26.l1;
                C1762020vxA c1762020vxA = (C1762020vxA) aRunnableS59S0300000_26.l2;
                int iIntValue = num.intValue();
                C1762400vxm c1762400vxmI6 = usHeaderVH.i6();
                C712350Rwv.LIZ(c1762400vxmI6.getCommerceHeaderPagerFromXml(), C13LZ.LJ(iIntValue, 0, C1697810uHb.LJIIJ(c1762020vxA.LLJ)));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.calculateScrollPosition$1");
    }

    public static final void run$11(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RegionSelectView@a25d.bindStickyTitle$5");
        try {
            ((C1713160ugM) aRunnableS59S0300000_26.l0).LIZJ((List) aRunnableS59S0300000_26.l1, (Function1) aRunnableS59S0300000_26.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RegionSelectView@a25d.bindStickyTitle$5");
    }

    public static final void run$12(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PipoGetInfoByOcrMethod@6330.handle$1$onInitSuccessful$1");
        try {
            aRunnableS59S0300000_26.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PipoGetInfoByOcrMethod@6330.handle$1$onInitSuccessful$1");
    }

    public static final void run$2(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PageNodeMonitorService@eaf0.onFirstScreen$1");
        try {
            ((C1758210vr1) aRunnableS59S0300000_26.l0).LJ((Function0) aRunnableS59S0300000_26.l1, (Function0) aRunnableS59S0300000_26.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PageNodeMonitorService@eaf0.onFirstScreen$1");
    }

    public static final void run$3(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RegionSelectView@a25d.bindView$5$1");
        try {
            ((C1713160ugM) aRunnableS59S0300000_26.l0).LIZJ((List) aRunnableS59S0300000_26.l1, (Function1) aRunnableS59S0300000_26.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RegionSelectView@a25d.bindView$5$1");
    }

    public static final void run$4(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$1");
        try {
            aRunnableS59S0300000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$1");
    }

    public static final void run$5(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PinConfirmViewAssem@886.initObserver$2$1$1$3");
        try {
            aRunnableS59S0300000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PinConfirmViewAssem@886.initObserver$2$1$1$3");
    }

    public static final void run$6(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        String str;
        C1C7U.LIZ("PipoQueryCcdcOcrStatusMethodIDL@1ec6.handle$1$4");
        try {
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS59S0300000_26.l0;
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1723830uxZ.class, null);
            InterfaceC1723830uxZ interfaceC1723830uxZ = (InterfaceC1723830uxZ) xBaseModelLIZJ;
            if (((IPipoCcdcService) aRunnableS59S0300000_26.l1).LJIIIZ(((InterfaceC1723820uxY) aRunnableS59S0300000_26.l2).getEnterFrom())) {
                str = "Available";
            } else {
                str = "TurnedOff";
            }
            interfaceC1723830uxZ.setStatus(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PipoQueryCcdcOcrStatusMethodIDL@1ec6.handle$1$4");
    }

    public static final void run$7(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("LottieCard@c6e2.onBindView$1");
        try {
            aRunnableS59S0300000_26.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LottieCard@c6e2.onBindView$1");
    }

    public static final void run$8(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ImageCard@69fc.onBindView$1");
        try {
            aRunnableS59S0300000_26.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageCard@69fc.onBindView$1");
    }

    public static final void run$9(ARunnableS59S0300000_26 aRunnableS59S0300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("OpenCANeedSyncStep@6eb6.execute$1");
        try {
            aRunnableS59S0300000_26.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenCANeedSyncStep@6eb6.execute$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS59S0300000_26(X.C1762020vxA r2, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH r3, java.lang.Integer r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS59S0300000_26.<init>(X.0vxA, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH, java.lang.Integer, int):void");
    }

    public ARunnableS59S0300000_26(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ARunnableS59S0300000_26(PdpViewModel pdpViewModel, C19EG c19eg, PdpFragment pdpFragment, PdpBodyAssem pdpBodyAssem, int i) {
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = c19eg;
        this.l2 = pdpBodyAssem;
    }
}
