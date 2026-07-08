package X;

import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1293310jlB<K, A> {
    public final List<? extends C1293200jl0<K>> LIZJ;
    public C1292420jjk<A> LJ;
    public C1293200jl0<K> LJFF;
    public final List<InterfaceC1293690jln> LIZ = new ArrayList();
    public boolean LIZIZ = false;
    public float LIZLLL = 0.0f;

    public abstract A LJFF(C1293200jl0<K> c1293200jl0, float f);

    public void LJI() {
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC1293690jln) ListProtector.get(this.LIZ, i)).LIZJ();
        }
    }

    public final C1293200jl0<K> LIZIZ() {
        C1293200jl0<K> c1293200jl0 = this.LJFF;
        if (c1293200jl0 != null && c1293200jl0.LIZ(this.LIZLLL)) {
            return this.LJFF;
        }
        C1293200jl0<K> c1293200jl02 = (C1293200jl0) ListProtector.get(this.LIZJ, r1.size() - 1);
        if (this.LIZLLL < c1293200jl02.LIZJ()) {
            for (int size = this.LIZJ.size() - 1; size >= 0; size--) {
                c1293200jl02 = (C1293200jl0) ListProtector.get(this.LIZJ, size);
                if (c1293200jl02.LIZ(this.LIZLLL)) {
                    break;
                }
            }
        }
        this.LJFF = c1293200jl02;
        return c1293200jl02;
    }

    public float LIZJ() {
        if (this.LIZJ.isEmpty()) {
            return 1.0f;
        }
        return ((C1293200jl0) ListProtector.get(this.LIZJ, r1.size() - 1)).LIZIZ();
    }

    public final float LIZLLL() {
        if (this.LIZIZ) {
            return 0.0f;
        }
        C1293200jl0<K> c1293200jl0LIZIZ = LIZIZ();
        if (c1293200jl0LIZIZ.LIZLLL == null) {
            return 0.0f;
        }
        return (this.LIZLLL - c1293200jl0LIZIZ.LIZJ()) / (c1293200jl0LIZIZ.LIZIZ() - c1293200jl0LIZIZ.LIZJ());
    }

    public A LJ() {
        C1293200jl0<K> c1293200jl0LIZIZ = LIZIZ();
        Interpolator interpolator = LIZIZ().LIZLLL;
        return LJFF(c1293200jl0LIZIZ, interpolator == null ? 0.0f : interpolator.getInterpolation(LIZLLL()));
    }

    public AbstractC1293310jlB(List<? extends C1293200jl0<K>> list) {
        this.LIZJ = list;
    }

    public final void LIZ(InterfaceC1293690jln interfaceC1293690jln) {
        ((ArrayList) this.LIZ).add(interfaceC1293690jln);
    }

    public void LJII(float f) {
        float fLIZJ;
        if (this.LIZJ.isEmpty()) {
            fLIZJ = 0.0f;
        } else {
            fLIZJ = ((C1293200jl0) ListProtector.get(this.LIZJ, 0)).LIZJ();
        }
        if (f < fLIZJ) {
            if (this.LIZJ.isEmpty()) {
                f = 0.0f;
            } else {
                f = ((C1293200jl0) ListProtector.get(this.LIZJ, 0)).LIZJ();
            }
        } else if (f > LIZJ()) {
            f = LIZJ();
        }
        if (f == this.LIZLLL) {
            return;
        }
        this.LIZLLL = f;
        LJI();
    }

    public final void LJIIIIZZ(C1292420jjk<A> c1292420jjk) {
        C1292420jjk<A> c1292420jjk2 = this.LJ;
        if (c1292420jjk2 != null) {
            c1292420jjk2.getClass();
        }
        this.LJ = c1292420jjk;
    }
}
