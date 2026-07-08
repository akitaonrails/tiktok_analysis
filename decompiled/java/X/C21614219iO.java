package X;

import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19iO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21614219iO {
    public static volatile C21614219iO LIZIZ;
    public final C830490Whz LIZ = new C830490Whz();

    public static C21614219iO LIZ() {
        if (LIZIZ == null) {
            synchronized (C21614219iO.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C21614219iO();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(int i, AuthResult authResult, String str) {
        synchronized (this.LIZ) {
            try {
                List list = (List) this.LIZ.get(new C0WIY(str, Integer.valueOf(i)));
                if (list != null && authResult != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC21614319iP) it2.next()).LLLLJ(authResult);
                    }
                    list.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
