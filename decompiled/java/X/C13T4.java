package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13T4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13T4 implements C13UG {
    public volatile C13T5 LIZ;

    @Override // X.C13UG
    public final void LIZ() {
    }

    @Override // X.C13UG
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL() {
        return null;
    }

    @Override // X.C13UG
    public final C20013713Sl LJ() {
        return null;
    }

    @Override // X.C13UG
    public final boolean LJI() {
        return false;
    }

    @Override // X.C13UG
    public final Map<String, String> LJIIJJI() {
        return null;
    }

    @Override // X.C13UG
    public final String LJIIL() {
        return null;
    }

    @Override // X.C13UG
    public final String LJIILIIL() {
        return null;
    }

    @Override // X.C13UG
    public final void LJIIZILJ() {
    }

    @Override // X.C13UG
    public final long getSize() {
        return 0L;
    }

    @Override // X.C13UG
    public final Pair<Integer, Long> LJIIJ() {
        C0VSJ c0vsj = new C0VSJ((String) null);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            throw null;
        }
        return new Pair<>(0, 0L);
    }

    @Override // X.C13UG
    public final void initialize() {
        C13T5 c13t5 = this.LIZ;
        if (c13t5 == null || !c13t5.LJIILLIIL.compareAndSet(false, true)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceDiskCache initialize start: subs=");
        sbLIZ.append(c13t5.LJIILL.keySet());
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c13t5.initialize();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ResourceDiskCache initialize done: subs=");
        sbLIZ2.append(c13t5.LJIILL.size());
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C13UG
    public final long LIZIZ() {
        throw null;
    }

    @Override // X.C13UG
    public final boolean LJIILJJIL() {
        throw null;
    }

    @Override // X.C13UG
    public final C0VSJ LIZJ(String str) {
        return new C0VSJ((String) null, str);
    }

    @Override // X.C13UG
    public final long LJFF(int i) {
        throw null;
    }

    @Override // X.C13UG
    public final String LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) null);
        sbLIZ.append('/');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13UG
    public final void LJIIIIZZ(C20014813Sw c20014813Sw) {
        C13T5 c13t5 = this.LIZ;
        if (c13t5 != null) {
            c13t5.LJJIFFI(c20014813Sw, c20014813Sw.LJ);
        }
    }

    @Override // X.C13UG
    public final void LJIIIZ(List<String> list) {
        throw null;
    }

    @Override // X.C13UG
    public final boolean LJIILL(C20014813Sw c20014813Sw) {
        C0VSJ c0vsjLIZJ = LIZJ(c20014813Sw.LIZ);
        if (!c0vsjLIZJ.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomResourceDiskCache.put fail: file missing ");
            sbLIZ.append(c0vsjLIZJ.getAbsolutePath());
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        throw null;
    }

    @Override // X.C13UG
    public final Pair<Boolean, Long> LJIILLIIL(String str, boolean z) {
        throw null;
    }
}
