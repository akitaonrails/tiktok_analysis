package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS33S0200100_25;

/* JADX INFO: renamed from: X.0tjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676470tjB extends C09AY implements Function2<InterfaceC1672350tcX, C1682380tsi, InterfaceC1690350u5Z> {
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C14XN LLILLL;
    public final /* synthetic */ C1691540u7U LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676470tjB(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, float f, C14XN c14xn, C1691540u7U c1691540u7U) {
        super(2);
        this.LL = function2;
        this.LLILLJJLI = f;
        this.LLILLL = c14xn;
        this.LLILZ = c1691540u7U;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC1690350u5Z invoke(InterfaceC1672350tcX interfaceC1672350tcX, C1682380tsi c1682380tsi) {
        InterfaceC1672350tcX interfaceC1672350tcX2 = interfaceC1672350tcX;
        long j = c1682380tsi.LIZ;
        ArrayList arrayList = new ArrayList();
        List<InterfaceC1673370teB> listLJJLIL = interfaceC1672350tcX2.LJJLIL(EnumC1676480tjC.LLILLJJLI, this.LL);
        List<InterfaceC1673370teB> listLJJLIL2 = interfaceC1672350tcX2.LJJLIL(EnumC1676480tjC.LLILLL, this.LL);
        List<InterfaceC1673370teB> listLJJLIL3 = interfaceC1672350tcX2.LJJLIL(EnumC1676480tjC.LL, this.LL);
        int size = listLJJLIL3.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j) / 2;
        int i2 = 0;
        while (true) {
            if (i2 >= listLJJLIL3.size()) {
                break;
            }
            if (i2 == listLJJLIL3.size() - 1) {
                arrayList.add(Collections.singletonList(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(j)));
                break;
            }
            AbstractC1686530tzP abstractC1686530tzPLIZ = LIZ(i2, arrayList2, listLJJLIL3);
            int i3 = i2 + 1;
            AbstractC1686530tzP abstractC1686530tzPLIZ2 = LIZ(i3, arrayList2, listLJJLIL3);
            if (abstractC1686530tzPLIZ.LJJLI() <= iLJIIIIZZ && abstractC1686530tzPLIZ2.LJJLI() <= iLJIIIIZZ) {
                long jLIZ = C1682390tsj.LIZ(0, iLJIIIIZZ, 0, Integer.MAX_VALUE);
                arrayList.add(C1697810uHb.LJIIJJI(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(jLIZ), ((InterfaceC1673370teB) ListProtector.get(listLJJLIL2, i3)).LJJJJZ(jLIZ)));
            } else if (abstractC1686530tzPLIZ.LJJLI() + abstractC1686530tzPLIZ2.LJJLI() <= C1682380tsi.LJIIIIZZ(j)) {
                arrayList.add(C1697810uHb.LJIIJJI(abstractC1686530tzPLIZ, ((InterfaceC1673370teB) ListProtector.get(listLJJLIL2, i3)).LJJJJZ(C1682390tsj.LIZ(0, C1682380tsi.LJIIIIZZ(j) - abstractC1686530tzPLIZ.LJJLI(), 0, Integer.MAX_VALUE))));
            } else {
                int iLJJLI = abstractC1686530tzPLIZ.LJJLI() + abstractC1686530tzPLIZ2.LJJLI();
                int iLJJLI2 = (abstractC1686530tzPLIZ.LJJLI() * C1682380tsi.LJIIIIZZ(j)) / iLJJLI;
                C1676490tjD c1676490tjD = (C1676490tjD) abstractC1686530tzPLIZ.LJJJ();
                int i4 = iLJJLI2 - ((int) (c1676490tjD.LIZLLL * this.LLILLJJLI));
                C14XN c14xn = this.LLILLL;
                C1691540u7U c1691540u7U = this.LLILZ;
                c14xn.getClass();
                if (C14XN.LJJIJ(c1676490tjD, c1691540u7U, i4)) {
                    arrayList.add(Collections.singletonList(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(j)));
                } else {
                    int iLJJLI3 = (abstractC1686530tzPLIZ2.LJJLI() * C1682380tsi.LJIIIIZZ(j)) / iLJJLI;
                    C1676490tjD c1676490tjD2 = (C1676490tjD) abstractC1686530tzPLIZ2.LJJJ();
                    int i5 = iLJJLI3 - ((int) (c1676490tjD2.LIZLLL * this.LLILLJJLI));
                    C14XN c14xn2 = this.LLILLL;
                    C1691540u7U c1691540u7U2 = this.LLILZ;
                    c14xn2.getClass();
                    if (C14XN.LJJIJ(c1676490tjD2, c1691540u7U2, i5)) {
                        arrayList.add(Collections.singletonList(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(j)));
                    } else {
                        arrayList.add(C1697810uHb.LJIIJJI(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(C1682390tsj.LIZ(0, iLJJLI2, 0, Integer.MAX_VALUE)), ((InterfaceC1673370teB) ListProtector.get(listLJJLIL2, i3)).LJJJJZ(C1682390tsj.LIZ(0, iLJJLI3, 0, Integer.MAX_VALUE))));
                        i2 += 2;
                    }
                }
                i2 = i3;
            }
            i2 += 2;
        }
        int iLJJL = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iLJJL += ((AbstractC1686530tzP) C13LP.LJJJJZI((List) it2.next())).LJJL();
        }
        return interfaceC1672350tcX2.LJLJJL(C1682380tsi.LJIIIIZZ(j), iLJJL, C2097608Jq.LJ(), new AwS33S0200100_25((List) arrayList, (List<List<AbstractC1686530tzP>>) interfaceC1672350tcX2, (InterfaceC1672350tcX) j, 2L));
    }

    public static final AbstractC1686530tzP LIZ(int i, List list, List list2) {
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i);
        if (abstractC1686530tzP != null) {
            return abstractC1686530tzP;
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) ListProtector.get(list2, i)).LJJJJZ(C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE));
        ListProtector.set(list, i, abstractC1686530tzPLJJJJZ);
        return abstractC1686530tzPLJJJJZ;
    }
}
