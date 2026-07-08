package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025820cnk extends AbstractC1026640cp4<C1025810cnj> {
    public final C1025810cnj LJIILL;
    public final String LJIILLIIL = "lynx";
    public final boolean LJIIZILJ;
    public final C01GW LJIJ;

    @Override // X.InterfaceC1026720cpC
    public final boolean LJ() {
        return u.LJJIIJZLJL(this.LJIILL.LIZJ, "aweme://lynxview", false);
    }

    @Override // X.AbstractC1026640cp4
    public final boolean LJIJ() {
        return this.LJIILL.LJI instanceof C1025680cnW;
    }

    @Override // X.InterfaceC1026870cpR
    public final String getUrl() {
        return (String) this.LJIJ.getValue();
    }

    @Override // X.AbstractC1026640cp4, X.InterfaceC1026870cpR
    public final Fragment getFragment() {
        super.getFragment();
        return ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZIZ(LJIIJ(), (String) this.LJIJ.getValue(), C1025800cni.LIZ(this, C1025710cnZ.LIZ(this.LJIILL.LJI, LJIIJ())), true, this.LJIILL.LJII, LJIIIIZZ(), null, true, null);
    }

    @Override // X.AbstractC1026640cp4
    public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
        return this.LJIILL;
    }

    @Override // X.AbstractC1026640cp4
    public final String LJIILLIIL() {
        return this.LJIILLIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1025820cnk(X.C1025810cnj r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.LJIILL = r3
            java.lang.String r0 = "lynx"
            r2.LJIILLIIL = r0
            com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel r0 = r2.LJIIJJI()
            if (r0 == 0) goto L26
            int r1 = r0.getLandingPageNativeType()
            r0 = 1
            if (r1 != r0) goto L26
        L16:
            r2.LJIIZILJ = r0
            kotlin.jvm.internal.AwS560S0100000_16 r1 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 882(0x372, float:1.236E-42)
            r1.<init>(r2, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r2.LJIJ = r0
            return
        L26:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1025820cnk.<init>(X.0cnj):void");
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        AbstractC1025700cnY abstractC1025700cnY = this.LJIILL.LJI;
        if (abstractC1025700cnY instanceof AbstractC1025450cn9) {
            AbstractC1025450cn9 abstractC1025450cn9 = (AbstractC1025450cn9) abstractC1025700cnY;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(LJIIJ());
            if (c19egLIZIZ == null) {
                return C1025830cnl.LJIIZILJ;
            }
            ((IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class)).LJIIJ(LJIIIIZZ(), c19egLIZIZ, abstractC1025450cn9.LJI, C1025800cni.LIZ(this, C1025710cnZ.LIZ(abstractC1025450cn9, c19egLIZIZ)), null);
            return C1026670cp7.LIZLLL;
        }
        if (abstractC1025700cnY instanceof AbstractC1025750cnd) {
            AbstractC1025750cnd abstractC1025750cnd = (AbstractC1025750cnd) abstractC1025700cnY;
            if (abstractC1025750cnd instanceof C1025660cnU) {
                C1025660cnU c1025660cnU = (C1025660cnU) abstractC1025750cnd;
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(LJIIJ());
                if (c19egLIZIZ2 == null) {
                    return C1025830cnl.LJIIZILJ;
                }
                Fragment fragmentLIZIZ = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZIZ(LJIIJ(), (String) this.LJIJ.getValue(), C1025800cni.LIZ(this, C1025710cnZ.LIZ(this.LJIILL.LJI, c19egLIZIZ2)), true, this.LJIILL.LJII, LJIIIIZZ(), null, false, null);
                IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                if (iAdWebUtils != null) {
                    iAdWebUtils.pv(true, c19egLIZIZ2, fragmentLIZIZ, Boolean.TRUE, null, c1025660cnU.LIZIZ, true, true, true, null, new AwS595S0100000_16(c1025660cnU, 347));
                }
                return C1026670cp7.LIZLLL;
            }
            if (abstractC1025750cnd instanceof C1025680cnW) {
                List<InterfaceC1025840cnm> list = this.LJIIJ;
                if (list != null) {
                    Iterator<InterfaceC1025840cnm> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(this, null);
                    }
                }
                return C1026670cp7.LIZLLL;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIIJ(), "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", C1025800cni.LIZ(this, C1025710cnZ.LIZ(this.LJIILL.LJI, LJIIJ())));
            smartRouteBuildRoute.withParam("keyFromScene", this.LJIILL.LJII);
            smartRouteBuildRoute.open();
            return C1026670cp7.LIZLLL;
        }
        throw new C1954807lC();
    }
}
