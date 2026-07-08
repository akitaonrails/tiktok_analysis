package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677080tkA<T> implements InterfaceC1675680thu<T> {
    public final int LIZ;
    public final InterfaceC1677060tk8<T> LIZIZ;
    public final C0N66 LIZJ;
    public final long LIZLLL;

    public C1677080tkA() {
        throw null;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    @Override // X.InterfaceC1677030tk5
    public final InterfaceC1677220tkO LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
        final int i = this.LIZ;
        final InterfaceC1677240tkQ<V> interfaceC1677240tkQLIZ = this.LIZIZ.LIZ(interfaceC1677290tkV);
        final C0N66 c0n66 = this.LIZJ;
        final long j = this.LIZLLL;
        return new InterfaceC1677220tkO(i, interfaceC1677240tkQLIZ, c0n66, j) { // from class: X.0tkL
            public final int LIZ;
            public final InterfaceC1677240tkQ<V> LIZIZ;
            public final C0N66 LIZJ;
            public final long LIZLLL;
            public final long LJ;

            @Override // X.InterfaceC1677220tkO
            public final /* synthetic */ boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1677220tkO
            public final /* synthetic */ AbstractC1677260tkS LJ(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
                return C1677230tkP.LIZ(this, abstractC1677260tkS, abstractC1677260tkS2, abstractC1677260tkS3);
            }

            public final long LJII(long j2) {
                long j3 = this.LJ;
                if (j2 + j3 <= 0) {
                    return 0L;
                }
                long j4 = j2 + j3;
                long jMin = Math.min(j4 / this.LIZLLL, ((long) this.LIZ) - 1);
                if (this.LIZJ != C0N66.Restart && jMin % ((long) 2) != 0) {
                    return ((jMin + 1) * this.LIZLLL) - j4;
                }
                return j4 - (jMin * this.LIZLLL);
            }

            @Override // X.InterfaceC1677220tkO
            public final long LIZLLL(V v, V v2, V v3) {
                return (((long) this.LIZ) * this.LIZLLL) - this.LJ;
            }

            {
                this.LIZ = i;
                this.LIZIZ = interfaceC1677240tkQLIZ;
                this.LIZJ = c0n66;
                if (i >= 1) {
                    this.LIZLLL = ((long) (interfaceC1677240tkQLIZ.LJFF() + interfaceC1677240tkQLIZ.LJI())) * 1000000;
                    this.LJ = j * 1000000;
                    return;
                }
                throw new IllegalArgumentException("Iterations count can't be less than 1");
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZIZ(long j2, V v, V v2, V v3) {
                return (V) this.LIZIZ.LIZIZ(LJII(j2), v, v2, LJIIIIZZ(j2, v, v3, v2));
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZJ(long j2, V v, V v2, V v3) {
                return (V) this.LIZIZ.LIZJ(LJII(j2), v, v2, LJIIIIZZ(j2, v, v3, v2));
            }

            public final V LJIIIIZZ(long j2, V v, V v2, V v3) {
                long j3 = this.LJ;
                long j4 = j2 + j3;
                long j5 = this.LIZLLL;
                if (j4 <= j5) {
                    return v2;
                }
                return (V) LIZIZ(j5 - j3, v, v2, v3);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677080tkA)) {
            return false;
        }
        C1677080tkA c1677080tkA = (C1677080tkA) obj;
        if (c1677080tkA.LIZ != this.LIZ || !Intrinsics.LJFF(c1677080tkA.LIZIZ, this.LIZIZ) || c1677080tkA.LIZJ != this.LIZJ || c1677080tkA.LIZLLL != this.LIZLLL) {
            return false;
        }
        return true;
    }

    public C1677080tkA(int i, C1677050tk7 c1677050tk7, C0N66 c0n66, long j) {
        this.LIZ = i;
        this.LIZIZ = c1677050tk7;
        this.LIZJ = c0n66;
        this.LIZLLL = j;
    }
}
