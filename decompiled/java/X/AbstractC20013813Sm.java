package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.13Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20013813Sm implements C13UG {
    public final String LIZ;
    public ConcurrentHashMap<String, C20014813Sw> LIZIZ = new ConcurrentHashMap<>();
    public long LIZJ;
    public InterfaceC20013913Sn LIZLLL;

    @Override // X.C13UG
    public final void LIZ() {
    }

    @Override // X.C13UG
    public abstract C20013713Sl LJ();

    @Override // X.C13UG
    public final boolean LJI() {
        return true;
    }

    @Override // X.C13UG
    public final String LJII(String str) {
        return str;
    }

    @Override // X.C13UG
    public final void LJIIIIZZ(C20014813Sw c20014813Sw) {
    }

    @Override // X.C13UG
    public final void LJIIIZ(List<String> list) {
    }

    @Override // X.C13UG
    public final Map<String, String> LJIIJJI() {
        return null;
    }

    @Override // X.C13UG
    public abstract String LJIIL();

    @Override // X.C13UG
    public final boolean LJIILL(C20014813Sw c20014813Sw) {
        return false;
    }

    @Override // X.C13UG
    public final Pair<Integer, Long> LJIIJ() {
        return new Pair<>(0, 0L);
    }

    @Override // X.C13UG
    public final void LJIIZILJ() {
        if (this.LIZLLL == null) {
            Function0<InterfaceC20013913Sn> function0 = C20008413Qk.LIZIZ.get(this.LIZ);
            this.LIZLLL = function0 != null ? function0.invoke() : null;
        }
        this.LIZIZ.clear();
        InterfaceC20013913Sn interfaceC20013913Sn = this.LIZLLL;
        if (interfaceC20013913Sn != null) {
            interfaceC20013913Sn.LIZLLL(new AwS644S0100000_30(this, 37));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalSourceDiskCache refresh: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entries=");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C13UG
    public final void initialize() {
        if (this.LIZLLL == null) {
            Function0<InterfaceC20013913Sn> function0 = C20008413Qk.LIZIZ.get(this.LIZ);
            this.LIZLLL = function0 != null ? function0.invoke() : null;
        }
    }

    @Override // X.C13UG
    public final long LIZIZ() {
        if (!LJIILJJIL()) {
            return 0L;
        }
        LJIIZILJ();
        long j = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalSourceDiskCache cleanupInUse: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entries=");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(", maxSize: ");
        sbLIZ.append(LJ().LIZLLL);
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        long j2 = LJ().LIZLLL;
        InterfaceC20013913Sn interfaceC20013913Sn = this.LIZLLL;
        long jLJ = interfaceC20013913Sn != null ? interfaceC20013913Sn.LJ(j2) : 0L;
        long j3 = j - jLJ;
        this.LIZJ = j3 >= 0 ? j3 : 0L;
        return jLJ;
    }

    @Override // X.C13UG
    public final boolean LJIILJJIL() {
        return LJ().LIZ;
    }

    @Override // X.C13UG
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.C13UG
    public final String LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.C13UG
    public final long getSize() {
        return this.LIZJ;
    }

    public AbstractC20013813Sm(String str) {
        this.LIZ = str;
    }

    @Override // X.C13UG
    public final C0VSJ LIZJ(String str) {
        return new C0VSJ(LJIIL(), str);
    }

    @Override // X.C13UG
    public long LJFF(int i) {
        Pair pair;
        long jLIZIZ;
        long jLJ;
        long jLIZ;
        long j = 0;
        if (!LJIILJJIL()) {
            return 0L;
        }
        LJIIZILJ();
        long j2 = this.LIZJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    pair = new Pair(0L, 0L);
                } else {
                    pair = new Pair(Long.valueOf(LJ().LJ), Long.valueOf(LJ().LJI));
                }
            } else {
                pair = new Pair(Long.valueOf(LJ().LJ), Long.valueOf(LJ().LJFF));
            }
        } else {
            pair = new Pair(Long.valueOf(LJ().LJ), Long.valueOf(LJ().LIZJ));
        }
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        if (LJ().LIZIZ) {
            long j3 = this.LIZJ;
            InterfaceC20013913Sn interfaceC20013913Sn = this.LIZLLL;
            if (interfaceC20013913Sn != null) {
                jLIZ = interfaceC20013913Sn.LIZ(jLongValue2);
            } else {
                jLIZ = 0;
            }
            long j4 = j3 - jLIZ;
            if (j4 >= 0) {
                j = j4;
            }
            this.LIZJ = j;
            return jLIZ;
        }
        InterfaceC20013913Sn interfaceC20013913Sn2 = this.LIZLLL;
        if (interfaceC20013913Sn2 != null) {
            jLIZIZ = interfaceC20013913Sn2.LIZIZ(jLongValue2);
        } else {
            jLIZIZ = 0;
        }
        InterfaceC20013913Sn interfaceC20013913Sn3 = this.LIZLLL;
        if (interfaceC20013913Sn3 != null) {
            jLJ = interfaceC20013913Sn3.LJ(jLongValue);
        } else {
            jLJ = 0;
        }
        long j5 = (j2 - jLIZIZ) - jLJ;
        if (j5 >= 0) {
            j = j5;
        }
        this.LIZJ = j;
        return jLIZIZ + jLJ;
    }

    @Override // X.C13UG
    public final Pair<Boolean, Long> LJIILLIIL(String str, boolean z) {
        C20014813Sw c20014813Sw = this.LIZIZ.get(str);
        if (c20014813Sw == null) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        if (c20014813Sw.LJFF && !z) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        InterfaceC20013913Sn interfaceC20013913Sn = this.LIZLLL;
        if (interfaceC20013913Sn != null) {
            interfaceC20013913Sn.LIZJ(Collections.singletonList(str));
        }
        this.LIZIZ.remove(str);
        long j = this.LIZJ;
        long j2 = c20014813Sw.LIZLLL;
        this.LIZJ = j - j2;
        return new Pair<>(Boolean.TRUE, Long.valueOf(j2));
    }
}
