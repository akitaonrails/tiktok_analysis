package Y;

import X.AbstractC21342018fa;
import X.AbstractC339510DSr;
import X.C1A6B;
import X.C1A6G;
import X.C1A6I;
import X.C21342318fd;
import X.C2172981A2m;
import X.C2179971ATj;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS5S0401000_33 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final C1A6G<T> c1a6g = ((C1A6I) this.l0).LLILZIL;
        final C1A6G<T> c1a6g2 = ((C1A6I) this.l1).LLILZIL;
        final AbstractC339510DSr<T> abstractC339510DSr = ((C1A6B) this.l3).LIZIZ.LIZIZ;
        final int iLJ = c1a6g.LJ();
        int iLJ2 = c1a6g2.LJ();
        final int size = (c1a6g.size() - iLJ) - c1a6g.LJFF();
        final int size2 = (c1a6g2.size() - iLJ2) - c1a6g2.LJFF();
        ((C1A6B) this.l3).LIZJ.execute(new ARunnableS102S0200000_33(this, C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.1A2r
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return size2;
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return size;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                Object obj = c1a6g.get(i + iLJ);
                C1A6G c1a6g3 = c1a6g2;
                Object obj2 = c1a6g3.get(i2 + c1a6g3.LL);
                if (obj == obj2) {
                    return true;
                }
                if (obj != null && obj2 != null) {
                    return abstractC339510DSr.LIZ(obj, obj2);
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                Object obj = c1a6g.get(i + iLJ);
                C1A6G c1a6g3 = c1a6g2;
                Object obj2 = c1a6g3.get(i2 + c1a6g3.LL);
                if (obj == obj2) {
                    return true;
                }
                if (obj != null && obj2 != null) {
                    return abstractC339510DSr.LIZIZ(obj, obj2);
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                Object obj = c1a6g.get(i + iLJ);
                C1A6G c1a6g3 = c1a6g2;
                Object obj2 = c1a6g3.get(i2 + c1a6g3.LL);
                if (obj != null && obj2 != null) {
                    return abstractC339510DSr.LIZJ(obj, obj2);
                }
                return null;
            }
        }, true), 24));
    }

    public static final void run$0(final ARunnableS5S0401000_33 aRunnableS5S0401000_33) {
        try {
            ((C2172981A2m) aRunnableS5S0401000_33.l3).LIZJ.execute(new ARunnableS102S0200000_33(aRunnableS5S0401000_33, C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.1A2o
                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return ((List) this.LIZ.l1).size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return ((List) this.LIZ.l0).size();
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return ((C2172981A2m) this.LIZ.l3).LIZIZ.LIZIZ.LIZ((T) obj, (T) obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return ((C2172981A2m) this.LIZ.l3).LIZIZ.LIZIZ.LIZIZ((T) obj, (T) obj2);
                        }
                        return false;
                    }
                    if (obj2 == null) {
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null && obj2 != null) {
                        return ((C2172981A2m) this.LIZ.l3).LIZIZ.LIZIZ.LIZJ((T) obj, (T) obj2);
                    }
                    throw new AssertionError();
                }
            }, true), 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS5S0401000_33 aRunnableS5S0401000_33) {
        try {
            aRunnableS5S0401000_33.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS5S0401000_33(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$t = i2;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.i4 = i;
        this.l2 = obj4;
    }
}
