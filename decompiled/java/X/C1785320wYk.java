package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785320wYk {
    public final C861890XrX LIZ;
    public final InterfaceC1785410wYt LIZIZ;
    public final InterfaceC1781190wS5 LIZJ;
    public final C1785300wYi LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785320wYk)) {
            return false;
        }
        C1785320wYk c1785320wYk = (C1785320wYk) obj;
        return Intrinsics.LJFF(this.LIZ, c1785320wYk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785320wYk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785320wYk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1785320wYk.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPageState(rankTypeKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomBar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", runtime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1785320wYk LIZ(C1785320wYk c1785320wYk, C1785300wYi c1785300wYi) {
        return new C1785320wYk(c1785320wYk.LIZ, c1785320wYk.LIZIZ, c1785320wYk.LIZJ, c1785300wYi);
    }

    public C1785320wYk(C861890XrX c861890XrX, InterfaceC1785410wYt interfaceC1785410wYt, InterfaceC1781190wS5 interfaceC1781190wS5, C1785300wYi c1785300wYi) {
        this.LIZ = c861890XrX;
        this.LIZIZ = interfaceC1785410wYt;
        this.LIZJ = interfaceC1781190wS5;
        this.LIZLLL = c1785300wYi;
    }
}
