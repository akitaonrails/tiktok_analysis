package X;

import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0joD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1295190joD<K, A> {
    public final InterfaceC1295420joa<K> LIZJ;
    public C1295400joY<A> LJ;
    public final List<InterfaceC1294590jnF> LIZ = new ArrayList(1);
    public boolean LIZIZ = false;
    public float LIZLLL = 0.0f;
    public A LJFF = null;
    public float LJI = -1.0f;
    public float LJII = -1.0f;

    public abstract A LJI(C1294810jnb<K> c1294810jnb, float f);

    public void LJIIIIZZ() {
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC1294590jnF) ListProtector.get(this.LIZ, i)).LIZJ();
        }
    }

    public final C1294810jnb<K> LIZIZ() {
        return this.LIZJ.LIZIZ();
    }

    public float LIZJ() {
        if (this.LJII == -1.0f) {
            this.LJII = this.LIZJ.LIZLLL();
        }
        return this.LJII;
    }

    public final float LJ() {
        if (this.LIZIZ) {
            return 0.0f;
        }
        C1294810jnb<K> c1294810jnbLIZIZ = LIZIZ();
        if (c1294810jnbLIZIZ.LIZJ()) {
            return 0.0f;
        }
        return (this.LIZLLL - c1294810jnbLIZIZ.LIZIZ()) / (c1294810jnbLIZIZ.LIZ() - c1294810jnbLIZIZ.LIZIZ());
    }

    public final float LIZLLL() {
        C1294810jnb<K> c1294810jnbLIZIZ = LIZIZ();
        if (c1294810jnbLIZIZ == null || c1294810jnbLIZIZ.LIZJ()) {
            return 0.0f;
        }
        return c1294810jnbLIZIZ.LIZLLL.getInterpolation(LJ());
    }

    public A LJFF() {
        float fLJ = LJ();
        if (this.LJ == null && this.LIZJ.LIZ(fLJ)) {
            return this.LJFF;
        }
        C1294810jnb<K> c1294810jnbLIZIZ = LIZIZ();
        Interpolator interpolator = c1294810jnbLIZIZ.LJ;
        A aLJI = (interpolator == null || c1294810jnbLIZIZ.LJFF == null) ? LJI(c1294810jnbLIZIZ, LIZLLL()) : LJII(c1294810jnbLIZIZ, fLJ, interpolator.getInterpolation(fLJ), c1294810jnbLIZIZ.LJFF.getInterpolation(fLJ));
        this.LJFF = aLJI;
        return aLJI;
    }

    public AbstractC1295190joD(final List<? extends C1294810jnb<K>> list) {
        InterfaceC1295420joa<K> interfaceC1295420joa;
        if (list.isEmpty()) {
            interfaceC1295420joa = (InterfaceC1295420joa<K>) new InterfaceC1295420joa<T>() { // from class: X.0joc
                @Override // X.InterfaceC1295420joa
                public final boolean LIZJ(float f) {
                    return false;
                }

                @Override // X.InterfaceC1295420joa
                public final float LIZLLL() {
                    return 1.0f;
                }

                @Override // X.InterfaceC1295420joa
                public final float LJ() {
                    return 0.0f;
                }

                @Override // X.InterfaceC1295420joa
                public final boolean isEmpty() {
                    return true;
                }

                @Override // X.InterfaceC1295420joa
                public final C1294810jnb<T> LIZIZ() {
                    throw new IllegalStateException("not implemented");
                }

                @Override // X.InterfaceC1295420joa
                public final boolean LIZ(float f) {
                    throw new IllegalStateException("not implemented");
                }
            };
        } else if (list.size() == 1) {
            interfaceC1295420joa = (InterfaceC1295420joa<K>) new InterfaceC1295420joa<T>(list) { // from class: X.0joX
                public final C1294810jnb<T> LIZ;
                public float LIZIZ = -1.0f;

                @Override // X.InterfaceC1295420joa
                public final boolean isEmpty() {
                    return false;
                }

                @Override // X.InterfaceC1295420joa
                public final float LIZLLL() {
                    return this.LIZ.LIZ();
                }

                @Override // X.InterfaceC1295420joa
                public final float LJ() {
                    return this.LIZ.LIZIZ();
                }

                @Override // X.InterfaceC1295420joa
                public final C1294810jnb<T> LIZIZ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = (C1294810jnb) ListProtector.get(list, 0);
                }

                @Override // X.InterfaceC1295420joa
                public final boolean LIZ(float f) {
                    if (this.LIZIZ == f) {
                        return true;
                    }
                    this.LIZIZ = f;
                    return false;
                }

                @Override // X.InterfaceC1295420joa
                public final boolean LIZJ(float f) {
                    return !this.LIZ.LIZJ();
                }
            };
        } else {
            interfaceC1295420joa = (InterfaceC1295420joa<K>) new InterfaceC1295420joa<T>(list) { // from class: X.0joR
                public final List<? extends C1294810jnb<T>> LIZ;
                public C1294810jnb<T> LIZJ;
                public float LIZLLL = -1.0f;
                public C1294810jnb<T> LIZIZ = LJFF(0.0f);

                @Override // X.InterfaceC1295420joa
                public final boolean isEmpty() {
                    return false;
                }

                @Override // X.InterfaceC1295420joa
                public final float LIZLLL() {
                    return ((C1294810jnb) ListProtector.get(this.LIZ, r1.size() - 1)).LIZ();
                }

                @Override // X.InterfaceC1295420joa
                public final float LJ() {
                    return ((C1294810jnb) ListProtector.get(this.LIZ, 0)).LIZIZ();
                }

                @Override // X.InterfaceC1295420joa
                public final C1294810jnb<T> LIZIZ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = list;
                }

                @Override // X.InterfaceC1295420joa
                public final boolean LIZ(float f) {
                    C1294810jnb<T> c1294810jnb = this.LIZJ;
                    C1294810jnb<T> c1294810jnb2 = this.LIZIZ;
                    if (c1294810jnb == c1294810jnb2 && this.LIZLLL == f) {
                        return true;
                    }
                    this.LIZJ = c1294810jnb2;
                    this.LIZLLL = f;
                    return false;
                }

                @Override // X.InterfaceC1295420joa
                public final boolean LIZJ(float f) {
                    C1294810jnb<T> c1294810jnb = this.LIZIZ;
                    if (f >= c1294810jnb.LIZIZ() && f < c1294810jnb.LIZ()) {
                        return !this.LIZIZ.LIZJ();
                    }
                    this.LIZIZ = LJFF(f);
                    return true;
                }

                public final C1294810jnb<T> LJFF(float f) {
                    List<? extends C1294810jnb<T>> list2 = this.LIZ;
                    C1294810jnb<T> c1294810jnb = (C1294810jnb) ListProtector.get(list2, list2.size() - 1);
                    if (f >= c1294810jnb.LIZIZ()) {
                        return c1294810jnb;
                    }
                    for (int size = this.LIZ.size() - 2; size >= 1; size--) {
                        C1294810jnb<T> c1294810jnb2 = (C1294810jnb) ListProtector.get(this.LIZ, size);
                        if (this.LIZIZ != c1294810jnb2 && f >= c1294810jnb2.LIZIZ() && f < c1294810jnb2.LIZ()) {
                            return c1294810jnb2;
                        }
                    }
                    return (C1294810jnb) ListProtector.get(this.LIZ, 0);
                }
            };
        }
        this.LIZJ = interfaceC1295420joa;
    }

    public final void LIZ(InterfaceC1294590jnF interfaceC1294590jnF) {
        ((ArrayList) this.LIZ).add(interfaceC1294590jnF);
    }

    public void LJIIIZ(float f) {
        if (this.LIZJ.isEmpty()) {
            return;
        }
        if (this.LJI == -1.0f) {
            this.LJI = this.LIZJ.LJ();
        }
        float f2 = this.LJI;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.LJI = this.LIZJ.LJ();
            }
            f = this.LJI;
        } else if (f > LIZJ()) {
            f = LIZJ();
        }
        if (f == this.LIZLLL) {
            return;
        }
        this.LIZLLL = f;
        if (this.LIZJ.LIZJ(f)) {
            LJIIIIZZ();
        }
    }

    public final void LJIIJ(C1295400joY<A> c1295400joY) {
        C1295400joY<A> c1295400joY2 = this.LJ;
        if (c1295400joY2 != null) {
            c1295400joY2.getClass();
        }
        this.LJ = c1295400joY;
    }

    public A LJII(C1294810jnb<K> c1294810jnb, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
