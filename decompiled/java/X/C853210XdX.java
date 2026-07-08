package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C853210XdX extends AbstractC854320XfK {
    public final InterfaceC851850XbL LIZ;

    public boolean LJIILL() {
        return true;
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return "input_email_for_bind";
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = LIZ().getData();
        boolean z = data.getBoolean("show_skip");
        String string = data.getString("enter_method");
        if (string == null) {
            string = "";
        }
        boolean z2 = Intrinsics.LJFF(string, "3p_bind_login") || Intrinsics.LJFF(string, "3p_bind_signup");
        boolean z3 = data.getInt("progress", -1) >= 0;
        boolean z4 = data.getBoolean("is_changing");
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString((z4 || Intrinsics.LJFF(data.getString("enter_flow"), "verify_1p_email")) ? 2131823028 : 2131823026);
        c1237010iIN.LJIIIZ = null;
        c1237010iIN.LIZ = z3 ? contextLIZ.getString(2131857337) : " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJIIJ = true;
        if (z2) {
            c1237010iIN.LIZIZ = "";
            c1237010iIN.LJFF = false;
        } else if (z) {
            if (z3) {
                String string2 = contextLIZ.getString(2131857334);
                c1237010iIN.LIZLLL = string2 != null ? string2 : "";
                c1237010iIN.LJFF = false;
            } else {
                c1237010iIN.LIZIZ = contextLIZ.getString(2131857423);
            }
        } else if (z3) {
            c1237010iIN.LJI = true;
        }
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new BindEmailFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public C853210XdX(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        Map mapLJ;
        if (interfaceC853790XeT instanceof CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction clickSendCodeAction = (CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction) interfaceC853790XeT;
            BaseAccountFlowFragment fragment = clickSendCodeAction.getFragment();
            BaseAccountFlowFragment fragment2 = clickSendCodeAction.getFragment();
            String str = clickSendCodeAction.mo151getParams().LIZ;
            if (LJIILL()) {
                C854460XfY c854460XfY = C854460XfY.LIZ;
                Bundle data = LIZ().getData();
                c854460XfY.getClass();
                mapLJ = C854460XfY.LJIIIIZZ(data);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            C0XZ4.LJJIII(c0xz4, fragment, fragment2, str, 8, "user_click", mapLJ, null, null, null, null, 960).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, interfaceC853790XeT, this, 3)).LJII(new AfS182S0100000_13(c1237330iIt, 75)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof CommonInputEmailFragment.InputEmailActions.ClickChangeToPhoneAction)) {
            return;
        }
        c1237330iIt.LIZIZ(null, true);
    }
}
