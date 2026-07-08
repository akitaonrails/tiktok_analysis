package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0W0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816290W0l implements Application.ActivityLifecycleCallbacks {
    public static long LLILLJJLI;
    public static Intent LLILLL;
    public static String LLILZ;
    public static final C816290W0l LL = new C816290W0l();
    public static final C01GW LLILZIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(371));

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (System.currentTimeMillis() - LLILLJJLI < 120000 && LLILLL != null && !TextUtils.isEmpty(LLILZ)) {
            C01GW c01gw = LLILZIL;
            if (!((Keva) c01gw.getValue()).contains(LLILZ)) {
                ((Keva) c01gw.getValue()).storeLong(LLILZ, System.currentTimeMillis());
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                Intent intent = LLILLL;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, contextLIZ);
                C2204961BRm.LJJJJJL(contextLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1rRolYszAemCplyRBIESIa/NT+bPLWtCWX8I", null));
                LLILLL = null;
                LLILZ = "";
            }
        }
    }
}
