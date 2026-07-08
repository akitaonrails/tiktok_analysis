package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12nH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19860912nH extends AbstractC19861612nO implements Set {
    public transient AbstractC19861312nL LLILLJJLI;

    public boolean LJIIJ() {
        return this instanceof C19861012nI;
    }

    @Override // X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public abstract AbstractC19851112lh iterator();

    public AbstractC19861312nL zzi() {
        AbstractC19861312nL abstractC19861312nL = this.LLILLJJLI;
        if (abstractC19861312nL != null) {
            return abstractC19861312nL;
        }
        AbstractC19861312nL abstractC19861312nLLJIIL = LJIIL();
        this.LLILLJJLI = abstractC19861312nLLJIIL;
        return abstractC19861312nLLJIIL;
    }

    public AbstractC19861312nL LJIIL() {
        Object[] array = toArray();
        C19863012nc c19863012nc = AbstractC19861312nL.LLILLJJLI;
        return AbstractC19861312nL.LJIIIZ(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C990690bt5.LIZ(this);
    }

    @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static int LJIIJJI(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC19860912nH) && LJIIJ() && ((AbstractC19860912nH) obj).LJIIJ() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static AbstractC19860912nH LJIIIZ(int i, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i != 0) {
            if (i != 1) {
                int iLJIIJJI = LJIIJJI(i);
                Object[] objArr2 = new Object[iLJIIJJI];
                int i2 = iLJIIJJI - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArrCopyOf[i5];
                    if (obj != null) {
                        int iHashCode = obj.hashCode();
                        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
                        while (true) {
                            int i6 = iRotateLeft & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArrCopyOf[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += iHashCode;
                                i4++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                iRotateLeft++;
                            }
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("at index ");
                        sbLIZ.append(i5);
                        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                Arrays.fill(objArrCopyOf, i4, i, (Object) null);
                if (i4 == 1) {
                    final Object obj3 = objArrCopyOf[0];
                    obj3.getClass();
                    return new AbstractC19860912nH(obj3) { // from class: X.12lj
                        public final transient Object LLILLL;

                        @Override // X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                        public final /* synthetic */ Iterator iterator() {
                            return new C19851212li(this.LLILLL);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final int size() {
                            return 1;
                        }

                        @Override // X.AbstractC19860912nH, X.AbstractC19861612nO
                        /* JADX INFO: renamed from: zzd */
                        public final AbstractC19851112lh iterator() {
                            return new C19851212li(this.LLILLL);
                        }

                        @Override // X.AbstractC19860912nH, java.util.Collection, java.util.Set
                        public final int hashCode() {
                            return this.LLILLL.hashCode();
                        }

                        @Override // java.util.AbstractCollection
                        public final String toString() {
                            String string = this.LLILLL.toString();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(e3.e);
                            sbLIZ2.append(string);
                            sbLIZ2.append(e3.f);
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // X.AbstractC19860912nH
                        public final AbstractC19861312nL zzi() {
                            return AbstractC19861312nL.zzj(this.LLILLL);
                        }

                        {
                            this.LLILLL = obj3;
                        }

                        @Override // X.AbstractC19861612nO
                        public final int LIZJ(Object[] objArr3) {
                            objArr3[0] = this.LLILLL;
                            return 1;
                        }

                        @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final boolean contains(Object obj4) {
                            return this.LLILLL.equals(obj4);
                        }
                    };
                }
                if (LJIIJJI(i4) >= iLJIIJJI / 2) {
                    if (i4 <= 0) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    }
                    return new C19861012nI(i3, i2, i4, objArrCopyOf, objArr2);
                }
                return LJIIIZ(i4, objArrCopyOf);
            }
            final Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            return new AbstractC19860912nH(obj4) { // from class: X.12lj
                public final transient Object LLILLL;

                @Override // X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final /* synthetic */ Iterator iterator() {
                    return new C19851212li(this.LLILLL);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return 1;
                }

                @Override // X.AbstractC19860912nH, X.AbstractC19861612nO
                /* JADX INFO: renamed from: zzd */
                public final AbstractC19851112lh iterator() {
                    return new C19851212li(this.LLILLL);
                }

                @Override // X.AbstractC19860912nH, java.util.Collection, java.util.Set
                public final int hashCode() {
                    return this.LLILLL.hashCode();
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
                    String string = this.LLILLL.toString();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(e3.e);
                    sbLIZ2.append(string);
                    sbLIZ2.append(e3.f);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.AbstractC19860912nH
                public final AbstractC19861312nL zzi() {
                    return AbstractC19861312nL.zzj(this.LLILLL);
                }

                {
                    this.LLILLL = obj4;
                }

                @Override // X.AbstractC19861612nO
                public final int LIZJ(Object[] objArr3) {
                    objArr3[0] = this.LLILLL;
                    return 1;
                }

                @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj42) {
                    return this.LLILLL.equals(obj42);
                }
            };
        }
        return C19861012nI.LLJ;
    }

    public static AbstractC19860912nH zzk(Object obj, Object obj2) {
        return LJIIIZ(2, obj, obj2);
    }
}
