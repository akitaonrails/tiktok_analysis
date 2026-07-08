package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0W4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817330W4l {
    public static void LIZ(Context context, InterfaceC1032120cxu interfaceC1032120cxu) {
        Object c098200Yq;
        if (context == null || interfaceC1032120cxu == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) RewardAdActivity.class);
        if (C1388190mED.LIZ(context) == null) {
            intent.addFlags(268435456);
        }
        C1032880cz8.LIZ.put(RewardAdActivity.class, interfaceC1032120cxu);
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPihYJeAzjfIw+PekHGY7c0zuTYaYF5S4Pi0J5/ODmg=", null));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startActivity() failed , cause ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
