package X;

import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillRegisterEventService;
import com.ss.android.ugc.aweme.commercialize.landpage.AdAutofillRegisterEventService;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS382S0200000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016320cYQ implements InterfaceC1036050d4F {
    public Aweme LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1016390cYX());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1016380cYW());
    public HomePageDataViewModel LLILZ;

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void TQ1(Aweme aweme) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Yi0(int i, List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1037760d70
    public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC1036050d4F
    public final void Hx0(SparkContext sparkContext) {
        if (sparkContext != null && sparkContext.LJFF(C1016340cYS.class) != null) {
            C1038790d8f.LIZIZ();
        }
    }

    @Override // X.InterfaceC1036050d4F
    public final void UQ0(SparkContext sparkContext) {
        if (sparkContext != null) {
            sparkContext.LJJ(C1016340cYS.class, new C1016340cYS());
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void jB(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String aid = aweme.getAid();
        if (awemeRawAd != null && aid != null) {
            ((IAnoleService) this.LLILLL.getValue()).LIZLLL(new C1009340cNA(aid, aweme.getGroupId(), aweme, awemeRawAd, null, null, null, 112), new C1016430cYb("now_load", C1014230cV3.LIZ("iab_loading_format_dynamic"), Boolean.FALSE, Boolean.TRUE, new AwS382S0200000_16(aweme, this, 52)));
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void r3(Aweme aweme) {
        C19EG c19eg;
        Activity activityLIZIZ;
        this.LL = aweme;
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, (Handler) this.LLILLJJLI.getValue(), new Runnable() { // from class: X.057L
            public static void LIZ() {
                IAdAutofillRegisterEventService iAdAutofillRegisterEventService;
                Object objLIZ = C04TD.LIZ(IAdAutofillRegisterEventService.class, false);
                if (objLIZ != null) {
                    iAdAutofillRegisterEventService = (IAdAutofillRegisterEventService) objLIZ;
                } else {
                    if (C04TD.LLLIIIIL == null) {
                        synchronized (IAdAutofillRegisterEventService.class) {
                            if (C04TD.LLLIIIIL == null) {
                                C04TD.LLLIIIIL = new AdAutofillRegisterEventService();
                            }
                        }
                    }
                    iAdAutofillRegisterEventService = C04TD.LLLIIIIL;
                }
                iAdAutofillRegisterEventService.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IABModuleImpl@e378.onViewHolderSelected$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IABModuleImpl@e378.onViewHolderSelected$1");
            }
        });
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZ = null;
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C2493909px.LIZ(activityLIZIZ);
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            this.LLILZ = C680080Qly.LIZIZ(c19eg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    @Override // X.InterfaceC1037760d70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ou(com.bytedance.hybrid.spark.SparkContext r25, android.content.Context r26) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016320cYQ.Ou(com.bytedance.hybrid.spark.SparkContext, android.content.Context):void");
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
        gz1(new C0SCL(jSONObject), sparkContext);
    }

    @Override // X.InterfaceC1037760d70
    public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
        C1016330cYR c1016330cYR;
        IAnoleManager iAnoleManager;
        if (sparkContext != null && (c1016330cYR = (C1016330cYR) sparkContext.LJFF(C1016330cYR.class)) != null && (iAnoleManager = c1016330cYR.LJIIJJI) != null) {
            iAnoleManager.LJIIZILJ(c0scl);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
        if (sparkContext != null) {
            C1016280cYM c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class);
            if (c1016280cYM != null) {
                c1016280cYM.LJIIIZ = false;
                c1016280cYM.LJIIJ = false;
                c1016280cYM.LJII = null;
                c1016280cYM.LIZIZ = null;
                c1016280cYM.LJIIIIZZ = null;
            }
            C1016330cYR c1016330cYR = (C1016330cYR) sparkContext.LJFF(C1016330cYR.class);
            if (c1016330cYR != null) {
                c1016330cYR.LIZ(sparkContext, "onDestroy");
            }
            sparkContext.LJJ(C1016330cYR.class, null);
            sparkContext.LJJ(C1009300cN6.class, null);
            sparkContext.LJJ(C1016280cYM.class, null);
            sparkContext.LJJ(C1016340cYS.class, null);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void wK1(SparkContext sparkContext, String str) {
        C1016330cYR c1016330cYR;
        if (sparkContext != null && (c1016330cYR = (C1016330cYR) sparkContext.LJFF(C1016330cYR.class)) != null) {
            c1016330cYR.LIZ(sparkContext, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    @Override // X.InterfaceC1036050d4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Su1(android.view.ViewGroup r10, com.bytedance.hybrid.spark.SparkContext r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016320cYQ.Su1(android.view.ViewGroup, com.bytedance.hybrid.spark.SparkContext, boolean):void");
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        if (sparkContext != null) {
            C1016280cYM c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class);
            if (c1016280cYM != null) {
                c1016280cYM.LIZJ(c1035880d3y);
            }
            C1016340cYS c1016340cYS = (C1016340cYS) sparkContext.LJFF(C1016340cYS.class);
            if (c1016340cYS != null) {
                C786410Ut5.LJLIIL(300L, (Handler) c1016340cYS.LJI.getValue(), new ARunnableS85S0200000_16(c1016340cYS, webView, 72));
            }
            sparkContext.LJFF(C1016330cYR.class);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void hv(SparkContext sparkContext, int i, String str) {
        if (sparkContext != null) {
            sparkContext.LJFF(C1016330cYR.class);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        C1016280cYM c1016280cYM;
        if (sparkContext != null && (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) != null) {
            c1016280cYM.LIZJ(c1035880d3y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0cYY] */
    @Override // X.InterfaceC1036050d4F
    public final void qq0(ViewGroup viewGroup, final SparkContext sparkContext, C1036030d4D c1036030d4D) {
        C1035880d3y c1035880d3y;
        boolean z;
        boolean z2;
        boolean z3;
        n nVar;
        AwemeRawAd awemeRawAd;
        String aid;
        AwemeRawAd awemeRawAd2;
        Context context;
        boolean z4;
        AwemeRawAd awemeRawAd3;
        String aid2;
        String groupId;
        boolean z5;
        C1035880d3y c1035880d3y2;
        AwemeRawAd awemeRawAd4;
        boolean z6 = true;
        if (sparkContext != null && (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) != null && !c1035880d3y.isPreviewMode()) {
            String groupId2 = null;
            if (sparkContext != null && sparkContext.LJFF(C1016280cYM.class) == null && sparkContext != null) {
                sparkContext.LJJ(C1016280cYM.class, new C1016280cYM(this.LL));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onIABBottomBarInit: efficiencyViewNull=");
            if (viewGroup == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" anoleContainerNull=");
            if (c1036030d4D == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(" hasSlot=");
            if (sparkContext != null && (c1035880d3y2 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) != null && (awemeRawAd4 = c1035880d3y2.getAwemeRawAd()) != null && C1003700cE4.LIZIZ(awemeRawAd4, "tt_iab_bottom_bar_slot")) {
                z3 = true;
            } else {
                z3 = false;
            }
            sbLIZ.append(z3);
            C2188811AlT.LIZIZ(sbLIZ);
            if (sparkContext != null) {
                C1016280cYM c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class);
                if (c1016280cYM != null && viewGroup != null && (context = viewGroup.getContext()) != null) {
                    c1016280cYM.LIZJ = context;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onContainerInit enter: hasManager=");
                    if (c1016280cYM.LJIIIIZZ != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sbLIZ2.append(z4);
                    sbLIZ2.append(" viewAttached=");
                    sbLIZ2.append(Boolean.valueOf(viewGroup.isAttachedToWindow()));
                    sbLIZ2.append(" width=");
                    sbLIZ2.append(Integer.valueOf(viewGroup.getWidth()));
                    sbLIZ2.append(" height=");
                    sbLIZ2.append(Integer.valueOf(viewGroup.getHeight()));
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (c1016280cYM.LJIIIIZZ == null) {
                        Aweme aweme = c1016280cYM.LIZ;
                        if (aweme != null) {
                            awemeRawAd3 = aweme.getAwemeRawAd();
                        } else {
                            awemeRawAd3 = null;
                        }
                        Aweme aweme2 = c1016280cYM.LIZ;
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (awemeRawAd3 != null && aid2 != null) {
                            Aweme aweme3 = c1016280cYM.LIZ;
                            if (aweme3 != null) {
                                groupId = aweme3.getGroupId();
                            } else {
                                groupId = null;
                            }
                            C1009340cNA c1009340cNA = new C1009340cNA(aid2, groupId, c1016280cYM.LIZ, awemeRawAd3, null, null, null, 112);
                            c1016280cYM.LJII = c1009340cNA;
                            groupId2 = null;
                            c1016280cYM.LJIIIIZZ = ((IAnoleService) c1016280cYM.LIZLLL.getValue()).LJI(viewGroup.getContext(), null, c1009340cNA, c1016280cYM, null);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onContainerInit create anoleManager: success=");
                            if (c1016280cYM.LJIIIIZZ != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            sbLIZ3.append(z5);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }
                }
                C1035880d3y c1035880d3y3 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
                if (c1035880d3y3 != null && (awemeRawAd2 = c1035880d3y3.getAwemeRawAd()) != null && C1003700cE4.LIZIZ(awemeRawAd2, "tt_iab_bottom_bar_slot") && sparkContext.LJFF(C1012730cSd.class) == null && c1036030d4D != null) {
                    sparkContext.LJJ(C1012730cSd.class, new C1012730cSd(this.LL, c1036030d4D));
                }
                C1012730cSd c1012730cSd = (C1012730cSd) sparkContext.LJFF(C1012730cSd.class);
                if (c1012730cSd != null) {
                    System.currentTimeMillis();
                    if (c1012730cSd.LJ == null) {
                        Aweme aweme4 = c1012730cSd.LIZ;
                        if (aweme4 != null) {
                            awemeRawAd = aweme4.getAwemeRawAd();
                        } else {
                            awemeRawAd = groupId2;
                        }
                        Aweme aweme5 = c1012730cSd.LIZ;
                        if (aweme5 != null) {
                            aid = aweme5.getAid();
                        } else {
                            aid = groupId2;
                        }
                        if (awemeRawAd != 0 && aid != null) {
                            n nVar2 = new n();
                            nVar2.LJJIIJ("sparkContextContainerId", sparkContext.containerId);
                            C1035880d3y c1035880d3y4 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
                            if (c1035880d3y4 == null || c1035880d3y4.getAdLpBottomModel() == null) {
                                z6 = false;
                            }
                            nVar2.LJJII(Boolean.valueOf(z6), "canShowBAView");
                            Aweme aweme6 = c1012730cSd.LIZ;
                            if (aweme6 != null) {
                                groupId2 = aweme6.getGroupId();
                            }
                            C1009340cNA c1009340cNA2 = new C1009340cNA(aid, groupId2, c1012730cSd.LIZ, awemeRawAd, nVar2, null, null, 96);
                            c1012730cSd.LIZLLL = c1009340cNA2;
                            c1012730cSd.LJ = ((IAnoleService) c1012730cSd.LIZJ.getValue()).LJI(c1012730cSd.LIZIZ.getContext(), null, c1009340cNA2, c1012730cSd, new C1008160cLG(null, null, null, new InterfaceC430190Gtt() { // from class: X.0cYY
                                @Override // X.InterfaceC430190Gtt
                                public final void LIZ(boolean z7) {
                                    InterfaceC1036210d4V interfaceC1036210d4V = (InterfaceC1036210d4V) sparkContext.LJFF(InterfaceC1036210d4V.class);
                                    if (interfaceC1036210d4V != null) {
                                        interfaceC1036210d4V.LJIIJJI(z7);
                                    }
                                }

                                @Override // X.InterfaceC430190Gtt
                                public final void LIZJ(View view, IABBottomBarElement iABBottomBarElement) {
                                    InterfaceC1036210d4V interfaceC1036210d4V = (InterfaceC1036210d4V) sparkContext.LJFF(InterfaceC1036210d4V.class);
                                    if (interfaceC1036210d4V != null) {
                                        interfaceC1036210d4V.LIZJ(view, iABBottomBarElement);
                                    }
                                }
                            }, null, 23));
                            return;
                        }
                        return;
                    }
                    C1009340cNA c1009340cNA3 = c1012730cSd.LIZLLL;
                    if (c1009340cNA3 == null || (nVar = c1009340cNA3.LJ) == null) {
                        return;
                    }
                    C1035880d3y c1035880d3y5 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
                    if (c1035880d3y5 == null || c1035880d3y5.getAdLpBottomModel() == null) {
                        z6 = false;
                    }
                    nVar.LJJII(Boolean.valueOf(z6), "canShowBAView");
                }
            }
        }
    }

    @Override // X.InterfaceC1036050d4F
    public final void y11(int i, SparkContext sparkContext, TuxIconView tuxIconView) {
        C1016340cYS c1016340cYS;
        if (sparkContext != null && (c1016340cYS = (C1016340cYS) sparkContext.LJFF(C1016340cYS.class)) != null) {
            c1016340cYS.LJ = tuxIconView;
            c1016340cYS.LJFF = i;
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        EfficiencyComponents efficiencyComponents;
        Integer num;
        if (sparkContext != null) {
            C1016280cYM c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class);
            if (c1016280cYM != null) {
                c1016280cYM.LJIIJ = false;
                Aweme aweme = c1016280cYM.LIZ;
                if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null || (efficiencyComponents = landingPageConfig.efficiencyComponents) == null || (num = efficiencyComponents.componentType) == null || num.intValue() != 1) {
                    IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
                    if (iAnoleManager != null) {
                        iAnoleManager.LIZ();
                    }
                    IAnoleManager iAnoleManager2 = c1016280cYM.LJIIIIZZ;
                    if (iAnoleManager2 != null) {
                        iAnoleManager2.LJIIJJI("tt_iab_bottom_navigation_bar");
                    }
                    c1016280cYM.LJIIIZ = false;
                }
            }
            C1016340cYS c1016340cYS = (C1016340cYS) sparkContext.LJFF(C1016340cYS.class);
            if (c1016340cYS != null) {
                c1016340cYS.LIZ = false;
                C1035880d3y c1035880d3y = c1016340cYS.LIZJ;
                if (c1035880d3y != null) {
                    c1035880d3y.setIabIsShowAndDelayInChangedScreen(false);
                }
                c1016340cYS.LIZLLL = false;
                c1016340cYS.LJII = false;
                C1038790d8f.LIZIZ();
            }
            C1012730cSd c1012730cSd = (C1012730cSd) sparkContext.LJFF(C1012730cSd.class);
            if (c1012730cSd != null && c1012730cSd.LJFF) {
                IAnoleManager iAnoleManager3 = c1012730cSd.LJ;
                if (iAnoleManager3 != null) {
                    iAnoleManager3.LIZ();
                }
                IAnoleManager iAnoleManager4 = c1012730cSd.LJ;
                if (iAnoleManager4 != null) {
                    iAnoleManager4.LJIIJJI("tt_iab_bottom_bar_slot");
                }
                c1012730cSd.LJFF = false;
            }
        }
        if ((interfaceC1041500dD2 != null && interfaceC1041500dD2.isReuseMode()) || sparkContext == null) {
            return;
        }
        C1016330cYR c1016330cYR = (C1016330cYR) sparkContext.LJFF(C1016330cYR.class);
        if (c1016330cYR != null) {
            c1016330cYR.LIZ(sparkContext, "exitWebPage");
        }
        sparkContext.LJJ(C1016330cYR.class, null);
    }
}
