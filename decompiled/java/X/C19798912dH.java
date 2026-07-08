package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19798912dH implements InterfaceC19797112cz {
    public final boolean LL;

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return null;
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return new C19798912dH(Boolean.valueOf(this.LL));
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.valueOf(this.LL);
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        return Double.valueOf(this.LL ? 1.0d : 0.0d);
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        return Boolean.toString(this.LL);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.LL).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.LL);
    }

    public C19798912dH(Boolean bool) {
        if (bool == null) {
            this.LL = false;
        } else {
            this.LL = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19798912dH) && this.LL == ((C19798912dH) obj).LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        if ("toString".equals(str)) {
            return new C19797512d3(Boolean.toString(this.LL));
        }
        throw new IllegalArgumentException(C786410Ut5.j4("%s.%s is not a function.", new Object[]{Boolean.toString(this.LL), str}));
    }
}
