package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676890tjr<T> implements InterfaceC1675680thu<T> {
    public final float LIZ;
    public final float LIZIZ;
    public final T LIZJ;

    public C1676890tjr() {
        this(null, 7);
    }

    public final int hashCode() {
        T t = this.LIZJ;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.floatToIntBits(this.LIZ)) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    @Override // X.InterfaceC1677030tk5
    public final InterfaceC1677220tkO LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
        final AbstractC1677260tkS abstractC1677260tkS;
        final float f = this.LIZ;
        final float f2 = this.LIZIZ;
        T t = this.LIZJ;
        if (t == null) {
            abstractC1677260tkS = null;
        } else {
            abstractC1677260tkS = (AbstractC1677260tkS) interfaceC1677290tkV.LIZ().invoke(t);
        }
        return new InterfaceC1677220tkO(f, f2, abstractC1677260tkS) { // from class: X.0tyf
            public final /* synthetic */ C1686080tyg<V> LIZ;

            @Override // X.InterfaceC1677220tkO
            public final boolean LIZ() {
                this.LIZ.getClass();
                return false;
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZIZ(long j, V v, V v2, V v3) {
                return (V) this.LIZ.LIZIZ(j, v, v2, v3);
            }

            @Override // X.InterfaceC1677220tkO
            public final V LIZJ(long j, V v, V v2, V v3) {
                return (V) this.LIZ.LIZJ(j, v, v2, v3);
            }

            @Override // X.InterfaceC1677220tkO
            public final long LIZLLL(V v, V v2, V v3) {
                return this.LIZ.LIZLLL(v, v2, v3);
            }

            @Override // X.InterfaceC1677220tkO
            public final V LJ(V v, V v2, V v3) {
                return (V) this.LIZ.LJ(v, v2, v3);
            }

            {
                InterfaceC1686210tyt interfaceC1686210tyt;
                int[] iArr = C1686140tym.LIZ;
                if (abstractC1677260tkS != null) {
                    interfaceC1686210tyt = new InterfaceC1686210tyt(f, f2, abstractC1677260tkS) { // from class: X.0tyn
                        public final C1686160tyo[] LIZ;

                        @Override // X.InterfaceC1686210tyt
                        public final InterfaceC1686130tyl get(int i) {
                            return this.LIZ[i];
                        }

                        {
                            int iLIZIZ = abstractC1677260tkS.LIZIZ();
                            C1686160tyo[] c1686160tyoArr = new C1686160tyo[iLIZIZ];
                            for (int i = 0; i < iLIZIZ; i++) {
                                c1686160tyoArr[i] = new C1686160tyo(f, f2, abstractC1677260tkS.LIZ(i));
                            }
                            this.LIZ = c1686160tyoArr;
                        }
                    };
                } else {
                    interfaceC1686210tyt = new InterfaceC1686210tyt(f, f2) { // from class: X.0tyq
                        public final C1686160tyo LIZ;

                        @Override // X.InterfaceC1686210tyt
                        public final InterfaceC1686130tyl get(int i) {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = new C1686160tyo(f, f2, 0.01f);
                        }
                    };
                }
                this.LIZ = new C1686080tyg<>(interfaceC1686210tyt);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1676890tjr)) {
            return false;
        }
        C1676890tjr c1676890tjr = (C1676890tjr) obj;
        if (c1676890tjr.LIZ != this.LIZ || c1676890tjr.LIZIZ != this.LIZIZ || !Intrinsics.LJFF(c1676890tjr.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1676890tjr(Object obj, int i) {
        float f;
        if ((i & 1) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this(f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }

    public C1676890tjr(float f, float f2, T t) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = t;
    }
}
