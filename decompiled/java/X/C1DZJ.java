package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZJ implements C1DZQ {
    public final List<C1DZQ> LIZ = new ArrayList();

    @Override // X.C1DZQ
    public final void LIZ(EnumC2249791D3x enumC2249791D3x, EnumC2249791D3x enumC2249791D3x2, C1DZD c1dzd) {
        Iterator<C1DZQ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(enumC2249791D3x, enumC2249791D3x2, c1dzd);
        }
    }
}
