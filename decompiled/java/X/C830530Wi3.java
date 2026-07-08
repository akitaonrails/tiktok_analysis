package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830530Wi3<K, V> {
    public int[] LL;
    public Object[] LLILLJJLI;
    public int LLILLL;

    public C830530Wi3() {
        this(0);
    }

    public final int LJ() {
        int i = this.LLILLL;
        if (i == 0) {
            return -1;
        }
        int iLIZ = C830540Wi4.LIZ(i, 0, this.LL);
        if (iLIZ < 0 || this.LLILLJJLI[iLIZ << 1] == null) {
            return iLIZ;
        }
        int i2 = iLIZ + 1;
        while (i2 < i && this.LL[i2] == 0) {
            if (this.LLILLJJLI[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iLIZ - 1; i3 >= 0 && this.LL[i3] == 0; i3--) {
            if (this.LLILLJJLI[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final void clear() {
        if (this.LLILLL > 0) {
            this.LL = C830540Wi4.LIZ;
            this.LLILLJJLI = C830540Wi4.LIZJ;
            this.LLILLL = 0;
        }
        if (this.LLILLL > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final int hashCode() {
        int[] iArr = this.LL;
        Object[] objArr = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.LLILLL <= 0;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LLILLL * 28);
        sb.append('{');
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kLJFF = LJFF(i2);
            if (kLJFF != sb) {
                sb.append(kLJFF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vLJIIIIZZ = LJIIIIZZ(i2);
            if (vLJIIIIZZ != sb) {
                sb.append(vLJIIIIZZ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.LLILLL;
    }

    public C830530Wi3(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = C830540Wi4.LIZ;
        } else {
            iArr = new int[i];
        }
        this.LL = iArr;
        if (i == 0) {
            objArr = C830540Wi4.LIZJ;
        } else {
            objArr = new Object[i << 1];
        }
        this.LLILLJJLI = objArr;
    }

    public final int LIZ(V v) {
        int i = this.LLILLL * 2;
        Object[] objArr = this.LLILLJJLI;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.LJFF(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void LIZIZ(int i) {
        int i2 = this.LLILLL;
        int[] iArr = this.LL;
        if (iArr.length < i) {
            this.LL = Arrays.copyOf(iArr, i);
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i * 2);
        }
        if (this.LLILLL == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int LIZLLL(K k) {
        if (k == null) {
            return LJ();
        }
        return LIZJ(k.hashCode(), k);
    }

    public final K LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return (K) this.LLILLJJLI[i << 1];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public final V LJI(int i) {
        boolean z;
        if (i >= 0 && i < this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr = this.LLILLJJLI;
            int i2 = i << 1;
            V v = (V) objArr[i2 + 1];
            int i3 = this.LLILLL;
            if (i3 <= 1) {
                clear();
                return v;
            }
            int i4 = i3 - 1;
            int[] iArr = this.LL;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                this.LL = Arrays.copyOf(iArr, i5);
                this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i5 << 1);
                if (i3 == this.LLILLL) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.LL, 0, i);
                        System.arraycopy(objArr, 0, this.LLILLJJLI, 0, i2);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        int i7 = i4 + 1;
                        System.arraycopy(iArr, i6, this.LL, i, i7 - i6);
                        int i8 = i6 << 1;
                        System.arraycopy(objArr, i8, this.LLILLJJLI, i2, (i7 << 1) - i8);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    System.arraycopy(iArr, i9, iArr, i, i10 - i9);
                    Object[] objArr2 = this.LLILLJJLI;
                    int i11 = i9 << 1;
                    System.arraycopy(objArr2, i11, objArr2, i2, (i10 << 1) - i11);
                }
                Object[] objArr3 = this.LLILLJJLI;
                int i12 = i4 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            }
            if (i3 == this.LLILLL) {
                this.LLILLL = i4;
                return v;
            }
            throw new ConcurrentModificationException();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public final V LJIIIIZZ(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return (V) this.LLILLJJLI[(i << 1) + 1];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public boolean containsKey(K k) {
        if (LIZLLL(k) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(V v) {
        if (LIZ(v) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C830530Wi3) {
                int i = this.LLILLL;
                if (i != ((C830530Wi3) obj).LLILLL) {
                    return false;
                }
                C830530Wi3 c830530Wi3 = (C830530Wi3) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K kLJFF = LJFF(i2);
                    V vLJIIIIZZ = LJIIIIZZ(i2);
                    Object obj2 = c830530Wi3.get(kLJFF);
                    if (vLJIIIIZZ == null) {
                        if (obj2 == null && c830530Wi3.containsKey(kLJFF)) {
                        }
                        return false;
                    }
                    if (!Intrinsics.LJFF(vLJIIIIZZ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.LLILLL != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.LLILLL;
            for (int i4 = 0; i4 < i3; i4++) {
                K kLJFF2 = LJFF(i4);
                V vLJIIIIZZ2 = LJIIIIZZ(i4);
                Object obj3 = ((Map) obj).get(kLJFF2);
                if (vLJIIIIZZ2 == null) {
                    if (obj3 == null && ((Map) obj).containsKey(kLJFF2)) {
                    }
                    return false;
                }
                if (!Intrinsics.LJFF(vLJIIIIZZ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public V get(K k) {
        int iLIZLLL = LIZLLL(k);
        if (iLIZLLL >= 0) {
            return (V) this.LLILLJJLI[(iLIZLLL << 1) + 1];
        }
        return null;
    }

    public V remove(K k) {
        int iLIZLLL = LIZLLL(k);
        if (iLIZLLL >= 0) {
            return LJI(iLIZLLL);
        }
        return null;
    }

    private final int LIZJ(int i, Object obj) {
        int i2 = this.LLILLL;
        if (i2 == 0) {
            return -1;
        }
        int iLIZ = C830540Wi4.LIZ(i2, i, this.LL);
        if (iLIZ < 0 || Intrinsics.LJFF(obj, this.LLILLJJLI[iLIZ << 1])) {
            return iLIZ;
        }
        int i3 = iLIZ + 1;
        while (i3 < i2 && this.LL[i3] == i) {
            if (Intrinsics.LJFF(obj, this.LLILLJJLI[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iLIZ - 1; i4 >= 0 && this.LL[i4] == i; i4--) {
            if (Intrinsics.LJFF(obj, this.LLILLJJLI[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final V LJII(int i, V v) {
        if (i >= 0 && i < this.LLILLL) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.LLILLJJLI;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected index to be within 0..size()-1, but was ");
        sbLIZ.append(i);
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iLIZLLL = LIZLLL(obj);
        if (iLIZLLL >= 0) {
            return (V) this.LLILLJJLI[(iLIZLLL << 1) + 1];
        }
        return v;
    }

    public final V put(K k, V v) {
        int iHashCode;
        int iLJ;
        int i = this.LLILLL;
        if (k != null) {
            iHashCode = k.hashCode();
            iLJ = LIZJ(iHashCode, k);
        } else {
            iHashCode = 0;
            iLJ = LJ();
        }
        if (iLJ >= 0) {
            int i2 = (iLJ << 1) + 1;
            Object[] objArr = this.LLILLJJLI;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iLJ;
        int[] iArr = this.LL;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.LL = Arrays.copyOf(iArr, i4);
            this.LLILLJJLI = Arrays.copyOf(this.LLILLJJLI, i4 << 1);
            if (i != this.LLILLL) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.LL;
            int i5 = i3 + 1;
            System.arraycopy(iArr2, i3, iArr2, i5, i - i3);
            Object[] objArr2 = this.LLILLJJLI;
            int i6 = i5 << 1;
            int i7 = i3 << 1;
            System.arraycopy(objArr2, i7, objArr2, i6, (this.LLILLL << 1) - i7);
        }
        int i8 = this.LLILLL;
        if (i == i8) {
            int[] iArr3 = this.LL;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.LLILLJJLI;
                int i9 = i3 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.LLILLL = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public final boolean remove(K k, V v) {
        int iLIZLLL = LIZLLL(k);
        if (iLIZLLL >= 0 && Intrinsics.LJFF(v, LJIIIIZZ(iLIZLLL))) {
            LJI(iLIZLLL);
            return true;
        }
        return false;
    }

    public final V replace(K k, V v) {
        int iLIZLLL = LIZLLL(k);
        if (iLIZLLL >= 0) {
            return LJII(iLIZLLL, v);
        }
        return null;
    }

    public final boolean replace(K k, V v, V v2) {
        int iLIZLLL = LIZLLL(k);
        if (iLIZLLL >= 0 && Intrinsics.LJFF(v, LJIIIIZZ(iLIZLLL))) {
            LJII(iLIZLLL, v2);
            return true;
        }
        return false;
    }
}
