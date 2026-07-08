package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1BSX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BSX {
    public final Set<O> LIZ = new LinkedHashSet();
    public final /* synthetic */ C1BSW LIZIZ;

    public final void LIZ() {
        for (Object obj : this.LIZ) {
            this.LIZIZ.getClass();
            C2205271BSr c2205271BSr = (C2205271BSr) obj;
            c2205271BSr.getClass();
            try {
                c2205271BSr.LIZ.LJIILL();
                ((HashMap) this.LIZIZ.LIZIZ).remove(obj);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
        this.LIZ.clear();
    }

    public C1BSX(C1BSW c1bsw) {
        this.LIZIZ = c1bsw;
    }
}
