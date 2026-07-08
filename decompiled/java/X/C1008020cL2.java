package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0cL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008020cL2 {
    public static final void LIZ(C1007900cKq c1007900cKq, AbstractC1003980cEW abstractC1003980cEW) {
        Iterator<Map.Entry<String, InterfaceC1007930cKt>> it2 = c1007900cKq.LJII.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().Mk(abstractC1003980cEW);
        }
    }
}
