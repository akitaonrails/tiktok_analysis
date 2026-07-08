package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579320Mnq extends AbstractC579280Mnm {
    public final AbstractC577050MkB LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C579320Mnq) && Intrinsics.LJFF(this.LIZJ, ((C579320Mnq) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnteredEdit(layoutType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC579280Mnm
    public final AbstractC577050MkB LIZIZ() {
        return this.LIZJ;
    }

    public C579320Mnq(AbstractC577050MkB abstractC577050MkB) {
        super(abstractC577050MkB, abstractC577050MkB.LIZJ);
        this.LIZJ = abstractC577050MkB;
    }
}
