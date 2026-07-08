package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309240kAs {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(2));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(3));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(16));
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final C01GW LJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(17));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0kAz] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0kAy] */
    static {
        if (C1307940k8m.LIZJ().isReady()) {
            return;
        }
        LIZIZ();
        C1307940k8m.LIZJ().LJ(new InterfaceC212352188g() { // from class: X.0kAz
            @Override // X.InterfaceC212352188g
            public final void LIZ(boolean z) {
                C01GW c01gw = C1309240kAs.LIZ;
            }
        });
        C1307940k8m.LIZJ().LIZIZ(new InterfaceC212352188g() { // from class: X.0kAy
            @Override // X.InterfaceC212352188g
            public final void LIZ(boolean z) {
                if (z) {
                    C01GW c01gw = C1309240kAs.LIZ;
                    while (true) {
                        C01GW c01gw2 = C1309240kAs.LIZ;
                        if (!((ConcurrentLinkedQueue) c01gw2.getValue()).isEmpty()) {
                            String str = (String) ((ConcurrentLinkedQueue) c01gw2.getValue()).poll();
                            if (str != null) {
                                C1309240kAs.LIZLLL(str);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        });
    }

    public static void LIZIZ() {
        if (((Boolean) C1309360kB4.LJIIIIZZ.getValue()).booleanValue() || C1307940k8m.LIZJ().isReady()) {
            return;
        }
        LJ.getValue();
    }

    public static String LIZ(String str) {
        if (!C1307940k8m.LIZJ().isReady()) {
            return "Pitaya is not ready";
        }
        C1309260kAu c1309260kAu = (C1309260kAu) ((ConcurrentHashMap) LIZJ.getValue()).get(str);
        if (c1309260kAu != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" download error, code:");
            sbLIZ.append(c1309260kAu.LIZ);
            sbLIZ.append(",subCode:");
            sbLIZ.append(c1309260kAu.LIZIZ);
            sbLIZ.append(",summary:");
            sbLIZ.append(c1309260kAu.LIZJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        if (!C1307940k8m.LIZJ().isReady()) {
            return false;
        }
        if (((ConcurrentHashMap) LIZIZ.getValue()).get(str) != null) {
            return true;
        }
        LIZLLL(str);
        return false;
    }

    public static void LIZLLL(String str) {
        if (!C1307940k8m.LIZJ().isReady()) {
            C01GW c01gw = LIZ;
            if (!((ConcurrentLinkedQueue) c01gw.getValue()).contains(str)) {
                ((ConcurrentLinkedQueue) c01gw.getValue()).offer(str);
                return;
            }
            return;
        }
        if (((ConcurrentHashMap) LIZIZ.getValue()).containsKey(str)) {
            return;
        }
        C1307940k8m.LIZJ().LIZLLL(str, new C1309250kAt(str));
    }
}
