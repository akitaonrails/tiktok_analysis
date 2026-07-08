package X;

import Y.AfS182S0100000_13;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;

/* JADX INFO: renamed from: X.0Xbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852020Xbc extends C0XQW {
    public final int LIZJ;
    public final String LIZLLL;

    @Override // X.C0XQW
    public final boolean LIZ() {
        C1237220iIi c1237220iIi;
        C854460XfY c854460XfY = C854460XfY.LIZ;
        String strLLIIJI = this.LIZIZ.getMobParams().LLIIJI();
        String strRR = this.LIZIZ.getMobParams().RR();
        c854460XfY.getClass();
        if (!C854460XfY.LJIILIIL(strLLIIJI, strRR) && this.LIZIZ.isViewValid()) {
            C0XYD c0xyd = this.LIZIZ;
            int i = this.LIZJ;
            c0xyd.pn(i, C849760XVe.LIZIZ(Integer.valueOf(i), this.LIZLLL));
            return true;
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Fragment fragment = this.LIZ;
        c852810Xct.getClass();
        String strLIZLLL = C852810Xct.LIZLLL(fragment);
        Fragment fragment2 = this.LIZ;
        if ((fragment2 instanceof BaseAccountFlowFragment) && ((BaseAccountFlowFragment) fragment2).OR().yQ2()) {
            BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) this.LIZ;
            baseAccountFlowFragment.OR().wQ2(new CommonInputEmailFragment.InputEmailActions.VerifySameEmailAction(new C853170XdT(strLIZLLL), baseAccountFlowFragment));
            return false;
        }
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(this.LIZ.getActivity(), strLIZLLL, this.LIZIZ.scene());
        if (c851370XaZLIZ == null || (c1237220iIi = c851370XaZLIZ.LIZ) == null || !c1237220iIi.LIZIZ()) {
            C0XZ4.LJJIII(C0XZ4.LIZ, this.LIZ, this.LIZIZ, strLIZLLL, 6, "user_click", null, null, null, null, null, 992).LJIIIIZZ(new AfS182S0100000_13(this, 2)).LJIILL();
            return true;
        }
        LIZIZ(false);
        return true;
    }

    public final void LIZIZ(boolean z) {
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Fragment fragment = this.LIZ;
        c852810Xct.getClass();
        C852810Xct.LJIILJJIL(fragment, true);
        Bundle arguments = this.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        bundle.putBoolean("code_sent", z);
        C852810Xct.LJIILL(bundle, "email_binding_show");
        bundle.putBoolean("is_changing_same_email", true);
        bundle.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_VERIFY.getValue());
        this.LIZIZ.fo(bundle);
    }

    public C852020Xbc(Fragment fragment, C0XYD c0xyd, int i, String str) {
        super(fragment, c0xyd);
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
