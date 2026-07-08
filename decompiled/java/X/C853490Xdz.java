package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853490Xdz extends AbstractC854320XfK implements InterfaceC853800XeU {
    public final InterfaceC851850XbL LIZ;
    public final VerificationMethodType LIZIZ = VerificationMethodType.EMAIL;

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "verify_email_before_change";
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = this.LIZ.getData();
        C852810Xct.LIZ.getClass();
        String strLJ = C852810Xct.LJ(data);
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131833845);
        c1237010iIN.LJIIIZ = contextLIZ.getString(2131833843, strLJ);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new VerifyEmailBeforeChangeFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC853800XeU
    public final VerificationMethodType LIZJ() {
        return this.LIZIZ;
    }

    public C853490Xdz(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        String strMT;
        InputCodeFragmentV2 inputCodeFragmentV2;
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) {
            InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction verifyEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment = verifyEmailCodeAction.getFragment();
            C853090XdL c853090XdLMo153getParams = verifyEmailCodeAction.mo153getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String str = c853090XdLMo153getParams.LIZIZ;
            int iLJI = AbstractC854320XfK.LJI(fragment.SR());
            C854460XfY.LIZ.getClass();
            Map mapLJIIJJI = C854460XfY.LJIIJJI(fragment);
            String str2 = c853090XdLMo153getParams.LIZJ;
            if (!(fragment instanceof InputCodeFragmentV2) || (inputCodeFragmentV2 = (InputCodeFragmentV2) fragment) == null || (strMT = inputCodeFragmentV2.mT()) == null) {
                strMT = "";
            }
            c0xz4.LJJJ(fragment, fragment, str, iLJI, mapLJIIJJI, str2, strMT).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, this, c853090XdLMo153getParams, 5)).LJII(new AfS182S0100000_13(c1237330iIt, 77)).LJIILL();
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) {
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction clickResendEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT;
            InputCodeFragmentV2 fragment2 = clickResendEmailCodeAction.getFragment();
            InputCodeFragmentV2 fragment3 = clickResendEmailCodeAction.getFragment();
            String str3 = clickResendEmailCodeAction.mo153getParams().LIZ;
            int iLJI2 = AbstractC854320XfK.LJI(clickResendEmailCodeAction.getFragment().SR());
            C854460XfY c854460XfY = C854460XfY.LIZ;
            InputCodeFragmentV2 fragment4 = clickResendEmailCodeAction.getFragment();
            c854460XfY.getClass();
            C0XZ4.LJJIII(c0xz42, fragment2, fragment3, str3, iLJI2, "resend", C854460XfY.LJIIJJI(fragment4), null, null, null, null, 960).LJIIIIZZ(new AfS182S0100000_13(c1237330iIt, 78)).LJII(new AfS182S0100000_13(c1237330iIt, 79)).LJFF(new C854700Xfw(interfaceC853790XeT, 3)).LJIILL();
            return;
        }
        super.LIZIZ(interfaceC853790XeT, c1237330iIt);
    }
}
