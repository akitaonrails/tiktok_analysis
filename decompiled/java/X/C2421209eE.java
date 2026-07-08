package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.09eE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421209eE {
    public static final /* synthetic */ int LIZ = 0;

    public static Activity LIZ() {
        try {
            C089E c089e = new C089E(ActivityStack.getActivityStack());
            while (c089e.hasNext()) {
                Activity activity = (Activity) c089e.next();
                if (activity instanceof InterfaceC1603190roz) {
                    return activity;
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }

    public static Intent LIZIZ(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        return intent;
    }
}
