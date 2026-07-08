package X;

import kotlin.jvm.internal.Intrinsics;
import o5b.a;
import r4b.g;

/* JADX INFO: renamed from: X.1A0W, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A0W implements InterfaceC1065804Eu {
    public final String LIZ;
    public final C042W LIZIZ;
    public final EnumC21715119yf LIZJ;
    public final Float LIZLLL;
    public final boolean LJ;
    public g LJFF = new a();

    @Override // X.InterfaceC1065804Eu
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A0W)) {
            return false;
        }
        C1A0W c1a0w = (C1A0W) obj;
        return Intrinsics.LJFF(this.LIZ, c1a0w.LIZ) && this.LIZIZ == c1a0w.LIZIZ && this.LIZJ == c1a0w.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1a0w.LIZLLL) && this.LJ == c1a0w.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Float f = this.LIZLLL;
        return ((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExpandableSpecVO(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", radioSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasDisplayPrice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1065804Eu
    public final void LIZIZ(g gVar) {
        this.LJFF = gVar;
    }

    public C1A0W(String str, C042W c042w, EnumC21715119yf enumC21715119yf, Float f, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c042w;
        this.LIZJ = enumC21715119yf;
        this.LIZLLL = f;
        this.LJ = z;
    }
}
