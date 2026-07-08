package X;

import Y.ARunnableS32S0400000_24;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0s9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616000s9e {
    public final C1616050s9j LIZ;
    public InterfaceC497601wk LIZLLL;
    public boolean LIZIZ = true;
    public List<? extends AbstractC1616100s9o> LIZJ = C13BV.INSTANCE;
    public final ArrayDeque<C1616020s9g> LJ = new ArrayDeque<>();
    public final IdentityHashMap<AbstractC1616100s9o, C09AE> LJFF = new IdentityHashMap<>();

    public C1616000s9e(C1616050s9j c1616050s9j) {
        this.LIZ = c1616050s9j;
    }

    public final void LIZ(List<? extends AbstractC1616100s9o> list, InterfaceC497601wk interfaceC497601wk) {
        Aweme aweme;
        if (!this.LIZIZ || list == null || interfaceC497601wk == null) {
            return;
        }
        while (!this.LJ.isEmpty()) {
            C1616020s9g c1616020s9g = (C1616020s9g) C13LP.LJJJJZ(this.LJ);
            if (c1616020s9g.LIZJ != null && (aweme = c1616020s9g.LIZIZ.LIZIZ) != null && aweme.getAwemeType() == 0 && !c1616020s9g.LIZLLL) {
                return;
            }
            C1616020s9g c1616020s9gRemoveFirst = this.LJ.removeFirst();
            C09AE c09ae = c1616020s9gRemoveFirst.LJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            c1616020s9gRemoveFirst.LJ = null;
            for (AbstractC1616100s9o abstractC1616100s9o : list) {
                C1616050s9j c1616050s9j = this.LIZ;
                c1616050s9j.LIZ.addLast(new ARunnableS32S0400000_24(this, abstractC1616100s9o, interfaceC497601wk, c1616020s9gRemoveFirst, 5));
                c1616050s9j.LIZ();
            }
        }
    }
}
