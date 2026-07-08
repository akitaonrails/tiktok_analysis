package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: renamed from: X.1ARX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARX implements C1ARM, C18ZN {
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(615));

    @Override // X.C18ZN
    public final void onAppBackground() {
        ((C1ARU) this.LL.getValue()).LIZIZ(AFwS279S0000000_33.get$arr$(393));
    }

    @Override // X.C18ZN
    public final void onAppForeground() {
        ((C1ARU) this.LL.getValue()).LIZIZ(AFwS279S0000000_33.get$arr$(394));
    }

    @Override // X.C1ARM
    public final void pullAppToForeground() {
        boolean z = C2214201BlK.LJIIJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullAppToForeground: isAppBackground(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(contextLIZ, "activity");
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
                return;
            }
            Intent launchIntentForPackage = contextLIZ.getPackageManager().getLaunchIntentForPackage(contextLIZ.getPackageName());
            if (launchIntentForPackage != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, launchIntentForPackage, "Context_startActivity_1");
                C1701330uNH.LIZ(launchIntentForPackage, contextLIZ);
                C2204961BRm.LJJJJJL(contextLIZ, launchIntentForPackage, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNAT/JH95jhPpR6Bvq4K3d1xS8ACA==", null));
            }
        }
    }

    public C1ARX() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.C1ARM
    public final boolean isAppBackground() {
        return ActivityStack.isAppBackGround();
    }

    @Override // X.C1ARM
    public final void addAppVisibilityChangeListener(C1ARY c1ary) {
        ((C1ARU) this.LL.getValue()).LIZ(c1ary);
    }

    @Override // X.C1ARM
    public final void removeAppVisibilityChangeListener(C1ARY c1ary) {
        ((C1ARU) this.LL.getValue()).LIZ.remove(c1ary);
    }
}
