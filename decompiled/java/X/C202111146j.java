package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.146j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202111146j {
    public static volatile CopyOnWriteArrayList<InterfaceC202113146l> LIZ = new CopyOnWriteArrayList<>();
    public static final Object LIZIZ = new Object();
    public static final C202112146k LIZJ = new InterfaceC202113146l() { // from class: X.146k
        @Override // X.InterfaceC202113146l
        public final void LIZ(String str) {
            Iterator<InterfaceC202113146l> it2 = C202111146j.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(str);
            }
        }

        @Override // X.InterfaceC202113146l
        public final void LIZIZ(String str) {
            Iterator<InterfaceC202113146l> it2 = C202111146j.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(str);
            }
        }
    };

    public static final void LIZ(InterfaceC202113146l interfaceC202113146l) {
        synchronized (LIZIZ) {
            try {
                if (LIZ.contains(interfaceC202113146l)) {
                    return;
                }
                LIZ.add(interfaceC202113146l);
                C1C7V.LIZLLL = true;
                C1C7V.LJ = LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addInterceptor, interceptor is: ");
                sbLIZ.append(interfaceC202113146l);
                sbLIZ.append(", size is ");
                sbLIZ.append(LIZ.size());
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZIZ(InterfaceC202113146l interfaceC202113146l) {
        synchronized (LIZIZ) {
            try {
                LIZ.remove(interfaceC202113146l);
                if (LIZ.isEmpty()) {
                    C1C7V.LIZLLL = false;
                    C1C7V.LJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
