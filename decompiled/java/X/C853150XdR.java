package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;

/* JADX INFO: renamed from: X.0XdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C853150XdR extends AbstractC854320XfK {
    public final InterfaceC851850XbL LIZ;

    public void LJIILLIIL() {
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return "input_email_for_change";
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131823028);
        c1237010iIN.LJIIIZ = null;
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new ChangeEmailFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public C853150XdR(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof CommonInputEmailFragment.InputEmailActions.VerifySameEmailAction) {
            LIZ().getData().putBoolean("is_changing_same_email", true);
            CommonInputEmailFragment.InputEmailActions.VerifySameEmailAction verifySameEmailAction = (CommonInputEmailFragment.InputEmailActions.VerifySameEmailAction) interfaceC853790XeT;
            LJIIZILJ(verifySameEmailAction.getFragment(), verifySameEmailAction.mo151getParams(), 6, c1237330iIt);
        } else {
            if (!(interfaceC853790XeT instanceof CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction)) {
                return;
            }
            CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction clickSendCodeAction = (CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment = clickSendCodeAction.getFragment();
            C853170XdT c853170XdTMo151getParams = clickSendCodeAction.mo151getParams();
            LJIILLIIL();
            LJIIZILJ(fragment, c853170XdTMo151getParams, 7, c1237330iIt);
        }
    }

    public final void LJIILL(BaseAccountFlowFragment baseAccountFlowFragment, boolean z, InterfaceC853780XeS interfaceC853780XeS) {
        Bundle data = LIZ().getData();
        C854460XfY c854460XfY = C854460XfY.LIZ;
        String enterMethod = baseAccountFlowFragment.getEnterMethod();
        String strRR = baseAccountFlowFragment.RR();
        c854460XfY.getClass();
        boolean zLJIILIIL = C854460XfY.LJIILIIL(enterMethod, strRR);
        C852810Xct.LIZ.getClass();
        data.putBoolean("code_sent", z);
        if (zLJIILIIL) {
            data.putBoolean("show_3p_change_email_success_toast", true);
        } else {
            data.putBoolean("show_modify_email_success_toast", true);
        }
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
    }

    public final void LJIIZILJ(BaseAccountFlowFragment baseAccountFlowFragment, C853170XdT c853170XdT, int i, C1237330iIt c1237330iIt) {
        C1237220iIi c1237220iIi;
        Bundle data = LIZ().getData();
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(baseAccountFlowFragment.getActivity(), c853170XdT.LIZ, baseAccountFlowFragment.SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            LJIILL(baseAccountFlowFragment, false, c1237330iIt);
            return;
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String str = c853170XdT.LIZ;
        c852810Xct.getClass();
        C852810Xct.LJIILLIIL(data, str);
        ChangeEmailFragment.LLLLJ.invoke(baseAccountFlowFragment, c853170XdT.LIZ, "user_click", null, Integer.valueOf(i)).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, baseAccountFlowFragment, this, 4)).LJII(new AfS182S0100000_13(c1237330iIt, 76)).LJIILL();
    }
}
