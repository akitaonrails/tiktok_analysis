package X;

import Y.AfS108S0300000_13;
import Y.AfS149S0200000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xe8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853580Xe8 extends AbstractC854320XfK {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "enter_phone_for_bind";
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = this.LIZ.getData();
        boolean z = data.getInt("progress", -1) >= 0;
        boolean z2 = data.getBoolean("show_skip");
        boolean z3 = !data.getBoolean("is_changing");
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = z ? contextLIZ.getString(2131857337) : " ";
        c1237010iIN.LJIIIIZZ = (!z3 || Intrinsics.LJFF(data.getString("enter_flow"), "verify_1p_phone")) ? contextLIZ.getString(2131823029) : contextLIZ.getString(2131823027);
        c1237010iIN.LJIIIZ = null;
        c1237010iIN.LJIIJJI = "";
        c1237010iIN.LJIIL = false;
        if (z2) {
            if (z) {
                c1237010iIN.LIZLLL = contextLIZ.getString(2131857334);
                c1237010iIN.LJFF = false;
            } else {
                c1237010iIN.LIZIZ = contextLIZ.getString(2131857423);
                c1237010iIN.LIZJ = EnumC638250P1r.PRIMARY;
            }
        } else if (z) {
            c1237010iIN.LJI = true;
        }
        c1237010iIN.LJIIJ = false;
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new InputPhoneFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public C853580Xe8(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        Integer num = null;
        if (interfaceC853790XeT instanceof InputPhoneFragment.InputPhoneActions.ClickSendCodeAction) {
            InputPhoneFragment.InputPhoneActions.ClickSendCodeAction clickSendCodeAction = (InputPhoneFragment.InputPhoneActions.ClickSendCodeAction) interfaceC853790XeT;
            C853570Xe7 c853570Xe7Mo154getParams = clickSendCodeAction.mo154getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            BaseAccountFlowFragment fragment = clickSendCodeAction.getFragment();
            BaseAccountFlowFragment fragment2 = clickSendCodeAction.getFragment();
            String str = c853570Xe7Mo154getParams.LIZ;
            EnumC852660Xce enumC852660Xce = c853570Xe7Mo154getParams.LIZIZ;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.INPUT_PHONE_BIND;
            if (Intrinsics.LJFF(this.LIZ.getData().getString("page"), "failed_3p_login")) {
                num = 8;
            }
            C0XZ4.LJJ(c0xz4, fragment, fragment2, str, enumC852660Xce, enumC852910Xd3, "", "", "user_click", "phone", c853570Xe7Mo154getParams.LIZJ, num, new LinkedHashMap(LJII()), 256).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, c853570Xe7Mo154getParams, this, 7)).LJII(new AfS149S0200000_13(this, c1237330iIt, 19)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof InputPhoneFragment.InputPhoneActions.ClickChangeToEmailAction)) {
            return;
        }
        c1237330iIt.LIZIZ(null, true);
    }
}
