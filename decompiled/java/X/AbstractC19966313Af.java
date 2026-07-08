package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19966313Af extends AbstractC19966513Ah implements Set {
    public transient AbstractC19966113Ad LLILLJJLI;

    @Override // X.AbstractC19966513Ah
    /* JADX INFO: renamed from: zzd */
    public abstract AbstractC19967113An iterator();

    public final AbstractC19966113Ad zzg() {
        AbstractC19966113Ad abstractC19966113Ad = this.LLILLJJLI;
        if (abstractC19966113Ad != null) {
            return abstractC19966113Ad;
        }
        C19966813Ak c19966813AkLJIIJ = LJIIJ();
        this.LLILLJJLI = c19966813AkLJIIJ;
        return c19966813AkLJIIJ;
    }

    public C19966813Ak LJIIJ() {
        Object[] array = toArray();
        C19966913Al c19966913Al = AbstractC19966113Ad.LLILLJJLI;
        int length = array.length;
        return length == 0 ? C19966813Ak.LLILZIL : new C19966813Ak(length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it2 = iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // X.AbstractC19966513Ah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static int LJIIIZ(int i) {
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
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC19966313Af) && (this instanceof C19966413Ag)) {
            obj.getClass();
            if ((obj instanceof C19966413Ag) && hashCode() != obj.hashCode()) {
                return false;
            }
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

    public static AbstractC19966313Af LJIIJJI(int i, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i != 0) {
            if (i != 1) {
                int iLJIIIZ = LJIIIZ(i);
                Object[] objArr2 = new Object[iLJIIIZ];
                int i2 = iLJIIIZ - 1;
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
                    return new AbstractC19966313Af(obj3) { // from class: X.13Ai
                        public final transient Object LLILLL;

                        @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                        public final /* synthetic */ Iterator iterator() {
                            return new C19967213Ao(this.LLILLL);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final int size() {
                            return 1;
                        }

                        @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah
                        /* JADX INFO: renamed from: zzd */
                        public final AbstractC19967113An iterator() {
                            return new C19967213Ao(this.LLILLL);
                        }

                        @Override // X.AbstractC19966313Af, java.util.Collection, java.util.Set
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

                        {
                            this.LLILLL = obj3;
                        }

                        @Override // X.AbstractC19966513Ah
                        public final void LIZJ(Object[] objArr3) {
                            objArr3[0] = this.LLILLL;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public final boolean contains(Object obj4) {
                            return this.LLILLL.equals(obj4);
                        }
                    };
                }
                if (LJIIIZ(i4) >= iLJIIIZ / 2) {
                    if (i4 <= 0) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    }
                    return new C19966413Ag(i3, i2, i4, objArrCopyOf, objArr2);
                }
                return LJIIJJI(i4, objArrCopyOf);
            }
            final Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            return new AbstractC19966313Af(obj4) { // from class: X.13Ai
                public final transient Object LLILLL;

                @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final /* synthetic */ Iterator iterator() {
                    return new C19967213Ao(this.LLILLL);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return 1;
                }

                @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah
                /* JADX INFO: renamed from: zzd */
                public final AbstractC19967113An iterator() {
                    return new C19967213Ao(this.LLILLL);
                }

                @Override // X.AbstractC19966313Af, java.util.Collection, java.util.Set
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

                {
                    this.LLILLL = obj4;
                }

                @Override // X.AbstractC19966513Ah
                public final void LIZJ(Object[] objArr3) {
                    objArr3[0] = this.LLILLL;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj42) {
                    return this.LLILLL.equals(obj42);
                }
            };
        }
        return C19966413Ag.LLJ;
    }

    public static AbstractC19966313Af zzi(Object obj, Object obj2) {
        return LJIIJJI(2, obj, obj2);
    }
}
