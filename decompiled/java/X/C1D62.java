package X;

import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1D62, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D62 implements C1D65 {
    public final C1D66 LIZ;
    public final List<C1D60> LIZIZ = new ArrayList();
    public Set<? extends ILifecycleProducer> LIZJ;

    public C1D62(C1D66 c1d66) {
        this.LIZ = c1d66;
    }

    @Override // X.C1D65
    public final void LIZ(C1D61 c1d61, C1D3H c1d3h, C006Y c006y) {
        if (c1d3h == null) {
            c1d3h = C1D3H.EXEC_ON_MAIN;
        }
        C2250331D5z c2250331D5z = new C2250331D5z(c1d61, c1d3h, c006y, 4);
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C1D60) it2.next()).LIZ(c2250331D5z);
        }
    }
}
