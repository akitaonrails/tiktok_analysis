package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895420zQK extends C09AY implements Function2<C03H5, C1870440ym2, Unit> {
    public C1895420zQK() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C1870440ym2 c1870440ym2) {
        C1900180zY0 c1900180zY0 = C1900180zY0.LL;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List listLJFF = C2178808gE.LIZ().LJFF(5);
        if (listLJFF != null && !listLJFF.isEmpty()) {
            Iterator<T> it2 = C1900200zY2.LJFF.getValue().values().iterator();
            while (it2.hasNext()) {
                ((C1900200zY2) it2.next()).LIZIZ();
            }
        }
        return Unit.LIZ;
    }
}
