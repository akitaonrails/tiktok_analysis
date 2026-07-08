package X;

import java.util.Collections;

/* JADX INFO: renamed from: X.0joO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295300joO<K, A> extends AbstractC1295190joD<K, A> {
    public final A LJIIIIZZ;

    @Override // X.AbstractC1295190joD
    public final float LIZJ() {
        return 1.0f;
    }

    @Override // X.AbstractC1295190joD
    public final A LJFF() {
        C1295400joY<A> c1295400joY = this.LJ;
        A a = this.LJIIIIZZ;
        float f = this.LIZLLL;
        return c1295400joY.LIZIZ(0.0f, 0.0f, a, a, f, f, f);
    }

    @Override // X.AbstractC1295190joD
    public final void LJIIIIZZ() {
        if (this.LJ != null) {
            super.LJIIIIZZ();
        }
    }

    @Override // X.AbstractC1295190joD
    public final void LJIIIZ(float f) {
        this.LIZLLL = f;
    }

    public C1295300joO(C1295400joY<A> c1295400joY, A a) {
        super(Collections.emptyList());
        LJIIJ(c1295400joY);
        this.LJIIIIZZ = a;
    }

    @Override // X.AbstractC1295190joD
    public final A LJI(C1294810jnb<K> c1294810jnb, float f) {
        return LJFF();
    }
}
