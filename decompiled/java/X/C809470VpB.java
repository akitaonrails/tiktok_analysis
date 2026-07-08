package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809470VpB extends AbstractC809480VpC {
    public static C809470VpB LIZJ;

    public C809470VpB(Context context) {
        C809360Vp0.LIZ((Application) C786410Ut5.N3(context));
    }

    public static C809470VpB LJIIIIZZ(Context context) {
        if (LIZJ == null) {
            synchronized (C809470VpB.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C809470VpB(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC808910VoH LJII(int i) {
        InterfaceC809530VpH interfaceC809530VpH = (InterfaceC809530VpH) ((AbstractC809510VpF) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJ(new Object[0]);
        if (interfaceC809530VpH == null) {
            return null;
        }
        return interfaceC809530VpH.LIZIZ();
    }
}
