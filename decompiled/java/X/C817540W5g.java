package X;

import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.LauncherAssem;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817540W5g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LauncherAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C817540W5g(LauncherAssem launcherAssem) {
        super(0);
        this.LL = launcherAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Exception {
        LauncherAssem launcherAssem = this.LL;
        launcherAssem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(launcherAssem);
        if (c19egLIZ != null) {
            ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZJ(c19egLIZ);
            if (!c19egLIZ.isDestroyed() && Build.VERSION.SDK_INT <= 30) {
                C813040Vuw c813040VuwLJJLIIIJJIZ = ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJJIZ();
                launcherAssem.LL = c813040VuwLJJLIIIJJIZ;
                IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    ReceiverRegisterCrashOptimizer.doHWReceiverFix();
                }
                try {
                    if (ReceiverRegisterCrashOptimizer.doRegisterHandler() || ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                        ReceiverRegisterLancet.initHandler();
                        C838410Wul.LJI(c19egLIZ, c813040VuwLJJLIIIJJIZ, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
                    } else if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() == null || !ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                        C838410Wul.LJFF(c19egLIZ, c813040VuwLJJLIIIJJIZ, intentFilter, 2);
                    } else {
                        ReceiverRegisterLancet.initProxyHandler();
                        C838410Wul.LJI(c19egLIZ, c813040VuwLJJLIIIJJIZ, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        throw e;
                    }
                    ReceiverRegisterCrashOptimizer.registerReceiver(c813040VuwLJJLIIIJJIZ, intentFilter);
                }
                launcherAssem.LLILLL = true;
            }
            launcherAssem.LLILLJJLI = C2411309cd.LIZIZ.LIZ();
            if (c19egLIZ.getApplication() != null) {
                launcherAssem.LLILLJJLI.LIZ(c19egLIZ.getApplication());
            }
        }
        return Unit.LIZ;
    }
}
