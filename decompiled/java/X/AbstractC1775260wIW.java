package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0wIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1775260wIW implements InterfaceC1775480wIs {
    public final ViewGroup LIZ;
    public final InterfaceC1773850wGF LIZIZ;
    public final InterfaceC1772410wDv LIZJ;
    public final C1773610wFr LIZLLL;
    public C1773610wFr<?> LJ;
    public boolean LJFF = true;

    public final C1773610wFr<?> LJFF() {
        if (this.LJ == null || this.LJFF) {
            Object parent = this.LIZ.getParent();
            ViewGroup viewGroup = null;
            if (parent instanceof View) {
                View view = (View) parent;
                while (true) {
                    if (view != null) {
                        if (!C1773610wFr.class.isInstance(view)) {
                            Object parent2 = view.getParent();
                            if (!(parent2 instanceof View)) {
                                break;
                            }
                            view = (View) parent2;
                        } else {
                            viewGroup = (ViewGroup) C1773610wFr.class.cast(view);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.LJ = (C1773610wFr) viewGroup;
            this.LJFF = false;
        }
        return this.LJ;
    }

    public AbstractC1775260wIW(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        C1773610wFr<?> c1773610wFrLJFF = LJFF();
        if (c1773610wFrLJFF != null) {
            this.LIZJ = C1774010wGV.LIZ(c1773610wFrLJFF.getMixMallController().LIZJ());
            this.LIZIZ = (InterfaceC1773850wGF) c1773610wFrLJFF.getMixMallController().LIZJ().getService(InterfaceC1773850wGF.class);
            this.LIZLLL = c1773610wFrLJFF;
        }
    }
}
