package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677040tk6<T> implements InterfaceC1677030tk5<T> {
    public final InterfaceC1677060tk8<T> LIZ;
    public final C0N66 LIZIZ;
    public final long LIZJ;

    public C1677040tk6() {
        throw null;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    @Override // X.InterfaceC1677030tk5
    public final <V extends AbstractC1677260tkS> InterfaceC1677220tkO<V> LIZ(InterfaceC1677290tkV<T, V> interfaceC1677290tkV) {
        final InterfaceC1677240tkQ<V> interfaceC1677240tkQLIZ = this.LIZ.LIZ((InterfaceC1677290tkV) interfaceC1677290tkV);
        final C0N66 c0n66 = this.LIZIZ;
        final long j = this.LIZJ;
        return (InterfaceC1677220tkO<V>) new InterfaceC1677220tkO<V>(interfaceC1677240tkQLIZ, c0n66, j) { // from class: X.0tkK
            public final InterfaceC1677240tkQ<V> LIZ;
            public final C0N66 LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            @Override // X.InterfaceC1677220tkO
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1677220tkO
            public final long LIZLLL(V v, V v2, V v3) {
                return Long.MAX_VALUE;
            }

            @Override // X.InterfaceC1677220tkO
            public final /* synthetic */ AbstractC1677260tkS LJ(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
                return C1677230tkP.LIZ(this, abstractC1677260tkS, abstractC1677260tkS2, abstractC1677260tkS3);
            }

            public final long LJII(long j2) {
                long j3 = this.LIZLLL;
                if (j2 + j3 <= 0) {
                    return 0L;
                }
                long j4 = j2 + j3;
                long j5 = this.LIZJ;
                long j6 = j4 / j5;
                if (this.LIZIZ != C0N66.Restart && j6 % ((long) 2) != 0) {
                    return ((j6 + 1) * j5) - j4;
                }
                Long.signum(j6);
                return j4 - (j6 * j5);
            }

            {
                this.LIZ = interfaceC1677240tkQLIZ;
                this.LIZIZ = c0n66;
                this.LIZJ = ((long) (interfaceC1677240tkQLIZ.LJFF() + interfaceC1677240tkQLIZ.LJI())) * 1000000;
                this.LIZLLL = j * 1000000;
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZIZ(long j2, V v, V v2, V v3) {
                return (V) this.LIZ.LIZIZ(LJII(j2), v, v2, LJIIIIZZ(j2, v, v3, v2));
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZJ(long j2, V v, V v2, V v3) {
                return (V) this.LIZ.LIZJ(LJII(j2), v, v2, LJIIIIZZ(j2, v, v3, v2));
            }

            public final V LJIIIIZZ(long j2, V v, V v2, V v3) {
                long j3 = this.LIZLLL;
                long j4 = j2 + j3;
                long j5 = this.LIZJ;
                if (j4 <= j5) {
                    return v2;
                }
                return (V) this.LIZ.LIZIZ(j5 - j3, v, v3, v2);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677040tk6)) {
            return false;
        }
        C1677040tk6 c1677040tk6 = (C1677040tk6) obj;
        if (!Intrinsics.LJFF(c1677040tk6.LIZ, this.LIZ) || c1677040tk6.LIZIZ != this.LIZIZ || c1677040tk6.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    public C1677040tk6(InterfaceC1677060tk8 interfaceC1677060tk8, C0N66 c0n66, long j) {
        this.LIZ = interfaceC1677060tk8;
        this.LIZIZ = c0n66;
        this.LIZJ = j;
    }
}
