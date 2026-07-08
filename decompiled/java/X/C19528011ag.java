package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19528011ag extends AbstractC19529311at {
    public static final C19528011ag LIZIZ = new C19528011ag();

    @Override // X.AbstractC19529311at
    public final AbstractC19527711ad LIZ() {
        AbstractC19527711ad abstractC19527711ad = new AbstractC19527711ad() { // from class: X.11aT
            @Override // X.AbstractC19527711ad
            public final List<List<InterfaceC19526611aS>> LIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
                int i;
                List<InterfaceC19526611aS> listLLILIL = interfaceC19526511aR.LLILIL();
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC19526611aS> it2 = listLLILIL.iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC19526611aS next = it2.next();
                    InterfaceC19526611aS interfaceC19526611aS = next;
                    if (interfaceC19526611aS.LJJI() && !interfaceC19526611aS.LJIILIIL()) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("maxTeamItemSize = ");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(" , totalValidSize  = ");
                sbLIZ.append(size);
                sbLIZ.append(" , taskItemsSize = ");
                sbLIZ.append(list.size());
                C2188811AlT.LIZIZ(sbLIZ);
                C19529611aw.LIZ();
                int i2 = this.LIZJ;
                if (i2 >= size) {
                    if (size != list.size()) {
                        return null;
                    }
                    return Collections.singletonList(list);
                }
                if (i2 == list.size()) {
                    return Collections.singletonList(list);
                }
                if (this.LIZJ < list.size()) {
                    List<List<InterfaceC19526611aS>> listLJJJIL = C13LP.LJJJIL(list, this.LIZJ);
                    if (((List) C13LP.LJJLIIIJJI(listLJJJIL)).size() == this.LIZJ || list.size() == size) {
                        return listLJJJIL;
                    }
                    return listLJJJIL.subList(0, listLJJJIL.size() - 1);
                }
                if (this.LIZJ > list.size()) {
                    List<InterfaceC19526611aS> listLLILIL2 = interfaceC19526511aR.LLILIL();
                    ArrayList<InterfaceC19526611aS> arrayList2 = new ArrayList();
                    for (InterfaceC19526611aS interfaceC19526611aS2 : listLLILIL2) {
                        InterfaceC19526611aS interfaceC19526611aS3 = interfaceC19526611aS2;
                        if (interfaceC19526611aS3.LJJI() && !interfaceC19526611aS3.LJIILIIL()) {
                            arrayList2.add(interfaceC19526611aS2);
                        }
                    }
                    for (InterfaceC19526611aS interfaceC19526611aS4 : arrayList2) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(interfaceC19526611aS4.LJIL());
                        arrayList3.addAll(interfaceC19526611aS4.LJIJ());
                        if (!C13LP.LJJJJ(this.LIZ, arrayList3)) {
                            i++;
                        }
                    }
                    if (i < this.LIZJ) {
                        return Collections.singletonList(list);
                    }
                }
                return null;
            }
        };
        abstractC19527711ad.LIZIZ = LIZIZ.LIZ;
        return abstractC19527711ad;
    }
}
