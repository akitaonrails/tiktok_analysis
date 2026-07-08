package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;

/* JADX INFO: renamed from: X.0WVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824410WVr {
    public static final C824410WVr LIZ = new C824410WVr();

    public static final boolean LIZ(Context context, String str, boolean z) {
        boolean z2 = false;
        if (context != null && str != null) {
            if (C824430WVt.LIZ().length == 0) {
                SmartRouter.buildRoute(context, str).open();
                return true;
            }
            try {
                String strLIZJ = C824430WVt.LIZJ(str, z);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(strLIZJ));
                ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                if (iSandboxServiceLIZ != null) {
                    iSandboxServiceLIZ.appendDataFlowId(intent, 1207969297);
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG7GANrqhPBdJ0hLRXhP6/IIdUMI+xiY61eZFiMZG2MzbYC12zRDicWSfKQw=", null));
                z2 = true;
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z2;
    }
}
