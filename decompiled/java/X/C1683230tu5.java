package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683230tu5 {
    public final C1692220u8a LIZ;
    public final C1693430uAX LIZIZ;
    public final List<C1692270u8f<C1680210tpD>> LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final InterfaceC1690500u5o LJI;
    public final EnumC1671200tag LJII;
    public final InterfaceC594710NUf LJIIIIZZ;
    public final long LJIIIZ;

    public C1683230tu5() {
        throw null;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextLayoutInput(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", placeholders=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", softWrap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", overflow=");
        sbLIZ.append((Object) C1678110tlp.LIZ(this.LJFF));
        sbLIZ.append(", density=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", layoutDirection=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", fontFamilyResolver=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", constraints=");
        sbLIZ.append((Object) C1682380tsi.LJIIJJI(this.LJIIIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683230tu5)) {
            return false;
        }
        C1683230tu5 c1683230tu5 = (C1683230tu5) obj;
        if (Intrinsics.LJFF(this.LIZ, c1683230tu5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1683230tu5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1683230tu5.LIZJ) && this.LIZLLL == c1683230tu5.LIZLLL && this.LJ == c1683230tu5.LJ && this.LJFF == c1683230tu5.LJFF && Intrinsics.LJFF(this.LJI, c1683230tu5.LJI) && this.LJII == c1683230tu5.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1683230tu5.LJIIIIZZ) && C1682380tsi.LIZJ(this.LJIIIZ, c1683230tu5.LJIIIZ)) {
            return true;
        }
        return false;
    }

    public C1683230tu5(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, List list, int i, boolean z, int i2, InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag, InterfaceC594710NUf interfaceC594710NUf, long j) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = c1693430uAX;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = i2;
        this.LJI = interfaceC1690500u5o;
        this.LJII = enumC1671200tag;
        this.LJIIIIZZ = interfaceC594710NUf;
        this.LJIIIZ = j;
    }
}
