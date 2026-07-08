package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579300Mno extends AbstractC579280Mnm {
    public final AbstractC577050MkB LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C579300Mno)) {
            return false;
        }
        C579300Mno c579300Mno = (C579300Mno) obj;
        return Intrinsics.LJFF(this.LIZJ, c579300Mno.LIZJ) && this.LIZLLL == c579300Mno.LIZLLL;
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Updating(layoutType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentItemCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC579280Mnm
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC579280Mnm
    public final AbstractC577050MkB LIZIZ() {
        return this.LIZJ;
    }

    public C579300Mno(AbstractC577050MkB abstractC577050MkB, int i) {
        super(abstractC577050MkB, i);
        this.LIZJ = abstractC577050MkB;
        this.LIZLLL = i;
    }
}
