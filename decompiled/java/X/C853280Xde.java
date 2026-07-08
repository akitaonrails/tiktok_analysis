package X;

import Y.AfS108S0300000_13;
import Y.AfS182S0100000_13;
import Y.AfS64S0400000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C853280Xde implements InterfaceC1237070iIT {
    public final InterfaceC851850XbL LIZ;
    public final EnumC853370Xdn LIZIZ = EnumC853370Xdn.PASSPORT_TICKET;
    public final String LIZJ = "verify_email_code_for_bind";

    @Override // X.InterfaceC1237470iJ7
    public void LIZLLL() {
    }

    public boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = LIZ().getData();
        C852810Xct.LIZ.getClass();
        String strLJ = C852810Xct.LJ(data);
        boolean z = data.getInt("progress", -1) >= 0;
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131823013);
        c1237010iIN.LJIIIZ = contextLIZ.getString(2131833843, strLJ);
        c1237010iIN.LIZ = z ? contextLIZ.getString(2131857337) : " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new BindEmailCodeVerifyFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public void LJ() {
        if (Intrinsics.LJFF(LIZ().getData().getString("origin_enter_flow"), "verify_1p_email")) {
            C786410Ut5.LJJJI("enter_flow", "verify_1p_email", LIZ().getData());
        } else if (Intrinsics.LJFF(LIZ().getData().getString("origin_enter_flow"), "add_phone")) {
            C786410Ut5.LJJJI("enter_flow", "switch_to_email", LIZ().getData());
        }
    }

    @Override // X.InterfaceC1237470iJ7
    public InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public EnumC853370Xdn LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1237470iJ7
    public String getId() {
        return this.LIZJ;
    }

    public C853280Xde(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.InterfaceC1237470iJ7
    public void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        Map linkedHashMap;
        String strMT;
        InputCodeFragmentV2 inputCodeFragmentV2;
        Map linkedHashMap2;
        if (interfaceC853790XeT instanceof BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction) {
            c1237330iIt.LIZIZ(null, true);
            return;
        }
        String str = "";
        if (interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) {
            int i = C853390Xdp.LIZ[LIZJ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        linkedHashMap2 = new HashMap();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C854460XfY c854460XfY = C854460XfY.LIZ;
                    Bundle data = LIZ().getData();
                    c854460XfY.getClass();
                    linkedHashMap2 = new LinkedHashMap(C854460XfY.LJIIIIZZ(data));
                }
            } else {
                C854460XfY c854460XfY2 = C854460XfY.LIZ;
                InputCodeFragmentV2 fragment = ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT).getFragment();
                c854460XfY2.getClass();
                linkedHashMap2 = new LinkedHashMap(C854460XfY.LJIIJJI(fragment));
            }
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction clickResendEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) interfaceC853790XeT;
            InputCodeFragmentV2 fragment2 = clickResendEmailCodeAction.getFragment();
            InputCodeFragmentV2 fragment3 = clickResendEmailCodeAction.getFragment();
            if (LJI()) {
                str = clickResendEmailCodeAction.mo153getParams().LIZ;
            }
            C0XZ4.LJJIII(c0xz4, fragment2, fragment3, str, 8, "resend", linkedHashMap2, null, null, null, null, 960).LJIIIIZZ(new AfS108S0300000_13(c1237330iIt, this, interfaceC853790XeT, 6)).LJII(new AfS182S0100000_13(c1237330iIt, 80)).LJIILL();
            return;
        }
        if (!(interfaceC853790XeT instanceof InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction)) {
            return;
        }
        Bundle data2 = LIZ().getData();
        InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction verifyEmailCodeAction = (InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction) interfaceC853790XeT;
        C853090XdL c853090XdLMo153getParams = verifyEmailCodeAction.mo153getParams();
        int i2 = C853390Xdp.LIZ[LIZJ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    linkedHashMap = new HashMap();
                } else {
                    throw new C1954807lC();
                }
            } else {
                C854460XfY c854460XfY3 = C854460XfY.LIZ;
                Bundle data3 = LIZ().getData();
                c854460XfY3.getClass();
                linkedHashMap = new LinkedHashMap(C854460XfY.LJIIIIZZ(data3));
            }
        } else {
            C854460XfY c854460XfY4 = C854460XfY.LIZ;
            BaseAccountFlowFragment fragment4 = verifyEmailCodeAction.getFragment();
            c854460XfY4.getClass();
            linkedHashMap = new LinkedHashMap(C854460XfY.LJIIJJI(fragment4));
        }
        linkedHashMap.put("type", C2093608Ic.LIZIZ("8"));
        C0XZ4 c0xz42 = C0XZ4.LIZ;
        BaseAccountFlowFragment fragment5 = verifyEmailCodeAction.getFragment();
        BaseAccountFlowFragment fragment6 = verifyEmailCodeAction.getFragment();
        if (LJI()) {
            str = verifyEmailCodeAction.mo153getParams().LIZ;
        }
        String str2 = c853090XdLMo153getParams.LIZIZ;
        boolean z = data2.getBoolean("from_changePwd", false);
        String str3 = c853090XdLMo153getParams.LIZJ;
        BaseAccountFlowFragment fragment7 = verifyEmailCodeAction.getFragment();
        if (!(fragment7 instanceof InputCodeFragmentV2) || (inputCodeFragmentV2 = (InputCodeFragmentV2) fragment7) == null || (strMT = inputCodeFragmentV2.mT()) == null) {
            strMT = "user_click";
        }
        c0xz42.getClass();
        C0XZ4.LIZ(fragment5, fragment6, str, str2, z, str3, strMT, linkedHashMap).LJIIIIZZ(new AfS64S0400000_13(c853090XdLMo153getParams, data2, interfaceC853790XeT, c1237330iIt, 2)).LJII(new AfS182S0100000_13(c1237330iIt, 81)).LJIILL();
    }
}
