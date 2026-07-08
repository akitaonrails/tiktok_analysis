package X;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: X.139x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199655139x implements InterfaceC199653139v {
    public final Application LIZ;
    public final InterfaceC199652139u LIZIZ;
    public final C199654139w LIZJ = new AbstractC199656139y() { // from class: X.139w
        @Override // X.AbstractC199656139y, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(activity.getClass().getName());
            sbLIZ.append(" received Activity#onDestroy()");
            ((C199657139z) this.LL.LIZIZ).LIZ(activity, C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    @Override // X.InterfaceC199653139v
    public final void LIZ() {
        this.LIZ.registerActivityLifecycleCallbacks(this.LIZJ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.139w] */
    public C199655139x(Application application, C199657139z c199657139z) {
        this.LIZ = application;
        this.LIZIZ = c199657139z;
    }
}
