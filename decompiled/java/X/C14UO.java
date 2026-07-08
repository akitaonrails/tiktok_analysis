package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.14UO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UO implements InterfaceC20273614Uk {
    public final WeakReference<Activity> LIZ;
    public final C14UF LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    public C14UO(WeakReference weakReference, C20272914Ud c20272914Ud) {
        this.LIZ = weakReference;
        this.LIZIZ = c20272914Ud;
    }

    @Override // X.InterfaceC20273614Uk
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
                List<C14UM> listSingletonList = Collections.singletonList(new C14UM(length, strValueOf, "video"));
                C14UF c14uf = this.LIZIZ;
                C14UE c14ue = new C14UE();
                c14ue.LIZ = listSingletonList;
                c14uf.LIZIZ(c14ue);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C14UF c14uf2 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("something wrong: ");
                sbLIZ.append(C13SZ.LIZIZ(e));
                c14uf2.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
