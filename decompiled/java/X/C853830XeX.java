package X;

import Y.AfS182S0100000_13;
import Y.AfS64S0400000_13;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: renamed from: X.0XeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853830XeX extends AbstractC854320XfK implements InterfaceC853800XeU {
    public final InterfaceC851850XbL LIZ;
    public final VerificationMethodType LIZIZ = VerificationMethodType.EMAIL;

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "verify_email_for_unbind_phone";
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        LJIIIZ(EnumC854420XfU.EMAIL);
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String email = C0XQ5.LIZJ().getEmail();
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131823013);
        c1237010iIN.LJIIIZ = contextLIZ.getString(2131833843, email);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new UnbindInputCodeFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC853800XeU
    public final VerificationMethodType LIZJ() {
        return this.LIZIZ;
    }

    public C853830XeX(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        String strMT;
        InputCodeFragmentV2 inputCodeFragmentV2;
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) {
            C853770XeR c853770XeR = C853770XeR.LIZ;
            InputCodeFragmentV2 fragment = ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT).getFragment();
            Map<String, String> mapLJII = LJII();
            AwS414S0200000_13 awS414S0200000_13 = new AwS414S0200000_13(interfaceC853790XeT, c1237330iIt, 7);
            c853770XeR.getClass();
            C853770XeR.LIZJ(fragment, "resend", null, mapLJII, awS414S0200000_13);
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) {
            InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction verifyEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment2 = verifyEmailCodeAction.getFragment();
            C853090XdL c853090XdLMo153getParams = verifyEmailCodeAction.mo153getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String str = c853090XdLMo153getParams.LIZIZ;
            C854460XfY.LIZ.getClass();
            Map mapLJIIJJI = C854460XfY.LJIIJJI(fragment2);
            String str2 = c853090XdLMo153getParams.LIZJ;
            if (!(fragment2 instanceof InputCodeFragmentV2) || (inputCodeFragmentV2 = (InputCodeFragmentV2) fragment2) == null || (strMT = inputCodeFragmentV2.mT()) == null) {
                strMT = "";
            }
            c0xz4.LJJJ(fragment2, fragment2, str, 25, mapLJIIJJI, str2, strMT).LJIIIIZZ(new AfS64S0400000_13(c853090XdLMo153getParams, this, interfaceC853790XeT, c1237330iIt, 8)).LJII(new AfS182S0100000_13(this, 100)).LJIILL();
            return;
        }
        super.LIZIZ(interfaceC853790XeT, c1237330iIt);
    }
}
