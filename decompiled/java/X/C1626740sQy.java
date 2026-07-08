package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626740sQy extends AbstractC1626750sQz {
    public final int LIZJ;
    public final InterfaceC1626470sQX LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626740sQy)) {
            return false;
        }
        C1626740sQy c1626740sQy = (C1626740sQy) obj;
        return this.LIZJ == c1626740sQy.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1626740sQy.LIZLLL);
    }

    public final int hashCode() {
        return (this.LIZJ * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.LIZLLL);
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

    public C1626740sQy(InterfaceC1626470sQX interfaceC1626470sQX, int i) {
        super(i, interfaceC1626470sQX);
        this.LIZJ = i;
        this.LIZLLL = interfaceC1626470sQX;
    }
}
