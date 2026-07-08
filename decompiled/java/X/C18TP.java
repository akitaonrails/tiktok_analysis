package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18TP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TP implements C18TR {
    public final Throwable LIZ = null;
    public final EnumC1778730wO7 LIZIZ;
    public final EnumC1778740wO8 LIZJ;
    public final C909930Zmp LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18TP)) {
            return false;
        }
        C18TP c18tp = (C18TP) obj;
        return Intrinsics.LJFF(this.LIZ, c18tp.LIZ) && this.LIZIZ == c18tp.LIZIZ && this.LIZJ == c18tp.LIZJ && Intrinsics.LJFF(this.LIZLLL, c18tp.LIZLLL);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        return ((((((th == null ? 0 : th.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failedReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", generateInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18TR
    public final C909930Zmp LIZ() {
        return C18TI.LIZ(this);
    }

    public C18TP(EnumC1778730wO7 enumC1778730wO7, EnumC1778740wO8 enumC1778740wO8, C909930Zmp c909930Zmp) {
        this.LIZIZ = enumC1778730wO7;
        this.LIZJ = enumC1778740wO8;
        this.LIZLLL = c909930Zmp;
    }
}
