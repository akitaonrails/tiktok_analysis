package X;

import Y.AfS132S0000000_7;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J1R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1R {
    public static final AfS132S0000000_7 LIZ = new AfS132S0000000_7(44);
    public static final AfS132S0000000_7 LIZIZ = new AfS132S0000000_7(45);
    public static final Object LIZJ = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0xx0] */
    public static C1838800xx0 LIZIZ(Fragment fragment) {
        final C0J1T c0j1t = C0J1T.DESTROY;
        C0J1S<C0J1T> c0j1sLIZ = C0J1S.LIZ(fragment.getChildFragmentManager());
        if (c0j1t != null) {
            final C11NZ<C0J1T> c11nz = c0j1sLIZ.LIZ;
            return new InterfaceC742320T9y<T, T>(c11nz, c0j1t) { // from class: X.0xx0
                public final C11NZ<R> LIZ;
                public final R LIZIZ;

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UntilEventObservableTransformer{lifecycle=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", event=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append('}');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC742320T9y
                public final C098D<T> LIZIZ(C11NZ<T> c11nz2) {
                    C19476411Hu c19476411HuLJLIIL = this.LIZ.LJJIL(new C1838810xx1(this.LIZIZ)).LJLIIL(1L);
                    c11nz2.getClass();
                    C1701890uOB.LIZ(c19476411HuLJLIIL, "other is null");
                    return new C11QX(c11nz2, c19476411HuLJLIIL);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || C1838800xx0.class != obj.getClass()) {
                        return false;
                    }
                    C1838800xx0 c1838800xx0 = (C1838800xx0) obj;
                    if (!this.LIZ.equals(c1838800xx0.LIZ)) {
                        return false;
                    }
                    return this.LIZIZ.equals(c1838800xx0.LIZIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = c11nz;
                    this.LIZIZ = c0j1t;
                }
            };
        }
        throw new NullPointerException("event == null");
    }

    public static <T> C753550ThB<T> LIZJ(Class cls) {
        final String simpleName = cls.getSimpleName();
        return new C0UJ3<T>(simpleName) { // from class: X.0ThB
            @Override // X.InterfaceC751480Tdq
            public final InterfaceC19473011Gm<T> LIZ(AbstractC19484711Kz<T> abstractC19484711Kz) {
                return abstractC19484711Kz;
            }

            @Override // X.InterfaceC742320T9y
            public final C098D<T> LIZIZ(C11NZ<T> c11nz) {
                return c11nz;
            }

            @Override // X.InterfaceC751490Tdr
            public final C11LE<T> LIZJ(C11NN<T> c11nn) {
                return c11nn;
            }
        };
    }

    public static <T, R> R LIZ(InterfaceC1487280oo2<T, R> interfaceC1487280oo2, T t) {
        try {
            return interfaceC1487280oo2.apply(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw C11QG.LIZIZ(th);
        }
    }
}
