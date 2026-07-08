package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.14Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20274614Uu implements C14VQ {
    public final WeakReference<Activity> LIZ;
    public final C14VG LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    public C20274614Uu(WeakReference weakReference, C14V1 c14v1) {
        this.LIZ = weakReference;
        this.LIZIZ = c14v1;
    }

    @Override // X.C14VQ
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        long length;
        if (i == 800) {
            try {
                if (i2 == 0) {
                    this.LIZIZ.LIZ(-7, "Failed to capture video");
                    return;
                }
                Activity activity = this.LIZ.get();
                if (activity == null) {
                    this.LIZIZ.LIZ(0, "Activity not found");
                    return;
                }
                if (intent == null) {
                    data = null;
                } else {
                    data = intent.getData();
                }
                String strValueOf = this.LIZLLL;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(data);
                }
                if (data != null) {
                    length = C2400409as.LJII(activity, data);
                } else {
                    length = new C0VSJ(this.LIZLLL).length();
                }
                if (length == 0) {
                    this.LIZIZ.LIZ(0, "Video doesn't exist");
                    return;
                }
                List<C14V5> listSingletonList = Collections.singletonList(new C14V5(length, strValueOf, "video"));
                C14VG c14vg = this.LIZIZ;
                C14V6 c14v6 = new C14V6();
                c14v6.LIZ = listSingletonList;
                c14vg.LIZIZ(c14v6);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C14VG c14vg2 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("something wrong: ");
                sbLIZ.append(C13SZ.LIZIZ(e));
                c14vg2.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
