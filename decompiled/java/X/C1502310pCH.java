package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0pCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502310pCH {
    public C1502320pCI LIZ = new C1502320pCI();
    public final C1502300pCG<Iterable<String>> LIZIZ = new C1502300pCG<>();
    public final C1502300pCG<Map<String, C1529350ptt>> LIZJ = new C1502300pCG<>();

    public final void LIZ() {
        Map<String, C1529350ptt> map = this.LIZJ.LIZ;
        if (map != null) {
            C1532960pzi.LIZLLL(new ARunnableS92S0200000_23(this, map, 84));
        }
        Iterable<String> iterable = this.LIZIZ.LIZ;
        if (iterable != null) {
            C1532960pzi.LIZLLL(new ARunnableS92S0200000_23(this, iterable, 85));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tree: \n");
        C1502320pCI c1502320pCI = this.LIZ;
        StringBuilder sb2 = null;
        sb.append(c1502320pCI != null ? c1502320pCI.toString() : null);
        sb.append("\nprefixes: \n");
        Iterable<String> iterable = this.LIZIZ.LIZ;
        sb.append(iterable != null ? C13LP.LJJLIIIJ(iterable, ",\n", null, null, 0, null, null, 62) : null);
        sb.append("manifest: \n");
        Map<String, C1529350ptt> map = this.LIZJ.LIZ;
        if (map != null) {
            sb2 = new StringBuilder();
            for (Map.Entry<String, C1529350ptt> entry : map.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        sb.append((Object) sb2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1529350ptt LIZIZ(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502310pCH.LIZIZ(java.lang.String):X.0ptt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.Collection, java.util.List] */
    public final void LIZJ(Iterable<String> iterable) {
        synchronized (this.LIZIZ) {
            try {
                C1502300pCG<Iterable<String>> c1502300pCG = this.LIZIZ;
                Iterable<String> iterable2 = c1502300pCG.LIZ;
                if (iterable2 == null) {
                    c1502300pCG.LIZ = iterable;
                } else {
                    ?? LLIIIJ = C13LP.LLIIIJ(iterable2);
                    C19719612Di.LJJI(iterable, LLIIIJ);
                    c1502300pCG.LIZ = LLIIIJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
