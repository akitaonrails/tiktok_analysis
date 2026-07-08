package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NXA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXA implements C0NXS {
    public final C0NXT LIZ;
    public final C0NY7 LIZIZ;
    public final C0NXE LIZJ;
    public final C0NXG LIZLLL;
    public final C595330NWp LJ;
    public final C0NXN LJFF;
    public final Object LJI = new Object();
    public final C01GW LJII = C452501pT.LIZIZ(new C0NXD());
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C0NXC(this));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C0NXB(this));
    public final String LJIIJ;

    public final ConcurrentHashMap<String, C0NX7> LIZIZ() {
        return (ConcurrentHashMap) this.LJII.getValue();
    }

    public final LruCache<String, C0NX7> LJFF() {
        return (LruCache) this.LJIIIZ.getValue();
    }

    public final LruCache<String, C0NX7> LJI() {
        return (LruCache) this.LJIIIIZZ.getValue();
    }

    @Override // X.C0NXS
    public final String getTag() {
        return this.LJIIJ;
    }

    public final C0NXK LIZLLL(String str) {
        C0NX7 c0nx7 = LIZIZ().get(str);
        if (c0nx7 != null) {
            return c0nx7.LJ;
        }
        C0NX7 c0nx72 = LJI().get(str);
        if (c0nx72 != null) {
            return c0nx72.LJ;
        }
        C0NX7 c0nx73 = LJFF().get(str);
        if (c0nx73 != null) {
            return c0nx73.LJ;
        }
        return null;
    }

    public final List<C0NXK> LJ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C0NXK c0nxkLIZLLL = LIZLLL(it2.next());
            if (c0nxkLIZLLL != null) {
                arrayList.add(c0nxkLIZLLL);
            }
        }
        return arrayList;
    }

    @Override // X.C0NXS
    public final void LIZJ(C0NXT c0nxt, String str) {
        C0NXR.LIZ(this, c0nxt, str);
    }

    public final void LIZ(C0NXT c0nxt, String str, Throwable th) {
        C0NXR.LIZJ(this, c0nxt, str, th);
    }

    public final Map<String, Boolean> LJII(List<C0NXK> list, boolean z, C595220NWe c595220NWe, String str) {
        LinkedHashMap linkedHashMap;
        synchronized (this.LJI) {
            try {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C0NXK c0nxk : list) {
                    Pair pair = new Pair(c0nxk.LIZ, Boolean.valueOf(LJIIIIZZ(c0nxk, z, c595220NWe, str)));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(X.C0NXK r31, boolean r32, X.C595220NWe r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NXA.LJIIIIZZ(X.0NXK, boolean, X.0NWe, java.lang.String):boolean");
    }

    public C0NXA(C0NXT c0nxt, C0NY7 c0ny7, C0NXE c0nxe, C0NXG c0nxg, C595330NWp c595330NWp, C0NXN c0nxn) {
        this.LIZ = c0nxt;
        this.LIZIZ = c0ny7;
        this.LIZJ = c0nxe;
        this.LIZLLL = c0nxg;
        this.LJ = c595330NWp;
        this.LJFF = c0nxn;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Cache][");
        sbLIZ.append(c0ny7.LIZ);
        sbLIZ.append(']');
        this.LJIIJ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
