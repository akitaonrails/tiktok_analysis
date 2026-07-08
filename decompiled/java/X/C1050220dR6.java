package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050220dR6 extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    public final void LJJIJIIJI() {
        String extra;
        Integer numValueOf;
        C1050610dRj c1050610dRj = new C1050610dRj();
        User author = LJIIZILJ().getAuthor();
        Aweme awemeLJIIZILJ = LJIIZILJ();
        c1050610dRj.LIZJ = 1;
        c1050610dRj.LJIIIZ(author, awemeLJIIZILJ);
        c1050610dRj.LJII("ttelite_ba_lead_tt_show_cta", "enter_from", "from_uid_id", "to_user_id", "is_ad");
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ba_leadgen_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (AwemeExtKt.isPseudoAd(LJIIZILJ())) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", C1017070cZd.LJJIJL(LJIIZILJ()));
            c1022820ciuLIZLLL2.LIZJ("ba_leadgen_anchor", "refer");
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            c1022820ciuLIZLLL2.LIZIZ((interfaceC1392640mLO != null ? interfaceC1392640mLO : null).Cf(), "enter_from");
            c1022820ciuLIZLLL2.LJII();
            return;
        }
        try {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null || (numValueOf = Integer.valueOf(new JSONObject(extra).optInt("schema_type"))) == null || numValueOf.intValue() != 30) {
                return;
            }
            C1050610dRj c1050610dRj2 = new C1050610dRj();
            Aweme awemeLJIIZILJ2 = LJIIZILJ();
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            c1050610dRj2.LJJIII("ttelite_ba_product_link_anchor_show", awemeLJIIZILJ2, anchorCommonStruct2, "video_anchor", null, (interfaceC1392640mLO2 != null ? interfaceC1392640mLO2 : null).Cf());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050220dR6();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.GET_LEADS.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        LJJIJIIJI();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJII(c2344009Gk, true, true);
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(LJIILJJIL(), "getLeads", "getLeads", null, null);
            new C1050610dRj().LJJII(LJIIZILJ().getAuthor(), LJIIZILJ(), 1, -1);
            return;
        }
        User author = LJIIZILJ().getAuthor();
        if (author == null) {
            return;
        }
        new C1050610dRj().LJIIZILJ(LJIIZILJ(), author);
        IBAAnchorService iBAAnchorService = (IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class);
        Activity activityLJIILJJIL = LJIILJJIL();
        Aweme awemeLJIIZILJ = LJIIZILJ();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 != null) {
            interfaceC1392640mLO = interfaceC1392640mLO2;
        }
        iBAAnchorService.LJIIJJI(activityLJIILJJIL, author, awemeLJIIZILJ, anchorCommonStruct, interfaceC1392640mLO.Cf());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        LJJIJIIJI();
        return super.LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
    }
}
