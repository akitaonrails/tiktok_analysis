package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514811Wo {
    public final void LIZ() {
        if (C19514711Wn.LJFF) {
            return;
        }
        synchronized (this) {
            try {
                if (!C19514711Wn.LJFF) {
                    IGetInterceptor iGetInterceptorLJ = PowerPermissionsTask.LJ();
                    if (iGetInterceptorLJ != null) {
                        List<AbstractC19515011Wq> interceptors = iGetInterceptorLJ.getInterceptors();
                        if (interceptors != null) {
                            Iterator<AbstractC19515011Wq> it2 = interceptors.iterator();
                            while (it2.hasNext()) {
                                C19514711Wn.LIZJ.add(it2.next());
                            }
                        }
                        List<AbstractC19515011Wq> listLIZ = iGetInterceptorLJ.LIZ();
                        if (listLIZ != null) {
                            Iterator<AbstractC19515011Wq> it3 = listLIZ.iterator();
                            while (it3.hasNext()) {
                                C19514711Wn.LIZLLL.add(it3.next());
                            }
                        }
                    }
                    C19514711Wn.LJFF = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C19514711Wn LIZIZ(Activity activity, Cert cert) {
        LIZ();
        C19514711Wn c19514711Wn = new C19514711Wn(activity, cert);
        Iterator<AbstractC19515011Wq> it2 = C19514711Wn.LIZJ.iterator();
        while (it2.hasNext()) {
            c19514711Wn.LIZ(new C19514911Wp(it2.next()));
        }
        return c19514711Wn;
    }
}
