package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0qp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564770qp1 implements InterfaceC1690390u5d {
    public final int LIZ;
    public final int LIZIZ;
    public final List<C1557910qdx> LIZJ;
    public boolean LIZLLL;

    public C1564770qp1() {
        this(0, 3);
    }

    @Override // X.InterfaceC1690390u5d
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC1690390u5d
    public final void LIZLLL(InterfaceC1564820qp6 interfaceC1564820qp6) {
        int index;
        IntRange intRange;
        if (!((ArrayList) this.LIZJ).isEmpty() && !interfaceC1564820qp6.LJII().isEmpty()) {
            if (this.LIZLLL) {
                index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
            } else {
                index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
            }
            if (this.LIZLLL) {
                intRange = C13LZ.LJIILJJIL(index, this.LIZ + index);
            } else {
                intRange = new IntRange((index - this.LIZ) + 1, index);
            }
            C19719612Di.LJJIIJ(this.LIZJ, new AwS603S0100000_24(intRange, 622), true);
        }
    }

    public C1564770qp1(int i, int i2) {
        i = (i2 & 1) != 0 ? 3 : i;
        int i3 = (i2 & 2) == 0 ? 0 : 2;
        this.LIZ = i;
        this.LIZIZ = i3;
        this.LIZJ = new ArrayList();
    }

    @Override // X.InterfaceC1690390u5d
    public final void LIZ(InterfaceC1564790qp3 interfaceC1564790qp3, int i) {
        int i2 = this.LIZIZ;
        for (int i3 = 0; i3 < i2; i3++) {
            interfaceC1564790qp3.LIZ(i + i3);
        }
    }

    @Override // X.InterfaceC1690390u5d
    public final void LIZJ(C1690170u5H c1690170u5H, float f, InterfaceC1564820qp6 interfaceC1564820qp6) {
        boolean z;
        int index;
        InterfaceC1564810qp5 interfaceC1564810qp5;
        InterfaceC1564810qp5 interfaceC1564810qp52;
        int i;
        if (interfaceC1564820qp6.LJII().isEmpty()) {
            return;
        }
        if (f < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        int iLJFF = interfaceC1564820qp6.LJFF();
        if (this.LIZLLL != z) {
            Iterator it2 = ((ArrayList) this.LIZJ).iterator();
            while (it2.hasNext()) {
                ((C1557910qdx) it2.next()).LIZIZ.cancel();
            }
            ((ArrayList) this.LIZJ).clear();
            this.LIZLLL = z;
        }
        if (z) {
            index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
        } else {
            index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, this.LIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it3 = intRangeLJIILJJIL.iterator();
        while (it3.LLILLL) {
            int iNextInt = it3.nextInt();
            if (z) {
                i = iNextInt + index;
            } else {
                i = index - iNextInt;
            }
            arrayList.add(Integer.valueOf(i));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue >= 0 && iIntValue < iLJFF) {
                arrayList2.add(obj);
            }
        }
        List<C1557910qdx> list = this.LIZJ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it4 = ((ArrayList) list).iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((C1557910qdx) it4.next()).LIZ));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList3);
        C19719612Di.LJJIIJ(this.LIZJ, new AwS603S0100000_24(arrayList2, (List<? extends InterfaceC1594550rb3>) 621), true);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            int iIntValue2 = ((Number) it5.next()).intValue();
            if (!setLLIIJI.contains(Integer.valueOf(iIntValue2))) {
                ((ArrayList) this.LIZJ).add(new C1557910qdx(iIntValue2, c1690170u5H.LIZ(iIntValue2)));
            }
        }
        Integer num = (Integer) C13LP.LJJJLL(arrayList2);
        if (num != null) {
            int iIntValue3 = num.intValue();
            Object obj2 = null;
            if (z) {
                C06XG c06xg = (C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII());
                if (((c06xg.getOffset() + c06xg.getSize()) + interfaceC1564820qp6.LJI()) - interfaceC1564820qp6.LIZIZ() < (-f)) {
                    Iterator it6 = ((ArrayList) this.LIZJ).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next = it6.next();
                        if (((C1557910qdx) next).LIZ == iIntValue3) {
                            obj2 = next;
                            break;
                        }
                    }
                    C1557910qdx c1557910qdx = (C1557910qdx) obj2;
                    if (c1557910qdx != null && (interfaceC1564810qp52 = c1557910qdx.LIZIZ) != null) {
                        interfaceC1564810qp52.LIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            if (interfaceC1564820qp6.LIZLLL() - ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getOffset() >= f) {
                return;
            }
            Iterator it7 = ((ArrayList) this.LIZJ).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next2 = it7.next();
                if (((C1557910qdx) next2).LIZ == iIntValue3) {
                    obj2 = next2;
                    break;
                }
            }
            C1557910qdx c1557910qdx2 = (C1557910qdx) obj2;
            if (c1557910qdx2 == null || (interfaceC1564810qp5 = c1557910qdx2.LIZIZ) == null) {
                return;
            }
            interfaceC1564810qp5.LIZ();
        }
    }
}
