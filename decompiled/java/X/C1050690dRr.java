package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0dRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050690dRr extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1050720dRu(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1050700dRs(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1050710dRt(this));

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050690dRr();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.DM_ANCHOR.getTYPE();
    }

    public final void LJJIJIIJI() {
        Aweme awemeLJIIZILJ = LJIIZILJ();
        C1050610dRj c1050610dRj = new C1050610dRj();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        Object value = this.LLJIJIL.getValue();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        c1050610dRj.LJJIII("tt_anchor_show", awemeLJIIZILJ, anchorCommonStruct, "video_anchor", value, interfaceC1392640mLO.Cf());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        LJJIJIIJI();
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        LJJII(c2344009Gk, true, true);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(interfaceC1392640mLO2.LIZIZ(), schema);
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            smartRouteBuildRoute.withParam("enter_from", interfaceC1392640mLO3.Cf());
            smartRouteBuildRoute.open();
        }
        Aweme awemeLJIIZILJ = LJIIZILJ();
        C1050610dRj c1050610dRj = new C1050610dRj();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        Object value = this.LLJIJIL.getValue();
        InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
        if (interfaceC1392640mLO4 != null) {
            interfaceC1392640mLO = interfaceC1392640mLO4;
        }
        c1050610dRj.LJJIII("tt_anchor_click", awemeLJIIZILJ, anchorCommonStruct2, "video_anchor", value, interfaceC1392640mLO.Cf());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        LJJIJIIJI();
        return super.LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
    }
}
