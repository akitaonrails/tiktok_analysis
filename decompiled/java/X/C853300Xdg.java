package X;

import Y.AfS108S0300000_13;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C853300Xdg extends AbstractC854320XfK {
    public final InterfaceC851850XbL LIZ;
    public final EnumC853370Xdn LIZIZ = EnumC853370Xdn.PASSPORT_TICKET;
    public final String LIZJ = "verify_phone_for_bind";

    public boolean LJIILLIIL() {
        return false;
    }

    public boolean LJIJ() {
        return true;
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = LIZ().getData();
        C852810Xct.LIZ.getClass();
        String string = data.getString("args_string_phone_number", "");
        boolean z = Intrinsics.LJFF(data.getString("page"), "twosv_setup") && !data.getBoolean("show_skip", false);
        boolean z2 = data.getInt("progress", -1) >= 0;
        String strK4 = z ? C786410Ut5.k4(Locale.US, contextLIZ.getString(2131857323), Arrays.copyOf(new Object[]{string}, 1)) : C786410Ut5.k4(Locale.US, contextLIZ.getString(2131829359), Arrays.copyOf(new Object[]{string}, 1));
        CharSequence charSequenceLIZ = strK4;
        if (data.getBoolean("show_edit_icon")) {
            charSequenceLIZ = C1239020iLc.LIZ(contextLIZ, strK4);
        }
        CharSequence charSequenceLIZLLL = charSequenceLIZ;
        if (C123100dR.LIZ(string)) {
            charSequenceLIZLLL = C1236880iIA.LIZLLL(charSequenceLIZ, new String[]{string}, 52);
        }
        return new C1237010iIN(z2 ? contextLIZ.getString(2131857337) : " ", null, false, contextLIZ.getString(2131829360), charSequenceLIZLLL, false, "", false, false, null, false, null, null, null, null, 67095806);
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new InputPhoneCodeFragment();
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public void LJ() {
        if (Intrinsics.LJFF(LIZ().getData().getString("origin_enter_flow"), "add_phone")) {
            C786410Ut5.LJJJI("enter_flow", "add_phone", LIZ().getData());
        }
    }

    public final Map<String, String> LJIILL() {
        int i = C853340Xdk.LIZ[LJIIZILJ().ordinal()];
        if (i == 1) {
            return LJII();
        }
        if (i != 2) {
            if (i == 3) {
                return C2097608Jq.LJ();
            }
            throw new C1954807lC();
        }
        C854460XfY c854460XfY = C854460XfY.LIZ;
        Bundle data = LIZ().getData();
        c854460XfY.getClass();
        return C854460XfY.LJIIIIZZ(data);
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public EnumC853370Xdn LJIIZILJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return this.LIZJ;
    }

    public C853300Xdg(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, final C1237330iIt c1237330iIt) {
        String string;
        Integer num = null;
        if (interfaceC853790XeT instanceof BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        if (interfaceC853790XeT instanceof InputPhoneFragment.InputPhoneActions.ClickChangePhoneAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        String str = "";
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) {
            InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction clickResendPhoneCodeAction = (InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction) interfaceC853790XeT;
            C853310Xdh c853310XdhMo153getParams = clickResendPhoneCodeAction.mo153getParams();
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            InputCodeFragmentV2 fragment = clickResendPhoneCodeAction.getFragment();
            InputCodeFragmentV2 fragment2 = clickResendPhoneCodeAction.getFragment();
            if (LJIJ()) {
                str = c853310XdhMo153getParams.LIZ;
            }
            EnumC852660Xce enumC852660XceSR = clickResendPhoneCodeAction.getFragment().SR();
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.INPUT_PHONE_BIND;
            if (LJIILLIIL()) {
                num = 8;
            }
            C0XZ4.LJJ(c0xz4, fragment, fragment2, str, enumC852660XceSR, enumC852910Xd3, "", "", "resend", "phone", clickResendPhoneCodeAction.getFragment().RR(), num, LJIILL(), 256).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, interfaceC853790XeT, this, 8)).LJII(new AfS182S0100000_13(c1237330iIt, 94)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction)) {
            return;
        }
        InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction verifyPhoneCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction) interfaceC853790XeT;
        final C853080XdK c853080XdKMo153getParams = verifyPhoneCodeAction.mo153getParams();
        final BaseAccountFlowFragment fragment3 = verifyPhoneCodeAction.getFragment();
        final Bundle data = LIZ().getData();
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        final boolean zLJJIIJZLJL = u.LJJIIJZLJL(fragment3.getEnterMethod(), "3p_bind", false);
        String string2 = data.getString("ticket", "");
        String string3 = data.getString("mUnusableMobileTicket", "");
        if (!LJIILLIIL() && ((true ^ LJII().isEmpty()) || C123100dR.LIZ(string2))) {
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            String str2 = c853080XdKMo153getParams.LIZ;
            EnumC852660Xce enumC852660XceSR2 = fragment3.SR();
            EnumC852910Xd3 enumC852910Xd32 = EnumC852910Xd3.PHONE_SMS_BIND;
            String str3 = c853080XdKMo153getParams.LIZIZ;
            Map<String, String> mapLJIILL = LJIILL();
            c0xz42.getClass();
            C0XZ4.LJFF(fragment3, fragment3, str2, enumC852660XceSR2, enumC852910Xd32, str3, string2, string3, mapLJIILL).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, fragment3, c853080XdKMo153getParams, 9)).LJII(new AfS149S0200000_13(c1237330iIt, fragment3, 20)).LJIILL();
            return;
        }
        C0XZ4 c0xz43 = C0XZ4.LIZ;
        if (LJIJ()) {
            str = c853080XdKMo153getParams.LIZ;
        }
        EnumC852660Xce enumC852660XceSR3 = fragment3.SR();
        EnumC852910Xd3 enumC852910Xd33 = EnumC852910Xd3.PHONE_SMS_BIND;
        String str4 = c853080XdKMo153getParams.LIZIZ;
        boolean z = LIZ().getData().getBoolean("from_changePwd");
        EnumC852660Xce enumC852660XceSR4 = fragment3.SR();
        if (enumC852660XceSR4 != EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_LOGIN && enumC852660XceSR4 != EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_SIGN_UP) {
            string = "email";
        } else {
            string = LIZ().getData().getString("platform");
        }
        String strRR = verifyPhoneCodeAction.getFragment().RR();
        Map<String, String> mapLJIILL2 = LJIILL();
        c0xz43.getClass();
        C0XZ4.LIZJ(fragment3, fragment3, str, enumC852660XceSR3, enumC852910Xd33, str4, z, string, strRR, mapLJIILL2).LJIIIIZZ(new C09JN() { // from class: X.0XbK
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str5;
                C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$5");
                C853660XeG c853660XeG = C853660XeG.LIZ;
                C853080XdK c853080XdK = c853080XdKMo153getParams;
                EnumC1237100iIW enumC1237100iIW = c853080XdK.LIZLLL;
                boolean z2 = c853080XdK.LIZJ;
                c853660XeG.getClass();
                C853660XeG.LJFF(enumC1237100iIW, z2);
                C853300Xdg c853300Xdg = this;
                C0XZG c0xzg = (C0XZG) ((C0XT7) obj).LJIIIZ;
                c853300Xdg.getClass();
                User userLIZJ = C0XQ5.LIZJ();
                if (c0xzg != null) {
                    C0XO4 c0xo4 = (C0XO4) ((HashMap) c0xzg.LJIIJ.LIZLLL).get("mobile");
                    if (c0xo4 != null) {
                        str5 = c0xo4.LLILLL;
                    } else {
                        str5 = "";
                    }
                    Bundle data2 = c853300Xdg.LIZ().getData();
                    if (data2 == null || !data2.getBoolean("is_mandatory_two_sv", false)) {
                        userLIZJ.setPhoneBinded(true);
                        userLIZJ.setBindPhone(str5);
                        if (c0xzg.LJIIJ.LIZ > 0) {
                            C0XQ5.LIZ().LJJLL(c0xzg.LJIIJ, null, false);
                        }
                    }
                    if (str5 != null) {
                        C0XQ5.LJIIJJI(7, 1, new C851860XbM(str5, C786410Ut5.J3(c0xzg.LJIIJ.LJJII)));
                    }
                }
                if (zLJJIIJZLJL || Intrinsics.LJFF(fragment3.LLIIJI(), "click_change")) {
                    data.putBoolean("show_3p_bind_phone_success_toast", true);
                }
                if (data.getBoolean("show_3p_bind_phone_success_toast", false)) {
                    int i = C2187451AjH.LIZ;
                    C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
                    c1233040iBy.LIZJ(contextLIZ.getString(2131850226));
                    c1233040iBy.LIZLLL();
                } else if (data.getBoolean("show_modify_phone_success_toast", false)) {
                    int i2 = C2187451AjH.LIZ;
                    C1233040iBy c1233040iBy2 = new C1233040iBy(contextLIZ);
                    c1233040iBy2.LIZJ(contextLIZ.getString(2131827404));
                    c1233040iBy2.LIZLLL();
                } else if (data.getBoolean("show_success_toast", true)) {
                    int i3 = C2187451AjH.LIZ;
                    C1233040iBy c1233040iBy3 = new C1233040iBy(contextLIZ);
                    c1233040iBy3.LIZJ(contextLIZ.getString(2131847647));
                    c1233040iBy3.LIZLLL();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("ocl_checkbox_checked", c853080XdKMo153getParams.LJ);
                InterfaceC853780XeS interfaceC853780XeS = c1237330iIt;
                if (interfaceC853780XeS != null) {
                    interfaceC853780XeS.LIZIZ(bundle, true);
                }
                C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$5");
            }
        }).LJII(new AfS182S0100000_13(c1237330iIt, 95)).LJIILL();
    }
}
