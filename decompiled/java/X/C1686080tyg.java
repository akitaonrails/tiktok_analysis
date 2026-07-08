package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686080tyg<V extends AbstractC1677260tkS> implements InterfaceC1677220tkO {
    public final InterfaceC1686210tyt LIZ;
    public V LIZIZ;
    public V LIZJ;
    public V LIZLLL;

    @Override // X.InterfaceC1677220tkO
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    public C1686080tyg(final InterfaceC1686130tyl interfaceC1686130tyl) {
        this(new InterfaceC1686210tyt() { // from class: X.0tyr
            @Override // X.InterfaceC1686210tyt
            public final InterfaceC1686130tyl get(int i) {
                return interfaceC1686130tyl;
            }
        });
    }

    public C1686080tyg(InterfaceC1686210tyt interfaceC1686210tyt) {
        this.LIZ = interfaceC1686210tyt;
    }

    @Override // X.InterfaceC1677220tkO
    public final long LIZLLL(V v, V v2, V v3) {
        int iLIZIZ = v.LIZIZ();
        long jMax = 0;
        for (int i = 0; i < iLIZIZ; i++) {
            jMax = Math.max(jMax, this.LIZ.get(i).LIZJ(v.LIZ(i), v2.LIZ(i), v3.LIZ(i)));
        }
        return jMax;
    }

    @Override // X.InterfaceC1677220tkO
    public final V LJ(V v, V v2, V v3) {
        if (this.LIZLLL == null) {
            this.LIZLLL = (V) v3.LIZJ();
        }
        V v4 = this.LIZLLL;
        if (v4 == null) {
            v4 = null;
        }
        int iLIZIZ = v4.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v5 = this.LIZLLL;
            if (v5 == null) {
                v5 = null;
            }
            v5.LJ(this.LIZ.get(i).LIZIZ(v.LIZ(i), v2.LIZ(i), v3.LIZ(i)), i);
        }
        V v6 = this.LIZLLL;
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // X.InterfaceC1677220tkO
    public final V LIZIZ(long j, V v, V v2, V v3) {
        if (this.LIZJ == null) {
            this.LIZJ = (V) v3.LIZJ();
        }
        V v4 = this.LIZJ;
        if (v4 == null) {
            v4 = null;
        }
        int iLIZIZ = v4.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v5 = this.LIZJ;
            if (v5 == null) {
                v5 = null;
            }
            v5.LJ(this.LIZ.get(i).LIZLLL(v.LIZ(i), v2.LIZ(i), v3.LIZ(i), j), i);
        }
        V v6 = this.LIZJ;
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // X.InterfaceC1677220tkO
    public final V LIZJ(long j, V v, V v2, V v3) {
        if (this.LIZIZ == null) {
            this.LIZIZ = (V) v.LIZJ();
        }
        V v4 = this.LIZIZ;
        if (v4 == null) {
            v4 = null;
        }
        int iLIZIZ = v4.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v5 = this.LIZIZ;
            if (v5 == null) {
                v5 = null;
            }
            v5.LJ(this.LIZ.get(i).LJ(v.LIZ(i), v2.LIZ(i), v3.LIZ(i), j), i);
        }
        V v6 = this.LIZIZ;
        if (v6 == null) {
            return null;
        }
        return v6;
    }
}
