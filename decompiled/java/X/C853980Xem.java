package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853980Xem extends AbstractC854320XfK implements InterfaceC853800XeU {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "verify_password_for_unbind_phone";
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        LJIIIZ(EnumC854420XfU.PASSWORD);
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131829313);
        c1237010iIN.LJIIIZ = " ";
        c1237010iIN.LJIIJJI = "verify_enter_password_page";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LIZ = contextLIZ.getString(2131857404);
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new VerifyPasswordFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC853800XeU
    public final VerificationMethodType LIZJ() {
        return VerificationMethodType.PASSWORD;
    }

    public C853980Xem(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction) {
            VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction clickNextAction = (VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment = clickNextAction.getFragment();
            C854000Xeo c854000XeoMo158getParams = clickNextAction.mo158getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String str = c854000XeoMo158getParams.LIZ;
            Map<String, String> mapLJII = LJII();
            c0xz4.getClass();
            C0XZ4.LJJIZ(fragment, fragment, str, mapLJII).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, fragment, this, 13)).LJII(new AfS182S0100000_13(this, 102)).LJIILL();
            return;
        }
        super.LIZIZ(interfaceC853790XeT, c1237330iIt);
    }
}
