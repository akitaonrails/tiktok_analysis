package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868660yjA extends AbstractC1868670yjB {
    public final InterfaceC1868700yjE LIZIZ;
    public final InterfaceC1868700yjE LIZJ;
    public final InterfaceC1868700yjE LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868660yjA)) {
            return false;
        }
        C1868660yjA c1868660yjA = (C1868660yjA) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1868660yjA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868660yjA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1868660yjA.LIZLLL) && Intrinsics.LJFF(this.LJ, c1868660yjA.LJ);
    }

    public final int hashCode() {
        return (((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiType1(title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", eventPopUpType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1868670yjB
    public final String LIZ() {
        return this.LJ;
    }

    public C1868660yjA(C1868640yj8 c1868640yj8, C1868640yj8 c1868640yj82, InterfaceC1868700yjE interfaceC1868700yjE, String str) {
        super(str);
        this.LIZIZ = c1868640yj8;
        this.LIZJ = c1868640yj82;
        this.LIZLLL = interfaceC1868700yjE;
        this.LJ = str;
    }
}
