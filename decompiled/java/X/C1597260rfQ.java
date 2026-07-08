package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597260rfQ implements InterfaceC1597210rfL<C1597390rfd>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597390rfd.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        List<InterfaceC1891350zJl> list = c1597320rfW.LIZIZ;
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        List<InterfaceC1891350zJl> listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C1939607ik(list), AFwS264S0000000_24.get$arr$(10)));
        if (listLJJII.isEmpty()) {
            return C13BV.INSTANCE;
        }
        String strLIZ = c1597320rfW.LIZ((InterfaceC1891350zJl) ListProtector.get(list, 0));
        if (strLIZ == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : listLJJII) {
            String strLIZIZ = C1596950rev.LIZIZ(((InterfaceC714040Rze) interfaceC1891350zJl).getStoryCollection());
            if (!Intrinsics.LJFF(strLIZIZ, strLIZ)) {
                arrayList.add(new C1160290gId(strLIZIZ));
                arrayList.add(new C1160310gIf(strLIZIZ, interfaceC1891350zJl, strLIZ, C0N2L.BEFORE));
            }
        }
        return arrayList;
    }
}
