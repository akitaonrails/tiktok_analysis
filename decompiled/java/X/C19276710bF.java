package X;

import Y.ACallableS431S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IHomeTabService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.10bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19276710bF {
    public static boolean LIZ;

    public static void LIZLLL() {
        boolean zLJI = MethodIDManager.LJI(137727);
        ((ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class)).LIZIZ(1);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJFF() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF.isLogin()) {
            AppLog.setUserId(CastLongProtector.parseLong(iAccountUserServiceLJFF.getCurUserId()));
            AppLog.setSessionKey(iAccountUserServiceLJFF.LJIIZILJ());
        }
    }

    public static void LJI() {
        InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4();
        if (interfaceC20318714evB4 == null || interfaceC20318714evB4.LJI() == null) {
            return;
        }
        C0CPK c0cpkLJI = interfaceC20318714evB4.LJI();
        C844470XAv.LIZ.getClass();
        c0cpkLJI.LIZ(C844470XAv.LIZ());
    }

    public static C15O7<Bundle> LIZ(Bundle bundle) {
        if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            return C15O7.LJIIJ(bundle);
        }
        ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
        C584470Mw9.LJ("login");
        C2487409ou.LIZLLL(6000L, C584470Mw9.LJIILLIIL);
        return C15O7.LIZIZ(new ACallableS431S0100000_28(bundle, 26), executorC2206508kh, null);
    }

    public static void LJ(Bundle bundle) {
        C844470XAv.LIZ.getClass();
        Intent intentLIZIZ = C2421209eE.LIZIZ(C844470XAv.LIZ());
        intentLIZIZ.putExtras(bundle);
        intentLIZIZ.setFlags(268468224);
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLJFF, intentLIZIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZIZ, activityLJFF);
            C2204961BRm.LJIILLIIL(activityLJFF, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJbAkh6in7RnjaI3vDI=", null));
            if (!activityLJFF.isFinishing()) {
                activityLJFF.finishAndRemoveTask();
                return;
            }
            return;
        }
        if (C844470XAv.LIZ() == null) {
            return;
        }
        Context contextLIZ = C844470XAv.LIZ();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intentLIZIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZIZ, contextLIZ);
        C2204961BRm.LJJJJJL(contextLIZ, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJbAkh6in7RnjaI3vDI=", null));
    }

    public static C15O7<Bundle> LIZJ(Bundle bundle, boolean z) {
        Executor executor;
        IHomeTabService iHomeTabService = (IHomeTabService) PluggableExtentionKt.pluggableSpi(IHomeTabService.class);
        if (iHomeTabService != null) {
            iHomeTabService.LJII();
        }
        if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            return C15O7.LJIIJ(bundle);
        }
        LIZ = true;
        ACallableS431S0100000_28 aCallableS431S0100000_28 = new ACallableS431S0100000_28(bundle, 27);
        if (z) {
            executor = C15O7.LJI;
        } else {
            executor = C15O7.LJIIIIZZ;
        }
        return C15O7.LIZIZ(aCallableS431S0100000_28, executor, null);
    }

    public static C15O7<Bundle> LIZIZ(Bundle bundle, C0XVP c0xvp, C0XVR c0xvr) {
        IHomeTabService iHomeTabService = (IHomeTabService) PluggableExtentionKt.pluggableSpi(IHomeTabService.class);
        if (iHomeTabService != null) {
            iHomeTabService.LJII();
        }
        C20647815qu.LIZ.getClass();
        if (C282000B3m.LIZ()) {
            C20571715ed.LIZ.getClass();
            C20648315qz.LIZ.getClass();
            C20648315qz.LJII = true;
        }
        if (C293980Bfg.LIZ() && c0xvr != null && c0xvr.LJ) {
            return C15O7.LJIIJ(bundle);
        }
        if (c0xvp != null && c0xvp.LIZ) {
            return C15O7.LJIIJ(bundle);
        }
        return C15O7.LIZ(new ACallableS431S0100000_28(bundle, 28));
    }
}
