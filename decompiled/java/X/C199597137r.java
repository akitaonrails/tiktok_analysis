package X;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.137r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199597137r<K, V> extends C135Y<K, V> implements Serializable {
    public static final long serialVersionUID = 1;
    public final C137F LL;
    public final C137F LLILLJJLI;
    public final C137H<Object> LLILLL;
    public final C137H<Object> LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final long LLIZ;
    public final AnonymousClass1387<K, V> LLIZLLLIL;
    public final int LLJ;
    public final AnonymousClass1385<? super K, ? super V> LLJI;
    public final C138F LLJIJIL;
    public transient C199596137q LLJILJIL;

    private Object readResolve() {
        return this.LLJILJIL;
    }

    @Override // X.C135Y, X.C08J6
    public final Object LJIIL() {
        return this.LLJILJIL;
    }

    @Override // X.C135Y
    /* JADX INFO: renamed from: LJIIZILJ */
    public final C199596137q LJIIL() {
        return this.LLJILJIL;
    }

    public C199597137r(ConcurrentMapC199594137o<K, V> concurrentMapC199594137o) {
        C137F c137f = concurrentMapC199594137o.LLIZ;
        C137F c137f2 = concurrentMapC199594137o.LLIZLLLIL;
        C137H<Object> c137h = concurrentMapC199594137o.LLILZIL;
        C137H<Object> c137h2 = concurrentMapC199594137o.LLILZLL;
        long j = concurrentMapC199594137o.LLJILJIL;
        long j2 = concurrentMapC199594137o.LLJIJIL;
        long j3 = concurrentMapC199594137o.LLJ;
        AnonymousClass1387<K, V> anonymousClass1387 = concurrentMapC199594137o.LLJI;
        int i = concurrentMapC199594137o.LLILZ;
        AnonymousClass1385<K, V> anonymousClass1385 = concurrentMapC199594137o.LLJJ;
        C138F c138f = concurrentMapC199594137o.LLJJI;
        this.LL = c137f;
        this.LLILLJJLI = c137f2;
        this.LLILLL = c137h;
        this.LLILZ = c137h2;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = j3;
        this.LLIZLLLIL = anonymousClass1387;
        this.LLJ = i;
        this.LLJI = anonymousClass1385;
        this.LLJIJIL = (c138f == C138F.LIZ || c138f == C199593137n.LJIIZILJ) ? null : c138f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        objectInputStream.defaultReadObject();
        C199593137n c199593137n = new C199593137n();
        C137F c137f = this.LL;
        C137F c137f2 = c199593137n.LJI;
        boolean z11 = true;
        if (c137f2 == null) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIIL(c137f2, "Key strength was already set to %s", z);
        c137f.getClass();
        c199593137n.LJI = c137f;
        c199593137n.LJFF(this.LLILLJJLI);
        C137H<Object> c137h = this.LLILLL;
        C137H<Object> c137h2 = c199593137n.LJIIJJI;
        if (c137h2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19864312np.LJIIL(c137h2, "key equivalence was already set to %s", z2);
        c137h.getClass();
        c199593137n.LJIIJJI = c137h;
        C137H<Object> c137h3 = this.LLILZ;
        C137H<Object> c137h4 = c199593137n.LJIIL;
        if (c137h4 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C19864312np.LJIIL(c137h4, "value equivalence was already set to %s", z3);
        c137h3.getClass();
        c199593137n.LJIIL = c137h3;
        int i = this.LLJ;
        int i2 = c199593137n.LIZJ;
        if (i2 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        C19864312np.LJIIJ(i2, "concurrency level was already set to %s", z4);
        if (i > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C19864312np.LJ(z5);
        c199593137n.LIZJ = i;
        c199593137n.LJ(this.LLJI);
        c199593137n.LIZ = false;
        long j = this.LLILZIL;
        if (j > 0) {
            c199593137n.LIZJ(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.LLILZLL;
        if (j2 > 0) {
            c199593137n.LIZIZ(j2, TimeUnit.NANOSECONDS);
        }
        AnonymousClass1387<K, V> anonymousClass1387 = this.LLIZLLLIL;
        if (anonymousClass1387 != EnumC199604137y.LL) {
            if (c199593137n.LJFF == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            C19864312np.LJIILJJIL(z6);
            if (c199593137n.LIZ) {
                long j3 = c199593137n.LIZLLL;
                if (j3 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C19864312np.LJIIJJI(j3, "weigher can not be combined with maximum size", z10);
            }
            anonymousClass1387.getClass();
            c199593137n.LJFF = anonymousClass1387;
            long j4 = this.LLIZ;
            if (j4 != -1) {
                long j5 = c199593137n.LJ;
                if (j5 == -1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C19864312np.LJIIJJI(j5, "maximum weight was already set to %s", z7);
                long j6 = c199593137n.LIZLLL;
                if (j6 == -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                C19864312np.LJIIJJI(j6, "maximum size was already set to %s", z8);
                if (j4 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C19864312np.LIZLLL("maximum weight must not be negative", z9);
                c199593137n.LJ = j4;
            }
        } else {
            long j7 = this.LLIZ;
            if (j7 != -1) {
                c199593137n.LIZLLL(j7);
            }
        }
        C138F c138f = this.LLJIJIL;
        if (c138f != null) {
            if (c199593137n.LJIILJJIL != null) {
                z11 = false;
            }
            C19864312np.LJIILJJIL(z11);
            c199593137n.LJIILJJIL = c138f;
        }
        this.LLJILJIL = c199593137n.LIZ();
    }
}
