package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677210tkN<T, V extends AbstractC1677260tkS> implements InterfaceC1677860tlQ<T, V> {
    public final InterfaceC1677220tkO<V> LIZ;
    public final InterfaceC1677290tkV<T, V> LIZIZ;
    public final T LIZJ;
    public final T LIZLLL;
    public final V LJ;
    public final V LJFF;
    public final V LJI;
    public long LJII;
    public V LJIIIIZZ;

    public C1677210tkN() {
        throw null;
    }

    @Override // X.InterfaceC1677860tlQ
    public final /* synthetic */ boolean LIZIZ(long j) {
        return C1676970tjz.LIZ(this, j);
    }

    @Override // X.InterfaceC1677860tlQ
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1677860tlQ
    public final long LIZJ() {
        if (this.LJII < 0) {
            this.LJII = this.LIZ.LIZLLL(this.LJ, this.LJFF, this.LJI);
        }
        return this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TargetBasedAnimation: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" -> ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",initial velocity: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", duration: ");
        sbLIZ.append(LIZJ() / 1000000);
        sbLIZ.append(" ms,animationSpec: ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1677860tlQ
    public final InterfaceC1677290tkV<T, V> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1677860tlQ
    public final T LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1677860tlQ
    public final T LJ(long j) {
        if (!C1676970tjz.LIZ(this, j)) {
            AbstractC1677260tkS abstractC1677260tkSLIZJ = this.LIZ.LIZJ(j, this.LJ, this.LJFF, this.LJI);
            int iLIZIZ = abstractC1677260tkSLIZJ.LIZIZ();
            for (int i = 0; i < iLIZIZ; i++) {
                if (!(!Float.isNaN(abstractC1677260tkSLIZJ.LIZ(i)))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AnimationVector cannot contain a NaN. ");
                    sbLIZ.append(abstractC1677260tkSLIZJ);
                    sbLIZ.append(". Animation: ");
                    sbLIZ.append(this);
                    sbLIZ.append(", playTimeNanos: ");
                    sbLIZ.append(j);
                    C1676960tjy.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return (T) this.LIZIZ.LIZIZ().invoke(abstractC1677260tkSLIZJ);
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1677860tlQ
    public final V LJI(long j) {
        if (!C1676970tjz.LIZ(this, j)) {
            return (V) this.LIZ.LIZIZ(j, this.LJ, this.LJFF, this.LJI);
        }
        V v = this.LJIIIIZZ;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.LIZ.LJ(this.LJ, this.LJFF, this.LJI);
        this.LJIIIIZZ = v2;
        return v2;
    }

    public /* synthetic */ C1677210tkN(InterfaceC1677030tk5 interfaceC1677030tk5, InterfaceC1677290tkV interfaceC1677290tkV, Object obj, Object obj2) {
        this(interfaceC1677030tk5, interfaceC1677290tkV, obj, obj2, null);
    }

    public C1677210tkN(InterfaceC1677030tk5<T> interfaceC1677030tk5, InterfaceC1677290tkV<T, V> interfaceC1677290tkV, T t, T t2, V v) {
        V v2;
        this.LIZ = interfaceC1677030tk5.LIZ(interfaceC1677290tkV);
        this.LIZIZ = interfaceC1677290tkV;
        this.LIZJ = t2;
        this.LIZLLL = t;
        this.LJ = interfaceC1677290tkV.LIZ().invoke(t);
        this.LJFF = interfaceC1677290tkV.LIZ().invoke(t2);
        if (v != null) {
            v2 = (V) C1677250tkR.LIZ(v);
        } else {
            v2 = (V) interfaceC1677290tkV.LIZ().invoke(t).LIZJ();
        }
        this.LJI = v2;
        this.LJII = -1L;
    }
}
