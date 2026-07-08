package X;

import Y.AfS149S0200000_13;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationShowEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0XfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC854320XfK implements InterfaceC1237070iIT {
    @Override // X.InterfaceC1237470iJ7
    public void LIZLLL() {
    }

    @Override // X.InterfaceC1237470iJ7
    public void LJ() {
    }

    public static void LJIIL() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
        c1233040iBy.LIZJ(contextLIZ.getString(2131833859));
        c1233040iBy.LIZLLL();
    }

    public static void LJIILIIL() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
        c1233040iBy.LIZJ(contextLIZ.getString(2131857858));
        c1233040iBy.LIZLLL();
    }

    public static void LJIILJJIL() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
        c1233040iBy.LIZJ(contextLIZ.getString(2131839768));
        c1233040iBy.LIZLLL();
    }

    public final Map<String, String> LJII() {
        Map<String, String> mapLIZJ;
        String string = LIZ().getData().getString("passport_ticket");
        return (string == null || !C1533950q1J.LJ(string) || (mapLIZJ = C2097908Jt.LIZJ(new Pair("passport_ticket", string))) == null) ? C2097608Jq.LJ() : mapLIZJ;
    }

    public static int LJI(EnumC852660Xce enumC852660Xce) {
        int i = C852670Xcf.LIZ[enumC852660Xce.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return 6;
            }
            return 26;
        }
        return 25;
    }

    public final void LJIIIZ(EnumC854420XfU enumC854420XfU) {
        Bundle data = LIZ().getData();
        String string = data.getString("enter_from");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = data.getString("enter_method");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = data.getString("page");
        if (string3 != null) {
            str = string3;
        }
        IdentityVerificationShowEvent identityVerificationShowEvent = new IdentityVerificationShowEvent();
        identityVerificationShowEvent.LJI(string, "enter_from");
        identityVerificationShowEvent.LJI(string2, "enter_method");
        identityVerificationShowEvent.LJI(enumC854420XfU.getValue(), "verification_method");
        identityVerificationShowEvent.LJI(str, "page");
        identityVerificationShowEvent.LJIIIIZZ();
    }

    @Override // X.InterfaceC1237470iJ7
    public void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction) {
            LJIIJJI(((BaseAccountBindingsFlowFragment.BindingActions) interfaceC853790XeT).getFragment(), c1237330iIt);
            return;
        }
        if (interfaceC853790XeT instanceof BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction) {
            BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction clickEmailAction = (BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction) interfaceC853790XeT;
            LJIIJ(clickEmailAction.getFragment(), LJI(clickEmailAction.mo150getParams().LIZ), c1237330iIt);
        } else {
            if (!(interfaceC853790XeT instanceof BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction)) {
                return;
            }
            c1237330iIt.LIZIZ(null, true);
        }
    }

    public final void LJIIJJI(BaseAccountFlowFragment baseAccountFlowFragment, C1237330iIt c1237330iIt) {
        C853770XeR.LJ(C853770XeR.LIZ, baseAccountFlowFragment, "auto_system", null, LJII(), new AwS592S0100000_13(c1237330iIt, 58), new AwS420S0200000_19(this, c1237330iIt, 130), 4);
    }

    public final void LJIIIIZZ(boolean z, int i, EnumC854390XfR enumC854390XfR) {
        EnumC854440XfW enumC854440XfW;
        Bundle data = LIZ().getData();
        String string = data.getString("enter_from");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = data.getString("enter_method");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = data.getString("page");
        if (string3 != null) {
            str = string3;
        }
        IdentityVerificationResultEvent identityVerificationResultEvent = new IdentityVerificationResultEvent();
        identityVerificationResultEvent.LJI(string, "enter_from");
        identityVerificationResultEvent.LJI(string2, "enter_method");
        if (z) {
            enumC854440XfW = EnumC854440XfW.DIGITAL_1;
        } else {
            enumC854440XfW = EnumC854440XfW.DIGITAL_0;
        }
        identityVerificationResultEvent.LJI(Integer.valueOf(enumC854440XfW.getValue()), "is_success");
        identityVerificationResultEvent.LJI(enumC854390XfR.getValue(), "verification_method");
        identityVerificationResultEvent.LJI(str, "page");
        identityVerificationResultEvent.LJI(String.valueOf(i), "error_code");
        identityVerificationResultEvent.LJIIIIZZ();
    }

    public final void LJIIJ(BaseAccountFlowFragment baseAccountFlowFragment, int i, C1237330iIt c1237330iIt) {
        C0XZ4.LJJIII(C0XZ4.LIZ, baseAccountFlowFragment, baseAccountFlowFragment, "", i, "auto_system", LJII(), null, null, null, new AwS592S0100000_13(c1237330iIt, 57), 448).LJIIIIZZ(new AfS149S0200000_13(c1237330iIt, this, 15)).LJIILL();
    }
}
