package Y;

import X.C09JN;
import X.C0XZJ;
import X.C1238900iLQ;
import X.C1238920iLS;
import X.C1260440iuA;
import X.C1C7U;
import X.C850410XXr;
import X.C852810Xct;
import X.C853660XeG;
import X.EnumC1237100iIW;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AfS112S0300000_19 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS112S0300000_19 afS112S0300000_19, Object obj) {
        C0XZJ c0xzj;
        C1C7U.LIZ("SignupViewModel@1683.prioritize1PSMSInputSendMobileCode$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof C0XZJ) && (c0xzj = (C0XZJ) th) != null) {
            SignupViewModel signupViewModel = (SignupViewModel) afS112S0300000_19.l0;
            Function0 function0 = (Function0) afS112S0300000_19.l1;
            Function1 function1 = (Function1) afS112S0300000_19.l2;
            int i = C1238900iLQ.LLJILJILJ;
            C1238920iLS.LIZ(Integer.valueOf(c0xzj.getErrorCode()), signupViewModel.getEnterFrom(), signupViewModel.getEnterMethod(), signupViewModel.yQ2(), null, 96);
            int errorCode = c0xzj.getErrorCode();
            if (errorCode != 1002 && errorCode != 1003) {
                function1.invoke(c0xzj);
            } else {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("SignupViewModel@1683.prioritize1PSMSInputSendMobileCode$2");
    }

    public static final void accept$1(AfS112S0300000_19 afS112S0300000_19, Object obj) {
        C1C7U.LIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$3");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIW = ((InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1) ((InterfaceC853790XeT) afS112S0300000_19.l0)).mo152getParams().LIZJ;
        boolean z = ((InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1) ((InterfaceC853790XeT) afS112S0300000_19.l0)).mo152getParams().LIZIZ;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((InputCodeFragment.InputCodeActions) ((InterfaceC853790XeT) afS112S0300000_19.l0)).getFragment().RS(0, true);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle bundle = (Bundle) afS112S0300000_19.l1;
        c852810Xct.getClass();
        C852810Xct.LJIILLIIL(bundle, "");
        C852810Xct.LJIJI((Bundle) afS112S0300000_19.l1, "");
        C852810Xct.LJIJJ((Bundle) afS112S0300000_19.l1, ((C850410XXr) obj).LJIIIZ);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS112S0300000_19.l2;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$3");
    }

    public static final void accept$2(AfS112S0300000_19 afS112S0300000_19, Object obj) {
        C1C7U.LIZ("InvalidVideosClearHelper@8962.executeClear$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C1260440iuA c1260440iuA = (C1260440iuA) afS112S0300000_19.l0;
        ARunnableS88S0200000_19 aRunnableS88S0200000_19 = c1260440iuA.LIZIZ;
        if (aRunnableS88S0200000_19 != null) {
            c1260440iuA.LIZJ.removeCallbacks(aRunnableS88S0200000_19);
        }
        c1260440iuA.LIZIZ = null;
        ((C1260440iuA) afS112S0300000_19.l0).LIZLLL = false;
        if (baseResponse.status_code == 0) {
            ((Function0) afS112S0300000_19.l1).invoke();
        } else {
            ((Function0) afS112S0300000_19.l2).invoke();
        }
        C1C7U.LIZIZ("InvalidVideosClearHelper@8962.executeClear$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS112S0300000_19(Object obj, SignupViewModel signupViewModel, Function0<Unit> function0, Function1<? super C0XZJ, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = signupViewModel;
        this.l2 = function0;
    }
}
