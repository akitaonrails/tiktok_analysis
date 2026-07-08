package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;

/* JADX INFO: renamed from: X.0dR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050210dR5 extends AbstractC1066890drz {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050210dR5();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ADS_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZIZ = null;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("anchor", "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        boolean z;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        boolean zLL = C1017070cZd.LL(awemeLJIIZILJ);
        if (!awemeLJIIZILJ.isAd() && zLL) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (z) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(interfaceC1392640mLO2.LIZIZ());
            c1389890mGx.LJIIIZ(2131824738);
            c1389890mGx.LJIIJJI();
            return;
        }
        LJJII(c2344009Gk, true, true);
        IAdOpenHelper iAdOpenHelper = (IAdOpenHelper) ServiceManager.get().getService(IAdOpenHelper.class);
        if (iAdOpenHelper != null) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO3;
            }
            iAdOpenHelper.LIZJ(interfaceC1392640mLO.LIZIZ(), LJIIZILJ());
        }
    }
}
