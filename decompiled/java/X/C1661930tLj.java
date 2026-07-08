package X;

import X.InterfaceC1461640o8g;
import X.InterfaceC1660190tIv;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661930tLj<T extends InterfaceC1660190tIv, U extends InterfaceC1461640o8g<? extends T>> {
    public final T LIZ;
    public final U LIZIZ;
    public final InterfaceC1664980tQe<T, U> LIZJ;
    public final C1661900tLg LIZLLL;

    public final String LIZIZ() {
        AbstractC1678220tm0 abstractC1678220tm0;
        String str;
        T t = this.LIZ;
        return (!(t instanceof AbstractC1678220tm0) || (abstractC1678220tm0 = (AbstractC1678220tm0) t) == null || (str = abstractC1678220tm0.LIZIZ) == null) ? "" : str;
    }

    public final boolean equals(Object obj) {
        C1661930tLj c1661930tLj;
        if (obj instanceof C1661930tLj) {
            c1661930tLj = (C1661930tLj) obj;
        } else {
            c1661930tLj = null;
        }
        if (c1661930tLj == null || !Intrinsics.LJFF(this.LIZ, c1661930tLj.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c1661930tLj.LIZIZ) || !Intrinsics.LJFF(this.LIZLLL, c1661930tLj.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C1661930tLj(T t, U u, InterfaceC1664980tQe<T, U> interfaceC1664980tQe, C1661900tLg c1661900tLg) {
        this.LIZ = t;
        this.LIZIZ = u;
        this.LIZJ = interfaceC1664980tQe;
        this.LIZLLL = c1661900tLg;
    }

    public static C1661930tLj LIZ(C1661930tLj c1661930tLj, InterfaceC1461640o8g interfaceC1461640o8g, C1661900tLg c1661900tLg, int i) {
        T t;
        InterfaceC1664980tQe<T, U> interfaceC1664980tQe = null;
        if ((i & 1) != 0) {
            t = c1661930tLj.LIZ;
        } else {
            t = null;
        }
        if ((i & 2) != 0) {
            interfaceC1461640o8g = c1661930tLj.LIZIZ;
        }
        if ((i & 4) != 0) {
            interfaceC1664980tQe = c1661930tLj.LIZJ;
        }
        if ((i & 8) != 0) {
            c1661900tLg = c1661930tLj.LIZLLL;
        }
        c1661930tLj.getClass();
        return new C1661930tLj(t, interfaceC1461640o8g, interfaceC1664980tQe, c1661900tLg);
    }
}
