package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1532800pzS(inputClass = C1531820pxs.class, outputClass = InputStream.class)
public final class C1531650pxb extends AbstractC1532320pyg<C1531820pxs, InputStream> {
    public static final C1531650pxb LIZJ = new C1531650pxb();

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC1532320pyg
    public final int LJI() {
        return 3;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "Cache2Stream";
    }

    public C1531650pxb() {
        super(C1531820pxs.class, InputStream.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532320pyg
    public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
        Object c098200Yq;
        try {
            InputStream inputStreamLJI = ((C1531820pxs) abstractC1532350pyj.LIZ).LJI(c1532710pzJ);
            if (inputStreamLJI != null) {
                c098200Yq = new C1531000pwY(inputStreamLJI, null);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        function1.invoke(new C1532340pyi((AbstractC1532350pyj) c098200Yq, null));
    }
}
