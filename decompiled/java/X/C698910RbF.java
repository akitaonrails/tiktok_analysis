package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0RbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698910RbF {
    public final List<AbstractC700550Rdt> LIZ = new ArrayList();
    public final List<C700540Rds> LIZIZ = new CopyOnWriteArrayList();
    public final List<C700520Rdq> LIZJ = new ArrayList();

    public final void LIZ(AbstractC700550Rdt abstractC700550Rdt) {
        try {
            if (abstractC700550Rdt instanceof C700530Rdr) {
                ((ArrayList) this.LIZ).add(abstractC700550Rdt);
            } else if (abstractC700550Rdt instanceof C700520Rdq) {
                ((ArrayList) this.LIZJ).add(abstractC700550Rdt);
            } else if (abstractC700550Rdt instanceof C700540Rds) {
                ((CopyOnWriteArrayList) this.LIZIZ).add(abstractC700550Rdt);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
