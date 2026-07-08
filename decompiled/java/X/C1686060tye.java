package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686060tye<V extends AbstractC1677260tkS> implements InterfaceC1677240tkQ<V> {
    public final int LIZ;
    public final int LIZIZ;
    public final InterfaceC1686200tys LIZJ;
    public final C1686080tyg<V> LIZLLL;

    @Override // X.InterfaceC1677220tkO
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1677220tkO
    public final /* synthetic */ AbstractC1677260tkS LJ(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
        return C1677230tkP.LIZ(this, abstractC1677260tkS, abstractC1677260tkS2, abstractC1677260tkS3);
    }

    @Override // X.InterfaceC1677240tkQ
    public final int LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1677240tkQ
    public final int LJI() {
        return this.LIZ;
    }

    public C1686060tye(final int i, final int i2, final InterfaceC1686200tys interfaceC1686200tys) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC1686200tys;
        this.LIZLLL = new C1686080tyg<>(new InterfaceC1686130tyl(i, i2, interfaceC1686200tys) { // from class: X.0tyk
            public final int LIZ;
            public final InterfaceC1686200tys LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            @Override // X.InterfaceC1677030tk5
            public final InterfaceC1677220tkO LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
                return new C1686080tyg(this);
            }

            {
                this.LIZ = i;
                this.LIZIZ = interfaceC1686200tys;
                this.LIZJ = ((long) i) * 1000000;
                this.LIZLLL = ((long) i2) * 1000000;
            }

            @Override // X.InterfaceC1686130tyl
            public final float LIZIZ(float f, float f2, float f3) {
                return LIZLLL(f, f2, f3, this.LIZLLL + this.LIZJ);
            }

            @Override // X.InterfaceC1686130tyl
            public final long LIZJ(float f, float f2, float f3) {
                return this.LIZLLL + this.LIZJ;
            }

            @Override // X.InterfaceC1686130tyl
            public final float LIZLLL(float f, float f2, float f3, long j) {
                long j2 = j - this.LIZLLL;
                long j3 = this.LIZJ;
                if (j2 < 0) {
                    j2 = 0;
                }
                if (j2 <= j3) {
                    j3 = j2;
                }
                if (j3 == 0) {
                    return f3;
                }
                return (LJ(f, f2, f3, j3) - LJ(f, f2, f3, j3 - 1000000)) * 1000.0f;
            }

            @Override // X.InterfaceC1686130tyl
            public final float LJ(float f, float f2, float f3, long j) {
                float f4;
                long j2 = j - this.LIZLLL;
                long j3 = this.LIZJ;
                if (j2 < 0) {
                    j2 = 0;
                }
                if (j2 > j3) {
                    j2 = j3;
                }
                if (this.LIZ == 0) {
                    f4 = 1.0f;
                } else {
                    f4 = j2 / j3;
                }
                float fLIZ = this.LIZIZ.LIZ(f4);
                return (f * (1 - fLIZ)) + (f2 * fLIZ);
            }
        });
    }

    @Override // X.InterfaceC1677220tkO
    public final long LIZLLL(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
        return ((long) (LJFF() + LJI())) * 1000000;
    }

    @Override // X.InterfaceC1677220tkO
    public final V LIZIZ(long j, V v, V v2, V v3) {
        return (V) this.LIZLLL.LIZIZ(j, v, v2, v3);
    }

    @Override // X.InterfaceC1677220tkO
    public final V LIZJ(long j, V v, V v2, V v3) {
        return (V) this.LIZLLL.LIZJ(j, v, v2, v3);
    }
}
