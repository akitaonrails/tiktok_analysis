package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DRK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRK {
    public static final void LIZ(C19EG c19eg, final Function0 function0) {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (!iAccountService.LJIIJ().isLogin()) {
            ILoginService iLoginServiceLIZJ = iAccountService.LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = c19eg;
            c0xqs.LJ = new C0XTR() { // from class: X.0DRL
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                    if (i == 1 && i2 == 1) {
                        function0.invoke();
                    }
                }
            };
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
            return;
        }
        function0.invoke();
    }
}
