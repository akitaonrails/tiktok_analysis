package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19797212d0 implements InterfaceC19797112cz {
    public final InterfaceC19797112cz LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return null;
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return new C19797212d0(this.LLILLJJLI, this.LL.LIZIZ());
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.LLILLJJLI.hashCode() * 31) + this.LL.hashCode();
    }

    public C19797212d0() {
        this.LL = InterfaceC19797112cz.LJIILIIL;
        this.LLILLJJLI = "return";
    }

    public C19797212d0(String str) {
        this.LL = InterfaceC19797112cz.LJIILIIL;
        this.LLILLJJLI = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19797212d0)) {
            return false;
        }
        C19797212d0 c19797212d0 = (C19797212d0) obj;
        if (this.LLILLJJLI.equals(c19797212d0.LLILLJJLI) && this.LL.equals(c19797212d0.LL)) {
            return true;
        }
        return false;
    }

    public C19797212d0(String str, InterfaceC19797112cz interfaceC19797112cz) {
        this.LL = interfaceC19797112cz;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
