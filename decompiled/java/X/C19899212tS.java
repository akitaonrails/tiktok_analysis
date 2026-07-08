package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12tS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19899212tS<K, V> extends AbstractMap<K, V> implements Cloneable {
    public int LL;
    public Object[] LLILLJJLI;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.LL = 0;
        this.LLILLJJLI = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C19899112tR(this);
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C19899212tS<K, V> clone() {
        try {
            C19899212tS<K, V> c19899212tS = (C19899212tS) super.clone();
            Object[] objArr = this.LLILLJJLI;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                c19899212tS.LLILLJJLI = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return c19899212tS;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LL;
    }

    public final int LIZIZ(Object obj) {
        int i = this.LL << 1;
        Object[] objArr = this.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else if (obj.equals(obj2)) {
                return i2;
            }
        }
        return -2;
    }

    public final V LIZJ(int i) {
        V v;
        int i2 = this.LL << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        int i3 = i + 1;
        if (i3 < 0) {
            v = null;
        } else {
            v = (V) this.LLILLJJLI[i3];
        }
        Object[] objArr = this.LLILLJJLI;
        int i4 = (i2 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.LL--;
        int i5 = i2 - 2;
        Object[] objArr2 = this.LLILLJJLI;
        objArr2[i5] = null;
        objArr2[i5 + 1] = null;
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != LIZIZ(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.LL << 1;
        Object[] objArr = this.LLILLJJLI;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int iLIZIZ = LIZIZ(obj) + 1;
        if (iLIZIZ < 0) {
            return null;
        }
        return (V) this.LLILLJJLI[iLIZIZ];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return LIZJ(LIZIZ(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int length;
        int iLIZIZ = LIZIZ(k) >> 1;
        if (iLIZIZ == -1) {
            iLIZIZ = this.LL;
        }
        if (iLIZIZ >= 0) {
            int i = iLIZIZ + 1;
            if (i >= 0) {
                Object[] objArr = this.LLILLJJLI;
                int i2 = i << 1;
                if (objArr == null) {
                    length = 0;
                } else {
                    length = objArr.length;
                }
                V v2 = null;
                if (i2 > length) {
                    int i3 = ((length / 2) * 3) + 1;
                    if (i3 % 2 != 0) {
                        i3++;
                    }
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    int i4 = this.LL;
                    if (i4 == 0 || i2 != objArr.length) {
                        Object[] objArr2 = new Object[i2];
                        this.LLILLJJLI = objArr2;
                        if (i4 != 0) {
                            System.arraycopy(objArr, 0, objArr2, 0, i4 << 1);
                        }
                    }
                }
                int i5 = iLIZIZ << 1;
                int i6 = i5 + 1;
                if (i6 >= 0) {
                    v2 = (V) this.LLILLJJLI[i6];
                }
                Object[] objArr3 = this.LLILLJJLI;
                objArr3[i5] = k;
                objArr3[i6] = v;
                if (i > this.LL) {
                    this.LL = i;
                }
                return v2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
