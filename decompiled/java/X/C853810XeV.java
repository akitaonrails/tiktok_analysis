package X;

import Y.AfS149S0200000_13;
import Y.AfS64S0400000_13;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: renamed from: X.0XeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853810XeV extends AbstractC854320XfK implements InterfaceC853800XeU {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "verify_phone_for_unbind_phone";
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        LJIIIZ(EnumC854420XfU.SMS);
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String bindPhone = C0XQ5.LIZJ().getBindPhone();
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131857885);
        c1237010iIN.LJIIIZ = contextLIZ.getString(2131857884, bindPhone);
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
        return VerificationMethodType.MOBILE;
    }

    public C853810XeV(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) {
            C853770XeR.LJ(C853770XeR.LIZ, ((InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) interfaceC853790XeT).getFragment(), "resend", null, LJII(), null, new AwS414S0200000_13(interfaceC853790XeT, c1237330iIt, 5), 20);
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction) {
            InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction verifyPhoneCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment = verifyPhoneCodeAction.getFragment();
            C853080XdK c853080XdKMo153getParams = verifyPhoneCodeAction.mo153getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String str = c853080XdKMo153getParams.LIZIZ;
            Map<String, String> mapLJII = LJII();
            c0xz4.getClass();
            C0XZ4.LJJIL(fragment, fragment, str, 22, mapLJII).LJIIIIZZ(new AfS64S0400000_13(c853080XdKMo153getParams, this, fragment, c1237330iIt, 6)).LJII(new AfS149S0200000_13(c1237330iIt, this, 24)).LJIILL();
            return;
        }
        super.LIZIZ(interfaceC853790XeT, c1237330iIt);
    }
}
