package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19910112vD extends AbstractMap {
    public static final /* synthetic */ int LLIZ = 0;
    public Object[] LL;
    public int LLILLJJLI;
    public boolean LLILZ;
    public volatile C19911012vM LLILZIL;
    public Map LLILLL = Collections.emptyMap();
    public Map LLILZLL = Collections.emptyMap();

    public void LIZ() {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL = this.LLILLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILLL);
        this.LLILZLL = this.LLILZLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILZLL);
        this.LLILZ = true;
    }

    public final Iterable LIZIZ() {
        return this.LLILLL.isEmpty() ? Collections.emptySet() : this.LLILLL.entrySet();
    }

    public final void LJII() {
        if (this.LLILZ) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new C19911012vM(this);
        }
        return this.LLILZIL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.LLILLJJLI;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.LL[i2].hashCode();
        }
        return this.LLILLL.size() > 0 ? iHashCode + this.LLILLL.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LLILLJJLI + this.LLILLL.size();
    }

    public C19910112vD() {
    }

    public final SortedMap LJI() {
        LJII();
        if (this.LLILLL.isEmpty() && !(this.LLILLL instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.LLILLL = treeMap;
            this.LLILZLL = treeMap.descendingMap();
        }
        return (SortedMap) this.LLILLL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        LJII();
        if (this.LLILLJJLI != 0) {
            this.LL = null;
            this.LLILLJJLI = 0;
        }
        if (this.LLILLL.isEmpty()) {
            return;
        }
        this.LLILLL.clear();
    }

    public /* synthetic */ C19910112vD(int i) {
    }

    public final C19910812vK LIZLLL(int i) {
        if (i < this.LLILLJJLI) {
            return (C19910812vK) this.LL[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int LJ(Comparable comparable) {
        int i = this.LLILLJJLI - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((C19910812vK) this.LL[i]).LL);
            if (iCompareTo > 0) {
                return -(i + 2);
            }
            if (iCompareTo == 0) {
                return i;
            }
            do {
                int i3 = (i2 + i) / 2;
                int iCompareTo2 = comparable.compareTo(((C19910812vK) this.LL[i3]).LL);
                if (iCompareTo2 < 0) {
                    i = i3 - 1;
                } else if (iCompareTo2 > 0) {
                    i2 = i3 + 1;
                } else {
                    return i3;
                }
            } while (i2 <= i);
        }
        return -(i2 + 1);
    }

    public final Object LJFF(int i) {
        LJII();
        Object[] objArr = this.LL;
        Object obj = ((C19910812vK) objArr[i]).LLILLJJLI;
        System.arraycopy(objArr, i + 1, objArr, i, (this.LLILLJJLI - i) - 1);
        this.LLILLJJLI--;
        if (!this.LLILLL.isEmpty()) {
            Iterator it2 = LJI().entrySet().iterator();
            Object[] objArr2 = this.LL;
            int i2 = this.LLILLJJLI;
            Map.Entry entry = (Map.Entry) it2.next();
            objArr2[i2] = new C19910812vK(this, (Comparable) entry.getKey(), entry.getValue());
            this.LLILLJJLI++;
            it2.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (LJ(comparable) < 0 && !this.LLILLL.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19910112vD)) {
            return super.equals(obj);
        }
        C19910112vD c19910112vD = (C19910112vD) obj;
        int size = size();
        if (size != c19910112vD.size()) {
            return false;
        }
        int i = this.LLILLJJLI;
        if (i == c19910112vD.LLILLJJLI) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!LIZLLL(i2).equals(c19910112vD.LIZLLL(i2))) {
                    return false;
                }
            }
            if (i == size) {
                return true;
            }
            return this.LLILLL.equals(c19910112vD.LLILLL);
        }
        return entrySet().equals(c19910112vD.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iLJ = LJ(comparable);
        if (iLJ >= 0) {
            return ((C19910812vK) this.LL[iLJ]).LLILLJJLI;
        }
        return this.LLILLL.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        LJII();
        Comparable comparable = (Comparable) obj;
        int iLJ = LJ(comparable);
        if (iLJ >= 0) {
            return LJFF(iLJ);
        }
        if (this.LLILLL.isEmpty()) {
            return null;
        }
        return this.LLILLL.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        LJII();
        int iLJ = LJ(comparable);
        if (iLJ >= 0) {
            return ((C19910812vK) this.LL[iLJ]).setValue(obj);
        }
        LJII();
        if (this.LL == null) {
            this.LL = new Object[16];
        }
        int i = -(iLJ + 1);
        if (i >= 16) {
            return LJI().put(comparable, obj);
        }
        if (this.LLILLJJLI == 16) {
            C19910812vK c19910812vK = (C19910812vK) this.LL[15];
            this.LLILLJJLI = 15;
            LJI().put(c19910812vK.LL, c19910812vK.LLILLJJLI);
        }
        Object[] objArr = this.LL;
        System.arraycopy(objArr, i, objArr, i + 1, (16 - i) - 1);
        this.LL[i] = new C19910812vK(this, comparable, obj);
        this.LLILLJJLI++;
        return null;
    }
}
