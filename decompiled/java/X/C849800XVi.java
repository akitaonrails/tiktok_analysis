package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.UgCommonResponse;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IAttributionService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS257S0300000_13;

/* JADX INFO: renamed from: X.0XVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849800XVi {
    public static final C849800XVi LIZ = new C849800XVi();

    public static final void LIZJ(C0XVR c0xvr) {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ)), null, null, new C0NPE(c0xvr, null), 3);
    }

    public static final void LIZ(Bundle bundle, Function1<? super C15O7<Bundle>, Unit> function1) {
        AbstractC19484711Kz<UgCommonResponse> abstractC19484711KzLIZ;
        AwS257S0300000_13 awS257S0300000_13 = new AwS257S0300000_13((List) new ArrayList(), (List<C0XQN>) function1, (Function1<? super C15O7<Bundle>, Unit>) bundle, (Bundle) 7);
        LIZ.getClass();
        if (TwoStepAuthApi.LJI() && !TextUtils.isEmpty(TwoStepAuthApi.LIZJ)) {
            Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", false);
            TwoStepAuthApi.LIZ(TwoStepAuthApi.LIZJ, null, 6);
            TwoStepAuthApi.LIZJ = null;
        }
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
            C19260310Wr c19260310WrLIZIZ = C19259610Wk.LIZ.LIZIZ();
            IAttributionService iAttributionService = (IAttributionService) PluggableExtentionKt.pluggableSpi$default(IAttributionService.class, false, false, false, 14, null);
            C11NJ c11nj = new C11NJ();
            if (iAttributionService != null && (abstractC19484711KzLIZ = iAttributionService.LIZ(c19260310WrLIZIZ, true)) != null) {
                c11nj.LIZ(abstractC19484711KzLIZ.LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new C516201zk(c11nj, 336), new C516201zk(c11nj, 337)));
            }
            C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "UpdateAttributionHook", "login");
            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
            if (iCredentialManagerService.LIZJ()) {
                iCredentialManagerService.LJIILLIIL(false);
            }
        }
        C0XQ6.LIZ.getClass();
        C15O7.LIZJ(C0VP5.LL).LJI(new C854740Xg0(bundle, 7)).LJ(new C854740Xg0(awS257S0300000_13, 8), C15O7.LJIIIIZZ, null);
    }

    public static final void LIZIZ(C0XVI c0xvi, AfterLoginHook afterLoginHook) {
        CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
        C0XV8.LIZIZ();
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ)), null, null, new C0NPN(afterLoginHook, c0xvi, null), 3);
    }
}
