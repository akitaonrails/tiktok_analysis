package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243600iT0 extends AbstractC1243540iSu {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1243600iT0)) {
            return false;
        }
        C1243600iT0 c1243600iT0 = (C1243600iT0) obj;
        return Intrinsics.LJFF(this.LIZ, c1243600iT0.LIZ) && this.LIZIZ == c1243600iT0.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1243600iT0.LIZJ) && this.LIZLLL == c1243600iT0.LIZLLL && this.LJ == c1243600iT0.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvitePermissionItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTextPhone=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isExpired=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1243540iSu
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1243540iSu
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC1243540iSu
    public final int LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1243540iSu
    public final boolean LIZLLL() {
        return this.LIZIZ;
    }

    public C1243600iT0(String str, int i, String str2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = z2;
    }
}
