package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.14UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UJ implements InterfaceC20273614Uk {
    public final WeakReference<Activity> LIZ;
    public final C14UF LIZIZ;

    public C14UJ(WeakReference weakReference, C20272914Ud c20272914Ud) {
        this.LIZ = weakReference;
        this.LIZIZ = c20272914Ud;
    }

    @Override // X.InterfaceC20273614Uk
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 700) {
            if (i2 != 0 && intent != null) {
                Activity activity = this.LIZ.get();
                if (activity == null) {
                    this.LIZIZ.LIZ(0, "Activity not found");
                    return;
                }
                Uri data = intent.getData();
                if (data != null && !C2093608Ic.LJ(data.toString())) {
                    List<C14UM> listSingletonList = Collections.singletonList(new C14UM(C2400409as.LJII(activity, data), data.toString(), "video"));
                    C14UF c14uf = this.LIZIZ;
                    C14UE c14ue = new C14UE();
                    c14ue.LIZ = listSingletonList;
                    c14uf.LIZIZ(c14ue);
                    return;
                }
                this.LIZIZ.LIZ(0, "Video doesn't exist");
                return;
            }
            this.LIZIZ.LIZ(-7, "User cancelled");
        }
    }
}
