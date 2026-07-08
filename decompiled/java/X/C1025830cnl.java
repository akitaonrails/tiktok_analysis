package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025830cnl extends AbstractC1026640cp4<C1025790cnh> {
    public static final C1026670cp7 LJIIZILJ = new C1026670cp7(-1, "fragment_activity_dependency_failed");
    public final C1025790cnh LJIILL;
    public final String LJIILLIIL = "iab";

    @Override // X.InterfaceC1026720cpC
    public final boolean LJ() {
        boolean z = this.LJIILL.LIZIZ.LJIIJ;
        if (LJIJJ(1) || LJIJJ(3)) {
            return true;
        }
        return z ? C815510Vyv.LIZIZ(UriProtector.parse(this.LJIILL.LIZJ)) : this.LJIILL.LIZJ.length() > 0;
    }

    @Override // X.AbstractC1026640cp4
    public final boolean LJIJ() {
        return this.LJIILL.LJFF instanceof C1025680cnW;
    }

    @Override // X.AbstractC1026640cp4, X.InterfaceC1026870cpR
    public final Fragment getFragment() {
        Aweme aweme;
        super.getFragment();
        Object objLJIIL = LJIIL();
        if (!(objLJIIL instanceof Aweme) || (aweme = (Aweme) objLJIIL) == null) {
            return null;
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        Context contextLJIIJ = LJIIJ();
        C1025790cnh c1025790cnh = this.LJIILL;
        String str = c1025790cnh.LIZJ;
        String str2 = c1025790cnh.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) this.LJIIJJI.getValue();
        boolean z = this.LJIILL.LJII;
        String str4 = ((Boolean) this.LJIILJJIL.getValue()).booleanValue() ? "slide_1px" : "click";
        C1025790cnh c1025790cnh2 = this.LJIILL;
        String str5 = c1025790cnh2.LIZ.LIZIZ;
        String authorUid = c1025790cnh2.LJ.getAuthorUid();
        ICRouterMainDelegate iCRouterMainDelegateLJIILJJIL = LJIILJJIL();
        C1025790cnh c1025790cnh3 = this.LJIILL;
        String strLJJIII = iCRouterMainDelegateLJIILJJIL.LJJIII(c1025790cnh3.LIZ.LIZJ, c1025790cnh3.LIZJ);
        if (strLJJIII == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            strLJJIII = C2188811AlT.LIZIZ(sbLIZ);
        }
        return iAdWebUtils.fv(contextLJIIJ, aweme, new C1035740d3k(str, 1, str2, "feedad", str3, false, str4, z, 0, strLJJIII, false, false, str5, authorUid, this.LJIILL.LJ.getRequestId(), this.LJIILL.LJ.getAuthorAvatar(), false, null, this.LJIILL.LJ.getAiAgentConfig(), Integer.valueOf(this.LJIILL.LIZIZ.LJFF)), this.LJIILL.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC1026870cpR
    public final String getUrl() {
        return this.LJIILL.LIZJ;
    }

    @Override // X.AbstractC1026640cp4
    public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
        return this.LJIILL;
    }

    @Override // X.AbstractC1026640cp4
    public final String LJIILLIIL() {
        return this.LJIILLIIL;
    }

    public C1025830cnl(C1025790cnh c1025790cnh) {
        this.LJIILL = c1025790cnh;
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        Aweme aweme;
        if (LJIJJ(1)) {
            ICRouterMainDelegate iCRouterMainDelegateLJIILJJIL = LJIILJJIL();
            Context contextLJIIJ = LJIIJ();
            C1025790cnh c1025790cnh = this.LJIILL;
            iCRouterMainDelegateLJIILJJIL.LJJ(contextLJIIJ, c1025790cnh.LIZJ, c1025790cnh.LIZ.LIZJ, c1025790cnh.LJIIIZ, c1025790cnh.LIZIZ.LIZLLL);
            return C1026670cp7.LIZLLL;
        }
        QuickActionModel quickActionModelLIZIZ = null;
        if (LJIJJ(3)) {
            C19EG c19egLIZ = C1507205vC.LIZ(LJIIJ());
            if (c19egLIZ == null) {
                return LJIIZILJ;
            }
            Boolean bool = Boolean.TRUE;
            C1025720cna c1025720cna = new C1025720cna(1.0E-4f, bool, Boolean.FALSE, 3, Boolean.FALSE, 0, 0, Boolean.FALSE);
            C1025790cnh c1025790cnh2 = this.LJIILL;
            Object obj = c1025790cnh2.LIZ.LIZJ;
            if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
                CRouterQuickActionModel cRouterQuickActionModel = c1025790cnh2.LJIIIZ;
                if (cRouterQuickActionModel != null) {
                    quickActionModelLIZIZ = C1025540cnI.LIZIZ(cRouterQuickActionModel);
                }
                C1026310coX c1026310coXLIZ = C1025780cng.LIZ(this, c1025720cna);
                C1028100crQ popUpCustomConfig = c1026310coXLIZ.getPopUpCustomConfig();
                if (popUpCustomConfig != null) {
                    popUpCustomConfig.setDisableAutoPopup(bool);
                }
                AdlpExtraModel adlpExtraModel = c1026310coXLIZ.getAdlpExtraModel();
                if (adlpExtraModel != null) {
                    adlpExtraModel.setRefer("feed_ai_pdp_background_open");
                }
                String str = this.LJIILL.LIZIZ.LIZLLL;
                IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi$default(IAdLandingPagePopUpService.class, false, false, false, 14, null);
                if (iAdLandingPagePopUpService != null) {
                    iAdLandingPagePopUpService.LJIILJJIL(c19egLIZ, c1026310coXLIZ, quickActionModelLIZIZ, aweme, LJIIIIZZ(), str);
                }
                return C1026670cp7.LIZLLL;
            }
            return C1026670cp7.LJ;
        }
        AbstractC1025700cnY abstractC1025700cnY = this.LJIILL.LJFF;
        if (abstractC1025700cnY instanceof AbstractC1025450cn9) {
            AbstractC1025450cn9 abstractC1025450cn9 = (AbstractC1025450cn9) abstractC1025700cnY;
            C19EG c19egLIZ2 = C1507205vC.LIZ(LJIIJ());
            if (c19egLIZ2 == null) {
                return LJIIZILJ;
            }
            ((IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class)).LJIIJ(LJIIIIZZ(), c19egLIZ2, abstractC1025450cn9.LJI, C1025780cng.LIZ(this, C1025710cnZ.LIZ(abstractC1025450cn9, c19egLIZ2)), null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleSplitScreen() invoke, sheetType = ");
            sbLIZ.append(abstractC1025450cn9);
            C2188811AlT.LIZIZ(sbLIZ);
            return C1026670cp7.LIZLLL;
        }
        if (abstractC1025700cnY instanceof AbstractC1025750cnd) {
            AbstractC1025750cnd abstractC1025750cnd = (AbstractC1025750cnd) abstractC1025700cnY;
            if (abstractC1025750cnd instanceof C1025660cnU) {
                C1025660cnU c1025660cnU = (C1025660cnU) abstractC1025750cnd;
                C19EG c19egLIZ3 = C1507205vC.LIZ(LJIIJ());
                if (c19egLIZ3 == null) {
                    return LJIIZILJ;
                }
                Object objLJIIL = LJIIL();
                if ((objLJIIL instanceof Aweme) && objLJIIL != null) {
                    IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                    if (iAdWebUtils != null) {
                        iAdWebUtils.kv(c19egLIZ3, iAdWebUtils.wv(this.LJIILL.LIZIZ.LJFF, C1025780cng.LIZ(this, C1025710cnZ.LIZ(c1025660cnU, c19egLIZ3))), new AwS595S0100000_16(c1025660cnU, 346));
                    }
                    return C1026670cp7.LIZLLL;
                }
                return C1026670cp7.LJ;
            }
            if (abstractC1025750cnd instanceof C1025680cnW) {
                List<InterfaceC1025840cnm> list = this.LJIIJ;
                if (list != null) {
                    Iterator<InterfaceC1025840cnm> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(this, this.LJIILL);
                    }
                }
                return C1026670cp7.LIZLLL;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIIJ(), "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", C1025780cng.LIZ(this, C1025710cnZ.LIZ(this.LJIILL.LJFF, LJIIJ())));
            smartRouteBuildRoute.withParam("keyFromScene", this.LJIILL.LJI);
            smartRouteBuildRoute.open();
            return C1026670cp7.LIZLLL;
        }
        throw new C1954807lC();
    }

    public final boolean LJIJJ(int i) {
        CRouterQuickActionModel cRouterQuickActionModel;
        Integer quickActionType;
        boolean z = false;
        if (this.LJIILL.LJIIIZ == null) {
            return false;
        }
        ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
        C1025790cnh c1025790cnh = this.LJIILL;
        Object obj = c1025790cnh.LIZ.LIZLLL;
        CRouterQuickActionModel cRouterQuickActionModel2 = c1025790cnh.LJIIIZ;
        C1025520cnG c1025520cnG = c1025790cnh.LIZIZ;
        boolean zLJIJJ = iCRouterAdapterDelegateLJIILIIL.LJIJJ(obj, cRouterQuickActionModel2, c1025520cnG.LJFF, c1025520cnG.LIZLLL);
        if ((!a0.LJJJIL(this.LJIILL.LIZJ)) && zLJIJJ && (cRouterQuickActionModel = this.LJIILL.LJIIIZ) != null && (quickActionType = cRouterQuickActionModel.getQuickActionType()) != null && quickActionType.intValue() == i) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSKUCheckoutScene = ");
        sbLIZ.append(z);
        sbLIZ.append(",currentUrl = ");
        sbLIZ.append(this.LJIILL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }
}
