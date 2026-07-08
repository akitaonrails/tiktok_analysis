package X;

import Y.AComparatorS52S0000000_33;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.19uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21687219uA extends AbstractC21687419uC {
    public final List<C21687119u9> LIZ = new LinkedList();
    public final List<AbstractC21686119tz> LIZIZ = new LinkedList();
    public final List<AbstractC21686119tz> LIZJ = new LinkedList();
    public C21687119u9[] LIZLLL = null;
    public final AComparatorS52S0000000_33 LJ = new AComparatorS52S0000000_33(12);

    @Override // X.AbstractC21687419uC
    public final AbstractC21686119tz LIZ(int i) {
        C21687119u9[] c21687119u9Arr = this.LIZLLL;
        if (c21687119u9Arr == null || c21687119u9Arr.length == 0) {
            return null;
        }
        int length = c21687119u9Arr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            C21687119u9 c21687119u9 = this.LIZLLL[i3];
            if (c21687119u9.LIZ() > i) {
                length = i3 - 1;
            } else if (((Integer) c21687119u9.LIZ.LIZ.LIZIZ).intValue() < i) {
                i2 = i3 + 1;
            } else if (c21687119u9.LIZ() <= i && ((Integer) c21687119u9.LIZ.LIZ.LIZIZ).intValue() >= i) {
                return c21687119u9.LIZ;
            }
        }
        return null;
    }

    @Override // X.AbstractC21687419uC
    public final void LIZIZ(List<AbstractC21686119tz> list) {
        ((LinkedList) this.LIZIZ).clear();
        ((LinkedList) this.LIZJ).clear();
        ((LinkedList) this.LIZ).clear();
        if (list != null) {
            ListIterator<AbstractC21686119tz> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                AbstractC21686119tz next = listIterator.next();
                ((LinkedList) this.LIZIZ).add(next);
                ((LinkedList) this.LIZ).add(new C21687119u9(next));
            }
            while (listIterator.hasPrevious()) {
                ((LinkedList) this.LIZJ).add(listIterator.previous());
            }
            C21687119u9[] c21687119u9Arr = (C21687119u9[]) ((LinkedList) this.LIZ).toArray(new C21687119u9[0]);
            this.LIZLLL = c21687119u9Arr;
            Arrays.sort(c21687119u9Arr, this.LJ);
        }
    }
}
