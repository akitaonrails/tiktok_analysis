package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677870tlR<V extends AbstractC1677260tkS> implements InterfaceC1677890tlT<V> {
    public final InterfaceC1677930tlX LIZ;
    public V LIZIZ;
    public V LIZJ;
    public V LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC1677890tlT
    public final float LIZ() {
        return this.LJ;
    }

    public C1677870tlR(InterfaceC1677930tlX interfaceC1677930tlX) {
        this.LIZ = interfaceC1677930tlX;
        this.LJ = interfaceC1677930tlX.LIZ();
    }

    public final long LIZLLL(V v, V v2) {
        if (this.LIZJ == null) {
            this.LIZJ = (V) v.LIZJ();
        }
        V v3 = this.LIZJ;
        if (v3 == null) {
            v3 = null;
        }
        int iLIZIZ = v3.LIZIZ();
        long jMax = 0;
        for (int i = 0; i < iLIZIZ; i++) {
            InterfaceC1677930tlX interfaceC1677930tlX = this.LIZ;
            v.LIZ(i);
            jMax = Math.max(jMax, interfaceC1677930tlX.LJ(v2.LIZ(i)));
        }
        return jMax;
    }

    public final V LJ(V v, V v2) {
        if (this.LIZLLL == null) {
            this.LIZLLL = (V) v.LIZJ();
        }
        V v3 = this.LIZLLL;
        if (v3 == null) {
            v3 = null;
        }
        int iLIZIZ = v3.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v4 = this.LIZLLL;
            if (v4 == null) {
                v4 = null;
            }
            v4.LJ(this.LIZ.LIZIZ(v.LIZ(i), v2.LIZ(i)), i);
        }
        V v5 = this.LIZLLL;
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // X.InterfaceC1677890tlT
    public final V LIZIZ(long j, V v, V v2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = (V) v.LIZJ();
        }
        V v3 = this.LIZIZ;
        if (v3 == null) {
            v3 = null;
        }
        int iLIZIZ = v3.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v4 = this.LIZIZ;
            if (v4 == null) {
                v4 = null;
            }
            v4.LJ(this.LIZ.LIZLLL(v.LIZ(i), v2.LIZ(i), j), i);
        }
        V v5 = this.LIZIZ;
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // X.InterfaceC1677890tlT
    public final V LIZJ(long j, V v, V v2) {
        if (this.LIZJ == null) {
            this.LIZJ = (V) v.LIZJ();
        }
        V v3 = this.LIZJ;
        if (v3 == null) {
            v3 = null;
        }
        int iLIZIZ = v3.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            V v4 = this.LIZJ;
            if (v4 == null) {
                v4 = null;
            }
            InterfaceC1677930tlX interfaceC1677930tlX = this.LIZ;
            v.LIZ(i);
            v4.LJ(interfaceC1677930tlX.LIZJ(v2.LIZ(i), j), i);
        }
        V v5 = this.LIZJ;
        if (v5 == null) {
            return null;
        }
        return v5;
    }
}
