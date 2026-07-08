package X;

import Y.ARunnableS20S0500000_32;
import Y.ARunnableS85S0200000_16;
import android.view.View;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: renamed from: X.1915, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1915 extends AbstractC214793194d {
    public final Map<String, C191C> LJ;
    public final AbstractC214710190y LJFF;
    public final AnonymousClass1912 LJI;
    public final AbstractC214793194d LJII;
    public final int LJIIIIZZ;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public AnonymousClass1915(Map map) {
        C21392618nk c21392618nk = new C21392618nk();
        AnonymousClass1912 anonymousClass1912 = AnonymousClass1912.FALLBACK;
        this.LJIIIIZZ = -1;
        this.LJ = map;
        this.LJFF = null;
        this.LJI = anonymousClass1912;
        this.LJII = c21392618nk;
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (!c214795194f.LIZLLL) {
            if (!c214795194f2.LIZLLL) {
                View view = c214795194f.LIZIZ;
                View view2 = c214795194f2.LIZIZ;
                this.LIZ.addView(view);
                C786410Ut5.LJLLLLLL(0, view);
                ARunnableS20S0500000_32 aRunnableS20S0500000_32 = new ARunnableS20S0500000_32(c214795194f, c214795194f2, runnable, c1447920nmY, this, 3);
                C214711190z c214711190z = new C214711190z(this.LJ, this.LJFF);
                int i = this.LJIIIIZZ;
                if (i >= 0) {
                    c214711190z.LIZJ = i;
                }
                c214711190z.LIZ(view, view2, new ARunnableS85S0200000_16(view, runnable, 73), c1447920nmY, this.LJI, aRunnableS20S0500000_32);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedElement pop animation don't support translucent destination scene: ");
            sbLIZ.append(c214795194f2.LIZ);
            sbLIZ.append(", source scene: ");
            sbLIZ.append(c214795194f.LIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SharedElement pop animation don't support translucent source scene: ");
        sbLIZ2.append(c214795194f.LIZ);
        sbLIZ2.append(", destination scene: ");
        sbLIZ2.append(c214795194f2.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
        if (!c214795194f.LIZLLL) {
            if (!c214795194f2.LIZLLL) {
                View view = c214795194f.LIZIZ;
                C786410Ut5.LJLLLLLL(0, view);
                View view2 = c214795194f2.LIZIZ;
                C214711190z c214711190z = new C214711190z(this.LJ, this.LJFF);
                int i = this.LJIIIIZZ;
                if (i >= 0) {
                    c214711190z.LIZJ = i;
                }
                c214711190z.LIZIZ(view, view2, new RunnableC514501zT(view, runnable, 43), c1447920nmY, this.LJI, new ARunnableS20S0500000_32(c214795194f, c214795194f2, runnable, c1447920nmY, this, 2));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedElement push animation don't support translucent destination scene: ");
            sbLIZ.append(c214795194f2.LIZ);
            sbLIZ.append(", source scene: ");
            sbLIZ.append(c214795194f.LIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SharedElement push animation don't support translucent source scene: ");
        sbLIZ2.append(c214795194f.LIZ);
        sbLIZ2.append(", destination scene: ");
        sbLIZ2.append(c214795194f2.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
