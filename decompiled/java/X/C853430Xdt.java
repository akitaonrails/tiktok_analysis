package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import Y.AfS64S0400000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853430Xdt extends C853280Xde {
    public final InterfaceC851850XbL LIZLLL;
    public final String LJ;

    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
    }

    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
    public final void LJ() {
        if (Intrinsics.LJFF(this.LIZLLL.getData().getString("origin_enter_flow"), "verify_1p_email")) {
            C786410Ut5.LJJJI("enter_flow", "verify_1p_email", this.LIZLLL.getData());
        }
    }

    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZLLL;
    }

    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
    public final String getId() {
        return this.LJ;
    }

    public C853430Xdt(InterfaceC851850XbL interfaceC851850XbL) {
        super(interfaceC851850XbL);
        this.LIZLLL = interfaceC851850XbL;
        this.LJ = "pii_verify_email_for_bind";
    }

    @Override // X.C853280Xde, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) {
            C854460XfY c854460XfY = C854460XfY.LIZ;
            InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction clickResendEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT;
            InputCodeFragmentV2 fragment = clickResendEmailCodeAction.getFragment();
            c854460XfY.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C854460XfY.LJIIIZ(fragment));
            linkedHashMap.putAll(C854460XfY.LJIIJJI(clickResendEmailCodeAction.getFragment()));
            C0XZ4.LJJIII(C0XZ4.LIZ, clickResendEmailCodeAction.getFragment(), clickResendEmailCodeAction.getFragment(), "", 6, "resend", linkedHashMap, null, null, null, null, 960).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, this, interfaceC853790XeT, 11)).LJII(new AfS182S0100000_13(c1237330iIt, 97)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction)) {
            return;
        }
        Bundle data = this.LIZLLL.getData();
        InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction verifyEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) interfaceC853790XeT;
        C853090XdL c853090XdLMo153getParams = verifyEmailCodeAction.mo153getParams();
        C854460XfY c854460XfY2 = C854460XfY.LIZ;
        BaseAccountFlowFragment fragment2 = verifyEmailCodeAction.getFragment();
        c854460XfY2.getClass();
        C0XZ4.LIZ.LJJJ(verifyEmailCodeAction.getFragment(), verifyEmailCodeAction.getFragment(), c853090XdLMo153getParams.LIZIZ, 6, C854460XfY.LJIIIZ(fragment2), c853090XdLMo153getParams.LIZJ, "user_click").LJIIIIZZ(new AfS64S0400000_13(c853090XdLMo153getParams, data, interfaceC853790XeT, c1237330iIt, 4)).LJII(new AfS182S0100000_13(c1237330iIt, 98)).LJIILL();
    }
}
