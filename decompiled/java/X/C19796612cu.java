package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19796612cu implements InterfaceC19797012cy, InterfaceC19797112cz, Iterable<InterfaceC19797112cz> {
    public final SortedMap<Integer, InterfaceC19797112cz> LL;
    public final Map<String, InterfaceC19797112cz> LLILLJJLI;

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        C19796612cu c19796612cu = new C19796612cu();
        for (Map.Entry entry : ((TreeMap) this.LL).entrySet()) {
            if (entry.getValue() instanceof InterfaceC19797012cy) {
                ((TreeMap) c19796612cu.LL).put(entry.getKey(), entry.getValue());
            } else {
                ((TreeMap) c19796612cu.LL).put(entry.getKey(), ((InterfaceC19797112cz) entry.getValue()).LIZIZ());
            }
        }
        return c19796612cu;
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        return ((TreeMap) this.LL).size() == 1 ? LIZJ(0).LJ() : ((TreeMap) this.LL).size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        final Iterator it2 = ((TreeMap) this.LL).keySet().iterator();
        final Iterator it3 = ((TreeMap) this.LLILLJJLI).keySet().iterator();
        return new Iterator<InterfaceC19797112cz>() { // from class: X.12cx
            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (it2.hasNext()) {
                    return true;
                }
                return it3.hasNext();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ InterfaceC19797112cz next() {
                if (it2.hasNext()) {
                    return new C19797512d3(((Integer) it2.next()).toString());
                }
                if (it3.hasNext()) {
                    return new C19797512d3((String) it3.next());
                }
                throw new NoSuchElementException();
            }
        };
    }

    public final int LJIILIIL() {
        if (this.LL.isEmpty()) {
            return 0;
        }
        return ((Integer) ((TreeMap) this.LL).lastKey()).intValue() + 1;
    }

    public final Iterator<Integer> LJIL() {
        return ((TreeMap) this.LL).keySet().iterator();
    }

    public final List<InterfaceC19797112cz> LJJ() {
        ArrayList arrayList = new ArrayList(LJIILIIL());
        for (int i = 0; i < LJIILIIL(); i++) {
            arrayList.add(LIZJ(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.LL.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC19797112cz> iterator() {
        return new C19796412cs(this);
    }

    public final String toString() {
        return LJIILJJIL(",");
    }

    public C19796612cu() {
        this.LL = new TreeMap();
        this.LLILLJJLI = new TreeMap();
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        return toString();
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.TRUE;
    }

    public C19796612cu(List<InterfaceC19797112cz> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                LJIJ(i, (InterfaceC19797112cz) ListProtector.get(list, i));
            }
        }
    }

    public final InterfaceC19797112cz LIZJ(int i) {
        if (i < LJIILIIL()) {
            if (LJIJI(i)) {
                InterfaceC19797112cz interfaceC19797112cz = (InterfaceC19797112cz) ((TreeMap) this.LL).get(Integer.valueOf(i));
                if (interfaceC19797112cz != null) {
                    return interfaceC19797112cz;
                }
            }
            return InterfaceC19797112cz.LJIILIIL;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // X.InterfaceC19797012cy
    public final InterfaceC19797112cz LJIIIIZZ(String str) {
        InterfaceC19797112cz interfaceC19797112cz;
        if ("length".equals(str)) {
            return new C19816212g4(Double.valueOf(LJIILIIL()));
        }
        if (LJIIIZ(str) && (interfaceC19797112cz = (InterfaceC19797112cz) ((TreeMap) this.LLILLJJLI).get(str)) != null) {
            return interfaceC19797112cz;
        }
        return InterfaceC19797112cz.LJIILIIL;
    }

    @Override // X.InterfaceC19797012cy
    public final boolean LJIIIZ(String str) {
        if (!"length".equals(str) && !((TreeMap) this.LLILLJJLI).containsKey(str)) {
            return false;
        }
        return true;
    }

    public final void LJIIL(InterfaceC19797112cz interfaceC19797112cz) {
        LJIJ(LJIILIIL(), interfaceC19797112cz);
    }

    public final String LJIILJJIL(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.LL.isEmpty()) {
            for (int i = 0; i < LJIILIIL(); i++) {
                InterfaceC19797112cz interfaceC19797112czLIZJ = LIZJ(i);
                sb.append(str);
                if (!(interfaceC19797112czLIZJ instanceof C19796212cq) && !(interfaceC19797112czLIZJ instanceof C19794812cc)) {
                    sb.append(interfaceC19797112czLIZJ.LJFF());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void LJIIZILJ(int i) {
        int iIntValue = ((Integer) ((TreeMap) this.LL).lastKey()).intValue();
        if (i <= iIntValue && i >= 0) {
            ((TreeMap) this.LL).remove(Integer.valueOf(i));
            if (i == iIntValue) {
                int i2 = i - 1;
                if (!((TreeMap) this.LL).containsKey(Integer.valueOf(i2)) && i2 >= 0) {
                    ((TreeMap) this.LL).put(Integer.valueOf(i2), InterfaceC19797112cz.LJIILIIL);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) ((TreeMap) this.LL).lastKey()).intValue()) {
                    Object obj = ((TreeMap) this.LL).get(Integer.valueOf(i));
                    if (obj != null) {
                        ((TreeMap) this.LL).put(Integer.valueOf(i - 1), obj);
                        ((TreeMap) this.LL).remove(Integer.valueOf(i));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean LJIJI(int i) {
        if (i >= 0 && i <= ((Integer) ((TreeMap) this.LL).lastKey()).intValue()) {
            return ((TreeMap) this.LL).containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19796612cu)) {
            return false;
        }
        C19796612cu c19796612cu = (C19796612cu) obj;
        if (LJIILIIL() != c19796612cu.LJIILIIL()) {
            return false;
        }
        if (this.LL.isEmpty()) {
            return c19796612cu.LL.isEmpty();
        }
        for (int iIntValue = ((Integer) ((TreeMap) this.LL).firstKey()).intValue(); iIntValue <= ((Integer) ((TreeMap) this.LL).lastKey()).intValue(); iIntValue++) {
            if (!LIZJ(iIntValue).equals(c19796612cu.LIZJ(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public C19796612cu(InterfaceC19797112cz... interfaceC19797112czArr) {
        this((List<InterfaceC19797112cz>) Arrays.asList(interfaceC19797112czArr));
    }

    @Override // X.InterfaceC19797012cy
    public final void LJIIJJI(String str, InterfaceC19797112cz interfaceC19797112cz) {
        if (interfaceC19797112cz == null) {
            ((TreeMap) this.LLILLJJLI).remove(str);
        } else {
            ((TreeMap) this.LLILLJJLI).put(str, interfaceC19797112cz);
        }
    }

    public final void LJIJ(int i, InterfaceC19797112cz interfaceC19797112cz) {
        if (i <= 32468) {
            if (i >= 0) {
                if (interfaceC19797112cz == null) {
                    ((TreeMap) this.LL).remove(Integer.valueOf(i));
                    return;
                } else {
                    ((TreeMap) this.LL).put(Integer.valueOf(i), interfaceC19797112cz);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        throw new IllegalStateException("Array too large");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    @Override // X.InterfaceC19797112cz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC19797112cz LJIIJ(java.lang.String r26, final X.C19795712cl r27, java.util.List<X.InterfaceC19797112cz> r28) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19796612cu.LJIIJ(java.lang.String, X.12cl, java.util.List):X.12cz");
    }
}
