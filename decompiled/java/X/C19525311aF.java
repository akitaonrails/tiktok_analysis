package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11aF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19525311aF {
    public static long LIZ(InterfaceC19526511aR interfaceC19526511aR, List list) {
        List<InterfaceC19526611aS> listLLILIL = interfaceC19526511aR.LLILIL();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = 0;
        for (InterfaceC19526611aS interfaceC19526611aS : listLLILIL) {
            for (C19525911aL c19525911aL : interfaceC19526611aS.LJIILJJIL()) {
                jCurrentTimeMillis = Math.min(jCurrentTimeMillis, c19525911aL.LJ);
                jMax = Math.max(jMax, c19525911aL.LIZLLL);
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((AbstractC19524811aA) it2.next()).LIZ(interfaceC19526611aS, c19525911aL);
                }
            }
        }
        return jMax - jCurrentTimeMillis;
    }
}
