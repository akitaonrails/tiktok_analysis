package X;

import Y.ARunnableS44S0101000_33;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1A6J, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6J<T> extends C1A6I<T> {
    public final AbstractC485130J0t<T> LLJJ;
    public final C1A6M LLJJI;

    @Override // X.C1A6I
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.C1A6I
    public final Object LJIIJJI() {
        return Integer.valueOf(this.LLILZLL);
    }

    @Override // X.C1A6I
    public final AbstractC470910IdN<?, T> LJIIJ() {
        return this.LLJJ;
    }

    @Override // X.C1A6I
    public final void LJIIZILJ(int i) {
        C1A6G<T> c1a6g = this.LLILZIL;
        C476690Imh c476690Imh = this.LLILZ;
        int i2 = c476690Imh.LIZIZ;
        int i3 = c476690Imh.LIZ;
        int i4 = c1a6g.LLILZLL;
        if (i3 != i4) {
            if (i3 >= i4) {
                if (c1a6g.LLILLJJLI.size() == 1 && c1a6g.LLILLL == 0) {
                    c1a6g.LLILZLL = i3;
                } else {
                    throw new IllegalArgumentException("Page size can change only if last page is only one present");
                }
            } else {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
        }
        int size = c1a6g.size();
        int i5 = c1a6g.LLILZLL;
        int iMax = Math.max((i - i2) / i5, 0);
        int iMin = Math.min((i + i2) / c1a6g.LLILZLL, (((size + i5) - 1) / i5) - 1);
        c1a6g.LIZJ(iMax, iMin);
        int i6 = c1a6g.LL / c1a6g.LLILZLL;
        while (iMax <= iMin) {
            int i7 = iMax - i6;
            if (ListProtector.get(c1a6g.LLILLJJLI, i7) == null) {
                ListProtector.set(c1a6g.LLILLJJLI, i7, C1A6G.LLJ);
                LJJI(iMax);
            }
            iMax++;
        }
    }

    public final void LJJI(int i) {
        this.LLILLJJLI.execute(new ARunnableS44S0101000_33(i, this, 8));
    }

    @Override // X.C1A6I
    public final void LJIIIZ(C1A6I c1a6i, C1A6C c1a6c) {
        C1A6G<T> c1a6g = c1a6i.LLILZIL;
        if (!c1a6g.isEmpty() && this.LLILZIL.size() == c1a6g.size()) {
            int i = this.LLILZ.LIZ;
            C1A6G<T> c1a6g2 = this.LLILZIL;
            int i2 = c1a6g2.LL / i;
            int size = c1a6g2.LLILLJJLI.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + i2;
                int i5 = 0;
                while (i5 < this.LLILZIL.LLILLJJLI.size()) {
                    int i6 = i4 + i5;
                    if (!this.LLILZIL.LJIIIIZZ(i, i6) || c1a6g.LJIIIIZZ(i, i6)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 > 0) {
                    c1a6c.LIZ(i4 * i, i * i5);
                    i3 += i5 - 1;
                }
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    public C1A6J(AbstractC485130J0t<T> abstractC485130J0t, Executor executor, Executor executor2, AbstractC470940IdQ<T> abstractC470940IdQ, C476690Imh c476690Imh, int i) {
        super(new C1A6G(), executor, executor2, abstractC470940IdQ, c476690Imh);
        AbstractC485160J0w<T> abstractC485160J0w = new AbstractC485160J0w<T>() { // from class: X.1A6M
            @Override // X.AbstractC485160J0w
            public final void LIZ(int i2, C0J10<T> c0j10) {
                boolean z;
                boolean z2;
                c0j10.getClass();
                boolean z3 = false;
                if (c0j10 == C0J10.LJFF) {
                    this.LIZ.LJFF();
                    return;
                }
                if (this.LIZ.LJIILIIL()) {
                    return;
                }
                if (i2 != 0 && i2 != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unexpected resultType");
                    sbLIZ.append(i2);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (this.LIZ.LLILZIL.LLILLJJLI.size() == 0) {
                    C1A6J c1a6j = this.LIZ;
                    C1A6G<T> c1a6g = c1a6j.LLILZIL;
                    int i3 = c0j10.LIZIZ;
                    List<T> list = c0j10.LIZ;
                    int i4 = c0j10.LIZJ;
                    int i5 = c0j10.LIZLLL;
                    int i6 = c1a6j.LLILZ.LIZ;
                    c1a6g.getClass();
                    int size = (list.size() + (i6 - 1)) / i6;
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = i7 * i6;
                        int i9 = i7 + 1;
                        List<T> listSubList = list.subList(i8, Math.min(list.size(), i9 * i6));
                        if (i7 == 0) {
                            c1a6g.LJIIIZ(i3, (list.size() + i4) - listSubList.size(), i5, listSubList);
                        } else {
                            c1a6g.LJIIJ(i8 + i3, listSubList, null);
                        }
                        i7 = i9;
                    }
                    c1a6j.LJIJI(0, c1a6g.size());
                } else {
                    C1A6J c1a6j2 = this.LIZ;
                    c1a6j2.LLILZIL.LJIIJ(c0j10.LIZLLL, c0j10.LIZ, c1a6j2);
                }
                C1A6J c1a6j3 = this.LIZ;
                if (c1a6j3.LLILLL != null) {
                    if (c1a6j3.LLILZIL.size() == 0) {
                        z = true;
                    } else {
                        z = false;
                        if (c0j10.LIZIZ == 0 && c0j10.LIZLLL == 0) {
                            z2 = true;
                        }
                        int size2 = this.LIZ.size();
                        if (!z && (i2 != 0 ? !(i2 != 3 || c0j10.LIZLLL + this.LIZ.LLILZ.LIZ < size2) : c0j10.LIZJ == 0)) {
                            z3 = true;
                        }
                        this.LIZ.LJ(z, z2, z3);
                    }
                    z2 = false;
                    int size22 = this.LIZ.size();
                    if (!z) {
                    }
                    this.LIZ.LJ(z, z2, z3);
                }
            }
        };
        this.LLJJI = abstractC485160J0w;
        this.LLJJ = abstractC485130J0t;
        int i2 = this.LLILZ.LIZ;
        this.LLILZLL = i;
        if (abstractC485130J0t.LJ()) {
            LJFF();
            return;
        }
        Math.max(0, Math.round((i - ((Math.max(Math.round(this.LLILZ.LIZLLL / i2), 2) * i2) / 2)) / i2) * i2);
        Executor executor3 = this.LL;
        C485100J0q c485100J0q = new C485100J0q(abstractC485130J0t, i2, abstractC485160J0w);
        abstractC485130J0t.LJII();
        C485140J0u<T> c485140J0u = c485100J0q.LIZ;
        synchronized (c485140J0u.LIZLLL) {
            try {
                c485140J0u.LJ = executor3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
