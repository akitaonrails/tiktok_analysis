package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597280rfS implements InterfaceC1597210rfL<C1597180rfI>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597180rfI.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        InterfaceC1891350zJl next;
        InterfaceC1597940rgW onThisDayService = C1618440sDa.LIZIZ.LJJIIZI().getOnThisDayService();
        if (onThisDayService == null) {
            return C13BV.INSTANCE;
        }
        if (!onThisDayService.LIZLLL()) {
            return C13BV.INSTANCE;
        }
        List<InterfaceC1891350zJl> list = c1597320rfW.LIZIZ;
        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1598870ri1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl = next;
        if (interfaceC1891350zJl == null) {
            return C13BV.INSTANCE;
        }
        Integer numLIZIZ = onThisDayService.LIZIZ(list);
        if (numLIZIZ != null) {
            int iIntValue = numLIZIZ.intValue();
            if (list.indexOf(interfaceC1891350zJl) == iIntValue + 1) {
                return C13BV.INSTANCE;
            }
            String strLIZ = c1597320rfW.LIZ((InterfaceC1891350zJl) ListProtector.get(list, iIntValue));
            if (strLIZ == null) {
                return C13BV.INSTANCE;
            }
            String strLIZ2 = c1597320rfW.LIZ.LIZ(interfaceC1891350zJl);
            if (strLIZ2 != null) {
                return C1697810uHb.LJIIJJI(new C1160290gId(strLIZ2), new C1160310gIf(strLIZ2, interfaceC1891350zJl, strLIZ, C0N2L.AFTER));
            }
            throw new IllegalArgumentException("Item not found in ItemIndex");
        }
        return C13BV.INSTANCE;
    }
}
