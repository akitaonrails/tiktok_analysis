package Y;

import X.C098200Yq;
import X.C0PEM;
import X.C1018703yb;
import X.C1054004Ag;
import X.C1165480gR0;
import X.C123100dR;
import X.C1421105hJ;
import X.C1697810uHb;
import X.C1720250urn;
import X.C1720760usc;
import X.C1725050uzX;
import X.C1725070uzZ;
import X.C1740600vOc;
import X.C1741550vQ9;
import X.C1741890vQh;
import X.C1750810vf5;
import X.C1770110wAD;
import X.C189200o6;
import X.C1976807ok;
import X.C1AF0;
import X.C2097608Jq;
import X.C300590BqL;
import X.C610140NwS;
import X.C7879035x;
import X.C948503nH;
import X.InterfaceC1720050urT;
import X.InterfaceC1725110uzd;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.bottom.EcVideoGuideBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionButton;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkBottomSheetFragment;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS36S2200000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS32S1300000_26 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
        }
    }

    public static final void onClick$0(ACListenerS32S1300000_26 aCListenerS32S1300000_26, View view) {
        ErrorCodeSdkBottomSheetFragment errorCodeSdkBottomSheetFragment = (ErrorCodeSdkBottomSheetFragment) aCListenerS32S1300000_26.l1;
        C1725050uzX c1725050uzX = errorCodeSdkBottomSheetFragment.LLILZ;
        if (c1725050uzX != null) {
            Context context = (Context) aCListenerS32S1300000_26.l3;
            String str = errorCodeSdkBottomSheetFragment.LLILLJJLI;
            if (str == null) {
                str = "";
            }
            C1725070uzZ c1725070uzZ = new C1725070uzZ(context, str, c1725050uzX);
            if (c1725070uzZ != null) {
                String str2 = aCListenerS32S1300000_26.s0;
                ErrorActionButton errorActionButton = (ErrorActionButton) aCListenerS32S1300000_26.l2;
                String str3 = errorActionButton.actionType;
                String str4 = errorActionButton.actionParams;
                InterfaceC1725110uzd interfaceC1725110uzd = errorCodeSdkBottomSheetFragment.LLILLL;
                c1725070uzZ.LIZ(str2, str3, str4, interfaceC1725110uzd, new AwS36S2200000_26(interfaceC1725110uzd, errorCodeSdkBottomSheetFragment, str3, str2, 0));
            }
        }
    }

    public static final void onClick$1(ACListenerS32S1300000_26 aCListenerS32S1300000_26, View view) {
        String str;
        C1054004Ag c1054004Ag = ((C1750810vf5) aCListenerS32S1300000_26.l1).LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            ToastContent toastContent = ((ExceptionUX) aCListenerS32S1300000_26.l2).toastContent;
            if (toastContent != null) {
                str = toastContent.daInfo;
            } else {
                str = null;
            }
            C1018703yb.LIZLLL("tiktokec_toast_click", new AwS140S1100000_26(c1054004Ag, str, 62));
        }
        ((C1750810vf5) aCListenerS32S1300000_26.l1).LIZIZ((View) aCListenerS32S1300000_26.l3, aCListenerS32S1300000_26.s0);
    }

    public static final void onClick$2(ACListenerS32S1300000_26 aCListenerS32S1300000_26, View view) {
        InterfaceC1720050urT interfaceC1720050urT;
        C1720760usc c1720760usc = ((C1165480gR0) aCListenerS32S1300000_26.l1).LL;
        if (c1720760usc != null && (interfaceC1720050urT = c1720760usc.LIZIZ) != null) {
            interfaceC1720050urT.bL((StellarActionDO) aCListenerS32S1300000_26.l2, new C1720250urn(aCListenerS32S1300000_26.s0, null, "button", (View) aCListenerS32S1300000_26.l3, 10), null);
        }
    }

    public static final void onClick$3(ACListenerS32S1300000_26 aCListenerS32S1300000_26, View view) {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial;
        IEcUgBtmService iEcUgBtmService;
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial2;
        IEcUgBtmService iEcUgBtmService2;
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onClickMallEntry("homepage_hot", null);
        }
        EcVideoGuideBottomButtonAssem ecVideoGuideBottomButtonAssem = (EcVideoGuideBottomButtonAssem) aCListenerS32S1300000_26.l1;
        C1741550vQ9 c1741550vQ9 = ((C1770110wAD) aCListenerS32S1300000_26.l2).LJ;
        String str = aCListenerS32S1300000_26.s0;
        C1740600vOc c1740600vOc = (C1740600vOc) aCListenerS32S1300000_26.l3;
        ecVideoGuideBottomButtonAssem.getClass();
        if (C7879035x.LIZLLL()) {
            if (ecVideoGuideBottomButtonAssem.getContext() != null) {
                if (C123100dR.LIZ(c1741550vQ9.LIZ)) {
                    Uri.Builder builderLIZ = C1976807ok.LIZ(UriProtector.parse(c1741550vQ9.LIZ), new Pair("previous_page", c1741550vQ9.LIZIZ), new Pair("mall_extra_info", c1741550vQ9.LIZJ), new Pair("suggest_guide_request_params", c1741550vQ9.LJ), new Pair("diversion_config", c1741550vQ9.LJFF), new Pair("enter_method", str));
                    if (C300590BqL.LIZIZ() && C123100dR.LIZ(c1741550vQ9.LJIIIIZZ)) {
                        C1976807ok.LIZJ(builderLIZ, new Pair("attach_products", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIILJJIL(C2097608Jq.LJIIJ(new Pair("product_id", c1741550vQ9.LJIIIIZZ), new Pair("position", 1))))));
                    }
                    if (!C300590BqL.LIZIZ()) {
                        C1976807ok.LIZJ(builderLIZ, new Pair("diversion_params", c1741550vQ9.LIZLLL));
                    }
                    if (c1740600vOc != null && (iEcUgBtmService2 = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null)) != null) {
                        iEcUgBtmService2.LIZ(c1740600vOc, builderLIZ);
                    }
                    String string = builderLIZ.toString();
                    IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial3 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
                    if (iEcUgBackButtonServiceOfficial3 != null) {
                        iEcUgBackButtonServiceOfficial3.releaseBackButton();
                    }
                    if (c1741550vQ9.LJI && (iEcUgBackButtonServiceOfficial2 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null)) != null) {
                        iEcUgBackButtonServiceOfficial2.prepareBackButton(null, c1741550vQ9.LJII, "video");
                    }
                    IMallLandingPerfTracker iMallLandingPerfTracker2 = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                    if (iMallLandingPerfTracker2 != null) {
                        iMallLandingPerfTracker2.onStartJumpToMall(string, null, true);
                    }
                    SmartRouter.buildRoute(ecVideoGuideBottomButtonAssem.getContext(), string).open();
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } else {
            try {
                if (ecVideoGuideBottomButtonAssem.getContext() != null) {
                    if (C123100dR.LIZ(c1741550vQ9.LIZ)) {
                        Uri.Builder builderLIZ2 = C1976807ok.LIZ(UriProtector.parse(c1741550vQ9.LIZ), new Pair("previous_page", c1741550vQ9.LIZIZ), new Pair("mall_extra_info", c1741550vQ9.LIZJ), new Pair("suggest_guide_request_params", c1741550vQ9.LJ), new Pair("diversion_config", c1741550vQ9.LJFF), new Pair("enter_method", str));
                        if (C300590BqL.LIZIZ() && C123100dR.LIZ(c1741550vQ9.LJIIIIZZ)) {
                            C1976807ok.LIZJ(builderLIZ2, new Pair("attach_products", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIILJJIL(C2097608Jq.LJIIJ(new Pair("product_id", c1741550vQ9.LJIIIIZZ), new Pair("position", 1))))));
                        }
                        if (!C300590BqL.LIZIZ()) {
                            C1976807ok.LIZJ(builderLIZ2, new Pair("diversion_params", c1741550vQ9.LIZLLL));
                        }
                        if (c1740600vOc != null && (iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null)) != null) {
                            iEcUgBtmService.LIZ(c1740600vOc, builderLIZ2);
                        }
                        String string2 = builderLIZ2.toString();
                        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial4 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
                        if (iEcUgBackButtonServiceOfficial4 != null) {
                            iEcUgBackButtonServiceOfficial4.releaseBackButton();
                        }
                        if (c1741550vQ9.LJI && (iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null)) != null) {
                            iEcUgBackButtonServiceOfficial.prepareBackButton(null, c1741550vQ9.LJII, "video");
                        }
                        IMallLandingPerfTracker iMallLandingPerfTracker3 = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        if (iMallLandingPerfTracker3 != null) {
                            iMallLandingPerfTracker3.onStartJumpToMall(string2, null, true);
                        }
                        SmartRouter.buildRoute(ecVideoGuideBottomButtonAssem.getContext(), string2).open();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        EcVideoGuideVM ecVideoGuideVMFp = ((EcVideoGuideBottomButtonAssem) aCListenerS32S1300000_26.l1).Fp();
        ReachCfg reachCfg = ((C1770110wAD) aCListenerS32S1300000_26.l2).LJFF;
        ecVideoGuideVMFp.getClass();
        if (reachCfg != null) {
            C948503nH.LJI(ecVideoGuideVMFp, C0PEM.LIZJ, new C610140NwS(reachCfg, ecVideoGuideVMFp, 1, 2, null));
        }
        Map<String, Object> map = ((C1770110wAD) aCListenerS32S1300000_26.l2).LIZLLL;
        map.put("enter_method", aCListenerS32S1300000_26.s0);
        C1421105hJ.LIZJ("tiktokec_mall_entrance_click", map);
    }

    public ACListenerS32S1300000_26(EcVideoGuideBottomButtonAssem ecVideoGuideBottomButtonAssem, C1770110wAD c1770110wAD, C1740600vOc c1740600vOc, int i) {
        this.$t = i;
        this.l1 = ecVideoGuideBottomButtonAssem;
        this.l2 = c1770110wAD;
        this.s0 = "click_fyp_ecom_video_shop_now_button";
        this.l3 = c1740600vOc;
    }

    public ACListenerS32S1300000_26(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
