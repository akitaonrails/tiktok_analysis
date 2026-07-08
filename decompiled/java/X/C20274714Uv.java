package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.14Uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20274714Uv implements C14VQ {
    public final WeakReference<Activity> LIZ;
    public final C14VG LIZIZ;

    public C20274714Uv(WeakReference weakReference, C14V1 c14v1) {
        this.LIZ = weakReference;
        this.LIZIZ = c14v1;
    }

    @Override // X.C14VQ
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
                    List<C14V5> listSingletonList = Collections.singletonList(new C14V5(C2400409as.LJII(activity, data), data.toString(), "video"));
                    C14VG c14vg = this.LIZIZ;
                    C14V6 c14v6 = new C14V6();
                    c14v6.LIZ = listSingletonList;
                    c14vg.LIZIZ(c14v6);
                    return;
                }
                this.LIZIZ.LIZ(0, "Video doesn't exist");
                return;
            }
            this.LIZIZ.LIZ(-7, "User cancelled");
        }
    }
}
