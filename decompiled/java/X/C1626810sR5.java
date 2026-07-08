package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626810sR5 extends AbstractC1626750sQz {
    public final int LIZJ;
    public final InterfaceC1626470sQX LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626810sR5)) {
            return false;
        }
        C1626810sR5 c1626810sR5 = (C1626810sR5) obj;
        return this.LIZJ == c1626810sR5.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1626810sR5.LIZLLL) && this.LJ == c1626810sR5.LJ;
    }

    public final int hashCode() {
        return (((this.LIZJ * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1626750sQz
    public final InterfaceC1626470sQX LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1626750sQz
    public final int LIZIZ() {
        return this.LIZJ;
    }

    public C1626810sR5(int i, InterfaceC1626470sQX interfaceC1626470sQX, int i2) {
        super(i, interfaceC1626470sQX);
        this.LIZJ = i;
        this.LIZLLL = interfaceC1626470sQX;
        this.LJ = i2;
    }
}
