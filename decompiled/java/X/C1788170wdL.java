package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0wdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788170wdL implements Application.ActivityLifecycleCallbacks {
    public C1787830wcn LL;
    public final /* synthetic */ C1788160wdK LLILLJJLI;

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
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C1788170wdL(C1788160wdK c1788160wdK) {
        this.LLILLJJLI = c1788160wdK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        InterfaceC1786480wac interfaceC1786480wacLJ = this.LLILLJJLI.LIZIZ.LJ();
        C1788180wdM c1788180wdM = C1788180wdM.LIZJ;
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(activity, this.LLILLJJLI, this, 43);
        c1788180wdM.getClass();
        interfaceC1786480wacLJ.LIZ(new C1786590wan(c1788180wdM, awS236S0300000_27));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        InterfaceC1786480wac interfaceC1786480wacLJ = this.LLILLJJLI.LIZIZ.LJ();
        C1788180wdM c1788180wdM = C1788180wdM.LIZJ;
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(activity, this.LLILLJJLI, this, 44);
        c1788180wdM.getClass();
        interfaceC1786480wacLJ.LIZ(new C1786590wan(c1788180wdM, awS236S0300000_27));
    }
}
