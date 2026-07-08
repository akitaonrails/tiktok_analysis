package X;

import com.lynx.tasm.LynxView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0kC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309950kC1 extends C1310070kCD {
    public final CopyOnWriteArrayList<C1310070kCD> LIZ = new CopyOnWriteArrayList<>();

    @Override // X.C1310070kCD, X.InterfaceC1310470kCr
    public final void onPerformanceEvent(C1310800kDO c1310800kDO) {
        Iterator<C1310070kCD> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onPerformanceEvent(c1310800kDO);
        }
    }

    @Override // X.C1310070kCD
    public final void LIZ(LynxView lynxView, C0N2X c0n2x) {
        Iterator<C1310070kCD> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(lynxView, c0n2x);
        }
    }
}
