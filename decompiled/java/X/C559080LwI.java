package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559080LwI {
    public final String LIZ;
    public final EnumC559100LwK LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C559080LwI)) {
            return false;
        }
        C559080LwI c559080LwI = (C559080LwI) obj;
        return Intrinsics.LJFF(this.LIZ, c559080LwI.LIZ) && this.LIZIZ == c559080LwI.LIZIZ && this.LIZJ == c559080LwI.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicStatusChangedEvent(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", runningDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C559080LwI(String str, EnumC559100LwK enumC559100LwK, long j) {
        this.LIZ = str;
        this.LIZIZ = enumC559100LwK;
        this.LIZJ = j;
    }
}
