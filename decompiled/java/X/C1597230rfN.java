package X;

import com.ss.android.ugc.aweme.feed.module.FollowingEcLiveEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597230rfN implements InterfaceC1597210rfL<C1597400rfe>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597400rfe.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        InterfaceC1891350zJl interfaceC1891350zJlPrevious;
        List<InterfaceC1891350zJl> list = c1597320rfW.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1596040rdS) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        FollowingEcLiveEvent ecLiveEvent = ((C1596040rdS) C13LP.LJJJJZI(arrayList)).LL.getEcLiveEvent();
        if (ecLiveEvent != null && Intrinsics.LJFF(ecLiveEvent.isAfterStory(), Boolean.TRUE)) {
            ListIterator<InterfaceC1891350zJl> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    interfaceC1891350zJlPrevious = listIterator.previous();
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJlPrevious;
                    if ((interfaceC1891350zJl2 instanceof C1596360rdy) && !((C1596360rdy) interfaceC1891350zJl2).LL) {
                        break;
                    }
                } else {
                    interfaceC1891350zJlPrevious = null;
                    break;
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl3 = interfaceC1891350zJlPrevious;
            if (interfaceC1891350zJl3 == null) {
                return C13BV.INSTANCE;
            }
            String strLIZ = c1597320rfW.LIZ(interfaceC1891350zJl3);
            if (strLIZ == null) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1596040rdS c1596040rdS : C13LP.LJLJJLL(arrayList)) {
                String strLIZ2 = c1597320rfW.LIZ(c1596040rdS);
                if (strLIZ2 != null) {
                    arrayList2.add(new C1160310gIf(strLIZ2, c1596040rdS, strLIZ, C0N2L.AFTER));
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }
}
