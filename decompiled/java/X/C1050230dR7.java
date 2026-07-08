package X;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0dR7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050230dR7 extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1050240dR8(this));

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050230dR7();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE();
    }

    public final void LJJIJIIJIL() {
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("product_link_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        } else {
            if (!AwemeExtKt.isPseudoAd(LJIIZILJ())) {
                LJJIJIIJI("ttelite_ba_product_link_anchor_show");
                return;
            }
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", C1017070cZd.LJJIJL(LJIIZILJ()));
            c1022820ciuLIZLLL2.LIZJ("product_link_anchor", "refer");
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            c1022820ciuLIZLLL2.LIZIZ(interfaceC1392640mLO.Cf(), "enter_from");
            c1022820ciuLIZLLL2.LJII();
        }
    }

    public final void LJJIJIIJI(String str) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        if (TextUtils.equals(str, "ttelite_ba_product_link_anchor_show") && TextUtils.equals(strLLIIJI, "comment_anchor")) {
            return;
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        Aweme awemeLJIIZILJ = LJIIZILJ();
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) this.LLJ.getValue();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        c1050610dRj.LJJIII(str, awemeLJIIZILJ, anchorCommonStruct, strLLIIJI, null, interfaceC1392640mLO2.Cf());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        LJJIJIIJIL();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        String aid;
        LJJII(c2344009Gk, true, true);
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        String str = "click";
        if (LJIIZILJ().isAd()) {
            AwemeRawAd awemeRawAd = LJIIZILJ().getAwemeRawAd();
            if (awemeRawAd == null || !awemeRawAd.getEnableSoftAdAnchorClick()) {
                str = "otherclick";
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str, LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("product_link_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        } else if (AwemeExtKt.isPseudoAd(LJIIZILJ())) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click", C1017070cZd.LJJIJL(LJIIZILJ()));
            c1022820ciuLIZLLL2.LIZJ("product_link_anchor", "refer");
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            c1022820ciuLIZLLL2.LIZIZ(interfaceC1392640mLO2.Cf(), "enter_from");
            c1022820ciuLIZLLL2.LJII();
        } else {
            LJJIJIIJI("ttelite_ba_product_link_anchor_click");
        }
        if (LJIIZILJ().isAd()) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) this.LLJ.getValue();
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                IAdTaskDepend iAdTaskDependLIZLLL = AdTaskDependImpl.LIZLLL();
                Activity activityLJIILJJIL = LJIILJJIL();
                AwemeRawAd awemeRawAd2 = LJIIZILJ().getAwemeRawAd();
                Aweme awemeLJIIZILJ = LJIIZILJ();
                if (awemeLJIIZILJ == null || (aid = awemeLJIIZILJ.getAid()) == null) {
                    aid = "";
                }
                iAdTaskDependLIZLLL.LIZ(activityLJIILJJIL, awemeRawAd2, schema, aid, 69);
                return;
            }
            return;
        }
        IBAAnchorService iBAAnchorService = (IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class);
        Activity activityLJIILJJIL2 = LJIILJJIL();
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) this.LLJ.getValue();
        Aweme awemeLJIIZILJ2 = LJIIZILJ();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 == null) {
            interfaceC1392640mLO3 = null;
        }
        String strLLIIJI = interfaceC1392640mLO3.LLIIJI();
        InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
        if (interfaceC1392640mLO4 != null) {
            interfaceC1392640mLO = interfaceC1392640mLO4;
        }
        iBAAnchorService.LJIILLIIL(69, activityLJIILJJIL2, null, anchorCommonStruct2, awemeLJIIZILJ2, strLLIIJI, interfaceC1392640mLO.Cf(), null);
        LJJIJIIJI("ttelite_ba_video_product_anchor_9_exp");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        LJJIJIIJIL();
        return super.LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
    }
}
