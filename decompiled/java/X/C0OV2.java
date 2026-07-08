package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OV2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV2 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(584));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(585));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(586));

    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C0OV4>> LIZ() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final void LIZIZ(C0OV4 c0ov4, String str) {
        InterfaceC1548390qOb interfaceC1548390qOb;
        if (str == null) {
            return;
        }
        CopyOnWriteArrayList<C0OV4> copyOnWriteArrayList = LIZ().get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            LIZ().put(str, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c0ov4)) {
            return;
        }
        copyOnWriteArrayList.add(c0ov4);
        LIZ().put(str, copyOnWriteArrayList);
        for (C0OV3 c0ov3 : (CopyOnWriteArrayList) this.LIZ.getValue()) {
            if (Intrinsics.LJFF(c0ov3.LL, str) && c0ov4.LIZIZ <= c0ov3.LLILLJJLI && (interfaceC1548390qOb = c0ov4.LIZJ) != null) {
                interfaceC1548390qOb.H4(c0ov3.LLILLL, str);
            }
        }
    }
}
