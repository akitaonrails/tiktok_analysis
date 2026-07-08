package X;

/* JADX INFO: renamed from: X.0tk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677070tk9<T> implements InterfaceC1677060tk8<T> {
    public final int LIZ;

    public C1677070tk9() {
        this(0);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C1677070tk9(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1677030tk5
    public final <V extends AbstractC1677260tkS> InterfaceC1677240tkQ<V> LIZ(InterfaceC1677290tkV<T, V> interfaceC1677290tkV) {
        final int i = this.LIZ;
        return (InterfaceC1677240tkQ<V>) new InterfaceC1677240tkQ<V>(i) { // from class: X.0tkJ
            public final int LIZ;

            @Override // X.InterfaceC1677220tkO
            public final /* synthetic */ boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZIZ(long j, V v, V v2, V v3) {
                return v3;
            }

            @Override // X.InterfaceC1677220tkO
            public final /* synthetic */ AbstractC1677260tkS LJ(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
                return C1677230tkP.LIZ(this, abstractC1677260tkS, abstractC1677260tkS2, abstractC1677260tkS3);
            }

            @Override // X.InterfaceC1677240tkQ
            public final int LJI() {
                return 0;
            }

            @Override // X.InterfaceC1677240tkQ
            public final int LJFF() {
                return this.LIZ;
            }

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC1677220tkO
            public final long LIZLLL(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
                return ((long) LJFF()) * 1000000;
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZJ(long j, V v, V v2, V v3) {
                if (j >= ((long) this.LIZ) * 1000000) {
                    return v2;
                }
                return v;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677070tk9) || ((C1677070tk9) obj).LIZ != this.LIZ) {
            return false;
        }
        return true;
    }
}
