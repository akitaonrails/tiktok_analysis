package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1A6I, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1A6I<T> extends AbstractList<T> {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Executor LL;
    public final Executor LLILLJJLI;
    public final AbstractC470940IdQ<T> LLILLL;
    public final C476690Imh LLILZ;
    public final C1A6G<T> LLILZIL;
    public int LLILZLL;
    public T LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI = Integer.MAX_VALUE;
    public int LLJIJIL = Integer.MIN_VALUE;
    public final AtomicBoolean LLJILJIL = new AtomicBoolean(false);
    public final ArrayList<WeakReference<C1A6F>> LLJILJILJ = new ArrayList<>();

    public abstract void LJIIIZ(C1A6I c1a6i, C1A6C c1a6c);

    public abstract AbstractC470910IdN<?, T> LJIIJ();

    public abstract Object LJIIJJI();

    public abstract boolean LJIIL();

    public abstract void LJIIZILJ(int i);

    public final void LJFF() {
        this.LLJILJIL.set(true);
    }

    public boolean LJIILIIL() {
        return this.LLJILJIL.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZIL.size();
    }

    public boolean LJIILJJIL() {
        return LJIILIIL();
    }

    public final void LJIL(C1A6C c1a6c) {
        int size = this.LLJILJILJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ((Reference) ListProtector.get(this.LLJILJILJ, size)).get();
                if (obj == null || obj == c1a6c) {
                    ListProtector.remove(this.LLJILJILJ, size);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLIZLLLIL
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L28
            int r1 = r6.LLJI
            X.0Imh r0 = r6.LLILZ
            int r0 = r0.LIZIZ
            if (r1 > r0) goto L28
            r3 = 1
        Lf:
            boolean r0 = r6.LLJ
            if (r0 == 0) goto L26
            int r2 = r6.LLJIJIL
            int r1 = r6.size()
            int r1 = r1 - r5
            X.0Imh r0 = r6.LLILZ
            int r0 = r0.LIZIZ
            int r1 = r1 - r0
            if (r2 < r1) goto L26
        L21:
            if (r3 != 0) goto L2a
            if (r5 != 0) goto L2e
            return
        L26:
            r5 = 0
            goto L21
        L28:
            r3 = 0
            goto Lf
        L2a:
            r6.LLIZLLLIL = r4
            if (r5 == 0) goto L30
        L2e:
            r6.LLJ = r4
        L30:
            if (r7 == 0) goto L3d
            java.util.concurrent.Executor r1 = r6.LL
            X.1A6H r0 = new X.1A6H
            r0.<init>()
            r1.execute(r0)
            return
        L3d:
            r6.LJIIIIZZ(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A6I.LJJ(boolean):void");
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        T t = this.LLILZIL.get(i);
        if (t != null) {
            this.LLIZ = t;
        }
        return t;
    }

    public final void LIZJ(C1A6I c1a6i, C1A6C c1a6c) {
        if (c1a6i != null && c1a6i != this) {
            if (c1a6i.isEmpty()) {
                if (!this.LLILZIL.isEmpty()) {
                    c1a6c.LIZIZ(0, this.LLILZIL.size());
                }
            } else {
                LJIIIZ(c1a6i, c1a6c);
            }
        }
        int size = this.LLJILJILJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Reference) ListProtector.get(this.LLJILJILJ, size)).get() == null) {
                    ListProtector.remove(this.LLJILJILJ, size);
                }
            } else {
                this.LLJILJILJ.add(new WeakReference<>(c1a6c));
                return;
            }
        }
    }

    public final void LJIIIIZZ(boolean z, boolean z2) {
        if (z) {
            AbstractC470940IdQ<T> abstractC470940IdQ = this.LLILLL;
            ListProtector.get((List) ListProtector.get(this.LLILZIL.LLILLJJLI, 0), 0);
            abstractC470940IdQ.getClass();
        }
        if (z2) {
            AbstractC470940IdQ<T> abstractC470940IdQ2 = this.LLILLL;
            ListProtector.get((List) ListProtector.get(this.LLILZIL.LLILLJJLI, r1.size() - 1), r1.size() - 1);
            ((C470930IdP) abstractC470940IdQ2).LIZ.postValue(Boolean.FALSE);
        }
    }

    public final void LJIJ(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.LLJILJILJ.size() - 1; size >= 0; size--) {
                C1A6F c1a6f = (C1A6F) ((Reference) ListProtector.get(this.LLJILJILJ, size)).get();
                if (c1a6f != null) {
                    c1a6f.LIZ(i, i2);
                }
            }
        }
    }

    public final void LJIJI(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.LLJILJILJ.size() - 1; size >= 0; size--) {
                C1A6F c1a6f = (C1A6F) ((Reference) ListProtector.get(this.LLJILJILJ, size)).get();
                if (c1a6f != null) {
                    c1a6f.LIZIZ(i, i2);
                }
            }
        }
    }

    public final void LJ(final boolean z, final boolean z2, final boolean z3) {
        if (this.LLILLL != null) {
            if (this.LLJI == Integer.MAX_VALUE) {
                this.LLJI = this.LLILZIL.size();
            }
            if (this.LLJIJIL == Integer.MIN_VALUE) {
                this.LLJIJIL = 0;
            }
            if (z || z2 || z3) {
                this.LL.execute(new Runnable() { // from class: X.1A6O
                    public final void LIZ() {
                        if (z) {
                            ((C470930IdP) this.LLILZ.LLILLL).LIZIZ.postValue(Boolean.TRUE);
                        }
                        if (z2) {
                            this.LLILZ.LLIZLLLIL = true;
                        }
                        if (z3) {
                            this.LLILZ.LLJ = true;
                        }
                        this.LLILZ.LJJ(false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    public C1A6I(C1A6G<T> c1a6g, Executor executor, Executor executor2, AbstractC470940IdQ<T> abstractC470940IdQ, C476690Imh c476690Imh) {
        this.LLILZIL = c1a6g;
        this.LL = executor;
        this.LLILLJJLI = executor2;
        this.LLILLL = abstractC470940IdQ;
        this.LLILZ = c476690Imh;
    }
}
