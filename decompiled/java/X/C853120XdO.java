package X;

import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import Y.AfS64S0400000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0XdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C853120XdO implements InterfaceC1237070iIT {
    public final InterfaceC851850XbL LIZ;

    public void LIZJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1237470iJ7
    public void LJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return "verify_email_code_for_change";
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = LIZ().getData();
        C852810Xct.LIZ.getClass();
        String strLJ = C852810Xct.LJ(data);
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131823013);
        String string = contextLIZ.getString(2131833843, strLJ);
        CharSequence charSequenceLIZ = string;
        if (data.getBoolean("show_edit_icon")) {
            charSequenceLIZ = C1239020iLc.LIZ(contextLIZ, string);
        }
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(charSequenceLIZ, new String[]{strLJ}, 52), contextLIZ, R.attr.a1j, strLJ);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new ChangeEmailVerifyFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public C853120XdO(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        String string;
        if (interfaceC853790XeT instanceof BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        if (interfaceC853790XeT instanceof CommonInputEmailFragment.InputEmailActions.ClickChangeEmailAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) {
            C852870Xcz c852870Xcz = ChangeEmailFragment.LLLLJ;
            InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction clickResendEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT;
            InputCodeFragmentV2 fragment = clickResendEmailCodeAction.getFragment();
            String str = clickResendEmailCodeAction.mo153getParams().LIZ;
            LIZJ();
            c852870Xcz.invoke(fragment, str, "resend", null, 7).LJIIIIZZ(new AfS149S0200000_13(c1237330iIt, interfaceC853790XeT, 16)).LJII(new AfS182S0100000_13(c1237330iIt, 82)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction)) {
            return;
        }
        Bundle data = LIZ().getData();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        HashMap map = new HashMap();
        LIZJ();
        LIZJ();
        map.put("type", C2093608Ic.LIZIZ(String.valueOf(7)));
        C854460XfY c854460XfY = C854460XfY.LIZ;
        InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction verifyEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) interfaceC853790XeT;
        BaseAccountFlowFragment fragment2 = verifyEmailCodeAction.getFragment();
        c854460XfY.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C854460XfY.LJIIJJI(fragment2));
        linkedHashMap.putAll(C854460XfY.LJIIIZ(verifyEmailCodeAction.getFragment()));
        map.putAll(linkedHashMap);
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        BaseAccountFlowFragment fragment3 = verifyEmailCodeAction.getFragment();
        BaseAccountFlowFragment fragment4 = verifyEmailCodeAction.getFragment();
        String str2 = verifyEmailCodeAction.mo153getParams().LIZ;
        String str3 = verifyEmailCodeAction.mo153getParams().LIZIZ;
        C852810Xct.LIZ.getClass();
        String str4 = "";
        if (data != null && (string = data.getString("ticket", "")) != null) {
            str4 = string;
        }
        c0xz4.LJ(fragment3, fragment4, str2, str3, str4, LIZ().getData().getBoolean("from_changePwd", false), map, verifyEmailCodeAction.mo153getParams().LIZJ, verifyEmailCodeAction.mo153getParams().LIZLLL).LJIIIIZZ(new AfS64S0400000_13(interfaceC853790XeT, data, contextLIZ, c1237330iIt, 3)).LJII(new AfS182S0100000_13(c1237330iIt, 83)).LJIILL();
    }
}
