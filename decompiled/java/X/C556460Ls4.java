package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AwS122S1100000_8;

/* JADX INFO: renamed from: X.0Ls4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556460Ls4 {
    public final C1264904xD LIZ;
    public final ConcurrentMap<String, InterfaceC556470Ls5> LIZIZ = new ConcurrentHashMap();
    public final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentSkipListSet<String> LIZLLL = new ConcurrentSkipListSet<>();
    public final ConcurrentMap<String, C09AE> LJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, C05YC<C1346605Ou>> LJFF = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConcurrentMap<String, C05YC<InterfaceC1406105et>>> LJI = new ConcurrentHashMap();
    public final C2252331DDr LJII;
    public final AnonymousClass0950 LJIIIIZZ;

    public C556460Ls4(C1264904xD c1264904xD) {
        this.LIZ = c1264904xD;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LJII = c2252331DDrLIZIZ;
        this.LJIIIIZZ = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final InterfaceC556470Ls5 LIZ(String str) {
        InterfaceC556470Ls5 interfaceC556470Ls5 = (InterfaceC556470Ls5) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (interfaceC556470Ls5 != null) {
            LJFF(interfaceC556470Ls5);
            return interfaceC556470Ls5;
        }
        return null;
    }

    public final C05YC<C1346605Ou> LIZJ(String str) {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 8, null, 4);
        C05YC<C1346605Ou> c05yc = (C05YC) ((ConcurrentHashMap) this.LJFF).putIfAbsent(str, c2252331DDrLIZIZ);
        if (c05yc != null) {
            return c05yc;
        }
        return c2252331DDrLIZIZ;
    }

    public final void LIZLLL(String str) {
        if (this.LIZLLL.remove(str) && this.LIZLLL.isEmpty()) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C556450Ls3(this, null), 3);
        }
    }

    public final void LJ(String str) {
        if (((ConcurrentHashMap) this.LIZIZ).remove(str) != null) {
            C09AE c09ae = (C09AE) ((ConcurrentHashMap) this.LJ).remove(str);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            LIZLLL(str);
        }
    }

    public final void LJFF(InterfaceC556470Ls5 interfaceC556470Ls5) {
        String str = interfaceC556470Ls5.LIZIZ().LIZ;
        if (((ConcurrentHashMap) this.LJ).containsKey(str)) {
            return;
        }
        C05YC<C1346605Ou> c05ycLIZJ = LIZJ(str);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZJ, null, C099V.LAZY, new C556440Ls2(interfaceC556470Ls5, this, c05ycLIZJ, str, null), 1);
        if (((ConcurrentHashMap) this.LJ).putIfAbsent(str, anonymousClass0956LIZLLL) != null) {
            anonymousClass0956LIZLLL.LIZIZ(null);
            return;
        }
        C1346605Ou state = interfaceC556470Ls5.getState();
        if (state != null) {
            synchronized (c05ycLIZJ) {
                try {
                    c05ycLIZJ.LIZJ(state);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        for (Map.Entry<String, C2339209Eo> entry : interfaceC556470Ls5.LIZLLL().LIZ.entrySet()) {
            String key = entry.getKey();
            LIZIZ(str, key).LIZJ(entry.getValue());
        }
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach watcher, workflowId=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c0lx3, "AIGCWorkflowSessionStore", C2188811AlT.LIZIZ(sbLIZ));
        anonymousClass0956LIZLLL.LJII(new AwS122S1100000_8(this, str, 16));
        anonymousClass0956LIZLLL.start();
    }

    public final C05YC<InterfaceC1406105et> LIZIZ(String str, String str2) {
        ConcurrentMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentMap concurrentMap = (ConcurrentMap) ((ConcurrentHashMap) this.LJI).putIfAbsent(str, concurrentHashMap);
        if (concurrentMap != null) {
            concurrentHashMap = concurrentMap;
        }
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 8, null, 4);
        C05YC<InterfaceC1406105et> c05yc = (C05YC) concurrentHashMap.putIfAbsent(str2, c2252331DDrLIZIZ);
        if (c05yc != null) {
            return c05yc;
        }
        return c2252331DDrLIZIZ;
    }
}
