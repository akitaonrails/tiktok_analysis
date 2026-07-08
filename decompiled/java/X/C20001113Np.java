package X;

import Y.ARunnableS99S0200000_30;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import w1p.a;

/* JADX INFO: renamed from: X.13Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20001113Np {
    public static final C01GW<C741240T5u> LJIIJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(328));
    public final int LIZ;
    public final InterfaceExecutorC740550T3d LIZIZ;
    public final Map<String, AbstractC20001513Nt> LIZJ = new LinkedHashMap();
    public final ConcurrentHashMap<String, InterfaceC20001313Nr> LIZLLL = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<InterfaceC20001313Nr> LJ = new CopyOnWriteArrayList<>();
    public final PriorityBlockingQueue<InterfaceC20001313Nr> LJFF = new PriorityBlockingQueue<>(20, new Comparator<InterfaceC20001313Nr>() { // from class: X.13Nq
        @Override // java.util.Comparator
        public final int compare(InterfaceC20001313Nr interfaceC20001313Nr, InterfaceC20001313Nr interfaceC20001313Nr2) {
            return (int) (interfaceC20001313Nr2.getModifyTime() - interfaceC20001313Nr.getModifyTime());
        }
    });
    public final CopyOnWriteArrayList<InterfaceC20001313Nr> LJI = new CopyOnWriteArrayList<>();
    public final C2278408wI LJII = new C2278408wI();
    public final C563400M7u LJIIIIZZ = new C563400M7u(0);
    public final ConcurrentHashMap<String, InterfaceC20001313Nr> LJIIIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str) {
        InterfaceC20001313Nr interfaceC20001313Nr = this.LIZLLL.get(str);
        if (interfaceC20001313Nr != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Cancel][TaskManager][ExecutingList][");
            sbLIZ.append(str);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LJ("JKL", strLIZIZ);
            interfaceC20001313Nr.cancel();
            return;
        }
        InterfaceC20001313Nr interfaceC20001313Nr2 = this.LJIIIZ.get(str);
        if (interfaceC20001313Nr2 != null) {
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Cancel][TaskManager][PausingList][");
            sbLIZ2.append(str);
            sbLIZ2.append(']');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LJ("JKL", strLIZIZ2);
            interfaceC20001313Nr2.cancel();
            this.LJIIIZ.remove(str);
            return;
        }
        if (!C0C0N.LIZ() && !a.LIZ().taskManagerQueueOptBugfixEnabled) {
            for (InterfaceC20001313Nr interfaceC20001313Nr3 : this.LJ) {
                if (Intrinsics.LJFF(interfaceC20001313Nr3.getId(), str)) {
                    C13SS c13ss3 = C13SS.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Cancel][TaskManager][WaitingList][");
                    sbLIZ3.append(str);
                    sbLIZ3.append(']');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    c13ss3.getClass();
                    C13SS.LIZ("JKL", strLIZIZ3);
                    interfaceC20001313Nr3.cancel();
                    this.LJ.remove(interfaceC20001313Nr3);
                    return;
                }
            }
            return;
        }
        for (InterfaceC20001313Nr interfaceC20001313Nr4 : this.LJFF) {
            if (Intrinsics.LJFF(interfaceC20001313Nr4.getId(), str)) {
                C13SS c13ss4 = C13SS.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[Cancel][TaskManager][WaitingList][");
                sbLIZ4.append(str);
                sbLIZ4.append(']');
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                c13ss4.getClass();
                C13SS.LIZ("JKL", strLIZIZ4);
                interfaceC20001313Nr4.cancel();
                this.LJFF.remove(interfaceC20001313Nr4);
                return;
            }
        }
    }

    public final void LIZIZ(InterfaceC20001313Nr interfaceC20001313Nr) {
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((AbstractC20001513Nt) it2.next()).LIZ()) {
                z = true;
            }
        }
        if (interfaceC20001313Nr instanceof AbstractC20000013Ne) {
            ((AbstractC20000013Ne) interfaceC20001313Nr).onPreExecute();
        }
        if (!z) {
            this.LIZIZ.execute(new ARunnableS99S0200000_30(interfaceC20001313Nr, this, 34));
        }
    }

    public C20001113Np(int i, InterfaceExecutorC740550T3d interfaceExecutorC740550T3d) {
        this.LIZ = i;
        this.LIZIZ = interfaceExecutorC740550T3d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC20001313Nr r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20001113Np.LIZJ(X.13Nr, boolean, boolean):void");
    }
}
