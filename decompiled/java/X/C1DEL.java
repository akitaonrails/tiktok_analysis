package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS244S0300000_35;
import skp.f0;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.1DEL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEL<E> implements InterfaceC824740WWy<E>, C1DEG {
    public Object LL = C1DEN.LJIILL;
    public C2252611DEt<? super Boolean> LLILLJJLI;
    public final /* synthetic */ C1DEK<E> LLILLL;

    public final void LIZIZ() {
        C2252611DEt<? super Boolean> c2252611DEt = this.LLILLJJLI;
        this.LLILLJJLI = null;
        this.LL = C1DEN.LJIIJJI;
        Throwable thLJIIZILJ = this.LLILLL.LJIIZILJ();
        if (thLJIIZILJ == null) {
            Boolean bool = Boolean.FALSE;
            C189200o6.m2constructorimpl(bool);
            c2252611DEt.resumeWith(bool);
        } else {
            C098200Yq c098200Yq = new C098200Yq(thLJIIZILJ);
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
    }

    @Override // X.InterfaceC824740WWy
    public final E next() throws Throwable {
        E e = (E) this.LL;
        C09AU c09au = C1DEN.LJIILL;
        if (e == c09au) {
            "`hasNext()` has not been invoked".toString();
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.LL = c09au;
        if (e != C1DEN.LJIIJJI) {
            return e;
        }
        Throwable thLJIJJ = this.LLILLL.LJIJJ();
        int i = f0.LIZ;
        throw thLJIJJ;
    }

    public C1DEL(C1DEK c1dek) {
        this.LLILLL = c1dek;
    }

    @Override // X.InterfaceC824740WWy
    public final Object LIZ(AbstractC23140094w abstractC23140094w) throws Throwable {
        C1DEM<E> c1demLJIIL;
        boolean z;
        C1DEM<E> c1demLJIIL2;
        C1DEK<E> c1dek = this.LLILLL;
        C1DEM<E> c1dem = (C1DEM) C1DEK.LLJ.get(c1dek);
        while (!c1dek.LJJII()) {
            long andIncrement = C1DEK.LLILZIL.getAndIncrement(c1dek);
            long j = C1DEN.LIZIZ;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c1dem.LLILLL != j2) {
                c1demLJIIL = c1dek.LJIIL(j2, c1dem);
                if (c1demLJIIL == null) {
                    continue;
                }
            } else {
                c1demLJIIL = c1dem;
            }
            Object objLJJIL = c1dek.LJJIL(c1demLJIIL, i, andIncrement, null);
            C09AU c09au = C1DEN.LJIIL;
            if (objLJJIL != c09au) {
                C09AU c09au2 = C1DEN.LJIILJJIL;
                if (objLJJIL == c09au2) {
                    if (andIncrement < c1dek.LJJ()) {
                        c1demLJIIL.LIZ();
                    }
                    c1dem = c1demLJIIL;
                } else {
                    if (objLJJIL == C1DEN.LJIILIIL) {
                        C1DEK<E> c1dek2 = this.LLILLL;
                        C2252611DEt<? super Boolean> c2252611DEtLIZ = C2252661DEy.LIZ(C099M.LIZLLL(abstractC23140094w));
                        try {
                            this.LLILLJJLI = c2252611DEtLIZ;
                            Object objLJJIL2 = c1dek2.LJJIL(c1demLJIIL, i, andIncrement, this);
                            if (objLJJIL2 == c09au) {
                                LIZLLL(c1demLJIIL, i);
                            } else {
                                AwS244S0300000_35 awS244S0300000_35 = null;
                                if (objLJJIL2 == c09au2) {
                                    if (andIncrement < c1dek2.LJJ()) {
                                        c1demLJIIL.LIZ();
                                    }
                                    C1DEM<E> c1dem2 = (C1DEM) C1DEK.LLJ.get(c1dek2);
                                    while (true) {
                                        if (c1dek2.LJJII()) {
                                            LIZIZ();
                                            break;
                                        }
                                        long andIncrement2 = C1DEK.LLILZIL.getAndIncrement(c1dek2);
                                        long j3 = C1DEN.LIZIZ;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (c1dem2.LLILLL != j4) {
                                            c1demLJIIL2 = c1dek2.LJIIL(j4, c1dem2);
                                            if (c1demLJIIL2 == null) {
                                            }
                                        } else {
                                            c1demLJIIL2 = c1dem2;
                                        }
                                        Object objLJJIL3 = c1dek2.LJJIL(c1demLJIIL2, i2, andIncrement2, this);
                                        if (objLJJIL3 == C1DEN.LJIIL) {
                                            LIZLLL(c1demLJIIL2, i2);
                                            break;
                                        }
                                        if (objLJJIL3 == C1DEN.LJIILJJIL) {
                                            if (andIncrement2 < c1dek2.LJJ()) {
                                                c1demLJIIL2.LIZ();
                                            }
                                            c1dem2 = c1demLJIIL2;
                                        } else if (objLJJIL3 != C1DEN.LJIILIIL) {
                                            c1demLJIIL2.LIZ();
                                            this.LL = objLJJIL3;
                                            this.LLILLJJLI = null;
                                            z = true;
                                            Function1<E, Unit> function1 = c1dek2.LLILLJJLI;
                                            if (function1 != null) {
                                                awS244S0300000_35 = new AwS244S0300000_35((Function1) function1, (Function1<Object, Unit>) objLJJIL3, (Object) c2252611DEtLIZ.LLILZIL, (CoroutineContext) 8);
                                            }
                                        } else {
                                            "unexpected".toString();
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    c1demLJIIL.LIZ();
                                    this.LL = objLJJIL2;
                                    this.LLILLJJLI = null;
                                    z = true;
                                    Function1<E, Unit> function12 = c1dek2.LLILLJJLI;
                                    if (function12 != null) {
                                        awS244S0300000_35 = new AwS244S0300000_35((Function1) function12, (Function1<Object, Unit>) objLJJIL2, (Object) c2252611DEtLIZ.LLILZIL, (CoroutineContext) 8);
                                    }
                                }
                                c2252611DEtLIZ.LJJIFFI(awS244S0300000_35, z);
                            }
                            Object objLJIJ = c2252611DEtLIZ.LJIJ();
                            if (objLJIJ == C099R.LJFF()) {
                                C099Q.LIZJ(abstractC23140094w);
                            }
                            return objLJIJ;
                        } catch (Throwable th) {
                            c2252611DEtLIZ.LJJIIZI();
                            throw th;
                        }
                    }
                    c1demLJIIL.LIZ();
                    this.LL = objLJJIL;
                    return true;
                }
            } else {
                "unreachable".toString();
                throw new IllegalStateException("unreachable");
            }
        }
        this.LL = C1DEN.LJIIJJI;
        Throwable thLJIIZILJ = this.LLILLL.LJIIZILJ();
        if (thLJIIZILJ == null) {
            return false;
        }
        int i3 = f0.LIZ;
        throw thLJIIZILJ;
    }

    @Override // X.C1DEG
    public final void LIZLLL(C1DET<?> c1det, int i) {
        C2252611DEt<? super Boolean> c2252611DEt = this.LLILLJJLI;
        if (c2252611DEt != null) {
            c2252611DEt.LIZLLL(c1det, i);
        }
    }
}
