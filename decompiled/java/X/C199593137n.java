package X;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.137n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199593137n<K, V> {
    public static final C19834712j3 LJIILLIIL = new C19834712j3(new AnonymousClass1386() { // from class: X.138C
        @Override // X.AnonymousClass1386
        public final void LIZ() {
        }

        @Override // X.AnonymousClass1386
        public final void LIZIZ() {
        }

        @Override // X.AnonymousClass1386
        public final void LIZJ(long j) {
        }

        @Override // X.AnonymousClass1386
        public final void LIZLLL() {
        }

        @Override // X.AnonymousClass1386
        public final void LJ(long j) {
        }
    });
    public static final C138D LJIIZILJ = new C138F() { // from class: X.138D
        @Override // X.C138F
        public final long LIZ() {
            return 0L;
        }
    };
    public static final Logger LJIJ = Logger.getLogger(C199593137n.class.getName());
    public AnonymousClass1387<? super K, ? super V> LJFF;
    public C137F LJI;
    public C137F LJII;
    public C137H<Object> LJIIJJI;
    public C137H<Object> LJIIL;
    public AnonymousClass1385<? super K, ? super V> LJIILIIL;
    public C138F LJIILJJIL;
    public boolean LIZ = true;
    public final int LIZIZ = -1;
    public int LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public final long LJIIJ = -1;
    public final C19834712j3 LJIILL = LJIILLIIL;

    public final C199596137q LIZ() {
        if (this.LJFF == null) {
            C19864312np.LJIILIIL("maximumWeight requires weigher", this.LJ == -1);
        } else if (this.LIZ) {
            C19864312np.LJIILIIL("weigher requires maximumWeight", this.LJ != -1);
        } else if (this.LJ == -1) {
            LJIJ.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        C19864312np.LJIILIIL("refreshAfterWrite requires a LoadingCache", this.LJIIJ == -1);
        return new C199596137q(this);
    }

    public final String toString() {
        C135T c135tLIZIZ = C135U.LIZIZ(this);
        int i = this.LIZIZ;
        if (i != -1) {
            String strValueOf = String.valueOf(i);
            C135V c135v = new C135V();
            c135tLIZIZ.LIZJ.LIZJ = c135v;
            c135tLIZIZ.LIZJ = c135v;
            c135v.LIZIZ = strValueOf;
            c135v.LIZ = "initialCapacity";
        }
        int i2 = this.LIZJ;
        if (i2 != -1) {
            String strValueOf2 = String.valueOf(i2);
            C135V c135v2 = new C135V();
            c135tLIZIZ.LIZJ.LIZJ = c135v2;
            c135tLIZIZ.LIZJ = c135v2;
            c135v2.LIZIZ = strValueOf2;
            c135v2.LIZ = "concurrencyLevel";
        }
        long j = this.LIZLLL;
        if (j != -1) {
            c135tLIZIZ.LIZ(j, "maximumSize");
        }
        long j2 = this.LJ;
        if (j2 != -1) {
            c135tLIZIZ.LIZ(j2, "maximumWeight");
        }
        long j3 = this.LJIIIIZZ;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            c135tLIZIZ.LIZIZ(sb.toString(), "expireAfterWrite");
        }
        long j4 = this.LJIIIZ;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            c135tLIZIZ.LIZIZ(sb2.toString(), "expireAfterAccess");
        }
        C137F c137f = this.LJI;
        if (c137f != null) {
            c135tLIZIZ.LIZIZ(C19376010rG.LIZ(c137f.toString()), "keyStrength");
        }
        C137F c137f2 = this.LJII;
        if (c137f2 != null) {
            c135tLIZIZ.LIZIZ(C19376010rG.LIZ(c137f2.toString()), "valueStrength");
        }
        if (this.LJIIJJI != null) {
            C135R c135r = new C135R();
            c135tLIZIZ.LIZJ.LIZJ = c135r;
            c135tLIZIZ.LIZJ = c135r;
            c135r.LIZIZ = "keyEquivalence";
        }
        if (this.LJIIL != null) {
            C135R c135r2 = new C135R();
            c135tLIZIZ.LIZJ.LIZJ = c135r2;
            c135tLIZIZ.LIZJ = c135r2;
            c135r2.LIZIZ = "valueEquivalence";
        }
        if (this.LJIILIIL != null) {
            C135R c135r3 = new C135R();
            c135tLIZIZ.LIZJ.LIZJ = c135r3;
            c135tLIZIZ.LIZJ = c135r3;
            c135r3.LIZIZ = "removalListener";
        }
        return c135tLIZIZ.toString();
    }

    public final void LIZLLL(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.LIZLLL;
        boolean z4 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIJJI(j2, "maximum size was already set to %s", z);
        long j3 = this.LJ;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19864312np.LJIIJJI(j3, "maximum weight was already set to %s", z2);
        if (this.LJFF == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C19864312np.LJIILIIL("maximum size can not be combined with weigher", z3);
        if (j < 0) {
            z4 = false;
        }
        C19864312np.LIZLLL("maximum size must not be negative", z4);
        this.LIZLLL = j;
    }

    public final void LJ(AnonymousClass1385 anonymousClass1385) {
        boolean z;
        if (this.LJIILIIL == null) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIILJJIL(z);
        anonymousClass1385.getClass();
        this.LJIILIIL = anonymousClass1385;
    }

    public final void LJFF(C137F c137f) {
        boolean z;
        C137F c137f2 = this.LJII;
        if (c137f2 == null) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIL(c137f2, "Value strength was already set to %s", z);
        c137f.getClass();
        this.LJII = c137f;
    }

    public final void LIZIZ(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = this.LJIIIZ;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIJJI(j2, "expireAfterAccess was already set to %s ns", z);
        if (j >= 0) {
            this.LJIIIZ = timeUnit.toNanos(j);
            return;
        }
        throw new IllegalArgumentException(C08KM.LIZ("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
    }

    public final void LIZJ(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = this.LJIIIIZZ;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIJJI(j2, "expireAfterWrite was already set to %s ns", z);
        if (j >= 0) {
            this.LJIIIIZZ = timeUnit.toNanos(j);
            return;
        }
        throw new IllegalArgumentException(C08KM.LIZ("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
    }
}
